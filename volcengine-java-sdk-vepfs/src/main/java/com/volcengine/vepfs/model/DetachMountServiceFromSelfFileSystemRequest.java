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
 * DetachMountServiceFromSelfFileSystemRequest
 */



public class DetachMountServiceFromSelfFileSystemRequest {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("MountServiceId")
  private String mountServiceId = null;

  public DetachMountServiceFromSelfFileSystemRequest fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public DetachMountServiceFromSelfFileSystemRequest mountServiceId(String mountServiceId) {
    this.mountServiceId = mountServiceId;
    return this;
  }

   /**
   * Get mountServiceId
   * @return mountServiceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getMountServiceId() {
    return mountServiceId;
  }

  public void setMountServiceId(String mountServiceId) {
    this.mountServiceId = mountServiceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetachMountServiceFromSelfFileSystemRequest detachMountServiceFromSelfFileSystemRequest = (DetachMountServiceFromSelfFileSystemRequest) o;
    return Objects.equals(this.fileSystemId, detachMountServiceFromSelfFileSystemRequest.fileSystemId) &&
        Objects.equals(this.mountServiceId, detachMountServiceFromSelfFileSystemRequest.mountServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, mountServiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachMountServiceFromSelfFileSystemRequest {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    mountServiceId: ").append(toIndentedString(mountServiceId)).append("\n");
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
