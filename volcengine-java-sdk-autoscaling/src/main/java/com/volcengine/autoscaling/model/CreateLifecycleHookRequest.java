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
 * CreateLifecycleHookRequest
 */


public class CreateLifecycleHookRequest {
  @SerializedName("LifecycleHookName")
  private String lifecycleHookName = null;

  @SerializedName("LifecycleHookPolicy")
  private String lifecycleHookPolicy = null;

  @SerializedName("LifecycleHookTimeout")
  private Integer lifecycleHookTimeout = null;

  @SerializedName("LifecycleHookType")
  private String lifecycleHookType = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public CreateLifecycleHookRequest lifecycleHookName(String lifecycleHookName) {
    this.lifecycleHookName = lifecycleHookName;
    return this;
  }

   /**
   * Get lifecycleHookName
   * @return lifecycleHookName
  **/
  @Schema(description = "")
  public String getLifecycleHookName() {
    return lifecycleHookName;
  }

  public void setLifecycleHookName(String lifecycleHookName) {
    this.lifecycleHookName = lifecycleHookName;
  }

  public CreateLifecycleHookRequest lifecycleHookPolicy(String lifecycleHookPolicy) {
    this.lifecycleHookPolicy = lifecycleHookPolicy;
    return this;
  }

   /**
   * Get lifecycleHookPolicy
   * @return lifecycleHookPolicy
  **/
  @Schema(description = "")
  public String getLifecycleHookPolicy() {
    return lifecycleHookPolicy;
  }

  public void setLifecycleHookPolicy(String lifecycleHookPolicy) {
    this.lifecycleHookPolicy = lifecycleHookPolicy;
  }

  public CreateLifecycleHookRequest lifecycleHookTimeout(Integer lifecycleHookTimeout) {
    this.lifecycleHookTimeout = lifecycleHookTimeout;
    return this;
  }

   /**
   * Get lifecycleHookTimeout
   * @return lifecycleHookTimeout
  **/
  @Schema(description = "")
  public Integer getLifecycleHookTimeout() {
    return lifecycleHookTimeout;
  }

  public void setLifecycleHookTimeout(Integer lifecycleHookTimeout) {
    this.lifecycleHookTimeout = lifecycleHookTimeout;
  }

  public CreateLifecycleHookRequest lifecycleHookType(String lifecycleHookType) {
    this.lifecycleHookType = lifecycleHookType;
    return this;
  }

   /**
   * Get lifecycleHookType
   * @return lifecycleHookType
  **/
  @Schema(description = "")
  public String getLifecycleHookType() {
    return lifecycleHookType;
  }

  public void setLifecycleHookType(String lifecycleHookType) {
    this.lifecycleHookType = lifecycleHookType;
  }

  public CreateLifecycleHookRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLifecycleHookRequest createLifecycleHookRequest = (CreateLifecycleHookRequest) o;
    return Objects.equals(this.lifecycleHookName, createLifecycleHookRequest.lifecycleHookName) &&
        Objects.equals(this.lifecycleHookPolicy, createLifecycleHookRequest.lifecycleHookPolicy) &&
        Objects.equals(this.lifecycleHookTimeout, createLifecycleHookRequest.lifecycleHookTimeout) &&
        Objects.equals(this.lifecycleHookType, createLifecycleHookRequest.lifecycleHookType) &&
        Objects.equals(this.scalingGroupId, createLifecycleHookRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleHookName, lifecycleHookPolicy, lifecycleHookTimeout, lifecycleHookType, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLifecycleHookRequest {\n");
    
    sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
    sb.append("    lifecycleHookPolicy: ").append(toIndentedString(lifecycleHookPolicy)).append("\n");
    sb.append("    lifecycleHookTimeout: ").append(toIndentedString(lifecycleHookTimeout)).append("\n");
    sb.append("    lifecycleHookType: ").append(toIndentedString(lifecycleHookType)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
