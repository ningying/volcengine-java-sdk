/*
 * cloud_trail20180101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail20180101.model;

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
 * CreateTrailResponse
 */



public class CreateTrailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("EventRW")
  private String eventRW = null;

  @SerializedName("EventSources")
  private List<String> eventSources = null;

  @SerializedName("TlsProjectName")
  private String tlsProjectName = null;

  @SerializedName("TlsProjectRegion")
  private String tlsProjectRegion = null;

  @SerializedName("TlsTopicName")
  private String tlsTopicName = null;

  @SerializedName("TosBucketName")
  private String tosBucketName = null;

  @SerializedName("TosBucketRegion")
  private String tosBucketRegion = null;

  @SerializedName("TosKeyPrefix")
  private String tosKeyPrefix = null;

  @SerializedName("TrailName")
  private String trailName = null;

  @SerializedName("TrailType")
  private Integer trailType = null;

  public CreateTrailResponse eventRW(String eventRW) {
    this.eventRW = eventRW;
    return this;
  }

   /**
   * Get eventRW
   * @return eventRW
  **/
  @Schema(description = "")
  public String getEventRW() {
    return eventRW;
  }

  public void setEventRW(String eventRW) {
    this.eventRW = eventRW;
  }

  public CreateTrailResponse eventSources(List<String> eventSources) {
    this.eventSources = eventSources;
    return this;
  }

  public CreateTrailResponse addEventSourcesItem(String eventSourcesItem) {
    if (this.eventSources == null) {
      this.eventSources = new ArrayList<String>();
    }
    this.eventSources.add(eventSourcesItem);
    return this;
  }

   /**
   * Get eventSources
   * @return eventSources
  **/
  @Schema(description = "")
  public List<String> getEventSources() {
    return eventSources;
  }

  public void setEventSources(List<String> eventSources) {
    this.eventSources = eventSources;
  }

  public CreateTrailResponse tlsProjectName(String tlsProjectName) {
    this.tlsProjectName = tlsProjectName;
    return this;
  }

   /**
   * Get tlsProjectName
   * @return tlsProjectName
  **/
  @Schema(description = "")
  public String getTlsProjectName() {
    return tlsProjectName;
  }

  public void setTlsProjectName(String tlsProjectName) {
    this.tlsProjectName = tlsProjectName;
  }

  public CreateTrailResponse tlsProjectRegion(String tlsProjectRegion) {
    this.tlsProjectRegion = tlsProjectRegion;
    return this;
  }

   /**
   * Get tlsProjectRegion
   * @return tlsProjectRegion
  **/
  @Schema(description = "")
  public String getTlsProjectRegion() {
    return tlsProjectRegion;
  }

  public void setTlsProjectRegion(String tlsProjectRegion) {
    this.tlsProjectRegion = tlsProjectRegion;
  }

  public CreateTrailResponse tlsTopicName(String tlsTopicName) {
    this.tlsTopicName = tlsTopicName;
    return this;
  }

   /**
   * Get tlsTopicName
   * @return tlsTopicName
  **/
  @Schema(description = "")
  public String getTlsTopicName() {
    return tlsTopicName;
  }

  public void setTlsTopicName(String tlsTopicName) {
    this.tlsTopicName = tlsTopicName;
  }

  public CreateTrailResponse tosBucketName(String tosBucketName) {
    this.tosBucketName = tosBucketName;
    return this;
  }

   /**
   * Get tosBucketName
   * @return tosBucketName
  **/
  @Schema(description = "")
  public String getTosBucketName() {
    return tosBucketName;
  }

  public void setTosBucketName(String tosBucketName) {
    this.tosBucketName = tosBucketName;
  }

  public CreateTrailResponse tosBucketRegion(String tosBucketRegion) {
    this.tosBucketRegion = tosBucketRegion;
    return this;
  }

   /**
   * Get tosBucketRegion
   * @return tosBucketRegion
  **/
  @Schema(description = "")
  public String getTosBucketRegion() {
    return tosBucketRegion;
  }

  public void setTosBucketRegion(String tosBucketRegion) {
    this.tosBucketRegion = tosBucketRegion;
  }

  public CreateTrailResponse tosKeyPrefix(String tosKeyPrefix) {
    this.tosKeyPrefix = tosKeyPrefix;
    return this;
  }

   /**
   * Get tosKeyPrefix
   * @return tosKeyPrefix
  **/
  @Schema(description = "")
  public String getTosKeyPrefix() {
    return tosKeyPrefix;
  }

  public void setTosKeyPrefix(String tosKeyPrefix) {
    this.tosKeyPrefix = tosKeyPrefix;
  }

  public CreateTrailResponse trailName(String trailName) {
    this.trailName = trailName;
    return this;
  }

   /**
   * Get trailName
   * @return trailName
  **/
  @Schema(description = "")
  public String getTrailName() {
    return trailName;
  }

  public void setTrailName(String trailName) {
    this.trailName = trailName;
  }

  public CreateTrailResponse trailType(Integer trailType) {
    this.trailType = trailType;
    return this;
  }

   /**
   * Get trailType
   * @return trailType
  **/
  @Schema(description = "")
  public Integer getTrailType() {
    return trailType;
  }

  public void setTrailType(Integer trailType) {
    this.trailType = trailType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrailResponse createTrailResponse = (CreateTrailResponse) o;
    return Objects.equals(this.eventRW, createTrailResponse.eventRW) &&
        Objects.equals(this.eventSources, createTrailResponse.eventSources) &&
        Objects.equals(this.tlsProjectName, createTrailResponse.tlsProjectName) &&
        Objects.equals(this.tlsProjectRegion, createTrailResponse.tlsProjectRegion) &&
        Objects.equals(this.tlsTopicName, createTrailResponse.tlsTopicName) &&
        Objects.equals(this.tosBucketName, createTrailResponse.tosBucketName) &&
        Objects.equals(this.tosBucketRegion, createTrailResponse.tosBucketRegion) &&
        Objects.equals(this.tosKeyPrefix, createTrailResponse.tosKeyPrefix) &&
        Objects.equals(this.trailName, createTrailResponse.trailName) &&
        Objects.equals(this.trailType, createTrailResponse.trailType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventRW, eventSources, tlsProjectName, tlsProjectRegion, tlsTopicName, tosBucketName, tosBucketRegion, tosKeyPrefix, trailName, trailType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrailResponse {\n");
    
    sb.append("    eventRW: ").append(toIndentedString(eventRW)).append("\n");
    sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
    sb.append("    tlsProjectName: ").append(toIndentedString(tlsProjectName)).append("\n");
    sb.append("    tlsProjectRegion: ").append(toIndentedString(tlsProjectRegion)).append("\n");
    sb.append("    tlsTopicName: ").append(toIndentedString(tlsTopicName)).append("\n");
    sb.append("    tosBucketName: ").append(toIndentedString(tosBucketName)).append("\n");
    sb.append("    tosBucketRegion: ").append(toIndentedString(tosBucketRegion)).append("\n");
    sb.append("    tosKeyPrefix: ").append(toIndentedString(tosKeyPrefix)).append("\n");
    sb.append("    trailName: ").append(toIndentedString(trailName)).append("\n");
    sb.append("    trailType: ").append(toIndentedString(trailType)).append("\n");
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