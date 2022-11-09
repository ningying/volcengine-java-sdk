/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.TagFilterForDescribeDirectConnectConnectionsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectConnectionsRequest
 */


public class DescribeDirectConnectConnectionsRequest {
  @SerializedName("AccessPoint")
  private String accessPoint = null;

  @SerializedName("ConnectionType")
  private String connectionType = null;

  @SerializedName("DirectConnectConnectionIds")
  private List<String> directConnectConnectionIds = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("LineOperator")
  private String lineOperator = null;

  @SerializedName("Operator")
  private String operator = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeDirectConnectConnectionsInput> tagFilters = null;

  public DescribeDirectConnectConnectionsRequest accessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

   /**
   * Get accessPoint
   * @return accessPoint
  **/
  @Schema(description = "")
  public String getAccessPoint() {
    return accessPoint;
  }

  public void setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
  }

  public DescribeDirectConnectConnectionsRequest connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @Schema(description = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public DescribeDirectConnectConnectionsRequest directConnectConnectionIds(List<String> directConnectConnectionIds) {
    this.directConnectConnectionIds = directConnectConnectionIds;
    return this;
  }

  public DescribeDirectConnectConnectionsRequest addDirectConnectConnectionIdsItem(String directConnectConnectionIdsItem) {
    if (this.directConnectConnectionIds == null) {
      this.directConnectConnectionIds = new ArrayList<String>();
    }
    this.directConnectConnectionIds.add(directConnectConnectionIdsItem);
    return this;
  }

   /**
   * Get directConnectConnectionIds
   * @return directConnectConnectionIds
  **/
  @Schema(description = "")
  public List<String> getDirectConnectConnectionIds() {
    return directConnectConnectionIds;
  }

  public void setDirectConnectConnectionIds(List<String> directConnectConnectionIds) {
    this.directConnectConnectionIds = directConnectConnectionIds;
  }

  public DescribeDirectConnectConnectionsRequest directConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
    return this;
  }

   /**
   * Get directConnectConnectionName
   * @return directConnectConnectionName
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionName() {
    return directConnectConnectionName;
  }

  public void setDirectConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
  }

  public DescribeDirectConnectConnectionsRequest lineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
    return this;
  }

   /**
   * Get lineOperator
   * @return lineOperator
  **/
  @Schema(description = "")
  public String getLineOperator() {
    return lineOperator;
  }

  public void setLineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
  }

  public DescribeDirectConnectConnectionsRequest operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public DescribeDirectConnectConnectionsRequest pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectConnectionsRequest pageSize(Integer pageSize) {
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

  public DescribeDirectConnectConnectionsRequest peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @Schema(description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public DescribeDirectConnectConnectionsRequest tagFilters(List<TagFilterForDescribeDirectConnectConnectionsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeDirectConnectConnectionsRequest addTagFiltersItem(TagFilterForDescribeDirectConnectConnectionsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeDirectConnectConnectionsInput>();
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
  public List<TagFilterForDescribeDirectConnectConnectionsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeDirectConnectConnectionsInput> tagFilters) {
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
    DescribeDirectConnectConnectionsRequest describeDirectConnectConnectionsRequest = (DescribeDirectConnectConnectionsRequest) o;
    return Objects.equals(this.accessPoint, describeDirectConnectConnectionsRequest.accessPoint) &&
        Objects.equals(this.connectionType, describeDirectConnectConnectionsRequest.connectionType) &&
        Objects.equals(this.directConnectConnectionIds, describeDirectConnectConnectionsRequest.directConnectConnectionIds) &&
        Objects.equals(this.directConnectConnectionName, describeDirectConnectConnectionsRequest.directConnectConnectionName) &&
        Objects.equals(this.lineOperator, describeDirectConnectConnectionsRequest.lineOperator) &&
        Objects.equals(this.operator, describeDirectConnectConnectionsRequest.operator) &&
        Objects.equals(this.pageNumber, describeDirectConnectConnectionsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectConnectionsRequest.pageSize) &&
        Objects.equals(this.peerLocation, describeDirectConnectConnectionsRequest.peerLocation) &&
        Objects.equals(this.tagFilters, describeDirectConnectConnectionsRequest.tagFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPoint, connectionType, directConnectConnectionIds, directConnectConnectionName, lineOperator, operator, pageNumber, pageSize, peerLocation, tagFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectConnectionsRequest {\n");
    
    sb.append("    accessPoint: ").append(toIndentedString(accessPoint)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    directConnectConnectionIds: ").append(toIndentedString(directConnectConnectionIds)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    lineOperator: ").append(toIndentedString(lineOperator)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
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
