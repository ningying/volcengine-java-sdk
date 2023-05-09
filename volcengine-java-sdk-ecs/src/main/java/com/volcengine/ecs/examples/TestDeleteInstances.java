package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDeleteInstances {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DeleteInstancesRequest deleteInstancesRequest = new DeleteInstancesRequest();
        deleteInstancesRequest.setInstanceIds(Arrays.asList("i-ybo349sxoncm9t******", "i-ybo349sxolcm9t******"));
        
        try {
            DeleteInstancesResponse response = api.deleteInstances(deleteInstancesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}