/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * DescribePrivateLinkGatewayAttributesResponse
 */



public class DescribePrivateLinkGatewayAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("NetworkInterfaceIp")
  private String networkInterfaceIp = null;

  @SerializedName("PrivateLinkGatewayId")
  private String privateLinkGatewayId = null;

  @SerializedName("PrivateLinkGatewayName")
  private String privateLinkGatewayName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribePrivateLinkGatewayAttributesResponse businessStatus(String businessStatus) {
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

  public DescribePrivateLinkGatewayAttributesResponse creationTime(String creationTime) {
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

  public DescribePrivateLinkGatewayAttributesResponse deletedTime(String deletedTime) {
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

  public DescribePrivateLinkGatewayAttributesResponse description(String description) {
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

  public DescribePrivateLinkGatewayAttributesResponse networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public DescribePrivateLinkGatewayAttributesResponse networkInterfaceIp(String networkInterfaceIp) {
    this.networkInterfaceIp = networkInterfaceIp;
    return this;
  }

   /**
   * Get networkInterfaceIp
   * @return networkInterfaceIp
  **/
  @Schema(description = "")
  public String getNetworkInterfaceIp() {
    return networkInterfaceIp;
  }

  public void setNetworkInterfaceIp(String networkInterfaceIp) {
    this.networkInterfaceIp = networkInterfaceIp;
  }

  public DescribePrivateLinkGatewayAttributesResponse privateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
    return this;
  }

   /**
   * Get privateLinkGatewayId
   * @return privateLinkGatewayId
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayId() {
    return privateLinkGatewayId;
  }

  public void setPrivateLinkGatewayId(String privateLinkGatewayId) {
    this.privateLinkGatewayId = privateLinkGatewayId;
  }

  public DescribePrivateLinkGatewayAttributesResponse privateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
    return this;
  }

   /**
   * Get privateLinkGatewayName
   * @return privateLinkGatewayName
  **/
  @Schema(description = "")
  public String getPrivateLinkGatewayName() {
    return privateLinkGatewayName;
  }

  public void setPrivateLinkGatewayName(String privateLinkGatewayName) {
    this.privateLinkGatewayName = privateLinkGatewayName;
  }

  public DescribePrivateLinkGatewayAttributesResponse requestId(String requestId) {
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

  public DescribePrivateLinkGatewayAttributesResponse status(String status) {
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

  public DescribePrivateLinkGatewayAttributesResponse subnetId(String subnetId) {
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

  public DescribePrivateLinkGatewayAttributesResponse updateTime(String updateTime) {
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

  public DescribePrivateLinkGatewayAttributesResponse vpcId(String vpcId) {
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

  public DescribePrivateLinkGatewayAttributesResponse zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribePrivateLinkGatewayAttributesResponse describePrivateLinkGatewayAttributesResponse = (DescribePrivateLinkGatewayAttributesResponse) o;
    return Objects.equals(this.businessStatus, describePrivateLinkGatewayAttributesResponse.businessStatus) &&
        Objects.equals(this.creationTime, describePrivateLinkGatewayAttributesResponse.creationTime) &&
        Objects.equals(this.deletedTime, describePrivateLinkGatewayAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describePrivateLinkGatewayAttributesResponse.description) &&
        Objects.equals(this.networkInterfaceId, describePrivateLinkGatewayAttributesResponse.networkInterfaceId) &&
        Objects.equals(this.networkInterfaceIp, describePrivateLinkGatewayAttributesResponse.networkInterfaceIp) &&
        Objects.equals(this.privateLinkGatewayId, describePrivateLinkGatewayAttributesResponse.privateLinkGatewayId) &&
        Objects.equals(this.privateLinkGatewayName, describePrivateLinkGatewayAttributesResponse.privateLinkGatewayName) &&
        Objects.equals(this.requestId, describePrivateLinkGatewayAttributesResponse.requestId) &&
        Objects.equals(this.status, describePrivateLinkGatewayAttributesResponse.status) &&
        Objects.equals(this.subnetId, describePrivateLinkGatewayAttributesResponse.subnetId) &&
        Objects.equals(this.updateTime, describePrivateLinkGatewayAttributesResponse.updateTime) &&
        Objects.equals(this.vpcId, describePrivateLinkGatewayAttributesResponse.vpcId) &&
        Objects.equals(this.zoneId, describePrivateLinkGatewayAttributesResponse.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, creationTime, deletedTime, description, networkInterfaceId, networkInterfaceIp, privateLinkGatewayId, privateLinkGatewayName, requestId, status, subnetId, updateTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePrivateLinkGatewayAttributesResponse {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfaceIp: ").append(toIndentedString(networkInterfaceIp)).append("\n");
    sb.append("    privateLinkGatewayId: ").append(toIndentedString(privateLinkGatewayId)).append("\n");
    sb.append("    privateLinkGatewayName: ").append(toIndentedString(privateLinkGatewayName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
