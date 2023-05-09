package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestCreateDnatEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        CreateDnatEntryRequest createDnatEntryRequest = new CreateDnatEntryRequest();
        createDnatEntryRequest.setExternalIp("12.XX.XX.34");
        createDnatEntryRequest.setExternalPort("34");
        createDnatEntryRequest.setInternalIp("192.XX.XX.88");
        createDnatEntryRequest.setInternalPort("12");
        createDnatEntryRequest.setNatGatewayId("ngw-2feq5xhimd88w59gp686****");
        createDnatEntryRequest.setProtocol("tcp");
        
        try {
            CreateDnatEntryResponse response = api.createDnatEntry(createDnatEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}