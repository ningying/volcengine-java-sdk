package com.volcengine.speech;


import com.volcengine.speech.model.CreateToneRequest;
import com.volcengine.speech.model.CreateToneResponse;
import com.volcengine.speech.model.TtsRequest;
import com.volcengine.speech.model.TtsResponse;
import com.volcengine.speech.service.SpeechService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TtsExample {

    static String apiKey = "SdU1JwE7ea7s04SFNLiYNJ1hWQvAIOlm";
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static SpeechService service = SpeechService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) {
        System.out.println("\n----- standard request -----");

        TtsRequest request = TtsRequest.builder()
                .app(TtsRequest.App.builder()
                        .appid("3190114174")
                        .cluster("volcano_icl")
                        .build())
                .user(TtsRequest.User.builder()
                        .uid("uid").build())
                .audio(TtsRequest.Audio.builder()
                        .encoding("mp3")
                        .voiceType("S_TRIHghUd1")
                        .rate(16000)
                        .build())
                .request(TtsRequest.Request.builder()
                        .reqId(UUID.randomUUID().toString())
                        .operation("query")
                        .text("你好，欢迎使用语音合成服务。")
                        .build())
                .build();

        long start = System.currentTimeMillis();
        TtsResponse synthesisResult = service.synthesis(request);
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        System.out.println("\n----- streaming request -----");
        System.out.println(synthesisResult.getData());


        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
