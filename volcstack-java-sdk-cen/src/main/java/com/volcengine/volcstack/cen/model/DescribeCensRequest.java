/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.cen.model;

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
 * DescribeCensRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:17.092992+08:00[Asia/Shanghai]")
public class DescribeCensRequest {
  @SerializedName("CenIds")
  private String cenIds = null;

  @SerializedName("CenName")
  private String cenName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeCensRequest cenIds(String cenIds) {
    this.cenIds = cenIds;
    return this;
  }

   /**
   * Get cenIds
   * @return cenIds
  **/
  @Schema(description = "")
  public String getCenIds() {
    return cenIds;
  }

  public void setCenIds(String cenIds) {
    this.cenIds = cenIds;
  }

  public DescribeCensRequest cenName(String cenName) {
    this.cenName = cenName;
    return this;
  }

   /**
   * Get cenName
   * @return cenName
  **/
  @Schema(description = "")
  public String getCenName() {
    return cenName;
  }

  public void setCenName(String cenName) {
    this.cenName = cenName;
  }

  public DescribeCensRequest pageNumber(Integer pageNumber) {
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

  public DescribeCensRequest pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCensRequest describeCensRequest = (DescribeCensRequest) o;
    return Objects.equals(this.cenIds, describeCensRequest.cenIds) &&
        Objects.equals(this.cenName, describeCensRequest.cenName) &&
        Objects.equals(this.pageNumber, describeCensRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeCensRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenIds, cenName, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCensRequest {\n");
    
    sb.append("    cenIds: ").append(toIndentedString(cenIds)).append("\n");
    sb.append("    cenName: ").append(toIndentedString(cenName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
