package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestAssociateInstancesIamRole {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        AssociateInstancesIamRoleRequest associateInstancesIamRoleRequest = new AssociateInstancesIamRoleRequest();
        associateInstancesIamRoleRequest.setIamRoleName("EcsTestRole");
        associateInstancesIamRoleRequest.setInstanceIds(Arrays.asList("i-3tiefmkskq3vj0******"));
        
        try {
            AssociateInstancesIamRoleResponse response = api.associateInstancesIamRole(associateInstancesIamRoleRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}