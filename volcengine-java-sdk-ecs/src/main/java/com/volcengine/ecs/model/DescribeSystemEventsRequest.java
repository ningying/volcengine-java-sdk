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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSystemEventsRequest
 */



public class DescribeSystemEventsRequest {
  @SerializedName("Category")
  private String category = null;

  @SerializedName("CreatedAtEnd")
  private String createdAtEnd = null;

  @SerializedName("CreatedAtStart")
  private String createdAtStart = null;

  @SerializedName("EventIds")
  private List<String> eventIds = null;

  @SerializedName("MaxResults")
  private String maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("ResourceIds")
  private List<String> resourceIds = null;

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("Types")
  private List<String> types = null;

  public DescribeSystemEventsRequest category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DescribeSystemEventsRequest createdAtEnd(String createdAtEnd) {
    this.createdAtEnd = createdAtEnd;
    return this;
  }

   /**
   * Get createdAtEnd
   * @return createdAtEnd
  **/
  @Schema(description = "")
  public String getCreatedAtEnd() {
    return createdAtEnd;
  }

  public void setCreatedAtEnd(String createdAtEnd) {
    this.createdAtEnd = createdAtEnd;
  }

  public DescribeSystemEventsRequest createdAtStart(String createdAtStart) {
    this.createdAtStart = createdAtStart;
    return this;
  }

   /**
   * Get createdAtStart
   * @return createdAtStart
  **/
  @Schema(description = "")
  public String getCreatedAtStart() {
    return createdAtStart;
  }

  public void setCreatedAtStart(String createdAtStart) {
    this.createdAtStart = createdAtStart;
  }

  public DescribeSystemEventsRequest eventIds(List<String> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public DescribeSystemEventsRequest addEventIdsItem(String eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<String>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @Schema(description = "")
  public List<String> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<String> eventIds) {
    this.eventIds = eventIds;
  }

  public DescribeSystemEventsRequest maxResults(String maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public String getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(String maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeSystemEventsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeSystemEventsRequest resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public DescribeSystemEventsRequest addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<String>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @Schema(description = "")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public DescribeSystemEventsRequest status(List<String> status) {
    this.status = status;
    return this;
  }

  public DescribeSystemEventsRequest addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<String>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public DescribeSystemEventsRequest types(List<String> types) {
    this.types = types;
    return this;
  }

  public DescribeSystemEventsRequest addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSystemEventsRequest describeSystemEventsRequest = (DescribeSystemEventsRequest) o;
    return Objects.equals(this.category, describeSystemEventsRequest.category) &&
        Objects.equals(this.createdAtEnd, describeSystemEventsRequest.createdAtEnd) &&
        Objects.equals(this.createdAtStart, describeSystemEventsRequest.createdAtStart) &&
        Objects.equals(this.eventIds, describeSystemEventsRequest.eventIds) &&
        Objects.equals(this.maxResults, describeSystemEventsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeSystemEventsRequest.nextToken) &&
        Objects.equals(this.resourceIds, describeSystemEventsRequest.resourceIds) &&
        Objects.equals(this.status, describeSystemEventsRequest.status) &&
        Objects.equals(this.types, describeSystemEventsRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, createdAtEnd, createdAtStart, eventIds, maxResults, nextToken, resourceIds, status, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSystemEventsRequest {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAtEnd: ").append(toIndentedString(createdAtEnd)).append("\n");
    sb.append("    createdAtStart: ").append(toIndentedString(createdAtStart)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
