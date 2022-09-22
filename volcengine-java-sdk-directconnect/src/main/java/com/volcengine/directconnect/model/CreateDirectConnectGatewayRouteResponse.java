/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * CreateDirectConnectGatewayRouteResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:22.987183+08:00[Asia/Shanghai]")
public class CreateDirectConnectGatewayRouteResponse {
  @SerializedName("DirectConnectGatewayRouteId")
  private String directConnectGatewayRouteId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateDirectConnectGatewayRouteResponse directConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
    return this;
  }

   /**
   * Get directConnectGatewayRouteId
   * @return directConnectGatewayRouteId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayRouteId() {
    return directConnectGatewayRouteId;
  }

  public void setDirectConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
  }

  public CreateDirectConnectGatewayRouteResponse requestId(String requestId) {
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
    CreateDirectConnectGatewayRouteResponse createDirectConnectGatewayRouteResponse = (CreateDirectConnectGatewayRouteResponse) o;
    return Objects.equals(this.directConnectGatewayRouteId, createDirectConnectGatewayRouteResponse.directConnectGatewayRouteId) &&
        Objects.equals(this.requestId, createDirectConnectGatewayRouteResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectGatewayRouteId, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectConnectGatewayRouteResponse {\n");
    
    sb.append("    directConnectGatewayRouteId: ").append(toIndentedString(directConnectGatewayRouteId)).append("\n");
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
