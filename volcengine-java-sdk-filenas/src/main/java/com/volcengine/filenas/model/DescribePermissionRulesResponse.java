/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.PermissionRuleForDescribePermissionRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribePermissionRulesResponse
 */


public class DescribePermissionRulesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PermissionRules")
  private List<PermissionRuleForDescribePermissionRulesOutput> permissionRules = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribePermissionRulesResponse permissionRules(List<PermissionRuleForDescribePermissionRulesOutput> permissionRules) {
    this.permissionRules = permissionRules;
    return this;
  }

  public DescribePermissionRulesResponse addPermissionRulesItem(PermissionRuleForDescribePermissionRulesOutput permissionRulesItem) {
    if (this.permissionRules == null) {
      this.permissionRules = new ArrayList<PermissionRuleForDescribePermissionRulesOutput>();
    }
    this.permissionRules.add(permissionRulesItem);
    return this;
  }

   /**
   * Get permissionRules
   * @return permissionRules
  **/
  @Valid
  @Schema(description = "")
  public List<PermissionRuleForDescribePermissionRulesOutput> getPermissionRules() {
    return permissionRules;
  }

  public void setPermissionRules(List<PermissionRuleForDescribePermissionRulesOutput> permissionRules) {
    this.permissionRules = permissionRules;
  }

  public DescribePermissionRulesResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribePermissionRulesResponse describePermissionRulesResponse = (DescribePermissionRulesResponse) o;
    return Objects.equals(this.permissionRules, describePermissionRulesResponse.permissionRules) &&
        Objects.equals(this.totalCount, describePermissionRulesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionRules, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePermissionRulesResponse {\n");
    
    sb.append("    permissionRules: ").append(toIndentedString(permissionRules)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
