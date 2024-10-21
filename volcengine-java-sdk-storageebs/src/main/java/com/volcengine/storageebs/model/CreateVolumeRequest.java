/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.storageebs.model.TagForCreateVolumeInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVolumeRequest
 */



public class CreateVolumeRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExtraPerformanceIOPS")
  private Integer extraPerformanceIOPS = null;

  @SerializedName("ExtraPerformanceThroughputMB")
  private Integer extraPerformanceThroughputMB = null;

  @SerializedName("ExtraPerformanceTypeId")
  private String extraPerformanceTypeId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Kind")
  private String kind = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("SnapshotId")
  private String snapshotId = null;

  @SerializedName("Tags")
  private List<TagForCreateVolumeInput> tags = null;

  @SerializedName("VolumeChargeType")
  private String volumeChargeType = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public CreateVolumeRequest clientToken(String clientToken) {
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

  public CreateVolumeRequest description(String description) {
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

  public CreateVolumeRequest extraPerformanceIOPS(Integer extraPerformanceIOPS) {
    this.extraPerformanceIOPS = extraPerformanceIOPS;
    return this;
  }

   /**
   * Get extraPerformanceIOPS
   * @return extraPerformanceIOPS
  **/
  @Schema(description = "")
  public Integer getExtraPerformanceIOPS() {
    return extraPerformanceIOPS;
  }

  public void setExtraPerformanceIOPS(Integer extraPerformanceIOPS) {
    this.extraPerformanceIOPS = extraPerformanceIOPS;
  }

  public CreateVolumeRequest extraPerformanceThroughputMB(Integer extraPerformanceThroughputMB) {
    this.extraPerformanceThroughputMB = extraPerformanceThroughputMB;
    return this;
  }

   /**
   * Get extraPerformanceThroughputMB
   * @return extraPerformanceThroughputMB
  **/
  @Schema(description = "")
  public Integer getExtraPerformanceThroughputMB() {
    return extraPerformanceThroughputMB;
  }

  public void setExtraPerformanceThroughputMB(Integer extraPerformanceThroughputMB) {
    this.extraPerformanceThroughputMB = extraPerformanceThroughputMB;
  }

  public CreateVolumeRequest extraPerformanceTypeId(String extraPerformanceTypeId) {
    this.extraPerformanceTypeId = extraPerformanceTypeId;
    return this;
  }

   /**
   * Get extraPerformanceTypeId
   * @return extraPerformanceTypeId
  **/
  @Schema(description = "")
  public String getExtraPerformanceTypeId() {
    return extraPerformanceTypeId;
  }

  public void setExtraPerformanceTypeId(String extraPerformanceTypeId) {
    this.extraPerformanceTypeId = extraPerformanceTypeId;
  }

  public CreateVolumeRequest instanceId(String instanceId) {
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

  public CreateVolumeRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public CreateVolumeRequest projectName(String projectName) {
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

  public CreateVolumeRequest size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public CreateVolumeRequest snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @Schema(description = "")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public CreateVolumeRequest tags(List<TagForCreateVolumeInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateVolumeRequest addTagsItem(TagForCreateVolumeInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateVolumeInput>();
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
  public List<TagForCreateVolumeInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateVolumeInput> tags) {
    this.tags = tags;
  }

  public CreateVolumeRequest volumeChargeType(String volumeChargeType) {
    this.volumeChargeType = volumeChargeType;
    return this;
  }

   /**
   * Get volumeChargeType
   * @return volumeChargeType
  **/
  @Schema(description = "")
  public String getVolumeChargeType() {
    return volumeChargeType;
  }

  public void setVolumeChargeType(String volumeChargeType) {
    this.volumeChargeType = volumeChargeType;
  }

  public CreateVolumeRequest volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public CreateVolumeRequest volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public CreateVolumeRequest zoneId(String zoneId) {
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
    CreateVolumeRequest createVolumeRequest = (CreateVolumeRequest) o;
    return Objects.equals(this.clientToken, createVolumeRequest.clientToken) &&
        Objects.equals(this.description, createVolumeRequest.description) &&
        Objects.equals(this.extraPerformanceIOPS, createVolumeRequest.extraPerformanceIOPS) &&
        Objects.equals(this.extraPerformanceThroughputMB, createVolumeRequest.extraPerformanceThroughputMB) &&
        Objects.equals(this.extraPerformanceTypeId, createVolumeRequest.extraPerformanceTypeId) &&
        Objects.equals(this.instanceId, createVolumeRequest.instanceId) &&
        Objects.equals(this.kind, createVolumeRequest.kind) &&
        Objects.equals(this.projectName, createVolumeRequest.projectName) &&
        Objects.equals(this.size, createVolumeRequest.size) &&
        Objects.equals(this.snapshotId, createVolumeRequest.snapshotId) &&
        Objects.equals(this.tags, createVolumeRequest.tags) &&
        Objects.equals(this.volumeChargeType, createVolumeRequest.volumeChargeType) &&
        Objects.equals(this.volumeName, createVolumeRequest.volumeName) &&
        Objects.equals(this.volumeType, createVolumeRequest.volumeType) &&
        Objects.equals(this.zoneId, createVolumeRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, extraPerformanceIOPS, extraPerformanceThroughputMB, extraPerformanceTypeId, instanceId, kind, projectName, size, snapshotId, tags, volumeChargeType, volumeName, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVolumeRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extraPerformanceIOPS: ").append(toIndentedString(extraPerformanceIOPS)).append("\n");
    sb.append("    extraPerformanceThroughputMB: ").append(toIndentedString(extraPerformanceThroughputMB)).append("\n");
    sb.append("    extraPerformanceTypeId: ").append(toIndentedString(extraPerformanceTypeId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    volumeChargeType: ").append(toIndentedString(volumeChargeType)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
