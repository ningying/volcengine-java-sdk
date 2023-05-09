package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAssociateNetworkAcl {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ResourceForAssociateNetworkAclInput reqResource0 = new ResourceForAssociateNetworkAclInput();
        reqResource0.setResourceId("subnet-67acfmxazb4p****");
        
        ResourceForAssociateNetworkAclInput reqResource1 = new ResourceForAssociateNetworkAclInput();
        reqResource1.setResourceId("subnet-g655nh68xyz9****");
        
        AssociateNetworkAclRequest associateNetworkAclRequest = new AssociateNetworkAclRequest();
        associateNetworkAclRequest.setNetworkAclId("nacl-bp1fg655nh68xyz9****");
        associateNetworkAclRequest.setResource(Arrays.asList(reqResource0, reqResource1));
        
        try {
            AssociateNetworkAclResponse response = api.associateNetworkAcl(associateNetworkAclRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}