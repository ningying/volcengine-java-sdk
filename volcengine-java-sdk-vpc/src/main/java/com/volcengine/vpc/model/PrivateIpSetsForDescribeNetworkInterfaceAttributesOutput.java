/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.PrivateIpSetForDescribeNetworkInterfaceAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput {
  @SerializedName("PrivateIpSet")
  private List<PrivateIpSetForDescribeNetworkInterfaceAttributesOutput> privateIpSet = null;

  public PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput privateIpSet(List<PrivateIpSetForDescribeNetworkInterfaceAttributesOutput> privateIpSet) {
    this.privateIpSet = privateIpSet;
    return this;
  }

  public PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput addPrivateIpSetItem(PrivateIpSetForDescribeNetworkInterfaceAttributesOutput privateIpSetItem) {
    if (this.privateIpSet == null) {
      this.privateIpSet = new ArrayList<PrivateIpSetForDescribeNetworkInterfaceAttributesOutput>();
    }
    this.privateIpSet.add(privateIpSetItem);
    return this;
  }

   /**
   * Get privateIpSet
   * @return privateIpSet
  **/
  @Valid
  @Schema(description = "")
  public List<PrivateIpSetForDescribeNetworkInterfaceAttributesOutput> getPrivateIpSet() {
    return privateIpSet;
  }

  public void setPrivateIpSet(List<PrivateIpSetForDescribeNetworkInterfaceAttributesOutput> privateIpSet) {
    this.privateIpSet = privateIpSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput privateIpSetsForDescribeNetworkInterfaceAttributesOutput = (PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput) o;
    return Objects.equals(this.privateIpSet, privateIpSetsForDescribeNetworkInterfaceAttributesOutput.privateIpSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateIpSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIpSetsForDescribeNetworkInterfaceAttributesOutput {\n");
    
    sb.append("    privateIpSet: ").append(toIndentedString(privateIpSet)).append("\n");
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
