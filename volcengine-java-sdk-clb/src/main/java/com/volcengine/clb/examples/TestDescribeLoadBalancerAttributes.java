package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestDescribeLoadBalancerAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest = new DescribeLoadBalancerAttributesRequest();
        describeLoadBalancerAttributesRequest.setLoadBalancerId("clb-bp1b6c719dfa08ex****");
        
        try {
            DescribeLoadBalancerAttributesResponse response = api.describeLoadBalancerAttributes(describeLoadBalancerAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}