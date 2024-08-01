/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * DissociateTransitRouterRoutePolicyFromRouteTableRequest
 */



public class DissociateTransitRouterRoutePolicyFromRouteTableRequest {
  @SerializedName("TransitRouterRoutePolicyTableId")
  private String transitRouterRoutePolicyTableId = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  public DissociateTransitRouterRoutePolicyFromRouteTableRequest transitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableId
   * @return transitRouterRoutePolicyTableId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterRoutePolicyTableId() {
    return transitRouterRoutePolicyTableId;
  }

  public void setTransitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
  }

  public DissociateTransitRouterRoutePolicyFromRouteTableRequest transitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
    return this;
  }

   /**
   * Get transitRouterRouteTableId
   * @return transitRouterRouteTableId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterRouteTableId() {
    return transitRouterRouteTableId;
  }

  public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DissociateTransitRouterRoutePolicyFromRouteTableRequest dissociateTransitRouterRoutePolicyFromRouteTableRequest = (DissociateTransitRouterRoutePolicyFromRouteTableRequest) o;
    return Objects.equals(this.transitRouterRoutePolicyTableId, dissociateTransitRouterRoutePolicyFromRouteTableRequest.transitRouterRoutePolicyTableId) &&
        Objects.equals(this.transitRouterRouteTableId, dissociateTransitRouterRoutePolicyFromRouteTableRequest.transitRouterRouteTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transitRouterRoutePolicyTableId, transitRouterRouteTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DissociateTransitRouterRoutePolicyFromRouteTableRequest {\n");
    
    sb.append("    transitRouterRoutePolicyTableId: ").append(toIndentedString(transitRouterRoutePolicyTableId)).append("\n");
    sb.append("    transitRouterRouteTableId: ").append(toIndentedString(transitRouterRouteTableId)).append("\n");
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
