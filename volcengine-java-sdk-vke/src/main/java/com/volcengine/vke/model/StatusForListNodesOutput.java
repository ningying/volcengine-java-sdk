/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.ConditionForListNodesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatusForListNodesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-22T17:04:04.290377+08:00[Asia/Shanghai]")
public class StatusForListNodesOutput {
  @SerializedName("Conditions")
  private List<ConditionForListNodesOutput> conditions = null;

  @SerializedName("Phase")
  private String phase = null;

  public StatusForListNodesOutput conditions(List<ConditionForListNodesOutput> conditions) {
    this.conditions = conditions;
    return this;
  }

  public StatusForListNodesOutput addConditionsItem(ConditionForListNodesOutput conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ConditionForListNodesOutput>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Valid
  @Schema(description = "")
  public List<ConditionForListNodesOutput> getConditions() {
    return conditions;
  }

  public void setConditions(List<ConditionForListNodesOutput> conditions) {
    this.conditions = conditions;
  }

  public StatusForListNodesOutput phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @Schema(description = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusForListNodesOutput statusForListNodesOutput = (StatusForListNodesOutput) o;
    return Objects.equals(this.conditions, statusForListNodesOutput.conditions) &&
        Objects.equals(this.phase, statusForListNodesOutput.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusForListNodesOutput {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
