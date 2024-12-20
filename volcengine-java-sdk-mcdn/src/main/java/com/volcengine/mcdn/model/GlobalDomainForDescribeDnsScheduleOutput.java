/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

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
 * GlobalDomainForDescribeDnsScheduleOutput
 */



public class GlobalDomainForDescribeDnsScheduleOutput {
  @SerializedName("CloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("Cname")
  private String cname = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubProduct")
  private String subProduct = null;

  @SerializedName("Vendor")
  private String vendor = null;

  public GlobalDomainForDescribeDnsScheduleOutput cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @Schema(description = "")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public GlobalDomainForDescribeDnsScheduleOutput cname(String cname) {
    this.cname = cname;
    return this;
  }

   /**
   * Get cname
   * @return cname
  **/
  @Schema(description = "")
  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public GlobalDomainForDescribeDnsScheduleOutput id(String id) {
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

  public GlobalDomainForDescribeDnsScheduleOutput isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public GlobalDomainForDescribeDnsScheduleOutput name(String name) {
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

  public GlobalDomainForDescribeDnsScheduleOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public GlobalDomainForDescribeDnsScheduleOutput status(String status) {
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

  public GlobalDomainForDescribeDnsScheduleOutput subProduct(String subProduct) {
    this.subProduct = subProduct;
    return this;
  }

   /**
   * Get subProduct
   * @return subProduct
  **/
  @Schema(description = "")
  public String getSubProduct() {
    return subProduct;
  }

  public void setSubProduct(String subProduct) {
    this.subProduct = subProduct;
  }

  public GlobalDomainForDescribeDnsScheduleOutput vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @Schema(description = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalDomainForDescribeDnsScheduleOutput globalDomainForDescribeDnsScheduleOutput = (GlobalDomainForDescribeDnsScheduleOutput) o;
    return Objects.equals(this.cloudAccountId, globalDomainForDescribeDnsScheduleOutput.cloudAccountId) &&
        Objects.equals(this.cname, globalDomainForDescribeDnsScheduleOutput.cname) &&
        Objects.equals(this.id, globalDomainForDescribeDnsScheduleOutput.id) &&
        Objects.equals(this.isEnabled, globalDomainForDescribeDnsScheduleOutput.isEnabled) &&
        Objects.equals(this.name, globalDomainForDescribeDnsScheduleOutput.name) &&
        Objects.equals(this.region, globalDomainForDescribeDnsScheduleOutput.region) &&
        Objects.equals(this.status, globalDomainForDescribeDnsScheduleOutput.status) &&
        Objects.equals(this.subProduct, globalDomainForDescribeDnsScheduleOutput.subProduct) &&
        Objects.equals(this.vendor, globalDomainForDescribeDnsScheduleOutput.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cname, id, isEnabled, name, region, status, subProduct, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalDomainForDescribeDnsScheduleOutput {\n");
    
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subProduct: ").append(toIndentedString(subProduct)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
