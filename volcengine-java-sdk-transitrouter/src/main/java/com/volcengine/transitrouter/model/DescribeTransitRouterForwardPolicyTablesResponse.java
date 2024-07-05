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
import com.volcengine.transitrouter.model.TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterForwardPolicyTablesResponse
 */



public class DescribeTransitRouterForwardPolicyTablesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("TransitRouterForwardPolicyTables")
  private List<TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput> transitRouterForwardPolicyTables = null;

  public DescribeTransitRouterForwardPolicyTablesResponse pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterForwardPolicyTablesResponse pageSize(Integer pageSize) {
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

  public DescribeTransitRouterForwardPolicyTablesResponse totalCount(Integer totalCount) {
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

  public DescribeTransitRouterForwardPolicyTablesResponse transitRouterForwardPolicyTables(List<TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput> transitRouterForwardPolicyTables) {
    this.transitRouterForwardPolicyTables = transitRouterForwardPolicyTables;
    return this;
  }

  public DescribeTransitRouterForwardPolicyTablesResponse addTransitRouterForwardPolicyTablesItem(TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput transitRouterForwardPolicyTablesItem) {
    if (this.transitRouterForwardPolicyTables == null) {
      this.transitRouterForwardPolicyTables = new ArrayList<TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput>();
    }
    this.transitRouterForwardPolicyTables.add(transitRouterForwardPolicyTablesItem);
    return this;
  }

   /**
   * Get transitRouterForwardPolicyTables
   * @return transitRouterForwardPolicyTables
  **/
  @Valid
  @Schema(description = "")
  public List<TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput> getTransitRouterForwardPolicyTables() {
    return transitRouterForwardPolicyTables;
  }

  public void setTransitRouterForwardPolicyTables(List<TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput> transitRouterForwardPolicyTables) {
    this.transitRouterForwardPolicyTables = transitRouterForwardPolicyTables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterForwardPolicyTablesResponse describeTransitRouterForwardPolicyTablesResponse = (DescribeTransitRouterForwardPolicyTablesResponse) o;
    return Objects.equals(this.pageNumber, describeTransitRouterForwardPolicyTablesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterForwardPolicyTablesResponse.pageSize) &&
        Objects.equals(this.totalCount, describeTransitRouterForwardPolicyTablesResponse.totalCount) &&
        Objects.equals(this.transitRouterForwardPolicyTables, describeTransitRouterForwardPolicyTablesResponse.transitRouterForwardPolicyTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, transitRouterForwardPolicyTables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterForwardPolicyTablesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    transitRouterForwardPolicyTables: ").append(toIndentedString(transitRouterForwardPolicyTables)).append("\n");
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
