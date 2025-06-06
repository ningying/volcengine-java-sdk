/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.DiagnoseConfigForUpdateJobInput;
import com.volcengine.mlplatform20240701.model.ResourceConfigForUpdateJobInput;
import com.volcengine.mlplatform20240701.model.RetryConfigForUpdateJobInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateJobRequest
 */



public class UpdateJobRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DiagnoseConfig")
  private List<DiagnoseConfigForUpdateJobInput> diagnoseConfig = null;

  @SerializedName("DryRun")
  private Boolean dryRun = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ResourceConfig")
  private ResourceConfigForUpdateJobInput resourceConfig = null;

  @SerializedName("RetryConfig")
  private RetryConfigForUpdateJobInput retryConfig = null;

  public UpdateJobRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateJobRequest diagnoseConfig(List<DiagnoseConfigForUpdateJobInput> diagnoseConfig) {
    this.diagnoseConfig = diagnoseConfig;
    return this;
  }

  public UpdateJobRequest addDiagnoseConfigItem(DiagnoseConfigForUpdateJobInput diagnoseConfigItem) {
    if (this.diagnoseConfig == null) {
      this.diagnoseConfig = new ArrayList<DiagnoseConfigForUpdateJobInput>();
    }
    this.diagnoseConfig.add(diagnoseConfigItem);
    return this;
  }

   /**
   * Get diagnoseConfig
   * @return diagnoseConfig
  **/
  @Valid
  @Schema(description = "")
  public List<DiagnoseConfigForUpdateJobInput> getDiagnoseConfig() {
    return diagnoseConfig;
  }

  public void setDiagnoseConfig(List<DiagnoseConfigForUpdateJobInput> diagnoseConfig) {
    this.diagnoseConfig = diagnoseConfig;
  }

  public UpdateJobRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public UpdateJobRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateJobRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateJobRequest resourceConfig(ResourceConfigForUpdateJobInput resourceConfig) {
    this.resourceConfig = resourceConfig;
    return this;
  }

   /**
   * Get resourceConfig
   * @return resourceConfig
  **/
  @Valid
  @Schema(description = "")
  public ResourceConfigForUpdateJobInput getResourceConfig() {
    return resourceConfig;
  }

  public void setResourceConfig(ResourceConfigForUpdateJobInput resourceConfig) {
    this.resourceConfig = resourceConfig;
  }

  public UpdateJobRequest retryConfig(RetryConfigForUpdateJobInput retryConfig) {
    this.retryConfig = retryConfig;
    return this;
  }

   /**
   * Get retryConfig
   * @return retryConfig
  **/
  @Valid
  @Schema(description = "")
  public RetryConfigForUpdateJobInput getRetryConfig() {
    return retryConfig;
  }

  public void setRetryConfig(RetryConfigForUpdateJobInput retryConfig) {
    this.retryConfig = retryConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateJobRequest updateJobRequest = (UpdateJobRequest) o;
    return Objects.equals(this.description, updateJobRequest.description) &&
        Objects.equals(this.diagnoseConfig, updateJobRequest.diagnoseConfig) &&
        Objects.equals(this.dryRun, updateJobRequest.dryRun) &&
        Objects.equals(this.id, updateJobRequest.id) &&
        Objects.equals(this.name, updateJobRequest.name) &&
        Objects.equals(this.resourceConfig, updateJobRequest.resourceConfig) &&
        Objects.equals(this.retryConfig, updateJobRequest.retryConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, diagnoseConfig, dryRun, id, name, resourceConfig, retryConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateJobRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    diagnoseConfig: ").append(toIndentedString(diagnoseConfig)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
    sb.append("    retryConfig: ").append(toIndentedString(retryConfig)).append("\n");
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
