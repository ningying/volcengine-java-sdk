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
 * StickySessionConfigForDescribeServerGroupsOutput
 */



public class StickySessionConfigForDescribeServerGroupsOutput {
  @SerializedName("Cookie")
  private String cookie = null;

  @SerializedName("CookieTimeout")
  private Integer cookieTimeout = null;

  @SerializedName("StickySessionEnabled")
  private String stickySessionEnabled = null;

  @SerializedName("StickySessionType")
  private String stickySessionType = null;

  public StickySessionConfigForDescribeServerGroupsOutput cookie(String cookie) {
    this.cookie = cookie;
    return this;
  }

   /**
   * Get cookie
   * @return cookie
  **/
  @Schema(description = "")
  public String getCookie() {
    return cookie;
  }

  public void setCookie(String cookie) {
    this.cookie = cookie;
  }

  public StickySessionConfigForDescribeServerGroupsOutput cookieTimeout(Integer cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
    return this;
  }

   /**
   * Get cookieTimeout
   * @return cookieTimeout
  **/
  @Schema(description = "")
  public Integer getCookieTimeout() {
    return cookieTimeout;
  }

  public void setCookieTimeout(Integer cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  public StickySessionConfigForDescribeServerGroupsOutput stickySessionEnabled(String stickySessionEnabled) {
    this.stickySessionEnabled = stickySessionEnabled;
    return this;
  }

   /**
   * Get stickySessionEnabled
   * @return stickySessionEnabled
  **/
  @Schema(description = "")
  public String getStickySessionEnabled() {
    return stickySessionEnabled;
  }

  public void setStickySessionEnabled(String stickySessionEnabled) {
    this.stickySessionEnabled = stickySessionEnabled;
  }

  public StickySessionConfigForDescribeServerGroupsOutput stickySessionType(String stickySessionType) {
    this.stickySessionType = stickySessionType;
    return this;
  }

   /**
   * Get stickySessionType
   * @return stickySessionType
  **/
  @Schema(description = "")
  public String getStickySessionType() {
    return stickySessionType;
  }

  public void setStickySessionType(String stickySessionType) {
    this.stickySessionType = stickySessionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StickySessionConfigForDescribeServerGroupsOutput stickySessionConfigForDescribeServerGroupsOutput = (StickySessionConfigForDescribeServerGroupsOutput) o;
    return Objects.equals(this.cookie, stickySessionConfigForDescribeServerGroupsOutput.cookie) &&
        Objects.equals(this.cookieTimeout, stickySessionConfigForDescribeServerGroupsOutput.cookieTimeout) &&
        Objects.equals(this.stickySessionEnabled, stickySessionConfigForDescribeServerGroupsOutput.stickySessionEnabled) &&
        Objects.equals(this.stickySessionType, stickySessionConfigForDescribeServerGroupsOutput.stickySessionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookie, cookieTimeout, stickySessionEnabled, stickySessionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StickySessionConfigForDescribeServerGroupsOutput {\n");
    
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
    sb.append("    stickySessionEnabled: ").append(toIndentedString(stickySessionEnabled)).append("\n");
    sb.append("    stickySessionType: ").append(toIndentedString(stickySessionType)).append("\n");
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
