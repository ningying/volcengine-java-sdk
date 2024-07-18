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
 * ItemForListReleaseRecordsOutput
 */



public class ItemForListReleaseRecordsOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FinishTime")
  private String finishTime = null;

  @SerializedName("FunctionId")
  private String functionId = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("SourceRevisionNumber")
  private Integer sourceRevisionNumber = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TargetRevisionNumber")
  private Integer targetRevisionNumber = null;

  public ItemForListReleaseRecordsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public ItemForListReleaseRecordsOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemForListReleaseRecordsOutput finishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Get finishTime
   * @return finishTime
  **/
  @Schema(description = "")
  public String getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }

  public ItemForListReleaseRecordsOutput functionId(String functionId) {
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

  public ItemForListReleaseRecordsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemForListReleaseRecordsOutput lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @Schema(description = "")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public ItemForListReleaseRecordsOutput sourceRevisionNumber(Integer sourceRevisionNumber) {
    this.sourceRevisionNumber = sourceRevisionNumber;
    return this;
  }

   /**
   * Get sourceRevisionNumber
   * @return sourceRevisionNumber
  **/
  @Schema(description = "")
  public Integer getSourceRevisionNumber() {
    return sourceRevisionNumber;
  }

  public void setSourceRevisionNumber(Integer sourceRevisionNumber) {
    this.sourceRevisionNumber = sourceRevisionNumber;
  }

  public ItemForListReleaseRecordsOutput status(String status) {
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

  public ItemForListReleaseRecordsOutput targetRevisionNumber(Integer targetRevisionNumber) {
    this.targetRevisionNumber = targetRevisionNumber;
    return this;
  }

   /**
   * Get targetRevisionNumber
   * @return targetRevisionNumber
  **/
  @Schema(description = "")
  public Integer getTargetRevisionNumber() {
    return targetRevisionNumber;
  }

  public void setTargetRevisionNumber(Integer targetRevisionNumber) {
    this.targetRevisionNumber = targetRevisionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListReleaseRecordsOutput itemForListReleaseRecordsOutput = (ItemForListReleaseRecordsOutput) o;
    return Objects.equals(this.creationTime, itemForListReleaseRecordsOutput.creationTime) &&
        Objects.equals(this.description, itemForListReleaseRecordsOutput.description) &&
        Objects.equals(this.finishTime, itemForListReleaseRecordsOutput.finishTime) &&
        Objects.equals(this.functionId, itemForListReleaseRecordsOutput.functionId) &&
        Objects.equals(this.id, itemForListReleaseRecordsOutput.id) &&
        Objects.equals(this.lastUpdateTime, itemForListReleaseRecordsOutput.lastUpdateTime) &&
        Objects.equals(this.sourceRevisionNumber, itemForListReleaseRecordsOutput.sourceRevisionNumber) &&
        Objects.equals(this.status, itemForListReleaseRecordsOutput.status) &&
        Objects.equals(this.targetRevisionNumber, itemForListReleaseRecordsOutput.targetRevisionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, finishTime, functionId, id, lastUpdateTime, sourceRevisionNumber, status, targetRevisionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListReleaseRecordsOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    sourceRevisionNumber: ").append(toIndentedString(sourceRevisionNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetRevisionNumber: ").append(toIndentedString(targetRevisionNumber)).append("\n");
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
