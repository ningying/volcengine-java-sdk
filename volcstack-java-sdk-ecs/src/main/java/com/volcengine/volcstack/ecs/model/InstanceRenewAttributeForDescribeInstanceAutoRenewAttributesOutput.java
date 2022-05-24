/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.ecs.model.RenewTypeForDescribeInstanceAutoRenewAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("RenewType")
  private RenewTypeForDescribeInstanceAutoRenewAttributesOutput renewType = null;

  public InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput instanceId(String instanceId) {
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

  public InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput renewType(RenewTypeForDescribeInstanceAutoRenewAttributesOutput renewType) {
    this.renewType = renewType;
    return this;
  }

   /**
   * Get renewType
   * @return renewType
  **/
  @Valid
  @Schema(description = "")
  public RenewTypeForDescribeInstanceAutoRenewAttributesOutput getRenewType() {
    return renewType;
  }

  public void setRenewType(RenewTypeForDescribeInstanceAutoRenewAttributesOutput renewType) {
    this.renewType = renewType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput instanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput = (InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput) o;
    return Objects.equals(this.instanceId, instanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput.instanceId) &&
        Objects.equals(this.renewType, instanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput.renewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, renewType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceRenewAttributeForDescribeInstanceAutoRenewAttributesOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
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
