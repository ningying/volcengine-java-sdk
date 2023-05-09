package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifySecurityGroupRuleDescriptionsEgress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifySecurityGroupRuleDescriptionsEgressRequest modifySecurityGroupRuleDescriptionsEgressRequest = new ModifySecurityGroupRuleDescriptionsEgressRequest();
        modifySecurityGroupRuleDescriptionsEgressRequest.setCidrIp("10.XX.XX.0/8");
        modifySecurityGroupRuleDescriptionsEgressRequest.setPortEnd(22);
        modifySecurityGroupRuleDescriptionsEgressRequest.setPortStart(22);
        modifySecurityGroupRuleDescriptionsEgressRequest.setPriority(1);
        modifySecurityGroupRuleDescriptionsEgressRequest.setProtocol("tcp");
        
        try {
            ModifySecurityGroupRuleDescriptionsEgressResponse response = api.modifySecurityGroupRuleDescriptionsEgress(modifySecurityGroupRuleDescriptionsEgressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}