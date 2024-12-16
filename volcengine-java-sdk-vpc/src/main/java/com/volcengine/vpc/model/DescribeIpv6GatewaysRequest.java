/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeIpv6GatewaysRequest
 */



public class DescribeIpv6GatewaysRequest {
  @SerializedName("Ipv6GatewayIds")
  private String ipv6GatewayIds = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("VpcIds")
  private String vpcIds = null;

  public DescribeIpv6GatewaysRequest ipv6GatewayIds(String ipv6GatewayIds) {
    this.ipv6GatewayIds = ipv6GatewayIds;
    return this;
  }

   /**
   * Get ipv6GatewayIds
   * @return ipv6GatewayIds
  **/
  @Schema(description = "")
  public String getIpv6GatewayIds() {
    return ipv6GatewayIds;
  }

  public void setIpv6GatewayIds(String ipv6GatewayIds) {
    this.ipv6GatewayIds = ipv6GatewayIds;
  }

  public DescribeIpv6GatewaysRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeIpv6GatewaysRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribeIpv6GatewaysRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeIpv6GatewaysRequest vpcIds(String vpcIds) {
    this.vpcIds = vpcIds;
    return this;
  }

   /**
   * Get vpcIds
   * @return vpcIds
  **/
  @Schema(description = "")
  public String getVpcIds() {
    return vpcIds;
  }

  public void setVpcIds(String vpcIds) {
    this.vpcIds = vpcIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeIpv6GatewaysRequest describeIpv6GatewaysRequest = (DescribeIpv6GatewaysRequest) o;
    return Objects.equals(this.ipv6GatewayIds, describeIpv6GatewaysRequest.ipv6GatewayIds) &&
        Objects.equals(this.maxResults, describeIpv6GatewaysRequest.maxResults) &&
        Objects.equals(this.name, describeIpv6GatewaysRequest.name) &&
        Objects.equals(this.nextToken, describeIpv6GatewaysRequest.nextToken) &&
        Objects.equals(this.vpcIds, describeIpv6GatewaysRequest.vpcIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv6GatewayIds, maxResults, name, nextToken, vpcIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeIpv6GatewaysRequest {\n");
    
    sb.append("    ipv6GatewayIds: ").append(toIndentedString(ipv6GatewayIds)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    vpcIds: ").append(toIndentedString(vpcIds)).append("\n");
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