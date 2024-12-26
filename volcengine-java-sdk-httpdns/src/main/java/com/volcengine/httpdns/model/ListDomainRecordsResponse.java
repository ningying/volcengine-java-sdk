/*
 * httpdns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.httpdns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.httpdns.model.AAAAListForListDomainRecordsOutput;
import com.volcengine.httpdns.model.AListForListDomainRecordsOutput;
import com.volcengine.httpdns.model.CnameListForListDomainRecordsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainRecordsResponse
 */



public class ListDomainRecordsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AAAAList")
  private List<AAAAListForListDomainRecordsOutput> aaAAList = null;

  @SerializedName("AList")
  private List<AListForListDomainRecordsOutput> alist = null;

  @SerializedName("CnameList")
  private List<CnameListForListDomainRecordsOutput> cnameList = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DomainId")
  private Integer domainId = null;

  @SerializedName("DomainName")
  private String domainName = null;

  public ListDomainRecordsResponse aaAAList(List<AAAAListForListDomainRecordsOutput> aaAAList) {
    this.aaAAList = aaAAList;
    return this;
  }

  public ListDomainRecordsResponse addAaAAListItem(AAAAListForListDomainRecordsOutput aaAAListItem) {
    if (this.aaAAList == null) {
      this.aaAAList = new ArrayList<AAAAListForListDomainRecordsOutput>();
    }
    this.aaAAList.add(aaAAListItem);
    return this;
  }

   /**
   * Get aaAAList
   * @return aaAAList
  **/
  @Valid
  @Schema(description = "")
  public List<AAAAListForListDomainRecordsOutput> getAaAAList() {
    return aaAAList;
  }

  public void setAaAAList(List<AAAAListForListDomainRecordsOutput> aaAAList) {
    this.aaAAList = aaAAList;
  }

  public ListDomainRecordsResponse alist(List<AListForListDomainRecordsOutput> alist) {
    this.alist = alist;
    return this;
  }

  public ListDomainRecordsResponse addAlistItem(AListForListDomainRecordsOutput alistItem) {
    if (this.alist == null) {
      this.alist = new ArrayList<AListForListDomainRecordsOutput>();
    }
    this.alist.add(alistItem);
    return this;
  }

   /**
   * Get alist
   * @return alist
  **/
  @Valid
  @Schema(description = "")
  public List<AListForListDomainRecordsOutput> getAlist() {
    return alist;
  }

  public void setAlist(List<AListForListDomainRecordsOutput> alist) {
    this.alist = alist;
  }

  public ListDomainRecordsResponse cnameList(List<CnameListForListDomainRecordsOutput> cnameList) {
    this.cnameList = cnameList;
    return this;
  }

  public ListDomainRecordsResponse addCnameListItem(CnameListForListDomainRecordsOutput cnameListItem) {
    if (this.cnameList == null) {
      this.cnameList = new ArrayList<CnameListForListDomainRecordsOutput>();
    }
    this.cnameList.add(cnameListItem);
    return this;
  }

   /**
   * Get cnameList
   * @return cnameList
  **/
  @Valid
  @Schema(description = "")
  public List<CnameListForListDomainRecordsOutput> getCnameList() {
    return cnameList;
  }

  public void setCnameList(List<CnameListForListDomainRecordsOutput> cnameList) {
    this.cnameList = cnameList;
  }

  public ListDomainRecordsResponse createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ListDomainRecordsResponse domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @Schema(description = "")
  public Integer getDomainId() {
    return domainId;
  }

  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public ListDomainRecordsResponse domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainRecordsResponse listDomainRecordsResponse = (ListDomainRecordsResponse) o;
    return Objects.equals(this.aaAAList, listDomainRecordsResponse.aaAAList) &&
        Objects.equals(this.alist, listDomainRecordsResponse.alist) &&
        Objects.equals(this.cnameList, listDomainRecordsResponse.cnameList) &&
        Objects.equals(this.createTime, listDomainRecordsResponse.createTime) &&
        Objects.equals(this.domainId, listDomainRecordsResponse.domainId) &&
        Objects.equals(this.domainName, listDomainRecordsResponse.domainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aaAAList, alist, cnameList, createTime, domainId, domainName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainRecordsResponse {\n");
    
    sb.append("    aaAAList: ").append(toIndentedString(aaAAList)).append("\n");
    sb.append("    alist: ").append(toIndentedString(alist)).append("\n");
    sb.append("    cnameList: ").append(toIndentedString(cnameList)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
