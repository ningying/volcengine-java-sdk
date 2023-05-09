package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestModifyImageSharePermission {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ModifyImageSharePermissionRequest modifyImageSharePermissionRequest = new ModifyImageSharePermissionRequest();
        modifyImageSharePermissionRequest.setAddAccounts(Arrays.asList("210005****"));
        modifyImageSharePermissionRequest.setImageId("image-ebgy1og99tfct0gw****");
        
        try {
            ModifyImageSharePermissionResponse response = api.modifyImageSharePermission(modifyImageSharePermissionRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}