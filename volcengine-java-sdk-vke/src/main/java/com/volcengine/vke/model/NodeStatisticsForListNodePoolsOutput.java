/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * NodeStatisticsForListNodePoolsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-16T11:30:28.141424+08:00[Asia/Shanghai]")
public class NodeStatisticsForListNodePoolsOutput {
  @SerializedName("CreatingCount")
  private Integer creatingCount = null;

  @SerializedName("DeletingCount")
  private Integer deletingCount = null;

  @SerializedName("FailedCount")
  private Integer failedCount = null;

  @SerializedName("RunningCount")
  private Integer runningCount = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("UpdatingCount")
  private Integer updatingCount = null;

  public NodeStatisticsForListNodePoolsOutput creatingCount(Integer creatingCount) {
    this.creatingCount = creatingCount;
    return this;
  }

   /**
   * Get creatingCount
   * @return creatingCount
  **/
  @Schema(description = "")
  public Integer getCreatingCount() {
    return creatingCount;
  }

  public void setCreatingCount(Integer creatingCount) {
    this.creatingCount = creatingCount;
  }

  public NodeStatisticsForListNodePoolsOutput deletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
    return this;
  }

   /**
   * Get deletingCount
   * @return deletingCount
  **/
  @Schema(description = "")
  public Integer getDeletingCount() {
    return deletingCount;
  }

  public void setDeletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
  }

  public NodeStatisticsForListNodePoolsOutput failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

   /**
   * Get failedCount
   * @return failedCount
  **/
  @Schema(description = "")
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  public NodeStatisticsForListNodePoolsOutput runningCount(Integer runningCount) {
    this.runningCount = runningCount;
    return this;
  }

   /**
   * Get runningCount
   * @return runningCount
  **/
  @Schema(description = "")
  public Integer getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(Integer runningCount) {
    this.runningCount = runningCount;
  }

  public NodeStatisticsForListNodePoolsOutput totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public NodeStatisticsForListNodePoolsOutput updatingCount(Integer updatingCount) {
    this.updatingCount = updatingCount;
    return this;
  }

   /**
   * Get updatingCount
   * @return updatingCount
  **/
  @Schema(description = "")
  public Integer getUpdatingCount() {
    return updatingCount;
  }

  public void setUpdatingCount(Integer updatingCount) {
    this.updatingCount = updatingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatisticsForListNodePoolsOutput nodeStatisticsForListNodePoolsOutput = (NodeStatisticsForListNodePoolsOutput) o;
    return Objects.equals(this.creatingCount, nodeStatisticsForListNodePoolsOutput.creatingCount) &&
        Objects.equals(this.deletingCount, nodeStatisticsForListNodePoolsOutput.deletingCount) &&
        Objects.equals(this.failedCount, nodeStatisticsForListNodePoolsOutput.failedCount) &&
        Objects.equals(this.runningCount, nodeStatisticsForListNodePoolsOutput.runningCount) &&
        Objects.equals(this.totalCount, nodeStatisticsForListNodePoolsOutput.totalCount) &&
        Objects.equals(this.updatingCount, nodeStatisticsForListNodePoolsOutput.updatingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatingCount, deletingCount, failedCount, runningCount, totalCount, updatingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatisticsForListNodePoolsOutput {\n");
    
    sb.append("    creatingCount: ").append(toIndentedString(creatingCount)).append("\n");
    sb.append("    deletingCount: ").append(toIndentedString(deletingCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    updatingCount: ").append(toIndentedString(updatingCount)).append("\n");
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
