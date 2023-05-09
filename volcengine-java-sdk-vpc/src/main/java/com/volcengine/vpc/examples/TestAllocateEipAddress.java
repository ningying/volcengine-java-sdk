package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestAllocateEipAddress {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        AllocateEipAddressRequest allocateEipAddressRequest = new AllocateEipAddressRequest();
        allocateEipAddressRequest.setBandwidth(10);
        allocateEipAddressRequest.setBillingType(2);
        allocateEipAddressRequest.setIsP(AllocateEipAddressRequest.ISPEnum.valueOf(AllocateEipAddressRequest.ISPEnum.class, "BGP"));
        
        try {
            AllocateEipAddressResponse response = api.allocateEipAddress(allocateEipAddressRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}