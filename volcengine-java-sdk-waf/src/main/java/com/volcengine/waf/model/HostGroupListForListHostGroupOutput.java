/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.RelatedRuleForListHostGroupOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HostGroupListForListHostGroupOutput
 */



public class HostGroupListForListHostGroupOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("HostCount")
  private Integer hostCount = null;

  @SerializedName("HostGroupId")
  private Integer hostGroupId = null;

  @SerializedName("HostList")
  private List<String> hostList = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RelatedRules")
  private List<RelatedRuleForListHostGroupOutput> relatedRules = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public HostGroupListForListHostGroupOutput description(String description) {
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

  public HostGroupListForListHostGroupOutput hostCount(Integer hostCount) {
    this.hostCount = hostCount;
    return this;
  }

   /**
   * Get hostCount
   * @return hostCount
  **/
  @Schema(description = "")
  public Integer getHostCount() {
    return hostCount;
  }

  public void setHostCount(Integer hostCount) {
    this.hostCount = hostCount;
  }

  public HostGroupListForListHostGroupOutput hostGroupId(Integer hostGroupId) {
    this.hostGroupId = hostGroupId;
    return this;
  }

   /**
   * Get hostGroupId
   * @return hostGroupId
  **/
  @Schema(description = "")
  public Integer getHostGroupId() {
    return hostGroupId;
  }

  public void setHostGroupId(Integer hostGroupId) {
    this.hostGroupId = hostGroupId;
  }

  public HostGroupListForListHostGroupOutput hostList(List<String> hostList) {
    this.hostList = hostList;
    return this;
  }

  public HostGroupListForListHostGroupOutput addHostListItem(String hostListItem) {
    if (this.hostList == null) {
      this.hostList = new ArrayList<String>();
    }
    this.hostList.add(hostListItem);
    return this;
  }

   /**
   * Get hostList
   * @return hostList
  **/
  @Schema(description = "")
  public List<String> getHostList() {
    return hostList;
  }

  public void setHostList(List<String> hostList) {
    this.hostList = hostList;
  }

  public HostGroupListForListHostGroupOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HostGroupListForListHostGroupOutput relatedRules(List<RelatedRuleForListHostGroupOutput> relatedRules) {
    this.relatedRules = relatedRules;
    return this;
  }

  public HostGroupListForListHostGroupOutput addRelatedRulesItem(RelatedRuleForListHostGroupOutput relatedRulesItem) {
    if (this.relatedRules == null) {
      this.relatedRules = new ArrayList<RelatedRuleForListHostGroupOutput>();
    }
    this.relatedRules.add(relatedRulesItem);
    return this;
  }

   /**
   * Get relatedRules
   * @return relatedRules
  **/
  @Valid
  @Schema(description = "")
  public List<RelatedRuleForListHostGroupOutput> getRelatedRules() {
    return relatedRules;
  }

  public void setRelatedRules(List<RelatedRuleForListHostGroupOutput> relatedRules) {
    this.relatedRules = relatedRules;
  }

  public HostGroupListForListHostGroupOutput updateTime(String updateTime) {
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
    HostGroupListForListHostGroupOutput hostGroupListForListHostGroupOutput = (HostGroupListForListHostGroupOutput) o;
    return Objects.equals(this.description, hostGroupListForListHostGroupOutput.description) &&
        Objects.equals(this.hostCount, hostGroupListForListHostGroupOutput.hostCount) &&
        Objects.equals(this.hostGroupId, hostGroupListForListHostGroupOutput.hostGroupId) &&
        Objects.equals(this.hostList, hostGroupListForListHostGroupOutput.hostList) &&
        Objects.equals(this.name, hostGroupListForListHostGroupOutput.name) &&
        Objects.equals(this.relatedRules, hostGroupListForListHostGroupOutput.relatedRules) &&
        Objects.equals(this.updateTime, hostGroupListForListHostGroupOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, hostCount, hostGroupId, hostList, name, relatedRules, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostGroupListForListHostGroupOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relatedRules: ").append(toIndentedString(relatedRules)).append("\n");
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
