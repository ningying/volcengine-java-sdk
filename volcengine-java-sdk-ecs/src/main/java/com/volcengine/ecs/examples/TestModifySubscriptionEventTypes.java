package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestModifySubscriptionEventTypes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ModifySubscriptionEventTypesRequest modifySubscriptionEventTypesRequest = new ModifySubscriptionEventTypesRequest();
        modifySubscriptionEventTypesRequest.setEventTypes(Arrays.asList("SystemFailure.Stop:Succeeded", "SystemFailure.Stop:Succeeded"));
        modifySubscriptionEventTypesRequest.setSubscriptionId("s-6js1al1y9665lp******");
        
        try {
            ModifySubscriptionEventTypesResponse response = api.modifySubscriptionEventTypes(modifySubscriptionEventTypesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}