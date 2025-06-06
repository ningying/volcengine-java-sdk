/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

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
 * DescribeBackupsRequest
 */



public class DescribeBackupsRequest {
  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeBackupsRequest backupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
    return this;
  }

   /**
   * Get backupEndTime
   * @return backupEndTime
  **/
  @Schema(description = "")
  public String getBackupEndTime() {
    return backupEndTime;
  }

  public void setBackupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
  }

  public DescribeBackupsRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public DescribeBackupsRequest backupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
    return this;
  }

   /**
   * Get backupStartTime
   * @return backupStartTime
  **/
  @Schema(description = "")
  public String getBackupStartTime() {
    return backupStartTime;
  }

  public void setBackupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
  }

  public DescribeBackupsRequest backupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public String getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
  }

  public DescribeBackupsRequest backupType(String backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public String getBackupType() {
    return backupType;
  }

  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }

  public DescribeBackupsRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeBackupsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeBackupsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBackupsRequest describeBackupsRequest = (DescribeBackupsRequest) o;
    return Objects.equals(this.backupEndTime, describeBackupsRequest.backupEndTime) &&
        Objects.equals(this.backupId, describeBackupsRequest.backupId) &&
        Objects.equals(this.backupStartTime, describeBackupsRequest.backupStartTime) &&
        Objects.equals(this.backupStatus, describeBackupsRequest.backupStatus) &&
        Objects.equals(this.backupType, describeBackupsRequest.backupType) &&
        Objects.equals(this.instanceId, describeBackupsRequest.instanceId) &&
        Objects.equals(this.pageNumber, describeBackupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeBackupsRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupEndTime, backupId, backupStartTime, backupStatus, backupType, instanceId, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBackupsRequest {\n");
    
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
