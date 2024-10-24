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
import com.volcengine.transitrouter.model.TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterTrafficQosQueueEntriesResponse
 */



public class DescribeTransitRouterTrafficQosQueueEntriesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("TransitRouterTrafficQosQueueEntries")
  private List<TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput> transitRouterTrafficQosQueueEntries = null;

  public DescribeTransitRouterTrafficQosQueueEntriesResponse pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterTrafficQosQueueEntriesResponse pageSize(Integer pageSize) {
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

  public DescribeTransitRouterTrafficQosQueueEntriesResponse totalCount(Integer totalCount) {
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

  public DescribeTransitRouterTrafficQosQueueEntriesResponse transitRouterTrafficQosQueueEntries(List<TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput> transitRouterTrafficQosQueueEntries) {
    this.transitRouterTrafficQosQueueEntries = transitRouterTrafficQosQueueEntries;
    return this;
  }

  public DescribeTransitRouterTrafficQosQueueEntriesResponse addTransitRouterTrafficQosQueueEntriesItem(TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput transitRouterTrafficQosQueueEntriesItem) {
    if (this.transitRouterTrafficQosQueueEntries == null) {
      this.transitRouterTrafficQosQueueEntries = new ArrayList<TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput>();
    }
    this.transitRouterTrafficQosQueueEntries.add(transitRouterTrafficQosQueueEntriesItem);
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueueEntries
   * @return transitRouterTrafficQosQueueEntries
  **/
  @Valid
  @Schema(description = "")
  public List<TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput> getTransitRouterTrafficQosQueueEntries() {
    return transitRouterTrafficQosQueueEntries;
  }

  public void setTransitRouterTrafficQosQueueEntries(List<TransitRouterTrafficQosQueueEntryForDescribeTransitRouterTrafficQosQueueEntriesOutput> transitRouterTrafficQosQueueEntries) {
    this.transitRouterTrafficQosQueueEntries = transitRouterTrafficQosQueueEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterTrafficQosQueueEntriesResponse describeTransitRouterTrafficQosQueueEntriesResponse = (DescribeTransitRouterTrafficQosQueueEntriesResponse) o;
    return Objects.equals(this.pageNumber, describeTransitRouterTrafficQosQueueEntriesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterTrafficQosQueueEntriesResponse.pageSize) &&
        Objects.equals(this.totalCount, describeTransitRouterTrafficQosQueueEntriesResponse.totalCount) &&
        Objects.equals(this.transitRouterTrafficQosQueueEntries, describeTransitRouterTrafficQosQueueEntriesResponse.transitRouterTrafficQosQueueEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, transitRouterTrafficQosQueueEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterTrafficQosQueueEntriesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    transitRouterTrafficQosQueueEntries: ").append(toIndentedString(transitRouterTrafficQosQueueEntries)).append("\n");
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
