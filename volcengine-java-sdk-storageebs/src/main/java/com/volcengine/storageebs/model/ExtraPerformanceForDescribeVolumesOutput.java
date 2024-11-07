/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * ExtraPerformanceForDescribeVolumesOutput
 */



public class ExtraPerformanceForDescribeVolumesOutput {
  @SerializedName("ExtraPerformanceTypeId")
  private String extraPerformanceTypeId = null;

  @SerializedName("IOPS")
  private Integer IOPS = null;

  @SerializedName("Throughput")
  private Integer throughput = null;

  public ExtraPerformanceForDescribeVolumesOutput extraPerformanceTypeId(String extraPerformanceTypeId) {
    this.extraPerformanceTypeId = extraPerformanceTypeId;
    return this;
  }

   /**
   * Get extraPerformanceTypeId
   * @return extraPerformanceTypeId
  **/
  @Schema(description = "")
  public String getExtraPerformanceTypeId() {
    return extraPerformanceTypeId;
  }

  public void setExtraPerformanceTypeId(String extraPerformanceTypeId) {
    this.extraPerformanceTypeId = extraPerformanceTypeId;
  }

  public ExtraPerformanceForDescribeVolumesOutput IOPS(Integer IOPS) {
    this.IOPS = IOPS;
    return this;
  }

   /**
   * Get IOPS
   * @return IOPS
  **/
  @Schema(description = "")
  public Integer getIOPS() {
    return IOPS;
  }

  public void setIOPS(Integer IOPS) {
    this.IOPS = IOPS;
  }

  public ExtraPerformanceForDescribeVolumesOutput throughput(Integer throughput) {
    this.throughput = throughput;
    return this;
  }

   /**
   * Get throughput
   * @return throughput
  **/
  @Schema(description = "")
  public Integer getThroughput() {
    return throughput;
  }

  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraPerformanceForDescribeVolumesOutput extraPerformanceForDescribeVolumesOutput = (ExtraPerformanceForDescribeVolumesOutput) o;
    return Objects.equals(this.extraPerformanceTypeId, extraPerformanceForDescribeVolumesOutput.extraPerformanceTypeId) &&
        Objects.equals(this.IOPS, extraPerformanceForDescribeVolumesOutput.IOPS) &&
        Objects.equals(this.throughput, extraPerformanceForDescribeVolumesOutput.throughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraPerformanceTypeId, IOPS, throughput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraPerformanceForDescribeVolumesOutput {\n");
    
    sb.append("    extraPerformanceTypeId: ").append(toIndentedString(extraPerformanceTypeId)).append("\n");
    sb.append("    IOPS: ").append(toIndentedString(IOPS)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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
