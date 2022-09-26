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
import com.volcengine.vpc.model.EgressAclEntryForUpdateNetworkAclEntriesInput;
import com.volcengine.vpc.model.IngressAclEntryForUpdateNetworkAclEntriesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateNetworkAclEntriesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class UpdateNetworkAclEntriesRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("EgressAclEntries")
  private List<EgressAclEntryForUpdateNetworkAclEntriesInput> egressAclEntries = null;

  @SerializedName("IngressAclEntries")
  private List<IngressAclEntryForUpdateNetworkAclEntriesInput> ingressAclEntries = null;

  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  @SerializedName("UpdateEgressAclEntries")
  private Boolean updateEgressAclEntries = null;

  @SerializedName("UpdateIngressAclEntries")
  private Boolean updateIngressAclEntries = null;

  public UpdateNetworkAclEntriesRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public UpdateNetworkAclEntriesRequest egressAclEntries(List<EgressAclEntryForUpdateNetworkAclEntriesInput> egressAclEntries) {
    this.egressAclEntries = egressAclEntries;
    return this;
  }

  public UpdateNetworkAclEntriesRequest addEgressAclEntriesItem(EgressAclEntryForUpdateNetworkAclEntriesInput egressAclEntriesItem) {
    if (this.egressAclEntries == null) {
      this.egressAclEntries = new ArrayList<EgressAclEntryForUpdateNetworkAclEntriesInput>();
    }
    this.egressAclEntries.add(egressAclEntriesItem);
    return this;
  }

   /**
   * Get egressAclEntries
   * @return egressAclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<EgressAclEntryForUpdateNetworkAclEntriesInput> getEgressAclEntries() {
    return egressAclEntries;
  }

  public void setEgressAclEntries(List<EgressAclEntryForUpdateNetworkAclEntriesInput> egressAclEntries) {
    this.egressAclEntries = egressAclEntries;
  }

  public UpdateNetworkAclEntriesRequest ingressAclEntries(List<IngressAclEntryForUpdateNetworkAclEntriesInput> ingressAclEntries) {
    this.ingressAclEntries = ingressAclEntries;
    return this;
  }

  public UpdateNetworkAclEntriesRequest addIngressAclEntriesItem(IngressAclEntryForUpdateNetworkAclEntriesInput ingressAclEntriesItem) {
    if (this.ingressAclEntries == null) {
      this.ingressAclEntries = new ArrayList<IngressAclEntryForUpdateNetworkAclEntriesInput>();
    }
    this.ingressAclEntries.add(ingressAclEntriesItem);
    return this;
  }

   /**
   * Get ingressAclEntries
   * @return ingressAclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<IngressAclEntryForUpdateNetworkAclEntriesInput> getIngressAclEntries() {
    return ingressAclEntries;
  }

  public void setIngressAclEntries(List<IngressAclEntryForUpdateNetworkAclEntriesInput> ingressAclEntries) {
    this.ingressAclEntries = ingressAclEntries;
  }

  public UpdateNetworkAclEntriesRequest networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }

  public UpdateNetworkAclEntriesRequest updateEgressAclEntries(Boolean updateEgressAclEntries) {
    this.updateEgressAclEntries = updateEgressAclEntries;
    return this;
  }

   /**
   * Get updateEgressAclEntries
   * @return updateEgressAclEntries
  **/
  @Schema(description = "")
  public Boolean isUpdateEgressAclEntries() {
    return updateEgressAclEntries;
  }

  public void setUpdateEgressAclEntries(Boolean updateEgressAclEntries) {
    this.updateEgressAclEntries = updateEgressAclEntries;
  }

  public UpdateNetworkAclEntriesRequest updateIngressAclEntries(Boolean updateIngressAclEntries) {
    this.updateIngressAclEntries = updateIngressAclEntries;
    return this;
  }

   /**
   * Get updateIngressAclEntries
   * @return updateIngressAclEntries
  **/
  @Schema(description = "")
  public Boolean isUpdateIngressAclEntries() {
    return updateIngressAclEntries;
  }

  public void setUpdateIngressAclEntries(Boolean updateIngressAclEntries) {
    this.updateIngressAclEntries = updateIngressAclEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNetworkAclEntriesRequest updateNetworkAclEntriesRequest = (UpdateNetworkAclEntriesRequest) o;
    return Objects.equals(this.clientToken, updateNetworkAclEntriesRequest.clientToken) &&
        Objects.equals(this.egressAclEntries, updateNetworkAclEntriesRequest.egressAclEntries) &&
        Objects.equals(this.ingressAclEntries, updateNetworkAclEntriesRequest.ingressAclEntries) &&
        Objects.equals(this.networkAclId, updateNetworkAclEntriesRequest.networkAclId) &&
        Objects.equals(this.updateEgressAclEntries, updateNetworkAclEntriesRequest.updateEgressAclEntries) &&
        Objects.equals(this.updateIngressAclEntries, updateNetworkAclEntriesRequest.updateIngressAclEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, egressAclEntries, ingressAclEntries, networkAclId, updateEgressAclEntries, updateIngressAclEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNetworkAclEntriesRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    egressAclEntries: ").append(toIndentedString(egressAclEntries)).append("\n");
    sb.append("    ingressAclEntries: ").append(toIndentedString(ingressAclEntries)).append("\n");
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    updateEgressAclEntries: ").append(toIndentedString(updateEgressAclEntries)).append("\n");
    sb.append("    updateIngressAclEntries: ").append(toIndentedString(updateIngressAclEntries)).append("\n");
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
