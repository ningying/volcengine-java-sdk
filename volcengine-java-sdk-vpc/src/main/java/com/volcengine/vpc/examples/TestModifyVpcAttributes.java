package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifyVpcAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifyVpcAttributesRequest modifyVpcAttributesRequest = new ModifyVpcAttributesRequest();
        modifyVpcAttributesRequest.setDescription("test");
        modifyVpcAttributesRequest.setDnsServers(Arrays.asList("1.XX.XX.1"));
        modifyVpcAttributesRequest.setVpcId("vpc-bp15zct37pq72zv****");
        modifyVpcAttributesRequest.setVpcName("test");
        
        try {
            ModifyVpcAttributesResponse response = api.modifyVpcAttributes(modifyVpcAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}