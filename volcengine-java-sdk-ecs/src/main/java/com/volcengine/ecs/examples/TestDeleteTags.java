package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDeleteTags {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DeleteTagsRequest deleteTagsRequest = new DeleteTagsRequest();
        deleteTagsRequest.setResourceIds(Arrays.asList("i-l8u0p77yseabkpak****", "i-l8u0p7xyseabkbak****"));
        deleteTagsRequest.setResourceType("instance");
        deleteTagsRequest.setTagKeys(Arrays.asList("k1"));
        
        try {
            DeleteTagsResponse response = api.deleteTags(deleteTagsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}