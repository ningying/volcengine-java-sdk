package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestModifyImageAttribute {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ModifyImageAttributeRequest modifyImageAttributeRequest = new ModifyImageAttributeRequest();
        modifyImageAttributeRequest.setDescription("abc");
        modifyImageAttributeRequest.setImageId("image-ebgy1og99tfct0gw****");
        modifyImageAttributeRequest.setImageName("image1");
        
        try {
            ModifyImageAttributeResponse response = api.modifyImageAttribute(modifyImageAttributeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}