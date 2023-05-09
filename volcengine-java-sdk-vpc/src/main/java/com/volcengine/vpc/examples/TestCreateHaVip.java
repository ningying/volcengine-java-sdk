package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestCreateHaVip {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        CreateHaVipRequest createHaVipRequest = new CreateHaVipRequest();
        createHaVipRequest.setHaVipName("HaVip-test");
        createHaVipRequest.setIpAddress("192.XX.XX.10");
        createHaVipRequest.setSubnetId("subnet-ina9r9xnfpc08gbs****");
        
        try {
            CreateHaVipResponse response = api.createHaVip(createHaVipRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}