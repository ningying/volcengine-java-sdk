/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * CreateZoneResponse
 */



public class CreateZoneResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CacheStage")
  private Integer cacheStage = null;

  @SerializedName("ConfigurationCode")
  private String configurationCode = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DnsSecurity")
  private String dnsSecurity = null;

  @SerializedName("ExpiredTime")
  private Long expiredTime = null;

  @SerializedName("InstanceID")
  private String instanceID = null;

  @SerializedName("IsSubDomain")
  private Boolean isSubDomain = null;

  @SerializedName("LastOperator")
  private String lastOperator = null;

  @SerializedName("RecordCount")
  private Integer recordCount = null;

  @SerializedName("Remark")
  private String remark = null;

  @SerializedName("TradeCode")
  private String tradeCode = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("ZID")
  private Long ZID = null;

  @SerializedName("ZoneName")
  private String zoneName = null;

  public CreateZoneResponse cacheStage(Integer cacheStage) {
    this.cacheStage = cacheStage;
    return this;
  }

   /**
   * Get cacheStage
   * @return cacheStage
  **/
  @Schema(description = "")
  public Integer getCacheStage() {
    return cacheStage;
  }

  public void setCacheStage(Integer cacheStage) {
    this.cacheStage = cacheStage;
  }

  public CreateZoneResponse configurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
    return this;
  }

   /**
   * Get configurationCode
   * @return configurationCode
  **/
  @Schema(description = "")
  public String getConfigurationCode() {
    return configurationCode;
  }

  public void setConfigurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
  }

  public CreateZoneResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CreateZoneResponse dnsSecurity(String dnsSecurity) {
    this.dnsSecurity = dnsSecurity;
    return this;
  }

   /**
   * Get dnsSecurity
   * @return dnsSecurity
  **/
  @Schema(description = "")
  public String getDnsSecurity() {
    return dnsSecurity;
  }

  public void setDnsSecurity(String dnsSecurity) {
    this.dnsSecurity = dnsSecurity;
  }

  public CreateZoneResponse expiredTime(Long expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public Long getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(Long expiredTime) {
    this.expiredTime = expiredTime;
  }

  public CreateZoneResponse instanceID(String instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * Get instanceID
   * @return instanceID
  **/
  @Schema(description = "")
  public String getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  public CreateZoneResponse isSubDomain(Boolean isSubDomain) {
    this.isSubDomain = isSubDomain;
    return this;
  }

   /**
   * Get isSubDomain
   * @return isSubDomain
  **/
  @Schema(description = "")
  public Boolean isIsSubDomain() {
    return isSubDomain;
  }

  public void setIsSubDomain(Boolean isSubDomain) {
    this.isSubDomain = isSubDomain;
  }

  public CreateZoneResponse lastOperator(String lastOperator) {
    this.lastOperator = lastOperator;
    return this;
  }

   /**
   * Get lastOperator
   * @return lastOperator
  **/
  @Schema(description = "")
  public String getLastOperator() {
    return lastOperator;
  }

  public void setLastOperator(String lastOperator) {
    this.lastOperator = lastOperator;
  }

  public CreateZoneResponse recordCount(Integer recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Get recordCount
   * @return recordCount
  **/
  @Schema(description = "")
  public Integer getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }

  public CreateZoneResponse remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @Schema(description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public CreateZoneResponse tradeCode(String tradeCode) {
    this.tradeCode = tradeCode;
    return this;
  }

   /**
   * Get tradeCode
   * @return tradeCode
  **/
  @Schema(description = "")
  public String getTradeCode() {
    return tradeCode;
  }

  public void setTradeCode(String tradeCode) {
    this.tradeCode = tradeCode;
  }

  public CreateZoneResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CreateZoneResponse ZID(Long ZID) {
    this.ZID = ZID;
    return this;
  }

   /**
   * Get ZID
   * @return ZID
  **/
  @Schema(description = "")
  public Long getZID() {
    return ZID;
  }

  public void setZID(Long ZID) {
    this.ZID = ZID;
  }

  public CreateZoneResponse zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * Get zoneName
   * @return zoneName
  **/
  @Schema(description = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateZoneResponse createZoneResponse = (CreateZoneResponse) o;
    return Objects.equals(this.cacheStage, createZoneResponse.cacheStage) &&
        Objects.equals(this.configurationCode, createZoneResponse.configurationCode) &&
        Objects.equals(this.createdAt, createZoneResponse.createdAt) &&
        Objects.equals(this.dnsSecurity, createZoneResponse.dnsSecurity) &&
        Objects.equals(this.expiredTime, createZoneResponse.expiredTime) &&
        Objects.equals(this.instanceID, createZoneResponse.instanceID) &&
        Objects.equals(this.isSubDomain, createZoneResponse.isSubDomain) &&
        Objects.equals(this.lastOperator, createZoneResponse.lastOperator) &&
        Objects.equals(this.recordCount, createZoneResponse.recordCount) &&
        Objects.equals(this.remark, createZoneResponse.remark) &&
        Objects.equals(this.tradeCode, createZoneResponse.tradeCode) &&
        Objects.equals(this.updatedAt, createZoneResponse.updatedAt) &&
        Objects.equals(this.ZID, createZoneResponse.ZID) &&
        Objects.equals(this.zoneName, createZoneResponse.zoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheStage, configurationCode, createdAt, dnsSecurity, expiredTime, instanceID, isSubDomain, lastOperator, recordCount, remark, tradeCode, updatedAt, ZID, zoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateZoneResponse {\n");
    
    sb.append("    cacheStage: ").append(toIndentedString(cacheStage)).append("\n");
    sb.append("    configurationCode: ").append(toIndentedString(configurationCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dnsSecurity: ").append(toIndentedString(dnsSecurity)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    isSubDomain: ").append(toIndentedString(isSubDomain)).append("\n");
    sb.append("    lastOperator: ").append(toIndentedString(lastOperator)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    tradeCode: ").append(toIndentedString(tradeCode)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ZID: ").append(toIndentedString(ZID)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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