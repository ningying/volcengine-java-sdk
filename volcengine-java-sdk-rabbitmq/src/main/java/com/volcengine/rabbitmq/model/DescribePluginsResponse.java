/*
 * rabbitmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rabbitmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rabbitmq.model.PluginsInfoForDescribePluginsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribePluginsResponse
 */



public class DescribePluginsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("PluginsInfo")
  private List<PluginsInfoForDescribePluginsOutput> pluginsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribePluginsResponse instanceId(String instanceId) {
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

  public DescribePluginsResponse pluginsInfo(List<PluginsInfoForDescribePluginsOutput> pluginsInfo) {
    this.pluginsInfo = pluginsInfo;
    return this;
  }

  public DescribePluginsResponse addPluginsInfoItem(PluginsInfoForDescribePluginsOutput pluginsInfoItem) {
    if (this.pluginsInfo == null) {
      this.pluginsInfo = new ArrayList<PluginsInfoForDescribePluginsOutput>();
    }
    this.pluginsInfo.add(pluginsInfoItem);
    return this;
  }

   /**
   * Get pluginsInfo
   * @return pluginsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<PluginsInfoForDescribePluginsOutput> getPluginsInfo() {
    return pluginsInfo;
  }

  public void setPluginsInfo(List<PluginsInfoForDescribePluginsOutput> pluginsInfo) {
    this.pluginsInfo = pluginsInfo;
  }

  public DescribePluginsResponse total(Integer total) {
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
    DescribePluginsResponse describePluginsResponse = (DescribePluginsResponse) o;
    return Objects.equals(this.instanceId, describePluginsResponse.instanceId) &&
        Objects.equals(this.pluginsInfo, describePluginsResponse.pluginsInfo) &&
        Objects.equals(this.total, describePluginsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, pluginsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePluginsResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    pluginsInfo: ").append(toIndentedString(pluginsInfo)).append("\n");
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