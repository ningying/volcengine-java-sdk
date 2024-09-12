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
 * GetSAMLProviderResponse
 */



public class GetSAMLProviderResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CertificateExpireTime")
  private String certificateExpireTime = null;

  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EncodedSAMLMetadataDocument")
  private String encodedSAMLMetadataDocument = null;

  @SerializedName("ProviderName")
  private String providerName = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public GetSAMLProviderResponse certificateExpireTime(String certificateExpireTime) {
    this.certificateExpireTime = certificateExpireTime;
    return this;
  }

   /**
   * Get certificateExpireTime
   * @return certificateExpireTime
  **/
  @Schema(description = "")
  public String getCertificateExpireTime() {
    return certificateExpireTime;
  }

  public void setCertificateExpireTime(String certificateExpireTime) {
    this.certificateExpireTime = certificateExpireTime;
  }

  public GetSAMLProviderResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public GetSAMLProviderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetSAMLProviderResponse encodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
    this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
    return this;
  }

   /**
   * Get encodedSAMLMetadataDocument
   * @return encodedSAMLMetadataDocument
  **/
  @Schema(description = "")
  public String getEncodedSAMLMetadataDocument() {
    return encodedSAMLMetadataDocument;
  }

  public void setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
    this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
  }

  public GetSAMLProviderResponse providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @Schema(description = "")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public GetSAMLProviderResponse ssOType(Integer ssOType) {
    this.ssOType = ssOType;
    return this;
  }

   /**
   * Get ssOType
   * @return ssOType
  **/
  @Schema(description = "")
  public Integer getSsOType() {
    return ssOType;
  }

  public void setSsOType(Integer ssOType) {
    this.ssOType = ssOType;
  }

  public GetSAMLProviderResponse status(Integer status) {
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

  public GetSAMLProviderResponse trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @Schema(description = "")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public GetSAMLProviderResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSAMLProviderResponse getSAMLProviderResponse = (GetSAMLProviderResponse) o;
    return Objects.equals(this.certificateExpireTime, getSAMLProviderResponse.certificateExpireTime) &&
        Objects.equals(this.createDate, getSAMLProviderResponse.createDate) &&
        Objects.equals(this.description, getSAMLProviderResponse.description) &&
        Objects.equals(this.encodedSAMLMetadataDocument, getSAMLProviderResponse.encodedSAMLMetadataDocument) &&
        Objects.equals(this.providerName, getSAMLProviderResponse.providerName) &&
        Objects.equals(this.ssOType, getSAMLProviderResponse.ssOType) &&
        Objects.equals(this.status, getSAMLProviderResponse.status) &&
        Objects.equals(this.trn, getSAMLProviderResponse.trn) &&
        Objects.equals(this.updateDate, getSAMLProviderResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateExpireTime, createDate, description, encodedSAMLMetadataDocument, providerName, ssOType, status, trn, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSAMLProviderResponse {\n");
    
    sb.append("    certificateExpireTime: ").append(toIndentedString(certificateExpireTime)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encodedSAMLMetadataDocument: ").append(toIndentedString(encodedSAMLMetadataDocument)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    ssOType: ").append(toIndentedString(ssOType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
