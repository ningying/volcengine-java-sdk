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
import com.volcengine.storageebs.model.TagFilterForDescribeTagsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTagsRequest
 */



public class DescribeTagsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ResourceIds")
  private List<String> resourceIds = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("SysTagVisible")
  private Boolean sysTagVisible = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeTagsInput> tagFilters = null;

  public DescribeTagsRequest pageNumber(Integer pageNumber) {
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

  public DescribeTagsRequest pageSize(Integer pageSize) {
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

  public DescribeTagsRequest resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public DescribeTagsRequest addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<String>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @Schema(description = "")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public DescribeTagsRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public DescribeTagsRequest sysTagVisible(Boolean sysTagVisible) {
    this.sysTagVisible = sysTagVisible;
    return this;
  }

   /**
   * Get sysTagVisible
   * @return sysTagVisible
  **/
  @Schema(description = "")
  public Boolean isSysTagVisible() {
    return sysTagVisible;
  }

  public void setSysTagVisible(Boolean sysTagVisible) {
    this.sysTagVisible = sysTagVisible;
  }

  public DescribeTagsRequest tagFilters(List<TagFilterForDescribeTagsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeTagsRequest addTagFiltersItem(TagFilterForDescribeTagsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeTagsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeTagsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeTagsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTagsRequest describeTagsRequest = (DescribeTagsRequest) o;
    return Objects.equals(this.pageNumber, describeTagsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTagsRequest.pageSize) &&
        Objects.equals(this.resourceIds, describeTagsRequest.resourceIds) &&
        Objects.equals(this.resourceType, describeTagsRequest.resourceType) &&
        Objects.equals(this.sysTagVisible, describeTagsRequest.sysTagVisible) &&
        Objects.equals(this.tagFilters, describeTagsRequest.tagFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, resourceIds, resourceType, sysTagVisible, tagFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTagsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    sysTagVisible: ").append(toIndentedString(sysTagVisible)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
