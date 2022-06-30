/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * DescribeServerGroupsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:03.376515+08:00[Asia/Shanghai]")
public class DescribeServerGroupsRequest {
  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ServerGroupIds")
  private List<String> serverGroupIds = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  public DescribeServerGroupsRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public DescribeServerGroupsRequest pageNumber(Integer pageNumber) {
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

  public DescribeServerGroupsRequest pageSize(Integer pageSize) {
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

  public DescribeServerGroupsRequest serverGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
    return this;
  }

  public DescribeServerGroupsRequest addServerGroupIdsItem(String serverGroupIdsItem) {
    if (this.serverGroupIds == null) {
      this.serverGroupIds = new ArrayList<String>();
    }
    this.serverGroupIds.add(serverGroupIdsItem);
    return this;
  }

   /**
   * Get serverGroupIds
   * @return serverGroupIds
  **/
  @Schema(description = "")
  public List<String> getServerGroupIds() {
    return serverGroupIds;
  }

  public void setServerGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
  }

  public DescribeServerGroupsRequest serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeServerGroupsRequest describeServerGroupsRequest = (DescribeServerGroupsRequest) o;
    return Objects.equals(this.loadBalancerId, describeServerGroupsRequest.loadBalancerId) &&
        Objects.equals(this.pageNumber, describeServerGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeServerGroupsRequest.pageSize) &&
        Objects.equals(this.serverGroupIds, describeServerGroupsRequest.serverGroupIds) &&
        Objects.equals(this.serverGroupName, describeServerGroupsRequest.serverGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerId, pageNumber, pageSize, serverGroupIds, serverGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerGroupsRequest {\n");
    
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    serverGroupIds: ").append(toIndentedString(serverGroupIds)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
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
