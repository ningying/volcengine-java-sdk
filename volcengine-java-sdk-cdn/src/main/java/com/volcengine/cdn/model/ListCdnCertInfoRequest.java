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
 * ListCdnCertInfoRequest
 */



public class ListCdnCertInfoRequest {
  @SerializedName("CertId")
  private String certId = null;

  @SerializedName("CertType")
  private String certType = null;

  @SerializedName("Configured")
  private Boolean configured = null;

  @SerializedName("ConfiguredDomain")
  private String configuredDomain = null;

  @SerializedName("DnsName")
  private String dnsName = null;

  @SerializedName("EncryType")
  private String encryType = null;

  @SerializedName("PageNum")
  private Long pageNum = null;

  @SerializedName("PageSize")
  private Long pageSize = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("Status")
  private String status = null;

  public ListCdnCertInfoRequest certId(String certId) {
    this.certId = certId;
    return this;
  }

   /**
   * Get certId
   * @return certId
  **/
  @Schema(description = "")
  public String getCertId() {
    return certId;
  }

  public void setCertId(String certId) {
    this.certId = certId;
  }

  public ListCdnCertInfoRequest certType(String certType) {
    this.certType = certType;
    return this;
  }

   /**
   * Get certType
   * @return certType
  **/
  @Schema(description = "")
  public String getCertType() {
    return certType;
  }

  public void setCertType(String certType) {
    this.certType = certType;
  }

  public ListCdnCertInfoRequest configured(Boolean configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Get configured
   * @return configured
  **/
  @Schema(description = "")
  public Boolean isConfigured() {
    return configured;
  }

  public void setConfigured(Boolean configured) {
    this.configured = configured;
  }

  public ListCdnCertInfoRequest configuredDomain(String configuredDomain) {
    this.configuredDomain = configuredDomain;
    return this;
  }

   /**
   * Get configuredDomain
   * @return configuredDomain
  **/
  @Schema(description = "")
  public String getConfiguredDomain() {
    return configuredDomain;
  }

  public void setConfiguredDomain(String configuredDomain) {
    this.configuredDomain = configuredDomain;
  }

  public ListCdnCertInfoRequest dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

   /**
   * Get dnsName
   * @return dnsName
  **/
  @Schema(description = "")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  public ListCdnCertInfoRequest encryType(String encryType) {
    this.encryType = encryType;
    return this;
  }

   /**
   * Get encryType
   * @return encryType
  **/
  @Schema(description = "")
  public String getEncryType() {
    return encryType;
  }

  public void setEncryType(String encryType) {
    this.encryType = encryType;
  }

  public ListCdnCertInfoRequest pageNum(Long pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @Schema(description = "")
  public Long getPageNum() {
    return pageNum;
  }

  public void setPageNum(Long pageNum) {
    this.pageNum = pageNum;
  }

  public ListCdnCertInfoRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListCdnCertInfoRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ListCdnCertInfoRequest status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCdnCertInfoRequest listCdnCertInfoRequest = (ListCdnCertInfoRequest) o;
    return Objects.equals(this.certId, listCdnCertInfoRequest.certId) &&
        Objects.equals(this.certType, listCdnCertInfoRequest.certType) &&
        Objects.equals(this.configured, listCdnCertInfoRequest.configured) &&
        Objects.equals(this.configuredDomain, listCdnCertInfoRequest.configuredDomain) &&
        Objects.equals(this.dnsName, listCdnCertInfoRequest.dnsName) &&
        Objects.equals(this.encryType, listCdnCertInfoRequest.encryType) &&
        Objects.equals(this.pageNum, listCdnCertInfoRequest.pageNum) &&
        Objects.equals(this.pageSize, listCdnCertInfoRequest.pageSize) &&
        Objects.equals(this.source, listCdnCertInfoRequest.source) &&
        Objects.equals(this.status, listCdnCertInfoRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certId, certType, configured, configuredDomain, dnsName, encryType, pageNum, pageSize, source, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCdnCertInfoRequest {\n");
    
    sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    configuredDomain: ").append(toIndentedString(configuredDomain)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    encryType: ").append(toIndentedString(encryType)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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