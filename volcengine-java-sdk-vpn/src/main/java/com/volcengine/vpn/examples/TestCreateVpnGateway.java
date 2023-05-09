package com.volcengine.vpn.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpn.VpnApi;
import com.volcengine.vpn.model.*;

import java.util.*;


public class TestCreateVpnGateway {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpnApi api = new VpnApi(apiClient);
        
        CreateVpnGatewayRequest createVpnGatewayRequest = new CreateVpnGatewayRequest();
        createVpnGatewayRequest.setBandwidth(5);
        createVpnGatewayRequest.setBillingType(1);
        createVpnGatewayRequest.setDescription("test");
        createVpnGatewayRequest.setPeriod(1);
        createVpnGatewayRequest.setPeriodUnit(CreateVpnGatewayRequest.PeriodUnitEnum.valueOf(CreateVpnGatewayRequest.PeriodUnitEnum.class, "Month"));
        createVpnGatewayRequest.setSubnetId("subnet-2fewbgn7jbk0059gp67ap****");
        createVpnGatewayRequest.setVpcId("vpc-12bhs1ivo6p6o17q7y2x3****");
        createVpnGatewayRequest.setVpnGatewayName("test");
        
        try {
            CreateVpnGatewayResponse response = api.createVpnGateway(createVpnGatewayRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}