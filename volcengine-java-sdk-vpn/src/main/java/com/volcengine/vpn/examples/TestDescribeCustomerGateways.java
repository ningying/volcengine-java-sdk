package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestDescribeCustomerGateways {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest = new DescribeCustomerGatewaysRequest();
        describeCustomerGatewaysRequest.setCustomerGatewayIds(Arrays.asList("cgw-7qthudw0ll6jmc****"));
        describeCustomerGatewaysRequest.setPageNumber(1);
        describeCustomerGatewaysRequest.setPageSize(20);
        
        try {
            DescribeCustomerGatewaysResponse response = api.describeCustomerGateways(describeCustomerGatewaysRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}