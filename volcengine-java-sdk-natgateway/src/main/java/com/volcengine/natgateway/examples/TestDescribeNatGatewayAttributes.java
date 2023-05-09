package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestDescribeNatGatewayAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        DescribeNatGatewayAttributesRequest describeNatGatewayAttributesRequest = new DescribeNatGatewayAttributesRequest();
        describeNatGatewayAttributesRequest.setNatGatewayId("ngw-2fesmko5zhdz459gp67sc****");
        
        try {
            DescribeNatGatewayAttributesResponse response = api.describeNatGatewayAttributes(describeNatGatewayAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}