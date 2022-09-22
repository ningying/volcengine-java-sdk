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
 * DescribeHealthCheckLogTopicAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:16.891404+08:00[Asia/Shanghai]")
public class DescribeHealthCheckLogTopicAttributesResponse {
  @SerializedName("LoadBalancerIds")
  private List<String> loadBalancerIds = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public DescribeHealthCheckLogTopicAttributesResponse loadBalancerIds(List<String> loadBalancerIds) {
    this.loadBalancerIds = loadBalancerIds;
    return this;
  }

  public DescribeHealthCheckLogTopicAttributesResponse addLoadBalancerIdsItem(String loadBalancerIdsItem) {
    if (this.loadBalancerIds == null) {
      this.loadBalancerIds = new ArrayList<String>();
    }
    this.loadBalancerIds.add(loadBalancerIdsItem);
    return this;
  }

   /**
   * Get loadBalancerIds
   * @return loadBalancerIds
  **/
  @Schema(description = "")
  public List<String> getLoadBalancerIds() {
    return loadBalancerIds;
  }

  public void setLoadBalancerIds(List<String> loadBalancerIds) {
    this.loadBalancerIds = loadBalancerIds;
  }

  public DescribeHealthCheckLogTopicAttributesResponse requestId(String requestId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeHealthCheckLogTopicAttributesResponse describeHealthCheckLogTopicAttributesResponse = (DescribeHealthCheckLogTopicAttributesResponse) o;
    return Objects.equals(this.loadBalancerIds, describeHealthCheckLogTopicAttributesResponse.loadBalancerIds) &&
        Objects.equals(this.requestId, describeHealthCheckLogTopicAttributesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerIds, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeHealthCheckLogTopicAttributesResponse {\n");
    
    sb.append("    loadBalancerIds: ").append(toIndentedString(loadBalancerIds)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
