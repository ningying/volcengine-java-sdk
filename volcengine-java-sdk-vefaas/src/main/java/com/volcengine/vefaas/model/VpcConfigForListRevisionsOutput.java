/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpcConfigForListRevisionsOutput
 */



public class VpcConfigForListRevisionsOutput {
  @SerializedName("EnableSharedInternetAccess")
  private Boolean enableSharedInternetAccess = null;

  @SerializedName("EnableVpc")
  private Boolean enableVpc = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public VpcConfigForListRevisionsOutput enableSharedInternetAccess(Boolean enableSharedInternetAccess) {
    this.enableSharedInternetAccess = enableSharedInternetAccess;
    return this;
  }

   /**
   * Get enableSharedInternetAccess
   * @return enableSharedInternetAccess
  **/
  @Schema(description = "")
  public Boolean isEnableSharedInternetAccess() {
    return enableSharedInternetAccess;
  }

  public void setEnableSharedInternetAccess(Boolean enableSharedInternetAccess) {
    this.enableSharedInternetAccess = enableSharedInternetAccess;
  }

  public VpcConfigForListRevisionsOutput enableVpc(Boolean enableVpc) {
    this.enableVpc = enableVpc;
    return this;
  }

   /**
   * Get enableVpc
   * @return enableVpc
  **/
  @Schema(description = "")
  public Boolean isEnableVpc() {
    return enableVpc;
  }

  public void setEnableVpc(Boolean enableVpc) {
    this.enableVpc = enableVpc;
  }

  public VpcConfigForListRevisionsOutput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public VpcConfigForListRevisionsOutput addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public VpcConfigForListRevisionsOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public VpcConfigForListRevisionsOutput addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public VpcConfigForListRevisionsOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcConfigForListRevisionsOutput vpcConfigForListRevisionsOutput = (VpcConfigForListRevisionsOutput) o;
    return Objects.equals(this.enableSharedInternetAccess, vpcConfigForListRevisionsOutput.enableSharedInternetAccess) &&
        Objects.equals(this.enableVpc, vpcConfigForListRevisionsOutput.enableVpc) &&
        Objects.equals(this.securityGroupIds, vpcConfigForListRevisionsOutput.securityGroupIds) &&
        Objects.equals(this.subnetIds, vpcConfigForListRevisionsOutput.subnetIds) &&
        Objects.equals(this.vpcId, vpcConfigForListRevisionsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSharedInternetAccess, enableVpc, securityGroupIds, subnetIds, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcConfigForListRevisionsOutput {\n");
    
    sb.append("    enableSharedInternetAccess: ").append(toIndentedString(enableSharedInternetAccess)).append("\n");
    sb.append("    enableVpc: ").append(toIndentedString(enableVpc)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
