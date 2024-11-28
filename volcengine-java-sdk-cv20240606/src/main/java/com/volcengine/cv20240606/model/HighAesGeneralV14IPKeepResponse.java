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
import com.volcengine.cv20240606.model.DataForHighAesGeneralV14IPKeepOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HighAesGeneralV14IPKeepResponse
 */



public class HighAesGeneralV14IPKeepResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("data")
  private DataForHighAesGeneralV14IPKeepOutput data = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("time_elapsed")
  private String timeElapsed = null;

  public HighAesGeneralV14IPKeepResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public HighAesGeneralV14IPKeepResponse data(DataForHighAesGeneralV14IPKeepOutput data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public DataForHighAesGeneralV14IPKeepOutput getData() {
    return data;
  }

  public void setData(DataForHighAesGeneralV14IPKeepOutput data) {
    this.data = data;
  }

  public HighAesGeneralV14IPKeepResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HighAesGeneralV14IPKeepResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public HighAesGeneralV14IPKeepResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public HighAesGeneralV14IPKeepResponse timeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
    return this;
  }

   /**
   * Get timeElapsed
   * @return timeElapsed
  **/
  @Schema(description = "")
  public String getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighAesGeneralV14IPKeepResponse highAesGeneralV14IPKeepResponse = (HighAesGeneralV14IPKeepResponse) o;
    return Objects.equals(this.code, highAesGeneralV14IPKeepResponse.code) &&
        Objects.equals(this.data, highAesGeneralV14IPKeepResponse.data) &&
        Objects.equals(this.message, highAesGeneralV14IPKeepResponse.message) &&
        Objects.equals(this.requestId, highAesGeneralV14IPKeepResponse.requestId) &&
        Objects.equals(this.status, highAesGeneralV14IPKeepResponse.status) &&
        Objects.equals(this.timeElapsed, highAesGeneralV14IPKeepResponse.timeElapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId, status, timeElapsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighAesGeneralV14IPKeepResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
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
