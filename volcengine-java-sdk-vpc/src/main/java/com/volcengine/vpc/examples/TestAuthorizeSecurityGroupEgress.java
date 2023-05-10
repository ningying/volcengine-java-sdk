/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAuthorizeSecurityGroupEgress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest = new AuthorizeSecurityGroupEgressRequest();
        authorizeSecurityGroupEgressRequest.setCidrIp("10.XX.XX.0/8");
        authorizeSecurityGroupEgressRequest.setPolicy("accept");
        authorizeSecurityGroupEgressRequest.setPortEnd(22);
        authorizeSecurityGroupEgressRequest.setPortStart(22);
        authorizeSecurityGroupEgressRequest.setPriority(1);
        authorizeSecurityGroupEgressRequest.setProtocol("tcp");
        authorizeSecurityGroupEgressRequest.setSecurityGroupId("sg-bp67acfmxazb4p****");
        
        try {
            AuthorizeSecurityGroupEgressResponse response = api.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}