/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.edx.model.DXPInstanceForListDXPInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDXPInstancesResponse
 */



public class ListDXPInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DXPInstances")
  private List<DXPInstanceForListDXPInstancesOutput> dxPInstances = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListDXPInstancesResponse dxPInstances(List<DXPInstanceForListDXPInstancesOutput> dxPInstances) {
    this.dxPInstances = dxPInstances;
    return this;
  }

  public ListDXPInstancesResponse addDxPInstancesItem(DXPInstanceForListDXPInstancesOutput dxPInstancesItem) {
    if (this.dxPInstances == null) {
      this.dxPInstances = new ArrayList<DXPInstanceForListDXPInstancesOutput>();
    }
    this.dxPInstances.add(dxPInstancesItem);
    return this;
  }

   /**
   * Get dxPInstances
   * @return dxPInstances
  **/
  @Valid
  @Schema(description = "")
  public List<DXPInstanceForListDXPInstancesOutput> getDxPInstances() {
    return dxPInstances;
  }

  public void setDxPInstances(List<DXPInstanceForListDXPInstancesOutput> dxPInstances) {
    this.dxPInstances = dxPInstances;
  }

  public ListDXPInstancesResponse pageNumber(Integer pageNumber) {
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

  public ListDXPInstancesResponse pageSize(Integer pageSize) {
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

  public ListDXPInstancesResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDXPInstancesResponse listDXPInstancesResponse = (ListDXPInstancesResponse) o;
    return Objects.equals(this.dxPInstances, listDXPInstancesResponse.dxPInstances) &&
        Objects.equals(this.pageNumber, listDXPInstancesResponse.pageNumber) &&
        Objects.equals(this.pageSize, listDXPInstancesResponse.pageSize) &&
        Objects.equals(this.totalCount, listDXPInstancesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dxPInstances, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDXPInstancesResponse {\n");
    
    sb.append("    dxPInstances: ").append(toIndentedString(dxPInstances)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
