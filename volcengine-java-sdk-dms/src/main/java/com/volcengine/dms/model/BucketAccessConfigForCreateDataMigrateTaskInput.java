/*
 * dms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dms.model;

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
 * BucketAccessConfigForCreateDataMigrateTaskInput
 */



public class BucketAccessConfigForCreateDataMigrateTaskInput {
  @SerializedName("AK")
  private String AK = null;

  @SerializedName("BucketName")
  private String bucketName = null;

  @SerializedName("Endpoint")
  private String endpoint = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("RoleTrn")
  private String roleTrn = null;

  @SerializedName("SK")
  private String SK = null;

  @SerializedName("Vendor")
  private String vendor = null;

  public BucketAccessConfigForCreateDataMigrateTaskInput AK(String AK) {
    this.AK = AK;
    return this;
  }

   /**
   * Get AK
   * @return AK
  **/
  @Schema(description = "")
  public String getAK() {
    return AK;
  }

  public void setAK(String AK) {
    this.AK = AK;
  }

  public BucketAccessConfigForCreateDataMigrateTaskInput bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @Schema(description = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public BucketAccessConfigForCreateDataMigrateTaskInput endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public BucketAccessConfigForCreateDataMigrateTaskInput region(String region) {
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

  public BucketAccessConfigForCreateDataMigrateTaskInput roleTrn(String roleTrn) {
    this.roleTrn = roleTrn;
    return this;
  }

   /**
   * Get roleTrn
   * @return roleTrn
  **/
  @Schema(description = "")
  public String getRoleTrn() {
    return roleTrn;
  }

  public void setRoleTrn(String roleTrn) {
    this.roleTrn = roleTrn;
  }

  public BucketAccessConfigForCreateDataMigrateTaskInput SK(String SK) {
    this.SK = SK;
    return this;
  }

   /**
   * Get SK
   * @return SK
  **/
  @Schema(description = "")
  public String getSK() {
    return SK;
  }

  public void setSK(String SK) {
    this.SK = SK;
  }

  public BucketAccessConfigForCreateDataMigrateTaskInput vendor(String vendor) {
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
    BucketAccessConfigForCreateDataMigrateTaskInput bucketAccessConfigForCreateDataMigrateTaskInput = (BucketAccessConfigForCreateDataMigrateTaskInput) o;
    return Objects.equals(this.AK, bucketAccessConfigForCreateDataMigrateTaskInput.AK) &&
        Objects.equals(this.bucketName, bucketAccessConfigForCreateDataMigrateTaskInput.bucketName) &&
        Objects.equals(this.endpoint, bucketAccessConfigForCreateDataMigrateTaskInput.endpoint) &&
        Objects.equals(this.region, bucketAccessConfigForCreateDataMigrateTaskInput.region) &&
        Objects.equals(this.roleTrn, bucketAccessConfigForCreateDataMigrateTaskInput.roleTrn) &&
        Objects.equals(this.SK, bucketAccessConfigForCreateDataMigrateTaskInput.SK) &&
        Objects.equals(this.vendor, bucketAccessConfigForCreateDataMigrateTaskInput.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AK, bucketName, endpoint, region, roleTrn, SK, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketAccessConfigForCreateDataMigrateTaskInput {\n");
    
    sb.append("    AK: ").append(toIndentedString(AK)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleTrn: ").append(toIndentedString(roleTrn)).append("\n");
    sb.append("    SK: ").append(toIndentedString(SK)).append("\n");
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
