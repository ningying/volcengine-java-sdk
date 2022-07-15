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
 * RelatedInstanceForDescribeScalingActivitiesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:18.429222+08:00[Asia/Shanghai]")
public class RelatedInstanceForDescribeScalingActivitiesOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("OperateType")
  private String operateType = null;

  @SerializedName("Status")
  private String status = null;

  public RelatedInstanceForDescribeScalingActivitiesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public RelatedInstanceForDescribeScalingActivitiesOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RelatedInstanceForDescribeScalingActivitiesOutput operateType(String operateType) {
    this.operateType = operateType;
    return this;
  }

   /**
   * Get operateType
   * @return operateType
  **/
  @Schema(description = "")
  public String getOperateType() {
    return operateType;
  }

  public void setOperateType(String operateType) {
    this.operateType = operateType;
  }

  public RelatedInstanceForDescribeScalingActivitiesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedInstanceForDescribeScalingActivitiesOutput relatedInstanceForDescribeScalingActivitiesOutput = (RelatedInstanceForDescribeScalingActivitiesOutput) o;
    return Objects.equals(this.instanceId, relatedInstanceForDescribeScalingActivitiesOutput.instanceId) &&
        Objects.equals(this.message, relatedInstanceForDescribeScalingActivitiesOutput.message) &&
        Objects.equals(this.operateType, relatedInstanceForDescribeScalingActivitiesOutput.operateType) &&
        Objects.equals(this.status, relatedInstanceForDescribeScalingActivitiesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, message, operateType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedInstanceForDescribeScalingActivitiesOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
