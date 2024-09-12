/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * RoleForGetRoleOutput
 */



public class RoleForGetRoleOutput {
  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("IsServiceLinkedRole")
  private Integer isServiceLinkedRole = null;

  @SerializedName("MaxSessionDuration")
  private Integer maxSessionDuration = null;

  @SerializedName("RoleId")
  private Integer roleId = null;

  @SerializedName("RoleName")
  private String roleName = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("TrustPolicyDocument")
  private String trustPolicyDocument = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public RoleForGetRoleOutput createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public RoleForGetRoleOutput description(String description) {
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

  public RoleForGetRoleOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RoleForGetRoleOutput isServiceLinkedRole(Integer isServiceLinkedRole) {
    this.isServiceLinkedRole = isServiceLinkedRole;
    return this;
  }

   /**
   * Get isServiceLinkedRole
   * @return isServiceLinkedRole
  **/
  @Schema(description = "")
  public Integer getIsServiceLinkedRole() {
    return isServiceLinkedRole;
  }

  public void setIsServiceLinkedRole(Integer isServiceLinkedRole) {
    this.isServiceLinkedRole = isServiceLinkedRole;
  }

  public RoleForGetRoleOutput maxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
    return this;
  }

   /**
   * Get maxSessionDuration
   * @return maxSessionDuration
  **/
  @Schema(description = "")
  public Integer getMaxSessionDuration() {
    return maxSessionDuration;
  }

  public void setMaxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
  }

  public RoleForGetRoleOutput roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @Schema(description = "")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public RoleForGetRoleOutput roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @Schema(description = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleForGetRoleOutput trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @Schema(description = "")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public RoleForGetRoleOutput trustPolicyDocument(String trustPolicyDocument) {
    this.trustPolicyDocument = trustPolicyDocument;
    return this;
  }

   /**
   * Get trustPolicyDocument
   * @return trustPolicyDocument
  **/
  @Schema(description = "")
  public String getTrustPolicyDocument() {
    return trustPolicyDocument;
  }

  public void setTrustPolicyDocument(String trustPolicyDocument) {
    this.trustPolicyDocument = trustPolicyDocument;
  }

  public RoleForGetRoleOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleForGetRoleOutput roleForGetRoleOutput = (RoleForGetRoleOutput) o;
    return Objects.equals(this.createDate, roleForGetRoleOutput.createDate) &&
        Objects.equals(this.description, roleForGetRoleOutput.description) &&
        Objects.equals(this.displayName, roleForGetRoleOutput.displayName) &&
        Objects.equals(this.isServiceLinkedRole, roleForGetRoleOutput.isServiceLinkedRole) &&
        Objects.equals(this.maxSessionDuration, roleForGetRoleOutput.maxSessionDuration) &&
        Objects.equals(this.roleId, roleForGetRoleOutput.roleId) &&
        Objects.equals(this.roleName, roleForGetRoleOutput.roleName) &&
        Objects.equals(this.trn, roleForGetRoleOutput.trn) &&
        Objects.equals(this.trustPolicyDocument, roleForGetRoleOutput.trustPolicyDocument) &&
        Objects.equals(this.updateDate, roleForGetRoleOutput.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, description, displayName, isServiceLinkedRole, maxSessionDuration, roleId, roleName, trn, trustPolicyDocument, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleForGetRoleOutput {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isServiceLinkedRole: ").append(toIndentedString(isServiceLinkedRole)).append("\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    trustPolicyDocument: ").append(toIndentedString(trustPolicyDocument)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
