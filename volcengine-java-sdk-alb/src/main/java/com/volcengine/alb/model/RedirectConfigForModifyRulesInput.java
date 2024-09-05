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
 * RedirectConfigForModifyRulesInput
 */



public class RedirectConfigForModifyRulesInput {
  @SerializedName("RedirectDomain")
  private String redirectDomain = null;

  @SerializedName("RedirectHttpCode")
  private String redirectHttpCode = null;

  @SerializedName("RedirectPort")
  private String redirectPort = null;

  @SerializedName("RedirectProtocol")
  private String redirectProtocol = null;

  @SerializedName("RedirectUri")
  private String redirectUri = null;

  public RedirectConfigForModifyRulesInput redirectDomain(String redirectDomain) {
    this.redirectDomain = redirectDomain;
    return this;
  }

   /**
   * Get redirectDomain
   * @return redirectDomain
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getRedirectDomain() {
    return redirectDomain;
  }

  public void setRedirectDomain(String redirectDomain) {
    this.redirectDomain = redirectDomain;
  }

  public RedirectConfigForModifyRulesInput redirectHttpCode(String redirectHttpCode) {
    this.redirectHttpCode = redirectHttpCode;
    return this;
  }

   /**
   * Get redirectHttpCode
   * @return redirectHttpCode
  **/
  @Schema(description = "")
  public String getRedirectHttpCode() {
    return redirectHttpCode;
  }

  public void setRedirectHttpCode(String redirectHttpCode) {
    this.redirectHttpCode = redirectHttpCode;
  }

  public RedirectConfigForModifyRulesInput redirectPort(String redirectPort) {
    this.redirectPort = redirectPort;
    return this;
  }

   /**
   * Get redirectPort
   * @return redirectPort
  **/
  @Schema(description = "")
  public String getRedirectPort() {
    return redirectPort;
  }

  public void setRedirectPort(String redirectPort) {
    this.redirectPort = redirectPort;
  }

  public RedirectConfigForModifyRulesInput redirectProtocol(String redirectProtocol) {
    this.redirectProtocol = redirectProtocol;
    return this;
  }

   /**
   * Get redirectProtocol
   * @return redirectProtocol
  **/
  @Schema(description = "")
  public String getRedirectProtocol() {
    return redirectProtocol;
  }

  public void setRedirectProtocol(String redirectProtocol) {
    this.redirectProtocol = redirectProtocol;
  }

  public RedirectConfigForModifyRulesInput redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectConfigForModifyRulesInput redirectConfigForModifyRulesInput = (RedirectConfigForModifyRulesInput) o;
    return Objects.equals(this.redirectDomain, redirectConfigForModifyRulesInput.redirectDomain) &&
        Objects.equals(this.redirectHttpCode, redirectConfigForModifyRulesInput.redirectHttpCode) &&
        Objects.equals(this.redirectPort, redirectConfigForModifyRulesInput.redirectPort) &&
        Objects.equals(this.redirectProtocol, redirectConfigForModifyRulesInput.redirectProtocol) &&
        Objects.equals(this.redirectUri, redirectConfigForModifyRulesInput.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectDomain, redirectHttpCode, redirectPort, redirectProtocol, redirectUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectConfigForModifyRulesInput {\n");
    
    sb.append("    redirectDomain: ").append(toIndentedString(redirectDomain)).append("\n");
    sb.append("    redirectHttpCode: ").append(toIndentedString(redirectHttpCode)).append("\n");
    sb.append("    redirectPort: ").append(toIndentedString(redirectPort)).append("\n");
    sb.append("    redirectProtocol: ").append(toIndentedString(redirectProtocol)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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
