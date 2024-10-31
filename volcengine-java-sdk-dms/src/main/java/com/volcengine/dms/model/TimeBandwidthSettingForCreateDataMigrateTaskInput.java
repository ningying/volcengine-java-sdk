/*
 * dms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dms.model;

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
 * TimeBandwidthSettingForCreateDataMigrateTaskInput
 */



public class TimeBandwidthSettingForCreateDataMigrateTaskInput {
  @SerializedName("Bandwidth")
  private Long bandwidth = null;

  @SerializedName("End")
  private Integer end = null;

  @SerializedName("Start")
  private Integer start = null;

  public TimeBandwidthSettingForCreateDataMigrateTaskInput bandwidth(Long bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 0
   * maximum: 1073741824
   * @return bandwidth
  **/
 @Min(0) @Max(1073741824)  @Schema(description = "")
  public Long getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Long bandwidth) {
    this.bandwidth = bandwidth;
  }

  public TimeBandwidthSettingForCreateDataMigrateTaskInput end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * minimum: 1
   * maximum: 24
   * @return end
  **/
 @Min(1) @Max(24)  @Schema(description = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public TimeBandwidthSettingForCreateDataMigrateTaskInput start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * minimum: 0
   * maximum: 23
   * @return start
  **/
 @Min(0) @Max(23)  @Schema(description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeBandwidthSettingForCreateDataMigrateTaskInput timeBandwidthSettingForCreateDataMigrateTaskInput = (TimeBandwidthSettingForCreateDataMigrateTaskInput) o;
    return Objects.equals(this.bandwidth, timeBandwidthSettingForCreateDataMigrateTaskInput.bandwidth) &&
        Objects.equals(this.end, timeBandwidthSettingForCreateDataMigrateTaskInput.end) &&
        Objects.equals(this.start, timeBandwidthSettingForCreateDataMigrateTaskInput.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, end, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeBandwidthSettingForCreateDataMigrateTaskInput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
