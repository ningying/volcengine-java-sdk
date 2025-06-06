/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

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
 * DescribeVirtualInterfaceBGPPeerRequest
 */



public class DescribeVirtualInterfaceBGPPeerRequest {
  @SerializedName("VIFInstanceId")
  private String viFInstanceId = null;

  public DescribeVirtualInterfaceBGPPeerRequest viFInstanceId(String viFInstanceId) {
    this.viFInstanceId = viFInstanceId;
    return this;
  }

   /**
   * Get viFInstanceId
   * @return viFInstanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getViFInstanceId() {
    return viFInstanceId;
  }

  public void setViFInstanceId(String viFInstanceId) {
    this.viFInstanceId = viFInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVirtualInterfaceBGPPeerRequest describeVirtualInterfaceBGPPeerRequest = (DescribeVirtualInterfaceBGPPeerRequest) o;
    return Objects.equals(this.viFInstanceId, describeVirtualInterfaceBGPPeerRequest.viFInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viFInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVirtualInterfaceBGPPeerRequest {\n");
    
    sb.append("    viFInstanceId: ").append(toIndentedString(viFInstanceId)).append("\n");
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
