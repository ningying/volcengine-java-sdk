/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EgressAclEntryForUpdateNetworkAclEntriesInput
 */


public class EgressAclEntryForUpdateNetworkAclEntriesInput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrIp")
  private String destinationCidrIp = null;

  @SerializedName("NetworkAclEntryId")
  private String networkAclEntryId = null;

  @SerializedName("NetworkAclEntryName")
  private String networkAclEntryName = null;

  @SerializedName("Policy")
  private String policy = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public EgressAclEntryForUpdateNetworkAclEntriesInput description(String description) {
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

  public EgressAclEntryForUpdateNetworkAclEntriesInput destinationCidrIp(String destinationCidrIp) {
    this.destinationCidrIp = destinationCidrIp;
    return this;
  }

   /**
   * Get destinationCidrIp
   * @return destinationCidrIp
  **/
  @Schema(description = "")
  public String getDestinationCidrIp() {
    return destinationCidrIp;
  }

  public void setDestinationCidrIp(String destinationCidrIp) {
    this.destinationCidrIp = destinationCidrIp;
  }

  public EgressAclEntryForUpdateNetworkAclEntriesInput networkAclEntryId(String networkAclEntryId) {
    this.networkAclEntryId = networkAclEntryId;
    return this;
  }

   /**
   * Get networkAclEntryId
   * @return networkAclEntryId
  **/
  @Schema(description = "")
  public String getNetworkAclEntryId() {
    return networkAclEntryId;
  }

  public void setNetworkAclEntryId(String networkAclEntryId) {
    this.networkAclEntryId = networkAclEntryId;
  }

  public EgressAclEntryForUpdateNetworkAclEntriesInput networkAclEntryName(String networkAclEntryName) {
    this.networkAclEntryName = networkAclEntryName;
    return this;
  }

   /**
   * Get networkAclEntryName
   * @return networkAclEntryName
  **/
  @Schema(description = "")
  public String getNetworkAclEntryName() {
    return networkAclEntryName;
  }

  public void setNetworkAclEntryName(String networkAclEntryName) {
    this.networkAclEntryName = networkAclEntryName;
  }

  public EgressAclEntryForUpdateNetworkAclEntriesInput policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public EgressAclEntryForUpdateNetworkAclEntriesInput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public EgressAclEntryForUpdateNetworkAclEntriesInput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EgressAclEntryForUpdateNetworkAclEntriesInput egressAclEntryForUpdateNetworkAclEntriesInput = (EgressAclEntryForUpdateNetworkAclEntriesInput) o;
    return Objects.equals(this.description, egressAclEntryForUpdateNetworkAclEntriesInput.description) &&
        Objects.equals(this.destinationCidrIp, egressAclEntryForUpdateNetworkAclEntriesInput.destinationCidrIp) &&
        Objects.equals(this.networkAclEntryId, egressAclEntryForUpdateNetworkAclEntriesInput.networkAclEntryId) &&
        Objects.equals(this.networkAclEntryName, egressAclEntryForUpdateNetworkAclEntriesInput.networkAclEntryName) &&
        Objects.equals(this.policy, egressAclEntryForUpdateNetworkAclEntriesInput.policy) &&
        Objects.equals(this.port, egressAclEntryForUpdateNetworkAclEntriesInput.port) &&
        Objects.equals(this.protocol, egressAclEntryForUpdateNetworkAclEntriesInput.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destinationCidrIp, networkAclEntryId, networkAclEntryName, policy, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgressAclEntryForUpdateNetworkAclEntriesInput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrIp: ").append(toIndentedString(destinationCidrIp)).append("\n");
    sb.append("    networkAclEntryId: ").append(toIndentedString(networkAclEntryId)).append("\n");
    sb.append("    networkAclEntryName: ").append(toIndentedString(networkAclEntryName)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
