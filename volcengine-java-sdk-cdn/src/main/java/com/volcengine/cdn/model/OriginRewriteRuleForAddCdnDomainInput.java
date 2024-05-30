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
import com.volcengine.cdn.model.ConditionForAddCdnDomainInput;
import com.volcengine.cdn.model.OriginRewriteActionForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginRewriteRuleForAddCdnDomainInput
 */



public class OriginRewriteRuleForAddCdnDomainInput {
  @SerializedName("Condition")
  private ConditionForAddCdnDomainInput condition = null;

  @SerializedName("OriginRewriteAction")
  private OriginRewriteActionForAddCdnDomainInput originRewriteAction = null;

  public OriginRewriteRuleForAddCdnDomainInput condition(ConditionForAddCdnDomainInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForAddCdnDomainInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForAddCdnDomainInput condition) {
    this.condition = condition;
  }

  public OriginRewriteRuleForAddCdnDomainInput originRewriteAction(OriginRewriteActionForAddCdnDomainInput originRewriteAction) {
    this.originRewriteAction = originRewriteAction;
    return this;
  }

   /**
   * Get originRewriteAction
   * @return originRewriteAction
  **/
  @Valid
  @Schema(description = "")
  public OriginRewriteActionForAddCdnDomainInput getOriginRewriteAction() {
    return originRewriteAction;
  }

  public void setOriginRewriteAction(OriginRewriteActionForAddCdnDomainInput originRewriteAction) {
    this.originRewriteAction = originRewriteAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginRewriteRuleForAddCdnDomainInput originRewriteRuleForAddCdnDomainInput = (OriginRewriteRuleForAddCdnDomainInput) o;
    return Objects.equals(this.condition, originRewriteRuleForAddCdnDomainInput.condition) &&
        Objects.equals(this.originRewriteAction, originRewriteRuleForAddCdnDomainInput.originRewriteAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, originRewriteAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginRewriteRuleForAddCdnDomainInput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    originRewriteAction: ").append(toIndentedString(originRewriteAction)).append("\n");
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
