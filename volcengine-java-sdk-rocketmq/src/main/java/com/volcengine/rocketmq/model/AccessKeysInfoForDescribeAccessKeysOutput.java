/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

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
 * AccessKeysInfoForDescribeAccessKeysOutput
 */



public class AccessKeysInfoForDescribeAccessKeysOutput {
  @SerializedName("AccessKey")
  private String accessKey = null;

  @SerializedName("AclConfigJson")
  private String aclConfigJson = null;

  @SerializedName("Actived")
  private Boolean actived = null;

  @SerializedName("AllAuthority")
  private String allAuthority = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  public AccessKeysInfoForDescribeAccessKeysOutput accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public AccessKeysInfoForDescribeAccessKeysOutput aclConfigJson(String aclConfigJson) {
    this.aclConfigJson = aclConfigJson;
    return this;
  }

   /**
   * Get aclConfigJson
   * @return aclConfigJson
  **/
  @Schema(description = "")
  public String getAclConfigJson() {
    return aclConfigJson;
  }

  public void setAclConfigJson(String aclConfigJson) {
    this.aclConfigJson = aclConfigJson;
  }

  public AccessKeysInfoForDescribeAccessKeysOutput actived(Boolean actived) {
    this.actived = actived;
    return this;
  }

   /**
   * Get actived
   * @return actived
  **/
  @Schema(description = "")
  public Boolean isActived() {
    return actived;
  }

  public void setActived(Boolean actived) {
    this.actived = actived;
  }

  public AccessKeysInfoForDescribeAccessKeysOutput allAuthority(String allAuthority) {
    this.allAuthority = allAuthority;
    return this;
  }

   /**
   * Get allAuthority
   * @return allAuthority
  **/
  @Schema(description = "")
  public String getAllAuthority() {
    return allAuthority;
  }

  public void setAllAuthority(String allAuthority) {
    this.allAuthority = allAuthority;
  }

  public AccessKeysInfoForDescribeAccessKeysOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public AccessKeysInfoForDescribeAccessKeysOutput description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeysInfoForDescribeAccessKeysOutput accessKeysInfoForDescribeAccessKeysOutput = (AccessKeysInfoForDescribeAccessKeysOutput) o;
    return Objects.equals(this.accessKey, accessKeysInfoForDescribeAccessKeysOutput.accessKey) &&
        Objects.equals(this.aclConfigJson, accessKeysInfoForDescribeAccessKeysOutput.aclConfigJson) &&
        Objects.equals(this.actived, accessKeysInfoForDescribeAccessKeysOutput.actived) &&
        Objects.equals(this.allAuthority, accessKeysInfoForDescribeAccessKeysOutput.allAuthority) &&
        Objects.equals(this.createTime, accessKeysInfoForDescribeAccessKeysOutput.createTime) &&
        Objects.equals(this.description, accessKeysInfoForDescribeAccessKeysOutput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, aclConfigJson, actived, allAuthority, createTime, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeysInfoForDescribeAccessKeysOutput {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    aclConfigJson: ").append(toIndentedString(aclConfigJson)).append("\n");
    sb.append("    actived: ").append(toIndentedString(actived)).append("\n");
    sb.append("    allAuthority: ").append(toIndentedString(allAuthority)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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