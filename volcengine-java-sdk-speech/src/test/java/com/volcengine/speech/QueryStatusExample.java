package com.volcengine.speech;


import com.volcengine.speech.model.QueryStatusRequest;
import com.volcengine.speech.model.QueryStatusResponse;
import com.volcengine.speech.service.SpeechService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.concurrent.TimeUnit;

public class QueryStatusExample {

    static String apiKey = "SdU1JwE7ea7s04SFNLiYNJ1hWQvAIOlm";
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static SpeechService service = new SpeechService(apiKey);

    public static void main(String[] args) {
        System.out.println("\n----- standard request -----");

        QueryStatusRequest queryStatusRequest = QueryStatusRequest.builder()
                .appid("3190114174")
                .speakerId("S_TRIHghUd1")
                .build();

        QueryStatusResponse queryStatusResponse =  service.queryStatus(queryStatusRequest);

        System.out.println("\n----- streaming request -----");
        System.out.println(queryStatusResponse.getSpeakerId());
        System.out.println(queryStatusResponse.getStatus());


        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
