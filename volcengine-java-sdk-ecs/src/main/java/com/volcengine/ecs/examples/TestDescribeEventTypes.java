/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;
import java.util.*;


public class TestDescribeEventTypes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        DescribeEventTypesRequest describeEventTypesRequest = new DescribeEventTypesRequest();
        describeEventTypesRequest.setTypes(Arrays.asList("DiskError_Redeploy", "CreateInstance"));
        
        try {
            DescribeEventTypesResponse response = api.describeEventTypes(describeEventTypesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}