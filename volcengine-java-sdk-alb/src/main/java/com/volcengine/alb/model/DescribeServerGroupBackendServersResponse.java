/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.ServerForDescribeServerGroupBackendServersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeServerGroupBackendServersResponse
 */



public class DescribeServerGroupBackendServersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Servers")
  private List<ServerForDescribeServerGroupBackendServersOutput> servers = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeServerGroupBackendServersResponse pageNumber(Integer pageNumber) {
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

  public DescribeServerGroupBackendServersResponse pageSize(Integer pageSize) {
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

  public DescribeServerGroupBackendServersResponse requestId(String requestId) {
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

  public DescribeServerGroupBackendServersResponse servers(List<ServerForDescribeServerGroupBackendServersOutput> servers) {
    this.servers = servers;
    return this;
  }

  public DescribeServerGroupBackendServersResponse addServersItem(ServerForDescribeServerGroupBackendServersOutput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForDescribeServerGroupBackendServersOutput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForDescribeServerGroupBackendServersOutput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForDescribeServerGroupBackendServersOutput> servers) {
    this.servers = servers;
  }

  public DescribeServerGroupBackendServersResponse totalCount(Integer totalCount) {
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
    DescribeServerGroupBackendServersResponse describeServerGroupBackendServersResponse = (DescribeServerGroupBackendServersResponse) o;
    return Objects.equals(this.pageNumber, describeServerGroupBackendServersResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeServerGroupBackendServersResponse.pageSize) &&
        Objects.equals(this.requestId, describeServerGroupBackendServersResponse.requestId) &&
        Objects.equals(this.servers, describeServerGroupBackendServersResponse.servers) &&
        Objects.equals(this.totalCount, describeServerGroupBackendServersResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, servers, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerGroupBackendServersResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
