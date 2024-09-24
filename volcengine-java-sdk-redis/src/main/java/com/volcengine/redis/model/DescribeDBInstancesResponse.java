/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.redis.model.InstanceForDescribeDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstancesResponse
 */



public class DescribeDBInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Instances")
  private List<InstanceForDescribeDBInstancesOutput> instances = null;

  @SerializedName("TotalInstancesNum")
  private Integer totalInstancesNum = null;

  public DescribeDBInstancesResponse instances(List<InstanceForDescribeDBInstancesOutput> instances) {
    this.instances = instances;
    return this;
  }

  public DescribeDBInstancesResponse addInstancesItem(InstanceForDescribeDBInstancesOutput instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<InstanceForDescribeDBInstancesOutput>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceForDescribeDBInstancesOutput> getInstances() {
    return instances;
  }

  public void setInstances(List<InstanceForDescribeDBInstancesOutput> instances) {
    this.instances = instances;
  }

  public DescribeDBInstancesResponse totalInstancesNum(Integer totalInstancesNum) {
    this.totalInstancesNum = totalInstancesNum;
    return this;
  }

   /**
   * Get totalInstancesNum
   * @return totalInstancesNum
  **/
  @Schema(description = "")
  public Integer getTotalInstancesNum() {
    return totalInstancesNum;
  }

  public void setTotalInstancesNum(Integer totalInstancesNum) {
    this.totalInstancesNum = totalInstancesNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstancesResponse describeDBInstancesResponse = (DescribeDBInstancesResponse) o;
    return Objects.equals(this.instances, describeDBInstancesResponse.instances) &&
        Objects.equals(this.totalInstancesNum, describeDBInstancesResponse.totalInstancesNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances, totalInstancesNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstancesResponse {\n");
    
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    totalInstancesNum: ").append(toIndentedString(totalInstancesNum)).append("\n");
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
