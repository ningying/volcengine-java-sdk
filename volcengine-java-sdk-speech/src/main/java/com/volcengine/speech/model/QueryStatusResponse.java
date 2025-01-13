package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 状态查询响应
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryStatusResponse {

    @JsonProperty("BaseResp")
    private BaseResp BaseResp;

    @JsonProperty("speaker_id")
    private String speakerId;

    /**
     * 任务状态: NotFound = 0 Training = 1 Success = 2 Failed = 3 Active = 4
     */
    @JsonProperty("status")
    private Integer status;

    /**
     *
     * 创建时间
     */
    @JsonProperty("create_time")
    private Long createTime;

    /**
     *
     * 训练版本
     */
    @JsonProperty("version")
    private String version;

    /**
     *
     * 音频训练demo
     */
    @JsonProperty("demo_audio")
    private String demoAudio;

    public QueryStatusResponse.BaseResp getBaseResp() {
        return BaseResp;
    }

    public void setBaseResp(QueryStatusResponse.BaseResp baseResp) {
        BaseResp = baseResp;
    }

    public String getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDemoAudio() {
        return demoAudio;
    }

    public void setDemoAudio(String demoAudio) {
        this.demoAudio = demoAudio;
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
