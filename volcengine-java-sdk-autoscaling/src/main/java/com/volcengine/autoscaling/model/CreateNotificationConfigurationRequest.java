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
 * CreateNotificationConfigurationRequest
 */


public class CreateNotificationConfigurationRequest {
  @SerializedName("EventTypes")
  private List<String> eventTypes = null;

  @SerializedName("NotificationType")
  private String notificationType = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public CreateNotificationConfigurationRequest eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public CreateNotificationConfigurationRequest addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Get eventTypes
   * @return eventTypes
  **/
  @Schema(description = "")
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }

  public CreateNotificationConfigurationRequest notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public CreateNotificationConfigurationRequest scalingGroupId(String scalingGroupId) {
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
    CreateNotificationConfigurationRequest createNotificationConfigurationRequest = (CreateNotificationConfigurationRequest) o;
    return Objects.equals(this.eventTypes, createNotificationConfigurationRequest.eventTypes) &&
        Objects.equals(this.notificationType, createNotificationConfigurationRequest.notificationType) &&
        Objects.equals(this.scalingGroupId, createNotificationConfigurationRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTypes, notificationType, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationConfigurationRequest {\n");
    
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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
