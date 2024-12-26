/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * QueryAttackSecurityEventRequest
 */



public class QueryAttackSecurityEventRequest {
  @SerializedName("AllHost")
  private Boolean allHost = null;

  @SerializedName("AllHostDetails")
  private List<String> allHostDetails = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("EventType")
  private String eventType = null;

  @SerializedName("FilterAll")
  private Boolean filterAll = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityLevel")
  private String securityLevel = null;

  @SerializedName("SortFlag")
  private String sortFlag = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  public QueryAttackSecurityEventRequest allHost(Boolean allHost) {
    this.allHost = allHost;
    return this;
  }

   /**
   * Get allHost
   * @return allHost
  **/
  @Schema(description = "")
  public Boolean isAllHost() {
    return allHost;
  }

  public void setAllHost(Boolean allHost) {
    this.allHost = allHost;
  }

  public QueryAttackSecurityEventRequest allHostDetails(List<String> allHostDetails) {
    this.allHostDetails = allHostDetails;
    return this;
  }

  public QueryAttackSecurityEventRequest addAllHostDetailsItem(String allHostDetailsItem) {
    if (this.allHostDetails == null) {
      this.allHostDetails = new ArrayList<String>();
    }
    this.allHostDetails.add(allHostDetailsItem);
    return this;
  }

   /**
   * Get allHostDetails
   * @return allHostDetails
  **/
  @Schema(description = "")
  public List<String> getAllHostDetails() {
    return allHostDetails;
  }

  public void setAllHostDetails(List<String> allHostDetails) {
    this.allHostDetails = allHostDetails;
  }

  public QueryAttackSecurityEventRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public QueryAttackSecurityEventRequest eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public QueryAttackSecurityEventRequest filterAll(Boolean filterAll) {
    this.filterAll = filterAll;
    return this;
  }

   /**
   * Get filterAll
   * @return filterAll
  **/
  @Schema(description = "")
  public Boolean isFilterAll() {
    return filterAll;
  }

  public void setFilterAll(Boolean filterAll) {
    this.filterAll = filterAll;
  }

  public QueryAttackSecurityEventRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueryAttackSecurityEventRequest ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public QueryAttackSecurityEventRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public QueryAttackSecurityEventRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public QueryAttackSecurityEventRequest path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public QueryAttackSecurityEventRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public QueryAttackSecurityEventRequest securityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

   /**
   * Get securityLevel
   * @return securityLevel
  **/
  @Schema(description = "")
  public String getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
  }

  public QueryAttackSecurityEventRequest sortFlag(String sortFlag) {
    this.sortFlag = sortFlag;
    return this;
  }

   /**
   * Get sortFlag
   * @return sortFlag
  **/
  @Schema(description = "")
  public String getSortFlag() {
    return sortFlag;
  }

  public void setSortFlag(String sortFlag) {
    this.sortFlag = sortFlag;
  }

  public QueryAttackSecurityEventRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAttackSecurityEventRequest queryAttackSecurityEventRequest = (QueryAttackSecurityEventRequest) o;
    return Objects.equals(this.allHost, queryAttackSecurityEventRequest.allHost) &&
        Objects.equals(this.allHostDetails, queryAttackSecurityEventRequest.allHostDetails) &&
        Objects.equals(this.endTime, queryAttackSecurityEventRequest.endTime) &&
        Objects.equals(this.eventType, queryAttackSecurityEventRequest.eventType) &&
        Objects.equals(this.filterAll, queryAttackSecurityEventRequest.filterAll) &&
        Objects.equals(this.host, queryAttackSecurityEventRequest.host) &&
        Objects.equals(this.ip, queryAttackSecurityEventRequest.ip) &&
        Objects.equals(this.page, queryAttackSecurityEventRequest.page) &&
        Objects.equals(this.pageSize, queryAttackSecurityEventRequest.pageSize) &&
        Objects.equals(this.path, queryAttackSecurityEventRequest.path) &&
        Objects.equals(this.projectName, queryAttackSecurityEventRequest.projectName) &&
        Objects.equals(this.securityLevel, queryAttackSecurityEventRequest.securityLevel) &&
        Objects.equals(this.sortFlag, queryAttackSecurityEventRequest.sortFlag) &&
        Objects.equals(this.startTime, queryAttackSecurityEventRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHost, allHostDetails, endTime, eventType, filterAll, host, ip, page, pageSize, path, projectName, securityLevel, sortFlag, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAttackSecurityEventRequest {\n");
    
    sb.append("    allHost: ").append(toIndentedString(allHost)).append("\n");
    sb.append("    allHostDetails: ").append(toIndentedString(allHostDetails)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filterAll: ").append(toIndentedString(filterAll)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    sortFlag: ").append(toIndentedString(sortFlag)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
