/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * GetFwdRuleLipListRequest
 */



public class GetFwdRuleLipListRequest {
  @SerializedName("RegionList")
  private String regionList = null;

  public GetFwdRuleLipListRequest regionList(String regionList) {
    this.regionList = regionList;
    return this;
  }

   /**
   * Get regionList
   * @return regionList
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegionList() {
    return regionList;
  }

  public void setRegionList(String regionList) {
    this.regionList = regionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwdRuleLipListRequest getFwdRuleLipListRequest = (GetFwdRuleLipListRequest) o;
    return Objects.equals(this.regionList, getFwdRuleLipListRequest.regionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwdRuleLipListRequest {\n");
    
    sb.append("    regionList: ").append(toIndentedString(regionList)).append("\n");
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
