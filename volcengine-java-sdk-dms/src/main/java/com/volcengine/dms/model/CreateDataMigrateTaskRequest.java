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
import com.volcengine.dms.model.AdvanceConfigForCreateDataMigrateTaskInput;
import com.volcengine.dms.model.BasicConfigForCreateDataMigrateTaskInput;
import com.volcengine.dms.model.SourceForCreateDataMigrateTaskInput;
import com.volcengine.dms.model.TargetForCreateDataMigrateTaskInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDataMigrateTaskRequest
 */



public class CreateDataMigrateTaskRequest {
  @SerializedName("AdvanceConfig")
  private AdvanceConfigForCreateDataMigrateTaskInput advanceConfig = null;

  @SerializedName("BasicConfig")
  private BasicConfigForCreateDataMigrateTaskInput basicConfig = null;

  @SerializedName("Source")
  private SourceForCreateDataMigrateTaskInput source = null;

  @SerializedName("Target")
  private TargetForCreateDataMigrateTaskInput target = null;

  public CreateDataMigrateTaskRequest advanceConfig(AdvanceConfigForCreateDataMigrateTaskInput advanceConfig) {
    this.advanceConfig = advanceConfig;
    return this;
  }

   /**
   * Get advanceConfig
   * @return advanceConfig
  **/
  @Valid
  @Schema(description = "")
  public AdvanceConfigForCreateDataMigrateTaskInput getAdvanceConfig() {
    return advanceConfig;
  }

  public void setAdvanceConfig(AdvanceConfigForCreateDataMigrateTaskInput advanceConfig) {
    this.advanceConfig = advanceConfig;
  }

  public CreateDataMigrateTaskRequest basicConfig(BasicConfigForCreateDataMigrateTaskInput basicConfig) {
    this.basicConfig = basicConfig;
    return this;
  }

   /**
   * Get basicConfig
   * @return basicConfig
  **/
  @Valid
  @Schema(description = "")
  public BasicConfigForCreateDataMigrateTaskInput getBasicConfig() {
    return basicConfig;
  }

  public void setBasicConfig(BasicConfigForCreateDataMigrateTaskInput basicConfig) {
    this.basicConfig = basicConfig;
  }

  public CreateDataMigrateTaskRequest source(SourceForCreateDataMigrateTaskInput source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Valid
  @Schema(description = "")
  public SourceForCreateDataMigrateTaskInput getSource() {
    return source;
  }

  public void setSource(SourceForCreateDataMigrateTaskInput source) {
    this.source = source;
  }

  public CreateDataMigrateTaskRequest target(TargetForCreateDataMigrateTaskInput target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Valid
  @Schema(description = "")
  public TargetForCreateDataMigrateTaskInput getTarget() {
    return target;
  }

  public void setTarget(TargetForCreateDataMigrateTaskInput target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataMigrateTaskRequest createDataMigrateTaskRequest = (CreateDataMigrateTaskRequest) o;
    return Objects.equals(this.advanceConfig, createDataMigrateTaskRequest.advanceConfig) &&
        Objects.equals(this.basicConfig, createDataMigrateTaskRequest.basicConfig) &&
        Objects.equals(this.source, createDataMigrateTaskRequest.source) &&
        Objects.equals(this.target, createDataMigrateTaskRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advanceConfig, basicConfig, source, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataMigrateTaskRequest {\n");
    
    sb.append("    advanceConfig: ").append(toIndentedString(advanceConfig)).append("\n");
    sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
