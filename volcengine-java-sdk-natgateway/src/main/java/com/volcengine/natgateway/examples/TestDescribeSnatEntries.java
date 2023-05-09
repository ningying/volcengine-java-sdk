package com.volcengine.natgateway.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestDescribeSnatEntries {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        DescribeSnatEntriesRequest describeSnatEntriesRequest = new DescribeSnatEntriesRequest();
        describeSnatEntriesRequest.setNatGatewayId("ngw-2fedgzyvtzaio59gp675l****");
        describeSnatEntriesRequest.setSnatEntryIds(Arrays.asList("snat-2fedi22b12iv459gp68****", "snat-2fedhzdlyknb459gp676o****"));
        
        try {
            DescribeSnatEntriesResponse response = api.describeSnatEntries(describeSnatEntriesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}