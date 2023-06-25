/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.SubnetIdListForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpcCniConfigForListClustersOutput
 */



public class VpcCniConfigForListClustersOutput {
  @SerializedName("SubnetIds")
  private SubnetIdListForListClustersOutput subnetIds = null;

  public VpcCniConfigForListClustersOutput subnetIds(SubnetIdListForListClustersOutput subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Valid
  @Schema(description = "")
  public SubnetIdListForListClustersOutput getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(SubnetIdListForListClustersOutput subnetIds) {
    this.subnetIds = subnetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcCniConfigForListClustersOutput vpcCniConfigForListClustersOutput = (VpcCniConfigForListClustersOutput) o;
    return Objects.equals(this.subnetIds, vpcCniConfigForListClustersOutput.subnetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcCniConfigForListClustersOutput {\n");
    
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
