/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.RuleForCreateRulesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateRulesRequest
 */


public class CreateRulesRequest {
  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("Rules")
  private List<RuleForCreateRulesInput> rules = null;

  public CreateRulesRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public CreateRulesRequest rules(List<RuleForCreateRulesInput> rules) {
    this.rules = rules;
    return this;
  }

  public CreateRulesRequest addRulesItem(RuleForCreateRulesInput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForCreateRulesInput>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Valid
  @Schema(description = "")
  public List<RuleForCreateRulesInput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForCreateRulesInput> rules) {
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
    CreateRulesRequest createRulesRequest = (CreateRulesRequest) o;
    return Objects.equals(this.listenerId, createRulesRequest.listenerId) &&
        Objects.equals(this.rules, createRulesRequest.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerId, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRulesRequest {\n");
    
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
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
