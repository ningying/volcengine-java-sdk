package com.volcengine.speech.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.reactivex.Flowable;

import static com.volcengine.speech.Const.EVENT_NONE;

/**
 * TTS响应
 *
 * @author ningy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TtsStreamResponse {

    public int code;

    public boolean success;

    public String message;

    public Flowable<byte[]> stream;

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

    public Flowable<byte[]> getStream() {
        return stream;
    }

    public void setStream(Flowable<byte[]> stream) {
        this.stream = stream;
    }
}
