package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建音色
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateToneRequest {

    @JsonProperty("reqid")
    private String reqId;

    @JsonProperty("appid")
    private String appId;

    @JsonProperty("speaker_id")
    private String speakerId;

    @JsonProperty("audios")
    private List<Audio> audios;

    /**
     * 固定值：2
     */
    @JsonProperty("source")
    private Integer source;

    /**
     * 语言：0-中文，1-英文
     */
    @JsonProperty("language")
    private Integer language;

    /**
     * 模型类型：0-默认为1.0， 1-2.0效果
     */
    @JsonProperty("model_type")
    private Integer modelType;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    public static class Audio {
        @JsonProperty("audio_bytes")
        private String audioBytes;

        @JsonProperty("audio_format")
        private String audioFormat;

        @JsonProperty("text")
        private String text;

        public String getAudioBytes() {
            return audioBytes;
        }
        public void setAudioBytes(String audioBytes) {
            this.audioBytes = audioBytes;
        }

        public String getAudioFormat() {
            return audioFormat;
        }
        public void setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
        }

        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }

        public static AudioBuilder builder() {
            return new AudioBuilder();
        }

        public static class AudioBuilder {
            private String audioBytes;

            private String audioFormat;

            private String text;

            public AudioBuilder audioBytes(String audioBytes) {
                this.audioBytes = audioBytes;
                return this;
            }

            public AudioBuilder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            public AudioBuilder text(String text) {
                this.text = text;
                return this;
            }

            public Audio build() {
                Audio audio = new Audio();
                audio.setAudioBytes(audioBytes);
                audio.setAudioFormat(audioFormat);
                audio.setText(text);
                return audio;
            }
        }

        @Override
        public String toString() {
            return "Audio{" +
                    "audioBytes='" + audioBytes + '\'' +
                    ", audioFormat='" + audioFormat + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String reqId;

        private String appid;

        private String speakerId;

        private List<Audio> audios;

        private Integer source;

        private Integer language;

        private Integer modelType;

        private Builder() {
        }

        public Builder reqId(String reqId) {
            this.reqId = reqId;
            return this;
        }

        public Builder appid(String appid) {
            this.appid = appid;
            return this;
        }

        public Builder speakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }

        public Builder audios(List<Audio> audios) {
            this.audios = audios;
            return this;
        }

        public Builder source(Integer source) {
            this.source = source;
            return this;
        }

        public Builder language(Integer language) {
            this.language = language;
            return this;
        }

        public Builder modelType(Integer modelType) {
            this.modelType = modelType;
            return this;
        }

        public CreateToneRequest build() {
            CreateToneRequest createContextRequest = new CreateToneRequest();
            createContextRequest.setReqId(reqId);
            createContextRequest.setAppId(appid);
            createContextRequest.setSpeakerId(speakerId);
            createContextRequest.setAudios(audios);
            createContextRequest.setSource(source);
            createContextRequest.setLanguage(language);
            createContextRequest.setModelType(modelType);
            return createContextRequest;
        }
    }

    @Override
    public String toString() {
        return "CreateToneRequest{" +
                "reqId='" + reqId + '\'' +
                ", appId='" + appId + '\'' +
                ", speakerId='" + speakerId + '\'' +
                ", audios=" + audios +
                ", source=" + source +
                ", language=" + language +
                ", modelType=" + modelType +
                '}';
    }
}
