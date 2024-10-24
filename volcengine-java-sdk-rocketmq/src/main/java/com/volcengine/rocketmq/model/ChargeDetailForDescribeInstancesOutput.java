/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

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
 * ChargeDetailForDescribeInstancesOutput
 */



public class ChargeDetailForDescribeInstancesOutput {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeExpireTime")
  private String chargeExpireTime = null;

  @SerializedName("ChargeStartTime")
  private String chargeStartTime = null;

  @SerializedName("ChargeStatus")
  private String chargeStatus = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("OverdueReclaimTime")
  private String overdueReclaimTime = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  public ChargeDetailForDescribeInstancesOutput autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ChargeDetailForDescribeInstancesOutput chargeExpireTime(String chargeExpireTime) {
    this.chargeExpireTime = chargeExpireTime;
    return this;
  }

   /**
   * Get chargeExpireTime
   * @return chargeExpireTime
  **/
  @Schema(description = "")
  public String getChargeExpireTime() {
    return chargeExpireTime;
  }

  public void setChargeExpireTime(String chargeExpireTime) {
    this.chargeExpireTime = chargeExpireTime;
  }

  public ChargeDetailForDescribeInstancesOutput chargeStartTime(String chargeStartTime) {
    this.chargeStartTime = chargeStartTime;
    return this;
  }

   /**
   * Get chargeStartTime
   * @return chargeStartTime
  **/
  @Schema(description = "")
  public String getChargeStartTime() {
    return chargeStartTime;
  }

  public void setChargeStartTime(String chargeStartTime) {
    this.chargeStartTime = chargeStartTime;
  }

  public ChargeDetailForDescribeInstancesOutput chargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
    return this;
  }

   /**
   * Get chargeStatus
   * @return chargeStatus
  **/
  @Schema(description = "")
  public String getChargeStatus() {
    return chargeStatus;
  }

  public void setChargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
  }

  public ChargeDetailForDescribeInstancesOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ChargeDetailForDescribeInstancesOutput overdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
    return this;
  }

   /**
   * Get overdueReclaimTime
   * @return overdueReclaimTime
  **/
  @Schema(description = "")
  public String getOverdueReclaimTime() {
    return overdueReclaimTime;
  }

  public void setOverdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
  }

  public ChargeDetailForDescribeInstancesOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public ChargeDetailForDescribeInstancesOutput periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeDetailForDescribeInstancesOutput chargeDetailForDescribeInstancesOutput = (ChargeDetailForDescribeInstancesOutput) o;
    return Objects.equals(this.autoRenew, chargeDetailForDescribeInstancesOutput.autoRenew) &&
        Objects.equals(this.chargeExpireTime, chargeDetailForDescribeInstancesOutput.chargeExpireTime) &&
        Objects.equals(this.chargeStartTime, chargeDetailForDescribeInstancesOutput.chargeStartTime) &&
        Objects.equals(this.chargeStatus, chargeDetailForDescribeInstancesOutput.chargeStatus) &&
        Objects.equals(this.chargeType, chargeDetailForDescribeInstancesOutput.chargeType) &&
        Objects.equals(this.overdueReclaimTime, chargeDetailForDescribeInstancesOutput.overdueReclaimTime) &&
        Objects.equals(this.overdueTime, chargeDetailForDescribeInstancesOutput.overdueTime) &&
        Objects.equals(this.periodUnit, chargeDetailForDescribeInstancesOutput.periodUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeExpireTime, chargeStartTime, chargeStatus, chargeType, overdueReclaimTime, overdueTime, periodUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeDetailForDescribeInstancesOutput {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeExpireTime: ").append(toIndentedString(chargeExpireTime)).append("\n");
    sb.append("    chargeStartTime: ").append(toIndentedString(chargeStartTime)).append("\n");
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    overdueReclaimTime: ").append(toIndentedString(overdueReclaimTime)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
