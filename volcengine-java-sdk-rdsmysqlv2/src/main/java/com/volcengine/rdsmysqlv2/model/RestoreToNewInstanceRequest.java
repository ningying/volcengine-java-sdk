/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ChargeInfoForRestoreToNewInstanceInput;
import com.volcengine.rdsmysqlv2.model.InstanceTagForRestoreToNewInstanceInput;
import com.volcengine.rdsmysqlv2.model.NodeInfoForRestoreToNewInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RestoreToNewInstanceRequest
 */



public class RestoreToNewInstanceRequest {
  @SerializedName("AllowListIds")
  private List<String> allowListIds = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("ChargeInfo")
  private ChargeInfoForRestoreToNewInstanceInput chargeInfo = null;

  @SerializedName("DBParamGroupId")
  private String dbParamGroupId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTags")
  private List<InstanceTagForRestoreToNewInstanceInput> instanceTags = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForRestoreToNewInstanceInput> nodeInfo = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RestoreTime")
  private String restoreTime = null;

  @SerializedName("SrcInstanceId")
  private String srcInstanceId = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public RestoreToNewInstanceRequest allowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
    return this;
  }

  public RestoreToNewInstanceRequest addAllowListIdsItem(String allowListIdsItem) {
    if (this.allowListIds == null) {
      this.allowListIds = new ArrayList<String>();
    }
    this.allowListIds.add(allowListIdsItem);
    return this;
  }

   /**
   * Get allowListIds
   * @return allowListIds
  **/
  @Schema(description = "")
  public List<String> getAllowListIds() {
    return allowListIds;
  }

  public void setAllowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
  }

  public RestoreToNewInstanceRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public RestoreToNewInstanceRequest chargeInfo(ChargeInfoForRestoreToNewInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
    return this;
  }

   /**
   * Get chargeInfo
   * @return chargeInfo
  **/
  @Valid
  @Schema(description = "")
  public ChargeInfoForRestoreToNewInstanceInput getChargeInfo() {
    return chargeInfo;
  }

  public void setChargeInfo(ChargeInfoForRestoreToNewInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
  }

  public RestoreToNewInstanceRequest dbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
    return this;
  }

   /**
   * Get dbParamGroupId
   * @return dbParamGroupId
  **/
  @Schema(description = "")
  public String getDbParamGroupId() {
    return dbParamGroupId;
  }

  public void setDbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
  }

  public RestoreToNewInstanceRequest instanceName(String instanceName) {
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

  public RestoreToNewInstanceRequest instanceTags(List<InstanceTagForRestoreToNewInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
    return this;
  }

  public RestoreToNewInstanceRequest addInstanceTagsItem(InstanceTagForRestoreToNewInstanceInput instanceTagsItem) {
    if (this.instanceTags == null) {
      this.instanceTags = new ArrayList<InstanceTagForRestoreToNewInstanceInput>();
    }
    this.instanceTags.add(instanceTagsItem);
    return this;
  }

   /**
   * Get instanceTags
   * @return instanceTags
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceTagForRestoreToNewInstanceInput> getInstanceTags() {
    return instanceTags;
  }

  public void setInstanceTags(List<InstanceTagForRestoreToNewInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
  }

  public RestoreToNewInstanceRequest nodeInfo(List<NodeInfoForRestoreToNewInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public RestoreToNewInstanceRequest addNodeInfoItem(NodeInfoForRestoreToNewInstanceInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForRestoreToNewInstanceInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForRestoreToNewInstanceInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForRestoreToNewInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public RestoreToNewInstanceRequest port(Integer port) {
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

  public RestoreToNewInstanceRequest projectName(String projectName) {
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

  public RestoreToNewInstanceRequest restoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Get restoreTime
   * @return restoreTime
  **/
  @Schema(description = "")
  public String getRestoreTime() {
    return restoreTime;
  }

  public void setRestoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
  }

  public RestoreToNewInstanceRequest srcInstanceId(String srcInstanceId) {
    this.srcInstanceId = srcInstanceId;
    return this;
  }

   /**
   * Get srcInstanceId
   * @return srcInstanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSrcInstanceId() {
    return srcInstanceId;
  }

  public void setSrcInstanceId(String srcInstanceId) {
    this.srcInstanceId = srcInstanceId;
  }

  public RestoreToNewInstanceRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public RestoreToNewInstanceRequest storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public RestoreToNewInstanceRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public RestoreToNewInstanceRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    RestoreToNewInstanceRequest restoreToNewInstanceRequest = (RestoreToNewInstanceRequest) o;
    return Objects.equals(this.allowListIds, restoreToNewInstanceRequest.allowListIds) &&
        Objects.equals(this.backupId, restoreToNewInstanceRequest.backupId) &&
        Objects.equals(this.chargeInfo, restoreToNewInstanceRequest.chargeInfo) &&
        Objects.equals(this.dbParamGroupId, restoreToNewInstanceRequest.dbParamGroupId) &&
        Objects.equals(this.instanceName, restoreToNewInstanceRequest.instanceName) &&
        Objects.equals(this.instanceTags, restoreToNewInstanceRequest.instanceTags) &&
        Objects.equals(this.nodeInfo, restoreToNewInstanceRequest.nodeInfo) &&
        Objects.equals(this.port, restoreToNewInstanceRequest.port) &&
        Objects.equals(this.projectName, restoreToNewInstanceRequest.projectName) &&
        Objects.equals(this.restoreTime, restoreToNewInstanceRequest.restoreTime) &&
        Objects.equals(this.srcInstanceId, restoreToNewInstanceRequest.srcInstanceId) &&
        Objects.equals(this.storageSpace, restoreToNewInstanceRequest.storageSpace) &&
        Objects.equals(this.storageType, restoreToNewInstanceRequest.storageType) &&
        Objects.equals(this.subnetId, restoreToNewInstanceRequest.subnetId) &&
        Objects.equals(this.vpcId, restoreToNewInstanceRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListIds, backupId, chargeInfo, dbParamGroupId, instanceName, instanceTags, nodeInfo, port, projectName, restoreTime, srcInstanceId, storageSpace, storageType, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreToNewInstanceRequest {\n");
    
    sb.append("    allowListIds: ").append(toIndentedString(allowListIds)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
    sb.append("    dbParamGroupId: ").append(toIndentedString(dbParamGroupId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTags: ").append(toIndentedString(instanceTags)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    srcInstanceId: ").append(toIndentedString(srcInstanceId)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
