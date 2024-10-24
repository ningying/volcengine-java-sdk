/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rocketmq.model.AccessKeysInfoForDescribeAccessKeysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAccessKeysResponse
 */



public class DescribeAccessKeysResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccessKeysInfo")
  private List<AccessKeysInfoForDescribeAccessKeysOutput> accessKeysInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeAccessKeysResponse accessKeysInfo(List<AccessKeysInfoForDescribeAccessKeysOutput> accessKeysInfo) {
    this.accessKeysInfo = accessKeysInfo;
    return this;
  }

  public DescribeAccessKeysResponse addAccessKeysInfoItem(AccessKeysInfoForDescribeAccessKeysOutput accessKeysInfoItem) {
    if (this.accessKeysInfo == null) {
      this.accessKeysInfo = new ArrayList<AccessKeysInfoForDescribeAccessKeysOutput>();
    }
    this.accessKeysInfo.add(accessKeysInfoItem);
    return this;
  }

   /**
   * Get accessKeysInfo
   * @return accessKeysInfo
  **/
  @Valid
  @Schema(description = "")
  public List<AccessKeysInfoForDescribeAccessKeysOutput> getAccessKeysInfo() {
    return accessKeysInfo;
  }

  public void setAccessKeysInfo(List<AccessKeysInfoForDescribeAccessKeysOutput> accessKeysInfo) {
    this.accessKeysInfo = accessKeysInfo;
  }

  public DescribeAccessKeysResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAccessKeysResponse describeAccessKeysResponse = (DescribeAccessKeysResponse) o;
    return Objects.equals(this.accessKeysInfo, describeAccessKeysResponse.accessKeysInfo) &&
        Objects.equals(this.total, describeAccessKeysResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeysInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAccessKeysResponse {\n");
    
    sb.append("    accessKeysInfo: ").append(toIndentedString(accessKeysInfo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
