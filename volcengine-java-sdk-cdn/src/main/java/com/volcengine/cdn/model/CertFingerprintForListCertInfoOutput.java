/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * CertFingerprintForListCertInfoOutput
 */



public class CertFingerprintForListCertInfoOutput {
  @SerializedName("Sha1")
  private String sha1 = null;

  @SerializedName("Sha256")
  private String sha256 = null;

  public CertFingerprintForListCertInfoOutput sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @Schema(description = "")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public CertFingerprintForListCertInfoOutput sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @Schema(description = "")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertFingerprintForListCertInfoOutput certFingerprintForListCertInfoOutput = (CertFingerprintForListCertInfoOutput) o;
    return Objects.equals(this.sha1, certFingerprintForListCertInfoOutput.sha1) &&
        Objects.equals(this.sha256, certFingerprintForListCertInfoOutput.sha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha1, sha256);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertFingerprintForListCertInfoOutput {\n");
    
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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
