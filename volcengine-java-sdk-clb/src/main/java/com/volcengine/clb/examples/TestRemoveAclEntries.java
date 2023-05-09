package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestRemoveAclEntries {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        RemoveAclEntriesRequest removeAclEntriesRequest = new RemoveAclEntriesRequest();
        removeAclEntriesRequest.setAclId("acl-3cj44nv0jhhxc6c6rrtet****");
        removeAclEntriesRequest.setEntries(Arrays.asList("192.XX.XX.7/16", "172.XX.XX.0/24"));
        
        try {
            RemoveAclEntriesResponse response = api.removeAclEntries(removeAclEntriesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}