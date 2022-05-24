/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

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
 * ConvertEipAddressBillingTypeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class ConvertEipAddressBillingTypeRequest {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private Integer periodUnit = null;

  @SerializedName("RenewType")
  private Integer renewType = null;

  public ConvertEipAddressBillingTypeRequest allocationId(String allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(String allocationId) {
    this.allocationId = allocationId;
  }

  public ConvertEipAddressBillingTypeRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 1
   * maximum: 1000
   * @return bandwidth
  **/
 @Min(1) @Max(1000)  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public ConvertEipAddressBillingTypeRequest billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * minimum: 1
   * maximum: 3
   * @return billingType
  **/
  @NotNull
 @Min(1) @Max(3)  @Schema(required = true, description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public ConvertEipAddressBillingTypeRequest period(Integer period) {
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

  public ConvertEipAddressBillingTypeRequest periodUnit(Integer periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * minimum: 1
   * maximum: 2
   * @return periodUnit
  **/
 @Min(1) @Max(2)  @Schema(description = "")
  public Integer getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(Integer periodUnit) {
    this.periodUnit = periodUnit;
  }

  public ConvertEipAddressBillingTypeRequest renewType(Integer renewType) {
    this.renewType = renewType;
    return this;
  }

   /**
   * Get renewType
   * minimum: 1
   * maximum: 3
   * @return renewType
  **/
 @Min(1) @Max(3)  @Schema(description = "")
  public Integer getRenewType() {
    return renewType;
  }

  public void setRenewType(Integer renewType) {
    this.renewType = renewType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertEipAddressBillingTypeRequest convertEipAddressBillingTypeRequest = (ConvertEipAddressBillingTypeRequest) o;
    return Objects.equals(this.allocationId, convertEipAddressBillingTypeRequest.allocationId) &&
        Objects.equals(this.bandwidth, convertEipAddressBillingTypeRequest.bandwidth) &&
        Objects.equals(this.billingType, convertEipAddressBillingTypeRequest.billingType) &&
        Objects.equals(this.period, convertEipAddressBillingTypeRequest.period) &&
        Objects.equals(this.periodUnit, convertEipAddressBillingTypeRequest.periodUnit) &&
        Objects.equals(this.renewType, convertEipAddressBillingTypeRequest.renewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, bandwidth, billingType, period, periodUnit, renewType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertEipAddressBillingTypeRequest {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
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
