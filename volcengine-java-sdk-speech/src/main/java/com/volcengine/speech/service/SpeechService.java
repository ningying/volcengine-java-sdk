package com.volcengine.speech.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.speech.SpeechApi;
import com.volcengine.speech.exception.SpeechException;
import com.volcengine.speech.interceptor.AuthenticationInterceptor;
import com.volcengine.speech.model.*;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import java.net.Proxy;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * 语音服务类
 *
 * @author ningy
 */
public class SpeechService extends SpeechBaseService {

    private final Logger logger = Logger.getLogger(SpeechService.class.getName());


    public SpeechService(String apiKey) {
        super(apiKey);
    }

    public SpeechService(String apiKey, Duration timeout) {
        super(apiKey, timeout);
    }

    public SpeechService(final SpeechApi api) {
        super(api);
    }

    public SpeechService(final SpeechApi api, final ExecutorService executorService) {
        super(api, executorService);
    }

    /**
     * 创建音色
     */
    public CreateToneResponse createTone(CreateToneRequest request) {
        return execute(api.createTone(request, "volc.megatts.voiceclone"));
    }

    /**
     * 状态查询
     */
    public QueryStatusResponse queryStatus(QueryStatusRequest request) {
        logger.info("queryStatus request: " + request.toString());
        return execute(api.queryStatus(request, "volc.megatts.voiceclone"));
    }

    /**
     * 语音合成
     */
    public TtsResponse synthesis(TtsRequest request) {
        logger.info("synthesis request: " + request.toString());
        return execute(api.synthesis(request));
    }



    public void shutdownExecutor() {
        Objects.requireNonNull(this.executorService, "executorService must be set in order to shut down");
        this.executorService.shutdown();
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String apiKey;
        private String region = BASE_REGION;
        private String baseUrl = BASE_URL;
        private Duration timeout = DEFAULT_TIMEOUT;
        private Duration connectTimeout = DEFAULT_CONNECT_TIMEOUT;
        private int retryTimes = DEFAULT_RETRY_TIMES;
        private Proxy proxy;
        private ConnectionPool connectionPool;
        private Dispatcher dispatcher;

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            if (!baseUrl.endsWith("/")) {
                this.baseUrl = baseUrl + "/";
            }
            return this;
        }

        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder connectTimeout(Duration connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder retryTimes(int retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        public Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder connectionPool(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
            return this;
        }

        public SpeechService build() {
            ObjectMapper mapper = defaultObjectMapper();
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
            if (apiKey != null && !apiKey.isEmpty()) {
                clientBuilder.addInterceptor(new AuthenticationInterceptor(apiKey));
            } else {
                throw new SpeechException("missing api_key.");
            }

            if (proxy != null) {
                clientBuilder.proxy(proxy);
            }

            if (connectionPool != null) {
                clientBuilder.connectionPool(connectionPool);
            } else {
                clientBuilder.connectionPool(new ConnectionPool(5, 1, TimeUnit.SECONDS));
            }

            if (dispatcher != null) {
                clientBuilder.dispatcher(dispatcher);
            }

            OkHttpClient client = clientBuilder
                    .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
                    .connectTimeout(connectTimeout)
                    .build();
            Retrofit retrofit = defaultRetrofit(client, mapper, baseUrl);

            return new SpeechService(
                    retrofit.create(SpeechApi.class),
                    client.dispatcher().executorService()
            );
        }
    }

}
