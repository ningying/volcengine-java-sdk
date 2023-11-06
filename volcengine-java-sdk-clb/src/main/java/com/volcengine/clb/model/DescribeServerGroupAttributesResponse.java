/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.ServerForDescribeServerGroupAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeServerGroupAttributesResponse
 */


public class DescribeServerGroupAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AddressIpVersion")
  private String addressIpVersion = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("Servers")
  private List<ServerForDescribeServerGroupAttributesOutput> servers = null;

  @SerializedName("Type")
  private String type = null;

  public DescribeServerGroupAttributesResponse addressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
    return this;
  }

   /**
   * Get addressIpVersion
   * @return addressIpVersion
  **/
  @Schema(description = "")
  public String getAddressIpVersion() {
    return addressIpVersion;
  }

  public void setAddressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
  }

  public DescribeServerGroupAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DescribeServerGroupAttributesResponse listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public DescribeServerGroupAttributesResponse addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public DescribeServerGroupAttributesResponse loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public DescribeServerGroupAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeServerGroupAttributesResponse serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public DescribeServerGroupAttributesResponse serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public DescribeServerGroupAttributesResponse servers(List<ServerForDescribeServerGroupAttributesOutput> servers) {
    this.servers = servers;
    return this;
  }

  public DescribeServerGroupAttributesResponse addServersItem(ServerForDescribeServerGroupAttributesOutput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForDescribeServerGroupAttributesOutput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForDescribeServerGroupAttributesOutput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForDescribeServerGroupAttributesOutput> servers) {
    this.servers = servers;
  }

  public DescribeServerGroupAttributesResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeServerGroupAttributesResponse describeServerGroupAttributesResponse = (DescribeServerGroupAttributesResponse) o;
    return Objects.equals(this.addressIpVersion, describeServerGroupAttributesResponse.addressIpVersion) &&
        Objects.equals(this.description, describeServerGroupAttributesResponse.description) &&
        Objects.equals(this.listeners, describeServerGroupAttributesResponse.listeners) &&
        Objects.equals(this.loadBalancerId, describeServerGroupAttributesResponse.loadBalancerId) &&
        Objects.equals(this.requestId, describeServerGroupAttributesResponse.requestId) &&
        Objects.equals(this.serverGroupId, describeServerGroupAttributesResponse.serverGroupId) &&
        Objects.equals(this.serverGroupName, describeServerGroupAttributesResponse.serverGroupName) &&
        Objects.equals(this.servers, describeServerGroupAttributesResponse.servers) &&
        Objects.equals(this.type, describeServerGroupAttributesResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressIpVersion, description, listeners, loadBalancerId, requestId, serverGroupId, serverGroupName, servers, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerGroupAttributesResponse {\n");
    
    sb.append("    addressIpVersion: ").append(toIndentedString(addressIpVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
