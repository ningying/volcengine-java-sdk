/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.billing.model.ListForListResourcePackagesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListResourcePackagesResponse
 */



public class ListResourcePackagesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("List")
  private List<ListForListResourcePackagesOutput> list = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public ListResourcePackagesResponse list(List<ListForListResourcePackagesOutput> list) {
    this.list = list;
    return this;
  }

  public ListResourcePackagesResponse addListItem(ListForListResourcePackagesOutput listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ListForListResourcePackagesOutput>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Valid
  @Schema(description = "")
  public List<ListForListResourcePackagesOutput> getList() {
    return list;
  }

  public void setList(List<ListForListResourcePackagesOutput> list) {
    this.list = list;
  }

  public ListResourcePackagesResponse nextToken(String nextToken) {
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
    ListResourcePackagesResponse listResourcePackagesResponse = (ListResourcePackagesResponse) o;
    return Objects.equals(this.list, listResourcePackagesResponse.list) &&
        Objects.equals(this.nextToken, listResourcePackagesResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResourcePackagesResponse {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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