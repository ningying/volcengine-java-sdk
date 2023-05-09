package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestEnableAccessLog {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        EnableAccessLogRequest enableAccessLogRequest = new EnableAccessLogRequest();
        enableAccessLogRequest.setBucketName("clb-tos1");
        enableAccessLogRequest.setLoadBalancerId("clb-bp1b6c719dfa08ex****");
        
        try {
            EnableAccessLogResponse response = api.enableAccessLog(enableAccessLogRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}