/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * TlsConfigForListFunctionsOutput
 */



public class TlsConfigForListFunctionsOutput {
  @SerializedName("EnableLog")
  private Boolean enableLog = null;

  @SerializedName("TlsProjectId")
  private String tlsProjectId = null;

  @SerializedName("TlsTopicId")
  private String tlsTopicId = null;

  public TlsConfigForListFunctionsOutput enableLog(Boolean enableLog) {
    this.enableLog = enableLog;
    return this;
  }

   /**
   * Get enableLog
   * @return enableLog
  **/
  @Schema(description = "")
  public Boolean isEnableLog() {
    return enableLog;
  }

  public void setEnableLog(Boolean enableLog) {
    this.enableLog = enableLog;
  }

  public TlsConfigForListFunctionsOutput tlsProjectId(String tlsProjectId) {
    this.tlsProjectId = tlsProjectId;
    return this;
  }

   /**
   * Get tlsProjectId
   * @return tlsProjectId
  **/
  @Schema(description = "")
  public String getTlsProjectId() {
    return tlsProjectId;
  }

  public void setTlsProjectId(String tlsProjectId) {
    this.tlsProjectId = tlsProjectId;
  }

  public TlsConfigForListFunctionsOutput tlsTopicId(String tlsTopicId) {
    this.tlsTopicId = tlsTopicId;
    return this;
  }

   /**
   * Get tlsTopicId
   * @return tlsTopicId
  **/
  @Schema(description = "")
  public String getTlsTopicId() {
    return tlsTopicId;
  }

  public void setTlsTopicId(String tlsTopicId) {
    this.tlsTopicId = tlsTopicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsConfigForListFunctionsOutput tlsConfigForListFunctionsOutput = (TlsConfigForListFunctionsOutput) o;
    return Objects.equals(this.enableLog, tlsConfigForListFunctionsOutput.enableLog) &&
        Objects.equals(this.tlsProjectId, tlsConfigForListFunctionsOutput.tlsProjectId) &&
        Objects.equals(this.tlsTopicId, tlsConfigForListFunctionsOutput.tlsTopicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableLog, tlsProjectId, tlsTopicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsConfigForListFunctionsOutput {\n");
    
    sb.append("    enableLog: ").append(toIndentedString(enableLog)).append("\n");
    sb.append("    tlsProjectId: ").append(toIndentedString(tlsProjectId)).append("\n");
    sb.append("    tlsTopicId: ").append(toIndentedString(tlsTopicId)).append("\n");
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
