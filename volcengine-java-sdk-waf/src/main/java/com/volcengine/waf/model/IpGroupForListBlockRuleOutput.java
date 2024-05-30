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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IpGroupForListBlockRuleOutput
 */



public class IpGroupForListBlockRuleOutput {
  @SerializedName("IpGroupId")
  private Integer ipGroupId = null;

  @SerializedName("Name")
  private String name = null;

  public IpGroupForListBlockRuleOutput ipGroupId(Integer ipGroupId) {
    this.ipGroupId = ipGroupId;
    return this;
  }

   /**
   * Get ipGroupId
   * @return ipGroupId
  **/
  @Schema(description = "")
  public Integer getIpGroupId() {
    return ipGroupId;
  }

  public void setIpGroupId(Integer ipGroupId) {
    this.ipGroupId = ipGroupId;
  }

  public IpGroupForListBlockRuleOutput name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpGroupForListBlockRuleOutput ipGroupForListBlockRuleOutput = (IpGroupForListBlockRuleOutput) o;
    return Objects.equals(this.ipGroupId, ipGroupForListBlockRuleOutput.ipGroupId) &&
        Objects.equals(this.name, ipGroupForListBlockRuleOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipGroupId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpGroupForListBlockRuleOutput {\n");
    
    sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
