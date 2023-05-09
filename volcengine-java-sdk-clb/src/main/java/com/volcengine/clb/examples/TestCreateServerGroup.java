package com.volcengine.clb.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;

import java.util.*;


public class TestCreateServerGroup {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        ServerForCreateServerGroupInput reqServers0 = new ServerForCreateServerGroupInput();
        reqServers0.setInstanceId("i-3tkuehz8oa3vj0wz****");
        reqServers0.setIp("192.XX.XX.2");
        reqServers0.setPort(88);
        reqServers0.setType("ecs");
        reqServers0.setWeight(100);
        
        CreateServerGroupRequest createServerGroupRequest = new CreateServerGroupRequest();
        createServerGroupRequest.setLoadBalancerId("clb-bp1b6c719dfa08ex****");
        createServerGroupRequest.setServerGroupName("myservergroup");
        createServerGroupRequest.setServers(Arrays.asList(reqServers0));
        
        try {
            CreateServerGroupResponse response = api.createServerGroup(createServerGroupRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}