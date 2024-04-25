/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * RetryPurgePrefetchTaskRequest
 */


public class RetryPurgePrefetchTaskRequest {
  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskType")
  private String taskType = null;

  public RetryPurgePrefetchTaskRequest taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public RetryPurgePrefetchTaskRequest taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryPurgePrefetchTaskRequest retryPurgePrefetchTaskRequest = (RetryPurgePrefetchTaskRequest) o;
    return Objects.equals(this.taskId, retryPurgePrefetchTaskRequest.taskId) &&
        Objects.equals(this.taskType, retryPurgePrefetchTaskRequest.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryPurgePrefetchTaskRequest {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
