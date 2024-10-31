/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * VulForCreateDomainOutput
 */



public class VulForCreateDomainOutput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("RuleMode")
  private String ruleMode = null;

  @SerializedName("WafEnable")
  private Integer wafEnable = null;

  public VulForCreateDomainOutput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public VulForCreateDomainOutput ruleMode(String ruleMode) {
    this.ruleMode = ruleMode;
    return this;
  }

   /**
   * Get ruleMode
   * @return ruleMode
  **/
  @Schema(description = "")
  public String getRuleMode() {
    return ruleMode;
  }

  public void setRuleMode(String ruleMode) {
    this.ruleMode = ruleMode;
  }

  public VulForCreateDomainOutput wafEnable(Integer wafEnable) {
    this.wafEnable = wafEnable;
    return this;
  }

   /**
   * Get wafEnable
   * @return wafEnable
  **/
  @Schema(description = "")
  public Integer getWafEnable() {
    return wafEnable;
  }

  public void setWafEnable(Integer wafEnable) {
    this.wafEnable = wafEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VulForCreateDomainOutput vulForCreateDomainOutput = (VulForCreateDomainOutput) o;
    return Objects.equals(this.action, vulForCreateDomainOutput.action) &&
        Objects.equals(this.ruleMode, vulForCreateDomainOutput.ruleMode) &&
        Objects.equals(this.wafEnable, vulForCreateDomainOutput.wafEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, ruleMode, wafEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VulForCreateDomainOutput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    ruleMode: ").append(toIndentedString(ruleMode)).append("\n");
    sb.append("    wafEnable: ").append(toIndentedString(wafEnable)).append("\n");
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