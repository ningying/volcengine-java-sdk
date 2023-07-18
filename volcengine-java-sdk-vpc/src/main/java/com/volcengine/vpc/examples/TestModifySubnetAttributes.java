/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.vpc.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;


public class TestModifySubnetAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        ModifySubnetAttributesRequest modifySubnetAttributesRequest = new ModifySubnetAttributesRequest();
        modifySubnetAttributesRequest.setDescription("This is my subnet");
        modifySubnetAttributesRequest.setSubnetId("subnet-bp15qtc7ywecf****");
        modifySubnetAttributesRequest.setSubnetName("subnet-1");
        
        try {
            ModifySubnetAttributesResponse response = api.modifySubnetAttributes(modifySubnetAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}