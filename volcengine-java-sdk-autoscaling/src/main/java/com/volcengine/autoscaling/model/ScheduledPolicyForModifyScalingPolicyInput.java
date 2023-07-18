/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * ScheduledPolicyForModifyScalingPolicyInput
 */



public class ScheduledPolicyForModifyScalingPolicyInput {
  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RecurrenceType")
  private String recurrenceType = null;

  @SerializedName("RecurrenceValue")
  private String recurrenceValue = null;

  public ScheduledPolicyForModifyScalingPolicyInput launchTime(String launchTime) {
    this.launchTime = launchTime;
    return this;
  }

   /**
   * Get launchTime
   * @return launchTime
  **/
  @Schema(description = "")
  public String getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(String launchTime) {
    this.launchTime = launchTime;
  }

  public ScheduledPolicyForModifyScalingPolicyInput recurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
    return this;
  }

   /**
   * Get recurrenceEndTime
   * @return recurrenceEndTime
  **/
  @Schema(description = "")
  public String getRecurrenceEndTime() {
    return recurrenceEndTime;
  }

  public void setRecurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
  }

  public ScheduledPolicyForModifyScalingPolicyInput recurrenceType(String recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @Schema(description = "")
  public String getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(String recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public ScheduledPolicyForModifyScalingPolicyInput recurrenceValue(String recurrenceValue) {
    this.recurrenceValue = recurrenceValue;
    return this;
  }

   /**
   * Get recurrenceValue
   * @return recurrenceValue
  **/
  @Schema(description = "")
  public String getRecurrenceValue() {
    return recurrenceValue;
  }

  public void setRecurrenceValue(String recurrenceValue) {
    this.recurrenceValue = recurrenceValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledPolicyForModifyScalingPolicyInput scheduledPolicyForModifyScalingPolicyInput = (ScheduledPolicyForModifyScalingPolicyInput) o;
    return Objects.equals(this.launchTime, scheduledPolicyForModifyScalingPolicyInput.launchTime) &&
        Objects.equals(this.recurrenceEndTime, scheduledPolicyForModifyScalingPolicyInput.recurrenceEndTime) &&
        Objects.equals(this.recurrenceType, scheduledPolicyForModifyScalingPolicyInput.recurrenceType) &&
        Objects.equals(this.recurrenceValue, scheduledPolicyForModifyScalingPolicyInput.recurrenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchTime, recurrenceEndTime, recurrenceType, recurrenceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPolicyForModifyScalingPolicyInput {\n");
    
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceValue: ").append(toIndentedString(recurrenceValue)).append("\n");
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
