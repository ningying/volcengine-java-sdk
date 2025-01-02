package com.volcengine.speech.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class AuthenticationInterceptor implements Interceptor {

    private final String apiKey;

    public AuthenticationInterceptor(String apiKey) {
        Objects.requireNonNull(apiKey, "Api key required");
        this.apiKey = apiKey;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .header("Authorization", "Bearer;" + apiKey)
                .header("Content-Type", "application/json")
                .build();
        return chain.proceed(request);
    }
}