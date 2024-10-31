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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListRepositoriesInput
 */



public class FilterForListRepositoriesInput {
  @SerializedName("AccessLevels")
  private List<String> accessLevels = null;

  @SerializedName("Names")
  private List<String> names = null;

  @SerializedName("Namespaces")
  private List<String> namespaces = null;

  public FilterForListRepositoriesInput accessLevels(List<String> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  public FilterForListRepositoriesInput addAccessLevelsItem(String accessLevelsItem) {
    if (this.accessLevels == null) {
      this.accessLevels = new ArrayList<String>();
    }
    this.accessLevels.add(accessLevelsItem);
    return this;
  }

   /**
   * Get accessLevels
   * @return accessLevels
  **/
  @Schema(description = "")
  public List<String> getAccessLevels() {
    return accessLevels;
  }

  public void setAccessLevels(List<String> accessLevels) {
    this.accessLevels = accessLevels;
  }

  public FilterForListRepositoriesInput names(List<String> names) {
    this.names = names;
    return this;
  }

  public FilterForListRepositoriesInput addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @Schema(description = "")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public FilterForListRepositoriesInput namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public FilterForListRepositoriesInput addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @Schema(description = "")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListRepositoriesInput filterForListRepositoriesInput = (FilterForListRepositoriesInput) o;
    return Objects.equals(this.accessLevels, filterForListRepositoriesInput.accessLevels) &&
        Objects.equals(this.names, filterForListRepositoriesInput.names) &&
        Objects.equals(this.namespaces, filterForListRepositoriesInput.namespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevels, names, namespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListRepositoriesInput {\n");
    
    sb.append("    accessLevels: ").append(toIndentedString(accessLevels)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
