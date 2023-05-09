package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestDescribeCenInterRegionBandwidths {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DescribeCenInterRegionBandwidthsRequest describeCenInterRegionBandwidthsRequest = new DescribeCenInterRegionBandwidthsRequest();
        describeCenInterRegionBandwidthsRequest.setPageNumber(1);
        describeCenInterRegionBandwidthsRequest.setPageSize("20");
        
        try {
            DescribeCenInterRegionBandwidthsResponse response = api.describeCenInterRegionBandwidths(describeCenInterRegionBandwidthsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}