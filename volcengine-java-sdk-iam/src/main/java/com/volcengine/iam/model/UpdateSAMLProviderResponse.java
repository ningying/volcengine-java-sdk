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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * UpdateSAMLProviderResponse
 */



public class UpdateSAMLProviderResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("SAMLProviderName")
  private String saMLProviderName = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public UpdateSAMLProviderResponse createDate(String createDate) {
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

  public UpdateSAMLProviderResponse description(String description) {
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

  public UpdateSAMLProviderResponse saMLProviderName(String saMLProviderName) {
    this.saMLProviderName = saMLProviderName;
    return this;
  }

   /**
   * Get saMLProviderName
   * @return saMLProviderName
  **/
  @Schema(description = "")
  public String getSaMLProviderName() {
    return saMLProviderName;
  }

  public void setSaMLProviderName(String saMLProviderName) {
    this.saMLProviderName = saMLProviderName;
  }

  public UpdateSAMLProviderResponse ssOType(Integer ssOType) {
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

  public UpdateSAMLProviderResponse status(Integer status) {
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

  public UpdateSAMLProviderResponse trn(String trn) {
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

  public UpdateSAMLProviderResponse updateDate(String updateDate) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSAMLProviderResponse updateSAMLProviderResponse = (UpdateSAMLProviderResponse) o;
    return Objects.equals(this.createDate, updateSAMLProviderResponse.createDate) &&
        Objects.equals(this.description, updateSAMLProviderResponse.description) &&
        Objects.equals(this.saMLProviderName, updateSAMLProviderResponse.saMLProviderName) &&
        Objects.equals(this.ssOType, updateSAMLProviderResponse.ssOType) &&
        Objects.equals(this.status, updateSAMLProviderResponse.status) &&
        Objects.equals(this.trn, updateSAMLProviderResponse.trn) &&
        Objects.equals(this.updateDate, updateSAMLProviderResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, description, saMLProviderName, ssOType, status, trn, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSAMLProviderResponse {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    saMLProviderName: ").append(toIndentedString(saMLProviderName)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
