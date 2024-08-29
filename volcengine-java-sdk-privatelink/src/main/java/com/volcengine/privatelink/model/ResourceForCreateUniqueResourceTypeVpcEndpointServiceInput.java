/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput
 */



public class ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ResourceId")
  private String resourceId = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  public ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput addZoneIdsItem(String zoneIdsItem) {
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
    ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput resourceForCreateUniqueResourceTypeVpcEndpointServiceInput = (ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput) o;
    return Objects.equals(this.instanceId, resourceForCreateUniqueResourceTypeVpcEndpointServiceInput.instanceId) &&
        Objects.equals(this.resourceId, resourceForCreateUniqueResourceTypeVpcEndpointServiceInput.resourceId) &&
        Objects.equals(this.zoneIds, resourceForCreateUniqueResourceTypeVpcEndpointServiceInput.zoneIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, resourceId, zoneIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceForCreateUniqueResourceTypeVpcEndpointServiceInput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
