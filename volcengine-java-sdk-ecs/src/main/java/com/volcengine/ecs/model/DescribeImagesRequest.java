/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * DescribeImagesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:14.870161+08:00[Asia/Shanghai]")
public class DescribeImagesRequest {
  @SerializedName("ImageIds")
  private List<String> imageIds = null;

  @SerializedName("ImageStatus")
  private String imageStatus = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("IsSupportCloudInit")
  private Boolean isSupportCloudInit = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("OsType")
  private String osType = null;

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("Visibility")
  private String visibility = null;

  public DescribeImagesRequest imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public DescribeImagesRequest addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<String>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * Get imageIds
   * @return imageIds
  **/
  @Schema(description = "")
  public List<String> getImageIds() {
    return imageIds;
  }

  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }

  public DescribeImagesRequest imageStatus(String imageStatus) {
    this.imageStatus = imageStatus;
    return this;
  }

   /**
   * Get imageStatus
   * @return imageStatus
  **/
  @Schema(description = "")
  public String getImageStatus() {
    return imageStatus;
  }

  public void setImageStatus(String imageStatus) {
    this.imageStatus = imageStatus;
  }

  public DescribeImagesRequest instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public DescribeImagesRequest isSupportCloudInit(Boolean isSupportCloudInit) {
    this.isSupportCloudInit = isSupportCloudInit;
    return this;
  }

   /**
   * Get isSupportCloudInit
   * @return isSupportCloudInit
  **/
  @Schema(description = "")
  public Boolean isIsSupportCloudInit() {
    return isSupportCloudInit;
  }

  public void setIsSupportCloudInit(Boolean isSupportCloudInit) {
    this.isSupportCloudInit = isSupportCloudInit;
  }

  public DescribeImagesRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeImagesRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeImagesRequest osType(String osType) {
    this.osType = osType;
    return this;
  }

   /**
   * Get osType
   * @return osType
  **/
  @Schema(description = "")
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public DescribeImagesRequest status(List<String> status) {
    this.status = status;
    return this;
  }

  public DescribeImagesRequest addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<String>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public DescribeImagesRequest visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @Schema(description = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeImagesRequest describeImagesRequest = (DescribeImagesRequest) o;
    return Objects.equals(this.imageIds, describeImagesRequest.imageIds) &&
        Objects.equals(this.imageStatus, describeImagesRequest.imageStatus) &&
        Objects.equals(this.instanceTypeId, describeImagesRequest.instanceTypeId) &&
        Objects.equals(this.isSupportCloudInit, describeImagesRequest.isSupportCloudInit) &&
        Objects.equals(this.maxResults, describeImagesRequest.maxResults) &&
        Objects.equals(this.nextToken, describeImagesRequest.nextToken) &&
        Objects.equals(this.osType, describeImagesRequest.osType) &&
        Objects.equals(this.status, describeImagesRequest.status) &&
        Objects.equals(this.visibility, describeImagesRequest.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIds, imageStatus, instanceTypeId, isSupportCloudInit, maxResults, nextToken, osType, status, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeImagesRequest {\n");
    
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageStatus: ").append(toIndentedString(imageStatus)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    isSupportCloudInit: ").append(toIndentedString(isSupportCloudInit)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
