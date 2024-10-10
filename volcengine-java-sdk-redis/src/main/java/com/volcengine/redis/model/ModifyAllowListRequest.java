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
 * ModifyAllowListRequest
 */



public class ModifyAllowListRequest {
  @SerializedName("AllowList")
  private String allowList = null;

  @SerializedName("AllowListDesc")
  private String allowListDesc = null;

  @SerializedName("AllowListId")
  private String allowListId = null;

  @SerializedName("AllowListName")
  private String allowListName = null;

  @SerializedName("ApplyInstanceNum")
  private Integer applyInstanceNum = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ModifyMode")
  private String modifyMode = null;

  public ModifyAllowListRequest allowList(String allowList) {
    this.allowList = allowList;
    return this;
  }

   /**
   * Get allowList
   * @return allowList
  **/
  @Schema(description = "")
  public String getAllowList() {
    return allowList;
  }

  public void setAllowList(String allowList) {
    this.allowList = allowList;
  }

  public ModifyAllowListRequest allowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
    return this;
  }

   /**
   * Get allowListDesc
   * @return allowListDesc
  **/
  @Schema(description = "")
  public String getAllowListDesc() {
    return allowListDesc;
  }

  public void setAllowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
  }

  public ModifyAllowListRequest allowListId(String allowListId) {
    this.allowListId = allowListId;
    return this;
  }

   /**
   * Get allowListId
   * @return allowListId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAllowListId() {
    return allowListId;
  }

  public void setAllowListId(String allowListId) {
    this.allowListId = allowListId;
  }

  public ModifyAllowListRequest allowListName(String allowListName) {
    this.allowListName = allowListName;
    return this;
  }

   /**
   * Get allowListName
   * @return allowListName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAllowListName() {
    return allowListName;
  }

  public void setAllowListName(String allowListName) {
    this.allowListName = allowListName;
  }

  public ModifyAllowListRequest applyInstanceNum(Integer applyInstanceNum) {
    this.applyInstanceNum = applyInstanceNum;
    return this;
  }

   /**
   * Get applyInstanceNum
   * @return applyInstanceNum
  **/
  @Schema(description = "")
  public Integer getApplyInstanceNum() {
    return applyInstanceNum;
  }

  public void setApplyInstanceNum(Integer applyInstanceNum) {
    this.applyInstanceNum = applyInstanceNum;
  }

  public ModifyAllowListRequest clientToken(String clientToken) {
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

  public ModifyAllowListRequest modifyMode(String modifyMode) {
    this.modifyMode = modifyMode;
    return this;
  }

   /**
   * Get modifyMode
   * @return modifyMode
  **/
  @Schema(description = "")
  public String getModifyMode() {
    return modifyMode;
  }

  public void setModifyMode(String modifyMode) {
    this.modifyMode = modifyMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyAllowListRequest modifyAllowListRequest = (ModifyAllowListRequest) o;
    return Objects.equals(this.allowList, modifyAllowListRequest.allowList) &&
        Objects.equals(this.allowListDesc, modifyAllowListRequest.allowListDesc) &&
        Objects.equals(this.allowListId, modifyAllowListRequest.allowListId) &&
        Objects.equals(this.allowListName, modifyAllowListRequest.allowListName) &&
        Objects.equals(this.applyInstanceNum, modifyAllowListRequest.applyInstanceNum) &&
        Objects.equals(this.clientToken, modifyAllowListRequest.clientToken) &&
        Objects.equals(this.modifyMode, modifyAllowListRequest.modifyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowList, allowListDesc, allowListId, allowListName, applyInstanceNum, clientToken, modifyMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAllowListRequest {\n");
    
    sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
    sb.append("    allowListDesc: ").append(toIndentedString(allowListDesc)).append("\n");
    sb.append("    allowListId: ").append(toIndentedString(allowListId)).append("\n");
    sb.append("    allowListName: ").append(toIndentedString(allowListName)).append("\n");
    sb.append("    applyInstanceNum: ").append(toIndentedString(applyInstanceNum)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    modifyMode: ").append(toIndentedString(modifyMode)).append("\n");
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
