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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HstsForAddCdnDomainInput
 */



public class HstsForAddCdnDomainInput {
  @SerializedName("Subdomain")
  private String subdomain = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  @SerializedName("Ttl")
  private Long ttl = null;

  public HstsForAddCdnDomainInput subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

   /**
   * Get subdomain
   * @return subdomain
  **/
  @Schema(description = "")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public HstsForAddCdnDomainInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }

  public HstsForAddCdnDomainInput ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @Schema(description = "")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HstsForAddCdnDomainInput hstsForAddCdnDomainInput = (HstsForAddCdnDomainInput) o;
    return Objects.equals(this.subdomain, hstsForAddCdnDomainInput.subdomain) &&
        Objects.equals(this._switch, hstsForAddCdnDomainInput._switch) &&
        Objects.equals(this.ttl, hstsForAddCdnDomainInput.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subdomain, _switch, ttl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HstsForAddCdnDomainInput {\n");
    
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
