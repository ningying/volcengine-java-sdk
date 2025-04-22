package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.reactivex.Flowable;

import java.util.Map;

/**
 * ASR响应
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsrStreamResponse {

    public int code;

    public boolean success;

    public String message;

    public Flowable<Map<String, Object>> stream;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Flowable<Map<String, Object>> getStream() {
        return stream;
    }

    public void setStream(Flowable<Map<String, Object>> stream) {
        this.stream = stream;
    }
}
