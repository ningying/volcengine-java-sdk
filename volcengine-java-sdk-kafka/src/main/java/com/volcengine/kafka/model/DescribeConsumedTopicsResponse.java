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
import com.volcengine.kafka.model.ConsumedTopicsInfoForDescribeConsumedTopicsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeConsumedTopicsResponse
 */


public class DescribeConsumedTopicsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Accumulation")
  private Long accumulation = null;

  @SerializedName("ConsumedTopicsInfo")
  private List<ConsumedTopicsInfoForDescribeConsumedTopicsOutput> consumedTopicsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeConsumedTopicsResponse accumulation(Long accumulation) {
    this.accumulation = accumulation;
    return this;
  }

   /**
   * Get accumulation
   * @return accumulation
  **/
  @Schema(description = "")
  public Long getAccumulation() {
    return accumulation;
  }

  public void setAccumulation(Long accumulation) {
    this.accumulation = accumulation;
  }

  public DescribeConsumedTopicsResponse consumedTopicsInfo(List<ConsumedTopicsInfoForDescribeConsumedTopicsOutput> consumedTopicsInfo) {
    this.consumedTopicsInfo = consumedTopicsInfo;
    return this;
  }

  public DescribeConsumedTopicsResponse addConsumedTopicsInfoItem(ConsumedTopicsInfoForDescribeConsumedTopicsOutput consumedTopicsInfoItem) {
    if (this.consumedTopicsInfo == null) {
      this.consumedTopicsInfo = new ArrayList<ConsumedTopicsInfoForDescribeConsumedTopicsOutput>();
    }
    this.consumedTopicsInfo.add(consumedTopicsInfoItem);
    return this;
  }

   /**
   * Get consumedTopicsInfo
   * @return consumedTopicsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ConsumedTopicsInfoForDescribeConsumedTopicsOutput> getConsumedTopicsInfo() {
    return consumedTopicsInfo;
  }

  public void setConsumedTopicsInfo(List<ConsumedTopicsInfoForDescribeConsumedTopicsOutput> consumedTopicsInfo) {
    this.consumedTopicsInfo = consumedTopicsInfo;
  }

  public DescribeConsumedTopicsResponse total(Integer total) {
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
    DescribeConsumedTopicsResponse describeConsumedTopicsResponse = (DescribeConsumedTopicsResponse) o;
    return Objects.equals(this.accumulation, describeConsumedTopicsResponse.accumulation) &&
        Objects.equals(this.consumedTopicsInfo, describeConsumedTopicsResponse.consumedTopicsInfo) &&
        Objects.equals(this.total, describeConsumedTopicsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulation, consumedTopicsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeConsumedTopicsResponse {\n");
    
    sb.append("    accumulation: ").append(toIndentedString(accumulation)).append("\n");
    sb.append("    consumedTopicsInfo: ").append(toIndentedString(consumedTopicsInfo)).append("\n");
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