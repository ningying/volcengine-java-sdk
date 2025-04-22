package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;

/**
 * asr请求参数
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsrStreamRequest {

    private String appId;

    private String token;

    private String format = "pcm";

    private String codec = "raw";

    private Integer rate = 16000;

    private Integer bits = 16;

    private Integer channel = 1;

    private Integer endWindowSize = 800;

    private Integer forceToSpeechTime = 10000;

    private Flowable<byte[]> inputStream;

    private FlowableEmitter<String> emitter;

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

    public Flowable<byte[]> getInputStream() {
        return inputStream;
    }

    public void setInputStream(Flowable<byte[]> inputStream) {
        this.inputStream = inputStream;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getBits() {
        return bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getEndWindowSize() {
        return endWindowSize;
    }

    public void setEndWindowSize(Integer endWindowSize) {
        this.endWindowSize = endWindowSize;
    }

    public Integer getForceToSpeechTime() {
        return forceToSpeechTime;
    }

    public void setForceToSpeechTime(Integer forceToSpeechTime) {
        this.forceToSpeechTime = forceToSpeechTime;
    }

    public FlowableEmitter<String> getEmitter() {
        return emitter;
    }

    public void setEmitter(FlowableEmitter<String> emitter) {
        this.emitter = emitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String appId;
        private String token;

        private String format = "pcm";

        private String codec = "raw";

        private Integer rate = 16000;

        private Integer bits = 16;

        private Integer channel = 1;

        private Integer endWindowSize = 800;

        private Integer forceToSpeechTime = 10000;

        private Flowable<byte[]> inputStream;

        private FlowableEmitter<String>  emitter;

        public Builder setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        public Builder setCodec(String codec) {
            this.codec = codec;
            return this;
        }

        public Builder setRate(Integer rate) {
            this.rate = rate;
            return this;
        }

        public Builder setBits(Integer bits) {
            this.bits = bits;
            return this;
        }

        public Builder setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }

        public Builder setEndWindowSize(Integer endWindowSize) {
            this.endWindowSize = endWindowSize;
            return this;
        }

        public Builder setForceToSpeechTime(Integer forceToSpeechTime) {
            this.forceToSpeechTime = forceToSpeechTime;
            return this;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Builder setInputStream(Flowable<byte[]> inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        public Builder setEmitter(FlowableEmitter<String> emitter) {
            this.emitter = emitter;
            return this;
        }

        public AsrStreamRequest build() {
            AsrStreamRequest request = new AsrStreamRequest();
            request.setAppId(appId);
            request.setToken(token);
            request.setFormat(format);
            request.setCodec(codec);
            request.setBits(bits);
            request.setRate(rate);
            request.setChannel(channel);
            request.setEndWindowSize(endWindowSize);
            request.setForceToSpeechTime(forceToSpeechTime);
            request.setInputStream(inputStream);
            request.setEmitter(emitter);
            return request;
        }
    }
}
