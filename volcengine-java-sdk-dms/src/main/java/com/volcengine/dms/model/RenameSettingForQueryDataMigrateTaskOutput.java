/*
 * dms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dms.model;

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
 * RenameSettingForQueryDataMigrateTaskOutput
 */



public class RenameSettingForQueryDataMigrateTaskOutput {
  @SerializedName("Pattern")
  private String pattern = null;

  @SerializedName("ReplaceStr")
  private String replaceStr = null;

  public RenameSettingForQueryDataMigrateTaskOutput pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
 @Size(max=696)  @Schema(description = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public RenameSettingForQueryDataMigrateTaskOutput replaceStr(String replaceStr) {
    this.replaceStr = replaceStr;
    return this;
  }

   /**
   * Get replaceStr
   * @return replaceStr
  **/
  @Schema(description = "")
  public String getReplaceStr() {
    return replaceStr;
  }

  public void setReplaceStr(String replaceStr) {
    this.replaceStr = replaceStr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameSettingForQueryDataMigrateTaskOutput renameSettingForQueryDataMigrateTaskOutput = (RenameSettingForQueryDataMigrateTaskOutput) o;
    return Objects.equals(this.pattern, renameSettingForQueryDataMigrateTaskOutput.pattern) &&
        Objects.equals(this.replaceStr, renameSettingForQueryDataMigrateTaskOutput.replaceStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, replaceStr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenameSettingForQueryDataMigrateTaskOutput {\n");
    
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    replaceStr: ").append(toIndentedString(replaceStr)).append("\n");
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
