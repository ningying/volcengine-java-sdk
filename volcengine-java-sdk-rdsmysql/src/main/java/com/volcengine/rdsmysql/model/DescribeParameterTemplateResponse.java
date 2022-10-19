/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysql.model.TemplateInfoForDescribeParameterTemplateOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeParameterTemplateResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class DescribeParameterTemplateResponse {
  @SerializedName("TemplateInfo")
  private TemplateInfoForDescribeParameterTemplateOutput templateInfo = null;

  public DescribeParameterTemplateResponse templateInfo(TemplateInfoForDescribeParameterTemplateOutput templateInfo) {
    this.templateInfo = templateInfo;
    return this;
  }

   /**
   * Get templateInfo
   * @return templateInfo
  **/
  @Valid
  @Schema(description = "")
  public TemplateInfoForDescribeParameterTemplateOutput getTemplateInfo() {
    return templateInfo;
  }

  public void setTemplateInfo(TemplateInfoForDescribeParameterTemplateOutput templateInfo) {
    this.templateInfo = templateInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeParameterTemplateResponse describeParameterTemplateResponse = (DescribeParameterTemplateResponse) o;
    return Objects.equals(this.templateInfo, describeParameterTemplateResponse.templateInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeParameterTemplateResponse {\n");
    
    sb.append("    templateInfo: ").append(toIndentedString(templateInfo)).append("\n");
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
