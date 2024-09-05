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
 * StickySessionConfigForCreateServerGroupInput
 */



public class StickySessionConfigForCreateServerGroupInput {
  @SerializedName("Cookie")
  private String cookie = null;

  @SerializedName("CookieTimeout")
  private String cookieTimeout = null;

  @SerializedName("StickySessionEnabled")
  private String stickySessionEnabled = null;

  @SerializedName("StickySessionType")
  private String stickySessionType = null;

  public StickySessionConfigForCreateServerGroupInput cookie(String cookie) {
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

  public StickySessionConfigForCreateServerGroupInput cookieTimeout(String cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
    return this;
  }

   /**
   * Get cookieTimeout
   * @return cookieTimeout
  **/
  @Schema(description = "")
  public String getCookieTimeout() {
    return cookieTimeout;
  }

  public void setCookieTimeout(String cookieTimeout) {
    this.cookieTimeout = cookieTimeout;
  }

  public StickySessionConfigForCreateServerGroupInput stickySessionEnabled(String stickySessionEnabled) {
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

  public StickySessionConfigForCreateServerGroupInput stickySessionType(String stickySessionType) {
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
    StickySessionConfigForCreateServerGroupInput stickySessionConfigForCreateServerGroupInput = (StickySessionConfigForCreateServerGroupInput) o;
    return Objects.equals(this.cookie, stickySessionConfigForCreateServerGroupInput.cookie) &&
        Objects.equals(this.cookieTimeout, stickySessionConfigForCreateServerGroupInput.cookieTimeout) &&
        Objects.equals(this.stickySessionEnabled, stickySessionConfigForCreateServerGroupInput.stickySessionEnabled) &&
        Objects.equals(this.stickySessionType, stickySessionConfigForCreateServerGroupInput.stickySessionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookie, cookieTimeout, stickySessionEnabled, stickySessionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StickySessionConfigForCreateServerGroupInput {\n");
    
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
