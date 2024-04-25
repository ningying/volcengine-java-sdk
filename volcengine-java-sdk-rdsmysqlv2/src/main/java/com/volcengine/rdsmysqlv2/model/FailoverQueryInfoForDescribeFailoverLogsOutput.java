/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * FailoverQueryInfoForDescribeFailoverLogsOutput
 */


public class FailoverQueryInfoForDescribeFailoverLogsOutput {
  @SerializedName("ChangeTime")
  private String changeTime = null;

  @SerializedName("Details")
  private String details = null;

  @SerializedName("HAChangeType")
  private String haChangeType = null;

  @SerializedName("NewMaster")
  private String newMaster = null;

  @SerializedName("OldMaster")
  private String oldMaster = null;

  @SerializedName("Reason")
  private String reason = null;

  public FailoverQueryInfoForDescribeFailoverLogsOutput changeTime(String changeTime) {
    this.changeTime = changeTime;
    return this;
  }

   /**
   * Get changeTime
   * @return changeTime
  **/
  @Schema(description = "")
  public String getChangeTime() {
    return changeTime;
  }

  public void setChangeTime(String changeTime) {
    this.changeTime = changeTime;
  }

  public FailoverQueryInfoForDescribeFailoverLogsOutput details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public FailoverQueryInfoForDescribeFailoverLogsOutput haChangeType(String haChangeType) {
    this.haChangeType = haChangeType;
    return this;
  }

   /**
   * Get haChangeType
   * @return haChangeType
  **/
  @Schema(description = "")
  public String getHaChangeType() {
    return haChangeType;
  }

  public void setHaChangeType(String haChangeType) {
    this.haChangeType = haChangeType;
  }

  public FailoverQueryInfoForDescribeFailoverLogsOutput newMaster(String newMaster) {
    this.newMaster = newMaster;
    return this;
  }

   /**
   * Get newMaster
   * @return newMaster
  **/
  @Schema(description = "")
  public String getNewMaster() {
    return newMaster;
  }

  public void setNewMaster(String newMaster) {
    this.newMaster = newMaster;
  }

  public FailoverQueryInfoForDescribeFailoverLogsOutput oldMaster(String oldMaster) {
    this.oldMaster = oldMaster;
    return this;
  }

   /**
   * Get oldMaster
   * @return oldMaster
  **/
  @Schema(description = "")
  public String getOldMaster() {
    return oldMaster;
  }

  public void setOldMaster(String oldMaster) {
    this.oldMaster = oldMaster;
  }

  public FailoverQueryInfoForDescribeFailoverLogsOutput reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailoverQueryInfoForDescribeFailoverLogsOutput failoverQueryInfoForDescribeFailoverLogsOutput = (FailoverQueryInfoForDescribeFailoverLogsOutput) o;
    return Objects.equals(this.changeTime, failoverQueryInfoForDescribeFailoverLogsOutput.changeTime) &&
        Objects.equals(this.details, failoverQueryInfoForDescribeFailoverLogsOutput.details) &&
        Objects.equals(this.haChangeType, failoverQueryInfoForDescribeFailoverLogsOutput.haChangeType) &&
        Objects.equals(this.newMaster, failoverQueryInfoForDescribeFailoverLogsOutput.newMaster) &&
        Objects.equals(this.oldMaster, failoverQueryInfoForDescribeFailoverLogsOutput.oldMaster) &&
        Objects.equals(this.reason, failoverQueryInfoForDescribeFailoverLogsOutput.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeTime, details, haChangeType, newMaster, oldMaster, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailoverQueryInfoForDescribeFailoverLogsOutput {\n");
    
    sb.append("    changeTime: ").append(toIndentedString(changeTime)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    haChangeType: ").append(toIndentedString(haChangeType)).append("\n");
    sb.append("    newMaster: ").append(toIndentedString(newMaster)).append("\n");
    sb.append("    oldMaster: ").append(toIndentedString(oldMaster)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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