package com.volcengine.speech;

import com.volcengine.speech.model.*;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * 语音API
 *
 * @author ningy
 */
public interface SpeechApi {


    @POST("/api/v1/mega_tts/audio/upload")
    Single<CreateToneResponse> createTone(@Body CreateToneRequest request, @Header(Const.RESOURCE_ID) String resourceId);

    @POST("/api/v1/mega_tts/status")
    Single<QueryStatusResponse> queryStatus(@Body QueryStatusRequest request, @Header(Const.RESOURCE_ID) String resourceId);

    @POST("/api/v1/tts")
    Single<TtsResponse> synthesis(@Body TtsRequest request);

}
