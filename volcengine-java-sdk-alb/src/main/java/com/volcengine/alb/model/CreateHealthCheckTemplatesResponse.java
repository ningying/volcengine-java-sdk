/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateHealthCheckTemplatesResponse
 */


public class CreateHealthCheckTemplatesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("HealthCheckTemplateIDs")
  private List<String> healthCheckTemplateIDs = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateHealthCheckTemplatesResponse healthCheckTemplateIDs(List<String> healthCheckTemplateIDs) {
    this.healthCheckTemplateIDs = healthCheckTemplateIDs;
    return this;
  }

  public CreateHealthCheckTemplatesResponse addHealthCheckTemplateIDsItem(String healthCheckTemplateIDsItem) {
    if (this.healthCheckTemplateIDs == null) {
      this.healthCheckTemplateIDs = new ArrayList<String>();
    }
    this.healthCheckTemplateIDs.add(healthCheckTemplateIDsItem);
    return this;
  }

   /**
   * Get healthCheckTemplateIDs
   * @return healthCheckTemplateIDs
  **/
  @Schema(description = "")
  public List<String> getHealthCheckTemplateIDs() {
    return healthCheckTemplateIDs;
  }

  public void setHealthCheckTemplateIDs(List<String> healthCheckTemplateIDs) {
    this.healthCheckTemplateIDs = healthCheckTemplateIDs;
  }

  public CreateHealthCheckTemplatesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHealthCheckTemplatesResponse createHealthCheckTemplatesResponse = (CreateHealthCheckTemplatesResponse) o;
    return Objects.equals(this.healthCheckTemplateIDs, createHealthCheckTemplatesResponse.healthCheckTemplateIDs) &&
        Objects.equals(this.requestId, createHealthCheckTemplatesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckTemplateIDs, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHealthCheckTemplatesResponse {\n");
    
    sb.append("    healthCheckTemplateIDs: ").append(toIndentedString(healthCheckTemplateIDs)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
