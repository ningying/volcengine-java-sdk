/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * InvokeCommandRequest
 */


public class InvokeCommandRequest {
  @SerializedName("CommandId")
  private String commandId = null;

  @SerializedName("Frequency")
  private String frequency = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("InvocationDescription")
  private String invocationDescription = null;

  @SerializedName("InvocationName")
  private String invocationName = null;

  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("Parameters")
  private String parameters = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RepeatMode")
  private String repeatMode = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("WorkingDir")
  private String workingDir = null;

  public InvokeCommandRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Get commandId
   * @return commandId
  **/
  @Schema(description = "")
  public String getCommandId() {
    return commandId;
  }

  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }

  public InvokeCommandRequest frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public InvokeCommandRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public InvokeCommandRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public InvokeCommandRequest invocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
    return this;
  }

   /**
   * Get invocationDescription
   * @return invocationDescription
  **/
  @Schema(description = "")
  public String getInvocationDescription() {
    return invocationDescription;
  }

  public void setInvocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
  }

  public InvokeCommandRequest invocationName(String invocationName) {
    this.invocationName = invocationName;
    return this;
  }

   /**
   * Get invocationName
   * @return invocationName
  **/
  @Schema(description = "")
  public String getInvocationName() {
    return invocationName;
  }

  public void setInvocationName(String invocationName) {
    this.invocationName = invocationName;
  }

  public InvokeCommandRequest launchTime(String launchTime) {
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

  public InvokeCommandRequest parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public InvokeCommandRequest recurrenceEndTime(String recurrenceEndTime) {
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

  public InvokeCommandRequest repeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
    return this;
  }

   /**
   * Get repeatMode
   * @return repeatMode
  **/
  @Schema(description = "")
  public String getRepeatMode() {
    return repeatMode;
  }

  public void setRepeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
  }

  public InvokeCommandRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public InvokeCommandRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InvokeCommandRequest workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Get workingDir
   * @return workingDir
  **/
  @Schema(description = "")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvokeCommandRequest invokeCommandRequest = (InvokeCommandRequest) o;
    return Objects.equals(this.commandId, invokeCommandRequest.commandId) &&
        Objects.equals(this.frequency, invokeCommandRequest.frequency) &&
        Objects.equals(this.instanceIds, invokeCommandRequest.instanceIds) &&
        Objects.equals(this.invocationDescription, invokeCommandRequest.invocationDescription) &&
        Objects.equals(this.invocationName, invokeCommandRequest.invocationName) &&
        Objects.equals(this.launchTime, invokeCommandRequest.launchTime) &&
        Objects.equals(this.parameters, invokeCommandRequest.parameters) &&
        Objects.equals(this.recurrenceEndTime, invokeCommandRequest.recurrenceEndTime) &&
        Objects.equals(this.repeatMode, invokeCommandRequest.repeatMode) &&
        Objects.equals(this.timeout, invokeCommandRequest.timeout) &&
        Objects.equals(this.username, invokeCommandRequest.username) &&
        Objects.equals(this.workingDir, invokeCommandRequest.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, frequency, instanceIds, invocationDescription, invocationName, launchTime, parameters, recurrenceEndTime, repeatMode, timeout, username, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvokeCommandRequest {\n");
    
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    invocationDescription: ").append(toIndentedString(invocationDescription)).append("\n");
    sb.append("    invocationName: ").append(toIndentedString(invocationName)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
