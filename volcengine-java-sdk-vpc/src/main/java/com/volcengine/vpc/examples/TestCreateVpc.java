package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestCreateVpc {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        CreateVpcRequest createVpcRequest = new CreateVpcRequest();
        createVpcRequest.setCidrBlock("172.XX.XX.0/12");
        createVpcRequest.setDescription("test");
        createVpcRequest.setDnsServers(Arrays.asList("1.XX.XX.1"));
        createVpcRequest.setVpcName("test");
        
        try {
            CreateVpcResponse response = api.createVpc(createVpcRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}