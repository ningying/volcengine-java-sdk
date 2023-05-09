package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestModifyDnatEntryAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        ModifyDnatEntryAttributesRequest modifyDnatEntryAttributesRequest = new ModifyDnatEntryAttributesRequest();
        modifyDnatEntryAttributesRequest.setDnatEntryId("dnat-342abc3bc3****");
        modifyDnatEntryAttributesRequest.setInternalIp("192.XX.XX.88");
        
        try {
            ModifyDnatEntryAttributesResponse response = api.modifyDnatEntryAttributes(modifyDnatEntryAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}