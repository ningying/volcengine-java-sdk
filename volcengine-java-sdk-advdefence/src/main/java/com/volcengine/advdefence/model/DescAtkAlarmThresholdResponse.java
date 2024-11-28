/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * DescAtkAlarmThresholdResponse
 */



public class DescAtkAlarmThresholdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BandWidth")
  private Integer bandWidth = null;

  @SerializedName("DefaultBandWidth")
  private String defaultBandWidth = null;

  @SerializedName("DefaultPps")
  private String defaultPps = null;

  @SerializedName("Pps")
  private Integer pps = null;

  @SerializedName("ThresType")
  private Integer thresType = null;

  public DescAtkAlarmThresholdResponse bandWidth(Integer bandWidth) {
    this.bandWidth = bandWidth;
    return this;
  }

   /**
   * Get bandWidth
   * @return bandWidth
  **/
  @Schema(description = "")
  public Integer getBandWidth() {
    return bandWidth;
  }

  public void setBandWidth(Integer bandWidth) {
    this.bandWidth = bandWidth;
  }

  public DescAtkAlarmThresholdResponse defaultBandWidth(String defaultBandWidth) {
    this.defaultBandWidth = defaultBandWidth;
    return this;
  }

   /**
   * Get defaultBandWidth
   * @return defaultBandWidth
  **/
  @Schema(description = "")
  public String getDefaultBandWidth() {
    return defaultBandWidth;
  }

  public void setDefaultBandWidth(String defaultBandWidth) {
    this.defaultBandWidth = defaultBandWidth;
  }

  public DescAtkAlarmThresholdResponse defaultPps(String defaultPps) {
    this.defaultPps = defaultPps;
    return this;
  }

   /**
   * Get defaultPps
   * @return defaultPps
  **/
  @Schema(description = "")
  public String getDefaultPps() {
    return defaultPps;
  }

  public void setDefaultPps(String defaultPps) {
    this.defaultPps = defaultPps;
  }

  public DescAtkAlarmThresholdResponse pps(Integer pps) {
    this.pps = pps;
    return this;
  }

   /**
   * Get pps
   * @return pps
  **/
  @Schema(description = "")
  public Integer getPps() {
    return pps;
  }

  public void setPps(Integer pps) {
    this.pps = pps;
  }

  public DescAtkAlarmThresholdResponse thresType(Integer thresType) {
    this.thresType = thresType;
    return this;
  }

   /**
   * Get thresType
   * @return thresType
  **/
  @Schema(description = "")
  public Integer getThresType() {
    return thresType;
  }

  public void setThresType(Integer thresType) {
    this.thresType = thresType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescAtkAlarmThresholdResponse descAtkAlarmThresholdResponse = (DescAtkAlarmThresholdResponse) o;
    return Objects.equals(this.bandWidth, descAtkAlarmThresholdResponse.bandWidth) &&
        Objects.equals(this.defaultBandWidth, descAtkAlarmThresholdResponse.defaultBandWidth) &&
        Objects.equals(this.defaultPps, descAtkAlarmThresholdResponse.defaultPps) &&
        Objects.equals(this.pps, descAtkAlarmThresholdResponse.pps) &&
        Objects.equals(this.thresType, descAtkAlarmThresholdResponse.thresType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandWidth, defaultBandWidth, defaultPps, pps, thresType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescAtkAlarmThresholdResponse {\n");
    
    sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
    sb.append("    defaultBandWidth: ").append(toIndentedString(defaultBandWidth)).append("\n");
    sb.append("    defaultPps: ").append(toIndentedString(defaultPps)).append("\n");
    sb.append("    pps: ").append(toIndentedString(pps)).append("\n");
    sb.append("    thresType: ").append(toIndentedString(thresType)).append("\n");
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
