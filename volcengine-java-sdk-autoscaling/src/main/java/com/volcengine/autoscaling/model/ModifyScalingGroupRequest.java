/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.autoscaling.model.LaunchTemplateOverrideForModifyScalingGroupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyScalingGroupRequest
 */


public class ModifyScalingGroupRequest {
  @SerializedName("ActiveScalingConfigurationId")
  private String activeScalingConfigurationId = null;

  @SerializedName("DefaultCooldown")
  private Integer defaultCooldown = null;

  @SerializedName("DesireInstanceNumber")
  private Integer desireInstanceNumber = null;

  @SerializedName("HealthCheckType")
  private String healthCheckType = null;

  @SerializedName("InstanceTerminatePolicy")
  private String instanceTerminatePolicy = null;

  @SerializedName("LaunchTemplateId")
  private String launchTemplateId = null;

  @SerializedName("LaunchTemplateOverrides")
  private List<LaunchTemplateOverrideForModifyScalingGroupInput> launchTemplateOverrides = null;

  @SerializedName("LaunchTemplateVersion")
  private String launchTemplateVersion = null;

  @SerializedName("MaxInstanceNumber")
  private Integer maxInstanceNumber = null;

  @SerializedName("MinInstanceNumber")
  private Integer minInstanceNumber = null;

  @SerializedName("MultiAZPolicy")
  private String multiAZPolicy = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ScalingGroupName")
  private String scalingGroupName = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  public ModifyScalingGroupRequest activeScalingConfigurationId(String activeScalingConfigurationId) {
    this.activeScalingConfigurationId = activeScalingConfigurationId;
    return this;
  }

   /**
   * Get activeScalingConfigurationId
   * @return activeScalingConfigurationId
  **/
  @Schema(description = "")
  public String getActiveScalingConfigurationId() {
    return activeScalingConfigurationId;
  }

