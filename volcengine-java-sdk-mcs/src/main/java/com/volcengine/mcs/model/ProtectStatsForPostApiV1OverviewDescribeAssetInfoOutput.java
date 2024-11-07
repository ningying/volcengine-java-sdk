/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

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
 * ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput
 */



public class ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput {
  @SerializedName("not_protect")
  private Long notProtect = null;

  @SerializedName("protect")
  private Long protect = null;

  @SerializedName("protect_exception")
  private Long protectException = null;

  @SerializedName("unknown")
  private Long unknown = null;

  public ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput notProtect(Long notProtect) {
    this.notProtect = notProtect;
    return this;
  }

   /**
   * Get notProtect
   * @return notProtect
  **/
  @Schema(description = "")
  public Long getNotProtect() {
    return notProtect;
  }

  public void setNotProtect(Long notProtect) {
    this.notProtect = notProtect;
  }

  public ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput protect(Long protect) {
    this.protect = protect;
    return this;
  }

   /**
   * Get protect
   * @return protect
  **/
  @Schema(description = "")
  public Long getProtect() {
    return protect;
  }

  public void setProtect(Long protect) {
    this.protect = protect;
  }

  public ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput protectException(Long protectException) {
    this.protectException = protectException;
    return this;
  }

   /**
   * Get protectException
   * @return protectException
  **/
  @Schema(description = "")
  public Long getProtectException() {
    return protectException;
  }

  public void setProtectException(Long protectException) {
    this.protectException = protectException;
  }

  public ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput unknown(Long unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @Schema(description = "")
  public Long getUnknown() {
    return unknown;
  }

  public void setUnknown(Long unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput protectStatsForPostApiV1OverviewDescribeAssetInfoOutput = (ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput) o;
    return Objects.equals(this.notProtect, protectStatsForPostApiV1OverviewDescribeAssetInfoOutput.notProtect) &&
        Objects.equals(this.protect, protectStatsForPostApiV1OverviewDescribeAssetInfoOutput.protect) &&
        Objects.equals(this.protectException, protectStatsForPostApiV1OverviewDescribeAssetInfoOutput.protectException) &&
        Objects.equals(this.unknown, protectStatsForPostApiV1OverviewDescribeAssetInfoOutput.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notProtect, protect, protectException, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectStatsForPostApiV1OverviewDescribeAssetInfoOutput {\n");
    
    sb.append("    notProtect: ").append(toIndentedString(notProtect)).append("\n");
    sb.append("    protect: ").append(toIndentedString(protect)).append("\n");
    sb.append("    protectException: ").append(toIndentedString(protectException)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
