package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestCreateTags {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        TagForCreateTagsInput reqTags0 = new TagForCreateTagsInput();
        reqTags0.setKey("k1");
        reqTags0.setValue("v1");
        
        CreateTagsRequest createTagsRequest = new CreateTagsRequest();
        createTagsRequest.setResourceIds(Arrays.asList("i-l8u0p77yseabkpak****", "i-l8u0p7xyseabkbak****"));
        createTagsRequest.setResourceType("instance");
        createTagsRequest.setTags(Arrays.asList(reqTags0));
        
        try {
            CreateTagsResponse response = api.createTags(createTagsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}