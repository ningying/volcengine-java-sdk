/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * DescribeSslVpnClientCertAttributesResponse
 */



public class DescribeSslVpnClientCertAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CaCertificate")
  private String caCertificate = null;

  @SerializedName("CertificateStatus")
  private String certificateStatus = null;

  @SerializedName("ClientCertificate")
  private String clientCertificate = null;

  @SerializedName("ClientKey")
  private String clientKey = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("OpenVpnClientConfig")
  private String openVpnClientConfig = null;

  @SerializedName("SslVpnClientCertId")
  private String sslVpnClientCertId = null;

  @SerializedName("SslVpnClientCertName")
  private String sslVpnClientCertName = null;

  @SerializedName("SslVpnServerId")
  private String sslVpnServerId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DescribeSslVpnClientCertAttributesResponse caCertificate(String caCertificate) {
    this.caCertificate = caCertificate;
    return this;
  }

   /**
   * Get caCertificate
   * @return caCertificate
  **/
  @Schema(description = "")
  public String getCaCertificate() {
    return caCertificate;
  }

  public void setCaCertificate(String caCertificate) {
    this.caCertificate = caCertificate;
  }

  public DescribeSslVpnClientCertAttributesResponse certificateStatus(String certificateStatus) {
    this.certificateStatus = certificateStatus;
    return this;
  }

   /**
   * Get certificateStatus
   * @return certificateStatus
  **/
  @Schema(description = "")
  public String getCertificateStatus() {
    return certificateStatus;
  }

  public void setCertificateStatus(String certificateStatus) {
    this.certificateStatus = certificateStatus;
  }

  public DescribeSslVpnClientCertAttributesResponse clientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

   /**
   * Get clientCertificate
   * @return clientCertificate
  **/
  @Schema(description = "")
  public String getClientCertificate() {
    return clientCertificate;
  }

  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }

  public DescribeSslVpnClientCertAttributesResponse clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Get clientKey
   * @return clientKey
  **/
  @Schema(description = "")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public DescribeSslVpnClientCertAttributesResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DescribeSslVpnClientCertAttributesResponse description(String description) {
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

  public DescribeSslVpnClientCertAttributesResponse expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public DescribeSslVpnClientCertAttributesResponse openVpnClientConfig(String openVpnClientConfig) {
    this.openVpnClientConfig = openVpnClientConfig;
    return this;
  }

   /**
   * Get openVpnClientConfig
   * @return openVpnClientConfig
  **/
  @Schema(description = "")
  public String getOpenVpnClientConfig() {
    return openVpnClientConfig;
  }

  public void setOpenVpnClientConfig(String openVpnClientConfig) {
    this.openVpnClientConfig = openVpnClientConfig;
  }

  public DescribeSslVpnClientCertAttributesResponse sslVpnClientCertId(String sslVpnClientCertId) {
    this.sslVpnClientCertId = sslVpnClientCertId;
    return this;
  }

   /**
   * Get sslVpnClientCertId
   * @return sslVpnClientCertId
  **/
  @Schema(description = "")
  public String getSslVpnClientCertId() {
    return sslVpnClientCertId;
  }

  public void setSslVpnClientCertId(String sslVpnClientCertId) {
    this.sslVpnClientCertId = sslVpnClientCertId;
  }

  public DescribeSslVpnClientCertAttributesResponse sslVpnClientCertName(String sslVpnClientCertName) {
    this.sslVpnClientCertName = sslVpnClientCertName;
    return this;
  }

   /**
   * Get sslVpnClientCertName
   * @return sslVpnClientCertName
  **/
  @Schema(description = "")
  public String getSslVpnClientCertName() {
    return sslVpnClientCertName;
  }

  public void setSslVpnClientCertName(String sslVpnClientCertName) {
    this.sslVpnClientCertName = sslVpnClientCertName;
  }

  public DescribeSslVpnClientCertAttributesResponse sslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
    return this;
  }

   /**
   * Get sslVpnServerId
   * @return sslVpnServerId
  **/
  @Schema(description = "")
  public String getSslVpnServerId() {
    return sslVpnServerId;
  }

  public void setSslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
  }

  public DescribeSslVpnClientCertAttributesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeSslVpnClientCertAttributesResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSslVpnClientCertAttributesResponse describeSslVpnClientCertAttributesResponse = (DescribeSslVpnClientCertAttributesResponse) o;
    return Objects.equals(this.caCertificate, describeSslVpnClientCertAttributesResponse.caCertificate) &&
        Objects.equals(this.certificateStatus, describeSslVpnClientCertAttributesResponse.certificateStatus) &&
        Objects.equals(this.clientCertificate, describeSslVpnClientCertAttributesResponse.clientCertificate) &&
        Objects.equals(this.clientKey, describeSslVpnClientCertAttributesResponse.clientKey) &&
        Objects.equals(this.creationTime, describeSslVpnClientCertAttributesResponse.creationTime) &&
        Objects.equals(this.description, describeSslVpnClientCertAttributesResponse.description) &&
        Objects.equals(this.expiredTime, describeSslVpnClientCertAttributesResponse.expiredTime) &&
        Objects.equals(this.openVpnClientConfig, describeSslVpnClientCertAttributesResponse.openVpnClientConfig) &&
        Objects.equals(this.sslVpnClientCertId, describeSslVpnClientCertAttributesResponse.sslVpnClientCertId) &&
        Objects.equals(this.sslVpnClientCertName, describeSslVpnClientCertAttributesResponse.sslVpnClientCertName) &&
        Objects.equals(this.sslVpnServerId, describeSslVpnClientCertAttributesResponse.sslVpnServerId) &&
        Objects.equals(this.status, describeSslVpnClientCertAttributesResponse.status) &&
        Objects.equals(this.updateTime, describeSslVpnClientCertAttributesResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertificate, certificateStatus, clientCertificate, clientKey, creationTime, description, expiredTime, openVpnClientConfig, sslVpnClientCertId, sslVpnClientCertName, sslVpnServerId, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSslVpnClientCertAttributesResponse {\n");
    
    sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
    sb.append("    certificateStatus: ").append(toIndentedString(certificateStatus)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    openVpnClientConfig: ").append(toIndentedString(openVpnClientConfig)).append("\n");
    sb.append("    sslVpnClientCertId: ").append(toIndentedString(sslVpnClientCertId)).append("\n");
    sb.append("    sslVpnClientCertName: ").append(toIndentedString(sslVpnClientCertName)).append("\n");
    sb.append("    sslVpnServerId: ").append(toIndentedString(sslVpnServerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
