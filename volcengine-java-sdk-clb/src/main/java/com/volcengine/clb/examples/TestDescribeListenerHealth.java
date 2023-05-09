package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestDescribeListenerHealth {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeListenerHealthRequest describeListenerHealthRequest = new DescribeListenerHealthRequest();
        describeListenerHealthRequest.setListenerId("lsn-2fek3rgsxhrsw5oxruwec****");
        describeListenerHealthRequest.setOnlyUnHealthy("true");
        describeListenerHealthRequest.setPageNumber(1);
        describeListenerHealthRequest.setPageSize(20);
        
        try {
            DescribeListenerHealthResponse response = api.describeListenerHealth(describeListenerHealthRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}