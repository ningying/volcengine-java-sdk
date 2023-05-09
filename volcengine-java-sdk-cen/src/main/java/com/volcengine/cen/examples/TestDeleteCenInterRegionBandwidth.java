package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestDeleteCenInterRegionBandwidth {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DeleteCenInterRegionBandwidthRequest deleteCenInterRegionBandwidthRequest = new DeleteCenInterRegionBandwidthRequest();
        deleteCenInterRegionBandwidthRequest.setInterRegionBandwidthId("cirb-3tex2x1cwd4c6c0v****");
        
        try {
            DeleteCenInterRegionBandwidthResponse response = api.deleteCenInterRegionBandwidth(deleteCenInterRegionBandwidthRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}