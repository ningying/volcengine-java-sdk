/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * DataForListZoneStatisticsOutput
 */



public class DataForListZoneStatisticsOutput {
  @SerializedName("CacheStage")
  private Integer cacheStage = null;

  @SerializedName("Error")
  private Integer error = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NotExists")
  private Integer notExists = null;

  @SerializedName("Success")
  private Integer success = null;

  @SerializedName("Timestamp")
  private Long timestamp = null;

  @SerializedName("Total")
  private Integer total = null;

  @SerializedName("ZID")
  private Integer ZID = null;

  public DataForListZoneStatisticsOutput cacheStage(Integer cacheStage) {
    this.cacheStage = cacheStage;
    return this;
  }

   /**
   * Get cacheStage
   * @return cacheStage
  **/
  @Schema(description = "")
  public Integer getCacheStage() {
    return cacheStage;
  }

  public void setCacheStage(Integer cacheStage) {
    this.cacheStage = cacheStage;
  }

  public DataForListZoneStatisticsOutput error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }

  public DataForListZoneStatisticsOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataForListZoneStatisticsOutput notExists(Integer notExists) {
    this.notExists = notExists;
    return this;
  }

   /**
   * Get notExists
   * @return notExists
  **/
  @Schema(description = "")
  public Integer getNotExists() {
    return notExists;
  }

  public void setNotExists(Integer notExists) {
    this.notExists = notExists;
  }

  public DataForListZoneStatisticsOutput success(Integer success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }

  public DataForListZoneStatisticsOutput timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public DataForListZoneStatisticsOutput total(Integer total) {
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

  public DataForListZoneStatisticsOutput ZID(Integer ZID) {
    this.ZID = ZID;
    return this;
  }

   /**
   * Get ZID
   * @return ZID
  **/
  @Schema(description = "")
  public Integer getZID() {
    return ZID;
  }

  public void setZID(Integer ZID) {
    this.ZID = ZID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListZoneStatisticsOutput dataForListZoneStatisticsOutput = (DataForListZoneStatisticsOutput) o;
    return Objects.equals(this.cacheStage, dataForListZoneStatisticsOutput.cacheStage) &&
        Objects.equals(this.error, dataForListZoneStatisticsOutput.error) &&
        Objects.equals(this.name, dataForListZoneStatisticsOutput.name) &&
        Objects.equals(this.notExists, dataForListZoneStatisticsOutput.notExists) &&
        Objects.equals(this.success, dataForListZoneStatisticsOutput.success) &&
        Objects.equals(this.timestamp, dataForListZoneStatisticsOutput.timestamp) &&
        Objects.equals(this.total, dataForListZoneStatisticsOutput.total) &&
        Objects.equals(this.ZID, dataForListZoneStatisticsOutput.ZID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheStage, error, name, notExists, success, timestamp, total, ZID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListZoneStatisticsOutput {\n");
    
    sb.append("    cacheStage: ").append(toIndentedString(cacheStage)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notExists: ").append(toIndentedString(notExists)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    ZID: ").append(toIndentedString(ZID)).append("\n");
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