package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestCreateCustomerGateway {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        CreateCustomerGatewayRequest createCustomerGatewayRequest = new CreateCustomerGatewayRequest();
        createCustomerGatewayRequest.setCustomerGatewayName("test");
        createCustomerGatewayRequest.setDescription("test");
        createCustomerGatewayRequest.setIpAddress("1.1.1.1");
        
        try {
            CreateCustomerGatewayResponse response = api.createCustomerGateway(createCustomerGatewayRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}