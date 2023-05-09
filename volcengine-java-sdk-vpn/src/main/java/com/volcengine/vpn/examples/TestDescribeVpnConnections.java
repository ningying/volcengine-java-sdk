package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestDescribeVpnConnections {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        DescribeVpnConnectionsRequest describeVpnConnectionsRequest = new DescribeVpnConnectionsRequest();
        describeVpnConnectionsRequest.setPageNumber(1);
        describeVpnConnectionsRequest.setPageSize(20);
        describeVpnConnectionsRequest.setVpnConnectionIds(Arrays.asList("vgc-2bzvqi8kerd342dx0eg2f****"));
        
        try {
            DescribeVpnConnectionsResponse response = api.describeVpnConnections(describeVpnConnectionsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}