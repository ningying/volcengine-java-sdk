package com.volcengine.speech.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.speech.SpeechApi;
import com.volcengine.speech.exception.SpeechAPIError;
import com.volcengine.speech.exception.SpeechHttpException;
import com.volcengine.speech.interceptor.AuthenticationInterceptor;
import com.volcengine.speech.listener.SpeechWebSocketListener;
import com.volcengine.speech.model.TtsStreamRequest;
import com.volcengine.speech.model.TtsStreamResponse;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Single;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class SpeechBaseService {

    private static final Logger logger = Logger.getLogger(SpeechBaseService.class.getName());

    public static final String BASE_URL = "https://openspeech.bytedance.com";
    public static final String BASE_REGION = "cn-beijing";
    public static final Duration DEFAULT_TIMEOUT = Duration.ofMinutes(10);
    public static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofMinutes(1);
    public static final int DEFAULT_RETRY_TIMES = 2;
    public static final String CLIENT_REQUEST_HEADER = "X-Client-Request-Id";

    private static final ObjectMapper mapper = defaultObjectMapper();
    protected final SpeechApi api;
    protected final ExecutorService executorService;

    public SpeechBaseService(final String apiKey) {
        this(apiKey, DEFAULT_TIMEOUT);
    }

    public SpeechBaseService(final String apiKey, final Duration timeout) {
        ObjectMapper mapper = defaultObjectMapper();
        OkHttpClient client = defaultApiKeyClient(apiKey, timeout);
        Retrofit retrofit = defaultRetrofit(client, mapper, BASE_URL);

        this.api = retrofit.create(SpeechApi.class);
        this.executorService = client.dispatcher().executorService();
    }

    public SpeechBaseService(final SpeechApi api) {
        this.api = api;
        this.executorService = null;
    }

    public SpeechBaseService(final SpeechApi api, final ExecutorService executorService) {
        this.api = api;
        this.executorService = executorService;
    }

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    public static OkHttpClient defaultApiKeyClient(String apiKey, Duration timeout) {
        return new OkHttpClient.Builder()
                .addInterceptor(new AuthenticationInterceptor(apiKey))
                .connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS))
                .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                .build();
    }

    public static Retrofit defaultRetrofit(OkHttpClient client, ObjectMapper mapper, String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static <T> T execute(Single<T> apiCall) {
        try {
            T resp = apiCall.blockingGet();
            return resp;
        } catch (HttpException e) {
            String requestId = "";
            try {
                Headers headers = e.response().raw().request().headers();
                requestId = headers.get(CLIENT_REQUEST_HEADER);
            } catch (Exception ignored) {}

            try {
                if (e.response() == null || e.response().errorBody() == null) {
                    throw e;
                }
                String errorBody = e.response().errorBody().string();

                SpeechAPIError error = mapper.readValue(errorBody, SpeechAPIError.class);
                throw new SpeechHttpException(error, e, e.code(), requestId);
            } catch (IOException ex) {
                throw e;
            }
        }
    }

    public static TtsStreamResponse execute(TtsStreamRequest request) {
        return invokeWebSocket(request);
    }

    private static TtsStreamResponse invokeWebSocket(TtsStreamRequest request) {
        TtsStreamResponse ttsStreamResponse = new TtsStreamResponse();
        try {
            Flowable<byte[]> stream = stream(request);
            ttsStreamResponse.setStream(stream);
            ttsStreamResponse.setCode(200);
            ttsStreamResponse.setMessage("success");
            ttsStreamResponse.setSuccess(true);
        } catch (Exception e){
            logger.severe("invokeWebSocket error: " + e.getMessage());
            ttsStreamResponse.setCode(500);
            ttsStreamResponse.setMessage(e.getMessage());
            ttsStreamResponse.setSuccess(false);
        }
        return ttsStreamResponse;
    }

    private static Flowable<byte[]> stream(TtsStreamRequest request) {
        OkHttpClient client = new OkHttpClient.Builder()
                .pingInterval(50, TimeUnit.SECONDS)
                .connectTimeout(2000, TimeUnit.MILLISECONDS)
                .build();
        Request httpRequest = new Request.Builder()
                .url("wss://openspeech.bytedance.com/api/v3/tts/bidirection")
                .header("X-Api-App-Key", request.getAppId())
                .header("X-Api-Access-Key", request.getToken())
                .header("X-Api-Resource-Id", "volc.megatts.default")
                .header("X-Api-Connect-Id", UUID.randomUUID().toString())
                .build();
        return Flowable.create(emitter -> client.newWebSocket(httpRequest, new SpeechWebSocketListener(request.getSpeaker(), request.getInputStream(), emitter)), BackpressureStrategy.BUFFER);
    }

}