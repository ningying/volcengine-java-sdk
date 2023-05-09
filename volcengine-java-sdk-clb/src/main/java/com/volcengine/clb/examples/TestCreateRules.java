package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestCreateRules {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        RuleForCreateRulesInput reqRules0 = new RuleForCreateRulesInput();
        reqRules0.setDomain("test.com");
        reqRules0.setServerGroupId("rsp-bp1o94dp5i6ea****");
        reqRules0.setUrl("/test");
        
        CreateRulesRequest createRulesRequest = new CreateRulesRequest();
        createRulesRequest.setListenerId("lsn-2fea4ayvu2g3k5oxruuz****");
        createRulesRequest.setRules(Arrays.asList(reqRules0));
        
        try {
            CreateRulesResponse response = api.createRules(createRulesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}