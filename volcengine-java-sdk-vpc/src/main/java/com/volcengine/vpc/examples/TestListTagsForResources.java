package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestListTagsForResources {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ListTagsForResourcesRequest listTagsForResourcesRequest = new ListTagsForResourcesRequest();
        listTagsForResourcesRequest.setResourceIds(Arrays.asList("vpc-273w3e33y2y9s7fap8u2j****", "vpc-bp15zckdt37pq72zv****"));
        listTagsForResourcesRequest.setResourceType(ListTagsForResourcesRequest.ResourceTypeEnum.valueOf(ListTagsForResourcesRequest.ResourceTypeEnum.class, "vpc"));
        
        try {
            ListTagsForResourcesResponse response = api.listTagsForResources(listTagsForResourcesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}