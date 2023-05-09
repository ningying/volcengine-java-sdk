package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestImportImage {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ImportImageRequest importImageRequest = new ImportImageRequest();
        importImageRequest.setArchitecture("amd64");
        importImageRequest.setImageName("image-1");
        importImageRequest.setOsType("Linux");
        importImageRequest.setPlatform("CentOS");
        importImageRequest.setPlatformVersion("7.6");
        importImageRequest.setUrl("xxx");
        
        try {
            ImportImageResponse response = api.importImage(importImageRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}