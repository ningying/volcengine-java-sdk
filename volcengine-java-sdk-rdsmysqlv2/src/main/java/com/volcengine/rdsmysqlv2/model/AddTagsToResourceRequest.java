/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.TagForAddTagsToResourceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AddTagsToResourceRequest
 */



public class AddTagsToResourceRequest {
  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("Tags")
  private List<TagForAddTagsToResourceInput> tags = null;

  public AddTagsToResourceRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public AddTagsToResourceRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public AddTagsToResourceRequest tags(List<TagForAddTagsToResourceInput> tags) {
    this.tags = tags;
    return this;
  }

  public AddTagsToResourceRequest addTagsItem(TagForAddTagsToResourceInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForAddTagsToResourceInput>();
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
  public List<TagForAddTagsToResourceInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForAddTagsToResourceInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddTagsToResourceRequest addTagsToResourceRequest = (AddTagsToResourceRequest) o;
    return Objects.equals(this.instanceIds, addTagsToResourceRequest.instanceIds) &&
        Objects.equals(this.tags, addTagsToResourceRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceIds, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTagsToResourceRequest {\n");
    
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
