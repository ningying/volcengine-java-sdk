package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestRevokeInstanceFromCen {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        RevokeInstanceFromCenRequest revokeInstanceFromCenRequest = new RevokeInstanceFromCenRequest();
        revokeInstanceFromCenRequest.setCenId("cen-7qthudw0ll6jmc****");
        revokeInstanceFromCenRequest.setCenOwnerId("210000****");
        revokeInstanceFromCenRequest.setInstanceId("vpc-uf6o8d1dj8sjwxi6o****");
        revokeInstanceFromCenRequest.setInstanceRegionId("cn-beijing");
        revokeInstanceFromCenRequest.setInstanceType(RevokeInstanceFromCenRequest.InstanceTypeEnum.valueOf(RevokeInstanceFromCenRequest.InstanceTypeEnum.class, "VPC"));
        
        try {
            RevokeInstanceFromCenResponse response = api.revokeInstanceFromCen(revokeInstanceFromCenRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}