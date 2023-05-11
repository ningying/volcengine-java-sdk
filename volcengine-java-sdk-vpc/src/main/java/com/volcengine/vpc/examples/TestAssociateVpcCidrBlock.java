/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestAssociateVpcCidrBlock {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest = new AssociateVpcCidrBlockRequest();
        associateVpcCidrBlockRequest.setVpcId("vpc-257gqcdfvx6n****");
        
        try {
            AssociateVpcCidrBlockResponse response = api.associateVpcCidrBlock(associateVpcCidrBlockRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}