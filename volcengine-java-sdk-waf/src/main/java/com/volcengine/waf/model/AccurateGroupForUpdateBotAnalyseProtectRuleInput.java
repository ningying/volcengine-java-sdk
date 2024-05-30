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
import com.volcengine.waf.model.AccurateRuleForUpdateBotAnalyseProtectRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccurateGroupForUpdateBotAnalyseProtectRuleInput
 */



public class AccurateGroupForUpdateBotAnalyseProtectRuleInput {
  @SerializedName("AccurateRules")
  private List<AccurateRuleForUpdateBotAnalyseProtectRuleInput> accurateRules = null;

  @SerializedName("Logic")
  private Integer logic = null;

  public AccurateGroupForUpdateBotAnalyseProtectRuleInput accurateRules(List<AccurateRuleForUpdateBotAnalyseProtectRuleInput> accurateRules) {
    this.accurateRules = accurateRules;
    return this;
  }

  public AccurateGroupForUpdateBotAnalyseProtectRuleInput addAccurateRulesItem(AccurateRuleForUpdateBotAnalyseProtectRuleInput accurateRulesItem) {
    if (this.accurateRules == null) {
      this.accurateRules = new ArrayList<AccurateRuleForUpdateBotAnalyseProtectRuleInput>();
    }
    this.accurateRules.add(accurateRulesItem);
    return this;
  }

   /**
   * Get accurateRules
   * @return accurateRules
  **/
  @Valid
  @Schema(description = "")
  public List<AccurateRuleForUpdateBotAnalyseProtectRuleInput> getAccurateRules() {
    return accurateRules;
  }

  public void setAccurateRules(List<AccurateRuleForUpdateBotAnalyseProtectRuleInput> accurateRules) {
    this.accurateRules = accurateRules;
  }

  public AccurateGroupForUpdateBotAnalyseProtectRuleInput logic(Integer logic) {
    this.logic = logic;
    return this;
  }

   /**
   * Get logic
   * @return logic
  **/
  @Schema(description = "")
  public Integer getLogic() {
    return logic;
  }

  public void setLogic(Integer logic) {
    this.logic = logic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccurateGroupForUpdateBotAnalyseProtectRuleInput accurateGroupForUpdateBotAnalyseProtectRuleInput = (AccurateGroupForUpdateBotAnalyseProtectRuleInput) o;
    return Objects.equals(this.accurateRules, accurateGroupForUpdateBotAnalyseProtectRuleInput.accurateRules) &&
        Objects.equals(this.logic, accurateGroupForUpdateBotAnalyseProtectRuleInput.logic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateRules, logic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccurateGroupForUpdateBotAnalyseProtectRuleInput {\n");
    
    sb.append("    accurateRules: ").append(toIndentedString(accurateRules)).append("\n");
    sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
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
