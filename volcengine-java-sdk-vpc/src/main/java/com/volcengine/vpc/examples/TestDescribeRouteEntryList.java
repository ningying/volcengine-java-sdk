package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDescribeRouteEntryList {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DescribeRouteEntryListRequest describeRouteEntryListRequest = new DescribeRouteEntryListRequest();
        describeRouteEntryListRequest.setRouteTableId("vtb-2fdzao4h726f45oxruw******");
        
        try {
            DescribeRouteEntryListResponse response = api.describeRouteEntryList(describeRouteEntryListRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}