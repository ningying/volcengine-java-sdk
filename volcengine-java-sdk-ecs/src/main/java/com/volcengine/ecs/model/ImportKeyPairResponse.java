/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ImportKeyPairResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-01T17:18:25.441969+08:00[Asia/Shanghai]")
public class ImportKeyPairResponse {
  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  public ImportKeyPairResponse fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @Schema(description = "")
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public ImportKeyPairResponse keyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

   /**
   * Get keyPairId
   * @return keyPairId
  **/
  @Schema(description = "")
  public String getKeyPairId() {
    return keyPairId;
  }

  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public ImportKeyPairResponse keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportKeyPairResponse importKeyPairResponse = (ImportKeyPairResponse) o;
    return Objects.equals(this.fingerPrint, importKeyPairResponse.fingerPrint) &&
        Objects.equals(this.keyPairId, importKeyPairResponse.keyPairId) &&
        Objects.equals(this.keyPairName, importKeyPairResponse.keyPairName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerPrint, keyPairId, keyPairName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportKeyPairResponse {\n");
    
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
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
