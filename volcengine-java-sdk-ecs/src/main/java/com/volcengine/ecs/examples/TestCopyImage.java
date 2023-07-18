/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;


public class TestCopyImage {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        CopyImageRequest copyImageRequest = new CopyImageRequest();
        copyImageRequest.setDestinationRegion("cn-changsha-sdv");
        copyImageRequest.setImageId("image-4431h3l7hl31a0******");
        copyImageRequest.setImageName("testlyb1");
        
        try {
            CopyImageResponse response = api.copyImage(copyImageRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}