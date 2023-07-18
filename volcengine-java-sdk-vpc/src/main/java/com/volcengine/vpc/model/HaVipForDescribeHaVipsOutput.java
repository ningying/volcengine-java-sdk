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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HaVipForDescribeHaVipsOutput
 */



public class HaVipForDescribeHaVipsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AssociatedEipAddress")
  private String associatedEipAddress = null;

  @SerializedName("AssociatedEipId")
  private String associatedEipId = null;

  @SerializedName("AssociatedInstanceIds")
  private List<String> associatedInstanceIds = null;

  @SerializedName("AssociatedInstanceType")
  private String associatedInstanceType = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HaVipId")
  private String haVipId = null;

  @SerializedName("HaVipName")
  private String haVipName = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("MasterInstanceId")
  private String masterInstanceId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public HaVipForDescribeHaVipsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public HaVipForDescribeHaVipsOutput associatedEipAddress(String associatedEipAddress) {
    this.associatedEipAddress = associatedEipAddress;
    return this;
  }

   /**
   * Get associatedEipAddress
   * @return associatedEipAddress
  **/
  @Schema(description = "")
  public String getAssociatedEipAddress() {
    return associatedEipAddress;
  }

  public void setAssociatedEipAddress(String associatedEipAddress) {
    this.associatedEipAddress = associatedEipAddress;
  }

  public HaVipForDescribeHaVipsOutput associatedEipId(String associatedEipId) {
    this.associatedEipId = associatedEipId;
    return this;
  }

   /**
   * Get associatedEipId
   * @return associatedEipId
  **/
  @Schema(description = "")
  public String getAssociatedEipId() {
    return associatedEipId;
  }

  public void setAssociatedEipId(String associatedEipId) {
    this.associatedEipId = associatedEipId;
  }

  public HaVipForDescribeHaVipsOutput associatedInstanceIds(List<String> associatedInstanceIds) {
    this.associatedInstanceIds = associatedInstanceIds;
    return this;
  }

  public HaVipForDescribeHaVipsOutput addAssociatedInstanceIdsItem(String associatedInstanceIdsItem) {
    if (this.associatedInstanceIds == null) {
      this.associatedInstanceIds = new ArrayList<String>();
    }
    this.associatedInstanceIds.add(associatedInstanceIdsItem);
    return this;
  }

   /**
   * Get associatedInstanceIds
   * @return associatedInstanceIds
  **/
  @Schema(description = "")
  public List<String> getAssociatedInstanceIds() {
    return associatedInstanceIds;
  }

  public void setAssociatedInstanceIds(List<String> associatedInstanceIds) {
    this.associatedInstanceIds = associatedInstanceIds;
  }

  public HaVipForDescribeHaVipsOutput associatedInstanceType(String associatedInstanceType) {
    this.associatedInstanceType = associatedInstanceType;
    return this;
  }

   /**
   * Get associatedInstanceType
   * @return associatedInstanceType
  **/
  @Schema(description = "")
  public String getAssociatedInstanceType() {
    return associatedInstanceType;
  }

  public void setAssociatedInstanceType(String associatedInstanceType) {
    this.associatedInstanceType = associatedInstanceType;
  }

  public HaVipForDescribeHaVipsOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public HaVipForDescribeHaVipsOutput description(String description) {
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

  public HaVipForDescribeHaVipsOutput haVipId(String haVipId) {
    this.haVipId = haVipId;
    return this;
  }

   /**
   * Get haVipId
   * @return haVipId
  **/
  @Schema(description = "")
  public String getHaVipId() {
    return haVipId;
  }

  public void setHaVipId(String haVipId) {
    this.haVipId = haVipId;
  }

  public HaVipForDescribeHaVipsOutput haVipName(String haVipName) {
    this.haVipName = haVipName;
    return this;
  }

   /**
   * Get haVipName
   * @return haVipName
  **/
  @Schema(description = "")
  public String getHaVipName() {
    return haVipName;
  }

  public void setHaVipName(String haVipName) {
    this.haVipName = haVipName;
  }

  public HaVipForDescribeHaVipsOutput ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public HaVipForDescribeHaVipsOutput masterInstanceId(String masterInstanceId) {
    this.masterInstanceId = masterInstanceId;
    return this;
  }

   /**
   * Get masterInstanceId
   * @return masterInstanceId
  **/
  @Schema(description = "")
  public String getMasterInstanceId() {
    return masterInstanceId;
  }

  public void setMasterInstanceId(String masterInstanceId) {
    this.masterInstanceId = masterInstanceId;
  }

  public HaVipForDescribeHaVipsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HaVipForDescribeHaVipsOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public HaVipForDescribeHaVipsOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public HaVipForDescribeHaVipsOutput vpcId(String vpcId) {
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
    HaVipForDescribeHaVipsOutput haVipForDescribeHaVipsOutput = (HaVipForDescribeHaVipsOutput) o;
    return Objects.equals(this.accountId, haVipForDescribeHaVipsOutput.accountId) &&
        Objects.equals(this.associatedEipAddress, haVipForDescribeHaVipsOutput.associatedEipAddress) &&
        Objects.equals(this.associatedEipId, haVipForDescribeHaVipsOutput.associatedEipId) &&
        Objects.equals(this.associatedInstanceIds, haVipForDescribeHaVipsOutput.associatedInstanceIds) &&
        Objects.equals(this.associatedInstanceType, haVipForDescribeHaVipsOutput.associatedInstanceType) &&
        Objects.equals(this.createdAt, haVipForDescribeHaVipsOutput.createdAt) &&
        Objects.equals(this.description, haVipForDescribeHaVipsOutput.description) &&
        Objects.equals(this.haVipId, haVipForDescribeHaVipsOutput.haVipId) &&
        Objects.equals(this.haVipName, haVipForDescribeHaVipsOutput.haVipName) &&
        Objects.equals(this.ipAddress, haVipForDescribeHaVipsOutput.ipAddress) &&
        Objects.equals(this.masterInstanceId, haVipForDescribeHaVipsOutput.masterInstanceId) &&
        Objects.equals(this.status, haVipForDescribeHaVipsOutput.status) &&
        Objects.equals(this.subnetId, haVipForDescribeHaVipsOutput.subnetId) &&
        Objects.equals(this.updatedAt, haVipForDescribeHaVipsOutput.updatedAt) &&
        Objects.equals(this.vpcId, haVipForDescribeHaVipsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, associatedEipAddress, associatedEipId, associatedInstanceIds, associatedInstanceType, createdAt, description, haVipId, haVipName, ipAddress, masterInstanceId, status, subnetId, updatedAt, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HaVipForDescribeHaVipsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    associatedEipAddress: ").append(toIndentedString(associatedEipAddress)).append("\n");
    sb.append("    associatedEipId: ").append(toIndentedString(associatedEipId)).append("\n");
    sb.append("    associatedInstanceIds: ").append(toIndentedString(associatedInstanceIds)).append("\n");
    sb.append("    associatedInstanceType: ").append(toIndentedString(associatedInstanceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    haVipId: ").append(toIndentedString(haVipId)).append("\n");
    sb.append("    haVipName: ").append(toIndentedString(haVipName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    masterInstanceId: ").append(toIndentedString(masterInstanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
