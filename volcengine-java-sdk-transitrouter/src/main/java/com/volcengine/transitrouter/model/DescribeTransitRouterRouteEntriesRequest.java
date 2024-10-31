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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterRouteEntriesRequest
 */



public class DescribeTransitRouterRouteEntriesRequest {
  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterRouteEntryIds")
  private List<String> transitRouterRouteEntryIds = null;

  @SerializedName("TransitRouterRouteEntryName")
  private String transitRouterRouteEntryName = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  public DescribeTransitRouterRouteEntriesRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DescribeTransitRouterRouteEntriesRequest pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterRouteEntriesRequest pageSize(Integer pageSize) {
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

  public DescribeTransitRouterRouteEntriesRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeTransitRouterRouteEntriesRequest transitRouterRouteEntryIds(List<String> transitRouterRouteEntryIds) {
    this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
    return this;
  }

  public DescribeTransitRouterRouteEntriesRequest addTransitRouterRouteEntryIdsItem(String transitRouterRouteEntryIdsItem) {
    if (this.transitRouterRouteEntryIds == null) {
      this.transitRouterRouteEntryIds = new ArrayList<String>();
    }
    this.transitRouterRouteEntryIds.add(transitRouterRouteEntryIdsItem);
    return this;
  }

   /**
   * Get transitRouterRouteEntryIds
   * @return transitRouterRouteEntryIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterRouteEntryIds() {
    return transitRouterRouteEntryIds;
  }

  public void setTransitRouterRouteEntryIds(List<String> transitRouterRouteEntryIds) {
    this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
  }

  public DescribeTransitRouterRouteEntriesRequest transitRouterRouteEntryName(String transitRouterRouteEntryName) {
    this.transitRouterRouteEntryName = transitRouterRouteEntryName;
    return this;
  }

   /**
   * Get transitRouterRouteEntryName
   * @return transitRouterRouteEntryName
  **/
  @Schema(description = "")
  public String getTransitRouterRouteEntryName() {
    return transitRouterRouteEntryName;
  }

  public void setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
    this.transitRouterRouteEntryName = transitRouterRouteEntryName;
  }

  public DescribeTransitRouterRouteEntriesRequest transitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
    return this;
  }

   /**
   * Get transitRouterRouteTableId
   * @return transitRouterRouteTableId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterRouteTableId() {
    return transitRouterRouteTableId;
  }

  public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterRouteEntriesRequest describeTransitRouterRouteEntriesRequest = (DescribeTransitRouterRouteEntriesRequest) o;
    return Objects.equals(this.destinationCidrBlock, describeTransitRouterRouteEntriesRequest.destinationCidrBlock) &&
        Objects.equals(this.pageNumber, describeTransitRouterRouteEntriesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterRouteEntriesRequest.pageSize) &&
        Objects.equals(this.status, describeTransitRouterRouteEntriesRequest.status) &&
        Objects.equals(this.transitRouterRouteEntryIds, describeTransitRouterRouteEntriesRequest.transitRouterRouteEntryIds) &&
        Objects.equals(this.transitRouterRouteEntryName, describeTransitRouterRouteEntriesRequest.transitRouterRouteEntryName) &&
        Objects.equals(this.transitRouterRouteTableId, describeTransitRouterRouteEntriesRequest.transitRouterRouteTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCidrBlock, pageNumber, pageSize, status, transitRouterRouteEntryIds, transitRouterRouteEntryName, transitRouterRouteTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterRouteEntriesRequest {\n");
    
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterRouteEntryIds: ").append(toIndentedString(transitRouterRouteEntryIds)).append("\n");
    sb.append("    transitRouterRouteEntryName: ").append(toIndentedString(transitRouterRouteEntryName)).append("\n");
    sb.append("    transitRouterRouteTableId: ").append(toIndentedString(transitRouterRouteTableId)).append("\n");
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