package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAuthorizeSecurityGroupIngress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest = new AuthorizeSecurityGroupIngressRequest();
        authorizeSecurityGroupIngressRequest.setCidrIp("10.XX.XX.0/8");
        authorizeSecurityGroupIngressRequest.setPolicy("accept");
        authorizeSecurityGroupIngressRequest.setPortEnd(22);
        authorizeSecurityGroupIngressRequest.setPortStart(22);
        authorizeSecurityGroupIngressRequest.setPriority(1);
        authorizeSecurityGroupIngressRequest.setProtocol("tcp");
        authorizeSecurityGroupIngressRequest.setSecurityGroupId("sg-bp67acfmxazb4p****");
        
        try {
            AuthorizeSecurityGroupIngressResponse response = api.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}