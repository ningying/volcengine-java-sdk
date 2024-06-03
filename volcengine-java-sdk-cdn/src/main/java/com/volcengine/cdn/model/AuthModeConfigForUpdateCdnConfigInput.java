/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * AuthModeConfigForUpdateCdnConfigInput
 */



public class AuthModeConfigForUpdateCdnConfigInput {
  @SerializedName("BackupRemoteAddr")
  private String backupRemoteAddr = null;

  @SerializedName("MasterRemoteAddr")
  private String masterRemoteAddr = null;

  @SerializedName("PathType")
  private String pathType = null;

  @SerializedName("PathValue")
  private String pathValue = null;

  @SerializedName("RequestMethod")
  private String requestMethod = null;

  public AuthModeConfigForUpdateCdnConfigInput backupRemoteAddr(String backupRemoteAddr) {
    this.backupRemoteAddr = backupRemoteAddr;
    return this;
  }

   /**
   * Get backupRemoteAddr
   * @return backupRemoteAddr
  **/
  @Schema(description = "")
  public String getBackupRemoteAddr() {
    return backupRemoteAddr;
  }

  public void setBackupRemoteAddr(String backupRemoteAddr) {
    this.backupRemoteAddr = backupRemoteAddr;
  }

  public AuthModeConfigForUpdateCdnConfigInput masterRemoteAddr(String masterRemoteAddr) {
    this.masterRemoteAddr = masterRemoteAddr;
    return this;
  }

   /**
   * Get masterRemoteAddr
   * @return masterRemoteAddr
  **/
  @Schema(description = "")
  public String getMasterRemoteAddr() {
    return masterRemoteAddr;
  }

  public void setMasterRemoteAddr(String masterRemoteAddr) {
    this.masterRemoteAddr = masterRemoteAddr;
  }

  public AuthModeConfigForUpdateCdnConfigInput pathType(String pathType) {
    this.pathType = pathType;
    return this;
  }

   /**
   * Get pathType
   * @return pathType
  **/
  @Schema(description = "")
  public String getPathType() {
    return pathType;
  }

  public void setPathType(String pathType) {
    this.pathType = pathType;
  }

  public AuthModeConfigForUpdateCdnConfigInput pathValue(String pathValue) {
    this.pathValue = pathValue;
    return this;
  }

   /**
   * Get pathValue
   * @return pathValue
  **/
  @Schema(description = "")
  public String getPathValue() {
    return pathValue;
  }

  public void setPathValue(String pathValue) {
    this.pathValue = pathValue;
  }

  public AuthModeConfigForUpdateCdnConfigInput requestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

   /**
   * Get requestMethod
   * @return requestMethod
  **/
  @Schema(description = "")
  public String getRequestMethod() {
    return requestMethod;
  }

  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthModeConfigForUpdateCdnConfigInput authModeConfigForUpdateCdnConfigInput = (AuthModeConfigForUpdateCdnConfigInput) o;
    return Objects.equals(this.backupRemoteAddr, authModeConfigForUpdateCdnConfigInput.backupRemoteAddr) &&
        Objects.equals(this.masterRemoteAddr, authModeConfigForUpdateCdnConfigInput.masterRemoteAddr) &&
        Objects.equals(this.pathType, authModeConfigForUpdateCdnConfigInput.pathType) &&
        Objects.equals(this.pathValue, authModeConfigForUpdateCdnConfigInput.pathValue) &&
        Objects.equals(this.requestMethod, authModeConfigForUpdateCdnConfigInput.requestMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRemoteAddr, masterRemoteAddr, pathType, pathValue, requestMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthModeConfigForUpdateCdnConfigInput {\n");
    
    sb.append("    backupRemoteAddr: ").append(toIndentedString(backupRemoteAddr)).append("\n");
    sb.append("    masterRemoteAddr: ").append(toIndentedString(masterRemoteAddr)).append("\n");
    sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
    sb.append("    pathValue: ").append(toIndentedString(pathValue)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
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