package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDescribeInstanceTypes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DescribeInstanceTypesRequest describeInstanceTypesRequest = new DescribeInstanceTypesRequest();
        describeInstanceTypesRequest.setInstanceTypeIds(Arrays.asList("ecs.g2i.large"));
        
        try {
            DescribeInstanceTypesResponse response = api.describeInstanceTypes(describeInstanceTypesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}