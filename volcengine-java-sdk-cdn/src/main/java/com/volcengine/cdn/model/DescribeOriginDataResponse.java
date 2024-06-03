/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.MetricDataListForDescribeOriginDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeOriginDataResponse
 */



public class DescribeOriginDataResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("MetricDataList")
  private List<MetricDataListForDescribeOriginDataOutput> metricDataList = null;

  public DescribeOriginDataResponse metricDataList(List<MetricDataListForDescribeOriginDataOutput> metricDataList) {
    this.metricDataList = metricDataList;
    return this;
  }

  public DescribeOriginDataResponse addMetricDataListItem(MetricDataListForDescribeOriginDataOutput metricDataListItem) {
    if (this.metricDataList == null) {
      this.metricDataList = new ArrayList<MetricDataListForDescribeOriginDataOutput>();
    }
    this.metricDataList.add(metricDataListItem);
    return this;
  }

   /**
   * Get metricDataList
   * @return metricDataList
  **/
  @Valid
  @Schema(description = "")
  public List<MetricDataListForDescribeOriginDataOutput> getMetricDataList() {
    return metricDataList;
  }

  public void setMetricDataList(List<MetricDataListForDescribeOriginDataOutput> metricDataList) {
    this.metricDataList = metricDataList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeOriginDataResponse describeOriginDataResponse = (DescribeOriginDataResponse) o;
    return Objects.equals(this.metricDataList, describeOriginDataResponse.metricDataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricDataList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeOriginDataResponse {\n");
    
    sb.append("    metricDataList: ").append(toIndentedString(metricDataList)).append("\n");
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