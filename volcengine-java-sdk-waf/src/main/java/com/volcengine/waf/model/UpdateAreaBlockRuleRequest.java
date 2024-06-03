/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateAreaBlockRuleRequest
 */



public class UpdateAreaBlockRuleRequest {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("Country")
  private List<String> country = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("SubRegion")
  private List<String> subRegion = null;

  public UpdateAreaBlockRuleRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public UpdateAreaBlockRuleRequest country(List<String> country) {
    this.country = country;
    return this;
  }

  public UpdateAreaBlockRuleRequest addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<String>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public List<String> getCountry() {
    return country;
  }

  public void setCountry(List<String> country) {
    this.country = country;
  }

  public UpdateAreaBlockRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public UpdateAreaBlockRuleRequest subRegion(List<String> subRegion) {
    this.subRegion = subRegion;
    return this;
  }

  public UpdateAreaBlockRuleRequest addSubRegionItem(String subRegionItem) {
    if (this.subRegion == null) {
      this.subRegion = new ArrayList<String>();
    }
    this.subRegion.add(subRegionItem);
    return this;
  }

   /**
   * Get subRegion
   * @return subRegion
  **/
  @Schema(description = "")
  public List<String> getSubRegion() {
    return subRegion;
  }

  public void setSubRegion(List<String> subRegion) {
    this.subRegion = subRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAreaBlockRuleRequest updateAreaBlockRuleRequest = (UpdateAreaBlockRuleRequest) o;
    return Objects.equals(this.action, updateAreaBlockRuleRequest.action) &&
        Objects.equals(this.country, updateAreaBlockRuleRequest.country) &&
        Objects.equals(this.host, updateAreaBlockRuleRequest.host) &&
        Objects.equals(this.subRegion, updateAreaBlockRuleRequest.subRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, country, host, subRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAreaBlockRuleRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
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