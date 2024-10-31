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
import com.volcengine.waf.model.ModuleQuickConfForCreateDomainOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DefaultModuleQuickConfForCreateDomainOutput
 */



public class DefaultModuleQuickConfForCreateDomainOutput {
  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("ModuleQuickConf")
  private ModuleQuickConfForCreateDomainOutput moduleQuickConf = null;

  public DefaultModuleQuickConfForCreateDomainOutput enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public DefaultModuleQuickConfForCreateDomainOutput moduleQuickConf(ModuleQuickConfForCreateDomainOutput moduleQuickConf) {
    this.moduleQuickConf = moduleQuickConf;
    return this;
  }

   /**
   * Get moduleQuickConf
   * @return moduleQuickConf
  **/
  @Valid
  @Schema(description = "")
  public ModuleQuickConfForCreateDomainOutput getModuleQuickConf() {
    return moduleQuickConf;
  }

  public void setModuleQuickConf(ModuleQuickConfForCreateDomainOutput moduleQuickConf) {
    this.moduleQuickConf = moduleQuickConf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultModuleQuickConfForCreateDomainOutput defaultModuleQuickConfForCreateDomainOutput = (DefaultModuleQuickConfForCreateDomainOutput) o;
    return Objects.equals(this.enable, defaultModuleQuickConfForCreateDomainOutput.enable) &&
        Objects.equals(this.moduleQuickConf, defaultModuleQuickConfForCreateDomainOutput.moduleQuickConf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, moduleQuickConf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultModuleQuickConfForCreateDomainOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    moduleQuickConf: ").append(toIndentedString(moduleQuickConf)).append("\n");
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