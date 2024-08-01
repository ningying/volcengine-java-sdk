/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest
 */



public class ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  @SerializedName("TransitRouterAttachmentName")
  private String transitRouterAttachmentName = null;

  public ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest description(String description) {
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

  public ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest transitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
    return this;
  }

   /**
   * Get transitRouterAttachmentId
   * @return transitRouterAttachmentId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterAttachmentId() {
    return transitRouterAttachmentId;
  }

  public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
  }

  public ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest transitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
    return this;
  }

   /**
   * Get transitRouterAttachmentName
   * @return transitRouterAttachmentName
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentName() {
    return transitRouterAttachmentName;
  }

  public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest modifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest = (ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest) o;
    return Objects.equals(this.description, modifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest.description) &&
        Objects.equals(this.transitRouterAttachmentId, modifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest.transitRouterAttachmentId) &&
        Objects.equals(this.transitRouterAttachmentName, modifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest.transitRouterAttachmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, transitRouterAttachmentId, transitRouterAttachmentName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTransitRouterDirectConnectGatewayAttachmentAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
    sb.append("    transitRouterAttachmentName: ").append(toIndentedString(transitRouterAttachmentName)).append("\n");
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