  public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
    this.activeScalingConfigurationId = activeScalingConfigurationId;
  }

  public ModifyScalingGroupRequest defaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
    return this;
  }

   /**
   * Get defaultCooldown
   * @return defaultCooldown
  **/
  @Schema(description = "")
  public Integer getDefaultCooldown() {
    return defaultCooldown;
  }

  public void setDefaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
  }

  public ModifyScalingGroupRequest desireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
    return this;
  }

   /**
   * Get desireInstanceNumber
   * @return desireInstanceNumber
  **/
  @Schema(description = "")
  public Integer getDesireInstanceNumber() {
    return desireInstanceNumber;
  }

  public void setDesireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
  }

  public ModifyScalingGroupRequest healthCheckType(String healthCheckType) {
    this.healthCheckType = healthCheckType;
    return this;
  }

   /**
   * Get healthCheckType
   * @return healthCheckType
  **/
  @Schema(description = "")
  public String getHealthCheckType() {
    return healthCheckType;
  }

  public void setHealthCheckType(String healthCheckType) {
    this.healthCheckType = healthCheckType;
  }

  public ModifyScalingGroupRequest instanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
    return this;
  }

   /**
   * Get instanceTerminatePolicy
   * @return instanceTerminatePolicy
  **/
  @Schema(description = "")
  public String getInstanceTerminatePolicy() {
    return instanceTerminatePolicy;
  }

  public void setInstanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
  }

  public ModifyScalingGroupRequest launchTemplateId(String launchTemplateId) {
    this.launchTemplateId = launchTemplateId;
    return this;
  }

   /**
   * Get launchTemplateId
   * @return launchTemplateId
  **/
  @Schema(description = "")
  public String getLaunchTemplateId() {
    return launchTemplateId;
  }

  public void setLaunchTemplateId(String launchTemplateId) {
    this.launchTemplateId = launchTemplateId;
  }

  public ModifyScalingGroupRequest launchTemplateOverrides(List<LaunchTemplateOverrideForModifyScalingGroupInput> launchTemplateOverrides) {
    this.launchTemplateOverrides = launchTemplateOverrides;
    return this;
  }

  public ModifyScalingGroupRequest addLaunchTemplateOverridesItem(LaunchTemplateOverrideForModifyScalingGroupInput launchTemplateOverridesItem) {
    if (this.launchTemplateOverrides == null) {
      this.launchTemplateOverrides = new ArrayList<LaunchTemplateOverrideForModifyScalingGroupInput>();
    }
    this.launchTemplateOverrides.add(launchTemplateOverridesItem);
    return this;
  }

   /**
   * Get launchTemplateOverrides
   * @return launchTemplateOverrides
  **/
  @Valid
  @Schema(description = "")
  public List<LaunchTemplateOverrideForModifyScalingGroupInput> getLaunchTemplateOverrides() {
    return launchTemplateOverrides;
  }

  public void setLaunchTemplateOverrides(List<LaunchTemplateOverrideForModifyScalingGroupInput> launchTemplateOverrides) {
    this.launchTemplateOverrides = launchTemplateOverrides;
  }

  public ModifyScalingGroupRequest launchTemplateVersion(String launchTemplateVersion) {
    this.launchTemplateVersion = launchTemplateVersion;
    return this;
  }

   /**
   * Get launchTemplateVersion
   * @return launchTemplateVersion
  **/
  @Schema(description = "")
  public String getLaunchTemplateVersion() {
    return launchTemplateVersion;
  }

  public void setLaunchTemplateVersion(String launchTemplateVersion) {
    this.launchTemplateVersion = launchTemplateVersion;
  }

  public ModifyScalingGroupRequest maxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
    return this;
  }

   /**
   * Get maxInstanceNumber
   * @return maxInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMaxInstanceNumber() {
    return maxInstanceNumber;
  }

  public void setMaxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
  }

  public ModifyScalingGroupRequest minInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
    return this;
  }

   /**
   * Get minInstanceNumber
   * @return minInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMinInstanceNumber() {
    return minInstanceNumber;
  }

  public void setMinInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
  }

  public ModifyScalingGroupRequest multiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
    return this;
  }

   /**
   * Get multiAZPolicy
   * @return multiAZPolicy
  **/
  @Schema(description = "")
  public String getMultiAZPolicy() {
    return multiAZPolicy;
  }

  public void setMultiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
  }

  public ModifyScalingGroupRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }

  public ModifyScalingGroupRequest scalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
    return this;
  }

   /**
   * Get scalingGroupName
   * @return scalingGroupName
  **/
  @Schema(description = "")
  public String getScalingGroupName() {
    return scalingGroupName;
  }

  public void setScalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
  }

  public ModifyScalingGroupRequest subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public ModifyScalingGroupRequest addSubnetIdsItem(String subnetIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyScalingGroupRequest modifyScalingGroupRequest = (ModifyScalingGroupRequest) o;
    return Objects.equals(this.activeScalingConfigurationId, modifyScalingGroupRequest.activeScalingConfigurationId) &&
        Objects.equals(this.defaultCooldown, modifyScalingGroupRequest.defaultCooldown) &&
        Objects.equals(this.desireInstanceNumber, modifyScalingGroupRequest.desireInstanceNumber) &&
        Objects.equals(this.healthCheckType, modifyScalingGroupRequest.healthCheckType) &&
        Objects.equals(this.instanceTerminatePolicy, modifyScalingGroupRequest.instanceTerminatePolicy) &&
        Objects.equals(this.launchTemplateId, modifyScalingGroupRequest.launchTemplateId) &&
        Objects.equals(this.launchTemplateOverrides, modifyScalingGroupRequest.launchTemplateOverrides) &&
        Objects.equals(this.launchTemplateVersion, modifyScalingGroupRequest.launchTemplateVersion) &&
        Objects.equals(this.maxInstanceNumber, modifyScalingGroupRequest.maxInstanceNumber) &&
        Objects.equals(this.minInstanceNumber, modifyScalingGroupRequest.minInstanceNumber) &&
        Objects.equals(this.multiAZPolicy, modifyScalingGroupRequest.multiAZPolicy) &&
        Objects.equals(this.scalingGroupId, modifyScalingGroupRequest.scalingGroupId) &&
        Objects.equals(this.scalingGroupName, modifyScalingGroupRequest.scalingGroupName) &&
        Objects.equals(this.subnetIds, modifyScalingGroupRequest.subnetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeScalingConfigurationId, defaultCooldown, desireInstanceNumber, healthCheckType, instanceTerminatePolicy, launchTemplateId, launchTemplateOverrides, launchTemplateVersion, maxInstanceNumber, minInstanceNumber, multiAZPolicy, scalingGroupId, scalingGroupName, subnetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyScalingGroupRequest {\n");
    
    sb.append("    activeScalingConfigurationId: ").append(toIndentedString(activeScalingConfigurationId)).append("\n");
    sb.append("    defaultCooldown: ").append(toIndentedString(defaultCooldown)).append("\n");
    sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
    sb.append("    healthCheckType: ").append(toIndentedString(healthCheckType)).append("\n");
    sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
    sb.append("    launchTemplateId: ").append(toIndentedString(launchTemplateId)).append("\n");
    sb.append("    launchTemplateOverrides: ").append(toIndentedString(launchTemplateOverrides)).append("\n");
    sb.append("    launchTemplateVersion: ").append(toIndentedString(launchTemplateVersion)).append("\n");
    sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
    sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
    sb.append("    multiAZPolicy: ").append(toIndentedString(multiAZPolicy)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
