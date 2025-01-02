package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 创建音色响应
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateToneResponse {

    @JsonProperty("BaseResp")
    private BaseResp BaseResp;

    @JsonProperty("speaker_id")
    private String speakerId;

    public CreateToneResponse.BaseResp getBaseResp() {
        return BaseResp;
    }

    public void setBaseResp(CreateToneResponse.BaseResp baseResp) {
        BaseResp = baseResp;
    }

    public String getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public static class BaseResp {
        @JsonProperty("StatusCode")
        private int statusCode;

        @JsonProperty("StatusMessage")
        private String statusMessage;

        public int getStatusCode() {
            return statusCode;
        }

        public String getStatusMessage() {
            return statusMessage;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public void setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
        }
    }
}
