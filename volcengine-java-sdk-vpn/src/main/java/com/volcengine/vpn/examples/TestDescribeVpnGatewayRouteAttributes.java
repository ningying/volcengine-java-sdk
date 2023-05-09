package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestDescribeVpnGatewayRouteAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        DescribeVpnGatewayRouteAttributesRequest describeVpnGatewayRouteAttributesRequest = new DescribeVpnGatewayRouteAttributesRequest();
        describeVpnGatewayRouteAttributesRequest.setVpnGatewayRouteId("vgr-3tex2c6c0v844c****");
        
        try {
            DescribeVpnGatewayRouteAttributesResponse response = api.describeVpnGatewayRouteAttributes(describeVpnGatewayRouteAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}