/*
 * cv20240606
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cv20240606.model;

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
 * AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput
 */



public class AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput {
  @SerializedName("status_code")
  private Integer statusCode = null;

  @SerializedName("status_message")
  private String statusMessage = null;

  public AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @Schema(description = "")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput algorithmBaseRespForHighAesGeneralV14IPKeepOutput = (AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput) o;
    return Objects.equals(this.statusCode, algorithmBaseRespForHighAesGeneralV14IPKeepOutput.statusCode) &&
        Objects.equals(this.statusMessage, algorithmBaseRespForHighAesGeneralV14IPKeepOutput.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlgorithmBaseRespForHighAesGeneralV14IPKeepOutput {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
