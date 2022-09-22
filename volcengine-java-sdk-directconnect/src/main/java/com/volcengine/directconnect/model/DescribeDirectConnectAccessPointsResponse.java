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
import com.volcengine.directconnect.model.DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectAccessPointsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:22.987183+08:00[Asia/Shanghai]")
public class DescribeDirectConnectAccessPointsResponse {
  @SerializedName("DirectConnectAccessPoints")
  private List<DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput> directConnectAccessPoints = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeDirectConnectAccessPointsResponse directConnectAccessPoints(List<DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput> directConnectAccessPoints) {
    this.directConnectAccessPoints = directConnectAccessPoints;
    return this;
  }

  public DescribeDirectConnectAccessPointsResponse addDirectConnectAccessPointsItem(DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput directConnectAccessPointsItem) {
    if (this.directConnectAccessPoints == null) {
      this.directConnectAccessPoints = new ArrayList<DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput>();
    }
    this.directConnectAccessPoints.add(directConnectAccessPointsItem);
    return this;
  }

   /**
   * Get directConnectAccessPoints
   * @return directConnectAccessPoints
  **/
  @Valid
  @Schema(description = "")
  public List<DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput> getDirectConnectAccessPoints() {
    return directConnectAccessPoints;
  }

  public void setDirectConnectAccessPoints(List<DirectConnectAccessPointForDescribeDirectConnectAccessPointsOutput> directConnectAccessPoints) {
    this.directConnectAccessPoints = directConnectAccessPoints;
  }

  public DescribeDirectConnectAccessPointsResponse pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectAccessPointsResponse pageSize(Integer pageSize) {
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

  public DescribeDirectConnectAccessPointsResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeDirectConnectAccessPointsResponse totalCount(Integer totalCount) {
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
    DescribeDirectConnectAccessPointsResponse describeDirectConnectAccessPointsResponse = (DescribeDirectConnectAccessPointsResponse) o;
    return Objects.equals(this.directConnectAccessPoints, describeDirectConnectAccessPointsResponse.directConnectAccessPoints) &&
        Objects.equals(this.pageNumber, describeDirectConnectAccessPointsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectAccessPointsResponse.pageSize) &&
        Objects.equals(this.requestId, describeDirectConnectAccessPointsResponse.requestId) &&
        Objects.equals(this.totalCount, describeDirectConnectAccessPointsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectAccessPoints, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectAccessPointsResponse {\n");
    
    sb.append("    directConnectAccessPoints: ").append(toIndentedString(directConnectAccessPoints)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
