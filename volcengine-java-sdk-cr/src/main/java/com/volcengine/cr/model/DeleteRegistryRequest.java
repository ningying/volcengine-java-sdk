/*
 * cr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cr.model;

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
 * DeleteRegistryRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-31T20:47:55.450016+08:00[Asia/Shanghai]")
public class DeleteRegistryRequest {
  @SerializedName("DeleteImmediately")
  private Boolean deleteImmediately = null;

  @SerializedName("Name")
  private String name = null;

  public DeleteRegistryRequest deleteImmediately(Boolean deleteImmediately) {
    this.deleteImmediately = deleteImmediately;
    return this;
  }

   /**
   * Get deleteImmediately
   * @return deleteImmediately
  **/
  @Schema(description = "")
  public Boolean isDeleteImmediately() {
    return deleteImmediately;
  }

  public void setDeleteImmediately(Boolean deleteImmediately) {
    this.deleteImmediately = deleteImmediately;
  }

  public DeleteRegistryRequest name(String name) {
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
    DeleteRegistryRequest deleteRegistryRequest = (DeleteRegistryRequest) o;
    return Objects.equals(this.deleteImmediately, deleteRegistryRequest.deleteImmediately) &&
        Objects.equals(this.name, deleteRegistryRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteImmediately, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRegistryRequest {\n");
    
    sb.append("    deleteImmediately: ").append(toIndentedString(deleteImmediately)).append("\n");
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