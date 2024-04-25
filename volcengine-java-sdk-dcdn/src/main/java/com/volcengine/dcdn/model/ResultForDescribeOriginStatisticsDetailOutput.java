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
import com.volcengine.dcdn.model.RealTimeResultForDescribeOriginStatisticsDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResultForDescribeOriginStatisticsDetailOutput
 */


public class ResultForDescribeOriginStatisticsDetailOutput {
  @SerializedName("RealTimeResults")
  private List<RealTimeResultForDescribeOriginStatisticsDetailOutput> realTimeResults = null;

  @SerializedName("TimeStamp")
  private String timeStamp = null;

  public ResultForDescribeOriginStatisticsDetailOutput realTimeResults(List<RealTimeResultForDescribeOriginStatisticsDetailOutput> realTimeResults) {
    this.realTimeResults = realTimeResults;
    return this;
  }

  public ResultForDescribeOriginStatisticsDetailOutput addRealTimeResultsItem(RealTimeResultForDescribeOriginStatisticsDetailOutput realTimeResultsItem) {
    if (this.realTimeResults == null) {
      this.realTimeResults = new ArrayList<RealTimeResultForDescribeOriginStatisticsDetailOutput>();
    }
    this.realTimeResults.add(realTimeResultsItem);
    return this;
  }

   /**
   * Get realTimeResults
   * @return realTimeResults
  **/
  @Valid
  @Schema(description = "")
  public List<RealTimeResultForDescribeOriginStatisticsDetailOutput> getRealTimeResults() {
    return realTimeResults;
  }

  public void setRealTimeResults(List<RealTimeResultForDescribeOriginStatisticsDetailOutput> realTimeResults) {
    this.realTimeResults = realTimeResults;
  }

  public ResultForDescribeOriginStatisticsDetailOutput timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @Schema(description = "")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultForDescribeOriginStatisticsDetailOutput resultForDescribeOriginStatisticsDetailOutput = (ResultForDescribeOriginStatisticsDetailOutput) o;
    return Objects.equals(this.realTimeResults, resultForDescribeOriginStatisticsDetailOutput.realTimeResults) &&
        Objects.equals(this.timeStamp, resultForDescribeOriginStatisticsDetailOutput.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realTimeResults, timeStamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultForDescribeOriginStatisticsDetailOutput {\n");
    
    sb.append("    realTimeResults: ").append(toIndentedString(realTimeResults)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
