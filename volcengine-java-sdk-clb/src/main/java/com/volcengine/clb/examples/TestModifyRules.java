package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestModifyRules {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        RuleForModifyRulesInput reqRules0 = new RuleForModifyRulesInput();
        reqRules0.setDescription("test");
        reqRules0.setRuleId("rule-2fegss1cplxxc5oxruvvq****");
        reqRules0.setServerGroupId("rsp-bp1o94dp5i6ea****");
        
        ModifyRulesRequest modifyRulesRequest = new ModifyRulesRequest();
        modifyRulesRequest.setListenerId("lsn-2fek3rgsxhrsw5oxruwec****");
        modifyRulesRequest.setRules(Arrays.asList(reqRules0));
        
        try {
            ModifyRulesResponse response = api.modifyRules(modifyRulesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}