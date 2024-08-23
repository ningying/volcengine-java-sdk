/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * ModifyVpcGatewayEndpointAttributesRequest
 */



public class ModifyVpcGatewayEndpointAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("VpcPolicy")
  private String vpcPolicy = null;

  public ModifyVpcGatewayEndpointAttributesRequest description(String description) {
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

  public ModifyVpcGatewayEndpointAttributesRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ModifyVpcGatewayEndpointAttributesRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public ModifyVpcGatewayEndpointAttributesRequest vpcPolicy(String vpcPolicy) {
    this.vpcPolicy = vpcPolicy;
    return this;
  }

   /**
   * Get vpcPolicy
   * @return vpcPolicy
  **/
  @Schema(description = "")
  public String getVpcPolicy() {
    return vpcPolicy;
  }

  public void setVpcPolicy(String vpcPolicy) {
    this.vpcPolicy = vpcPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyVpcGatewayEndpointAttributesRequest modifyVpcGatewayEndpointAttributesRequest = (ModifyVpcGatewayEndpointAttributesRequest) o;
    return Objects.equals(this.description, modifyVpcGatewayEndpointAttributesRequest.description) &&
        Objects.equals(this.endpointId, modifyVpcGatewayEndpointAttributesRequest.endpointId) &&
        Objects.equals(this.endpointName, modifyVpcGatewayEndpointAttributesRequest.endpointName) &&
        Objects.equals(this.vpcPolicy, modifyVpcGatewayEndpointAttributesRequest.vpcPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endpointId, endpointName, vpcPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyVpcGatewayEndpointAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    vpcPolicy: ").append(toIndentedString(vpcPolicy)).append("\n");
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
