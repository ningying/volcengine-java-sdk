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
import com.volcengine.ecs.model.ErrorForDeleteKeyPairsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OperationDetailForDeleteKeyPairsOutput
 */


public class OperationDetailForDeleteKeyPairsOutput {
  @SerializedName("Error")
  private ErrorForDeleteKeyPairsOutput error = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  public OperationDetailForDeleteKeyPairsOutput error(ErrorForDeleteKeyPairsOutput error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Valid
  @Schema(description = "")
  public ErrorForDeleteKeyPairsOutput getError() {
    return error;
  }

  public void setError(ErrorForDeleteKeyPairsOutput error) {
    this.error = error;
  }

  public OperationDetailForDeleteKeyPairsOutput keyPairName(String keyPairName) {
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
    OperationDetailForDeleteKeyPairsOutput operationDetailForDeleteKeyPairsOutput = (OperationDetailForDeleteKeyPairsOutput) o;
    return Objects.equals(this.error, operationDetailForDeleteKeyPairsOutput.error) &&
        Objects.equals(this.keyPairName, operationDetailForDeleteKeyPairsOutput.keyPairName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, keyPairName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDetailForDeleteKeyPairsOutput {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
