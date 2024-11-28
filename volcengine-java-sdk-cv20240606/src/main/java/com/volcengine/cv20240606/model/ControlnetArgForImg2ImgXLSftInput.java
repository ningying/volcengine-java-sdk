/*
 * cv20240606
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cv20240606.model;

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
 * ControlnetArgForImg2ImgXLSftInput
 */



public class ControlnetArgForImg2ImgXLSftInput {
  @SerializedName("binary_data_index")
  private Integer binaryDataIndex = null;

  @SerializedName("strength")
  private Float strength = null;

  @SerializedName("type")
  private String type = null;

  public ControlnetArgForImg2ImgXLSftInput binaryDataIndex(Integer binaryDataIndex) {
    this.binaryDataIndex = binaryDataIndex;
    return this;
  }

   /**
   * Get binaryDataIndex
   * @return binaryDataIndex
  **/
  @Schema(description = "")
  public Integer getBinaryDataIndex() {
    return binaryDataIndex;
  }

  public void setBinaryDataIndex(Integer binaryDataIndex) {
    this.binaryDataIndex = binaryDataIndex;
  }

  public ControlnetArgForImg2ImgXLSftInput strength(Float strength) {
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @Schema(description = "")
  public Float getStrength() {
    return strength;
  }

  public void setStrength(Float strength) {
    this.strength = strength;
  }

  public ControlnetArgForImg2ImgXLSftInput type(String type) {
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
    ControlnetArgForImg2ImgXLSftInput controlnetArgForImg2ImgXLSftInput = (ControlnetArgForImg2ImgXLSftInput) o;
    return Objects.equals(this.binaryDataIndex, controlnetArgForImg2ImgXLSftInput.binaryDataIndex) &&
        Objects.equals(this.strength, controlnetArgForImg2ImgXLSftInput.strength) &&
        Objects.equals(this.type, controlnetArgForImg2ImgXLSftInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataIndex, strength, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlnetArgForImg2ImgXLSftInput {\n");
    
    sb.append("    binaryDataIndex: ").append(toIndentedString(binaryDataIndex)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
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
