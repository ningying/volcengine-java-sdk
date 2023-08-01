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
import com.volcengine.rdsmysqlv2.model.AddressObjectForDescribeDBInstancesOutput;
import com.volcengine.rdsmysqlv2.model.ChargeDetailForDescribeDBInstancesOutput;
import com.volcengine.rdsmysqlv2.model.MaintenanceWindowForDescribeDBInstancesOutput;
import com.volcengine.rdsmysqlv2.model.NodeDetailInfoForDescribeDBInstancesOutput;
import com.volcengine.rdsmysqlv2.model.TagForDescribeDBInstancesOutput;
import com.volcengine.rdsmysqlv2.model.ZoneNodePoolForDescribeDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstancesInfoForDescribeDBInstancesOutput
 */


public class InstancesInfoForDescribeDBInstancesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AddressObject")
  private List<AddressObjectForDescribeDBInstancesOutput> addressObject = null;

  @SerializedName("AllowListVersion")
  private String allowListVersion = null;

  @SerializedName("ChargeDetail")
  private ChargeDetailForDescribeDBInstancesOutput chargeDetail = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("LowerCaseTableNames")
  private String lowerCaseTableNames = null;

  @SerializedName("MaintenanceWindow")
  private MaintenanceWindowForDescribeDBInstancesOutput maintenanceWindow = null;

  @SerializedName("NodeDetailInfo")
  private List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ServerCollation")
  private String serverCollation = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeDBInstancesOutput> tags = null;

  @SerializedName("TimeZone")
  private String timeZone = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  @SerializedName("ZoneNodePools")
  private List<ZoneNodePoolForDescribeDBInstancesOutput> zoneNodePools = null;

  public InstancesInfoForDescribeDBInstancesOutput accountId(String accountId) {
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

  public InstancesInfoForDescribeDBInstancesOutput addressObject(List<AddressObjectForDescribeDBInstancesOutput> addressObject) {
    this.addressObject = addressObject;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addAddressObjectItem(AddressObjectForDescribeDBInstancesOutput addressObjectItem) {
    if (this.addressObject == null) {
      this.addressObject = new ArrayList<AddressObjectForDescribeDBInstancesOutput>();
    }
    this.addressObject.add(addressObjectItem);
    return this;
  }

   /**
   * Get addressObject
   * @return addressObject
  **/
  @Valid
  @Schema(description = "")
  public List<AddressObjectForDescribeDBInstancesOutput> getAddressObject() {
    return addressObject;
  }

  public void setAddressObject(List<AddressObjectForDescribeDBInstancesOutput> addressObject) {
    this.addressObject = addressObject;
  }

  public InstancesInfoForDescribeDBInstancesOutput allowListVersion(String allowListVersion) {
    this.allowListVersion = allowListVersion;
    return this;
  }

   /**
   * Get allowListVersion
   * @return allowListVersion
  **/
  @Schema(description = "")
  public String getAllowListVersion() {
    return allowListVersion;
  }

  public void setAllowListVersion(String allowListVersion) {
    this.allowListVersion = allowListVersion;
  }

  public InstancesInfoForDescribeDBInstancesOutput chargeDetail(ChargeDetailForDescribeDBInstancesOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

   /**
   * Get chargeDetail
   * @return chargeDetail
  **/
  @Valid
  @Schema(description = "")
  public ChargeDetailForDescribeDBInstancesOutput getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetailForDescribeDBInstancesOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public InstancesInfoForDescribeDBInstancesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public InstancesInfoForDescribeDBInstancesOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceName(String instanceName) {
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

  public InstancesInfoForDescribeDBInstancesOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public InstancesInfoForDescribeDBInstancesOutput lowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
    return this;
  }

   /**
   * Get lowerCaseTableNames
   * @return lowerCaseTableNames
  **/
  @Schema(description = "")
  public String getLowerCaseTableNames() {
    return lowerCaseTableNames;
  }

  public void setLowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
  }

  public InstancesInfoForDescribeDBInstancesOutput maintenanceWindow(MaintenanceWindowForDescribeDBInstancesOutput maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @Valid
  @Schema(description = "")
  public MaintenanceWindowForDescribeDBInstancesOutput getMaintenanceWindow() {
    return maintenanceWindow;
  }

  public void setMaintenanceWindow(MaintenanceWindowForDescribeDBInstancesOutput maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }

  public InstancesInfoForDescribeDBInstancesOutput nodeDetailInfo(List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addNodeDetailInfoItem(NodeDetailInfoForDescribeDBInstancesOutput nodeDetailInfoItem) {
    if (this.nodeDetailInfo == null) {
      this.nodeDetailInfo = new ArrayList<NodeDetailInfoForDescribeDBInstancesOutput>();
    }
    this.nodeDetailInfo.add(nodeDetailInfoItem);
    return this;
  }

   /**
   * Get nodeDetailInfo
   * @return nodeDetailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeDetailInfoForDescribeDBInstancesOutput> getNodeDetailInfo() {
    return nodeDetailInfo;
  }

  public void setNodeDetailInfo(List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
  }

  public InstancesInfoForDescribeDBInstancesOutput nodeNumber(Integer nodeNumber) {
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

  public InstancesInfoForDescribeDBInstancesOutput nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public InstancesInfoForDescribeDBInstancesOutput port(String port) {
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

  public InstancesInfoForDescribeDBInstancesOutput projectName(String projectName) {
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

  public InstancesInfoForDescribeDBInstancesOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public InstancesInfoForDescribeDBInstancesOutput serverCollation(String serverCollation) {
    this.serverCollation = serverCollation;
    return this;
  }

   /**
   * Get serverCollation
   * @return serverCollation
  **/
  @Schema(description = "")
  public String getServerCollation() {
    return serverCollation;
  }

  public void setServerCollation(String serverCollation) {
    this.serverCollation = serverCollation;
  }

  public InstancesInfoForDescribeDBInstancesOutput shardNumber(Integer shardNumber) {
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

  public InstancesInfoForDescribeDBInstancesOutput storageSpace(Integer storageSpace) {
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

  public InstancesInfoForDescribeDBInstancesOutput storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @Schema(description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public InstancesInfoForDescribeDBInstancesOutput subnetId(String subnetId) {
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

  public InstancesInfoForDescribeDBInstancesOutput tags(List<TagForDescribeDBInstancesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addTagsItem(TagForDescribeDBInstancesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDBInstancesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeDBInstancesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDBInstancesOutput> tags) {
    this.tags = tags;
  }

  public InstancesInfoForDescribeDBInstancesOutput timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public InstancesInfoForDescribeDBInstancesOutput vpcId(String vpcId) {
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

  public InstancesInfoForDescribeDBInstancesOutput zoneId(String zoneId) {
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

  public InstancesInfoForDescribeDBInstancesOutput zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addZoneIdsItem(String zoneIdsItem) {
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

  public InstancesInfoForDescribeDBInstancesOutput zoneNodePools(List<ZoneNodePoolForDescribeDBInstancesOutput> zoneNodePools) {
    this.zoneNodePools = zoneNodePools;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addZoneNodePoolsItem(ZoneNodePoolForDescribeDBInstancesOutput zoneNodePoolsItem) {
    if (this.zoneNodePools == null) {
      this.zoneNodePools = new ArrayList<ZoneNodePoolForDescribeDBInstancesOutput>();
    }
    this.zoneNodePools.add(zoneNodePoolsItem);
    return this;
  }

   /**
   * Get zoneNodePools
   * @return zoneNodePools
  **/
  @Valid
  @Schema(description = "")
  public List<ZoneNodePoolForDescribeDBInstancesOutput> getZoneNodePools() {
    return zoneNodePools;
  }

  public void setZoneNodePools(List<ZoneNodePoolForDescribeDBInstancesOutput> zoneNodePools) {
    this.zoneNodePools = zoneNodePools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancesInfoForDescribeDBInstancesOutput instancesInfoForDescribeDBInstancesOutput = (InstancesInfoForDescribeDBInstancesOutput) o;
    return Objects.equals(this.accountId, instancesInfoForDescribeDBInstancesOutput.accountId) &&
        Objects.equals(this.addressObject, instancesInfoForDescribeDBInstancesOutput.addressObject) &&
        Objects.equals(this.allowListVersion, instancesInfoForDescribeDBInstancesOutput.allowListVersion) &&
        Objects.equals(this.chargeDetail, instancesInfoForDescribeDBInstancesOutput.chargeDetail) &&
        Objects.equals(this.createTime, instancesInfoForDescribeDBInstancesOutput.createTime) &&
        Objects.equals(this.dbEngineVersion, instancesInfoForDescribeDBInstancesOutput.dbEngineVersion) &&
        Objects.equals(this.instanceId, instancesInfoForDescribeDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, instancesInfoForDescribeDBInstancesOutput.instanceName) &&
        Objects.equals(this.instanceStatus, instancesInfoForDescribeDBInstancesOutput.instanceStatus) &&
        Objects.equals(this.instanceType, instancesInfoForDescribeDBInstancesOutput.instanceType) &&
        Objects.equals(this.lowerCaseTableNames, instancesInfoForDescribeDBInstancesOutput.lowerCaseTableNames) &&
        Objects.equals(this.maintenanceWindow, instancesInfoForDescribeDBInstancesOutput.maintenanceWindow) &&
        Objects.equals(this.nodeDetailInfo, instancesInfoForDescribeDBInstancesOutput.nodeDetailInfo) &&
        Objects.equals(this.nodeNumber, instancesInfoForDescribeDBInstancesOutput.nodeNumber) &&
        Objects.equals(this.nodeSpec, instancesInfoForDescribeDBInstancesOutput.nodeSpec) &&
        Objects.equals(this.port, instancesInfoForDescribeDBInstancesOutput.port) &&
        Objects.equals(this.projectName, instancesInfoForDescribeDBInstancesOutput.projectName) &&
        Objects.equals(this.regionId, instancesInfoForDescribeDBInstancesOutput.regionId) &&
        Objects.equals(this.serverCollation, instancesInfoForDescribeDBInstancesOutput.serverCollation) &&
        Objects.equals(this.shardNumber, instancesInfoForDescribeDBInstancesOutput.shardNumber) &&
        Objects.equals(this.storageSpace, instancesInfoForDescribeDBInstancesOutput.storageSpace) &&
        Objects.equals(this.storageType, instancesInfoForDescribeDBInstancesOutput.storageType) &&
        Objects.equals(this.subnetId, instancesInfoForDescribeDBInstancesOutput.subnetId) &&
        Objects.equals(this.tags, instancesInfoForDescribeDBInstancesOutput.tags) &&
        Objects.equals(this.timeZone, instancesInfoForDescribeDBInstancesOutput.timeZone) &&
        Objects.equals(this.vpcId, instancesInfoForDescribeDBInstancesOutput.vpcId) &&
        Objects.equals(this.zoneId, instancesInfoForDescribeDBInstancesOutput.zoneId) &&
        Objects.equals(this.zoneIds, instancesInfoForDescribeDBInstancesOutput.zoneIds) &&
        Objects.equals(this.zoneNodePools, instancesInfoForDescribeDBInstancesOutput.zoneNodePools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, addressObject, allowListVersion, chargeDetail, createTime, dbEngineVersion, instanceId, instanceName, instanceStatus, instanceType, lowerCaseTableNames, maintenanceWindow, nodeDetailInfo, nodeNumber, nodeSpec, port, projectName, regionId, serverCollation, shardNumber, storageSpace, storageType, subnetId, tags, timeZone, vpcId, zoneId, zoneIds, zoneNodePools);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancesInfoForDescribeDBInstancesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    addressObject: ").append(toIndentedString(addressObject)).append("\n");
    sb.append("    allowListVersion: ").append(toIndentedString(allowListVersion)).append("\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    nodeDetailInfo: ").append(toIndentedString(nodeDetailInfo)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    serverCollation: ").append(toIndentedString(serverCollation)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
    sb.append("    zoneNodePools: ").append(toIndentedString(zoneNodePools)).append("\n");
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