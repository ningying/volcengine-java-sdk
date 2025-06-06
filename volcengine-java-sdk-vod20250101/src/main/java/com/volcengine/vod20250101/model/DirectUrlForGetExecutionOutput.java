/*
 * vod20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vod20250101.model;

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
 * DirectUrlForGetExecutionOutput
 */



public class DirectUrlForGetExecutionOutput {
  @SerializedName("BucketName")
  private String bucketName = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("SpaceName")
  private String spaceName = null;

  public DirectUrlForGetExecutionOutput bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @Schema(description = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public DirectUrlForGetExecutionOutput fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DirectUrlForGetExecutionOutput spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * Get spaceName
   * @return spaceName
  **/
  @Schema(description = "")
  public String getSpaceName() {
    return spaceName;
  }

  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectUrlForGetExecutionOutput directUrlForGetExecutionOutput = (DirectUrlForGetExecutionOutput) o;
    return Objects.equals(this.bucketName, directUrlForGetExecutionOutput.bucketName) &&
        Objects.equals(this.fileName, directUrlForGetExecutionOutput.fileName) &&
        Objects.equals(this.spaceName, directUrlForGetExecutionOutput.spaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, fileName, spaceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectUrlForGetExecutionOutput {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
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
