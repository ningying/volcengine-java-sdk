/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

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
 * DeleteScalingConfigurationRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class DeleteScalingConfigurationRequest {
  @SerializedName("ScalingConfigurationId")
  private String scalingConfigurationId = null;

  public DeleteScalingConfigurationRequest scalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
    return this;
  }

   /**
   * Get scalingConfigurationId
   * @return scalingConfigurationId
  **/
  @Schema(description = "")
  public String getScalingConfigurationId() {
    return scalingConfigurationId;
  }

  public void setScalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteScalingConfigurationRequest deleteScalingConfigurationRequest = (DeleteScalingConfigurationRequest) o;
    return Objects.equals(this.scalingConfigurationId, deleteScalingConfigurationRequest.scalingConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingConfigurationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteScalingConfigurationRequest {\n");
    
    sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
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
