/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CertificateForDescribeAllCertificatesOutput
 */


public class CertificateForDescribeAllCertificatesOutput {
  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("CertificateName")
  private String certificateName = null;

  @SerializedName("CertificateType")
  private String certificateType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DomainName")
  private String domainName = null;

  @SerializedName("ExpiredAt")
  private String expiredAt = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  public CertificateForDescribeAllCertificatesOutput certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @Schema(description = "")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public CertificateForDescribeAllCertificatesOutput certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

   /**
   * Get certificateName
   * @return certificateName
  **/
  @Schema(description = "")
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public CertificateForDescribeAllCertificatesOutput certificateType(String certificateType) {
    this.certificateType = certificateType;
    return this;
  }

   /**
   * Get certificateType
   * @return certificateType
  **/
  @Schema(description = "")
  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }

  public CertificateForDescribeAllCertificatesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public CertificateForDescribeAllCertificatesOutput description(String description) {
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

  public CertificateForDescribeAllCertificatesOutput domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public CertificateForDescribeAllCertificatesOutput expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @Schema(description = "")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public CertificateForDescribeAllCertificatesOutput listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public CertificateForDescribeAllCertificatesOutput addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public CertificateForDescribeAllCertificatesOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CertificateForDescribeAllCertificatesOutput status(String status) {
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
    CertificateForDescribeAllCertificatesOutput certificateForDescribeAllCertificatesOutput = (CertificateForDescribeAllCertificatesOutput) o;
    return Objects.equals(this.certificateId, certificateForDescribeAllCertificatesOutput.certificateId) &&
        Objects.equals(this.certificateName, certificateForDescribeAllCertificatesOutput.certificateName) &&
        Objects.equals(this.certificateType, certificateForDescribeAllCertificatesOutput.certificateType) &&
        Objects.equals(this.createTime, certificateForDescribeAllCertificatesOutput.createTime) &&
        Objects.equals(this.description, certificateForDescribeAllCertificatesOutput.description) &&
        Objects.equals(this.domainName, certificateForDescribeAllCertificatesOutput.domainName) &&
        Objects.equals(this.expiredAt, certificateForDescribeAllCertificatesOutput.expiredAt) &&
        Objects.equals(this.listeners, certificateForDescribeAllCertificatesOutput.listeners) &&
        Objects.equals(this.projectName, certificateForDescribeAllCertificatesOutput.projectName) &&
        Objects.equals(this.status, certificateForDescribeAllCertificatesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, certificateName, certificateType, createTime, description, domainName, expiredAt, listeners, projectName, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateForDescribeAllCertificatesOutput {\n");
    
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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