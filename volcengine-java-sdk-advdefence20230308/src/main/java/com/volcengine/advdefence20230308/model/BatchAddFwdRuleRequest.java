/*
 * advdefence20230308
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence20230308.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.advdefence20230308.model.AddRuleForBatchAddFwdRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BatchAddFwdRuleRequest
 */



public class BatchAddFwdRuleRequest {
  @SerializedName("AddRules")
  private List<AddRuleForBatchAddFwdRuleInput> addRules = null;

  public BatchAddFwdRuleRequest addRules(List<AddRuleForBatchAddFwdRuleInput> addRules) {
    this.addRules = addRules;
    return this;
  }

  public BatchAddFwdRuleRequest addAddRulesItem(AddRuleForBatchAddFwdRuleInput addRulesItem) {
    if (this.addRules == null) {
      this.addRules = new ArrayList<AddRuleForBatchAddFwdRuleInput>();
    }
    this.addRules.add(addRulesItem);
    return this;
  }

   /**
   * Get addRules
   * @return addRules
  **/
  @Valid
  @Schema(description = "")
  public List<AddRuleForBatchAddFwdRuleInput> getAddRules() {
    return addRules;
  }

  public void setAddRules(List<AddRuleForBatchAddFwdRuleInput> addRules) {
    this.addRules = addRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAddFwdRuleRequest batchAddFwdRuleRequest = (BatchAddFwdRuleRequest) o;
    return Objects.equals(this.addRules, batchAddFwdRuleRequest.addRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchAddFwdRuleRequest {\n");
    
    sb.append("    addRules: ").append(toIndentedString(addRules)).append("\n");
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