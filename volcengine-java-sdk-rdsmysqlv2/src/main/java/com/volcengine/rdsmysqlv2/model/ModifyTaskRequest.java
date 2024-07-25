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
 * ModifyTaskRequest
 */



public class ModifyTaskRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ModifyType")
  private String modifyType = null;

  @SerializedName("SwitchTime")
  private String switchTime = null;

  @SerializedName("TaskId")
  private String taskId = null;

  public ModifyTaskRequest instanceId(String instanceId) {
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

  public ModifyTaskRequest modifyType(String modifyType) {
    this.modifyType = modifyType;
    return this;
  }

   /**
   * Get modifyType
   * @return modifyType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getModifyType() {
    return modifyType;
  }

  public void setModifyType(String modifyType) {
    this.modifyType = modifyType;
  }

  public ModifyTaskRequest switchTime(String switchTime) {
    this.switchTime = switchTime;
    return this;
  }

   /**
   * Get switchTime
   * @return switchTime
  **/
  @Schema(description = "")
  public String getSwitchTime() {
    return switchTime;
  }

  public void setSwitchTime(String switchTime) {
    this.switchTime = switchTime;
  }

  public ModifyTaskRequest taskId(String taskId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyTaskRequest modifyTaskRequest = (ModifyTaskRequest) o;
    return Objects.equals(this.instanceId, modifyTaskRequest.instanceId) &&
        Objects.equals(this.modifyType, modifyTaskRequest.modifyType) &&
        Objects.equals(this.switchTime, modifyTaskRequest.switchTime) &&
        Objects.equals(this.taskId, modifyTaskRequest.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, modifyType, switchTime, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTaskRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    modifyType: ").append(toIndentedString(modifyType)).append("\n");
    sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
