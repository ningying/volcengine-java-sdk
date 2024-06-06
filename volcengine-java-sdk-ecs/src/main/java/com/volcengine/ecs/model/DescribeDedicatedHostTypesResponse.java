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
import com.volcengine.ecs.model.DedicatedHostTypeForDescribeDedicatedHostTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDedicatedHostTypesResponse
 */



public class DescribeDedicatedHostTypesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DedicatedHostTypes")
  private List<DedicatedHostTypeForDescribeDedicatedHostTypesOutput> dedicatedHostTypes = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeDedicatedHostTypesResponse dedicatedHostTypes(List<DedicatedHostTypeForDescribeDedicatedHostTypesOutput> dedicatedHostTypes) {
    this.dedicatedHostTypes = dedicatedHostTypes;
    return this;
  }

  public DescribeDedicatedHostTypesResponse addDedicatedHostTypesItem(DedicatedHostTypeForDescribeDedicatedHostTypesOutput dedicatedHostTypesItem) {
    if (this.dedicatedHostTypes == null) {
      this.dedicatedHostTypes = new ArrayList<DedicatedHostTypeForDescribeDedicatedHostTypesOutput>();
    }
    this.dedicatedHostTypes.add(dedicatedHostTypesItem);
    return this;
  }

   /**
   * Get dedicatedHostTypes
   * @return dedicatedHostTypes
  **/
  @Valid
  @Schema(description = "")
  public List<DedicatedHostTypeForDescribeDedicatedHostTypesOutput> getDedicatedHostTypes() {
    return dedicatedHostTypes;
  }

  public void setDedicatedHostTypes(List<DedicatedHostTypeForDescribeDedicatedHostTypesOutput> dedicatedHostTypes) {
    this.dedicatedHostTypes = dedicatedHostTypes;
  }

  public DescribeDedicatedHostTypesResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDedicatedHostTypesResponse describeDedicatedHostTypesResponse = (DescribeDedicatedHostTypesResponse) o;
    return Objects.equals(this.dedicatedHostTypes, describeDedicatedHostTypesResponse.dedicatedHostTypes) &&
        Objects.equals(this.nextToken, describeDedicatedHostTypesResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedHostTypes, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDedicatedHostTypesResponse {\n");
    
    sb.append("    dedicatedHostTypes: ").append(toIndentedString(dedicatedHostTypes)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
