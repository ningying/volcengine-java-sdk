package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TTS响应
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TtsResponse {

    /**
     * 请求 ID: 请求 ID,与传入的参数中 reqid 一致
     */
    @JsonProperty("reqid")
    private String reqId;

    /**
     * 请求状态码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 请求状态信息
     */
    @JsonProperty("message")
    private String message;

    /**
     * 语音数据
     */
    @JsonProperty("sequence")
    private Integer sequence;

    /**
     * 合成音频
     */
    @JsonProperty("data")
    private String data;

    /**
     * 额外信息父节点
     */
    @JsonProperty("addition")
    private Object addition;

    /**
     * 音频时长: 返回音频的长度，单位ms
     */
    @JsonProperty("duration")
    private String duration;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Object getAddition() {
        return addition;
    }

    public void setAddition(Object addition) {
        this.addition = addition;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
