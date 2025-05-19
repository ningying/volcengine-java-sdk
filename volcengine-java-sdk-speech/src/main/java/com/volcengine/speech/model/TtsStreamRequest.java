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

    private Integer sampleRate;

    private Integer bitRate;

    private Integer speechRate;

    private Integer loudnessRate;

    private String format;

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

    public Integer getSpeechRate() {
        return speechRate;
    }

    public void setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
    }

    public Integer getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Integer getLoudnessRate() {
        return loudnessRate;
    }

    public void setLoudnessRate(Integer loudnessRate) {
        this.loudnessRate = loudnessRate;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
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

        private Integer sampleRate;

        private Integer bitRate;

        private Integer speechRate;

        private Integer loudnessRate;

        private String format;

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

        public Builder setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public Builder setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        public Builder setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }

        public Builder setLoudnessRate(Integer loudnessRate) {
            this.loudnessRate = loudnessRate;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
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
            request.setSampleRate(sampleRate);
            request.setBitRate(bitRate);
            request.setSpeechRate(speechRate);
            request.setLoudnessRate(loudnessRate);
            request.setInputStream(inputStream);
            request.setFormat(format);
            request.setEmitter(emitter);
            return request;
        }
    }
}
