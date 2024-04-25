/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * UrlAccessForListDomainConfigOutput
 */


public class UrlAccessForListDomainConfigOutput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("GenKey")
  private String genKey = null;

  @SerializedName("GenTTL")
  private Integer genTTL = null;

  @SerializedName("GenType")
  private String genType = null;

  public UrlAccessForListDomainConfigOutput enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public UrlAccessForListDomainConfigOutput genKey(String genKey) {
    this.genKey = genKey;
    return this;
  }

   /**
   * Get genKey
   * @return genKey
  **/
  @Schema(description = "")
  public String getGenKey() {
    return genKey;
  }

  public void setGenKey(String genKey) {
    this.genKey = genKey;
  }

  public UrlAccessForListDomainConfigOutput genTTL(Integer genTTL) {
    this.genTTL = genTTL;
    return this;
  }

   /**
   * Get genTTL
   * @return genTTL
  **/
  @Schema(description = "")
  public Integer getGenTTL() {
    return genTTL;
  }

  public void setGenTTL(Integer genTTL) {
    this.genTTL = genTTL;
  }

  public UrlAccessForListDomainConfigOutput genType(String genType) {
    this.genType = genType;
    return this;
  }

   /**
   * Get genType
   * @return genType
  **/
  @Schema(description = "")
  public String getGenType() {
    return genType;
  }

  public void setGenType(String genType) {
    this.genType = genType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlAccessForListDomainConfigOutput urlAccessForListDomainConfigOutput = (UrlAccessForListDomainConfigOutput) o;
    return Objects.equals(this.enable, urlAccessForListDomainConfigOutput.enable) &&
        Objects.equals(this.genKey, urlAccessForListDomainConfigOutput.genKey) &&
        Objects.equals(this.genTTL, urlAccessForListDomainConfigOutput.genTTL) &&
        Objects.equals(this.genType, urlAccessForListDomainConfigOutput.genType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, genKey, genTTL, genType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlAccessForListDomainConfigOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    genKey: ").append(toIndentedString(genKey)).append("\n");
    sb.append("    genTTL: ").append(toIndentedString(genTTL)).append("\n");
    sb.append("    genType: ").append(toIndentedString(genType)).append("\n");
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
