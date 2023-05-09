package com.volcengine.ecs.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;

import java.util.*;


public class TestModifyInstanceChargeType {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ModifyInstanceChargeTypeRequest modifyInstanceChargeTypeRequest = new ModifyInstanceChargeTypeRequest();
        modifyInstanceChargeTypeRequest.setAutoPay(true);
        modifyInstanceChargeTypeRequest.setIncludeDataVolumes(false);
        modifyInstanceChargeTypeRequest.setInstanceChargeType("PrePaid");
        modifyInstanceChargeTypeRequest.setInstanceIds(Arrays.asList("i-4ay51iinvo8w4nho****"));
        modifyInstanceChargeTypeRequest.setPeriod(2);
        modifyInstanceChargeTypeRequest.setPeriodUnit("Month");
        
        try {
            ModifyInstanceChargeTypeResponse response = api.modifyInstanceChargeType(modifyInstanceChargeTypeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}