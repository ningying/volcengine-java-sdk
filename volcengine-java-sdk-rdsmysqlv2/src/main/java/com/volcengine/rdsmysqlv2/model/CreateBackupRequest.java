/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.BackupMetaForCreateBackupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateBackupRequest
 */



public class CreateBackupRequest {
  @SerializedName("BackupMeta")
  private List<BackupMetaForCreateBackupInput> backupMeta = null;

  @SerializedName("BackupMethod")
  private String backupMethod = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public CreateBackupRequest backupMeta(List<BackupMetaForCreateBackupInput> backupMeta) {
    this.backupMeta = backupMeta;
    return this;
  }

  public CreateBackupRequest addBackupMetaItem(BackupMetaForCreateBackupInput backupMetaItem) {
    if (this.backupMeta == null) {
      this.backupMeta = new ArrayList<BackupMetaForCreateBackupInput>();
    }
    this.backupMeta.add(backupMetaItem);
    return this;
  }

   /**
   * Get backupMeta
   * @return backupMeta
  **/
  @Valid
  @Schema(description = "")
  public List<BackupMetaForCreateBackupInput> getBackupMeta() {
    return backupMeta;
  }

  public void setBackupMeta(List<BackupMetaForCreateBackupInput> backupMeta) {
    this.backupMeta = backupMeta;
  }

  public CreateBackupRequest backupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Get backupMethod
   * @return backupMethod
  **/
  @Schema(description = "")
  public String getBackupMethod() {
    return backupMethod;
  }

  public void setBackupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
  }

  public CreateBackupRequest backupType(String backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public String getBackupType() {
    return backupType;
  }

  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }

  public CreateBackupRequest instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBackupRequest createBackupRequest = (CreateBackupRequest) o;
    return Objects.equals(this.backupMeta, createBackupRequest.backupMeta) &&
        Objects.equals(this.backupMethod, createBackupRequest.backupMethod) &&
        Objects.equals(this.backupType, createBackupRequest.backupType) &&
        Objects.equals(this.instanceId, createBackupRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupMeta, backupMethod, backupType, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackupRequest {\n");
    
    sb.append("    backupMeta: ").append(toIndentedString(backupMeta)).append("\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
