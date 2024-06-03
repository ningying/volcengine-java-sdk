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
import com.volcengine.waf.model.AccurateGroupForUpdateBotAnalyseProtectRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateBotAnalyseProtectRuleRequest
 */



public class UpdateBotAnalyseProtectRuleRequest {
  @SerializedName("AccurateGroup")
  private List<AccurateGroupForUpdateBotAnalyseProtectRuleInput> accurateGroup = null;

  @SerializedName("ActionAfterVerification")
  private Integer actionAfterVerification = null;

  @SerializedName("ActionType")
  private Integer actionType = null;

  @SerializedName("EffectTime")
  private Integer effectTime = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("ExemptionTime")
  private Integer exemptionTime = null;

  @SerializedName("Field")
  private String field = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("PathThreshold")
  private Integer pathThreshold = null;

  @SerializedName("RulePriority")
  private Integer rulePriority = null;

  @SerializedName("SingleProportion")
  private String singleProportion = null;

  @SerializedName("SingleThreshold")
  private Integer singleThreshold = null;

  @SerializedName("StatisticalDuration")
  private Integer statisticalDuration = null;

  @SerializedName("StatisticalType")
  private Integer statisticalType = null;

  public UpdateBotAnalyseProtectRuleRequest accurateGroup(List<AccurateGroupForUpdateBotAnalyseProtectRuleInput> accurateGroup) {
    this.accurateGroup = accurateGroup;
    return this;
  }

  public UpdateBotAnalyseProtectRuleRequest addAccurateGroupItem(AccurateGroupForUpdateBotAnalyseProtectRuleInput accurateGroupItem) {
    if (this.accurateGroup == null) {
      this.accurateGroup = new ArrayList<AccurateGroupForUpdateBotAnalyseProtectRuleInput>();
    }
    this.accurateGroup.add(accurateGroupItem);
    return this;
  }

   /**
   * Get accurateGroup
   * @return accurateGroup
  **/
  @Valid
  @Schema(description = "")
  public List<AccurateGroupForUpdateBotAnalyseProtectRuleInput> getAccurateGroup() {
    return accurateGroup;
  }

  public void setAccurateGroup(List<AccurateGroupForUpdateBotAnalyseProtectRuleInput> accurateGroup) {
    this.accurateGroup = accurateGroup;
  }

  public UpdateBotAnalyseProtectRuleRequest actionAfterVerification(Integer actionAfterVerification) {
    this.actionAfterVerification = actionAfterVerification;
    return this;
  }

   /**
   * Get actionAfterVerification
   * @return actionAfterVerification
  **/
  @Schema(description = "")
  public Integer getActionAfterVerification() {
    return actionAfterVerification;
  }

  public void setActionAfterVerification(Integer actionAfterVerification) {
    this.actionAfterVerification = actionAfterVerification;
  }

