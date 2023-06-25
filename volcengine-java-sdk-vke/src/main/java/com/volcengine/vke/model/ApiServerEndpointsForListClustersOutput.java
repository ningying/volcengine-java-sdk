/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.PrivateIpForListClustersOutput;
import com.volcengine.vke.model.PublicIpForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ApiServerEndpointsForListClustersOutput
 */



public class ApiServerEndpointsForListClustersOutput {
  @SerializedName("PrivateIp")
  private PrivateIpForListClustersOutput privateIp = null;

  @SerializedName("PublicIp")
  private PublicIpForListClustersOutput publicIp = null;

  public ApiServerEndpointsForListClustersOutput privateIp(PrivateIpForListClustersOutput privateIp) {
    this.privateIp = privateIp;
    return this;
  }

   /**
   * Get privateIp
   * @return privateIp
  **/
  @Valid
  @Schema(description = "")
  public PrivateIpForListClustersOutput getPrivateIp() {
    return privateIp;
  }

  public void setPrivateIp(PrivateIpForListClustersOutput privateIp) {
    this.privateIp = privateIp;
  }

  public ApiServerEndpointsForListClustersOutput publicIp(PublicIpForListClustersOutput publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Get publicIp
   * @return publicIp
  **/
  @Valid
  @Schema(description = "")
  public PublicIpForListClustersOutput getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(PublicIpForListClustersOutput publicIp) {
    this.publicIp = publicIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiServerEndpointsForListClustersOutput apiServerEndpointsForListClustersOutput = (ApiServerEndpointsForListClustersOutput) o;
    return Objects.equals(this.privateIp, apiServerEndpointsForListClustersOutput.privateIp) &&
        Objects.equals(this.publicIp, apiServerEndpointsForListClustersOutput.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateIp, publicIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiServerEndpointsForListClustersOutput {\n");
    
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
