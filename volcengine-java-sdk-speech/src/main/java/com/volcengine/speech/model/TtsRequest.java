package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * tts请求参数
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TtsRequest {

    @JsonProperty("app")
    private App app;

    @JsonProperty("user")
    private User user;

    @JsonProperty("audio")
    private Audio audio;

    @JsonProperty("request")
    private Request request;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class App {

        /**
         * 应用标识
         */
        @JsonProperty("appid")
        private String appid;

        /**
         * 应用令牌
         */
        @JsonProperty("token")
        private String token;

        /**
         * 业务集群:volcano_icl或volcano_icl_concurr
         */
        @JsonProperty("cluster")
        private String cluster;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getCluster() {
            return cluster;
        }

        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        public static AppBuilder builder() {
            return new AppBuilder();
        }

        public static class AppBuilder {

            private String appid;

            private String token;

            private String cluster;

            public AppBuilder appid(String appid) {
                this.appid = appid;
                return this;
            }

            public AppBuilder token(String token) {
                this.token = token;
                return this;
            }

            public AppBuilder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            public App build() {
                App app = new App();
                app.setAppid(appid);
                app.setToken(token);
                app.setCluster(cluster);
                return app;
            }
        }

        @Override
        public String toString() {
            return "App{" +
                    "appid='" + appid + '\'' +
                    ", token='" + token + '\'' +
                    ", cluster='" + cluster + '\'' +
                    '}';
        }
    }

    public static class User {

        /**
         * 用户标识
         */
        @JsonProperty("uid")
        private String uid;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public static class UserBuilder {

            private String uid;

            public UserBuilder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public User build() {
                User user = new User();
                user.setUid(uid);
                return user;
            }
        }

        @Override
        public String toString() {
            return "User{" +
                    "uid='" + uid + '\'' +
                    '}';
        }
    }

    public static class Audio {

        /**
         * 音色类型（SpeakerId)
         */
        @JsonProperty("voice_type")
        private String voiceType;

        /**
         * 音频编码格式：wav / pcm / ogg_opus / mp3，默认为 pcm
         */
        @JsonProperty("encoding")
        private String encoding;

        @JsonProperty("text")
        private String text;

        /** 音频采样率：默认为 24000，可选8000，16000*/
        @JsonProperty("rate")
        private Integer rate;

        /** 语速：[0.2,3]，默认为1，通常保留一位小数即可 */
        @JsonProperty("speed_ratio")
        private Double speedRatio;

        public String getVoiceType() {
            return voiceType;
        }

        public void setVoiceType(String voiceType) {
            this.voiceType = voiceType;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public Double getSpeedRatio() {
            return speedRatio;
        }

        public void setSpeedRatio(Double speedRatio) {
            this.speedRatio = speedRatio;
        }

        public static AudioBuilder builder() {
            return new AudioBuilder();
        }

        public static class AudioBuilder {

            private String voiceType;

            private String encoding;

            private Integer rate;

            private Double speedRatio;

            public AudioBuilder voiceType(String voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public AudioBuilder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            public AudioBuilder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            public AudioBuilder speedRatio(Double speedRatio) {
                this.speedRatio = speedRatio;
                return this;
            }

            public Audio build() {
                Audio audio = new Audio();
                audio.setVoiceType(voiceType);
                audio.setEncoding(encoding);
                audio.setRate(rate);
                audio.setSpeedRatio(speedRatio);
                return audio;
            }
        }

        @Override
        public String toString() {
            return "Audio{" +
                    "voiceType='" + voiceType + '\'' +
                    ", encoding='" + encoding + '\'' +
                    ", text='" + text + '\'' +
                    ", rate=" + rate +
                    ", speedRatio=" + speedRatio +
                    '}';
        }
    }

    public static class Request {

        /**
         * 文本类型：text / ssml
         */
        @JsonProperty("text_type")
        private String textType;

        /**
         * 时间戳相关：传入1时表示启用，可返回原文本的时间戳，而非TN后文本，即保留原文中的阿拉伯数字或者特殊符号等。
         */
        @JsonProperty("with_timestamp")
        private String withTimestamp;

        /**
         * 请求标识: 需要保证每次调用传入值唯一，建议使用 UUID
         */
        @JsonProperty("reqid")
        private String reqId;

        /** 文本：合成语音的文本，长度限制 1024 字节（UTF-8编码） */
        @JsonProperty("text")
        private String text;

        /** 操作：query（非流式，http只能query） / submit（流式） */
        @JsonProperty("operation")
        private String operation;

        public String getTextType() {
            return textType;
        }

        public void setTextType(String textType) {
            this.textType = textType;
        }

        public String getWithTimestamp() {
            return withTimestamp;
        }

        public void setWithTimestamp(String withTimestamp) {
            this.withTimestamp = withTimestamp;
        }

        public String getReqId() {
            return reqId;
        }

        public void setReqId(String reqId) {
            this.reqId = reqId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public static RequestBuilder builder() {
            return new RequestBuilder();
        }

        public static class RequestBuilder {

            private String textType;

            private String withTimestamp;

            private String reqId;

            private String text;

            private String operation;

            public RequestBuilder textType(String textType) {
                this.textType = textType;
                return this;
            }

            public RequestBuilder withTimestamp(String withTimestamp) {
                this.withTimestamp = withTimestamp;
                return this;
            }

            public RequestBuilder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            public RequestBuilder text(String text) {
                this.text = text;
                return this;
            }

            public RequestBuilder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public Request build() {
                Request request = new Request();
                request.setTextType(textType);
                request.setWithTimestamp(withTimestamp);
                request.setReqId(reqId);
                request.setText(text);
                request.setOperation(operation);
                return request;
            }
        }

        @Override
        public String toString() {
            return "Request{" +
                    "textType='" + textType + '\'' +
                    ", withTimestamp='" + withTimestamp + '\'' +
                    ", reqId='" + reqId + '\'' +
                    ", text='" + text + '\'' +
                    ", operation='" + operation + '\'' +
                    '}';
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private App app;

        private User user;

        private Audio audio;

        private Request request;

        private Builder() {
        }

        public Builder app(App app) {
            this.app = app;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder audio(Audio audio) {
            this.audio = audio;
            return this;
        }

        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        public TtsRequest build() {
            TtsRequest ttsRequest = new TtsRequest();
            ttsRequest.setApp(app);
            ttsRequest.setUser(user);
            ttsRequest.setAudio(audio);
            ttsRequest.setRequest(request);
            return ttsRequest;
        }
    }

    @Override
    public String toString() {
        return "TtsRequest{" +
                "app=" + app +
                ", user=" + user +
                ", audio=" + audio +
                ", request=" + request +
                '}';
    }
}
