package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestModifySecurityGroupRuleDescriptionsIngress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifySecurityGroupRuleDescriptionsIngressRequest modifySecurityGroupRuleDescriptionsIngressRequest = new ModifySecurityGroupRuleDescriptionsIngressRequest();
        modifySecurityGroupRuleDescriptionsIngressRequest.setCidrIp("10.XX.XX.0/8");
        modifySecurityGroupRuleDescriptionsIngressRequest.setPortEnd(22);
        modifySecurityGroupRuleDescriptionsIngressRequest.setPortStart(22);
        modifySecurityGroupRuleDescriptionsIngressRequest.setPriority(1);
        modifySecurityGroupRuleDescriptionsIngressRequest.setProtocol("tcp");
        
        try {
            ModifySecurityGroupRuleDescriptionsIngressResponse response = api.modifySecurityGroupRuleDescriptionsIngress(modifySecurityGroupRuleDescriptionsIngressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}