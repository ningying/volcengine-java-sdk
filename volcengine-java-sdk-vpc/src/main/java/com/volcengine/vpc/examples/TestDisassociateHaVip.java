package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestDisassociateHaVip {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        DisassociateHaVipRequest disassociateHaVipRequest = new DisassociateHaVipRequest();
        disassociateHaVipRequest.setHaVipId("havip-2zeo05qre24nhrqpy****");
        disassociateHaVipRequest.setInstanceId("i-faf344422ffsfad****");
        disassociateHaVipRequest.setInstanceType(DisassociateHaVipRequest.InstanceTypeEnum.valueOf(DisassociateHaVipRequest.InstanceTypeEnum.class, "EcsInstance"));
        
        try {
            DisassociateHaVipResponse response = api.disassociateHaVip(disassociateHaVipRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}