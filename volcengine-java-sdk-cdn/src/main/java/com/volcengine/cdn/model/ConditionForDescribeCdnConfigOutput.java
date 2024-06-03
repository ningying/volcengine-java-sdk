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
import com.volcengine.cdn.model.ConditionRuleForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConditionForDescribeCdnConfigOutput
 */



public class ConditionForDescribeCdnConfigOutput {
  @SerializedName("ConditionRule")
  private List<ConditionRuleForDescribeCdnConfigOutput> conditionRule = null;

  @SerializedName("Connective")
  private String connective = null;

  public ConditionForDescribeCdnConfigOutput conditionRule(List<ConditionRuleForDescribeCdnConfigOutput> conditionRule) {
    this.conditionRule = conditionRule;
    return this;
  }

  public ConditionForDescribeCdnConfigOutput addConditionRuleItem(ConditionRuleForDescribeCdnConfigOutput conditionRuleItem) {
    if (this.conditionRule == null) {
      this.conditionRule = new ArrayList<ConditionRuleForDescribeCdnConfigOutput>();
    }
    this.conditionRule.add(conditionRuleItem);
    return this;
  }

   /**
   * Get conditionRule
   * @return conditionRule
  **/
  @Valid
  @Schema(description = "")
  public List<ConditionRuleForDescribeCdnConfigOutput> getConditionRule() {
    return conditionRule;
  }

  public void setConditionRule(List<ConditionRuleForDescribeCdnConfigOutput> conditionRule) {
    this.conditionRule = conditionRule;
  }

  public ConditionForDescribeCdnConfigOutput connective(String connective) {
    this.connective = connective;
    return this;
  }

   /**
   * Get connective
   * @return connective
  **/
  @Schema(description = "")
  public String getConnective() {
    return connective;
  }

  public void setConnective(String connective) {
    this.connective = connective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionForDescribeCdnConfigOutput conditionForDescribeCdnConfigOutput = (ConditionForDescribeCdnConfigOutput) o;
    return Objects.equals(this.conditionRule, conditionForDescribeCdnConfigOutput.conditionRule) &&
        Objects.equals(this.connective, conditionForDescribeCdnConfigOutput.connective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionRule, connective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionForDescribeCdnConfigOutput {\n");
    
    sb.append("    conditionRule: ").append(toIndentedString(conditionRule)).append("\n");
    sb.append("    connective: ").append(toIndentedString(connective)).append("\n");
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