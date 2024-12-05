/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

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
 * DescribeControlPolicyByRuleIdRequest
 */



public class DescribeControlPolicyByRuleIdRequest {
  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    @SerializedName("in")
    IN("in"),
    @SerializedName("out")
    OUT("out");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String input) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DirectionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Direction")
  private DirectionEnum direction = null;

  @SerializedName("RuleIds")
  private List<String> ruleIds = null;

  public DescribeControlPolicyByRuleIdRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public DescribeControlPolicyByRuleIdRequest ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public DescribeControlPolicyByRuleIdRequest addRuleIdsItem(String ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<String>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * Get ruleIds
   * @return ruleIds
  **/
  @Schema(description = "")
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeControlPolicyByRuleIdRequest describeControlPolicyByRuleIdRequest = (DescribeControlPolicyByRuleIdRequest) o;
    return Objects.equals(this.direction, describeControlPolicyByRuleIdRequest.direction) &&
        Objects.equals(this.ruleIds, describeControlPolicyByRuleIdRequest.ruleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, ruleIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeControlPolicyByRuleIdRequest {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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