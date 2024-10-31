/*
 * nta
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.nta.model;

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
 * GetFileDetectionRequest
 */



public class GetFileDetectionRequest {
  @SerializedName("QueryKey")
  private String queryKey = null;

  public GetFileDetectionRequest queryKey(String queryKey) {
    this.queryKey = queryKey;
    return this;
  }

   /**
   * Get queryKey
   * @return queryKey
  **/
  @NotNull
 @Size(max=64)  @Schema(required = true, description = "")
  public String getQueryKey() {
    return queryKey;
  }

  public void setQueryKey(String queryKey) {
    this.queryKey = queryKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFileDetectionRequest getFileDetectionRequest = (GetFileDetectionRequest) o;
    return Objects.equals(this.queryKey, getFileDetectionRequest.queryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFileDetectionRequest {\n");
    
    sb.append("    queryKey: ").append(toIndentedString(queryKey)).append("\n");
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