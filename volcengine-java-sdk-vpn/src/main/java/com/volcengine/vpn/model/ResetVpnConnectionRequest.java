/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * ResetVpnConnectionRequest
 */



public class ResetVpnConnectionRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("VpnConnectionId")
  private String vpnConnectionId = null;

  public ResetVpnConnectionRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public ResetVpnConnectionRequest vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * Get vpnConnectionId
   * @return vpnConnectionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetVpnConnectionRequest resetVpnConnectionRequest = (ResetVpnConnectionRequest) o;
    return Objects.equals(this.clientToken, resetVpnConnectionRequest.clientToken) &&
        Objects.equals(this.vpnConnectionId, resetVpnConnectionRequest.vpnConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, vpnConnectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetVpnConnectionRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
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
