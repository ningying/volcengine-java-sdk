/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * BackSrcQpsFlowForDescWebQpsFlowOutput
 */



public class BackSrcQpsFlowForDescWebQpsFlowOutput {
  @SerializedName("Qps")
  private Float qps = null;

  @SerializedName("TimeStamp")
  private Integer timeStamp = null;

  public BackSrcQpsFlowForDescWebQpsFlowOutput qps(Float qps) {
    this.qps = qps;
    return this;
  }

   /**
   * Get qps
   * @return qps
  **/
  @Schema(description = "")
  public Float getQps() {
    return qps;
  }

  public void setQps(Float qps) {
    this.qps = qps;
  }

  public BackSrcQpsFlowForDescWebQpsFlowOutput timeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @Schema(description = "")
  public Integer getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackSrcQpsFlowForDescWebQpsFlowOutput backSrcQpsFlowForDescWebQpsFlowOutput = (BackSrcQpsFlowForDescWebQpsFlowOutput) o;
    return Objects.equals(this.qps, backSrcQpsFlowForDescWebQpsFlowOutput.qps) &&
        Objects.equals(this.timeStamp, backSrcQpsFlowForDescWebQpsFlowOutput.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qps, timeStamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackSrcQpsFlowForDescWebQpsFlowOutput {\n");
    
    sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
