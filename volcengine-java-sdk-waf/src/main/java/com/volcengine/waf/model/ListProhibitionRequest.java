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
 * ListProhibitionRequest
 */



public class ListProhibitionRequest {
  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("LetterOrderBy")
  private String letterOrderBy = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PathOrderBy")
  private String pathOrderBy = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Reason")
  private List<String> reason = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  @SerializedName("Status")
  private List<Integer> status = null;

  @SerializedName("TimeOrderBy")
  private String timeOrderBy = null;

  public ListProhibitionRequest endTime(Integer endTime) {
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

  public ListProhibitionRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ListProhibitionRequest ip(String ip) {
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

  public ListProhibitionRequest letterOrderBy(String letterOrderBy) {
    this.letterOrderBy = letterOrderBy;
    return this;
  }

   /**
   * Get letterOrderBy
   * @return letterOrderBy
  **/
  @Schema(description = "")
  public String getLetterOrderBy() {
    return letterOrderBy;
  }

  public void setLetterOrderBy(String letterOrderBy) {
    this.letterOrderBy = letterOrderBy;
  }

  public ListProhibitionRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListProhibitionRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListProhibitionRequest pathOrderBy(String pathOrderBy) {
    this.pathOrderBy = pathOrderBy;
    return this;
  }

   /**
   * Get pathOrderBy
   * @return pathOrderBy
  **/
  @Schema(description = "")
  public String getPathOrderBy() {
    return pathOrderBy;
  }

  public void setPathOrderBy(String pathOrderBy) {
    this.pathOrderBy = pathOrderBy;
  }

  public ListProhibitionRequest projectName(String projectName) {
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

  public ListProhibitionRequest reason(List<String> reason) {
    this.reason = reason;
    return this;
  }

  public ListProhibitionRequest addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public List<String> getReason() {
    return reason;
  }

  public void setReason(List<String> reason) {
    this.reason = reason;
  }

  public ListProhibitionRequest startTime(Integer startTime) {
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

  public ListProhibitionRequest status(List<Integer> status) {
    this.status = status;
    return this;
  }

  public ListProhibitionRequest addStatusItem(Integer statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<Integer>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<Integer> getStatus() {
    return status;
  }

  public void setStatus(List<Integer> status) {
    this.status = status;
  }

  public ListProhibitionRequest timeOrderBy(String timeOrderBy) {
    this.timeOrderBy = timeOrderBy;
    return this;
  }

   /**
   * Get timeOrderBy
   * @return timeOrderBy
  **/
  @Schema(description = "")
  public String getTimeOrderBy() {
    return timeOrderBy;
  }

  public void setTimeOrderBy(String timeOrderBy) {
    this.timeOrderBy = timeOrderBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProhibitionRequest listProhibitionRequest = (ListProhibitionRequest) o;
    return Objects.equals(this.endTime, listProhibitionRequest.endTime) &&
        Objects.equals(this.host, listProhibitionRequest.host) &&
        Objects.equals(this.ip, listProhibitionRequest.ip) &&
        Objects.equals(this.letterOrderBy, listProhibitionRequest.letterOrderBy) &&
        Objects.equals(this.page, listProhibitionRequest.page) &&
        Objects.equals(this.pageSize, listProhibitionRequest.pageSize) &&
        Objects.equals(this.pathOrderBy, listProhibitionRequest.pathOrderBy) &&
        Objects.equals(this.projectName, listProhibitionRequest.projectName) &&
        Objects.equals(this.reason, listProhibitionRequest.reason) &&
        Objects.equals(this.startTime, listProhibitionRequest.startTime) &&
        Objects.equals(this.status, listProhibitionRequest.status) &&
        Objects.equals(this.timeOrderBy, listProhibitionRequest.timeOrderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, host, ip, letterOrderBy, page, pageSize, pathOrderBy, projectName, reason, startTime, status, timeOrderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProhibitionRequest {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    letterOrderBy: ").append(toIndentedString(letterOrderBy)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pathOrderBy: ").append(toIndentedString(pathOrderBy)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeOrderBy: ").append(toIndentedString(timeOrderBy)).append("\n");
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
