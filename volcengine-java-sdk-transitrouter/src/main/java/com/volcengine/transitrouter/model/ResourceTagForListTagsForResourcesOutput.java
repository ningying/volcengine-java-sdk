/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * ResourceTagForListTagsForResourcesOutput
 */



public class ResourceTagForListTagsForResourcesOutput {
  @SerializedName("ResourceId")
  private String resourceId = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("TagKey")
  private String tagKey = null;

  @SerializedName("TagValue")
  private String tagValue = null;

  public ResourceTagForListTagsForResourcesOutput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public ResourceTagForListTagsForResourcesOutput resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public ResourceTagForListTagsForResourcesOutput tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

   /**
   * Get tagKey
   * @return tagKey
  **/
  @Schema(description = "")
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public ResourceTagForListTagsForResourcesOutput tagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

   /**
   * Get tagValue
   * @return tagValue
  **/
  @Schema(description = "")
  public String getTagValue() {
    return tagValue;
  }

  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTagForListTagsForResourcesOutput resourceTagForListTagsForResourcesOutput = (ResourceTagForListTagsForResourcesOutput) o;
    return Objects.equals(this.resourceId, resourceTagForListTagsForResourcesOutput.resourceId) &&
        Objects.equals(this.resourceType, resourceTagForListTagsForResourcesOutput.resourceType) &&
        Objects.equals(this.tagKey, resourceTagForListTagsForResourcesOutput.tagKey) &&
        Objects.equals(this.tagValue, resourceTagForListTagsForResourcesOutput.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceType, tagKey, tagValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTagForListTagsForResourcesOutput {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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
