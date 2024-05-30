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
import com.volcengine.cdn.model.CertCheckForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.CertInfoForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.CertInfoListForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.ForcedRedirectForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.HstsForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HTTPSForBatchUpdateCdnConfigInput
 */



public class HTTPSForBatchUpdateCdnConfigInput {
  @SerializedName("CertCheck")
  private CertCheckForBatchUpdateCdnConfigInput certCheck = null;

  @SerializedName("CertInfo")
  private CertInfoForBatchUpdateCdnConfigInput certInfo = null;

  @SerializedName("CertInfoList")
  private List<CertInfoListForBatchUpdateCdnConfigInput> certInfoList = null;

  @SerializedName("DisableHttp")
  private Boolean disableHttp = null;

  @SerializedName("ForcedRedirect")
  private ForcedRedirectForBatchUpdateCdnConfigInput forcedRedirect = null;

  @SerializedName("HTTP2")
  private Boolean htTP2 = null;

  @SerializedName("Hsts")
  private HstsForBatchUpdateCdnConfigInput hsts = null;

  @SerializedName("OCSP")
  private Boolean OCSP = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  @SerializedName("TlsVersion")
  private List<String> tlsVersion = null;

  public HTTPSForBatchUpdateCdnConfigInput certCheck(CertCheckForBatchUpdateCdnConfigInput certCheck) {
    this.certCheck = certCheck;
    return this;
  }

   /**
   * Get certCheck
   * @return certCheck
  **/
  @Valid
  @Schema(description = "")
  public CertCheckForBatchUpdateCdnConfigInput getCertCheck() {
    return certCheck;
  }

  public void setCertCheck(CertCheckForBatchUpdateCdnConfigInput certCheck) {
    this.certCheck = certCheck;
  }

  public HTTPSForBatchUpdateCdnConfigInput certInfo(CertInfoForBatchUpdateCdnConfigInput certInfo) {
    this.certInfo = certInfo;
    return this;
  }

   /**
   * Get certInfo
   * @return certInfo
  **/
  @Valid
  @Schema(description = "")
  public CertInfoForBatchUpdateCdnConfigInput getCertInfo() {
    return certInfo;
  }

  public void setCertInfo(CertInfoForBatchUpdateCdnConfigInput certInfo) {
    this.certInfo = certInfo;
  }

  public HTTPSForBatchUpdateCdnConfigInput certInfoList(List<CertInfoListForBatchUpdateCdnConfigInput> certInfoList) {
    this.certInfoList = certInfoList;
    return this;
  }

  public HTTPSForBatchUpdateCdnConfigInput addCertInfoListItem(CertInfoListForBatchUpdateCdnConfigInput certInfoListItem) {
    if (this.certInfoList == null) {
      this.certInfoList = new ArrayList<CertInfoListForBatchUpdateCdnConfigInput>();
    }
    this.certInfoList.add(certInfoListItem);
    return this;
  }

   /**
   * Get certInfoList
   * @return certInfoList
  **/
  @Valid
  @Schema(description = "")
  public List<CertInfoListForBatchUpdateCdnConfigInput> getCertInfoList() {
    return certInfoList;
  }

  public void setCertInfoList(List<CertInfoListForBatchUpdateCdnConfigInput> certInfoList) {
    this.certInfoList = certInfoList;
  }

  public HTTPSForBatchUpdateCdnConfigInput disableHttp(Boolean disableHttp) {
    this.disableHttp = disableHttp;
    return this;
  }

   /**
   * Get disableHttp
   * @return disableHttp
  **/
  @Schema(description = "")
  public Boolean isDisableHttp() {
    return disableHttp;
  }

  public void setDisableHttp(Boolean disableHttp) {
    this.disableHttp = disableHttp;
  }

  public HTTPSForBatchUpdateCdnConfigInput forcedRedirect(ForcedRedirectForBatchUpdateCdnConfigInput forcedRedirect) {
    this.forcedRedirect = forcedRedirect;
    return this;
  }

   /**
   * Get forcedRedirect
   * @return forcedRedirect
  **/
  @Valid
  @Schema(description = "")
  public ForcedRedirectForBatchUpdateCdnConfigInput getForcedRedirect() {
    return forcedRedirect;
  }

  public void setForcedRedirect(ForcedRedirectForBatchUpdateCdnConfigInput forcedRedirect) {
    this.forcedRedirect = forcedRedirect;
  }

