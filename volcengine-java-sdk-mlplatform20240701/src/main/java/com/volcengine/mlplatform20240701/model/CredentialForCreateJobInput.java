/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

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
 * CredentialForCreateJobInput
 */



public class CredentialForCreateJobInput {
  @SerializedName("RegistryToken")
  private String registryToken = null;

  @SerializedName("RegistryUsername")
  private String registryUsername = null;

  public CredentialForCreateJobInput registryToken(String registryToken) {
    this.registryToken = registryToken;
    return this;
  }

   /**
   * Get registryToken
   * @return registryToken
  **/
  @Schema(description = "")
  public String getRegistryToken() {
    return registryToken;
  }

  public void setRegistryToken(String registryToken) {
    this.registryToken = registryToken;
  }

  public CredentialForCreateJobInput registryUsername(String registryUsername) {
    this.registryUsername = registryUsername;
    return this;
  }

   /**
   * Get registryUsername
   * @return registryUsername
  **/
  @Schema(description = "")
  public String getRegistryUsername() {
    return registryUsername;
  }

  public void setRegistryUsername(String registryUsername) {
    this.registryUsername = registryUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialForCreateJobInput credentialForCreateJobInput = (CredentialForCreateJobInput) o;
    return Objects.equals(this.registryToken, credentialForCreateJobInput.registryToken) &&
        Objects.equals(this.registryUsername, credentialForCreateJobInput.registryUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryToken, registryUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialForCreateJobInput {\n");
    
    sb.append("    registryToken: ").append(toIndentedString(registryToken)).append("\n");
    sb.append("    registryUsername: ").append(toIndentedString(registryUsername)).append("\n");
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
