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
import com.volcengine.dcdn.model.ResultForDescribeDomainUVDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDomainUVDataResponse
 */


public class DescribeDomainUVDataResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DataInterval")
  private Integer dataInterval = null;

  @SerializedName("DomainName")
  private String domainName = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Results")
  private List<ResultForDescribeDomainUVDataOutput> results = null;

  @SerializedName("StartTime")
  private String startTime = null;

  public DescribeDomainUVDataResponse dataInterval(Integer dataInterval) {
    this.dataInterval = dataInterval;
    return this;
  }

   /**
   * Get dataInterval
   * @return dataInterval
  **/
  @Schema(description = "")
  public Integer getDataInterval() {
    return dataInterval;
  }

  public void setDataInterval(Integer dataInterval) {
    this.dataInterval = dataInterval;
  }

  public DescribeDomainUVDataResponse domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public DescribeDomainUVDataResponse endTime(String endTime) {
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

  public DescribeDomainUVDataResponse results(List<ResultForDescribeDomainUVDataOutput> results) {
    this.results = results;
    return this;
  }

  public DescribeDomainUVDataResponse addResultsItem(ResultForDescribeDomainUVDataOutput resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultForDescribeDomainUVDataOutput>();
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
  public List<ResultForDescribeDomainUVDataOutput> getResults() {
    return results;
  }

  public void setResults(List<ResultForDescribeDomainUVDataOutput> results) {
    this.results = results;
  }

  public DescribeDomainUVDataResponse startTime(String startTime) {
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
    DescribeDomainUVDataResponse describeDomainUVDataResponse = (DescribeDomainUVDataResponse) o;
    return Objects.equals(this.dataInterval, describeDomainUVDataResponse.dataInterval) &&
        Objects.equals(this.domainName, describeDomainUVDataResponse.domainName) &&
        Objects.equals(this.endTime, describeDomainUVDataResponse.endTime) &&
        Objects.equals(this.results, describeDomainUVDataResponse.results) &&
        Objects.equals(this.startTime, describeDomainUVDataResponse.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInterval, domainName, endTime, results, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDomainUVDataResponse {\n");
    
    sb.append("    dataInterval: ").append(toIndentedString(dataInterval)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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