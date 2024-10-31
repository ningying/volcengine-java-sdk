/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.transitrouter.model.TagFilterForDescribeTransitRouterBandwidthPackagesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterBandwidthPackagesRequest
 */



public class DescribeTransitRouterBandwidthPackagesRequest {
  @SerializedName("LocalGeographicRegionSetId")
  private String localGeographicRegionSetId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PeerGeographicRegionSetId")
  private String peerGeographicRegionSetId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeTransitRouterBandwidthPackagesInput> tagFilters = null;

  @SerializedName("TransitRouterBandwidthPackageIds")
  private List<String> transitRouterBandwidthPackageIds = null;

  @SerializedName("TransitRouterBandwidthPackageName")
  private String transitRouterBandwidthPackageName = null;

  @SerializedName("TransitRouterPeerAttachmentId")
  private String transitRouterPeerAttachmentId = null;

  public DescribeTransitRouterBandwidthPackagesRequest localGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
    return this;
  }

   /**
   * Get localGeographicRegionSetId
   * @return localGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getLocalGeographicRegionSetId() {
    return localGeographicRegionSetId;
  }

  public void setLocalGeographicRegionSetId(String localGeographicRegionSetId) {
    this.localGeographicRegionSetId = localGeographicRegionSetId;
  }

  public DescribeTransitRouterBandwidthPackagesRequest pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterBandwidthPackagesRequest pageSize(Integer pageSize) {
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

  public DescribeTransitRouterBandwidthPackagesRequest peerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
    return this;
  }

   /**
   * Get peerGeographicRegionSetId
   * @return peerGeographicRegionSetId
  **/
  @Schema(description = "")
  public String getPeerGeographicRegionSetId() {
    return peerGeographicRegionSetId;
  }

  public void setPeerGeographicRegionSetId(String peerGeographicRegionSetId) {
    this.peerGeographicRegionSetId = peerGeographicRegionSetId;
  }

  public DescribeTransitRouterBandwidthPackagesRequest projectName(String projectName) {
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

  public DescribeTransitRouterBandwidthPackagesRequest tagFilters(List<TagFilterForDescribeTransitRouterBandwidthPackagesInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeTransitRouterBandwidthPackagesRequest addTagFiltersItem(TagFilterForDescribeTransitRouterBandwidthPackagesInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeTransitRouterBandwidthPackagesInput>();
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
  public List<TagFilterForDescribeTransitRouterBandwidthPackagesInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeTransitRouterBandwidthPackagesInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeTransitRouterBandwidthPackagesRequest transitRouterBandwidthPackageIds(List<String> transitRouterBandwidthPackageIds) {
    this.transitRouterBandwidthPackageIds = transitRouterBandwidthPackageIds;
    return this;
  }

  public DescribeTransitRouterBandwidthPackagesRequest addTransitRouterBandwidthPackageIdsItem(String transitRouterBandwidthPackageIdsItem) {
    if (this.transitRouterBandwidthPackageIds == null) {
      this.transitRouterBandwidthPackageIds = new ArrayList<String>();
    }
    this.transitRouterBandwidthPackageIds.add(transitRouterBandwidthPackageIdsItem);
    return this;
  }

   /**
   * Get transitRouterBandwidthPackageIds
   * @return transitRouterBandwidthPackageIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterBandwidthPackageIds() {
    return transitRouterBandwidthPackageIds;
  }

  public void setTransitRouterBandwidthPackageIds(List<String> transitRouterBandwidthPackageIds) {
    this.transitRouterBandwidthPackageIds = transitRouterBandwidthPackageIds;
  }

  public DescribeTransitRouterBandwidthPackagesRequest transitRouterBandwidthPackageName(String transitRouterBandwidthPackageName) {
    this.transitRouterBandwidthPackageName = transitRouterBandwidthPackageName;
    return this;
  }

   /**
   * Get transitRouterBandwidthPackageName
   * @return transitRouterBandwidthPackageName
  **/
  @Schema(description = "")
  public String getTransitRouterBandwidthPackageName() {
    return transitRouterBandwidthPackageName;
  }

  public void setTransitRouterBandwidthPackageName(String transitRouterBandwidthPackageName) {
    this.transitRouterBandwidthPackageName = transitRouterBandwidthPackageName;
  }

  public DescribeTransitRouterBandwidthPackagesRequest transitRouterPeerAttachmentId(String transitRouterPeerAttachmentId) {
    this.transitRouterPeerAttachmentId = transitRouterPeerAttachmentId;
    return this;
  }

   /**
   * Get transitRouterPeerAttachmentId
   * @return transitRouterPeerAttachmentId
  **/
  @Schema(description = "")
  public String getTransitRouterPeerAttachmentId() {
    return transitRouterPeerAttachmentId;
  }

  public void setTransitRouterPeerAttachmentId(String transitRouterPeerAttachmentId) {
    this.transitRouterPeerAttachmentId = transitRouterPeerAttachmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterBandwidthPackagesRequest describeTransitRouterBandwidthPackagesRequest = (DescribeTransitRouterBandwidthPackagesRequest) o;
    return Objects.equals(this.localGeographicRegionSetId, describeTransitRouterBandwidthPackagesRequest.localGeographicRegionSetId) &&
        Objects.equals(this.pageNumber, describeTransitRouterBandwidthPackagesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterBandwidthPackagesRequest.pageSize) &&
        Objects.equals(this.peerGeographicRegionSetId, describeTransitRouterBandwidthPackagesRequest.peerGeographicRegionSetId) &&
        Objects.equals(this.projectName, describeTransitRouterBandwidthPackagesRequest.projectName) &&
        Objects.equals(this.tagFilters, describeTransitRouterBandwidthPackagesRequest.tagFilters) &&
        Objects.equals(this.transitRouterBandwidthPackageIds, describeTransitRouterBandwidthPackagesRequest.transitRouterBandwidthPackageIds) &&
        Objects.equals(this.transitRouterBandwidthPackageName, describeTransitRouterBandwidthPackagesRequest.transitRouterBandwidthPackageName) &&
        Objects.equals(this.transitRouterPeerAttachmentId, describeTransitRouterBandwidthPackagesRequest.transitRouterPeerAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localGeographicRegionSetId, pageNumber, pageSize, peerGeographicRegionSetId, projectName, tagFilters, transitRouterBandwidthPackageIds, transitRouterBandwidthPackageName, transitRouterPeerAttachmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterBandwidthPackagesRequest {\n");
    
    sb.append("    localGeographicRegionSetId: ").append(toIndentedString(localGeographicRegionSetId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    peerGeographicRegionSetId: ").append(toIndentedString(peerGeographicRegionSetId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    transitRouterBandwidthPackageIds: ").append(toIndentedString(transitRouterBandwidthPackageIds)).append("\n");
    sb.append("    transitRouterBandwidthPackageName: ").append(toIndentedString(transitRouterBandwidthPackageName)).append("\n");
    sb.append("    transitRouterPeerAttachmentId: ").append(toIndentedString(transitRouterPeerAttachmentId)).append("\n");
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