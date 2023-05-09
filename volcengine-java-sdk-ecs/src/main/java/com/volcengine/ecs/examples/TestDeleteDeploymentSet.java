package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDeleteDeploymentSet {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DeleteDeploymentSetRequest deleteDeploymentSetRequest = new DeleteDeploymentSetRequest();
        deleteDeploymentSetRequest.setDeploymentSetId("dps-yc1o9aahks5m57nk****");
        
        try {
            DeleteDeploymentSetResponse response = api.deleteDeploymentSet(deleteDeploymentSetRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}