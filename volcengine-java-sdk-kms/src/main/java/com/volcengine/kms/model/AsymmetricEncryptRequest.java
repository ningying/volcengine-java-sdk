/*
 * kms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kms.model;

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
 * AsymmetricEncryptRequest
 */



public class AsymmetricEncryptRequest {
  @SerializedName("Algorithm")
  private String algorithm = null;

  @SerializedName("KeyID")
  private String keyID = null;

  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeyringName")
  private String keyringName = null;

  @SerializedName("Plaintext")
  private String plaintext = null;

  public AsymmetricEncryptRequest algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public AsymmetricEncryptRequest keyID(String keyID) {
    this.keyID = keyID;
    return this;
  }

   /**
   * Get keyID
   * @return keyID
  **/
  @Schema(description = "")
  public String getKeyID() {
    return keyID;
  }

  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }

  public AsymmetricEncryptRequest keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Get keyName
   * @return keyName
  **/
 @Size(min=2,max=31)  @Schema(description = "")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public AsymmetricEncryptRequest keyringName(String keyringName) {
    this.keyringName = keyringName;
    return this;
  }

   /**
   * Get keyringName
   * @return keyringName
  **/
 @Size(min=2,max=31)  @Schema(description = "")
  public String getKeyringName() {
    return keyringName;
  }

  public void setKeyringName(String keyringName) {
    this.keyringName = keyringName;
  }

  public AsymmetricEncryptRequest plaintext(String plaintext) {
    this.plaintext = plaintext;
    return this;
  }

   /**
   * Get plaintext
   * @return plaintext
  **/
  @NotNull
 @Size(min=1,max=4096)  @Schema(required = true, description = "")
  public String getPlaintext() {
    return plaintext;
  }

  public void setPlaintext(String plaintext) {
    this.plaintext = plaintext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsymmetricEncryptRequest asymmetricEncryptRequest = (AsymmetricEncryptRequest) o;
    return Objects.equals(this.algorithm, asymmetricEncryptRequest.algorithm) &&
        Objects.equals(this.keyID, asymmetricEncryptRequest.keyID) &&
        Objects.equals(this.keyName, asymmetricEncryptRequest.keyName) &&
        Objects.equals(this.keyringName, asymmetricEncryptRequest.keyringName) &&
        Objects.equals(this.plaintext, asymmetricEncryptRequest.plaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, keyID, keyName, keyringName, plaintext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsymmetricEncryptRequest {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyringName: ").append(toIndentedString(keyringName)).append("\n");
    sb.append("    plaintext: ").append(toIndentedString(plaintext)).append("\n");
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
