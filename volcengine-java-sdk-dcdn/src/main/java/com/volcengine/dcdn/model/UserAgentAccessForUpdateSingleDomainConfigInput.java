/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserAgentAccessForUpdateSingleDomainConfigInput
 */


public class UserAgentAccessForUpdateSingleDomainConfigInput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("FilterList")
  private List<String> filterList = null;

  @SerializedName("FilterType")
  private String filterType = null;

  public UserAgentAccessForUpdateSingleDomainConfigInput enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public UserAgentAccessForUpdateSingleDomainConfigInput filterList(List<String> filterList) {
    this.filterList = filterList;
    return this;
  }

  public UserAgentAccessForUpdateSingleDomainConfigInput addFilterListItem(String filterListItem) {
    if (this.filterList == null) {
      this.filterList = new ArrayList<String>();
    }
    this.filterList.add(filterListItem);
    return this;
  }

   /**
   * Get filterList
   * @return filterList
  **/
  @Schema(description = "")
  public List<String> getFilterList() {
    return filterList;
  }

  public void setFilterList(List<String> filterList) {
    this.filterList = filterList;
  }

  public UserAgentAccessForUpdateSingleDomainConfigInput filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Get filterType
   * @return filterType
  **/
  @Schema(description = "")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgentAccessForUpdateSingleDomainConfigInput userAgentAccessForUpdateSingleDomainConfigInput = (UserAgentAccessForUpdateSingleDomainConfigInput) o;
    return Objects.equals(this.enable, userAgentAccessForUpdateSingleDomainConfigInput.enable) &&
        Objects.equals(this.filterList, userAgentAccessForUpdateSingleDomainConfigInput.filterList) &&
        Objects.equals(this.filterType, userAgentAccessForUpdateSingleDomainConfigInput.filterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, filterList, filterType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentAccessForUpdateSingleDomainConfigInput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    filterList: ").append(toIndentedString(filterList)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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
