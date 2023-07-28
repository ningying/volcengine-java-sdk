/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.TopicsInfoForDescribeTopicsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTopicsResponse
 */


public class DescribeTopicsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("TopicsInfo")
  private List<TopicsInfoForDescribeTopicsOutput> topicsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeTopicsResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeTopicsResponse topicsInfo(List<TopicsInfoForDescribeTopicsOutput> topicsInfo) {
    this.topicsInfo = topicsInfo;
    return this;
  }

  public DescribeTopicsResponse addTopicsInfoItem(TopicsInfoForDescribeTopicsOutput topicsInfoItem) {
    if (this.topicsInfo == null) {
      this.topicsInfo = new ArrayList<TopicsInfoForDescribeTopicsOutput>();
    }
    this.topicsInfo.add(topicsInfoItem);
    return this;
  }

   /**
   * Get topicsInfo
   * @return topicsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<TopicsInfoForDescribeTopicsOutput> getTopicsInfo() {
    return topicsInfo;
  }

  public void setTopicsInfo(List<TopicsInfoForDescribeTopicsOutput> topicsInfo) {
    this.topicsInfo = topicsInfo;
  }

  public DescribeTopicsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTopicsResponse describeTopicsResponse = (DescribeTopicsResponse) o;
    return Objects.equals(this.instanceId, describeTopicsResponse.instanceId) &&
        Objects.equals(this.topicsInfo, describeTopicsResponse.topicsInfo) &&
        Objects.equals(this.total, describeTopicsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, topicsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopicsResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    topicsInfo: ").append(toIndentedString(topicsInfo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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