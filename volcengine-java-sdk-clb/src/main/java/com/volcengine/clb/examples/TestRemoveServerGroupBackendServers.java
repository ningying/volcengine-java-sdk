package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestRemoveServerGroupBackendServers {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        RemoveServerGroupBackendServersRequest removeServerGroupBackendServersRequest = new RemoveServerGroupBackendServersRequest();
        removeServerGroupBackendServersRequest.setServerGroupId("rsp-bp1o94dp5i6ea****");
        removeServerGroupBackendServersRequest.setServerIds(Arrays.asList("rs-3cig8e5o0kxs06c6rrsqn****"));
        
        try {
            RemoveServerGroupBackendServersResponse response = api.removeServerGroupBackendServers(removeServerGroupBackendServersRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}