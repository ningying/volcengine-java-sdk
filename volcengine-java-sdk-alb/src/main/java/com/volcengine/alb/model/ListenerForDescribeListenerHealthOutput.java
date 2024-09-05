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
import com.volcengine.alb.model.ResultForDescribeListenerHealthOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListenerForDescribeListenerHealthOutput
 */



public class ListenerForDescribeListenerHealthOutput {
  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("Results")
  private List<ResultForDescribeListenerHealthOutput> results = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TotalBackendServerCount")
  private Integer totalBackendServerCount = null;

  @SerializedName("UnHealthyCount")
  private Integer unHealthyCount = null;

  public ListenerForDescribeListenerHealthOutput listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @Schema(description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ListenerForDescribeListenerHealthOutput results(List<ResultForDescribeListenerHealthOutput> results) {
    this.results = results;
    return this;
  }

  public ListenerForDescribeListenerHealthOutput addResultsItem(ResultForDescribeListenerHealthOutput resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultForDescribeListenerHealthOutput>();
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
  public List<ResultForDescribeListenerHealthOutput> getResults() {
    return results;
  }

  public void setResults(List<ResultForDescribeListenerHealthOutput> results) {
    this.results = results;
  }

  public ListenerForDescribeListenerHealthOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ListenerForDescribeListenerHealthOutput totalBackendServerCount(Integer totalBackendServerCount) {
    this.totalBackendServerCount = totalBackendServerCount;
    return this;
  }

   /**
   * Get totalBackendServerCount
   * @return totalBackendServerCount
  **/
  @Schema(description = "")
  public Integer getTotalBackendServerCount() {
    return totalBackendServerCount;
  }

  public void setTotalBackendServerCount(Integer totalBackendServerCount) {
    this.totalBackendServerCount = totalBackendServerCount;
  }

  public ListenerForDescribeListenerHealthOutput unHealthyCount(Integer unHealthyCount) {
    this.unHealthyCount = unHealthyCount;
    return this;
  }

   /**
   * Get unHealthyCount
   * @return unHealthyCount
  **/
  @Schema(description = "")
  public Integer getUnHealthyCount() {
    return unHealthyCount;
  }

  public void setUnHealthyCount(Integer unHealthyCount) {
    this.unHealthyCount = unHealthyCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenerForDescribeListenerHealthOutput listenerForDescribeListenerHealthOutput = (ListenerForDescribeListenerHealthOutput) o;
    return Objects.equals(this.listenerId, listenerForDescribeListenerHealthOutput.listenerId) &&
        Objects.equals(this.results, listenerForDescribeListenerHealthOutput.results) &&
        Objects.equals(this.status, listenerForDescribeListenerHealthOutput.status) &&
        Objects.equals(this.totalBackendServerCount, listenerForDescribeListenerHealthOutput.totalBackendServerCount) &&
        Objects.equals(this.unHealthyCount, listenerForDescribeListenerHealthOutput.unHealthyCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerId, results, status, totalBackendServerCount, unHealthyCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerForDescribeListenerHealthOutput {\n");
    
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalBackendServerCount: ").append(toIndentedString(totalBackendServerCount)).append("\n");
    sb.append("    unHealthyCount: ").append(toIndentedString(unHealthyCount)).append("\n");
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
