package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestCreateNetworkInterface {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        CreateNetworkInterfaceRequest createNetworkInterfaceRequest = new CreateNetworkInterfaceRequest();
        createNetworkInterfaceRequest.setNetworkInterfaceName("test");
        createNetworkInterfaceRequest.setPrimaryIpAddress("192.XX.XX.10");
        createNetworkInterfaceRequest.setSecurityGroupIds(Arrays.asList("sg-123edfgt8hhvj****"));
        createNetworkInterfaceRequest.setSubnetId("subnet-xxxxxx");
        
        try {
            CreateNetworkInterfaceResponse response = api.createNetworkInterface(createNetworkInterfaceRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}