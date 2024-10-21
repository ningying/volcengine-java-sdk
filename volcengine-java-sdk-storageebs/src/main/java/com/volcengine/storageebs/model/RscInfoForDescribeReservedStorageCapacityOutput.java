/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * RscInfoForDescribeReservedStorageCapacityOutput
 */



public class RscInfoForDescribeReservedStorageCapacityOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RemainingSize")
  private Integer remainingSize = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TakeEffectTime")
  private String takeEffectTime = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public RscInfoForDescribeReservedStorageCapacityOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput name(String name) {
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

  public RscInfoForDescribeReservedStorageCapacityOutput remainingSize(Integer remainingSize) {
    this.remainingSize = remainingSize;
    return this;
  }

   /**
   * Get remainingSize
   * @return remainingSize
  **/
  @Schema(description = "")
  public Integer getRemainingSize() {
    return remainingSize;
  }

  public void setRemainingSize(Integer remainingSize) {
    this.remainingSize = remainingSize;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput status(String status) {
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

  public RscInfoForDescribeReservedStorageCapacityOutput takeEffectTime(String takeEffectTime) {
    this.takeEffectTime = takeEffectTime;
    return this;
  }

   /**
   * Get takeEffectTime
   * @return takeEffectTime
  **/
  @Schema(description = "")
  public String getTakeEffectTime() {
    return takeEffectTime;
  }

  public void setTakeEffectTime(String takeEffectTime) {
    this.takeEffectTime = takeEffectTime;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RscInfoForDescribeReservedStorageCapacityOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RscInfoForDescribeReservedStorageCapacityOutput rscInfoForDescribeReservedStorageCapacityOutput = (RscInfoForDescribeReservedStorageCapacityOutput) o;
    return Objects.equals(this.accountId, rscInfoForDescribeReservedStorageCapacityOutput.accountId) &&
        Objects.equals(this.expiredTime, rscInfoForDescribeReservedStorageCapacityOutput.expiredTime) &&
        Objects.equals(this.id, rscInfoForDescribeReservedStorageCapacityOutput.id) &&
        Objects.equals(this.name, rscInfoForDescribeReservedStorageCapacityOutput.name) &&
        Objects.equals(this.remainingSize, rscInfoForDescribeReservedStorageCapacityOutput.remainingSize) &&
        Objects.equals(this.size, rscInfoForDescribeReservedStorageCapacityOutput.size) &&
        Objects.equals(this.status, rscInfoForDescribeReservedStorageCapacityOutput.status) &&
        Objects.equals(this.takeEffectTime, rscInfoForDescribeReservedStorageCapacityOutput.takeEffectTime) &&
        Objects.equals(this.type, rscInfoForDescribeReservedStorageCapacityOutput.type) &&
        Objects.equals(this.zoneId, rscInfoForDescribeReservedStorageCapacityOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, expiredTime, id, name, remainingSize, size, status, takeEffectTime, type, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RscInfoForDescribeReservedStorageCapacityOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remainingSize: ").append(toIndentedString(remainingSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    takeEffectTime: ").append(toIndentedString(takeEffectTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
