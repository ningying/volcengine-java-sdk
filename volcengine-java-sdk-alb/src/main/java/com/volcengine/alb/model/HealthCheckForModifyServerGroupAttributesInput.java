/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * HealthCheckForModifyServerGroupAttributesInput
 */



public class HealthCheckForModifyServerGroupAttributesInput {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("HealthyThreshold")
  private String healthyThreshold = null;

  @SerializedName("HttpCode")
  private String httpCode = null;

  @SerializedName("HttpVersion")
  private String httpVersion = null;

  @SerializedName("Interval")
  private String interval = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("Timeout")
  private String timeout = null;

  @SerializedName("URI")
  private String URI = null;

  @SerializedName("UnhealthyThreshold")
  private String unhealthyThreshold = null;

  public HealthCheckForModifyServerGroupAttributesInput domain(String domain) {
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

  public HealthCheckForModifyServerGroupAttributesInput enabled(String enabled) {
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

  public HealthCheckForModifyServerGroupAttributesInput healthyThreshold(String healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

   /**
   * Get healthyThreshold
   * @return healthyThreshold
  **/
  @Schema(description = "")
  public String getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(String healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }

  public HealthCheckForModifyServerGroupAttributesInput httpCode(String httpCode) {
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

  public HealthCheckForModifyServerGroupAttributesInput httpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * Get httpVersion
   * @return httpVersion
  **/
  @Schema(description = "")
  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
  }

  public HealthCheckForModifyServerGroupAttributesInput interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public HealthCheckForModifyServerGroupAttributesInput method(String method) {
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

  public HealthCheckForModifyServerGroupAttributesInput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public HealthCheckForModifyServerGroupAttributesInput timeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }

  public HealthCheckForModifyServerGroupAttributesInput URI(String URI) {
    this.URI = URI;
    return this;
  }

   /**
   * Get URI
   * @return URI
  **/
  @Schema(description = "")
  public String getURI() {
    return URI;
  }

  public void setURI(String URI) {
    this.URI = URI;
  }

  public HealthCheckForModifyServerGroupAttributesInput unhealthyThreshold(String unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
    return this;
  }

   /**
   * Get unhealthyThreshold
   * @return unhealthyThreshold
  **/
  @Schema(description = "")
  public String getUnhealthyThreshold() {
    return unhealthyThreshold;
  }

  public void setUnhealthyThreshold(String unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckForModifyServerGroupAttributesInput healthCheckForModifyServerGroupAttributesInput = (HealthCheckForModifyServerGroupAttributesInput) o;
    return Objects.equals(this.domain, healthCheckForModifyServerGroupAttributesInput.domain) &&
        Objects.equals(this.enabled, healthCheckForModifyServerGroupAttributesInput.enabled) &&
        Objects.equals(this.healthyThreshold, healthCheckForModifyServerGroupAttributesInput.healthyThreshold) &&
        Objects.equals(this.httpCode, healthCheckForModifyServerGroupAttributesInput.httpCode) &&
        Objects.equals(this.httpVersion, healthCheckForModifyServerGroupAttributesInput.httpVersion) &&
        Objects.equals(this.interval, healthCheckForModifyServerGroupAttributesInput.interval) &&
        Objects.equals(this.method, healthCheckForModifyServerGroupAttributesInput.method) &&
        Objects.equals(this.protocol, healthCheckForModifyServerGroupAttributesInput.protocol) &&
        Objects.equals(this.timeout, healthCheckForModifyServerGroupAttributesInput.timeout) &&
        Objects.equals(this.URI, healthCheckForModifyServerGroupAttributesInput.URI) &&
        Objects.equals(this.unhealthyThreshold, healthCheckForModifyServerGroupAttributesInput.unhealthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, enabled, healthyThreshold, httpCode, httpVersion, interval, method, protocol, timeout, URI, unhealthyThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckForModifyServerGroupAttributesInput {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    URI: ").append(toIndentedString(URI)).append("\n");
    sb.append("    unhealthyThreshold: ").append(toIndentedString(unhealthyThreshold)).append("\n");
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
