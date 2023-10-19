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
 * StorageForDescribeFileSystemsOutput
 */


public class StorageForDescribeFileSystemsOutput {
  @SerializedName("SubVolume")
  private String subVolume = null;

  @SerializedName("Volume")
  private String volume = null;

  public StorageForDescribeFileSystemsOutput subVolume(String subVolume) {
    this.subVolume = subVolume;
    return this;
  }

   /**
   * Get subVolume
   * @return subVolume
  **/
  @Schema(description = "")
  public String getSubVolume() {
    return subVolume;
  }

  public void setSubVolume(String subVolume) {
    this.subVolume = subVolume;
  }

  public StorageForDescribeFileSystemsOutput volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageForDescribeFileSystemsOutput storageForDescribeFileSystemsOutput = (StorageForDescribeFileSystemsOutput) o;
    return Objects.equals(this.subVolume, storageForDescribeFileSystemsOutput.subVolume) &&
        Objects.equals(this.volume, storageForDescribeFileSystemsOutput.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subVolume, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageForDescribeFileSystemsOutput {\n");
    
    sb.append("    subVolume: ").append(toIndentedString(subVolume)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
