/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.ecs.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.ecs.EcsApi;
import com.volcengine.ecs.model.*;


public class TestReplaceSystemVolume {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        EcsApi api = new EcsApi(apiClient);
        
        ReplaceSystemVolumeRequest replaceSystemVolumeRequest = new ReplaceSystemVolumeRequest();
        replaceSystemVolumeRequest.setImageId("image-38dfk6rfisf6kir6****");
        replaceSystemVolumeRequest.setInstanceId("i-a8j6n1i4hojfqpa0****");
        replaceSystemVolumeRequest.setPassword("Password@123");
        
        try {
            ReplaceSystemVolumeResponse response = api.replaceSystemVolume(replaceSystemVolumeRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}