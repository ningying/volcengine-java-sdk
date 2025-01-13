package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;

/**
 * tts请求参数
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TtsStreamRequest {

    private String appId;

    private String token;

    private String speaker;

    private Flowable<String> inputStream;

    private FlowableEmitter<byte[]> emitter;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Flowable<String> getInputStream() {
        return inputStream;
    }

    public void setInputStream(Flowable<String> inputStream) {
        this.inputStream = inputStream;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public FlowableEmitter<byte[]> getEmitter() {
        return emitter;
    }

    public void setEmitter(FlowableEmitter<byte[]> emitter) {
        this.emitter = emitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String appId;
        private String token;
        private String speaker;
        private Flowable<String> inputStream;

        private FlowableEmitter<byte[]>  emitter;

        public Builder setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Builder setInputStream(Flowable<String> inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        public Builder setEmitter(FlowableEmitter<byte[]> emitter) {
            this.emitter = emitter;
            return this;
        }

        public TtsStreamRequest build() {
            TtsStreamRequest request = new TtsStreamRequest();
            request.setAppId(appId);
            request.setToken(token);
            request.setSpeaker(speaker);
            request.setInputStream(inputStream);
            request.setEmitter(emitter);
            return request;
        }
    }
}
