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
import com.volcengine.cr.model.ResourceTagForCreateRegistryInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateRegistryRequest
 */



public class CreateRegistryRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForCreateRegistryInput> resourceTags = null;

  @SerializedName("Type")
  private String type = null;

  public CreateRegistryRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateRegistryRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRegistryRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CreateRegistryRequest resourceTags(List<ResourceTagForCreateRegistryInput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public CreateRegistryRequest addResourceTagsItem(ResourceTagForCreateRegistryInput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForCreateRegistryInput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForCreateRegistryInput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForCreateRegistryInput> resourceTags) {
    this.resourceTags = resourceTags;
  }

  public CreateRegistryRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRegistryRequest createRegistryRequest = (CreateRegistryRequest) o;
    return Objects.equals(this.clientToken, createRegistryRequest.clientToken) &&
        Objects.equals(this.name, createRegistryRequest.name) &&
        Objects.equals(this.project, createRegistryRequest.project) &&
        Objects.equals(this.resourceTags, createRegistryRequest.resourceTags) &&
        Objects.equals(this.type, createRegistryRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, name, project, resourceTags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRegistryRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
