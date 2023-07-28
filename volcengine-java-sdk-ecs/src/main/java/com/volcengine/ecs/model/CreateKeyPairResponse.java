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
 * CreateKeyPairResponse
 */


public class CreateKeyPairResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("PrivateKey")
  private String privateKey = null;

  public CreateKeyPairResponse fingerPrint(String fingerPrint) {
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

  public CreateKeyPairResponse keyPairId(String keyPairId) {
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

  public CreateKeyPairResponse keyPairName(String keyPairName) {
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

  public CreateKeyPairResponse privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @Schema(description = "")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKeyPairResponse createKeyPairResponse = (CreateKeyPairResponse) o;
    return Objects.equals(this.fingerPrint, createKeyPairResponse.fingerPrint) &&
        Objects.equals(this.keyPairId, createKeyPairResponse.keyPairId) &&
        Objects.equals(this.keyPairName, createKeyPairResponse.keyPairName) &&
        Objects.equals(this.privateKey, createKeyPairResponse.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerPrint, keyPairId, keyPairName, privateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKeyPairResponse {\n");
    
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
