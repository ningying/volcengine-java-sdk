/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.directconnect.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.directconnect.DirectconnectApi;
import com.volcengine.directconnect.model.*;
import java.util.*;


public class TestDescribeDirectConnectGateways {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest = new DescribeDirectConnectGatewaysRequest();
        describeDirectConnectGatewaysRequest.setDirectConnectGatewayIds(Arrays.asList("dcg-7qthudw0ll6jmc****"));
        describeDirectConnectGatewaysRequest.setPageNumber(1);
        describeDirectConnectGatewaysRequest.setPageSize(20);
        
        try {
            DescribeDirectConnectGatewaysResponse response = api.describeDirectConnectGateways(describeDirectConnectGatewaysRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}