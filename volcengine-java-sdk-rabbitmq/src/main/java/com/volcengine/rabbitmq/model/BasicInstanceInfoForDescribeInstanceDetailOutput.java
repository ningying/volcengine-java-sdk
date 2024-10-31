/*
 * rabbitmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rabbitmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rabbitmq.model.ChargeDetailForDescribeInstanceDetailOutput;
import com.volcengine.rabbitmq.model.TagForDescribeInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BasicInstanceInfoForDescribeInstanceDetailOutput
 */



public class BasicInstanceInfoForDescribeInstanceDetailOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("ApplyPrivateDNSToPublic")
  private Boolean applyPrivateDNSToPublic = null;

  @SerializedName("ArchType")
  private String archType = null;

  @SerializedName("ChargeDetail")
  private ChargeDetailForDescribeInstanceDetailOutput chargeDetail = null;

  @SerializedName("ComputeSpec")
  private String computeSpec = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("InitUserName")
  private String initUserName = null;

  @SerializedName("InstanceDescription")
  private String instanceDescription = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("IsEncrypted")
  private Boolean isEncrypted = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionDescription")
  private String regionDescription = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeInstanceDetailOutput> tags = null;

  @SerializedName("UsedStorageSpace")
  private Integer usedStorageSpace = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneDescription")
  private String zoneDescription = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public BasicInstanceInfoForDescribeInstanceDetailOutput accountId(String accountId) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput applyPrivateDNSToPublic(Boolean applyPrivateDNSToPublic) {
    this.applyPrivateDNSToPublic = applyPrivateDNSToPublic;
    return this;
  }

   /**
   * Get applyPrivateDNSToPublic
   * @return applyPrivateDNSToPublic
  **/
  @Schema(description = "")
  public Boolean isApplyPrivateDNSToPublic() {
    return applyPrivateDNSToPublic;
  }

  public void setApplyPrivateDNSToPublic(Boolean applyPrivateDNSToPublic) {
    this.applyPrivateDNSToPublic = applyPrivateDNSToPublic;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput archType(String archType) {
    this.archType = archType;
    return this;
  }

   /**
   * Get archType
   * @return archType
  **/
  @Schema(description = "")
  public String getArchType() {
    return archType;
  }

  public void setArchType(String archType) {
    this.archType = archType;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput chargeDetail(ChargeDetailForDescribeInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

   /**
   * Get chargeDetail
   * @return chargeDetail
  **/
  @Valid
  @Schema(description = "")
  public ChargeDetailForDescribeInstanceDetailOutput getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetailForDescribeInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput computeSpec(String computeSpec) {
    this.computeSpec = computeSpec;
    return this;
  }

   /**
   * Get computeSpec
   * @return computeSpec
  **/
  @Schema(description = "")
  public String getComputeSpec() {
    return computeSpec;
  }

  public void setComputeSpec(String computeSpec) {
    this.computeSpec = computeSpec;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput createTime(String createTime) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @Schema(description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput initUserName(String initUserName) {
    this.initUserName = initUserName;
    return this;
  }

   /**
   * Get initUserName
   * @return initUserName
  **/
  @Schema(description = "")
  public String getInitUserName() {
    return initUserName;
  }

  public void setInitUserName(String initUserName) {
    this.initUserName = initUserName;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput instanceDescription(String instanceDescription) {
    this.instanceDescription = instanceDescription;
    return this;
  }

   /**
   * Get instanceDescription
   * @return instanceDescription
  **/
  @Schema(description = "")
  public String getInstanceDescription() {
    return instanceDescription;
  }

  public void setInstanceDescription(String instanceDescription) {
    this.instanceDescription = instanceDescription;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput instanceId(String instanceId) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput instanceName(String instanceName) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput instanceStatus(String instanceStatus) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Get isEncrypted
   * @return isEncrypted
  **/
  @Schema(description = "")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput projectName(String projectName) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput regionDescription(String regionDescription) {
    this.regionDescription = regionDescription;
    return this;
  }

   /**
   * Get regionDescription
   * @return regionDescription
  **/
  @Schema(description = "")
  public String getRegionDescription() {
    return regionDescription;
  }

  public void setRegionDescription(String regionDescription) {
    this.regionDescription = regionDescription;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput regionId(String regionId) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput storageSpace(Integer storageSpace) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput subnetId(String subnetId) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput tags(List<TagForDescribeInstanceDetailOutput> tags) {
    this.tags = tags;
    return this;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput addTagsItem(TagForDescribeInstanceDetailOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeInstanceDetailOutput>();
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
  public List<TagForDescribeInstanceDetailOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeInstanceDetailOutput> tags) {
    this.tags = tags;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput usedStorageSpace(Integer usedStorageSpace) {
    this.usedStorageSpace = usedStorageSpace;
    return this;
  }

   /**
   * Get usedStorageSpace
   * @return usedStorageSpace
  **/
  @Schema(description = "")
  public Integer getUsedStorageSpace() {
    return usedStorageSpace;
  }

  public void setUsedStorageSpace(Integer usedStorageSpace) {
    this.usedStorageSpace = usedStorageSpace;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput vpcId(String vpcId) {
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

  public BasicInstanceInfoForDescribeInstanceDetailOutput zoneDescription(String zoneDescription) {
    this.zoneDescription = zoneDescription;
    return this;
  }

   /**
   * Get zoneDescription
   * @return zoneDescription
  **/
  @Schema(description = "")
  public String getZoneDescription() {
    return zoneDescription;
  }

  public void setZoneDescription(String zoneDescription) {
    this.zoneDescription = zoneDescription;
  }

  public BasicInstanceInfoForDescribeInstanceDetailOutput zoneId(String zoneId) {
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
    BasicInstanceInfoForDescribeInstanceDetailOutput basicInstanceInfoForDescribeInstanceDetailOutput = (BasicInstanceInfoForDescribeInstanceDetailOutput) o;
    return Objects.equals(this.accountId, basicInstanceInfoForDescribeInstanceDetailOutput.accountId) &&
        Objects.equals(this.applyPrivateDNSToPublic, basicInstanceInfoForDescribeInstanceDetailOutput.applyPrivateDNSToPublic) &&
        Objects.equals(this.archType, basicInstanceInfoForDescribeInstanceDetailOutput.archType) &&
        Objects.equals(this.chargeDetail, basicInstanceInfoForDescribeInstanceDetailOutput.chargeDetail) &&
        Objects.equals(this.computeSpec, basicInstanceInfoForDescribeInstanceDetailOutput.computeSpec) &&
        Objects.equals(this.createTime, basicInstanceInfoForDescribeInstanceDetailOutput.createTime) &&
        Objects.equals(this.eipId, basicInstanceInfoForDescribeInstanceDetailOutput.eipId) &&
        Objects.equals(this.initUserName, basicInstanceInfoForDescribeInstanceDetailOutput.initUserName) &&
        Objects.equals(this.instanceDescription, basicInstanceInfoForDescribeInstanceDetailOutput.instanceDescription) &&
        Objects.equals(this.instanceId, basicInstanceInfoForDescribeInstanceDetailOutput.instanceId) &&
        Objects.equals(this.instanceName, basicInstanceInfoForDescribeInstanceDetailOutput.instanceName) &&
        Objects.equals(this.instanceStatus, basicInstanceInfoForDescribeInstanceDetailOutput.instanceStatus) &&
        Objects.equals(this.isEncrypted, basicInstanceInfoForDescribeInstanceDetailOutput.isEncrypted) &&
        Objects.equals(this.projectName, basicInstanceInfoForDescribeInstanceDetailOutput.projectName) &&
        Objects.equals(this.regionDescription, basicInstanceInfoForDescribeInstanceDetailOutput.regionDescription) &&
        Objects.equals(this.regionId, basicInstanceInfoForDescribeInstanceDetailOutput.regionId) &&
        Objects.equals(this.storageSpace, basicInstanceInfoForDescribeInstanceDetailOutput.storageSpace) &&
        Objects.equals(this.subnetId, basicInstanceInfoForDescribeInstanceDetailOutput.subnetId) &&
        Objects.equals(this.tags, basicInstanceInfoForDescribeInstanceDetailOutput.tags) &&
        Objects.equals(this.usedStorageSpace, basicInstanceInfoForDescribeInstanceDetailOutput.usedStorageSpace) &&
        Objects.equals(this.version, basicInstanceInfoForDescribeInstanceDetailOutput.version) &&
        Objects.equals(this.vpcId, basicInstanceInfoForDescribeInstanceDetailOutput.vpcId) &&
        Objects.equals(this.zoneDescription, basicInstanceInfoForDescribeInstanceDetailOutput.zoneDescription) &&
        Objects.equals(this.zoneId, basicInstanceInfoForDescribeInstanceDetailOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, applyPrivateDNSToPublic, archType, chargeDetail, computeSpec, createTime, eipId, initUserName, instanceDescription, instanceId, instanceName, instanceStatus, isEncrypted, projectName, regionDescription, regionId, storageSpace, subnetId, tags, usedStorageSpace, version, vpcId, zoneDescription, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInstanceInfoForDescribeInstanceDetailOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applyPrivateDNSToPublic: ").append(toIndentedString(applyPrivateDNSToPublic)).append("\n");
    sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    computeSpec: ").append(toIndentedString(computeSpec)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    initUserName: ").append(toIndentedString(initUserName)).append("\n");
    sb.append("    instanceDescription: ").append(toIndentedString(instanceDescription)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionDescription: ").append(toIndentedString(regionDescription)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneDescription: ").append(toIndentedString(zoneDescription)).append("\n");
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
