package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestDescribeVpnConnectionAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        DescribeVpnConnectionAttributesRequest describeVpnConnectionAttributesRequest = new DescribeVpnConnectionAttributesRequest();
        describeVpnConnectionAttributesRequest.setVpnConnectionId("vgc-2bzvqi8kerd342dx0eg2f****");
        
        try {
            DescribeVpnConnectionAttributesResponse response = api.describeVpnConnectionAttributes(describeVpnConnectionAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}