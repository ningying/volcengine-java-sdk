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
 * OriginRewriteActionForUpdateCdnConfigInput
 */



public class OriginRewriteActionForUpdateCdnConfigInput {
  @SerializedName("RewriteType")
  private String rewriteType = null;

  @SerializedName("SourcePath")
  private String sourcePath = null;

  @SerializedName("TargetPath")
  private String targetPath = null;

  public OriginRewriteActionForUpdateCdnConfigInput rewriteType(String rewriteType) {
    this.rewriteType = rewriteType;
    return this;
  }

   /**
   * Get rewriteType
   * @return rewriteType
  **/
  @Schema(description = "")
  public String getRewriteType() {
    return rewriteType;
  }

  public void setRewriteType(String rewriteType) {
    this.rewriteType = rewriteType;
  }

  public OriginRewriteActionForUpdateCdnConfigInput sourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

   /**
   * Get sourcePath
   * @return sourcePath
  **/
  @Schema(description = "")
  public String getSourcePath() {
    return sourcePath;
  }

  public void setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
  }

  public OriginRewriteActionForUpdateCdnConfigInput targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Get targetPath
   * @return targetPath
  **/
  @Schema(description = "")
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginRewriteActionForUpdateCdnConfigInput originRewriteActionForUpdateCdnConfigInput = (OriginRewriteActionForUpdateCdnConfigInput) o;
    return Objects.equals(this.rewriteType, originRewriteActionForUpdateCdnConfigInput.rewriteType) &&
        Objects.equals(this.sourcePath, originRewriteActionForUpdateCdnConfigInput.sourcePath) &&
        Objects.equals(this.targetPath, originRewriteActionForUpdateCdnConfigInput.targetPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewriteType, sourcePath, targetPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginRewriteActionForUpdateCdnConfigInput {\n");
    
    sb.append("    rewriteType: ").append(toIndentedString(rewriteType)).append("\n");
    sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
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
