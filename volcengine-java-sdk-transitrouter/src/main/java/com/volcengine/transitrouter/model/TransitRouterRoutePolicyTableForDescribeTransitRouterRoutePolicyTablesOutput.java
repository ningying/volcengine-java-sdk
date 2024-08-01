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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput
 */



public class TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Direction")
  private String direction = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("TransitRouterRoutePolicyTableId")
  private String transitRouterRoutePolicyTableId = null;

  @SerializedName("TransitRouterRoutePolicyTableName")
  private String transitRouterRoutePolicyTableName = null;

  @SerializedName("TransitRouterRouteTableIds")
  private List<String> transitRouterRouteTableIds = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput description(String description) {
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

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @Schema(description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput transitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableId
   * @return transitRouterRoutePolicyTableId
  **/
  @Schema(description = "")
  public String getTransitRouterRoutePolicyTableId() {
    return transitRouterRoutePolicyTableId;
  }

  public void setTransitRouterRoutePolicyTableId(String transitRouterRoutePolicyTableId) {
    this.transitRouterRoutePolicyTableId = transitRouterRoutePolicyTableId;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput transitRouterRoutePolicyTableName(String transitRouterRoutePolicyTableName) {
    this.transitRouterRoutePolicyTableName = transitRouterRoutePolicyTableName;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableName
   * @return transitRouterRoutePolicyTableName
  **/
  @Schema(description = "")
  public String getTransitRouterRoutePolicyTableName() {
    return transitRouterRoutePolicyTableName;
  }

  public void setTransitRouterRoutePolicyTableName(String transitRouterRoutePolicyTableName) {
    this.transitRouterRoutePolicyTableName = transitRouterRoutePolicyTableName;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput transitRouterRouteTableIds(List<String> transitRouterRouteTableIds) {
    this.transitRouterRouteTableIds = transitRouterRouteTableIds;
    return this;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput addTransitRouterRouteTableIdsItem(String transitRouterRouteTableIdsItem) {
    if (this.transitRouterRouteTableIds == null) {
      this.transitRouterRouteTableIds = new ArrayList<String>();
    }
    this.transitRouterRouteTableIds.add(transitRouterRouteTableIdsItem);
    return this;
  }

   /**
   * Get transitRouterRouteTableIds
   * @return transitRouterRouteTableIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterRouteTableIds() {
    return transitRouterRouteTableIds;
  }

  public void setTransitRouterRouteTableIds(List<String> transitRouterRouteTableIds) {
    this.transitRouterRouteTableIds = transitRouterRouteTableIds;
  }

  public TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput = (TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput) o;
    return Objects.equals(this.creationTime, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.creationTime) &&
        Objects.equals(this.description, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.description) &&
        Objects.equals(this.direction, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.direction) &&
        Objects.equals(this.status, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.status) &&
        Objects.equals(this.transitRouterId, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.transitRouterId) &&
        Objects.equals(this.transitRouterRoutePolicyTableId, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.transitRouterRoutePolicyTableId) &&
        Objects.equals(this.transitRouterRoutePolicyTableName, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.transitRouterRoutePolicyTableName) &&
        Objects.equals(this.transitRouterRouteTableIds, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.transitRouterRouteTableIds) &&
        Objects.equals(this.updateTime, transitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, direction, status, transitRouterId, transitRouterRoutePolicyTableId, transitRouterRoutePolicyTableName, transitRouterRouteTableIds, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterRoutePolicyTableForDescribeTransitRouterRoutePolicyTablesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    transitRouterRoutePolicyTableId: ").append(toIndentedString(transitRouterRoutePolicyTableId)).append("\n");
    sb.append("    transitRouterRoutePolicyTableName: ").append(toIndentedString(transitRouterRoutePolicyTableName)).append("\n");
    sb.append("    transitRouterRouteTableIds: ").append(toIndentedString(transitRouterRouteTableIds)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
