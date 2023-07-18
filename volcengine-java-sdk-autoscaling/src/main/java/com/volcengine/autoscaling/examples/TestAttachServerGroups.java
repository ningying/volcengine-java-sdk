/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.autoscaling.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.autoscaling.AutoScalingApi;
import com.volcengine.autoscaling.model.*;
import java.util.*;


public class TestAttachServerGroups {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        AutoScalingApi api = new AutoScalingApi(apiClient);
        
        ServerGroupAttributeForAttachServerGroupsInput reqServerGroupAttributes = new ServerGroupAttributeForAttachServerGroupsInput();
        reqServerGroupAttributes.setPort(12);
        reqServerGroupAttributes.setServerGroupId("rsp-12b2z5fnxvhts17q7y2fj****");
        reqServerGroupAttributes.setWeight(20);
        
        AttachServerGroupsRequest attachServerGroupsRequest = new AttachServerGroupsRequest();
        attachServerGroupsRequest.setScalingGroupId("");
        attachServerGroupsRequest.setServerGroupAttributes(Arrays.asList(reqServerGroupAttributes));
        
        try {
            AttachServerGroupsResponse response = api.attachServerGroups(attachServerGroupsRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}