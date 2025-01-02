package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 状态查询请求
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryStatusRequest {

    @JsonProperty("appid")
    private String appId;

    @JsonProperty("speaker_id")
    private String speakerId;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String appid;

        private String speakerId;

        private Builder() {
        }

        public Builder appid(String appid) {
            this.appid = appid;
            return this;
        }

        public Builder speakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }

        public QueryStatusRequest build() {
            QueryStatusRequest createContextRequest = new QueryStatusRequest();
            createContextRequest.setAppId(appid);
            createContextRequest.setSpeakerId(speakerId);
            return createContextRequest;
        }
    }

    @Override
    public String toString() {
        return "QueryStatusRequest{" +
                "appId='" + appId + '\'' +
                ", speakerId='" + speakerId + '\'' +
                '}';
    }
}
