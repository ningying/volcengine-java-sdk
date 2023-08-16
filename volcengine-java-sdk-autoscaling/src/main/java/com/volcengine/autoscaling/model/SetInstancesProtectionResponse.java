/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.autoscaling.model.InstanceProtectionResultForSetInstancesProtectionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SetInstancesProtectionResponse
 */


public class SetInstancesProtectionResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceProtectionResults")
  private List<InstanceProtectionResultForSetInstancesProtectionOutput> instanceProtectionResults = null;

  public SetInstancesProtectionResponse instanceProtectionResults(List<InstanceProtectionResultForSetInstancesProtectionOutput> instanceProtectionResults) {
    this.instanceProtectionResults = instanceProtectionResults;
    return this;
  }

  public SetInstancesProtectionResponse addInstanceProtectionResultsItem(InstanceProtectionResultForSetInstancesProtectionOutput instanceProtectionResultsItem) {
    if (this.instanceProtectionResults == null) {
      this.instanceProtectionResults = new ArrayList<InstanceProtectionResultForSetInstancesProtectionOutput>();
    }
    this.instanceProtectionResults.add(instanceProtectionResultsItem);
    return this;
  }

   /**
   * Get instanceProtectionResults
   * @return instanceProtectionResults
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceProtectionResultForSetInstancesProtectionOutput> getInstanceProtectionResults() {
    return instanceProtectionResults;
  }

  public void setInstanceProtectionResults(List<InstanceProtectionResultForSetInstancesProtectionOutput> instanceProtectionResults) {
    this.instanceProtectionResults = instanceProtectionResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetInstancesProtectionResponse setInstancesProtectionResponse = (SetInstancesProtectionResponse) o;
    return Objects.equals(this.instanceProtectionResults, setInstancesProtectionResponse.instanceProtectionResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProtectionResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetInstancesProtectionResponse {\n");
    
    sb.append("    instanceProtectionResults: ").append(toIndentedString(instanceProtectionResults)).append("\n");
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
