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
import com.volcengine.cr.model.StatusForListRegistriesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListRegistriesInput
 */



public class FilterForListRegistriesInput {
  @SerializedName("Names")
  private List<String> names = null;

  @SerializedName("Projects")
  private List<String> projects = null;

  @SerializedName("Statuses")
  private List<StatusForListRegistriesInput> statuses = null;

  @SerializedName("Types")
  private List<String> types = null;

  public FilterForListRegistriesInput names(List<String> names) {
    this.names = names;
    return this;
  }

  public FilterForListRegistriesInput addNamesItem(String namesItem) {
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

  public FilterForListRegistriesInput projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public FilterForListRegistriesInput addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<String>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @Schema(description = "")
  public List<String> getProjects() {
    return projects;
  }

  public void setProjects(List<String> projects) {
    this.projects = projects;
  }

  public FilterForListRegistriesInput statuses(List<StatusForListRegistriesInput> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FilterForListRegistriesInput addStatusesItem(StatusForListRegistriesInput statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusForListRegistriesInput>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @Valid
  @Schema(description = "")
  public List<StatusForListRegistriesInput> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusForListRegistriesInput> statuses) {
    this.statuses = statuses;
  }

  public FilterForListRegistriesInput types(List<String> types) {
    this.types = types;
    return this;
  }

  public FilterForListRegistriesInput addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListRegistriesInput filterForListRegistriesInput = (FilterForListRegistriesInput) o;
    return Objects.equals(this.names, filterForListRegistriesInput.names) &&
        Objects.equals(this.projects, filterForListRegistriesInput.projects) &&
        Objects.equals(this.statuses, filterForListRegistriesInput.statuses) &&
        Objects.equals(this.types, filterForListRegistriesInput.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, projects, statuses, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListRegistriesInput {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
