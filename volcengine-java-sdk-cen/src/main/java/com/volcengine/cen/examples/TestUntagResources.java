package com.volcengine.cen.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;

import java.util.*;


public class TestUntagResources {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        UntagResourcesRequest untagResourcesRequest = new UntagResourcesRequest();
        untagResourcesRequest.setResourceIds(Arrays.asList("cen-273w3e33y2y9s7fap8u2j****", "cen-7qthudw0ll6jmc****"));
        untagResourcesRequest.setResourceType(UntagResourcesRequest.ResourceTypeEnum.valueOf(UntagResourcesRequest.ResourceTypeEnum.class, "cen"));
        
        try {
            UntagResourcesResponse response = api.untagResources(untagResourcesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}