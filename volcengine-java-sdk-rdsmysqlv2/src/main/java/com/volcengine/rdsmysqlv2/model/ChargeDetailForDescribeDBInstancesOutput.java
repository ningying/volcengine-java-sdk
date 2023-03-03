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
 * ChargeDetailForDescribeDBInstancesOutput
 */


public class ChargeDetailForDescribeDBInstancesOutput {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeEndTime")
  private String chargeEndTime = null;

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

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  public ChargeDetailForDescribeDBInstancesOutput autoRenew(Boolean autoRenew) {
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

  public ChargeDetailForDescribeDBInstancesOutput chargeEndTime(String chargeEndTime) {
    this.chargeEndTime = chargeEndTime;
    return this;
  }

   /**
   * Get chargeEndTime
   * @return chargeEndTime
  **/
  @Schema(description = "")
  public String getChargeEndTime() {
    return chargeEndTime;
  }

  public void setChargeEndTime(String chargeEndTime) {
    this.chargeEndTime = chargeEndTime;
  }

  public ChargeDetailForDescribeDBInstancesOutput chargeStartTime(String chargeStartTime) {
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

  public ChargeDetailForDescribeDBInstancesOutput chargeStatus(String chargeStatus) {
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

  public ChargeDetailForDescribeDBInstancesOutput chargeType(String chargeType) {
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

  public ChargeDetailForDescribeDBInstancesOutput overdueReclaimTime(String overdueReclaimTime) {
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

  public ChargeDetailForDescribeDBInstancesOutput overdueTime(String overdueTime) {
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

  public ChargeDetailForDescribeDBInstancesOutput period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ChargeDetailForDescribeDBInstancesOutput periodUnit(String periodUnit) {
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
    ChargeDetailForDescribeDBInstancesOutput chargeDetailForDescribeDBInstancesOutput = (ChargeDetailForDescribeDBInstancesOutput) o;
    return Objects.equals(this.autoRenew, chargeDetailForDescribeDBInstancesOutput.autoRenew) &&
        Objects.equals(this.chargeEndTime, chargeDetailForDescribeDBInstancesOutput.chargeEndTime) &&
        Objects.equals(this.chargeStartTime, chargeDetailForDescribeDBInstancesOutput.chargeStartTime) &&
        Objects.equals(this.chargeStatus, chargeDetailForDescribeDBInstancesOutput.chargeStatus) &&
        Objects.equals(this.chargeType, chargeDetailForDescribeDBInstancesOutput.chargeType) &&
        Objects.equals(this.overdueReclaimTime, chargeDetailForDescribeDBInstancesOutput.overdueReclaimTime) &&
        Objects.equals(this.overdueTime, chargeDetailForDescribeDBInstancesOutput.overdueTime) &&
        Objects.equals(this.period, chargeDetailForDescribeDBInstancesOutput.period) &&
        Objects.equals(this.periodUnit, chargeDetailForDescribeDBInstancesOutput.periodUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeEndTime, chargeStartTime, chargeStatus, chargeType, overdueReclaimTime, overdueTime, period, periodUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeDetailForDescribeDBInstancesOutput {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeEndTime: ").append(toIndentedString(chargeEndTime)).append("\n");
    sb.append("    chargeStartTime: ").append(toIndentedString(chargeStartTime)).append("\n");
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    overdueReclaimTime: ").append(toIndentedString(overdueReclaimTime)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
