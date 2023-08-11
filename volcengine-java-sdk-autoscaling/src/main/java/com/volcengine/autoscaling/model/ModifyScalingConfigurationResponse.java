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

package com.volcengine.autoscaling.model;

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
 * ModifyScalingConfigurationResponse
 */


public class ModifyScalingConfigurationResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ScalingConfigurationId")
  private String scalingConfigurationId = null;

  public ModifyScalingConfigurationResponse scalingConfigurationId(String scalingConfigurationId) {
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
    ModifyScalingConfigurationResponse modifyScalingConfigurationResponse = (ModifyScalingConfigurationResponse) o;
    return Objects.equals(this.scalingConfigurationId, modifyScalingConfigurationResponse.scalingConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingConfigurationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyScalingConfigurationResponse {\n");
    
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
