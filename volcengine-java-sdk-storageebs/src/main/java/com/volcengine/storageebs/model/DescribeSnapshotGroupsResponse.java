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
import com.volcengine.storageebs.model.SnapshotGroupForDescribeSnapshotGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSnapshotGroupsResponse
 */


public class DescribeSnapshotGroupsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SnapshotGroups")
  private List<SnapshotGroupForDescribeSnapshotGroupsOutput> snapshotGroups = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeSnapshotGroupsResponse pageNumber(Integer pageNumber) {
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

  public DescribeSnapshotGroupsResponse pageSize(Integer pageSize) {
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

  public DescribeSnapshotGroupsResponse snapshotGroups(List<SnapshotGroupForDescribeSnapshotGroupsOutput> snapshotGroups) {
    this.snapshotGroups = snapshotGroups;
    return this;
  }

  public DescribeSnapshotGroupsResponse addSnapshotGroupsItem(SnapshotGroupForDescribeSnapshotGroupsOutput snapshotGroupsItem) {
    if (this.snapshotGroups == null) {
      this.snapshotGroups = new ArrayList<SnapshotGroupForDescribeSnapshotGroupsOutput>();
    }
    this.snapshotGroups.add(snapshotGroupsItem);
    return this;
  }

   /**
   * Get snapshotGroups
   * @return snapshotGroups
  **/
  @Valid
  @Schema(description = "")
  public List<SnapshotGroupForDescribeSnapshotGroupsOutput> getSnapshotGroups() {
    return snapshotGroups;
  }

  public void setSnapshotGroups(List<SnapshotGroupForDescribeSnapshotGroupsOutput> snapshotGroups) {
    this.snapshotGroups = snapshotGroups;
  }

  public DescribeSnapshotGroupsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSnapshotGroupsResponse describeSnapshotGroupsResponse = (DescribeSnapshotGroupsResponse) o;
    return Objects.equals(this.pageNumber, describeSnapshotGroupsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeSnapshotGroupsResponse.pageSize) &&
        Objects.equals(this.snapshotGroups, describeSnapshotGroupsResponse.snapshotGroups) &&
        Objects.equals(this.totalCount, describeSnapshotGroupsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, snapshotGroups, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnapshotGroupsResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    snapshotGroups: ").append(toIndentedString(snapshotGroups)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
