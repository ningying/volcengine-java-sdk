package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestAttachInstanceToCen {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        AttachInstanceToCenRequest attachInstanceToCenRequest = new AttachInstanceToCenRequest();
        attachInstanceToCenRequest.setCenId("cen-7qthudw0ll6jmc****");
        attachInstanceToCenRequest.setInstanceId("vpc-2fexiqjlgjif45oxruvso****");
        attachInstanceToCenRequest.setInstanceRegionId("cn-beijing");
        attachInstanceToCenRequest.setInstanceType("vpc");
        
        try {
            AttachInstanceToCenResponse response = api.attachInstanceToCen(attachInstanceToCenRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}