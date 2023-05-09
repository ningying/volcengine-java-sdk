package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestAddAclEntries {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        AclEntryForAddAclEntriesInput reqAclEntries0 = new AclEntryForAddAclEntriesInput();
        reqAclEntries0.setEntry("192.XX.XX.7/16");
        
        AclEntryForAddAclEntriesInput reqAclEntries1 = new AclEntryForAddAclEntriesInput();
        reqAclEntries1.setEntry("192.XX.XX.0/16");
        
        AddAclEntriesRequest addAclEntriesRequest = new AddAclEntriesRequest();
        addAclEntriesRequest.setAclEntries(Arrays.asList(reqAclEntries0, reqAclEntries1));
        addAclEntriesRequest.setAclId("acl-3cj44nv0jhhxc6c6rrtet****");
        
        try {
            AddAclEntriesResponse response = api.addAclEntries(addAclEntriesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}