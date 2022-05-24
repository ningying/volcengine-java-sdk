/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

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
 * NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput {
  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("NetworkInterfacePermissionId")
  private String networkInterfacePermissionId = null;

  @SerializedName("Permission")
  private String permission = null;

  @SerializedName("PermissionState")
  private String permissionState = null;

  @SerializedName("VolcAccountId")
  private String volcAccountId = null;

  @SerializedName("VolcService")
  private String volcService = null;

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput networkInterfacePermissionId(String networkInterfacePermissionId) {
    this.networkInterfacePermissionId = networkInterfacePermissionId;
    return this;
  }

   /**
   * Get networkInterfacePermissionId
   * @return networkInterfacePermissionId
  **/
  @Schema(description = "")
  public String getNetworkInterfacePermissionId() {
    return networkInterfacePermissionId;
  }

  public void setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
    this.networkInterfacePermissionId = networkInterfacePermissionId;
  }

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput permissionState(String permissionState) {
    this.permissionState = permissionState;
    return this;
  }

   /**
   * Get permissionState
   * @return permissionState
  **/
  @Schema(description = "")
  public String getPermissionState() {
    return permissionState;
  }

  public void setPermissionState(String permissionState) {
    this.permissionState = permissionState;
  }

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput volcAccountId(String volcAccountId) {
    this.volcAccountId = volcAccountId;
    return this;
  }

   /**
   * Get volcAccountId
   * @return volcAccountId
  **/
  @Schema(description = "")
  public String getVolcAccountId() {
    return volcAccountId;
  }

  public void setVolcAccountId(String volcAccountId) {
    this.volcAccountId = volcAccountId;
  }

  public NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput volcService(String volcService) {
    this.volcService = volcService;
    return this;
  }

   /**
   * Get volcService
   * @return volcService
  **/
  @Schema(description = "")
  public String getVolcService() {
    return volcService;
  }

  public void setVolcService(String volcService) {
    this.volcService = volcService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput networkInterfacePermissionForCreateNetworkInterfacePermissionOutput = (NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput) o;
    return Objects.equals(this.networkInterfaceId, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.networkInterfaceId) &&
        Objects.equals(this.networkInterfacePermissionId, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.networkInterfacePermissionId) &&
        Objects.equals(this.permission, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.permission) &&
        Objects.equals(this.permissionState, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.permissionState) &&
        Objects.equals(this.volcAccountId, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.volcAccountId) &&
        Objects.equals(this.volcService, networkInterfacePermissionForCreateNetworkInterfacePermissionOutput.volcService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkInterfaceId, networkInterfacePermissionId, permission, permissionState, volcAccountId, volcService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterfacePermissionForCreateNetworkInterfacePermissionOutput {\n");
    
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfacePermissionId: ").append(toIndentedString(networkInterfacePermissionId)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    permissionState: ").append(toIndentedString(permissionState)).append("\n");
    sb.append("    volcAccountId: ").append(toIndentedString(volcAccountId)).append("\n");
    sb.append("    volcService: ").append(toIndentedString(volcService)).append("\n");
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
