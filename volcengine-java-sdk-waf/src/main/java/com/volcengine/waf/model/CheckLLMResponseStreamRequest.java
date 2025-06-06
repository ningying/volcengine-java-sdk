/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * CheckLLMResponseStreamRequest
 */



public class CheckLLMResponseStreamRequest {
  @SerializedName("Content")
  private String content = null;

  @SerializedName("ContentType")
  private Integer contentType = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("MsgClass")
  private Integer msgClass = null;

  @SerializedName("MsgID")
  private String msgID = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("UseStream")
  private Integer useStream = null;

  public CheckLLMResponseStreamRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CheckLLMResponseStreamRequest contentType(Integer contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getContentType() {
    return contentType;
  }

  public void setContentType(Integer contentType) {
    this.contentType = contentType;
  }

  public CheckLLMResponseStreamRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public CheckLLMResponseStreamRequest msgClass(Integer msgClass) {
    this.msgClass = msgClass;
    return this;
  }

   /**
   * Get msgClass
   * minimum: 0
   * maximum: 99
   * @return msgClass
  **/
  @NotNull
 @Min(0) @Max(99)  @Schema(required = true, description = "")
  public Integer getMsgClass() {
    return msgClass;
  }

  public void setMsgClass(Integer msgClass) {
    this.msgClass = msgClass;
  }

  public CheckLLMResponseStreamRequest msgID(String msgID) {
    this.msgID = msgID;
    return this;
  }

   /**
   * Get msgID
   * @return msgID
  **/
  @Schema(description = "")
  public String getMsgID() {
    return msgID;
  }

  public void setMsgID(String msgID) {
    this.msgID = msgID;
  }

  public CheckLLMResponseStreamRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CheckLLMResponseStreamRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public CheckLLMResponseStreamRequest useStream(Integer useStream) {
    this.useStream = useStream;
    return this;
  }

   /**
   * Get useStream
   * @return useStream
  **/
  @Schema(description = "")
  public Integer getUseStream() {
    return useStream;
  }

  public void setUseStream(Integer useStream) {
    this.useStream = useStream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckLLMResponseStreamRequest checkLLMResponseStreamRequest = (CheckLLMResponseStreamRequest) o;
    return Objects.equals(this.content, checkLLMResponseStreamRequest.content) &&
        Objects.equals(this.contentType, checkLLMResponseStreamRequest.contentType) &&
        Objects.equals(this.host, checkLLMResponseStreamRequest.host) &&
        Objects.equals(this.msgClass, checkLLMResponseStreamRequest.msgClass) &&
        Objects.equals(this.msgID, checkLLMResponseStreamRequest.msgID) &&
        Objects.equals(this.region, checkLLMResponseStreamRequest.region) &&
        Objects.equals(this.timeout, checkLLMResponseStreamRequest.timeout) &&
        Objects.equals(this.useStream, checkLLMResponseStreamRequest.useStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentType, host, msgClass, msgID, region, timeout, useStream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckLLMResponseStreamRequest {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    msgClass: ").append(toIndentedString(msgClass)).append("\n");
    sb.append("    msgID: ").append(toIndentedString(msgID)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    useStream: ").append(toIndentedString(useStream)).append("\n");
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
