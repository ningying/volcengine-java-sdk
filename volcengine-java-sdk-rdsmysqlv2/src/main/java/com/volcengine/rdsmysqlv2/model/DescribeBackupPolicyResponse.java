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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeBackupPolicyResponse
 */


public class DescribeBackupPolicyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BinlogFileCountsEnable")
  private Boolean binlogFileCountsEnable = null;

  @SerializedName("BinlogLimitCount")
  private Integer binlogLimitCount = null;

  @SerializedName("BinlogLocalRetentionHour")
  private Integer binlogLocalRetentionHour = null;

  @SerializedName("BinlogSpaceLimitEnable")
  private Boolean binlogSpaceLimitEnable = null;

  @SerializedName("BinlogStoragePercentage")
  private Integer binlogStoragePercentage = null;

  @SerializedName("DataBackupRetentionDay")
  private Integer dataBackupRetentionDay = null;

  @SerializedName("DataFullBackupPeriods")
  private List<String> dataFullBackupPeriods = null;

  @SerializedName("DataFullBackupTime")
  private String dataFullBackupTime = null;

  @SerializedName("DataIncrBackupPeriods")
  private List<String> dataIncrBackupPeriods = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LogBackupRetentionDay")
  private Integer logBackupRetentionDay = null;

  public DescribeBackupPolicyResponse binlogFileCountsEnable(Boolean binlogFileCountsEnable) {
    this.binlogFileCountsEnable = binlogFileCountsEnable;
    return this;
  }

   /**
   * Get binlogFileCountsEnable
   * @return binlogFileCountsEnable
  **/
  @Schema(description = "")
  public Boolean isBinlogFileCountsEnable() {
    return binlogFileCountsEnable;
  }

  public void setBinlogFileCountsEnable(Boolean binlogFileCountsEnable) {
    this.binlogFileCountsEnable = binlogFileCountsEnable;
  }

  public DescribeBackupPolicyResponse binlogLimitCount(Integer binlogLimitCount) {
    this.binlogLimitCount = binlogLimitCount;
    return this;
  }

   /**
   * Get binlogLimitCount
   * @return binlogLimitCount
  **/
  @Schema(description = "")
  public Integer getBinlogLimitCount() {
    return binlogLimitCount;
  }

  public void setBinlogLimitCount(Integer binlogLimitCount) {
    this.binlogLimitCount = binlogLimitCount;
  }

  public DescribeBackupPolicyResponse binlogLocalRetentionHour(Integer binlogLocalRetentionHour) {
    this.binlogLocalRetentionHour = binlogLocalRetentionHour;
    return this;
  }

   /**
   * Get binlogLocalRetentionHour
   * @return binlogLocalRetentionHour
  **/
  @Schema(description = "")
  public Integer getBinlogLocalRetentionHour() {
    return binlogLocalRetentionHour;
  }

  public void setBinlogLocalRetentionHour(Integer binlogLocalRetentionHour) {
    this.binlogLocalRetentionHour = binlogLocalRetentionHour;
  }

  public DescribeBackupPolicyResponse binlogSpaceLimitEnable(Boolean binlogSpaceLimitEnable) {
    this.binlogSpaceLimitEnable = binlogSpaceLimitEnable;
    return this;
  }

   /**
   * Get binlogSpaceLimitEnable
   * @return binlogSpaceLimitEnable
  **/
  @Schema(description = "")
  public Boolean isBinlogSpaceLimitEnable() {
    return binlogSpaceLimitEnable;
  }

  public void setBinlogSpaceLimitEnable(Boolean binlogSpaceLimitEnable) {
    this.binlogSpaceLimitEnable = binlogSpaceLimitEnable;
  }

  public DescribeBackupPolicyResponse binlogStoragePercentage(Integer binlogStoragePercentage) {
    this.binlogStoragePercentage = binlogStoragePercentage;
    return this;
  }

   /**
   * Get binlogStoragePercentage
   * @return binlogStoragePercentage
  **/
  @Schema(description = "")
  public Integer getBinlogStoragePercentage() {
    return binlogStoragePercentage;
  }

  public void setBinlogStoragePercentage(Integer binlogStoragePercentage) {
    this.binlogStoragePercentage = binlogStoragePercentage;
  }

  public DescribeBackupPolicyResponse dataBackupRetentionDay(Integer dataBackupRetentionDay) {
    this.dataBackupRetentionDay = dataBackupRetentionDay;
    return this;
  }

   /**
   * Get dataBackupRetentionDay
   * @return dataBackupRetentionDay
  **/
  @Schema(description = "")
  public Integer getDataBackupRetentionDay() {
    return dataBackupRetentionDay;
  }

  public void setDataBackupRetentionDay(Integer dataBackupRetentionDay) {
    this.dataBackupRetentionDay = dataBackupRetentionDay;
  }

  public DescribeBackupPolicyResponse dataFullBackupPeriods(List<String> dataFullBackupPeriods) {
    this.dataFullBackupPeriods = dataFullBackupPeriods;
    return this;
  }

  public DescribeBackupPolicyResponse addDataFullBackupPeriodsItem(String dataFullBackupPeriodsItem) {
    if (this.dataFullBackupPeriods == null) {
      this.dataFullBackupPeriods = new ArrayList<String>();
    }
    this.dataFullBackupPeriods.add(dataFullBackupPeriodsItem);
    return this;
  }

   /**
   * Get dataFullBackupPeriods
   * @return dataFullBackupPeriods
  **/
  @Schema(description = "")
  public List<String> getDataFullBackupPeriods() {
    return dataFullBackupPeriods;
  }

  public void setDataFullBackupPeriods(List<String> dataFullBackupPeriods) {
    this.dataFullBackupPeriods = dataFullBackupPeriods;
  }

  public DescribeBackupPolicyResponse dataFullBackupTime(String dataFullBackupTime) {
    this.dataFullBackupTime = dataFullBackupTime;
    return this;
  }

   /**
   * Get dataFullBackupTime
   * @return dataFullBackupTime
  **/
  @Schema(description = "")
  public String getDataFullBackupTime() {
    return dataFullBackupTime;
  }

  public void setDataFullBackupTime(String dataFullBackupTime) {
    this.dataFullBackupTime = dataFullBackupTime;
  }

  public DescribeBackupPolicyResponse dataIncrBackupPeriods(List<String> dataIncrBackupPeriods) {
    this.dataIncrBackupPeriods = dataIncrBackupPeriods;
    return this;
  }

  public DescribeBackupPolicyResponse addDataIncrBackupPeriodsItem(String dataIncrBackupPeriodsItem) {
    if (this.dataIncrBackupPeriods == null) {
      this.dataIncrBackupPeriods = new ArrayList<String>();
    }
    this.dataIncrBackupPeriods.add(dataIncrBackupPeriodsItem);
    return this;
  }

   /**
   * Get dataIncrBackupPeriods
   * @return dataIncrBackupPeriods
  **/
  @Schema(description = "")
  public List<String> getDataIncrBackupPeriods() {
    return dataIncrBackupPeriods;
  }

  public void setDataIncrBackupPeriods(List<String> dataIncrBackupPeriods) {
    this.dataIncrBackupPeriods = dataIncrBackupPeriods;
  }

  public DescribeBackupPolicyResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeBackupPolicyResponse logBackupRetentionDay(Integer logBackupRetentionDay) {
    this.logBackupRetentionDay = logBackupRetentionDay;
    return this;
  }

   /**
   * Get logBackupRetentionDay
   * @return logBackupRetentionDay
  **/
  @Schema(description = "")
  public Integer getLogBackupRetentionDay() {
    return logBackupRetentionDay;
  }

  public void setLogBackupRetentionDay(Integer logBackupRetentionDay) {
    this.logBackupRetentionDay = logBackupRetentionDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBackupPolicyResponse describeBackupPolicyResponse = (DescribeBackupPolicyResponse) o;
    return Objects.equals(this.binlogFileCountsEnable, describeBackupPolicyResponse.binlogFileCountsEnable) &&
        Objects.equals(this.binlogLimitCount, describeBackupPolicyResponse.binlogLimitCount) &&
        Objects.equals(this.binlogLocalRetentionHour, describeBackupPolicyResponse.binlogLocalRetentionHour) &&
        Objects.equals(this.binlogSpaceLimitEnable, describeBackupPolicyResponse.binlogSpaceLimitEnable) &&
        Objects.equals(this.binlogStoragePercentage, describeBackupPolicyResponse.binlogStoragePercentage) &&
        Objects.equals(this.dataBackupRetentionDay, describeBackupPolicyResponse.dataBackupRetentionDay) &&
        Objects.equals(this.dataFullBackupPeriods, describeBackupPolicyResponse.dataFullBackupPeriods) &&
        Objects.equals(this.dataFullBackupTime, describeBackupPolicyResponse.dataFullBackupTime) &&
        Objects.equals(this.dataIncrBackupPeriods, describeBackupPolicyResponse.dataIncrBackupPeriods) &&
        Objects.equals(this.instanceId, describeBackupPolicyResponse.instanceId) &&
        Objects.equals(this.logBackupRetentionDay, describeBackupPolicyResponse.logBackupRetentionDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binlogFileCountsEnable, binlogLimitCount, binlogLocalRetentionHour, binlogSpaceLimitEnable, binlogStoragePercentage, dataBackupRetentionDay, dataFullBackupPeriods, dataFullBackupTime, dataIncrBackupPeriods, instanceId, logBackupRetentionDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBackupPolicyResponse {\n");
    
    sb.append("    binlogFileCountsEnable: ").append(toIndentedString(binlogFileCountsEnable)).append("\n");
    sb.append("    binlogLimitCount: ").append(toIndentedString(binlogLimitCount)).append("\n");
    sb.append("    binlogLocalRetentionHour: ").append(toIndentedString(binlogLocalRetentionHour)).append("\n");
    sb.append("    binlogSpaceLimitEnable: ").append(toIndentedString(binlogSpaceLimitEnable)).append("\n");
    sb.append("    binlogStoragePercentage: ").append(toIndentedString(binlogStoragePercentage)).append("\n");
    sb.append("    dataBackupRetentionDay: ").append(toIndentedString(dataBackupRetentionDay)).append("\n");
    sb.append("    dataFullBackupPeriods: ").append(toIndentedString(dataFullBackupPeriods)).append("\n");
    sb.append("    dataFullBackupTime: ").append(toIndentedString(dataFullBackupTime)).append("\n");
    sb.append("    dataIncrBackupPeriods: ").append(toIndentedString(dataIncrBackupPeriods)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    logBackupRetentionDay: ").append(toIndentedString(logBackupRetentionDay)).append("\n");
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
