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
 * OrgQuitApplicationForDescribeQuitApplicationOutput
 */



public class OrgQuitApplicationForDescribeQuitApplicationOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("ApplyReason")
  private String applyReason = null;

  @SerializedName("AuditReason")
  private String auditReason = null;

  @SerializedName("AuditedTime")
  private String auditedTime = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("DeleteUk")
  private String deleteUk = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("OrgID")
  private String orgID = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public OrgQuitApplicationForDescribeQuitApplicationOutput accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput applyReason(String applyReason) {
    this.applyReason = applyReason;
    return this;
  }

   /**
   * Get applyReason
   * @return applyReason
  **/
  @Schema(description = "")
  public String getApplyReason() {
    return applyReason;
  }

  public void setApplyReason(String applyReason) {
    this.applyReason = applyReason;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput auditReason(String auditReason) {
    this.auditReason = auditReason;
    return this;
  }

   /**
   * Get auditReason
   * @return auditReason
  **/
  @Schema(description = "")
  public String getAuditReason() {
    return auditReason;
  }

  public void setAuditReason(String auditReason) {
    this.auditReason = auditReason;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput auditedTime(String auditedTime) {
    this.auditedTime = auditedTime;
    return this;
  }

   /**
   * Get auditedTime
   * @return auditedTime
  **/
  @Schema(description = "")
  public String getAuditedTime() {
    return auditedTime;
  }

  public void setAuditedTime(String auditedTime) {
    this.auditedTime = auditedTime;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput deleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
    return this;
  }

   /**
   * Get deleteUk
   * @return deleteUk
  **/
  @Schema(description = "")
  public String getDeleteUk() {
    return deleteUk;
  }

  public void setDeleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @Schema(description = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public OrgQuitApplicationForDescribeQuitApplicationOutput updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @Schema(description = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgQuitApplicationForDescribeQuitApplicationOutput orgQuitApplicationForDescribeQuitApplicationOutput = (OrgQuitApplicationForDescribeQuitApplicationOutput) o;
    return Objects.equals(this.accountID, orgQuitApplicationForDescribeQuitApplicationOutput.accountID) &&
        Objects.equals(this.applyReason, orgQuitApplicationForDescribeQuitApplicationOutput.applyReason) &&
        Objects.equals(this.auditReason, orgQuitApplicationForDescribeQuitApplicationOutput.auditReason) &&
        Objects.equals(this.auditedTime, orgQuitApplicationForDescribeQuitApplicationOutput.auditedTime) &&
        Objects.equals(this.createdTime, orgQuitApplicationForDescribeQuitApplicationOutput.createdTime) &&
        Objects.equals(this.deleteUk, orgQuitApplicationForDescribeQuitApplicationOutput.deleteUk) &&
        Objects.equals(this.deletedTime, orgQuitApplicationForDescribeQuitApplicationOutput.deletedTime) &&
        Objects.equals(this.ID, orgQuitApplicationForDescribeQuitApplicationOutput.ID) &&
        Objects.equals(this.orgID, orgQuitApplicationForDescribeQuitApplicationOutput.orgID) &&
        Objects.equals(this.owner, orgQuitApplicationForDescribeQuitApplicationOutput.owner) &&
        Objects.equals(this.status, orgQuitApplicationForDescribeQuitApplicationOutput.status) &&
        Objects.equals(this.updatedTime, orgQuitApplicationForDescribeQuitApplicationOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, applyReason, auditReason, auditedTime, createdTime, deleteUk, deletedTime, ID, orgID, owner, status, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgQuitApplicationForDescribeQuitApplicationOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    applyReason: ").append(toIndentedString(applyReason)).append("\n");
    sb.append("    auditReason: ").append(toIndentedString(auditReason)).append("\n");
    sb.append("    auditedTime: ").append(toIndentedString(auditedTime)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deleteUk: ").append(toIndentedString(deleteUk)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
