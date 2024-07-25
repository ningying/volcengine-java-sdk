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
import com.volcengine.rdsmysqlv2.model.AssociatedInstanceForDescribeAllowListDetailOutput;
import com.volcengine.rdsmysqlv2.model.SecurityGroupBindInfoForDescribeAllowListDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAllowListDetailResponse
 */



public class DescribeAllowListDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AllowList")
  private String allowList = null;

  @SerializedName("AllowListCategory")
  private String allowListCategory = null;

  @SerializedName("AllowListDesc")
  private String allowListDesc = null;

  @SerializedName("AllowListId")
  private String allowListId = null;

  @SerializedName("AllowListName")
  private String allowListName = null;

  @SerializedName("AllowListType")
  private String allowListType = null;

  @SerializedName("AssociatedInstances")
  private List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances = null;

  @SerializedName("SecurityGroupBindInfos")
  private List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos = null;

  @SerializedName("UserAllowList")
  private String userAllowList = null;

  public DescribeAllowListDetailResponse allowList(String allowList) {
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

  public DescribeAllowListDetailResponse allowListCategory(String allowListCategory) {
    this.allowListCategory = allowListCategory;
    return this;
  }

   /**
   * Get allowListCategory
   * @return allowListCategory
  **/
  @Schema(description = "")
  public String getAllowListCategory() {
    return allowListCategory;
  }

  public void setAllowListCategory(String allowListCategory) {
    this.allowListCategory = allowListCategory;
  }

  public DescribeAllowListDetailResponse allowListDesc(String allowListDesc) {
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

  public DescribeAllowListDetailResponse allowListId(String allowListId) {
    this.allowListId = allowListId;
    return this;
  }

   /**
   * Get allowListId
   * @return allowListId
  **/
  @Schema(description = "")
  public String getAllowListId() {
    return allowListId;
  }

  public void setAllowListId(String allowListId) {
    this.allowListId = allowListId;
  }

  public DescribeAllowListDetailResponse allowListName(String allowListName) {
    this.allowListName = allowListName;
    return this;
  }

   /**
   * Get allowListName
   * @return allowListName
  **/
  @Schema(description = "")
  public String getAllowListName() {
    return allowListName;
  }

  public void setAllowListName(String allowListName) {
    this.allowListName = allowListName;
  }

  public DescribeAllowListDetailResponse allowListType(String allowListType) {
    this.allowListType = allowListType;
    return this;
  }

   /**
   * Get allowListType
   * @return allowListType
  **/
  @Schema(description = "")
  public String getAllowListType() {
    return allowListType;
  }

  public void setAllowListType(String allowListType) {
    this.allowListType = allowListType;
  }

  public DescribeAllowListDetailResponse associatedInstances(List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances) {
    this.associatedInstances = associatedInstances;
    return this;
  }

  public DescribeAllowListDetailResponse addAssociatedInstancesItem(AssociatedInstanceForDescribeAllowListDetailOutput associatedInstancesItem) {
    if (this.associatedInstances == null) {
      this.associatedInstances = new ArrayList<AssociatedInstanceForDescribeAllowListDetailOutput>();
    }
    this.associatedInstances.add(associatedInstancesItem);
    return this;
  }

   /**
   * Get associatedInstances
   * @return associatedInstances
  **/
  @Valid
  @Schema(description = "")
  public List<AssociatedInstanceForDescribeAllowListDetailOutput> getAssociatedInstances() {
    return associatedInstances;
  }

  public void setAssociatedInstances(List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances) {
    this.associatedInstances = associatedInstances;
  }

  public DescribeAllowListDetailResponse securityGroupBindInfos(List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos) {
    this.securityGroupBindInfos = securityGroupBindInfos;
    return this;
  }

  public DescribeAllowListDetailResponse addSecurityGroupBindInfosItem(SecurityGroupBindInfoForDescribeAllowListDetailOutput securityGroupBindInfosItem) {
    if (this.securityGroupBindInfos == null) {
      this.securityGroupBindInfos = new ArrayList<SecurityGroupBindInfoForDescribeAllowListDetailOutput>();
    }
    this.securityGroupBindInfos.add(securityGroupBindInfosItem);
    return this;
  }

   /**
   * Get securityGroupBindInfos
   * @return securityGroupBindInfos
  **/
  @Valid
  @Schema(description = "")
  public List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> getSecurityGroupBindInfos() {
    return securityGroupBindInfos;
  }

  public void setSecurityGroupBindInfos(List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos) {
    this.securityGroupBindInfos = securityGroupBindInfos;
  }

  public DescribeAllowListDetailResponse userAllowList(String userAllowList) {
    this.userAllowList = userAllowList;
    return this;
  }

   /**
   * Get userAllowList
   * @return userAllowList
  **/
  @Schema(description = "")
  public String getUserAllowList() {
    return userAllowList;
  }

  public void setUserAllowList(String userAllowList) {
    this.userAllowList = userAllowList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAllowListDetailResponse describeAllowListDetailResponse = (DescribeAllowListDetailResponse) o;
    return Objects.equals(this.allowList, describeAllowListDetailResponse.allowList) &&
        Objects.equals(this.allowListCategory, describeAllowListDetailResponse.allowListCategory) &&
        Objects.equals(this.allowListDesc, describeAllowListDetailResponse.allowListDesc) &&
        Objects.equals(this.allowListId, describeAllowListDetailResponse.allowListId) &&
        Objects.equals(this.allowListName, describeAllowListDetailResponse.allowListName) &&
        Objects.equals(this.allowListType, describeAllowListDetailResponse.allowListType) &&
        Objects.equals(this.associatedInstances, describeAllowListDetailResponse.associatedInstances) &&
        Objects.equals(this.securityGroupBindInfos, describeAllowListDetailResponse.securityGroupBindInfos) &&
        Objects.equals(this.userAllowList, describeAllowListDetailResponse.userAllowList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowList, allowListCategory, allowListDesc, allowListId, allowListName, allowListType, associatedInstances, securityGroupBindInfos, userAllowList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAllowListDetailResponse {\n");
    
    sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
    sb.append("    allowListCategory: ").append(toIndentedString(allowListCategory)).append("\n");
    sb.append("    allowListDesc: ").append(toIndentedString(allowListDesc)).append("\n");
    sb.append("    allowListId: ").append(toIndentedString(allowListId)).append("\n");
    sb.append("    allowListName: ").append(toIndentedString(allowListName)).append("\n");
    sb.append("    allowListType: ").append(toIndentedString(allowListType)).append("\n");
    sb.append("    associatedInstances: ").append(toIndentedString(associatedInstances)).append("\n");
    sb.append("    securityGroupBindInfos: ").append(toIndentedString(securityGroupBindInfos)).append("\n");
    sb.append("    userAllowList: ").append(toIndentedString(userAllowList)).append("\n");
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
