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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAutoSnapshotPolicyRequest
 */



public class DescribeAutoSnapshotPolicyRequest {
  @SerializedName("AutoSnapshotPolicyIds")
  private List<String> autoSnapshotPolicyIds = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public DescribeAutoSnapshotPolicyRequest autoSnapshotPolicyIds(List<String> autoSnapshotPolicyIds) {
    this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
    return this;
  }

  public DescribeAutoSnapshotPolicyRequest addAutoSnapshotPolicyIdsItem(String autoSnapshotPolicyIdsItem) {
    if (this.autoSnapshotPolicyIds == null) {
      this.autoSnapshotPolicyIds = new ArrayList<String>();
    }
    this.autoSnapshotPolicyIds.add(autoSnapshotPolicyIdsItem);
    return this;
  }

   /**
   * Get autoSnapshotPolicyIds
   * @return autoSnapshotPolicyIds
  **/
  @Schema(description = "")
  public List<String> getAutoSnapshotPolicyIds() {
    return autoSnapshotPolicyIds;
  }

  public void setAutoSnapshotPolicyIds(List<String> autoSnapshotPolicyIds) {
    this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
  }

  public DescribeAutoSnapshotPolicyRequest pageNumber(Integer pageNumber) {
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

  public DescribeAutoSnapshotPolicyRequest pageSize(Integer pageSize) {
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

  public DescribeAutoSnapshotPolicyRequest projectName(String projectName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAutoSnapshotPolicyRequest describeAutoSnapshotPolicyRequest = (DescribeAutoSnapshotPolicyRequest) o;
    return Objects.equals(this.autoSnapshotPolicyIds, describeAutoSnapshotPolicyRequest.autoSnapshotPolicyIds) &&
        Objects.equals(this.pageNumber, describeAutoSnapshotPolicyRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeAutoSnapshotPolicyRequest.pageSize) &&
        Objects.equals(this.projectName, describeAutoSnapshotPolicyRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSnapshotPolicyIds, pageNumber, pageSize, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAutoSnapshotPolicyRequest {\n");
    
    sb.append("    autoSnapshotPolicyIds: ").append(toIndentedString(autoSnapshotPolicyIds)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
