package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestModifyCenInterRegionBandwidthAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        ModifyCenInterRegionBandwidthAttributesRequest modifyCenInterRegionBandwidthAttributesRequest = new ModifyCenInterRegionBandwidthAttributesRequest();
        modifyCenInterRegionBandwidthAttributesRequest.setBandwidth(1000);
        modifyCenInterRegionBandwidthAttributesRequest.setInterRegionBandwidthId("cirb-3tex2x1cwd4c6c0v****");
        
        try {
            ModifyCenInterRegionBandwidthAttributesResponse response = api.modifyCenInterRegionBandwidthAttributes(modifyCenInterRegionBandwidthAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}