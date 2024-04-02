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
import com.volcengine.storageebs.model.FilterForDescribeSnapshotsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSnapshotsRequest
 */


public class DescribeSnapshotsRequest {
  @SerializedName("Filter")
  private List<FilterForDescribeSnapshotsInput> filter = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SnapshotIds")
  private List<String> snapshotIds = null;

  @SerializedName("SnapshotName")
  private String snapshotName = null;

  @SerializedName("SnapshotStatus")
  private List<String> snapshotStatus = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeSnapshotsRequest filter(List<FilterForDescribeSnapshotsInput> filter) {
    this.filter = filter;
    return this;
  }

  public DescribeSnapshotsRequest addFilterItem(FilterForDescribeSnapshotsInput filterItem) {
    if (this.filter == null) {
      this.filter = new ArrayList<FilterForDescribeSnapshotsInput>();
    }
    this.filter.add(filterItem);
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public List<FilterForDescribeSnapshotsInput> getFilter() {
    return filter;
  }

  public void setFilter(List<FilterForDescribeSnapshotsInput> filter) {
    this.filter = filter;
  }

  public DescribeSnapshotsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeSnapshotsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeSnapshotsRequest projectName(String projectName) {
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

  public DescribeSnapshotsRequest snapshotIds(List<String> snapshotIds) {
    this.snapshotIds = snapshotIds;
    return this;
  }

  public DescribeSnapshotsRequest addSnapshotIdsItem(String snapshotIdsItem) {
    if (this.snapshotIds == null) {
      this.snapshotIds = new ArrayList<String>();
    }
    this.snapshotIds.add(snapshotIdsItem);
    return this;
  }

   /**
   * Get snapshotIds
   * @return snapshotIds
  **/
  @Schema(description = "")
  public List<String> getSnapshotIds() {
    return snapshotIds;
  }

  public void setSnapshotIds(List<String> snapshotIds) {
    this.snapshotIds = snapshotIds;
  }

  public DescribeSnapshotsRequest snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Get snapshotName
   * @return snapshotName
  **/
  @Schema(description = "")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  public DescribeSnapshotsRequest snapshotStatus(List<String> snapshotStatus) {
    this.snapshotStatus = snapshotStatus;
    return this;
  }

  public DescribeSnapshotsRequest addSnapshotStatusItem(String snapshotStatusItem) {
    if (this.snapshotStatus == null) {
      this.snapshotStatus = new ArrayList<String>();
    }
    this.snapshotStatus.add(snapshotStatusItem);
    return this;
  }

   /**
   * Get snapshotStatus
   * @return snapshotStatus
  **/
  @Schema(description = "")
  public List<String> getSnapshotStatus() {
    return snapshotStatus;
  }

  public void setSnapshotStatus(List<String> snapshotStatus) {
    this.snapshotStatus = snapshotStatus;
  }

  public DescribeSnapshotsRequest volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public DescribeSnapshotsRequest zoneId(String zoneId) {
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
    DescribeSnapshotsRequest describeSnapshotsRequest = (DescribeSnapshotsRequest) o;
    return Objects.equals(this.filter, describeSnapshotsRequest.filter) &&
        Objects.equals(this.pageNumber, describeSnapshotsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeSnapshotsRequest.pageSize) &&
        Objects.equals(this.projectName, describeSnapshotsRequest.projectName) &&
        Objects.equals(this.snapshotIds, describeSnapshotsRequest.snapshotIds) &&
        Objects.equals(this.snapshotName, describeSnapshotsRequest.snapshotName) &&
        Objects.equals(this.snapshotStatus, describeSnapshotsRequest.snapshotStatus) &&
        Objects.equals(this.volumeId, describeSnapshotsRequest.volumeId) &&
        Objects.equals(this.zoneId, describeSnapshotsRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageNumber, pageSize, projectName, snapshotIds, snapshotName, snapshotStatus, volumeId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnapshotsRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotStatus: ").append(toIndentedString(snapshotStatus)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
