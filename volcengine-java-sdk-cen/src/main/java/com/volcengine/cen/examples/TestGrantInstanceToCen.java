package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestGrantInstanceToCen {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        GrantInstanceToCenRequest grantInstanceToCenRequest = new GrantInstanceToCenRequest();
        grantInstanceToCenRequest.setCenId("cen-7qthudw0ll6jmc****");
        grantInstanceToCenRequest.setCenOwnerId("210000****");
        grantInstanceToCenRequest.setInstanceId("vpc-uf6o8d1dj8sjwxi6o****");
        grantInstanceToCenRequest.setInstanceRegionId("cn-beijing");
        grantInstanceToCenRequest.setInstanceType(GrantInstanceToCenRequest.InstanceTypeEnum.valueOf(GrantInstanceToCenRequest.InstanceTypeEnum.class, "VPC"));
        
        try {
            GrantInstanceToCenResponse response = api.grantInstanceToCen(grantInstanceToCenRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}