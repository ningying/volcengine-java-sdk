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
 * CompleteLifecycleActivityRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:18.429222+08:00[Asia/Shanghai]")
public class CompleteLifecycleActivityRequest {
  @SerializedName("LifecycleActivityId")
  private String lifecycleActivityId = null;

  @SerializedName("LifecycleActivityPolicy")
  private String lifecycleActivityPolicy = null;

  public CompleteLifecycleActivityRequest lifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
    return this;
  }

   /**
   * Get lifecycleActivityId
   * @return lifecycleActivityId
  **/
  @Schema(description = "")
  public String getLifecycleActivityId() {
    return lifecycleActivityId;
  }

  public void setLifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
  }

  public CompleteLifecycleActivityRequest lifecycleActivityPolicy(String lifecycleActivityPolicy) {
    this.lifecycleActivityPolicy = lifecycleActivityPolicy;
    return this;
  }

   /**
   * Get lifecycleActivityPolicy
   * @return lifecycleActivityPolicy
  **/
  @Schema(description = "")
  public String getLifecycleActivityPolicy() {
    return lifecycleActivityPolicy;
  }

  public void setLifecycleActivityPolicy(String lifecycleActivityPolicy) {
    this.lifecycleActivityPolicy = lifecycleActivityPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteLifecycleActivityRequest completeLifecycleActivityRequest = (CompleteLifecycleActivityRequest) o;
    return Objects.equals(this.lifecycleActivityId, completeLifecycleActivityRequest.lifecycleActivityId) &&
        Objects.equals(this.lifecycleActivityPolicy, completeLifecycleActivityRequest.lifecycleActivityPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleActivityId, lifecycleActivityPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteLifecycleActivityRequest {\n");
    
    sb.append("    lifecycleActivityId: ").append(toIndentedString(lifecycleActivityId)).append("\n");
    sb.append("    lifecycleActivityPolicy: ").append(toIndentedString(lifecycleActivityPolicy)).append("\n");
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
