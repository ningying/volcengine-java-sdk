/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * CreateDBInstanceRequest
 */


public class CreateDBInstanceRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("DeletionProtection")
  private String deletionProtection = null;

  @SerializedName("EngineVersion")
  private String engineVersion = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("PurchaseMonths")
  private Integer purchaseMonths = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ShardCapacity")
  private Long shardCapacity = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("ShardedCluster")
  private Integer shardedCluster = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public CreateDBInstanceRequest autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public CreateDBInstanceRequest chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public CreateDBInstanceRequest clientToken(String clientToken) {
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

  public CreateDBInstanceRequest deletionProtection(String deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

   /**
   * Get deletionProtection
   * @return deletionProtection
  **/
  @Schema(description = "")
  public String getDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(String deletionProtection) {
    this.deletionProtection = deletionProtection;
  }

  public CreateDBInstanceRequest engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

   /**
   * Get engineVersion
   * @return engineVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public CreateDBInstanceRequest instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public CreateDBInstanceRequest nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Get nodeNumber
   * @return nodeNumber
  **/
  @Schema(description = "")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public CreateDBInstanceRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateDBInstanceRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CreateDBInstanceRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateDBInstanceRequest purchaseMonths(Integer purchaseMonths) {
    this.purchaseMonths = purchaseMonths;
    return this;
  }

   /**
   * Get purchaseMonths
   * @return purchaseMonths
  **/
  @Schema(description = "")
  public Integer getPurchaseMonths() {
    return purchaseMonths;
  }

  public void setPurchaseMonths(Integer purchaseMonths) {
    this.purchaseMonths = purchaseMonths;
  }

  public CreateDBInstanceRequest regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public CreateDBInstanceRequest shardCapacity(Long shardCapacity) {
    this.shardCapacity = shardCapacity;
    return this;
  }

   /**
   * Get shardCapacity
   * @return shardCapacity
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getShardCapacity() {
    return shardCapacity;
  }

  public void setShardCapacity(Long shardCapacity) {
    this.shardCapacity = shardCapacity;
  }

  public CreateDBInstanceRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @Schema(description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }

  public CreateDBInstanceRequest shardedCluster(Integer shardedCluster) {
    this.shardedCluster = shardedCluster;
    return this;
  }

   /**
   * Get shardedCluster
   * @return shardedCluster
  **/
  @Schema(description = "")
  public Integer getShardedCluster() {
    return shardedCluster;
  }

  public void setShardedCluster(Integer shardedCluster) {
    this.shardedCluster = shardedCluster;
  }

  public CreateDBInstanceRequest subnetId(String subnetId) {
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

  public CreateDBInstanceRequest vpcId(String vpcId) {
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

  public CreateDBInstanceRequest zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public CreateDBInstanceRequest addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBInstanceRequest createDBInstanceRequest = (CreateDBInstanceRequest) o;
    return Objects.equals(this.autoRenew, createDBInstanceRequest.autoRenew) &&
        Objects.equals(this.chargeType, createDBInstanceRequest.chargeType) &&
        Objects.equals(this.clientToken, createDBInstanceRequest.clientToken) &&
        Objects.equals(this.deletionProtection, createDBInstanceRequest.deletionProtection) &&
        Objects.equals(this.engineVersion, createDBInstanceRequest.engineVersion) &&
        Objects.equals(this.instanceName, createDBInstanceRequest.instanceName) &&
        Objects.equals(this.nodeNumber, createDBInstanceRequest.nodeNumber) &&
        Objects.equals(this.password, createDBInstanceRequest.password) &&
        Objects.equals(this.port, createDBInstanceRequest.port) &&
        Objects.equals(this.projectName, createDBInstanceRequest.projectName) &&
        Objects.equals(this.purchaseMonths, createDBInstanceRequest.purchaseMonths) &&
        Objects.equals(this.regionId, createDBInstanceRequest.regionId) &&
        Objects.equals(this.shardCapacity, createDBInstanceRequest.shardCapacity) &&
        Objects.equals(this.shardNumber, createDBInstanceRequest.shardNumber) &&
        Objects.equals(this.shardedCluster, createDBInstanceRequest.shardedCluster) &&
        Objects.equals(this.subnetId, createDBInstanceRequest.subnetId) &&
        Objects.equals(this.vpcId, createDBInstanceRequest.vpcId) &&
        Objects.equals(this.zoneIds, createDBInstanceRequest.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeType, clientToken, deletionProtection, engineVersion, instanceName, nodeNumber, password, port, projectName, purchaseMonths, regionId, shardCapacity, shardNumber, shardedCluster, subnetId, vpcId, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    purchaseMonths: ").append(toIndentedString(purchaseMonths)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    shardCapacity: ").append(toIndentedString(shardCapacity)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    shardedCluster: ").append(toIndentedString(shardedCluster)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
