/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.DataVolumeForUpdateNodePoolConfigInput;
import com.volcengine.vke.model.SecurityForUpdateNodePoolConfigInput;
import com.volcengine.vke.model.SystemVolumeForUpdateNodePoolConfigInput;
import com.volcengine.vke.model.TagForUpdateNodePoolConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeConfigForUpdateNodePoolConfigInput
 */



public class NodeConfigForUpdateNodePoolConfigInput {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("AutoRenewPeriod")
  private Integer autoRenewPeriod = null;

  @SerializedName("DataVolumes")
  private List<DataVolumeForUpdateNodePoolConfigInput> dataVolumes = null;

  @SerializedName("HpcClusterIds")
  private List<String> hpcClusterIds = null;

  @SerializedName("InitializeScript")
  private String initializeScript = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("NamePrefix")
  private String namePrefix = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("Security")
  private SecurityForUpdateNodePoolConfigInput security = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("SystemVolume")
  private SystemVolumeForUpdateNodePoolConfigInput systemVolume = null;

  @SerializedName("Tags")
  private List<TagForUpdateNodePoolConfigInput> tags = null;

  public NodeConfigForUpdateNodePoolConfigInput additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
    return this;
  }

   /**
   * Get additionalContainerStorageEnabled
   * @return additionalContainerStorageEnabled
  **/
  @Schema(description = "")
  public Boolean isAdditionalContainerStorageEnabled() {
    return additionalContainerStorageEnabled;
  }

  public void setAdditionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
  }

  public NodeConfigForUpdateNodePoolConfigInput autoRenew(Boolean autoRenew) {
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

  public NodeConfigForUpdateNodePoolConfigInput autoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
    return this;
  }

   /**
   * Get autoRenewPeriod
   * @return autoRenewPeriod
  **/
  @Schema(description = "")
  public Integer getAutoRenewPeriod() {
    return autoRenewPeriod;
  }

  public void setAutoRenewPeriod(Integer autoRenewPeriod) {
    this.autoRenewPeriod = autoRenewPeriod;
  }

  public NodeConfigForUpdateNodePoolConfigInput dataVolumes(List<DataVolumeForUpdateNodePoolConfigInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
    return this;
  }

  public NodeConfigForUpdateNodePoolConfigInput addDataVolumesItem(DataVolumeForUpdateNodePoolConfigInput dataVolumesItem) {
    if (this.dataVolumes == null) {
      this.dataVolumes = new ArrayList<DataVolumeForUpdateNodePoolConfigInput>();
    }
    this.dataVolumes.add(dataVolumesItem);
    return this;
  }

   /**
   * Get dataVolumes
   * @return dataVolumes
  **/
  @Valid
  @Schema(description = "")
  public List<DataVolumeForUpdateNodePoolConfigInput> getDataVolumes() {
    return dataVolumes;
  }

  public void setDataVolumes(List<DataVolumeForUpdateNodePoolConfigInput> dataVolumes) {
    this.dataVolumes = dataVolumes;
  }

  public NodeConfigForUpdateNodePoolConfigInput hpcClusterIds(List<String> hpcClusterIds) {
    this.hpcClusterIds = hpcClusterIds;
    return this;
  }

  public NodeConfigForUpdateNodePoolConfigInput addHpcClusterIdsItem(String hpcClusterIdsItem) {
    if (this.hpcClusterIds == null) {
      this.hpcClusterIds = new ArrayList<String>();
    }
    this.hpcClusterIds.add(hpcClusterIdsItem);
    return this;
  }

   /**
   * Get hpcClusterIds
   * @return hpcClusterIds
  **/
  @Schema(description = "")
  public List<String> getHpcClusterIds() {
    return hpcClusterIds;
  }

  public void setHpcClusterIds(List<String> hpcClusterIds) {
    this.hpcClusterIds = hpcClusterIds;
  }

  public NodeConfigForUpdateNodePoolConfigInput initializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
    return this;
  }

   /**
   * Get initializeScript
   * @return initializeScript
  **/
  @Schema(description = "")
  public String getInitializeScript() {
    return initializeScript;
  }

  public void setInitializeScript(String initializeScript) {
    this.initializeScript = initializeScript;
  }

  public NodeConfigForUpdateNodePoolConfigInput instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public NodeConfigForUpdateNodePoolConfigInput addInstanceTypeIdsItem(String instanceTypeIdsItem) {
    if (this.instanceTypeIds == null) {
      this.instanceTypeIds = new ArrayList<String>();
    }
    this.instanceTypeIds.add(instanceTypeIdsItem);
    return this;
  }

   /**
   * Get instanceTypeIds
   * @return instanceTypeIds
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeIds() {
    return instanceTypeIds;
  }

  public void setInstanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
  }

  public NodeConfigForUpdateNodePoolConfigInput namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @Schema(description = "")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public NodeConfigForUpdateNodePoolConfigInput period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public NodeConfigForUpdateNodePoolConfigInput security(SecurityForUpdateNodePoolConfigInput security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Valid
  @Schema(description = "")
  public SecurityForUpdateNodePoolConfigInput getSecurity() {
    return security;
  }

  public void setSecurity(SecurityForUpdateNodePoolConfigInput security) {
    this.security = security;
  }

  public NodeConfigForUpdateNodePoolConfigInput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public NodeConfigForUpdateNodePoolConfigInput addSubnetIdsItem(String subnetIdsItem) {
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

  public NodeConfigForUpdateNodePoolConfigInput systemVolume(SystemVolumeForUpdateNodePoolConfigInput systemVolume) {
    this.systemVolume = systemVolume;
    return this;
  }

   /**
   * Get systemVolume
   * @return systemVolume
  **/
  @Valid
  @Schema(description = "")
  public SystemVolumeForUpdateNodePoolConfigInput getSystemVolume() {
    return systemVolume;
  }

  public void setSystemVolume(SystemVolumeForUpdateNodePoolConfigInput systemVolume) {
    this.systemVolume = systemVolume;
  }

  public NodeConfigForUpdateNodePoolConfigInput tags(List<TagForUpdateNodePoolConfigInput> tags) {
    this.tags = tags;
    return this;
  }

  public NodeConfigForUpdateNodePoolConfigInput addTagsItem(TagForUpdateNodePoolConfigInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForUpdateNodePoolConfigInput>();
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
  public List<TagForUpdateNodePoolConfigInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForUpdateNodePoolConfigInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConfigForUpdateNodePoolConfigInput nodeConfigForUpdateNodePoolConfigInput = (NodeConfigForUpdateNodePoolConfigInput) o;
    return Objects.equals(this.additionalContainerStorageEnabled, nodeConfigForUpdateNodePoolConfigInput.additionalContainerStorageEnabled) &&
        Objects.equals(this.autoRenew, nodeConfigForUpdateNodePoolConfigInput.autoRenew) &&
        Objects.equals(this.autoRenewPeriod, nodeConfigForUpdateNodePoolConfigInput.autoRenewPeriod) &&
        Objects.equals(this.dataVolumes, nodeConfigForUpdateNodePoolConfigInput.dataVolumes) &&
        Objects.equals(this.hpcClusterIds, nodeConfigForUpdateNodePoolConfigInput.hpcClusterIds) &&
        Objects.equals(this.initializeScript, nodeConfigForUpdateNodePoolConfigInput.initializeScript) &&
        Objects.equals(this.instanceTypeIds, nodeConfigForUpdateNodePoolConfigInput.instanceTypeIds) &&
        Objects.equals(this.namePrefix, nodeConfigForUpdateNodePoolConfigInput.namePrefix) &&
        Objects.equals(this.period, nodeConfigForUpdateNodePoolConfigInput.period) &&
        Objects.equals(this.security, nodeConfigForUpdateNodePoolConfigInput.security) &&
        Objects.equals(this.subnetIds, nodeConfigForUpdateNodePoolConfigInput.subnetIds) &&
        Objects.equals(this.systemVolume, nodeConfigForUpdateNodePoolConfigInput.systemVolume) &&
        Objects.equals(this.tags, nodeConfigForUpdateNodePoolConfigInput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, autoRenew, autoRenewPeriod, dataVolumes, hpcClusterIds, initializeScript, instanceTypeIds, namePrefix, period, security, subnetIds, systemVolume, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConfigForUpdateNodePoolConfigInput {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    autoRenewPeriod: ").append(toIndentedString(autoRenewPeriod)).append("\n");
    sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
    sb.append("    hpcClusterIds: ").append(toIndentedString(hpcClusterIds)).append("\n");
    sb.append("    initializeScript: ").append(toIndentedString(initializeScript)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    systemVolume: ").append(toIndentedString(systemVolume)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
