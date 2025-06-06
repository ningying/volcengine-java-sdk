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
import com.volcengine.organization.model.SubUnitListForListOrganizationalUnitsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListOrganizationalUnitsResponse
 */



public class ListOrganizationalUnitsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SubUnitList")
  private List<SubUnitListForListOrganizationalUnitsOutput> subUnitList = null;

  public ListOrganizationalUnitsResponse subUnitList(List<SubUnitListForListOrganizationalUnitsOutput> subUnitList) {
    this.subUnitList = subUnitList;
    return this;
  }

  public ListOrganizationalUnitsResponse addSubUnitListItem(SubUnitListForListOrganizationalUnitsOutput subUnitListItem) {
    if (this.subUnitList == null) {
      this.subUnitList = new ArrayList<SubUnitListForListOrganizationalUnitsOutput>();
    }
    this.subUnitList.add(subUnitListItem);
    return this;
  }

   /**
   * Get subUnitList
   * @return subUnitList
  **/
  @Valid
  @Schema(description = "")
  public List<SubUnitListForListOrganizationalUnitsOutput> getSubUnitList() {
    return subUnitList;
  }

  public void setSubUnitList(List<SubUnitListForListOrganizationalUnitsOutput> subUnitList) {
    this.subUnitList = subUnitList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOrganizationalUnitsResponse listOrganizationalUnitsResponse = (ListOrganizationalUnitsResponse) o;
    return Objects.equals(this.subUnitList, listOrganizationalUnitsResponse.subUnitList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subUnitList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOrganizationalUnitsResponse {\n");
    
    sb.append("    subUnitList: ").append(toIndentedString(subUnitList)).append("\n");
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
