/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainStatisticsRequest
 */



public class ListDomainStatisticsRequest {
  @SerializedName("End")
  private Long end = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SearchMode")
  private String searchMode = null;

  @SerializedName("Start")
  private Long start = null;

  @SerializedName("Threshold")
  private Integer threshold = null;

  @SerializedName("ZID")
  private Long ZID = null;

  public ListDomainStatisticsRequest end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public ListDomainStatisticsRequest name(String name) {
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

  public ListDomainStatisticsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListDomainStatisticsRequest pageSize(Integer pageSize) {
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

  public ListDomainStatisticsRequest searchMode(String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

   /**
   * Get searchMode
   * @return searchMode
  **/
  @Schema(description = "")
  public String getSearchMode() {
    return searchMode;
  }

  public void setSearchMode(String searchMode) {
    this.searchMode = searchMode;
  }

  public ListDomainStatisticsRequest start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public ListDomainStatisticsRequest threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @Schema(description = "")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public ListDomainStatisticsRequest ZID(Long ZID) {
    this.ZID = ZID;
    return this;
  }

   /**
   * Get ZID
   * @return ZID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getZID() {
    return ZID;
  }

  public void setZID(Long ZID) {
    this.ZID = ZID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainStatisticsRequest listDomainStatisticsRequest = (ListDomainStatisticsRequest) o;
    return Objects.equals(this.end, listDomainStatisticsRequest.end) &&
        Objects.equals(this.name, listDomainStatisticsRequest.name) &&
        Objects.equals(this.pageNumber, listDomainStatisticsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listDomainStatisticsRequest.pageSize) &&
        Objects.equals(this.searchMode, listDomainStatisticsRequest.searchMode) &&
        Objects.equals(this.start, listDomainStatisticsRequest.start) &&
        Objects.equals(this.threshold, listDomainStatisticsRequest.threshold) &&
        Objects.equals(this.ZID, listDomainStatisticsRequest.ZID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, name, pageNumber, pageSize, searchMode, start, threshold, ZID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainStatisticsRequest {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    ZID: ").append(toIndentedString(ZID)).append("\n");
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