/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.TagForDescribeLoadBalancersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LoadBalancerForDescribeLoadBalancersOutput
 */


public class LoadBalancerForDescribeLoadBalancersOutput {
  @SerializedName("AddressIpVersion")
  private String addressIpVersion = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipID")
  private String eipID = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("EniID")
  private String eniID = null;

  @SerializedName("EniIpv6Address")
  private String eniIpv6Address = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("Ipv6EipId")
  private String ipv6EipId = null;

  @SerializedName("LoadBalancerBillingType")
  private Integer loadBalancerBillingType = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("LoadBalancerName")
  private String loadBalancerName = null;

  @SerializedName("LoadBalancerSpec")
  private String loadBalancerSpec = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("MasterZoneId")
  private String masterZoneId = null;

  @SerializedName("ModificationProtectionReason")
  private String modificationProtectionReason = null;

  @SerializedName("ModificationProtectionStatus")
  private String modificationProtectionStatus = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ServiceManaged")
  private Boolean serviceManaged = null;

  @SerializedName("SlaveZoneId")
  private String slaveZoneId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeLoadBalancersOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public LoadBalancerForDescribeLoadBalancersOutput addressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
    return this;
  }

   /**
   * Get addressIpVersion
   * @return addressIpVersion
  **/
  @Schema(description = "")
  public String getAddressIpVersion() {
    return addressIpVersion;
  }

  public void setAddressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
  }

  public LoadBalancerForDescribeLoadBalancersOutput businessStatus(String businessStatus) {
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

  public LoadBalancerForDescribeLoadBalancersOutput createTime(String createTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput deletedTime(String deletedTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput description(String description) {
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

  public LoadBalancerForDescribeLoadBalancersOutput eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eipID(String eipID) {
    this.eipID = eipID;
    return this;
  }

   /**
   * Get eipID
   * @return eipID
  **/
  @Schema(description = "")
  public String getEipID() {
    return eipID;
  }

  public void setEipID(String eipID) {
    this.eipID = eipID;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eniID(String eniID) {
    this.eniID = eniID;
    return this;
  }

   /**
   * Get eniID
   * @return eniID
  **/
  @Schema(description = "")
  public String getEniID() {
    return eniID;
  }

  public void setEniID(String eniID) {
    this.eniID = eniID;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eniIpv6Address(String eniIpv6Address) {
    this.eniIpv6Address = eniIpv6Address;
    return this;
  }

   /**
   * Get eniIpv6Address
   * @return eniIpv6Address
  **/
  @Schema(description = "")
  public String getEniIpv6Address() {
    return eniIpv6Address;
  }

  public void setEniIpv6Address(String eniIpv6Address) {
    this.eniIpv6Address = eniIpv6Address;
  }

  public LoadBalancerForDescribeLoadBalancersOutput expiredTime(String expiredTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput ipv6EipId(String ipv6EipId) {
    this.ipv6EipId = ipv6EipId;
    return this;
  }

   /**
   * Get ipv6EipId
   * @return ipv6EipId
  **/
  @Schema(description = "")
  public String getIpv6EipId() {
    return ipv6EipId;
  }

  public void setIpv6EipId(String ipv6EipId) {
    this.ipv6EipId = ipv6EipId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
    return this;
  }

   /**
   * Get loadBalancerBillingType
   * @return loadBalancerBillingType
  **/
  @Schema(description = "")
  public Integer getLoadBalancerBillingType() {
    return loadBalancerBillingType;
  }

  public void setLoadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * Get loadBalancerName
   * @return loadBalancerName
  **/
  @Schema(description = "")
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
    return this;
  }

   /**
   * Get loadBalancerSpec
   * @return loadBalancerSpec
  **/
  @Schema(description = "")
  public String getLoadBalancerSpec() {
    return loadBalancerSpec;
  }

  public void setLoadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
  }

  public LoadBalancerForDescribeLoadBalancersOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public LoadBalancerForDescribeLoadBalancersOutput masterZoneId(String masterZoneId) {
    this.masterZoneId = masterZoneId;
    return this;
  }

   /**
   * Get masterZoneId
   * @return masterZoneId
  **/
  @Schema(description = "")
  public String getMasterZoneId() {
    return masterZoneId;
  }

  public void setMasterZoneId(String masterZoneId) {
    this.masterZoneId = masterZoneId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput modificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
    return this;
  }

   /**
   * Get modificationProtectionReason
   * @return modificationProtectionReason
  **/
  @Schema(description = "")
  public String getModificationProtectionReason() {
    return modificationProtectionReason;
  }

  public void setModificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
  }

  public LoadBalancerForDescribeLoadBalancersOutput modificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
    return this;
  }

   /**
   * Get modificationProtectionStatus
   * @return modificationProtectionStatus
  **/
  @Schema(description = "")
  public String getModificationProtectionStatus() {
    return modificationProtectionStatus;
  }

  public void setModificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
  }

  public LoadBalancerForDescribeLoadBalancersOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public LoadBalancerForDescribeLoadBalancersOutput projectName(String projectName) {
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

  public LoadBalancerForDescribeLoadBalancersOutput serviceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
    return this;
  }

   /**
   * Get serviceManaged
   * @return serviceManaged
  **/
  @Schema(description = "")
  public Boolean isServiceManaged() {
    return serviceManaged;
  }

  public void setServiceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
  }

  public LoadBalancerForDescribeLoadBalancersOutput slaveZoneId(String slaveZoneId) {
    this.slaveZoneId = slaveZoneId;
    return this;
  }

   /**
   * Get slaveZoneId
   * @return slaveZoneId
  **/
  @Schema(description = "")
  public String getSlaveZoneId() {
    return slaveZoneId;
  }

  public void setSlaveZoneId(String slaveZoneId) {
    this.slaveZoneId = slaveZoneId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput status(String status) {
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

  public LoadBalancerForDescribeLoadBalancersOutput subnetId(String subnetId) {
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

  public LoadBalancerForDescribeLoadBalancersOutput tags(List<TagForDescribeLoadBalancersOutput> tags) {
    this.tags = tags;
    return this;
  }

  public LoadBalancerForDescribeLoadBalancersOutput addTagsItem(TagForDescribeLoadBalancersOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeLoadBalancersOutput>();
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
  public List<TagForDescribeLoadBalancersOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeLoadBalancersOutput> tags) {
    this.tags = tags;
  }

  public LoadBalancerForDescribeLoadBalancersOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LoadBalancerForDescribeLoadBalancersOutput updateTime(String updateTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput vpcId(String vpcId) {
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
    LoadBalancerForDescribeLoadBalancersOutput loadBalancerForDescribeLoadBalancersOutput = (LoadBalancerForDescribeLoadBalancersOutput) o;
    return Objects.equals(this.addressIpVersion, loadBalancerForDescribeLoadBalancersOutput.addressIpVersion) &&
        Objects.equals(this.businessStatus, loadBalancerForDescribeLoadBalancersOutput.businessStatus) &&
        Objects.equals(this.createTime, loadBalancerForDescribeLoadBalancersOutput.createTime) &&
        Objects.equals(this.deletedTime, loadBalancerForDescribeLoadBalancersOutput.deletedTime) &&
        Objects.equals(this.description, loadBalancerForDescribeLoadBalancersOutput.description) &&
        Objects.equals(this.eipAddress, loadBalancerForDescribeLoadBalancersOutput.eipAddress) &&
        Objects.equals(this.eipID, loadBalancerForDescribeLoadBalancersOutput.eipID) &&
        Objects.equals(this.eniAddress, loadBalancerForDescribeLoadBalancersOutput.eniAddress) &&
        Objects.equals(this.eniID, loadBalancerForDescribeLoadBalancersOutput.eniID) &&
        Objects.equals(this.eniIpv6Address, loadBalancerForDescribeLoadBalancersOutput.eniIpv6Address) &&
        Objects.equals(this.expiredTime, loadBalancerForDescribeLoadBalancersOutput.expiredTime) &&
        Objects.equals(this.ipv6EipId, loadBalancerForDescribeLoadBalancersOutput.ipv6EipId) &&
        Objects.equals(this.loadBalancerBillingType, loadBalancerForDescribeLoadBalancersOutput.loadBalancerBillingType) &&
        Objects.equals(this.loadBalancerId, loadBalancerForDescribeLoadBalancersOutput.loadBalancerId) &&
        Objects.equals(this.loadBalancerName, loadBalancerForDescribeLoadBalancersOutput.loadBalancerName) &&
        Objects.equals(this.loadBalancerSpec, loadBalancerForDescribeLoadBalancersOutput.loadBalancerSpec) &&
        Objects.equals(this.lockReason, loadBalancerForDescribeLoadBalancersOutput.lockReason) &&
        Objects.equals(this.masterZoneId, loadBalancerForDescribeLoadBalancersOutput.masterZoneId) &&
        Objects.equals(this.modificationProtectionReason, loadBalancerForDescribeLoadBalancersOutput.modificationProtectionReason) &&
        Objects.equals(this.modificationProtectionStatus, loadBalancerForDescribeLoadBalancersOutput.modificationProtectionStatus) &&
        Objects.equals(this.overdueTime, loadBalancerForDescribeLoadBalancersOutput.overdueTime) &&
        Objects.equals(this.projectName, loadBalancerForDescribeLoadBalancersOutput.projectName) &&
        Objects.equals(this.serviceManaged, loadBalancerForDescribeLoadBalancersOutput.serviceManaged) &&
        Objects.equals(this.slaveZoneId, loadBalancerForDescribeLoadBalancersOutput.slaveZoneId) &&
        Objects.equals(this.status, loadBalancerForDescribeLoadBalancersOutput.status) &&
        Objects.equals(this.subnetId, loadBalancerForDescribeLoadBalancersOutput.subnetId) &&
        Objects.equals(this.tags, loadBalancerForDescribeLoadBalancersOutput.tags) &&
        Objects.equals(this.type, loadBalancerForDescribeLoadBalancersOutput.type) &&
        Objects.equals(this.updateTime, loadBalancerForDescribeLoadBalancersOutput.updateTime) &&
        Objects.equals(this.vpcId, loadBalancerForDescribeLoadBalancersOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressIpVersion, businessStatus, createTime, deletedTime, description, eipAddress, eipID, eniAddress, eniID, eniIpv6Address, expiredTime, ipv6EipId, loadBalancerBillingType, loadBalancerId, loadBalancerName, loadBalancerSpec, lockReason, masterZoneId, modificationProtectionReason, modificationProtectionStatus, overdueTime, projectName, serviceManaged, slaveZoneId, status, subnetId, tags, type, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerForDescribeLoadBalancersOutput {\n");
    
    sb.append("    addressIpVersion: ").append(toIndentedString(addressIpVersion)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    eipID: ").append(toIndentedString(eipID)).append("\n");
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    eniID: ").append(toIndentedString(eniID)).append("\n");
    sb.append("    eniIpv6Address: ").append(toIndentedString(eniIpv6Address)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ipv6EipId: ").append(toIndentedString(ipv6EipId)).append("\n");
    sb.append("    loadBalancerBillingType: ").append(toIndentedString(loadBalancerBillingType)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    loadBalancerSpec: ").append(toIndentedString(loadBalancerSpec)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    masterZoneId: ").append(toIndentedString(masterZoneId)).append("\n");
    sb.append("    modificationProtectionReason: ").append(toIndentedString(modificationProtectionReason)).append("\n");
    sb.append("    modificationProtectionStatus: ").append(toIndentedString(modificationProtectionStatus)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    serviceManaged: ").append(toIndentedString(serviceManaged)).append("\n");
    sb.append("    slaveZoneId: ").append(toIndentedString(slaveZoneId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
