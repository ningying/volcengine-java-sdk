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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RemoveTagsFromResourceRequest
 */



public class RemoveTagsFromResourceRequest {
  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("TagKeys")
  private List<String> tagKeys = null;

  public RemoveTagsFromResourceRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public RemoveTagsFromResourceRequest addInstanceIdsItem(String instanceIdsItem) {
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

  public RemoveTagsFromResourceRequest tagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  public RemoveTagsFromResourceRequest addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * Get tagKeys
   * @return tagKeys
  **/
  @Schema(description = "")
  public List<String> getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveTagsFromResourceRequest removeTagsFromResourceRequest = (RemoveTagsFromResourceRequest) o;
    return Objects.equals(this.instanceIds, removeTagsFromResourceRequest.instanceIds) &&
        Objects.equals(this.tagKeys, removeTagsFromResourceRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceIds, tagKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveTagsFromResourceRequest {\n");
    
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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
