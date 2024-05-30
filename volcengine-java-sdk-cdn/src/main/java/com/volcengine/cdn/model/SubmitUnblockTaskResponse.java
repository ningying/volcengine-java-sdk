/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * SubmitUnblockTaskResponse
 */



public class SubmitUnblockTaskResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("TaskID")
  private String taskID = null;

  public SubmitUnblockTaskResponse taskID(String taskID) {
    this.taskID = taskID;
    return this;
  }

   /**
   * Get taskID
   * @return taskID
  **/
  @Schema(description = "")
  public String getTaskID() {
    return taskID;
  }

  public void setTaskID(String taskID) {
    this.taskID = taskID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitUnblockTaskResponse submitUnblockTaskResponse = (SubmitUnblockTaskResponse) o;
    return Objects.equals(this.taskID, submitUnblockTaskResponse.taskID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitUnblockTaskResponse {\n");
    
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
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
