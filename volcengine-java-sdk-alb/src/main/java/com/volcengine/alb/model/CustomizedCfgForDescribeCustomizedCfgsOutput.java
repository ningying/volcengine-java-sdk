/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * CustomizedCfgForDescribeCustomizedCfgsOutput
 */



public class CustomizedCfgForDescribeCustomizedCfgsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("CustomizedCfgContent")
  private String customizedCfgContent = null;

  @SerializedName("CustomizedCfgId")
  private String customizedCfgId = null;

  @SerializedName("CustomizedCfgName")
  private String customizedCfgName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public CustomizedCfgForDescribeCustomizedCfgsOutput createTime(String createTime) {
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

  public CustomizedCfgForDescribeCustomizedCfgsOutput customizedCfgContent(String customizedCfgContent) {
    this.customizedCfgContent = customizedCfgContent;
    return this;
  }

   /**
   * Get customizedCfgContent
   * @return customizedCfgContent
  **/
  @Schema(description = "")
  public String getCustomizedCfgContent() {
    return customizedCfgContent;
  }

  public void setCustomizedCfgContent(String customizedCfgContent) {
    this.customizedCfgContent = customizedCfgContent;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput customizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
    return this;
  }

   /**
   * Get customizedCfgId
   * @return customizedCfgId
  **/
  @Schema(description = "")
  public String getCustomizedCfgId() {
    return customizedCfgId;
  }

  public void setCustomizedCfgId(String customizedCfgId) {
    this.customizedCfgId = customizedCfgId;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput customizedCfgName(String customizedCfgName) {
    this.customizedCfgName = customizedCfgName;
    return this;
  }

   /**
   * Get customizedCfgName
   * @return customizedCfgName
  **/
  @Schema(description = "")
  public String getCustomizedCfgName() {
    return customizedCfgName;
  }

  public void setCustomizedCfgName(String customizedCfgName) {
    this.customizedCfgName = customizedCfgName;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput description(String description) {
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

  public CustomizedCfgForDescribeCustomizedCfgsOutput listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput projectName(String projectName) {
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

  public CustomizedCfgForDescribeCustomizedCfgsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomizedCfgForDescribeCustomizedCfgsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizedCfgForDescribeCustomizedCfgsOutput customizedCfgForDescribeCustomizedCfgsOutput = (CustomizedCfgForDescribeCustomizedCfgsOutput) o;
    return Objects.equals(this.createTime, customizedCfgForDescribeCustomizedCfgsOutput.createTime) &&
        Objects.equals(this.customizedCfgContent, customizedCfgForDescribeCustomizedCfgsOutput.customizedCfgContent) &&
        Objects.equals(this.customizedCfgId, customizedCfgForDescribeCustomizedCfgsOutput.customizedCfgId) &&
        Objects.equals(this.customizedCfgName, customizedCfgForDescribeCustomizedCfgsOutput.customizedCfgName) &&
        Objects.equals(this.description, customizedCfgForDescribeCustomizedCfgsOutput.description) &&
        Objects.equals(this.listeners, customizedCfgForDescribeCustomizedCfgsOutput.listeners) &&
        Objects.equals(this.projectName, customizedCfgForDescribeCustomizedCfgsOutput.projectName) &&
        Objects.equals(this.status, customizedCfgForDescribeCustomizedCfgsOutput.status) &&
        Objects.equals(this.updateTime, customizedCfgForDescribeCustomizedCfgsOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, customizedCfgContent, customizedCfgId, customizedCfgName, description, listeners, projectName, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedCfgForDescribeCustomizedCfgsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    customizedCfgContent: ").append(toIndentedString(customizedCfgContent)).append("\n");
    sb.append("    customizedCfgId: ").append(toIndentedString(customizedCfgId)).append("\n");
    sb.append("    customizedCfgName: ").append(toIndentedString(customizedCfgName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
