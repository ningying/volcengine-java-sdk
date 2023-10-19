/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

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
 * ExpandFileSystemRequest
 */


public class ExpandFileSystemRequest {
  @SerializedName("Capacity")
  private Integer capacity = null;

  @SerializedName("EnableRestripe")
  private Boolean enableRestripe = null;

  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  public ExpandFileSystemRequest capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @Schema(description = "")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public ExpandFileSystemRequest enableRestripe(Boolean enableRestripe) {
    this.enableRestripe = enableRestripe;
    return this;
  }

   /**
   * Get enableRestripe
   * @return enableRestripe
  **/
  @Schema(description = "")
  public Boolean isEnableRestripe() {
    return enableRestripe;
  }

  public void setEnableRestripe(Boolean enableRestripe) {
    this.enableRestripe = enableRestripe;
  }

  public ExpandFileSystemRequest fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandFileSystemRequest expandFileSystemRequest = (ExpandFileSystemRequest) o;
    return Objects.equals(this.capacity, expandFileSystemRequest.capacity) &&
        Objects.equals(this.enableRestripe, expandFileSystemRequest.enableRestripe) &&
        Objects.equals(this.fileSystemId, expandFileSystemRequest.fileSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, enableRestripe, fileSystemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandFileSystemRequest {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    enableRestripe: ").append(toIndentedString(enableRestripe)).append("\n");
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
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
