package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestListTagsForResources {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        ListTagsForResourcesRequest listTagsForResourcesRequest = new ListTagsForResourcesRequest();
        listTagsForResourcesRequest.setResourceIds(Arrays.asList("clb-273sdsdsxxxxxp8u2j****", "clb-2fe6fszjgeznk5oxruv0u****"));
        listTagsForResourcesRequest.setResourceType(ListTagsForResourcesRequest.ResourceTypeEnum.valueOf(ListTagsForResourcesRequest.ResourceTypeEnum.class, "CLB"));
        
        try {
            ListTagsForResourcesResponse response = api.listTagsForResources(listTagsForResourcesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}