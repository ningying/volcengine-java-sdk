/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * AllowIpAccessRuleForDescribeSharedConfigOutput
 */



public class AllowIpAccessRuleForDescribeSharedConfigOutput {
  @SerializedName("Option")
  private String option = null;

  @SerializedName("Rules")
  private List<String> rules = null;

  public AllowIpAccessRuleForDescribeSharedConfigOutput option(String option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @Schema(description = "")
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public AllowIpAccessRuleForDescribeSharedConfigOutput rules(List<String> rules) {
    this.rules = rules;
    return this;
  }

  public AllowIpAccessRuleForDescribeSharedConfigOutput addRulesItem(String rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<String>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<String> getRules() {
    return rules;
  }

  public void setRules(List<String> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowIpAccessRuleForDescribeSharedConfigOutput allowIpAccessRuleForDescribeSharedConfigOutput = (AllowIpAccessRuleForDescribeSharedConfigOutput) o;
    return Objects.equals(this.option, allowIpAccessRuleForDescribeSharedConfigOutput.option) &&
        Objects.equals(this.rules, allowIpAccessRuleForDescribeSharedConfigOutput.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowIpAccessRuleForDescribeSharedConfigOutput {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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