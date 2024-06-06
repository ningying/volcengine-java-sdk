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
 * ExportImageRequest
 */



public class ExportImageRequest {
  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("TOSBucket")
  private String toSBucket = null;

  @SerializedName("TOSPrefix")
  private String toSPrefix = null;

  public ExportImageRequest imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ExportImageRequest toSBucket(String toSBucket) {
    this.toSBucket = toSBucket;
    return this;
  }

   /**
   * Get toSBucket
   * @return toSBucket
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getToSBucket() {
    return toSBucket;
  }

  public void setToSBucket(String toSBucket) {
    this.toSBucket = toSBucket;
  }

  public ExportImageRequest toSPrefix(String toSPrefix) {
    this.toSPrefix = toSPrefix;
    return this;
  }

   /**
   * Get toSPrefix
   * @return toSPrefix
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getToSPrefix() {
    return toSPrefix;
  }

  public void setToSPrefix(String toSPrefix) {
    this.toSPrefix = toSPrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportImageRequest exportImageRequest = (ExportImageRequest) o;
    return Objects.equals(this.imageId, exportImageRequest.imageId) &&
        Objects.equals(this.toSBucket, exportImageRequest.toSBucket) &&
        Objects.equals(this.toSPrefix, exportImageRequest.toSPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, toSBucket, toSPrefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportImageRequest {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    toSBucket: ").append(toIndentedString(toSBucket)).append("\n");
    sb.append("    toSPrefix: ").append(toIndentedString(toSPrefix)).append("\n");
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
