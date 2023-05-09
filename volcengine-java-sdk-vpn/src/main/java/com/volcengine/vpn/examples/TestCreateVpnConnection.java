package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestCreateVpnConnection {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        CreateVpnConnectionRequest createVpnConnectionRequest = new CreateVpnConnectionRequest();
        createVpnConnectionRequest.setCustomerGatewayId("cgw-274mm8eodvu9s7fap8skw****");
        createVpnConnectionRequest.setDescription("test");
        createVpnConnectionRequest.setVpnConnectionName("test");
        createVpnConnectionRequest.setVpnGatewayId("vgw-2752abxsju1vk7fap8sgk****");
        
        try {
            CreateVpnConnectionResponse response = api.createVpnConnection(createVpnConnectionRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}