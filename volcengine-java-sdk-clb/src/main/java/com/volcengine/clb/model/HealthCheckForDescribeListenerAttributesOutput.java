/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * HealthCheckForDescribeListenerAttributesOutput
 */



public class HealthCheckForDescribeListenerAttributesOutput {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  @SerializedName("HttpCode")
  private String httpCode = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("UdpExpect")
  private String udpExpect = null;

  @SerializedName("UdpRequest")
  private String udpRequest = null;

  @SerializedName("UnHealthyThreshold")
  private Integer unHealthyThreshold = null;

  @SerializedName("Uri")
  private String uri = null;

  public HealthCheckForDescribeListenerAttributesOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public HealthCheckForDescribeListenerAttributesOutput enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public HealthCheckForDescribeListenerAttributesOutput healthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

   /**
   * Get healthyThreshold
   * @return healthyThreshold
  **/
  @Schema(description = "")
  public Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }

  public HealthCheckForDescribeListenerAttributesOutput httpCode(String httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @Schema(description = "")
  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public HealthCheckForDescribeListenerAttributesOutput interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthCheckForDescribeListenerAttributesOutput method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public HealthCheckForDescribeListenerAttributesOutput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HealthCheckForDescribeListenerAttributesOutput udpExpect(String udpExpect) {
    this.udpExpect = udpExpect;
    return this;
  }

   /**
   * Get udpExpect
   * @return udpExpect
  **/
  @Schema(description = "")
  public String getUdpExpect() {
    return udpExpect;
  }

  public void setUdpExpect(String udpExpect) {
    this.udpExpect = udpExpect;
  }

  public HealthCheckForDescribeListenerAttributesOutput udpRequest(String udpRequest) {
    this.udpRequest = udpRequest;
    return this;
  }

   /**
   * Get udpRequest
   * @return udpRequest
  **/
  @Schema(description = "")
  public String getUdpRequest() {
    return udpRequest;
  }

  public void setUdpRequest(String udpRequest) {
    this.udpRequest = udpRequest;
  }

  public HealthCheckForDescribeListenerAttributesOutput unHealthyThreshold(Integer unHealthyThreshold) {
    this.unHealthyThreshold = unHealthyThreshold;
    return this;
  }

   /**
   * Get unHealthyThreshold
   * @return unHealthyThreshold
  **/
  @Schema(description = "")
  public Integer getUnHealthyThreshold() {
    return unHealthyThreshold;
  }

  public void setUnHealthyThreshold(Integer unHealthyThreshold) {
    this.unHealthyThreshold = unHealthyThreshold;
  }

  public HealthCheckForDescribeListenerAttributesOutput uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckForDescribeListenerAttributesOutput healthCheckForDescribeListenerAttributesOutput = (HealthCheckForDescribeListenerAttributesOutput) o;
    return Objects.equals(this.domain, healthCheckForDescribeListenerAttributesOutput.domain) &&
        Objects.equals(this.enabled, healthCheckForDescribeListenerAttributesOutput.enabled) &&
        Objects.equals(this.healthyThreshold, healthCheckForDescribeListenerAttributesOutput.healthyThreshold) &&
        Objects.equals(this.httpCode, healthCheckForDescribeListenerAttributesOutput.httpCode) &&
        Objects.equals(this.interval, healthCheckForDescribeListenerAttributesOutput.interval) &&
        Objects.equals(this.method, healthCheckForDescribeListenerAttributesOutput.method) &&
        Objects.equals(this.timeout, healthCheckForDescribeListenerAttributesOutput.timeout) &&
        Objects.equals(this.udpExpect, healthCheckForDescribeListenerAttributesOutput.udpExpect) &&
        Objects.equals(this.udpRequest, healthCheckForDescribeListenerAttributesOutput.udpRequest) &&
        Objects.equals(this.unHealthyThreshold, healthCheckForDescribeListenerAttributesOutput.unHealthyThreshold) &&
        Objects.equals(this.uri, healthCheckForDescribeListenerAttributesOutput.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, enabled, healthyThreshold, httpCode, interval, method, timeout, udpExpect, udpRequest, unHealthyThreshold, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckForDescribeListenerAttributesOutput {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    udpExpect: ").append(toIndentedString(udpExpect)).append("\n");
    sb.append("    udpRequest: ").append(toIndentedString(udpRequest)).append("\n");
    sb.append("    unHealthyThreshold: ").append(toIndentedString(unHealthyThreshold)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
