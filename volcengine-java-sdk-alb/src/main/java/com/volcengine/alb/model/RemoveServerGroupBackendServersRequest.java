/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RemoveServerGroupBackendServersRequest
 */



public class RemoveServerGroupBackendServersRequest {
  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerIds")
  private List<String> serverIds = null;

  public RemoveServerGroupBackendServersRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public RemoveServerGroupBackendServersRequest serverIds(List<String> serverIds) {
    this.serverIds = serverIds;
    return this;
  }

  public RemoveServerGroupBackendServersRequest addServerIdsItem(String serverIdsItem) {
    if (this.serverIds == null) {
      this.serverIds = new ArrayList<String>();
    }
    this.serverIds.add(serverIdsItem);
    return this;
  }

   /**
   * Get serverIds
   * @return serverIds
  **/
  @Schema(description = "")
  public List<String> getServerIds() {
    return serverIds;
  }

  public void setServerIds(List<String> serverIds) {
    this.serverIds = serverIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveServerGroupBackendServersRequest removeServerGroupBackendServersRequest = (RemoveServerGroupBackendServersRequest) o;
    return Objects.equals(this.serverGroupId, removeServerGroupBackendServersRequest.serverGroupId) &&
        Objects.equals(this.serverIds, removeServerGroupBackendServersRequest.serverIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverGroupId, serverIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveServerGroupBackendServersRequest {\n");
    
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
