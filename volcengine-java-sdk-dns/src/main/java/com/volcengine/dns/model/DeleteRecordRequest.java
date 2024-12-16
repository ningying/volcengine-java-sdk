/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * DeleteRecordRequest
 */



public class DeleteRecordRequest {
  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RecordID")
  private String recordID = null;

  public DeleteRecordRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DeleteRecordRequest recordID(String recordID) {
    this.recordID = recordID;
    return this;
  }

   /**
   * Get recordID
   * @return recordID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRecordID() {
    return recordID;
  }

  public void setRecordID(String recordID) {
    this.recordID = recordID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteRecordRequest deleteRecordRequest = (DeleteRecordRequest) o;
    return Objects.equals(this.projectName, deleteRecordRequest.projectName) &&
        Objects.equals(this.recordID, deleteRecordRequest.recordID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, recordID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRecordRequest {\n");
    
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    recordID: ").append(toIndentedString(recordID)).append("\n");
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