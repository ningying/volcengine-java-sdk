/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * NodeInfoForRestoreToCrossRegionInstanceInput
 */


public class NodeInfoForRestoreToCrossRegionInstanceInput {
  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("NodeOperateType")
  private String nodeOperateType = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("NodeType")
  private String nodeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public NodeInfoForRestoreToCrossRegionInstanceInput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeInfoForRestoreToCrossRegionInstanceInput nodeOperateType(String nodeOperateType) {
    this.nodeOperateType = nodeOperateType;
    return this;
  }

   /**
   * Get nodeOperateType
   * @return nodeOperateType
  **/
  @Schema(description = "")
  public String getNodeOperateType() {
    return nodeOperateType;
  }

  public void setNodeOperateType(String nodeOperateType) {
    this.nodeOperateType = nodeOperateType;
  }

  public NodeInfoForRestoreToCrossRegionInstanceInput nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public NodeInfoForRestoreToCrossRegionInstanceInput nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeInfoForRestoreToCrossRegionInstanceInput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoForRestoreToCrossRegionInstanceInput nodeInfoForRestoreToCrossRegionInstanceInput = (NodeInfoForRestoreToCrossRegionInstanceInput) o;
    return Objects.equals(this.nodeId, nodeInfoForRestoreToCrossRegionInstanceInput.nodeId) &&
        Objects.equals(this.nodeOperateType, nodeInfoForRestoreToCrossRegionInstanceInput.nodeOperateType) &&
        Objects.equals(this.nodeSpec, nodeInfoForRestoreToCrossRegionInstanceInput.nodeSpec) &&
        Objects.equals(this.nodeType, nodeInfoForRestoreToCrossRegionInstanceInput.nodeType) &&
        Objects.equals(this.zoneId, nodeInfoForRestoreToCrossRegionInstanceInput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, nodeOperateType, nodeSpec, nodeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoForRestoreToCrossRegionInstanceInput {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeOperateType: ").append(toIndentedString(nodeOperateType)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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