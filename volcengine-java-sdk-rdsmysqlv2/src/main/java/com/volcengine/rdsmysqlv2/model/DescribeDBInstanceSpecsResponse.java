/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.InstanceSpecsInfoForDescribeDBInstanceSpecsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstanceSpecsResponse
 */


public class DescribeDBInstanceSpecsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceSpecsInfo")
  private List<InstanceSpecsInfoForDescribeDBInstanceSpecsOutput> instanceSpecsInfo = null;

  public DescribeDBInstanceSpecsResponse instanceSpecsInfo(List<InstanceSpecsInfoForDescribeDBInstanceSpecsOutput> instanceSpecsInfo) {
    this.instanceSpecsInfo = instanceSpecsInfo;
    return this;
  }

  public DescribeDBInstanceSpecsResponse addInstanceSpecsInfoItem(InstanceSpecsInfoForDescribeDBInstanceSpecsOutput instanceSpecsInfoItem) {
    if (this.instanceSpecsInfo == null) {
      this.instanceSpecsInfo = new ArrayList<InstanceSpecsInfoForDescribeDBInstanceSpecsOutput>();
    }
    this.instanceSpecsInfo.add(instanceSpecsInfoItem);
    return this;
  }

   /**
   * Get instanceSpecsInfo
   * @return instanceSpecsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceSpecsInfoForDescribeDBInstanceSpecsOutput> getInstanceSpecsInfo() {
    return instanceSpecsInfo;
  }

  public void setInstanceSpecsInfo(List<InstanceSpecsInfoForDescribeDBInstanceSpecsOutput> instanceSpecsInfo) {
    this.instanceSpecsInfo = instanceSpecsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstanceSpecsResponse describeDBInstanceSpecsResponse = (DescribeDBInstanceSpecsResponse) o;
    return Objects.equals(this.instanceSpecsInfo, describeDBInstanceSpecsResponse.instanceSpecsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceSpecsInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceSpecsResponse {\n");
    
    sb.append("    instanceSpecsInfo: ").append(toIndentedString(instanceSpecsInfo)).append("\n");
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