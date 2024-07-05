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
 * CreateTransitRouterRouteEntryRequest
 */



public class CreateTransitRouterRouteEntryRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("TransitRouterRouteEntryName")
  private String transitRouterRouteEntryName = null;

  @SerializedName("TransitRouterRouteEntryNextHopId")
  private String transitRouterRouteEntryNextHopId = null;

  @SerializedName("TransitRouterRouteEntryNextHopType")
  private String transitRouterRouteEntryNextHopType = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  public CreateTransitRouterRouteEntryRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTransitRouterRouteEntryRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public CreateTransitRouterRouteEntryRequest transitRouterRouteEntryName(String transitRouterRouteEntryName) {
    this.transitRouterRouteEntryName = transitRouterRouteEntryName;
    return this;
  }

   /**
   * Get transitRouterRouteEntryName
   * @return transitRouterRouteEntryName
  **/
  @Schema(description = "")
  public String getTransitRouterRouteEntryName() {
    return transitRouterRouteEntryName;
  }

  public void setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
    this.transitRouterRouteEntryName = transitRouterRouteEntryName;
  }

  public CreateTransitRouterRouteEntryRequest transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
    this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
    return this;
  }

   /**
   * Get transitRouterRouteEntryNextHopId
   * @return transitRouterRouteEntryNextHopId
  **/
  @Schema(description = "")
  public String getTransitRouterRouteEntryNextHopId() {
    return transitRouterRouteEntryNextHopId;
  }

  public void setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
    this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
  }

  public CreateTransitRouterRouteEntryRequest transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
    this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
    return this;
  }

   /**
   * Get transitRouterRouteEntryNextHopType
   * @return transitRouterRouteEntryNextHopType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterRouteEntryNextHopType() {
    return transitRouterRouteEntryNextHopType;
  }

  public void setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
    this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
  }

  public CreateTransitRouterRouteEntryRequest transitRouterRouteTableId(String transitRouterRouteTableId) {
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
    CreateTransitRouterRouteEntryRequest createTransitRouterRouteEntryRequest = (CreateTransitRouterRouteEntryRequest) o;
    return Objects.equals(this.description, createTransitRouterRouteEntryRequest.description) &&
        Objects.equals(this.destinationCidrBlock, createTransitRouterRouteEntryRequest.destinationCidrBlock) &&
        Objects.equals(this.transitRouterRouteEntryName, createTransitRouterRouteEntryRequest.transitRouterRouteEntryName) &&
        Objects.equals(this.transitRouterRouteEntryNextHopId, createTransitRouterRouteEntryRequest.transitRouterRouteEntryNextHopId) &&
        Objects.equals(this.transitRouterRouteEntryNextHopType, createTransitRouterRouteEntryRequest.transitRouterRouteEntryNextHopType) &&
        Objects.equals(this.transitRouterRouteTableId, createTransitRouterRouteEntryRequest.transitRouterRouteTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destinationCidrBlock, transitRouterRouteEntryName, transitRouterRouteEntryNextHopId, transitRouterRouteEntryNextHopType, transitRouterRouteTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterRouteEntryRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    transitRouterRouteEntryName: ").append(toIndentedString(transitRouterRouteEntryName)).append("\n");
    sb.append("    transitRouterRouteEntryNextHopId: ").append(toIndentedString(transitRouterRouteEntryNextHopId)).append("\n");
    sb.append("    transitRouterRouteEntryNextHopType: ").append(toIndentedString(transitRouterRouteEntryNextHopType)).append("\n");
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
