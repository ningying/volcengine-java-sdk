package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestAttachKeyPair {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        AttachKeyPairRequest attachKeyPairRequest = new AttachKeyPairRequest();
        attachKeyPairRequest.setInstanceIds(Arrays.asList("i-ahipakt2gcg95jpv****", "i-ahipakt2gdg95lbe****"));
        attachKeyPairRequest.setKeyPairName("ssh_key_pair1");
        
        try {
            AttachKeyPairResponse response = api.attachKeyPair(attachKeyPairRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}