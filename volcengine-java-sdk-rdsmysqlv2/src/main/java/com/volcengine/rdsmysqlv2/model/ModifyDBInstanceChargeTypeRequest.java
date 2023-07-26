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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBInstanceChargeTypeRequest
 */


public class ModifyDBInstanceChargeTypeRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  public ModifyDBInstanceChargeTypeRequest autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ModifyDBInstanceChargeTypeRequest chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ModifyDBInstanceChargeTypeRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBInstanceChargeTypeRequest period(Integer period) {
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

  public ModifyDBInstanceChargeTypeRequest periodUnit(String periodUnit) {
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
    ModifyDBInstanceChargeTypeRequest modifyDBInstanceChargeTypeRequest = (ModifyDBInstanceChargeTypeRequest) o;
    return Objects.equals(this.autoRenew, modifyDBInstanceChargeTypeRequest.autoRenew) &&
        Objects.equals(this.chargeType, modifyDBInstanceChargeTypeRequest.chargeType) &&
        Objects.equals(this.instanceId, modifyDBInstanceChargeTypeRequest.instanceId) &&
        Objects.equals(this.period, modifyDBInstanceChargeTypeRequest.period) &&
        Objects.equals(this.periodUnit, modifyDBInstanceChargeTypeRequest.periodUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeType, instanceId, period, periodUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceChargeTypeRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
