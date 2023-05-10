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


public class TestUnassignPrivateIpAddresses {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest = new UnassignPrivateIpAddressesRequest();
        unassignPrivateIpAddressesRequest.setNetworkInterfaceId("eni-bp67acfmxazb4ph****");
        unassignPrivateIpAddressesRequest.setPrivateIpAddress(Arrays.asList("192.168.XX.10"));
        
        try {
            UnassignPrivateIpAddressesResponse response = api.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}