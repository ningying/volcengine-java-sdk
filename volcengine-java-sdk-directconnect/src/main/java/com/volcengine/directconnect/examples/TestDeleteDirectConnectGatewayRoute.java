/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.directconnect.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.directconnect.DirectconnectApi;
import com.volcengine.directconnect.model.*;


public class TestDeleteDirectConnectGatewayRoute {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        DirectconnectApi api = new DirectconnectApi(apiClient);
        
        DeleteDirectConnectGatewayRouteRequest deleteDirectConnectGatewayRouteRequest = new DeleteDirectConnectGatewayRouteRequest();
        deleteDirectConnectGatewayRouteRequest.setDirectConnectGatewayRouteId("dcr-7qthudw0ll6jmc****");
        
        try {
            DeleteDirectConnectGatewayRouteResponse response = api.deleteDirectConnectGatewayRoute(deleteDirectConnectGatewayRouteRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}