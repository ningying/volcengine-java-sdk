/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.AvailableResourceForDescribeAvailableResourceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AvailableZoneForDescribeAvailableResourceOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:35.752778+08:00[Asia/Shanghai]")
public class AvailableZoneForDescribeAvailableResourceOutput {
  @SerializedName("AvailableResources")
  private List<AvailableResourceForDescribeAvailableResourceOutput> availableResources = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public AvailableZoneForDescribeAvailableResourceOutput availableResources(List<AvailableResourceForDescribeAvailableResourceOutput> availableResources) {
    this.availableResources = availableResources;
    return this;
  }

  public AvailableZoneForDescribeAvailableResourceOutput addAvailableResourcesItem(AvailableResourceForDescribeAvailableResourceOutput availableResourcesItem) {
    if (this.availableResources == null) {
      this.availableResources = new ArrayList<AvailableResourceForDescribeAvailableResourceOutput>();
    }
    this.availableResources.add(availableResourcesItem);
    return this;
  }

   /**
   * Get availableResources
   * @return availableResources
  **/
  @Valid
  @Schema(description = "")
  public List<AvailableResourceForDescribeAvailableResourceOutput> getAvailableResources() {
    return availableResources;
  }

  public void setAvailableResources(List<AvailableResourceForDescribeAvailableResourceOutput> availableResources) {
    this.availableResources = availableResources;
  }

  public AvailableZoneForDescribeAvailableResourceOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public AvailableZoneForDescribeAvailableResourceOutput status(String status) {
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

  public AvailableZoneForDescribeAvailableResourceOutput zoneId(String zoneId) {
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
    AvailableZoneForDescribeAvailableResourceOutput availableZoneForDescribeAvailableResourceOutput = (AvailableZoneForDescribeAvailableResourceOutput) o;
    return Objects.equals(this.availableResources, availableZoneForDescribeAvailableResourceOutput.availableResources) &&
        Objects.equals(this.regionId, availableZoneForDescribeAvailableResourceOutput.regionId) &&
        Objects.equals(this.status, availableZoneForDescribeAvailableResourceOutput.status) &&
        Objects.equals(this.zoneId, availableZoneForDescribeAvailableResourceOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableResources, regionId, status, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableZoneForDescribeAvailableResourceOutput {\n");
    
    sb.append("    availableResources: ").append(toIndentedString(availableResources)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
