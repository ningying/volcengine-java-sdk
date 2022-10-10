/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * CreateRouteEntryRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T13:58:53.827648+08:00[Asia/Shanghai]")
public class CreateRouteEntryRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("NextHopType")
  private String nextHopType = null;

  @SerializedName("RouteEntryName")
  private String routeEntryName = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  public CreateRouteEntryRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateRouteEntryRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRouteEntryRequest destinationCidrBlock(String destinationCidrBlock) {
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

  public CreateRouteEntryRequest nextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
    return this;
  }

   /**
   * Get nextHopId
   * @return nextHopId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNextHopId() {
    return nextHopId;
  }

  public void setNextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
  }

  public CreateRouteEntryRequest nextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
    return this;
  }

   /**
   * Get nextHopType
   * @return nextHopType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNextHopType() {
    return nextHopType;
  }

  public void setNextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
  }

  public CreateRouteEntryRequest routeEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
    return this;
  }

   /**
   * Get routeEntryName
   * @return routeEntryName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getRouteEntryName() {
    return routeEntryName;
  }

  public void setRouteEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
  }

  public CreateRouteEntryRequest routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRouteEntryRequest createRouteEntryRequest = (CreateRouteEntryRequest) o;
    return Objects.equals(this.clientToken, createRouteEntryRequest.clientToken) &&
        Objects.equals(this.description, createRouteEntryRequest.description) &&
        Objects.equals(this.destinationCidrBlock, createRouteEntryRequest.destinationCidrBlock) &&
        Objects.equals(this.nextHopId, createRouteEntryRequest.nextHopId) &&
        Objects.equals(this.nextHopType, createRouteEntryRequest.nextHopType) &&
        Objects.equals(this.routeEntryName, createRouteEntryRequest.routeEntryName) &&
        Objects.equals(this.routeTableId, createRouteEntryRequest.routeTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, destinationCidrBlock, nextHopId, nextHopType, routeEntryName, routeTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRouteEntryRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
    sb.append("    routeEntryName: ").append(toIndentedString(routeEntryName)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
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
