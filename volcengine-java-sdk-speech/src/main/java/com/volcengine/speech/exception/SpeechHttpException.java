package com.volcengine.speech.exception;

public class SpeechHttpException extends RuntimeException {
    public static Integer INTERNAL_SERVICE_CODE = 500;

    public final int statusCode;

    public final Integer code;

    public final String requestId;

    public SpeechHttpException(SpeechAPIError error, Exception parent, int statusCode, String requestId) {
        super(error.getMessage(), parent);
        this.statusCode = statusCode;
        this.code = error.getCode();
        this.requestId = requestId;
    }

    public String getMessage() {
        return this.toString();
    }

    public String toString() {
        return "SpeechHttpException: statusCode=" + this.statusCode + ", code=" + this.code + ", requestId=" + this.requestId + ", message=" + super.getMessage();
    }
}
