package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestDeleteSnatEntry {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        DeleteSnatEntryRequest deleteSnatEntryRequest = new DeleteSnatEntryRequest();
        deleteSnatEntryRequest.setSnatEntryId("snat-2fedi096gdiww59gp680****");
        
        try {
            DeleteSnatEntryResponse response = api.deleteSnatEntry(deleteSnatEntryRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}