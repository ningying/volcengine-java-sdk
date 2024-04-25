/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.ResultForDescribeOriginRealTimeDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeOriginRealTimeDataResponse
 */


public class DescribeOriginRealTimeDataResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DomainCount")
  private Integer domainCount = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Metrics")
  private List<String> metrics = null;

  @SerializedName("Results")
  private List<ResultForDescribeOriginRealTimeDataOutput> results = null;

  @SerializedName("StartTime")
  private String startTime = null;

  public DescribeOriginRealTimeDataResponse domainCount(Integer domainCount) {
    this.domainCount = domainCount;
    return this;
  }

   /**
   * Get domainCount
   * @return domainCount
  **/
  @Schema(description = "")
  public Integer getDomainCount() {
    return domainCount;
  }

  public void setDomainCount(Integer domainCount) {
    this.domainCount = domainCount;
  }

  public DescribeOriginRealTimeDataResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeOriginRealTimeDataResponse metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DescribeOriginRealTimeDataResponse addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<String>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public DescribeOriginRealTimeDataResponse results(List<ResultForDescribeOriginRealTimeDataOutput> results) {
    this.results = results;
    return this;
  }

  public DescribeOriginRealTimeDataResponse addResultsItem(ResultForDescribeOriginRealTimeDataOutput resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultForDescribeOriginRealTimeDataOutput>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Valid
  @Schema(description = "")
  public List<ResultForDescribeOriginRealTimeDataOutput> getResults() {
    return results;
  }

  public void setResults(List<ResultForDescribeOriginRealTimeDataOutput> results) {
    this.results = results;
  }

  public DescribeOriginRealTimeDataResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeOriginRealTimeDataResponse describeOriginRealTimeDataResponse = (DescribeOriginRealTimeDataResponse) o;
    return Objects.equals(this.domainCount, describeOriginRealTimeDataResponse.domainCount) &&
        Objects.equals(this.endTime, describeOriginRealTimeDataResponse.endTime) &&
        Objects.equals(this.metrics, describeOriginRealTimeDataResponse.metrics) &&
        Objects.equals(this.results, describeOriginRealTimeDataResponse.results) &&
        Objects.equals(this.startTime, describeOriginRealTimeDataResponse.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainCount, endTime, metrics, results, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeOriginRealTimeDataResponse {\n");
    
    sb.append("    domainCount: ").append(toIndentedString(domainCount)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
