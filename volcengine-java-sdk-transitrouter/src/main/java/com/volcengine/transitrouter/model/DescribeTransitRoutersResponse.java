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
import com.volcengine.transitrouter.model.TransitRouterForDescribeTransitRoutersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRoutersResponse
 */



public class DescribeTransitRoutersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("TransitRouters")
  private List<TransitRouterForDescribeTransitRoutersOutput> transitRouters = null;

  public DescribeTransitRoutersResponse pageNumber(Integer pageNumber) {
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

  public DescribeTransitRoutersResponse pageSize(Integer pageSize) {
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

  public DescribeTransitRoutersResponse totalCount(Integer totalCount) {
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

  public DescribeTransitRoutersResponse transitRouters(List<TransitRouterForDescribeTransitRoutersOutput> transitRouters) {
    this.transitRouters = transitRouters;
    return this;
  }

  public DescribeTransitRoutersResponse addTransitRoutersItem(TransitRouterForDescribeTransitRoutersOutput transitRoutersItem) {
    if (this.transitRouters == null) {
      this.transitRouters = new ArrayList<TransitRouterForDescribeTransitRoutersOutput>();
    }
    this.transitRouters.add(transitRoutersItem);
    return this;
  }

   /**
   * Get transitRouters
   * @return transitRouters
  **/
  @Valid
  @Schema(description = "")
  public List<TransitRouterForDescribeTransitRoutersOutput> getTransitRouters() {
    return transitRouters;
  }

  public void setTransitRouters(List<TransitRouterForDescribeTransitRoutersOutput> transitRouters) {
    this.transitRouters = transitRouters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRoutersResponse describeTransitRoutersResponse = (DescribeTransitRoutersResponse) o;
    return Objects.equals(this.pageNumber, describeTransitRoutersResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRoutersResponse.pageSize) &&
        Objects.equals(this.totalCount, describeTransitRoutersResponse.totalCount) &&
        Objects.equals(this.transitRouters, describeTransitRoutersResponse.transitRouters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, transitRouters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRoutersResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    transitRouters: ").append(toIndentedString(transitRouters)).append("\n");
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