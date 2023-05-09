package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestModifyServerGroupAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        ServerForModifyServerGroupAttributesInput reqServers0 = new ServerForModifyServerGroupAttributesInput();
        reqServers0.setPort(88);
        reqServers0.setServerId("rs-mjc9b2p0v6rk5smt1b27****");
        reqServers0.setWeight(100);
        
        ModifyServerGroupAttributesRequest modifyServerGroupAttributesRequest = new ModifyServerGroupAttributesRequest();
        modifyServerGroupAttributesRequest.setServerGroupId("rsp-bp1o94dp5i6ea****");
        modifyServerGroupAttributesRequest.setServerGroupName("myservergroup");
        modifyServerGroupAttributesRequest.setServers(Arrays.asList(reqServers0));
        
        try {
            ModifyServerGroupAttributesResponse response = api.modifyServerGroupAttributes(modifyServerGroupAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}