package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAttachNetworkInterface {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AttachNetworkInterfaceRequest attachNetworkInterfaceRequest = new AttachNetworkInterfaceRequest();
        attachNetworkInterfaceRequest.setInstanceId("i-wijfn35c****");
        attachNetworkInterfaceRequest.setNetworkInterfaceId("eni-bp1fg655nh68xyz9****");
        
        try {
            AttachNetworkInterfaceResponse response = api.attachNetworkInterface(attachNetworkInterfaceRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}