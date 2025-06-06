/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * RemoveThumbprintFromOIDCProviderRequest
 */



public class RemoveThumbprintFromOIDCProviderRequest {
  @SerializedName("OIDCProviderName")
  private String oiDCProviderName = null;

  @SerializedName("Thumbprint")
  private String thumbprint = null;

  public RemoveThumbprintFromOIDCProviderRequest oiDCProviderName(String oiDCProviderName) {
    this.oiDCProviderName = oiDCProviderName;
    return this;
  }

   /**
   * Get oiDCProviderName
   * @return oiDCProviderName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOiDCProviderName() {
    return oiDCProviderName;
  }

  public void setOiDCProviderName(String oiDCProviderName) {
    this.oiDCProviderName = oiDCProviderName;
  }

  public RemoveThumbprintFromOIDCProviderRequest thumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * Get thumbprint
   * @return thumbprint
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveThumbprintFromOIDCProviderRequest removeThumbprintFromOIDCProviderRequest = (RemoveThumbprintFromOIDCProviderRequest) o;
    return Objects.equals(this.oiDCProviderName, removeThumbprintFromOIDCProviderRequest.oiDCProviderName) &&
        Objects.equals(this.thumbprint, removeThumbprintFromOIDCProviderRequest.thumbprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oiDCProviderName, thumbprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveThumbprintFromOIDCProviderRequest {\n");
    
    sb.append("    oiDCProviderName: ").append(toIndentedString(oiDCProviderName)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
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
