package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAssociateHaVip {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AssociateHaVipRequest associateHaVipRequest = new AssociateHaVipRequest();
        associateHaVipRequest.setHaVipId("havip-2zeo05qre24nhrqpy****");
        associateHaVipRequest.setInstanceId("i-faf344422ffsfad****");
        associateHaVipRequest.setInstanceType(AssociateHaVipRequest.InstanceTypeEnum.valueOf(AssociateHaVipRequest.InstanceTypeEnum.class, "EcsInstance"));
        
        try {
            AssociateHaVipResponse response = api.associateHaVip(associateHaVipRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}