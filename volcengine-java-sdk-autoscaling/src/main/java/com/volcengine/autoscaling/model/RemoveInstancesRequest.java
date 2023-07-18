/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * RemoveInstancesRequest
 */



public class RemoveInstancesRequest {
  @SerializedName("DecreaseDesiredCapacity")
  private Boolean decreaseDesiredCapacity = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public RemoveInstancesRequest decreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
    this.decreaseDesiredCapacity = decreaseDesiredCapacity;
    return this;
  }

   /**
   * Get decreaseDesiredCapacity
   * @return decreaseDesiredCapacity
  **/
  @Schema(description = "")
  public Boolean isDecreaseDesiredCapacity() {
    return decreaseDesiredCapacity;
  }

  public void setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
    this.decreaseDesiredCapacity = decreaseDesiredCapacity;
  }

  public RemoveInstancesRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public RemoveInstancesRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public RemoveInstancesRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveInstancesRequest removeInstancesRequest = (RemoveInstancesRequest) o;
    return Objects.equals(this.decreaseDesiredCapacity, removeInstancesRequest.decreaseDesiredCapacity) &&
        Objects.equals(this.instanceIds, removeInstancesRequest.instanceIds) &&
        Objects.equals(this.scalingGroupId, removeInstancesRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decreaseDesiredCapacity, instanceIds, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveInstancesRequest {\n");
    
    sb.append("    decreaseDesiredCapacity: ").append(toIndentedString(decreaseDesiredCapacity)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
