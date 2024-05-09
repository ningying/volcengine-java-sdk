/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * InviteAccountRequest
 */


public class InviteAccountRequest {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AllowExit")
  private Integer allowExit = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("OrgUnitId")
  private String orgUnitId = null;

  @SerializedName("ShowName")
  private String showName = null;

  public InviteAccountRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public InviteAccountRequest allowExit(Integer allowExit) {
    this.allowExit = allowExit;
    return this;
  }

   /**
   * Get allowExit
   * @return allowExit
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getAllowExit() {
    return allowExit;
  }

  public void setAllowExit(Integer allowExit) {
    this.allowExit = allowExit;
  }

  public InviteAccountRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InviteAccountRequest orgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

   /**
   * Get orgUnitId
   * @return orgUnitId
  **/
  @Schema(description = "")
  public String getOrgUnitId() {
    return orgUnitId;
  }

  public void setOrgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
  }

  public InviteAccountRequest showName(String showName) {
    this.showName = showName;
    return this;
  }

   /**
   * Get showName
   * @return showName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteAccountRequest inviteAccountRequest = (InviteAccountRequest) o;
    return Objects.equals(this.accountId, inviteAccountRequest.accountId) &&
        Objects.equals(this.allowExit, inviteAccountRequest.allowExit) &&
        Objects.equals(this.description, inviteAccountRequest.description) &&
        Objects.equals(this.orgUnitId, inviteAccountRequest.orgUnitId) &&
        Objects.equals(this.showName, inviteAccountRequest.showName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allowExit, description, orgUnitId, showName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAccountRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allowExit: ").append(toIndentedString(allowExit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
    sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
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