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
 * DescribeDirectConnectGatewayAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:26.992284+08:00[Asia/Shanghai]")
public class DescribeDirectConnectGatewayAttributesRequest {
  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  public DescribeDirectConnectGatewayAttributesRequest directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectGatewayAttributesRequest describeDirectConnectGatewayAttributesRequest = (DescribeDirectConnectGatewayAttributesRequest) o;
    return Objects.equals(this.directConnectGatewayId, describeDirectConnectGatewayAttributesRequest.directConnectGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectGatewayAttributesRequest {\n");
    
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
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
