/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.escloud.model.InstanceForDescribeInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstancesResponse
 */



public class DescribeInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Instances")
  private List<InstanceForDescribeInstancesOutput> instances = null;

  @SerializedName("TotalCount")
  private Long totalCount = null;

  public DescribeInstancesResponse instances(List<InstanceForDescribeInstancesOutput> instances) {
    this.instances = instances;
    return this;
  }

  public DescribeInstancesResponse addInstancesItem(InstanceForDescribeInstancesOutput instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<InstanceForDescribeInstancesOutput>();
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
  public List<InstanceForDescribeInstancesOutput> getInstances() {
    return instances;
  }

  public void setInstances(List<InstanceForDescribeInstancesOutput> instances) {
    this.instances = instances;
  }

  public DescribeInstancesResponse totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
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
    DescribeInstancesResponse describeInstancesResponse = (DescribeInstancesResponse) o;
    return Objects.equals(this.instances, describeInstancesResponse.instances) &&
        Objects.equals(this.totalCount, describeInstancesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstancesResponse {\n");
    
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
