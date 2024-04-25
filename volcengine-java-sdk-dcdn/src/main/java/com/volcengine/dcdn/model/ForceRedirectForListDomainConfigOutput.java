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
 * ForceRedirectForListDomainConfigOutput
 */


public class ForceRedirectForListDomainConfigOutput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("RedirectType")
  private String redirectType = null;

  public ForceRedirectForListDomainConfigOutput enable(Boolean enable) {
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

  public ForceRedirectForListDomainConfigOutput redirectType(String redirectType) {
    this.redirectType = redirectType;
    return this;
  }

   /**
   * Get redirectType
   * @return redirectType
  **/
  @Schema(description = "")
  public String getRedirectType() {
    return redirectType;
  }

  public void setRedirectType(String redirectType) {
    this.redirectType = redirectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForceRedirectForListDomainConfigOutput forceRedirectForListDomainConfigOutput = (ForceRedirectForListDomainConfigOutput) o;
    return Objects.equals(this.enable, forceRedirectForListDomainConfigOutput.enable) &&
        Objects.equals(this.redirectType, forceRedirectForListDomainConfigOutput.redirectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, redirectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForceRedirectForListDomainConfigOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    redirectType: ").append(toIndentedString(redirectType)).append("\n");
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
