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
 * DescribeTransitRouterTrafficQosQueueEntriesRequest
 */



public class DescribeTransitRouterTrafficQosQueueEntriesRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TransitRouterTrafficQosQueueEntryIds")
  private List<String> transitRouterTrafficQosQueueEntryIds = null;

  @SerializedName("TransitRouterTrafficQosQueueEntryName")
  private String transitRouterTrafficQosQueueEntryName = null;

  @SerializedName("TransitRouterTrafficQosQueuePolicyId")
  private String transitRouterTrafficQosQueuePolicyId = null;

  public DescribeTransitRouterTrafficQosQueueEntriesRequest pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterTrafficQosQueueEntriesRequest pageSize(Integer pageSize) {
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

  public DescribeTransitRouterTrafficQosQueueEntriesRequest transitRouterTrafficQosQueueEntryIds(List<String> transitRouterTrafficQosQueueEntryIds) {
    this.transitRouterTrafficQosQueueEntryIds = transitRouterTrafficQosQueueEntryIds;
    return this;
  }

  public DescribeTransitRouterTrafficQosQueueEntriesRequest addTransitRouterTrafficQosQueueEntryIdsItem(String transitRouterTrafficQosQueueEntryIdsItem) {
    if (this.transitRouterTrafficQosQueueEntryIds == null) {
      this.transitRouterTrafficQosQueueEntryIds = new ArrayList<String>();
    }
    this.transitRouterTrafficQosQueueEntryIds.add(transitRouterTrafficQosQueueEntryIdsItem);
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueueEntryIds
   * @return transitRouterTrafficQosQueueEntryIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterTrafficQosQueueEntryIds() {
    return transitRouterTrafficQosQueueEntryIds;
  }

  public void setTransitRouterTrafficQosQueueEntryIds(List<String> transitRouterTrafficQosQueueEntryIds) {
    this.transitRouterTrafficQosQueueEntryIds = transitRouterTrafficQosQueueEntryIds;
  }

  public DescribeTransitRouterTrafficQosQueueEntriesRequest transitRouterTrafficQosQueueEntryName(String transitRouterTrafficQosQueueEntryName) {
    this.transitRouterTrafficQosQueueEntryName = transitRouterTrafficQosQueueEntryName;
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueueEntryName
   * @return transitRouterTrafficQosQueueEntryName
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosQueueEntryName() {
    return transitRouterTrafficQosQueueEntryName;
  }

  public void setTransitRouterTrafficQosQueueEntryName(String transitRouterTrafficQosQueueEntryName) {
    this.transitRouterTrafficQosQueueEntryName = transitRouterTrafficQosQueueEntryName;
  }

  public DescribeTransitRouterTrafficQosQueueEntriesRequest transitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueuePolicyId
   * @return transitRouterTrafficQosQueuePolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterTrafficQosQueuePolicyId() {
    return transitRouterTrafficQosQueuePolicyId;
  }

  public void setTransitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterTrafficQosQueueEntriesRequest describeTransitRouterTrafficQosQueueEntriesRequest = (DescribeTransitRouterTrafficQosQueueEntriesRequest) o;
    return Objects.equals(this.pageNumber, describeTransitRouterTrafficQosQueueEntriesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterTrafficQosQueueEntriesRequest.pageSize) &&
        Objects.equals(this.transitRouterTrafficQosQueueEntryIds, describeTransitRouterTrafficQosQueueEntriesRequest.transitRouterTrafficQosQueueEntryIds) &&
        Objects.equals(this.transitRouterTrafficQosQueueEntryName, describeTransitRouterTrafficQosQueueEntriesRequest.transitRouterTrafficQosQueueEntryName) &&
        Objects.equals(this.transitRouterTrafficQosQueuePolicyId, describeTransitRouterTrafficQosQueueEntriesRequest.transitRouterTrafficQosQueuePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, transitRouterTrafficQosQueueEntryIds, transitRouterTrafficQosQueueEntryName, transitRouterTrafficQosQueuePolicyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterTrafficQosQueueEntriesRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    transitRouterTrafficQosQueueEntryIds: ").append(toIndentedString(transitRouterTrafficQosQueueEntryIds)).append("\n");
    sb.append("    transitRouterTrafficQosQueueEntryName: ").append(toIndentedString(transitRouterTrafficQosQueueEntryName)).append("\n");
    sb.append("    transitRouterTrafficQosQueuePolicyId: ").append(toIndentedString(transitRouterTrafficQosQueuePolicyId)).append("\n");
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
