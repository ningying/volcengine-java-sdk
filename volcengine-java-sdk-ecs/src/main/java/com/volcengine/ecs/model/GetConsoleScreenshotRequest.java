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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetConsoleScreenshotRequest
 */



public class GetConsoleScreenshotRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("WakeUp")
  private Boolean wakeUp = null;

  public GetConsoleScreenshotRequest instanceId(String instanceId) {
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

  public GetConsoleScreenshotRequest wakeUp(Boolean wakeUp) {
    this.wakeUp = wakeUp;
    return this;
  }

   /**
   * Get wakeUp
   * @return wakeUp
  **/
  @Schema(description = "")
  public Boolean isWakeUp() {
    return wakeUp;
  }

  public void setWakeUp(Boolean wakeUp) {
    this.wakeUp = wakeUp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConsoleScreenshotRequest getConsoleScreenshotRequest = (GetConsoleScreenshotRequest) o;
    return Objects.equals(this.instanceId, getConsoleScreenshotRequest.instanceId) &&
        Objects.equals(this.wakeUp, getConsoleScreenshotRequest.wakeUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, wakeUp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConsoleScreenshotRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    wakeUp: ").append(toIndentedString(wakeUp)).append("\n");
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
