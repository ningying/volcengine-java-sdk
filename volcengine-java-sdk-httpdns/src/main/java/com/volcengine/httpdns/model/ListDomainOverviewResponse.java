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
import com.volcengine.httpdns.model.DomainListForListDomainOverviewOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainOverviewResponse
 */



public class ListDomainOverviewResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DomainList")
  private List<DomainListForListDomainOverviewOutput> domainList = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListDomainOverviewResponse domainList(List<DomainListForListDomainOverviewOutput> domainList) {
    this.domainList = domainList;
    return this;
  }

  public ListDomainOverviewResponse addDomainListItem(DomainListForListDomainOverviewOutput domainListItem) {
    if (this.domainList == null) {
      this.domainList = new ArrayList<DomainListForListDomainOverviewOutput>();
    }
    this.domainList.add(domainListItem);
    return this;
  }

   /**
   * Get domainList
   * @return domainList
  **/
  @Valid
  @Schema(description = "")
  public List<DomainListForListDomainOverviewOutput> getDomainList() {
    return domainList;
  }

  public void setDomainList(List<DomainListForListDomainOverviewOutput> domainList) {
    this.domainList = domainList;
  }

  public ListDomainOverviewResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainOverviewResponse listDomainOverviewResponse = (ListDomainOverviewResponse) o;
    return Objects.equals(this.domainList, listDomainOverviewResponse.domainList) &&
        Objects.equals(this.total, listDomainOverviewResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainList, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainOverviewResponse {\n");
    
    sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
