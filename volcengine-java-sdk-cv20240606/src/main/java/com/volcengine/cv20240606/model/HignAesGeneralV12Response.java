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
import com.volcengine.cv20240606.model.DataForHignAesGeneralV12Output;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HignAesGeneralV12Response
 */



public class HignAesGeneralV12Response extends com.volcengine.model.AbstractResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("data")
  private DataForHignAesGeneralV12Output data = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("time_elapsed")
  private String timeElapsed = null;

  public HignAesGeneralV12Response code(Integer code) {
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

  public HignAesGeneralV12Response data(DataForHignAesGeneralV12Output data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public DataForHignAesGeneralV12Output getData() {
    return data;
  }

  public void setData(DataForHignAesGeneralV12Output data) {
    this.data = data;
  }

  public HignAesGeneralV12Response message(String message) {
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

  public HignAesGeneralV12Response requestId(String requestId) {
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

  public HignAesGeneralV12Response status(Integer status) {
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

  public HignAesGeneralV12Response timeElapsed(String timeElapsed) {
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
    HignAesGeneralV12Response hignAesGeneralV12Response = (HignAesGeneralV12Response) o;
    return Objects.equals(this.code, hignAesGeneralV12Response.code) &&
        Objects.equals(this.data, hignAesGeneralV12Response.data) &&
        Objects.equals(this.message, hignAesGeneralV12Response.message) &&
        Objects.equals(this.requestId, hignAesGeneralV12Response.requestId) &&
        Objects.equals(this.status, hignAesGeneralV12Response.status) &&
        Objects.equals(this.timeElapsed, hignAesGeneralV12Response.timeElapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId, status, timeElapsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HignAesGeneralV12Response {\n");
    
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
