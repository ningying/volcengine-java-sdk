package com.volcengine.vpc.examples;


import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.vpc.VpcApi;
import com.volcengine.vpc.model.*;

import java.util.*;


public class TestUpdateNetworkAclEntries {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        VpcApi api = new VpcApi(apiClient);
        
        EgressAclEntryForUpdateNetworkAclEntriesInput reqEgressAclEntries0 = new EgressAclEntryForUpdateNetworkAclEntriesInput();
        reqEgressAclEntries0.setDescription("ThisisEgressAclEntries01.");
        reqEgressAclEntries0.setDestinationCidrIp("10.XX.XX.0/24");
        reqEgressAclEntries0.setNetworkAclEntryId("nae-2zecs97e0brcge46****");
        reqEgressAclEntries0.setNetworkAclEntryName("acl-01");
        reqEgressAclEntries0.setPolicy("accept");
        reqEgressAclEntries0.setPort("-1/-1");
        reqEgressAclEntries0.setProtocol("all");
        
        EgressAclEntryForUpdateNetworkAclEntriesInput reqEgressAclEntries1 = new EgressAclEntryForUpdateNetworkAclEntriesInput();
        reqEgressAclEntries1.setDescription("ThisisEgressAclEntries02.");
        reqEgressAclEntries1.setDestinationCidrIp("10.XX.XX.0/24");
        reqEgressAclEntries1.setNetworkAclEntryId("nae-0iswk4d88jvds****");
        reqEgressAclEntries1.setNetworkAclEntryName("acl-02");
        reqEgressAclEntries1.setPolicy("accept");
        reqEgressAclEntries1.setPort("80/80");
        reqEgressAclEntries1.setProtocol("icmp");
        
        IngressAclEntryForUpdateNetworkAclEntriesInput reqIngressAclEntries0 = new IngressAclEntryForUpdateNetworkAclEntriesInput();
        reqIngressAclEntries0.setDescription("ThisisIngressAclEntries01.");
        reqIngressAclEntries0.setNetworkAclEntryId("nae-2zepn32de59j8m4****");
        reqIngressAclEntries0.setNetworkAclEntryName("acl-3***");
        reqIngressAclEntries0.setPolicy("accept");
        reqIngressAclEntries0.setPort("22/22");
        reqIngressAclEntries0.setProtocol("all");
        reqIngressAclEntries0.setSourceCidrIp("10.XX.XX.0/24");
        
        IngressAclEntryForUpdateNetworkAclEntriesInput reqIngressAclEntries1 = new IngressAclEntryForUpdateNetworkAclEntriesInput();
        reqIngressAclEntries1.setDescription("ThisisIngressAclEntries02.");
        reqIngressAclEntries1.setNetworkAclEntryId("nae-xyz2dmndek90e****");
        reqIngressAclEntries1.setNetworkAclEntryName("acl-es***");
        reqIngressAclEntries1.setPolicy("");
        reqIngressAclEntries1.setPort("80/80");
        reqIngressAclEntries1.setProtocol("tcp");
        reqIngressAclEntries1.setSourceCidrIp("10.XX.XX.0/24");
        
        UpdateNetworkAclEntriesRequest updateNetworkAclEntriesRequest = new UpdateNetworkAclEntriesRequest();
        updateNetworkAclEntriesRequest.setEgressAclEntries(Arrays.asList(reqEgressAclEntries0, reqEgressAclEntries1));
        updateNetworkAclEntriesRequest.setIngressAclEntries(Arrays.asList(reqIngressAclEntries0, reqIngressAclEntries1));
        updateNetworkAclEntriesRequest.setNetworkAclId("nacl-bp1fg655nh68xyz9****");
        updateNetworkAclEntriesRequest.setUpdateEgressAclEntries(false);
        updateNetworkAclEntriesRequest.setUpdateIngressAclEntries(false);
        
        try {
            UpdateNetworkAclEntriesResponse response = api.updateNetworkAclEntries(updateNetworkAclEntriesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}