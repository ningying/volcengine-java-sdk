/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.natgateway.examples


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.natgateway.NatgatewayApi;
import com.volcengine.natgateway.model.*;

import java.util.*;


public class TestDescribeSnatEntryAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        NatgatewayApi api = new NatgatewayApi(apiClient);
        
        DescribeSnatEntryAttributesRequest describeSnatEntryAttributesRequest = new DescribeSnatEntryAttributesRequest();
        describeSnatEntryAttributesRequest.setSnatEntryId("snat-2fedi096gdiww59gp680****");
        
        try {
            DescribeSnatEntryAttributesResponse response = api.describeSnatEntryAttributes(describeSnatEntryAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}