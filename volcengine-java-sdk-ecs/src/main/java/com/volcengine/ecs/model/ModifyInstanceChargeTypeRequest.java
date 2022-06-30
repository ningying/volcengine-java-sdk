/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ModifyInstanceChargeTypeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:14.870161+08:00[Asia/Shanghai]")
public class ModifyInstanceChargeTypeRequest {
  @SerializedName("AutoPay")
  private Boolean autoPay = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("IncludeDataVolumes")
  private Boolean includeDataVolumes = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  public ModifyInstanceChargeTypeRequest autoPay(Boolean autoPay) {
    this.autoPay = autoPay;
    return this;
  }

   /**
   * Get autoPay
   * @return autoPay
  **/
  @Schema(description = "")
  public Boolean isAutoPay() {
    return autoPay;
  }

  public void setAutoPay(Boolean autoPay) {
    this.autoPay = autoPay;
  }

  public ModifyInstanceChargeTypeRequest clientToken(String clientToken) {
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

  public ModifyInstanceChargeTypeRequest includeDataVolumes(Boolean includeDataVolumes) {
    this.includeDataVolumes = includeDataVolumes;
    return this;
  }

   /**
   * Get includeDataVolumes
   * @return includeDataVolumes
  **/
  @Schema(description = "")
  public Boolean isIncludeDataVolumes() {
    return includeDataVolumes;
  }

  public void setIncludeDataVolumes(Boolean includeDataVolumes) {
    this.includeDataVolumes = includeDataVolumes;
  }

  public ModifyInstanceChargeTypeRequest instanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
    return this;
  }

   /**
   * Get instanceChargeType
   * @return instanceChargeType
  **/
  @Schema(description = "")
  public String getInstanceChargeType() {
    return instanceChargeType;
  }

  public void setInstanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
  }

  public ModifyInstanceChargeTypeRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public ModifyInstanceChargeTypeRequest addInstanceIdsItem(String instanceIdsItem) {
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

  public ModifyInstanceChargeTypeRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ModifyInstanceChargeTypeRequest periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyInstanceChargeTypeRequest modifyInstanceChargeTypeRequest = (ModifyInstanceChargeTypeRequest) o;
    return Objects.equals(this.autoPay, modifyInstanceChargeTypeRequest.autoPay) &&
        Objects.equals(this.clientToken, modifyInstanceChargeTypeRequest.clientToken) &&
        Objects.equals(this.includeDataVolumes, modifyInstanceChargeTypeRequest.includeDataVolumes) &&
        Objects.equals(this.instanceChargeType, modifyInstanceChargeTypeRequest.instanceChargeType) &&
        Objects.equals(this.instanceIds, modifyInstanceChargeTypeRequest.instanceIds) &&
        Objects.equals(this.period, modifyInstanceChargeTypeRequest.period) &&
        Objects.equals(this.periodUnit, modifyInstanceChargeTypeRequest.periodUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPay, clientToken, includeDataVolumes, instanceChargeType, instanceIds, period, periodUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyInstanceChargeTypeRequest {\n");
    
    sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    includeDataVolumes: ").append(toIndentedString(includeDataVolumes)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
