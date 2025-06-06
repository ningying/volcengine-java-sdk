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
 * AccountForDescribeAccountOutput
 */



public class AccountForDescribeAccountOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AllowConsole")
  private Integer allowConsole = null;

  @SerializedName("AllowExit")
  private Integer allowExit = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("DeleteUk")
  private String deleteUk = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("IamRole")
  private String iamRole = null;

  @SerializedName("JoinType")
  private Integer joinType = null;

  @SerializedName("MainName")
  private String mainName = null;

  @SerializedName("OrgID")
  private String orgID = null;

  @SerializedName("OrgType")
  private Integer orgType = null;

  @SerializedName("OrgUnitID")
  private String orgUnitID = null;

  @SerializedName("OrgVerificationID")
  private String orgVerificationID = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("ShowName")
  private String showName = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public AccountForDescribeAccountOutput accountID(String accountID) {
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

  public AccountForDescribeAccountOutput accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountForDescribeAccountOutput allowConsole(Integer allowConsole) {
    this.allowConsole = allowConsole;
    return this;
  }

   /**
   * Get allowConsole
   * @return allowConsole
  **/
  @Schema(description = "")
  public Integer getAllowConsole() {
    return allowConsole;
  }

  public void setAllowConsole(Integer allowConsole) {
    this.allowConsole = allowConsole;
  }

  public AccountForDescribeAccountOutput allowExit(Integer allowExit) {
    this.allowExit = allowExit;
    return this;
  }

   /**
   * Get allowExit
   * @return allowExit
  **/
  @Schema(description = "")
  public Integer getAllowExit() {
    return allowExit;
  }

  public void setAllowExit(Integer allowExit) {
    this.allowExit = allowExit;
  }

  public AccountForDescribeAccountOutput createdTime(String createdTime) {
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

  public AccountForDescribeAccountOutput deleteUk(String deleteUk) {
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

  public AccountForDescribeAccountOutput deletedTime(String deletedTime) {
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

  public AccountForDescribeAccountOutput description(String description) {
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

  public AccountForDescribeAccountOutput ID(String ID) {
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

  public AccountForDescribeAccountOutput iamRole(String iamRole) {
    this.iamRole = iamRole;
    return this;
  }

   /**
   * Get iamRole
   * @return iamRole
  **/
  @Schema(description = "")
  public String getIamRole() {
    return iamRole;
  }

  public void setIamRole(String iamRole) {
    this.iamRole = iamRole;
  }

  public AccountForDescribeAccountOutput joinType(Integer joinType) {
    this.joinType = joinType;
    return this;
  }

   /**
   * Get joinType
   * @return joinType
  **/
  @Schema(description = "")
  public Integer getJoinType() {
    return joinType;
  }

  public void setJoinType(Integer joinType) {
    this.joinType = joinType;
  }

  public AccountForDescribeAccountOutput mainName(String mainName) {
    this.mainName = mainName;
    return this;
  }

   /**
   * Get mainName
   * @return mainName
  **/
  @Schema(description = "")
  public String getMainName() {
    return mainName;
  }

  public void setMainName(String mainName) {
    this.mainName = mainName;
  }

  public AccountForDescribeAccountOutput orgID(String orgID) {
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

  public AccountForDescribeAccountOutput orgType(Integer orgType) {
    this.orgType = orgType;
    return this;
  }

   /**
   * Get orgType
   * @return orgType
  **/
  @Schema(description = "")
  public Integer getOrgType() {
    return orgType;
  }

  public void setOrgType(Integer orgType) {
    this.orgType = orgType;
  }

  public AccountForDescribeAccountOutput orgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
    return this;
  }

   /**
   * Get orgUnitID
   * @return orgUnitID
  **/
  @Schema(description = "")
  public String getOrgUnitID() {
    return orgUnitID;
  }

  public void setOrgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
  }

  public AccountForDescribeAccountOutput orgVerificationID(String orgVerificationID) {
    this.orgVerificationID = orgVerificationID;
    return this;
  }

   /**
   * Get orgVerificationID
   * @return orgVerificationID
  **/
  @Schema(description = "")
  public String getOrgVerificationID() {
    return orgVerificationID;
  }

  public void setOrgVerificationID(String orgVerificationID) {
    this.orgVerificationID = orgVerificationID;
  }

  public AccountForDescribeAccountOutput owner(String owner) {
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

  public AccountForDescribeAccountOutput showName(String showName) {
    this.showName = showName;
    return this;
  }

   /**
   * Get showName
   * @return showName
  **/
  @Schema(description = "")
  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }

  public AccountForDescribeAccountOutput updatedTime(String updatedTime) {
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
    AccountForDescribeAccountOutput accountForDescribeAccountOutput = (AccountForDescribeAccountOutput) o;
    return Objects.equals(this.accountID, accountForDescribeAccountOutput.accountID) &&
        Objects.equals(this.accountName, accountForDescribeAccountOutput.accountName) &&
        Objects.equals(this.allowConsole, accountForDescribeAccountOutput.allowConsole) &&
        Objects.equals(this.allowExit, accountForDescribeAccountOutput.allowExit) &&
        Objects.equals(this.createdTime, accountForDescribeAccountOutput.createdTime) &&
        Objects.equals(this.deleteUk, accountForDescribeAccountOutput.deleteUk) &&
        Objects.equals(this.deletedTime, accountForDescribeAccountOutput.deletedTime) &&
        Objects.equals(this.description, accountForDescribeAccountOutput.description) &&
        Objects.equals(this.ID, accountForDescribeAccountOutput.ID) &&
        Objects.equals(this.iamRole, accountForDescribeAccountOutput.iamRole) &&
        Objects.equals(this.joinType, accountForDescribeAccountOutput.joinType) &&
        Objects.equals(this.mainName, accountForDescribeAccountOutput.mainName) &&
        Objects.equals(this.orgID, accountForDescribeAccountOutput.orgID) &&
        Objects.equals(this.orgType, accountForDescribeAccountOutput.orgType) &&
        Objects.equals(this.orgUnitID, accountForDescribeAccountOutput.orgUnitID) &&
        Objects.equals(this.orgVerificationID, accountForDescribeAccountOutput.orgVerificationID) &&
        Objects.equals(this.owner, accountForDescribeAccountOutput.owner) &&
        Objects.equals(this.showName, accountForDescribeAccountOutput.showName) &&
        Objects.equals(this.updatedTime, accountForDescribeAccountOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, accountName, allowConsole, allowExit, createdTime, deleteUk, deletedTime, description, ID, iamRole, joinType, mainName, orgID, orgType, orgUnitID, orgVerificationID, owner, showName, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountForDescribeAccountOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    allowConsole: ").append(toIndentedString(allowConsole)).append("\n");
    sb.append("    allowExit: ").append(toIndentedString(allowExit)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deleteUk: ").append(toIndentedString(deleteUk)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    iamRole: ").append(toIndentedString(iamRole)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    mainName: ").append(toIndentedString(mainName)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
    sb.append("    orgUnitID: ").append(toIndentedString(orgUnitID)).append("\n");
    sb.append("    orgVerificationID: ").append(toIndentedString(orgVerificationID)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
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
