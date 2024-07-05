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
 * TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput
 */



public class TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterForwardPolicyTableId")
  private String transitRouterForwardPolicyTableId = null;

  @SerializedName("TransitRouterForwardPolicyTableName")
  private String transitRouterForwardPolicyTableName = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput creationTime(String creationTime) {
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

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput description(String description) {
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

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput status(String status) {
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

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput transitRouterForwardPolicyTableId(String transitRouterForwardPolicyTableId) {
    this.transitRouterForwardPolicyTableId = transitRouterForwardPolicyTableId;
    return this;
  }

   /**
   * Get transitRouterForwardPolicyTableId
   * @return transitRouterForwardPolicyTableId
  **/
  @Schema(description = "")
  public String getTransitRouterForwardPolicyTableId() {
    return transitRouterForwardPolicyTableId;
  }

  public void setTransitRouterForwardPolicyTableId(String transitRouterForwardPolicyTableId) {
    this.transitRouterForwardPolicyTableId = transitRouterForwardPolicyTableId;
  }

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput transitRouterForwardPolicyTableName(String transitRouterForwardPolicyTableName) {
    this.transitRouterForwardPolicyTableName = transitRouterForwardPolicyTableName;
    return this;
  }

   /**
   * Get transitRouterForwardPolicyTableName
   * @return transitRouterForwardPolicyTableName
  **/
  @Schema(description = "")
  public String getTransitRouterForwardPolicyTableName() {
    return transitRouterForwardPolicyTableName;
  }

  public void setTransitRouterForwardPolicyTableName(String transitRouterForwardPolicyTableName) {
    this.transitRouterForwardPolicyTableName = transitRouterForwardPolicyTableName;
  }

  public TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput updateTime(String updateTime) {
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
    TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput = (TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput) o;
    return Objects.equals(this.creationTime, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.creationTime) &&
        Objects.equals(this.description, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.description) &&
        Objects.equals(this.status, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.status) &&
        Objects.equals(this.transitRouterForwardPolicyTableId, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.transitRouterForwardPolicyTableId) &&
        Objects.equals(this.transitRouterForwardPolicyTableName, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.transitRouterForwardPolicyTableName) &&
        Objects.equals(this.updateTime, transitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, status, transitRouterForwardPolicyTableId, transitRouterForwardPolicyTableName, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterForwardPolicyTableForDescribeTransitRouterForwardPolicyTablesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterForwardPolicyTableId: ").append(toIndentedString(transitRouterForwardPolicyTableId)).append("\n");
    sb.append("    transitRouterForwardPolicyTableName: ").append(toIndentedString(transitRouterForwardPolicyTableName)).append("\n");
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
