/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * AbortReleaseResponse
 */



public class AbortReleaseResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CurrentTrafficWeight")
  private Integer currentTrafficWeight = null;

  @SerializedName("ErrorCode")
  private String errorCode = null;

  @SerializedName("FailedInstanceLogs")
  private String failedInstanceLogs = null;

  @SerializedName("FunctionId")
  private String functionId = null;

  @SerializedName("NewRevisionNumber")
  private Integer newRevisionNumber = null;

  @SerializedName("OldRevisionNumber")
  private Integer oldRevisionNumber = null;

  @SerializedName("ReleaseRecordId")
  private String releaseRecordId = null;

  @SerializedName("StableRevisionNumber")
  private Integer stableRevisionNumber = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("StatusMessage")
  private String statusMessage = null;

  @SerializedName("TargetTrafficWeight")
  private Integer targetTrafficWeight = null;

  public AbortReleaseResponse currentTrafficWeight(Integer currentTrafficWeight) {
    this.currentTrafficWeight = currentTrafficWeight;
    return this;
  }

   /**
   * Get currentTrafficWeight
   * @return currentTrafficWeight
  **/
  @Schema(description = "")
  public Integer getCurrentTrafficWeight() {
    return currentTrafficWeight;
  }

  public void setCurrentTrafficWeight(Integer currentTrafficWeight) {
    this.currentTrafficWeight = currentTrafficWeight;
  }

  public AbortReleaseResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AbortReleaseResponse failedInstanceLogs(String failedInstanceLogs) {
    this.failedInstanceLogs = failedInstanceLogs;
    return this;
  }

   /**
   * Get failedInstanceLogs
   * @return failedInstanceLogs
  **/
  @Schema(description = "")
  public String getFailedInstanceLogs() {
    return failedInstanceLogs;
  }

  public void setFailedInstanceLogs(String failedInstanceLogs) {
    this.failedInstanceLogs = failedInstanceLogs;
  }

  public AbortReleaseResponse functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * Get functionId
   * @return functionId
  **/
  @Schema(description = "")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  public AbortReleaseResponse newRevisionNumber(Integer newRevisionNumber) {
    this.newRevisionNumber = newRevisionNumber;
    return this;
  }

   /**
   * Get newRevisionNumber
   * @return newRevisionNumber
  **/
  @Schema(description = "")
  public Integer getNewRevisionNumber() {
    return newRevisionNumber;
  }

  public void setNewRevisionNumber(Integer newRevisionNumber) {
    this.newRevisionNumber = newRevisionNumber;
  }

  public AbortReleaseResponse oldRevisionNumber(Integer oldRevisionNumber) {
    this.oldRevisionNumber = oldRevisionNumber;
    return this;
  }

   /**
   * Get oldRevisionNumber
   * @return oldRevisionNumber
  **/
  @Schema(description = "")
  public Integer getOldRevisionNumber() {
    return oldRevisionNumber;
  }

  public void setOldRevisionNumber(Integer oldRevisionNumber) {
    this.oldRevisionNumber = oldRevisionNumber;
  }

  public AbortReleaseResponse releaseRecordId(String releaseRecordId) {
    this.releaseRecordId = releaseRecordId;
    return this;
  }

   /**
   * Get releaseRecordId
   * @return releaseRecordId
  **/
  @Schema(description = "")
  public String getReleaseRecordId() {
    return releaseRecordId;
  }

  public void setReleaseRecordId(String releaseRecordId) {
    this.releaseRecordId = releaseRecordId;
  }

  public AbortReleaseResponse stableRevisionNumber(Integer stableRevisionNumber) {
    this.stableRevisionNumber = stableRevisionNumber;
    return this;
  }

   /**
   * Get stableRevisionNumber
   * @return stableRevisionNumber
  **/
  @Schema(description = "")
  public Integer getStableRevisionNumber() {
    return stableRevisionNumber;
  }

  public void setStableRevisionNumber(Integer stableRevisionNumber) {
    this.stableRevisionNumber = stableRevisionNumber;
  }

  public AbortReleaseResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public AbortReleaseResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AbortReleaseResponse statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @Schema(description = "")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public AbortReleaseResponse targetTrafficWeight(Integer targetTrafficWeight) {
    this.targetTrafficWeight = targetTrafficWeight;
    return this;
  }

   /**
   * Get targetTrafficWeight
   * @return targetTrafficWeight
  **/
  @Schema(description = "")
  public Integer getTargetTrafficWeight() {
    return targetTrafficWeight;
  }

  public void setTargetTrafficWeight(Integer targetTrafficWeight) {
    this.targetTrafficWeight = targetTrafficWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbortReleaseResponse abortReleaseResponse = (AbortReleaseResponse) o;
    return Objects.equals(this.currentTrafficWeight, abortReleaseResponse.currentTrafficWeight) &&
        Objects.equals(this.errorCode, abortReleaseResponse.errorCode) &&
        Objects.equals(this.failedInstanceLogs, abortReleaseResponse.failedInstanceLogs) &&
        Objects.equals(this.functionId, abortReleaseResponse.functionId) &&
        Objects.equals(this.newRevisionNumber, abortReleaseResponse.newRevisionNumber) &&
        Objects.equals(this.oldRevisionNumber, abortReleaseResponse.oldRevisionNumber) &&
        Objects.equals(this.releaseRecordId, abortReleaseResponse.releaseRecordId) &&
        Objects.equals(this.stableRevisionNumber, abortReleaseResponse.stableRevisionNumber) &&
        Objects.equals(this.startTime, abortReleaseResponse.startTime) &&
        Objects.equals(this.status, abortReleaseResponse.status) &&
        Objects.equals(this.statusMessage, abortReleaseResponse.statusMessage) &&
        Objects.equals(this.targetTrafficWeight, abortReleaseResponse.targetTrafficWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTrafficWeight, errorCode, failedInstanceLogs, functionId, newRevisionNumber, oldRevisionNumber, releaseRecordId, stableRevisionNumber, startTime, status, statusMessage, targetTrafficWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbortReleaseResponse {\n");
    
    sb.append("    currentTrafficWeight: ").append(toIndentedString(currentTrafficWeight)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    failedInstanceLogs: ").append(toIndentedString(failedInstanceLogs)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    newRevisionNumber: ").append(toIndentedString(newRevisionNumber)).append("\n");
    sb.append("    oldRevisionNumber: ").append(toIndentedString(oldRevisionNumber)).append("\n");
    sb.append("    releaseRecordId: ").append(toIndentedString(releaseRecordId)).append("\n");
    sb.append("    stableRevisionNumber: ").append(toIndentedString(stableRevisionNumber)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    targetTrafficWeight: ").append(toIndentedString(targetTrafficWeight)).append("\n");
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