  public HTTPSForBatchUpdateCdnConfigInput htTP2(Boolean htTP2) {
    this.htTP2 = htTP2;
    return this;
  }

   /**
   * Get htTP2
   * @return htTP2
  **/
  @Schema(description = "")
  public Boolean isHtTP2() {
    return htTP2;
  }

  public void setHtTP2(Boolean htTP2) {
    this.htTP2 = htTP2;
  }

  public HTTPSForBatchUpdateCdnConfigInput hsts(HstsForBatchUpdateCdnConfigInput hsts) {
    this.hsts = hsts;
    return this;
  }

   /**
   * Get hsts
   * @return hsts
  **/
  @Valid
  @Schema(description = "")
  public HstsForBatchUpdateCdnConfigInput getHsts() {
    return hsts;
  }

  public void setHsts(HstsForBatchUpdateCdnConfigInput hsts) {
    this.hsts = hsts;
  }

  public HTTPSForBatchUpdateCdnConfigInput OCSP(Boolean OCSP) {
    this.OCSP = OCSP;
    return this;
  }

   /**
   * Get OCSP
   * @return OCSP
  **/
  @Schema(description = "")
  public Boolean isOCSP() {
    return OCSP;
  }

  public void setOCSP(Boolean OCSP) {
    this.OCSP = OCSP;
  }

  public HTTPSForBatchUpdateCdnConfigInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }

  public HTTPSForBatchUpdateCdnConfigInput tlsVersion(List<String> tlsVersion) {
    this.tlsVersion = tlsVersion;
    return this;
  }

  public HTTPSForBatchUpdateCdnConfigInput addTlsVersionItem(String tlsVersionItem) {
    if (this.tlsVersion == null) {
      this.tlsVersion = new ArrayList<String>();
    }
    this.tlsVersion.add(tlsVersionItem);
    return this;
  }

   /**
   * Get tlsVersion
   * @return tlsVersion
  **/
  @Schema(description = "")
  public List<String> getTlsVersion() {
    return tlsVersion;
  }

  public void setTlsVersion(List<String> tlsVersion) {
    this.tlsVersion = tlsVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSForBatchUpdateCdnConfigInput htTPSForBatchUpdateCdnConfigInput = (HTTPSForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.certCheck, htTPSForBatchUpdateCdnConfigInput.certCheck) &&
        Objects.equals(this.certInfo, htTPSForBatchUpdateCdnConfigInput.certInfo) &&
        Objects.equals(this.certInfoList, htTPSForBatchUpdateCdnConfigInput.certInfoList) &&
        Objects.equals(this.disableHttp, htTPSForBatchUpdateCdnConfigInput.disableHttp) &&
        Objects.equals(this.forcedRedirect, htTPSForBatchUpdateCdnConfigInput.forcedRedirect) &&
        Objects.equals(this.htTP2, htTPSForBatchUpdateCdnConfigInput.htTP2) &&
        Objects.equals(this.hsts, htTPSForBatchUpdateCdnConfigInput.hsts) &&
        Objects.equals(this.OCSP, htTPSForBatchUpdateCdnConfigInput.OCSP) &&
        Objects.equals(this._switch, htTPSForBatchUpdateCdnConfigInput._switch) &&
        Objects.equals(this.tlsVersion, htTPSForBatchUpdateCdnConfigInput.tlsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certCheck, certInfo, certInfoList, disableHttp, forcedRedirect, htTP2, hsts, OCSP, _switch, tlsVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPSForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    certCheck: ").append(toIndentedString(certCheck)).append("\n");
    sb.append("    certInfo: ").append(toIndentedString(certInfo)).append("\n");
    sb.append("    certInfoList: ").append(toIndentedString(certInfoList)).append("\n");
    sb.append("    disableHttp: ").append(toIndentedString(disableHttp)).append("\n");
    sb.append("    forcedRedirect: ").append(toIndentedString(forcedRedirect)).append("\n");
    sb.append("    htTP2: ").append(toIndentedString(htTP2)).append("\n");
    sb.append("    hsts: ").append(toIndentedString(hsts)).append("\n");
    sb.append("    OCSP: ").append(toIndentedString(OCSP)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    tlsVersion: ").append(toIndentedString(tlsVersion)).append("\n");
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
