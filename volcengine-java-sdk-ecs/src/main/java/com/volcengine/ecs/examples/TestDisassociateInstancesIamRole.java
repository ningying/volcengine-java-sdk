package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestDisassociateInstancesIamRole {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DisassociateInstancesIamRoleRequest disassociateInstancesIamRoleRequest = new DisassociateInstancesIamRoleRequest();
        disassociateInstancesIamRoleRequest.setIamRoleName("EcsTestRole");
        disassociateInstancesIamRoleRequest.setInstanceIds(Arrays.asList("i-3tiefmkskq3vj0******"));
        
        try {
            DisassociateInstancesIamRoleResponse response = api.disassociateInstancesIamRole(disassociateInstancesIamRoleRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}