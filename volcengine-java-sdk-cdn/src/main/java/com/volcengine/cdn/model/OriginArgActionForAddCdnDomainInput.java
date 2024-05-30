/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.OriginArgComponentForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginArgActionForAddCdnDomainInput
 */



public class OriginArgActionForAddCdnDomainInput {
  @SerializedName("OriginArgComponents")
  private List<OriginArgComponentForAddCdnDomainInput> originArgComponents = null;

  public OriginArgActionForAddCdnDomainInput originArgComponents(List<OriginArgComponentForAddCdnDomainInput> originArgComponents) {
    this.originArgComponents = originArgComponents;
    return this;
  }

  public OriginArgActionForAddCdnDomainInput addOriginArgComponentsItem(OriginArgComponentForAddCdnDomainInput originArgComponentsItem) {
    if (this.originArgComponents == null) {
      this.originArgComponents = new ArrayList<OriginArgComponentForAddCdnDomainInput>();
    }
    this.originArgComponents.add(originArgComponentsItem);
    return this;
  }

   /**
   * Get originArgComponents
   * @return originArgComponents
  **/
  @Valid
  @Schema(description = "")
  public List<OriginArgComponentForAddCdnDomainInput> getOriginArgComponents() {
    return originArgComponents;
  }

  public void setOriginArgComponents(List<OriginArgComponentForAddCdnDomainInput> originArgComponents) {
    this.originArgComponents = originArgComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginArgActionForAddCdnDomainInput originArgActionForAddCdnDomainInput = (OriginArgActionForAddCdnDomainInput) o;
    return Objects.equals(this.originArgComponents, originArgActionForAddCdnDomainInput.originArgComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originArgComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginArgActionForAddCdnDomainInput {\n");
    
    sb.append("    originArgComponents: ").append(toIndentedString(originArgComponents)).append("\n");
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
