package com.volcengine.speech.exception;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeechAPIError {

    @JsonProperty("reqid")
    private String requestId;

    @JsonProperty("code")
    private Integer code;

    @JsonProperty("message")
    private String message;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public SpeechAPIError(String requestId, Integer code, String message) {
        this.requestId = requestId;
        this.code = code;
        this.message = message;
    }

    public SpeechAPIError() {}

    @Override
    public String toString() {
        return "SpeechAPIError{" +
                "requestId='" + requestId + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
