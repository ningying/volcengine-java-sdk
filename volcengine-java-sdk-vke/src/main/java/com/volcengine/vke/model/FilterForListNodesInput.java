/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.StatusForListNodesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListNodesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-16T11:30:28.141424+08:00[Asia/Shanghai]")
public class FilterForListNodesInput {
  @SerializedName("ClusterIds")
  private List<String> clusterIds = null;

  @SerializedName("CreateClientToken")
  private String createClientToken = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NodePoolIds")
  private List<String> nodePoolIds = null;

  @SerializedName("Statuses")
  private List<StatusForListNodesInput> statuses = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public FilterForListNodesInput clusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
    return this;
  }

  public FilterForListNodesInput addClusterIdsItem(String clusterIdsItem) {
    if (this.clusterIds == null) {
      this.clusterIds = new ArrayList<String>();
    }
    this.clusterIds.add(clusterIdsItem);
    return this;
  }

   /**
   * Get clusterIds
   * @return clusterIds
  **/
  @Schema(description = "")
  public List<String> getClusterIds() {
    return clusterIds;
  }

  public void setClusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
  }

  public FilterForListNodesInput createClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
    return this;
  }

   /**
   * Get createClientToken
   * @return createClientToken
  **/
  @Schema(description = "")
  public String getCreateClientToken() {
    return createClientToken;
  }

  public void setCreateClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
  }

  public FilterForListNodesInput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FilterForListNodesInput addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public FilterForListNodesInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterForListNodesInput nodePoolIds(List<String> nodePoolIds) {
    this.nodePoolIds = nodePoolIds;
    return this;
  }

  public FilterForListNodesInput addNodePoolIdsItem(String nodePoolIdsItem) {
    if (this.nodePoolIds == null) {
      this.nodePoolIds = new ArrayList<String>();
    }
    this.nodePoolIds.add(nodePoolIdsItem);
    return this;
  }

   /**
   * Get nodePoolIds
   * @return nodePoolIds
  **/
  @Schema(description = "")
  public List<String> getNodePoolIds() {
    return nodePoolIds;
  }

  public void setNodePoolIds(List<String> nodePoolIds) {
    this.nodePoolIds = nodePoolIds;
  }

  public FilterForListNodesInput statuses(List<StatusForListNodesInput> statuses) {
    this.statuses = statuses;
    return this;
  }

  public FilterForListNodesInput addStatusesItem(StatusForListNodesInput statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusForListNodesInput>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @Valid
  @Schema(description = "")
  public List<StatusForListNodesInput> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusForListNodesInput> statuses) {
    this.statuses = statuses;
  }

  public FilterForListNodesInput zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public FilterForListNodesInput addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListNodesInput filterForListNodesInput = (FilterForListNodesInput) o;
    return Objects.equals(this.clusterIds, filterForListNodesInput.clusterIds) &&
        Objects.equals(this.createClientToken, filterForListNodesInput.createClientToken) &&
        Objects.equals(this.ids, filterForListNodesInput.ids) &&
        Objects.equals(this.name, filterForListNodesInput.name) &&
        Objects.equals(this.nodePoolIds, filterForListNodesInput.nodePoolIds) &&
        Objects.equals(this.statuses, filterForListNodesInput.statuses) &&
        Objects.equals(this.zoneIds, filterForListNodesInput.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIds, createClientToken, ids, name, nodePoolIds, statuses, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListNodesInput {\n");
    
    sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
    sb.append("    createClientToken: ").append(toIndentedString(createClientToken)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePoolIds: ").append(toIndentedString(nodePoolIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
