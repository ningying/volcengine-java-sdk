/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput
 */


public class SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectAccessPointId")
  private String directConnectAccessPointId = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("LineOperator")
  private String lineOperator = null;

  @SerializedName("ParentConnectionId")
  private String parentConnectionId = null;

  @SerializedName("PortSpec")
  private String portSpec = null;

  @SerializedName("PortType")
  private String portType = null;

  @SerializedName("SharedDirectConnectConnectionId")
  private String sharedDirectConnectConnectionId = null;

  @SerializedName("SharedDirectConnectConnectionName")
  private String sharedDirectConnectConnectionName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("UserAccountId")
  private String userAccountId = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput accountId(String accountId) {
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

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput description(String description) {
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

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput directConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
    return this;
  }

   /**
   * Get directConnectAccessPointId
   * @return directConnectAccessPointId
  **/
  @Schema(description = "")
  public String getDirectConnectAccessPointId() {
    return directConnectAccessPointId;
  }

  public void setDirectConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput lineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
    return this;
  }

   /**
   * Get lineOperator
   * @return lineOperator
  **/
  @Schema(description = "")
  public String getLineOperator() {
    return lineOperator;
  }

  public void setLineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput parentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
    return this;
  }

   /**
   * Get parentConnectionId
   * @return parentConnectionId
  **/
  @Schema(description = "")
  public String getParentConnectionId() {
    return parentConnectionId;
  }

  public void setParentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput portSpec(String portSpec) {
    this.portSpec = portSpec;
    return this;
  }

   /**
   * Get portSpec
   * @return portSpec
  **/
  @Schema(description = "")
  public String getPortSpec() {
    return portSpec;
  }

  public void setPortSpec(String portSpec) {
    this.portSpec = portSpec;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @Schema(description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput sharedDirectConnectConnectionId(String sharedDirectConnectConnectionId) {
    this.sharedDirectConnectConnectionId = sharedDirectConnectConnectionId;
    return this;
  }

   /**
   * Get sharedDirectConnectConnectionId
   * @return sharedDirectConnectConnectionId
  **/
  @Schema(description = "")
  public String getSharedDirectConnectConnectionId() {
    return sharedDirectConnectConnectionId;
  }

  public void setSharedDirectConnectConnectionId(String sharedDirectConnectConnectionId) {
    this.sharedDirectConnectConnectionId = sharedDirectConnectConnectionId;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput sharedDirectConnectConnectionName(String sharedDirectConnectConnectionName) {
    this.sharedDirectConnectConnectionName = sharedDirectConnectConnectionName;
    return this;
  }

   /**
   * Get sharedDirectConnectConnectionName
   * @return sharedDirectConnectConnectionName
  **/
  @Schema(description = "")
  public String getSharedDirectConnectConnectionName() {
    return sharedDirectConnectConnectionName;
  }

  public void setSharedDirectConnectConnectionName(String sharedDirectConnectConnectionName) {
    this.sharedDirectConnectConnectionName = sharedDirectConnectConnectionName;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput status(String status) {
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

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * Get userAccountId
   * @return userAccountId
  **/
  @Schema(description = "")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput = (SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput) o;
    return Objects.equals(this.accountId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.accountId) &&
        Objects.equals(this.bandwidth, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.bandwidth) &&
        Objects.equals(this.billingType, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.billingType) &&
        Objects.equals(this.businessStatus, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.businessStatus) &&
        Objects.equals(this.creationTime, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.creationTime) &&
        Objects.equals(this.deletedTime, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.deletedTime) &&
        Objects.equals(this.description, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.description) &&
        Objects.equals(this.directConnectAccessPointId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.directConnectAccessPointId) &&
        Objects.equals(this.expiredTime, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.expiredTime) &&
        Objects.equals(this.lineOperator, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.lineOperator) &&
        Objects.equals(this.parentConnectionId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.parentConnectionId) &&
        Objects.equals(this.portSpec, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.portSpec) &&
        Objects.equals(this.portType, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.portType) &&
        Objects.equals(this.sharedDirectConnectConnectionId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.sharedDirectConnectConnectionId) &&
        Objects.equals(this.sharedDirectConnectConnectionName, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.sharedDirectConnectConnectionName) &&
        Objects.equals(this.status, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.status) &&
        Objects.equals(this.updateTime, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.updateTime) &&
        Objects.equals(this.userAccountId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.userAccountId) &&
        Objects.equals(this.vlanId, sharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, billingType, businessStatus, creationTime, deletedTime, description, directConnectAccessPointId, expiredTime, lineOperator, parentConnectionId, portSpec, portType, sharedDirectConnectConnectionId, sharedDirectConnectConnectionName, status, updateTime, userAccountId, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDirectConnectConnectionForDescribeSharedDirectConnectConnectionsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectAccessPointId: ").append(toIndentedString(directConnectAccessPointId)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    lineOperator: ").append(toIndentedString(lineOperator)).append("\n");
    sb.append("    parentConnectionId: ").append(toIndentedString(parentConnectionId)).append("\n");
    sb.append("    portSpec: ").append(toIndentedString(portSpec)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    sharedDirectConnectConnectionId: ").append(toIndentedString(sharedDirectConnectConnectionId)).append("\n");
    sb.append("    sharedDirectConnectConnectionName: ").append(toIndentedString(sharedDirectConnectConnectionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
