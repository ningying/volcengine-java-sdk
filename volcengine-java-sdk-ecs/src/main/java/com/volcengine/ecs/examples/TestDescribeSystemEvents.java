package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDescribeSystemEvents {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DescribeSystemEventsRequest describeSystemEventsRequest = new DescribeSystemEventsRequest();
        describeSystemEventsRequest.setEventIds(Arrays.asList("e-3ti9101aju3vj0******"));
        
        try {
            DescribeSystemEventsResponse response = api.describeSystemEvents(describeSystemEventsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}