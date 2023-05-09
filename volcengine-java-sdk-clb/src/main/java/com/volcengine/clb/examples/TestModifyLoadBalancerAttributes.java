package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestModifyLoadBalancerAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest = new ModifyLoadBalancerAttributesRequest();
        modifyLoadBalancerAttributesRequest.setDescription("test");
        modifyLoadBalancerAttributesRequest.setLoadBalancerId("clb-bp1b6c719dfa08ex****");
        modifyLoadBalancerAttributesRequest.setLoadBalancerName("clb-test1");
        modifyLoadBalancerAttributesRequest.setLoadBalancerSpec("small_1");
        modifyLoadBalancerAttributesRequest.setModificationProtectionReason("实例托管");
        modifyLoadBalancerAttributesRequest.setModificationProtectionStatus("ConsoleProtection");
        
        try {
            ModifyLoadBalancerAttributesResponse response = api.modifyLoadBalancerAttributes(modifyLoadBalancerAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}