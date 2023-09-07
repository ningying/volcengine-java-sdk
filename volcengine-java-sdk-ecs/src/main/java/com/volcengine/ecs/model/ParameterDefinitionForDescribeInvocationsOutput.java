/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ParameterDefinitionForDescribeInvocationsOutput
 */


public class ParameterDefinitionForDescribeInvocationsOutput {
  @SerializedName("DecimalPrecision")
  private Integer decimalPrecision = null;

  @SerializedName("DefaultValue")
  private String defaultValue = null;

  @SerializedName("MaxLength")
  private Integer maxLength = null;

  @SerializedName("MaxValue")
  private String maxValue = null;

  @SerializedName("MinLength")
  private Integer minLength = null;

  @SerializedName("MinValue")
  private String minValue = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Required")
  private Boolean required = null;

  @SerializedName("Type")
  private String type = null;

  public ParameterDefinitionForDescribeInvocationsOutput decimalPrecision(Integer decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
    return this;
  }

   /**
   * Get decimalPrecision
   * @return decimalPrecision
  **/
  @Schema(description = "")
  public Integer getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setDecimalPrecision(Integer decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }

  public ParameterDefinitionForDescribeInvocationsOutput defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ParameterDefinitionForDescribeInvocationsOutput maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @Schema(description = "")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public ParameterDefinitionForDescribeInvocationsOutput maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  @Schema(description = "")
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }

  public ParameterDefinitionForDescribeInvocationsOutput minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @Schema(description = "")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public ParameterDefinitionForDescribeInvocationsOutput minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * Get minValue
   * @return minValue
  **/
  @Schema(description = "")
  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }

  public ParameterDefinitionForDescribeInvocationsOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ParameterDefinitionForDescribeInvocationsOutput required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @Schema(description = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ParameterDefinitionForDescribeInvocationsOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterDefinitionForDescribeInvocationsOutput parameterDefinitionForDescribeInvocationsOutput = (ParameterDefinitionForDescribeInvocationsOutput) o;
    return Objects.equals(this.decimalPrecision, parameterDefinitionForDescribeInvocationsOutput.decimalPrecision) &&
        Objects.equals(this.defaultValue, parameterDefinitionForDescribeInvocationsOutput.defaultValue) &&
        Objects.equals(this.maxLength, parameterDefinitionForDescribeInvocationsOutput.maxLength) &&
        Objects.equals(this.maxValue, parameterDefinitionForDescribeInvocationsOutput.maxValue) &&
        Objects.equals(this.minLength, parameterDefinitionForDescribeInvocationsOutput.minLength) &&
        Objects.equals(this.minValue, parameterDefinitionForDescribeInvocationsOutput.minValue) &&
        Objects.equals(this.name, parameterDefinitionForDescribeInvocationsOutput.name) &&
        Objects.equals(this.required, parameterDefinitionForDescribeInvocationsOutput.required) &&
        Objects.equals(this.type, parameterDefinitionForDescribeInvocationsOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decimalPrecision, defaultValue, maxLength, maxValue, minLength, minValue, name, required, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterDefinitionForDescribeInvocationsOutput {\n");
    
    sb.append("    decimalPrecision: ").append(toIndentedString(decimalPrecision)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
