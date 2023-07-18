/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.directconnect.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.directconnect.DirectconnectApi;
import com.volcengine.directconnect.model.*;


public class TestDeleteDirectConnectConnection {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "cn-beijing";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DeleteDirectConnectConnectionRequest deleteDirectConnectConnectionRequest = new DeleteDirectConnectConnectionRequest();
        deleteDirectConnectConnectionRequest.setDirectConnectConnectionId("dcc-3tehy13n2l4c6c0v****");
        
        try {
            DeleteDirectConnectConnectionResponse response = api.deleteDirectConnectConnection(deleteDirectConnectConnectionRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}