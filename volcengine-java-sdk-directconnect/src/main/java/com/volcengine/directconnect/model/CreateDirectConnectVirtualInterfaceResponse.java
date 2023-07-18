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
 * CreateDirectConnectVirtualInterfaceResponse
 */



public class CreateDirectConnectVirtualInterfaceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  public CreateDirectConnectVirtualInterfaceResponse requestId(String requestId) {
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

  public CreateDirectConnectVirtualInterfaceResponse virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @Schema(description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDirectConnectVirtualInterfaceResponse createDirectConnectVirtualInterfaceResponse = (CreateDirectConnectVirtualInterfaceResponse) o;
    return Objects.equals(this.requestId, createDirectConnectVirtualInterfaceResponse.requestId) &&
        Objects.equals(this.virtualInterfaceId, createDirectConnectVirtualInterfaceResponse.virtualInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, virtualInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectConnectVirtualInterfaceResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
