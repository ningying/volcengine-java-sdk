/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestModifyCenAttributes {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        ModifyCenAttributesRequest modifyCenAttributesRequest = new ModifyCenAttributesRequest();
        modifyCenAttributesRequest.setCenId("cen-7qthudw0ll6jmc****");
        modifyCenAttributesRequest.setCenName("cen-test");
        modifyCenAttributesRequest.setDescription("test");
        
        try {
            ModifyCenAttributesResponse response = api.modifyCenAttributes(modifyCenAttributesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}