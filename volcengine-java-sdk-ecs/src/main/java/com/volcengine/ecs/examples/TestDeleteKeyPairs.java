package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDeleteKeyPairs {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DeleteKeyPairsRequest deleteKeyPairsRequest = new DeleteKeyPairsRequest();
        deleteKeyPairsRequest.setKeyPairNames(Arrays.asList("ssh_key_pair1", "ssh_key_pair2"));
        
        try {
            DeleteKeyPairsResponse response = api.deleteKeyPairs(deleteKeyPairsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}