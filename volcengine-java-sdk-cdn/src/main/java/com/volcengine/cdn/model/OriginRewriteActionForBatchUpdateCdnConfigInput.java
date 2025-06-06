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
 * OriginRewriteActionForBatchUpdateCdnConfigInput
 */



public class OriginRewriteActionForBatchUpdateCdnConfigInput {
  @SerializedName("RewriteType")
  private String rewriteType = null;

  @SerializedName("SourcePath")
  private String sourcePath = null;

  @SerializedName("TargetPath")
  private String targetPath = null;

  public OriginRewriteActionForBatchUpdateCdnConfigInput rewriteType(String rewriteType) {
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

  public OriginRewriteActionForBatchUpdateCdnConfigInput sourcePath(String sourcePath) {
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

  public OriginRewriteActionForBatchUpdateCdnConfigInput targetPath(String targetPath) {
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
    OriginRewriteActionForBatchUpdateCdnConfigInput originRewriteActionForBatchUpdateCdnConfigInput = (OriginRewriteActionForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.rewriteType, originRewriteActionForBatchUpdateCdnConfigInput.rewriteType) &&
        Objects.equals(this.sourcePath, originRewriteActionForBatchUpdateCdnConfigInput.sourcePath) &&
        Objects.equals(this.targetPath, originRewriteActionForBatchUpdateCdnConfigInput.targetPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewriteType, sourcePath, targetPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginRewriteActionForBatchUpdateCdnConfigInput {\n");
    
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
