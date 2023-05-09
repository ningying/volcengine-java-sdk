package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestCreateLoadBalancer {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest();
        createLoadBalancerRequest.setLoadBalancerBillingType(2);
        createLoadBalancerRequest.setLoadBalancerName("clb-test");
        createLoadBalancerRequest.setLoadBalancerSpec("small_1");
        createLoadBalancerRequest.setType("private");
        createLoadBalancerRequest.setVpcId("vpc-bp1aevy8sofi8mh1****");
        
        try {
            CreateLoadBalancerResponse response = api.createLoadBalancer(createLoadBalancerRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}