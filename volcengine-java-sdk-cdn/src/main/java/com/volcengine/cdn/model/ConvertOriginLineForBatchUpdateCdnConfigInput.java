/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.PrivateBucketAuthForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConvertOriginLineForBatchUpdateCdnConfigInput
 */



public class ConvertOriginLineForBatchUpdateCdnConfigInput {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("BucketName")
  private String bucketName = null;

  @SerializedName("HttpPort")
  private String httpPort = null;

  @SerializedName("HttpsPort")
  private String httpsPort = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("OriginHost")
  private String originHost = null;

  @SerializedName("OriginType")
  private String originType = null;

  @SerializedName("PrivateBucketAccess")
  private Boolean privateBucketAccess = null;

  @SerializedName("PrivateBucketAuth")
  private PrivateBucketAuthForBatchUpdateCdnConfigInput privateBucketAuth = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Weight")
  private String weight = null;

  public ConvertOriginLineForBatchUpdateCdnConfigInput address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput bucketName(String bucketName) {
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

  public ConvertOriginLineForBatchUpdateCdnConfigInput httpPort(String httpPort) {
    this.httpPort = httpPort;
    return this;
  }

   /**
   * Get httpPort
   * @return httpPort
  **/
  @Schema(description = "")
  public String getHttpPort() {
    return httpPort;
  }

  public void setHttpPort(String httpPort) {
    this.httpPort = httpPort;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput httpsPort(String httpsPort) {
    this.httpsPort = httpsPort;
    return this;
  }

   /**
   * Get httpsPort
   * @return httpsPort
  **/
  @Schema(description = "")
  public String getHttpsPort() {
    return httpsPort;
  }

  public void setHttpsPort(String httpsPort) {
    this.httpsPort = httpsPort;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput originHost(String originHost) {
    this.originHost = originHost;
    return this;
  }

   /**
   * Get originHost
   * @return originHost
  **/
  @Schema(description = "")
  public String getOriginHost() {
    return originHost;
  }

  public void setOriginHost(String originHost) {
    this.originHost = originHost;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput originType(String originType) {
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @Schema(description = "")
  public String getOriginType() {
    return originType;
  }

  public void setOriginType(String originType) {
    this.originType = originType;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput privateBucketAccess(Boolean privateBucketAccess) {
    this.privateBucketAccess = privateBucketAccess;
    return this;
  }

   /**
   * Get privateBucketAccess
   * @return privateBucketAccess
  **/
  @Schema(description = "")
  public Boolean isPrivateBucketAccess() {
    return privateBucketAccess;
  }

  public void setPrivateBucketAccess(Boolean privateBucketAccess) {
    this.privateBucketAccess = privateBucketAccess;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput privateBucketAuth(PrivateBucketAuthForBatchUpdateCdnConfigInput privateBucketAuth) {
    this.privateBucketAuth = privateBucketAuth;
    return this;
  }

   /**
   * Get privateBucketAuth
   * @return privateBucketAuth
  **/
  @Valid
  @Schema(description = "")
  public PrivateBucketAuthForBatchUpdateCdnConfigInput getPrivateBucketAuth() {
    return privateBucketAuth;
  }

  public void setPrivateBucketAuth(PrivateBucketAuthForBatchUpdateCdnConfigInput privateBucketAuth) {
    this.privateBucketAuth = privateBucketAuth;
  }

  public ConvertOriginLineForBatchUpdateCdnConfigInput region(String region) {
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

  public ConvertOriginLineForBatchUpdateCdnConfigInput weight(String weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertOriginLineForBatchUpdateCdnConfigInput convertOriginLineForBatchUpdateCdnConfigInput = (ConvertOriginLineForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.address, convertOriginLineForBatchUpdateCdnConfigInput.address) &&
        Objects.equals(this.bucketName, convertOriginLineForBatchUpdateCdnConfigInput.bucketName) &&
        Objects.equals(this.httpPort, convertOriginLineForBatchUpdateCdnConfigInput.httpPort) &&
        Objects.equals(this.httpsPort, convertOriginLineForBatchUpdateCdnConfigInput.httpsPort) &&
        Objects.equals(this.instanceType, convertOriginLineForBatchUpdateCdnConfigInput.instanceType) &&
        Objects.equals(this.originHost, convertOriginLineForBatchUpdateCdnConfigInput.originHost) &&
        Objects.equals(this.originType, convertOriginLineForBatchUpdateCdnConfigInput.originType) &&
        Objects.equals(this.privateBucketAccess, convertOriginLineForBatchUpdateCdnConfigInput.privateBucketAccess) &&
        Objects.equals(this.privateBucketAuth, convertOriginLineForBatchUpdateCdnConfigInput.privateBucketAuth) &&
        Objects.equals(this.region, convertOriginLineForBatchUpdateCdnConfigInput.region) &&
        Objects.equals(this.weight, convertOriginLineForBatchUpdateCdnConfigInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bucketName, httpPort, httpsPort, instanceType, originHost, originType, privateBucketAccess, privateBucketAuth, region, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertOriginLineForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    originHost: ").append(toIndentedString(originHost)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    privateBucketAccess: ").append(toIndentedString(privateBucketAccess)).append("\n");
    sb.append("    privateBucketAuth: ").append(toIndentedString(privateBucketAuth)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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