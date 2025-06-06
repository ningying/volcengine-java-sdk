/*
 * volc_content_platform
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volccontentplatform.model;

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
 * HierarchyTagForTagListTagTreeOutput
 */



public class HierarchyTagForTagListTagTreeOutput {
  @SerializedName("ParentTagId")
  private Long parentTagId = null;

  @SerializedName("ParentTagIdentity")
  private String parentTagIdentity = null;

  @SerializedName("TagId")
  private Long tagId = null;

  @SerializedName("TagIdentity")
  private String tagIdentity = null;

  @SerializedName("TagLevel")
  private Integer tagLevel = null;

  @SerializedName("TagName")
  private String tagName = null;

  @SerializedName("TagType")
  private String tagType = null;

  public HierarchyTagForTagListTagTreeOutput parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

   /**
   * Get parentTagId
   * @return parentTagId
  **/
  @Schema(description = "")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public HierarchyTagForTagListTagTreeOutput parentTagIdentity(String parentTagIdentity) {
    this.parentTagIdentity = parentTagIdentity;
    return this;
  }

   /**
   * Get parentTagIdentity
   * @return parentTagIdentity
  **/
  @Schema(description = "")
  public String getParentTagIdentity() {
    return parentTagIdentity;
  }

  public void setParentTagIdentity(String parentTagIdentity) {
    this.parentTagIdentity = parentTagIdentity;
  }

  public HierarchyTagForTagListTagTreeOutput tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @Schema(description = "")
  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }

  public HierarchyTagForTagListTagTreeOutput tagIdentity(String tagIdentity) {
    this.tagIdentity = tagIdentity;
    return this;
  }

   /**
   * Get tagIdentity
   * @return tagIdentity
  **/
  @Schema(description = "")
  public String getTagIdentity() {
    return tagIdentity;
  }

  public void setTagIdentity(String tagIdentity) {
    this.tagIdentity = tagIdentity;
  }

  public HierarchyTagForTagListTagTreeOutput tagLevel(Integer tagLevel) {
    this.tagLevel = tagLevel;
    return this;
  }

   /**
   * Get tagLevel
   * @return tagLevel
  **/
  @Schema(description = "")
  public Integer getTagLevel() {
    return tagLevel;
  }

  public void setTagLevel(Integer tagLevel) {
    this.tagLevel = tagLevel;
  }

  public HierarchyTagForTagListTagTreeOutput tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @Schema(description = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public HierarchyTagForTagListTagTreeOutput tagType(String tagType) {
    this.tagType = tagType;
    return this;
  }

   /**
   * Get tagType
   * @return tagType
  **/
  @Schema(description = "")
  public String getTagType() {
    return tagType;
  }

  public void setTagType(String tagType) {
    this.tagType = tagType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyTagForTagListTagTreeOutput hierarchyTagForTagListTagTreeOutput = (HierarchyTagForTagListTagTreeOutput) o;
    return Objects.equals(this.parentTagId, hierarchyTagForTagListTagTreeOutput.parentTagId) &&
        Objects.equals(this.parentTagIdentity, hierarchyTagForTagListTagTreeOutput.parentTagIdentity) &&
        Objects.equals(this.tagId, hierarchyTagForTagListTagTreeOutput.tagId) &&
        Objects.equals(this.tagIdentity, hierarchyTagForTagListTagTreeOutput.tagIdentity) &&
        Objects.equals(this.tagLevel, hierarchyTagForTagListTagTreeOutput.tagLevel) &&
        Objects.equals(this.tagName, hierarchyTagForTagListTagTreeOutput.tagName) &&
        Objects.equals(this.tagType, hierarchyTagForTagListTagTreeOutput.tagType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentTagId, parentTagIdentity, tagId, tagIdentity, tagLevel, tagName, tagType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyTagForTagListTagTreeOutput {\n");
    
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
    sb.append("    parentTagIdentity: ").append(toIndentedString(parentTagIdentity)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagIdentity: ").append(toIndentedString(tagIdentity)).append("\n");
    sb.append("    tagLevel: ").append(toIndentedString(tagLevel)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