  public UpdateBotAnalyseProtectRuleRequest actionType(Integer actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getActionType() {
    return actionType;
  }

  public void setActionType(Integer actionType) {
    this.actionType = actionType;
  }

  public UpdateBotAnalyseProtectRuleRequest effectTime(Integer effectTime) {
    this.effectTime = effectTime;
    return this;
  }

   /**
   * Get effectTime
   * @return effectTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEffectTime() {
    return effectTime;
  }

  public void setEffectTime(Integer effectTime) {
    this.effectTime = effectTime;
  }

  public UpdateBotAnalyseProtectRuleRequest enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public UpdateBotAnalyseProtectRuleRequest exemptionTime(Integer exemptionTime) {
    this.exemptionTime = exemptionTime;
    return this;
  }

   /**
   * Get exemptionTime
   * @return exemptionTime
  **/
  @Schema(description = "")
  public Integer getExemptionTime() {
    return exemptionTime;
  }

  public void setExemptionTime(Integer exemptionTime) {
    this.exemptionTime = exemptionTime;
  }

  public UpdateBotAnalyseProtectRuleRequest field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public UpdateBotAnalyseProtectRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public UpdateBotAnalyseProtectRuleRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UpdateBotAnalyseProtectRuleRequest name(String name) {
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

  public UpdateBotAnalyseProtectRuleRequest path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public UpdateBotAnalyseProtectRuleRequest pathThreshold(Integer pathThreshold) {
    this.pathThreshold = pathThreshold;
    return this;
  }

   /**
   * Get pathThreshold
   * @return pathThreshold
  **/
  @Schema(description = "")
  public Integer getPathThreshold() {
    return pathThreshold;
  }

  public void setPathThreshold(Integer pathThreshold) {
    this.pathThreshold = pathThreshold;
  }

  public UpdateBotAnalyseProtectRuleRequest rulePriority(Integer rulePriority) {
    this.rulePriority = rulePriority;
    return this;
  }

   /**
   * Get rulePriority
   * @return rulePriority
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRulePriority() {
    return rulePriority;
  }

  public void setRulePriority(Integer rulePriority) {
    this.rulePriority = rulePriority;
  }

  public UpdateBotAnalyseProtectRuleRequest singleProportion(String singleProportion) {
    this.singleProportion = singleProportion;
    return this;
  }

   /**
   * Get singleProportion
   * @return singleProportion
  **/
  @Schema(description = "")
  public String getSingleProportion() {
    return singleProportion;
  }

  public void setSingleProportion(String singleProportion) {
    this.singleProportion = singleProportion;
  }

  public UpdateBotAnalyseProtectRuleRequest singleThreshold(Integer singleThreshold) {
    this.singleThreshold = singleThreshold;
    return this;
  }

   /**
   * Get singleThreshold
   * @return singleThreshold
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSingleThreshold() {
    return singleThreshold;
  }

  public void setSingleThreshold(Integer singleThreshold) {
    this.singleThreshold = singleThreshold;
  }

  public UpdateBotAnalyseProtectRuleRequest statisticalDuration(Integer statisticalDuration) {
    this.statisticalDuration = statisticalDuration;
    return this;
  }

   /**
   * Get statisticalDuration
   * @return statisticalDuration
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getStatisticalDuration() {
    return statisticalDuration;
  }

  public void setStatisticalDuration(Integer statisticalDuration) {
    this.statisticalDuration = statisticalDuration;
  }

  public UpdateBotAnalyseProtectRuleRequest statisticalType(Integer statisticalType) {
    this.statisticalType = statisticalType;
    return this;
  }

   /**
   * Get statisticalType
   * @return statisticalType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getStatisticalType() {
    return statisticalType;
  }

  public void setStatisticalType(Integer statisticalType) {
    this.statisticalType = statisticalType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBotAnalyseProtectRuleRequest updateBotAnalyseProtectRuleRequest = (UpdateBotAnalyseProtectRuleRequest) o;
    return Objects.equals(this.accurateGroup, updateBotAnalyseProtectRuleRequest.accurateGroup) &&
        Objects.equals(this.actionAfterVerification, updateBotAnalyseProtectRuleRequest.actionAfterVerification) &&
        Objects.equals(this.actionType, updateBotAnalyseProtectRuleRequest.actionType) &&
        Objects.equals(this.effectTime, updateBotAnalyseProtectRuleRequest.effectTime) &&
        Objects.equals(this.enable, updateBotAnalyseProtectRuleRequest.enable) &&
        Objects.equals(this.exemptionTime, updateBotAnalyseProtectRuleRequest.exemptionTime) &&
        Objects.equals(this.field, updateBotAnalyseProtectRuleRequest.field) &&
        Objects.equals(this.host, updateBotAnalyseProtectRuleRequest.host) &&
        Objects.equals(this.id, updateBotAnalyseProtectRuleRequest.id) &&
        Objects.equals(this.name, updateBotAnalyseProtectRuleRequest.name) &&
        Objects.equals(this.path, updateBotAnalyseProtectRuleRequest.path) &&
        Objects.equals(this.pathThreshold, updateBotAnalyseProtectRuleRequest.pathThreshold) &&
        Objects.equals(this.rulePriority, updateBotAnalyseProtectRuleRequest.rulePriority) &&
        Objects.equals(this.singleProportion, updateBotAnalyseProtectRuleRequest.singleProportion) &&
        Objects.equals(this.singleThreshold, updateBotAnalyseProtectRuleRequest.singleThreshold) &&
        Objects.equals(this.statisticalDuration, updateBotAnalyseProtectRuleRequest.statisticalDuration) &&
        Objects.equals(this.statisticalType, updateBotAnalyseProtectRuleRequest.statisticalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateGroup, actionAfterVerification, actionType, effectTime, enable, exemptionTime, field, host, id, name, path, pathThreshold, rulePriority, singleProportion, singleThreshold, statisticalDuration, statisticalType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBotAnalyseProtectRuleRequest {\n");
    
    sb.append("    accurateGroup: ").append(toIndentedString(accurateGroup)).append("\n");
    sb.append("    actionAfterVerification: ").append(toIndentedString(actionAfterVerification)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    exemptionTime: ").append(toIndentedString(exemptionTime)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathThreshold: ").append(toIndentedString(pathThreshold)).append("\n");
    sb.append("    rulePriority: ").append(toIndentedString(rulePriority)).append("\n");
    sb.append("    singleProportion: ").append(toIndentedString(singleProportion)).append("\n");
    sb.append("    singleThreshold: ").append(toIndentedString(singleThreshold)).append("\n");
    sb.append("    statisticalDuration: ").append(toIndentedString(statisticalDuration)).append("\n");
    sb.append("    statisticalType: ").append(toIndentedString(statisticalType)).append("\n");
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
