/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * ModifyDBInstanceShardNumberRequest
 */


public class ModifyDBInstanceShardNumberRequest {
  @SerializedName("ApplyImmediately")
  private Boolean applyImmediately = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("CreateBackup")
  private Boolean createBackup = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  public ModifyDBInstanceShardNumberRequest applyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
    return this;
  }

   /**
   * Get applyImmediately
   * @return applyImmediately
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Boolean isApplyImmediately() {
    return applyImmediately;
  }

  public void setApplyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
  }

  public ModifyDBInstanceShardNumberRequest clientToken(String clientToken) {
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

  public ModifyDBInstanceShardNumberRequest createBackup(Boolean createBackup) {
    this.createBackup = createBackup;
    return this;
  }

   /**
   * Get createBackup
   * @return createBackup
  **/
  @Schema(description = "")
  public Boolean isCreateBackup() {
    return createBackup;
  }

  public void setCreateBackup(Boolean createBackup) {
    this.createBackup = createBackup;
  }

  public ModifyDBInstanceShardNumberRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBInstanceShardNumberRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceShardNumberRequest modifyDBInstanceShardNumberRequest = (ModifyDBInstanceShardNumberRequest) o;
    return Objects.equals(this.applyImmediately, modifyDBInstanceShardNumberRequest.applyImmediately) &&
        Objects.equals(this.clientToken, modifyDBInstanceShardNumberRequest.clientToken) &&
        Objects.equals(this.createBackup, modifyDBInstanceShardNumberRequest.createBackup) &&
        Objects.equals(this.instanceId, modifyDBInstanceShardNumberRequest.instanceId) &&
        Objects.equals(this.shardNumber, modifyDBInstanceShardNumberRequest.shardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyImmediately, clientToken, createBackup, instanceId, shardNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceShardNumberRequest {\n");
    
    sb.append("    applyImmediately: ").append(toIndentedString(applyImmediately)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    createBackup: ").append(toIndentedString(createBackup)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
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
