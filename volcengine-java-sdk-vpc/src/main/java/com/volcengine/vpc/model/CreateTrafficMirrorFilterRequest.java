/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.TagForCreateTrafficMirrorFilterInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTrafficMirrorFilterRequest
 */



public class CreateTrafficMirrorFilterRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForCreateTrafficMirrorFilterInput> tags = null;

  @SerializedName("TrafficMirrorFilterName")
  private String trafficMirrorFilterName = null;

  public CreateTrafficMirrorFilterRequest clientToken(String clientToken) {
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

  public CreateTrafficMirrorFilterRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTrafficMirrorFilterRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateTrafficMirrorFilterRequest tags(List<TagForCreateTrafficMirrorFilterInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateTrafficMirrorFilterRequest addTagsItem(TagForCreateTrafficMirrorFilterInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateTrafficMirrorFilterInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateTrafficMirrorFilterInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateTrafficMirrorFilterInput> tags) {
    this.tags = tags;
  }

  public CreateTrafficMirrorFilterRequest trafficMirrorFilterName(String trafficMirrorFilterName) {
    this.trafficMirrorFilterName = trafficMirrorFilterName;
    return this;
  }

   /**
   * Get trafficMirrorFilterName
   * @return trafficMirrorFilterName
  **/
  @Schema(description = "")
  public String getTrafficMirrorFilterName() {
    return trafficMirrorFilterName;
  }

  public void setTrafficMirrorFilterName(String trafficMirrorFilterName) {
    this.trafficMirrorFilterName = trafficMirrorFilterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrafficMirrorFilterRequest createTrafficMirrorFilterRequest = (CreateTrafficMirrorFilterRequest) o;
    return Objects.equals(this.clientToken, createTrafficMirrorFilterRequest.clientToken) &&
        Objects.equals(this.description, createTrafficMirrorFilterRequest.description) &&
        Objects.equals(this.projectName, createTrafficMirrorFilterRequest.projectName) &&
        Objects.equals(this.tags, createTrafficMirrorFilterRequest.tags) &&
        Objects.equals(this.trafficMirrorFilterName, createTrafficMirrorFilterRequest.trafficMirrorFilterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, projectName, tags, trafficMirrorFilterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrafficMirrorFilterRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    trafficMirrorFilterName: ").append(toIndentedString(trafficMirrorFilterName)).append("\n");
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