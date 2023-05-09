package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestCreateRouteEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        CreateRouteEntryRequest createRouteEntryRequest = new CreateRouteEntryRequest();
        createRouteEntryRequest.setDestinationCidrBlock("8.XX.XX.8/16");
        createRouteEntryRequest.setNextHopId("NetworkInterface");
        createRouteEntryRequest.setNextHopType("eni-2fdzbqxfwrt345oxru******");
        createRouteEntryRequest.setRouteTableId("vtb-2fdzao4h726f45oxruw******");
        
        try {
            CreateRouteEntryResponse response = api.createRouteEntry(createRouteEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}