package com.volcengine.speech.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.speech.SpeechApi;
import com.volcengine.speech.exception.SpeechAPIError;
import com.volcengine.speech.exception.SpeechHttpException;
import com.volcengine.speech.interceptor.AuthenticationInterceptor;
import io.reactivex.Single;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class SpeechBaseService {

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

}