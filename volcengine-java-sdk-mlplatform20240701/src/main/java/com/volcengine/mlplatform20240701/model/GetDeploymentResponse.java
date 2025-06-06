/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.ConvertStatusForGetDeploymentOutput;
import com.volcengine.mlplatform20240701.model.HistoryVersionForGetDeploymentOutput;
import com.volcengine.mlplatform20240701.model.InstanceItemForGetDeploymentOutput;
import com.volcengine.mlplatform20240701.model.RoleForGetDeploymentOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetDeploymentResponse
 */



public class GetDeploymentResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HistoryVersions")
  private List<HistoryVersionForGetDeploymentOutput> historyVersions = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InstanceItems")
  private List<InstanceItemForGetDeploymentOutput> instanceItems = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("ResourceQueueId")
  private String resourceQueueId = null;

  @SerializedName("Roles")
  private List<RoleForGetDeploymentOutput> roles = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("Status")
  private ConvertStatusForGetDeploymentOutput status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public GetDeploymentResponse createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public GetDeploymentResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetDeploymentResponse description(String description) {
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

  public GetDeploymentResponse historyVersions(List<HistoryVersionForGetDeploymentOutput> historyVersions) {
    this.historyVersions = historyVersions;
    return this;
  }

  public GetDeploymentResponse addHistoryVersionsItem(HistoryVersionForGetDeploymentOutput historyVersionsItem) {
    if (this.historyVersions == null) {
      this.historyVersions = new ArrayList<HistoryVersionForGetDeploymentOutput>();
    }
    this.historyVersions.add(historyVersionsItem);
    return this;
  }

   /**
   * Get historyVersions
   * @return historyVersions
  **/
  @Valid
  @Schema(description = "")
  public List<HistoryVersionForGetDeploymentOutput> getHistoryVersions() {
    return historyVersions;
  }

  public void setHistoryVersions(List<HistoryVersionForGetDeploymentOutput> historyVersions) {
    this.historyVersions = historyVersions;
  }

  public GetDeploymentResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetDeploymentResponse instanceItems(List<InstanceItemForGetDeploymentOutput> instanceItems) {
    this.instanceItems = instanceItems;
    return this;
  }

  public GetDeploymentResponse addInstanceItemsItem(InstanceItemForGetDeploymentOutput instanceItemsItem) {
    if (this.instanceItems == null) {
      this.instanceItems = new ArrayList<InstanceItemForGetDeploymentOutput>();
    }
    this.instanceItems.add(instanceItemsItem);
    return this;
  }

   /**
   * Get instanceItems
   * @return instanceItems
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceItemForGetDeploymentOutput> getInstanceItems() {
    return instanceItems;
  }

  public void setInstanceItems(List<InstanceItemForGetDeploymentOutput> instanceItems) {
    this.instanceItems = instanceItems;
  }

  public GetDeploymentResponse name(String name) {
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

  public GetDeploymentResponse priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public GetDeploymentResponse resourceQueueId(String resourceQueueId) {
    this.resourceQueueId = resourceQueueId;
    return this;
  }

   /**
   * Get resourceQueueId
   * @return resourceQueueId
  **/
  @Schema(description = "")
  public String getResourceQueueId() {
    return resourceQueueId;
  }

  public void setResourceQueueId(String resourceQueueId) {
    this.resourceQueueId = resourceQueueId;
  }

  public GetDeploymentResponse roles(List<RoleForGetDeploymentOutput> roles) {
    this.roles = roles;
    return this;
  }

  public GetDeploymentResponse addRolesItem(RoleForGetDeploymentOutput rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleForGetDeploymentOutput>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Valid
  @Schema(description = "")
  public List<RoleForGetDeploymentOutput> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleForGetDeploymentOutput> roles) {
    this.roles = roles;
  }

  public GetDeploymentResponse serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public GetDeploymentResponse status(ConvertStatusForGetDeploymentOutput status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @Schema(description = "")
  public ConvertStatusForGetDeploymentOutput getStatus() {
    return status;
  }

  public void setStatus(ConvertStatusForGetDeploymentOutput status) {
    this.status = status;
  }

  public GetDeploymentResponse updateTime(String updateTime) {
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
    GetDeploymentResponse getDeploymentResponse = (GetDeploymentResponse) o;
    return Objects.equals(this.createTime, getDeploymentResponse.createTime) &&
        Objects.equals(this.createdBy, getDeploymentResponse.createdBy) &&
        Objects.equals(this.description, getDeploymentResponse.description) &&
        Objects.equals(this.historyVersions, getDeploymentResponse.historyVersions) &&
        Objects.equals(this.id, getDeploymentResponse.id) &&
        Objects.equals(this.instanceItems, getDeploymentResponse.instanceItems) &&
        Objects.equals(this.name, getDeploymentResponse.name) &&
        Objects.equals(this.priority, getDeploymentResponse.priority) &&
        Objects.equals(this.resourceQueueId, getDeploymentResponse.resourceQueueId) &&
        Objects.equals(this.roles, getDeploymentResponse.roles) &&
        Objects.equals(this.serviceId, getDeploymentResponse.serviceId) &&
        Objects.equals(this.status, getDeploymentResponse.status) &&
        Objects.equals(this.updateTime, getDeploymentResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, createdBy, description, historyVersions, id, instanceItems, name, priority, resourceQueueId, roles, serviceId, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeploymentResponse {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    historyVersions: ").append(toIndentedString(historyVersions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceItems: ").append(toIndentedString(instanceItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    resourceQueueId: ").append(toIndentedString(resourceQueueId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
