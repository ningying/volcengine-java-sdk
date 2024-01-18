/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * MountPointForDescribeMountPointsOutput
 */


public class MountPointForDescribeMountPointsOutput {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("MountPointId")
  private String mountPointId = null;

  @SerializedName("MountPointName")
  private String mountPointName = null;

  public MountPointForDescribeMountPointsOutput fileSystemId(String fileSystemId) {
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

  public MountPointForDescribeMountPointsOutput mountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
    return this;
  }

   /**
   * Get mountPointId
   * @return mountPointId
  **/
  @Schema(description = "")
  public String getMountPointId() {
    return mountPointId;
  }

  public void setMountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
  }

  public MountPointForDescribeMountPointsOutput mountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
    return this;
  }

   /**
   * Get mountPointName
   * @return mountPointName
  **/
  @Schema(description = "")
  public String getMountPointName() {
    return mountPointName;
  }

  public void setMountPointName(String mountPointName) {
    this.mountPointName = mountPointName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountPointForDescribeMountPointsOutput mountPointForDescribeMountPointsOutput = (MountPointForDescribeMountPointsOutput) o;
    return Objects.equals(this.fileSystemId, mountPointForDescribeMountPointsOutput.fileSystemId) &&
        Objects.equals(this.mountPointId, mountPointForDescribeMountPointsOutput.mountPointId) &&
        Objects.equals(this.mountPointName, mountPointForDescribeMountPointsOutput.mountPointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, mountPointId, mountPointName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountPointForDescribeMountPointsOutput {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    mountPointId: ").append(toIndentedString(mountPointId)).append("\n");
    sb.append("    mountPointName: ").append(toIndentedString(mountPointName)).append("\n");
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
