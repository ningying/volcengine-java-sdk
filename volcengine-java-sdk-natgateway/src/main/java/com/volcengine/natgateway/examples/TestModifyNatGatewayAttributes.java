package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestModifyNatGatewayAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        ModifyNatGatewayAttributesRequest modifyNatGatewayAttributesRequest = new ModifyNatGatewayAttributesRequest();
        modifyNatGatewayAttributesRequest.setNatGatewayId("ngw-2fedgzyvtzaio59gp675l****");
        modifyNatGatewayAttributesRequest.setSpec(ModifyNatGatewayAttributesRequest.SpecEnum.valueOf(ModifyNatGatewayAttributesRequest.SpecEnum.class, "Small"));
        
        try {
            ModifyNatGatewayAttributesResponse response = api.modifyNatGatewayAttributes(modifyNatGatewayAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}