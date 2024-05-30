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
import com.volcengine.cdn.model.CustomVariableRulesForUpdateCdnConfigInput;
import com.volcengine.cdn.model.RewriteM3u8RuleForUpdateCdnConfigInput;
import com.volcengine.cdn.model.UrlAuthCustomActionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SignedUrlAuthActionForUpdateCdnConfigInput
 */



public class SignedUrlAuthActionForUpdateCdnConfigInput {
  @SerializedName("AuthAlgorithm")
  private String authAlgorithm = null;

  @SerializedName("BackupSecretKey")
  private String backupSecretKey = null;

  @SerializedName("CustomVariableRules")
  private CustomVariableRulesForUpdateCdnConfigInput customVariableRules = null;

  @SerializedName("Duration")
  private Long duration = null;

  @SerializedName("KeepOriginArg")
  private Boolean keepOriginArg = null;

  @SerializedName("MasterSecretKey")
  private String masterSecretKey = null;

  @SerializedName("MpdVarExpand")
  private Boolean mpdVarExpand = null;

  @SerializedName("RewriteM3u8")
  private Boolean rewriteM3u8 = null;

  @SerializedName("RewriteM3u8Rule")
  private RewriteM3u8RuleForUpdateCdnConfigInput rewriteM3u8Rule = null;

  @SerializedName("RewriteMpd")
  private Boolean rewriteMpd = null;

  @SerializedName("SignName")
  private String signName = null;

  @SerializedName("SignatureRule")
  private List<String> signatureRule = null;

  @SerializedName("TimeFormat")
  private String timeFormat = null;

  @SerializedName("TimeName")
  private String timeName = null;

  @SerializedName("URLAuthType")
  private String urLAuthType = null;

  @SerializedName("UrlAuthCustomAction")
  private UrlAuthCustomActionForUpdateCdnConfigInput urlAuthCustomAction = null;

  public SignedUrlAuthActionForUpdateCdnConfigInput authAlgorithm(String authAlgorithm) {
    this.authAlgorithm = authAlgorithm;
    return this;
  }

   /**
   * Get authAlgorithm
   * @return authAlgorithm
  **/
  @Schema(description = "")
  public String getAuthAlgorithm() {
    return authAlgorithm;
  }

  public void setAuthAlgorithm(String authAlgorithm) {
    this.authAlgorithm = authAlgorithm;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput backupSecretKey(String backupSecretKey) {
    this.backupSecretKey = backupSecretKey;
    return this;
  }

   /**
   * Get backupSecretKey
   * @return backupSecretKey
  **/
  @Schema(description = "")
  public String getBackupSecretKey() {
    return backupSecretKey;
  }

  public void setBackupSecretKey(String backupSecretKey) {
    this.backupSecretKey = backupSecretKey;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput customVariableRules(CustomVariableRulesForUpdateCdnConfigInput customVariableRules) {
    this.customVariableRules = customVariableRules;
    return this;
  }

   /**
   * Get customVariableRules
   * @return customVariableRules
  **/
  @Valid
  @Schema(description = "")
  public CustomVariableRulesForUpdateCdnConfigInput getCustomVariableRules() {
    return customVariableRules;
  }

  public void setCustomVariableRules(CustomVariableRulesForUpdateCdnConfigInput customVariableRules) {
    this.customVariableRules = customVariableRules;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput keepOriginArg(Boolean keepOriginArg) {
    this.keepOriginArg = keepOriginArg;
    return this;
  }

   /**
   * Get keepOriginArg
   * @return keepOriginArg
  **/
  @Schema(description = "")
  public Boolean isKeepOriginArg() {
    return keepOriginArg;
  }

  public void setKeepOriginArg(Boolean keepOriginArg) {
    this.keepOriginArg = keepOriginArg;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput masterSecretKey(String masterSecretKey) {
    this.masterSecretKey = masterSecretKey;
    return this;
  }

   /**
   * Get masterSecretKey
   * @return masterSecretKey
  **/
  @Schema(description = "")
  public String getMasterSecretKey() {
    return masterSecretKey;
  }

  public void setMasterSecretKey(String masterSecretKey) {
    this.masterSecretKey = masterSecretKey;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput mpdVarExpand(Boolean mpdVarExpand) {
    this.mpdVarExpand = mpdVarExpand;
    return this;
  }

   /**
   * Get mpdVarExpand
   * @return mpdVarExpand
  **/
  @Schema(description = "")
  public Boolean isMpdVarExpand() {
    return mpdVarExpand;
  }

  public void setMpdVarExpand(Boolean mpdVarExpand) {
    this.mpdVarExpand = mpdVarExpand;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput rewriteM3u8(Boolean rewriteM3u8) {
    this.rewriteM3u8 = rewriteM3u8;
    return this;
  }

   /**
   * Get rewriteM3u8
   * @return rewriteM3u8
  **/
  @Schema(description = "")
  public Boolean isRewriteM3u8() {
    return rewriteM3u8;
  }

  public void setRewriteM3u8(Boolean rewriteM3u8) {
    this.rewriteM3u8 = rewriteM3u8;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput rewriteM3u8Rule(RewriteM3u8RuleForUpdateCdnConfigInput rewriteM3u8Rule) {
    this.rewriteM3u8Rule = rewriteM3u8Rule;
    return this;
  }

   /**
   * Get rewriteM3u8Rule
   * @return rewriteM3u8Rule
  **/
  @Valid
  @Schema(description = "")
  public RewriteM3u8RuleForUpdateCdnConfigInput getRewriteM3u8Rule() {
    return rewriteM3u8Rule;
  }

  public void setRewriteM3u8Rule(RewriteM3u8RuleForUpdateCdnConfigInput rewriteM3u8Rule) {
    this.rewriteM3u8Rule = rewriteM3u8Rule;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput rewriteMpd(Boolean rewriteMpd) {
    this.rewriteMpd = rewriteMpd;
    return this;
  }

   /**
   * Get rewriteMpd
   * @return rewriteMpd
  **/
  @Schema(description = "")
  public Boolean isRewriteMpd() {
    return rewriteMpd;
  }

  public void setRewriteMpd(Boolean rewriteMpd) {
    this.rewriteMpd = rewriteMpd;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput signName(String signName) {
    this.signName = signName;
    return this;
  }

   /**
   * Get signName
   * @return signName
  **/
  @Schema(description = "")
  public String getSignName() {
    return signName;
  }

  public void setSignName(String signName) {
    this.signName = signName;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput signatureRule(List<String> signatureRule) {
    this.signatureRule = signatureRule;
    return this;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput addSignatureRuleItem(String signatureRuleItem) {
    if (this.signatureRule == null) {
      this.signatureRule = new ArrayList<String>();
    }
    this.signatureRule.add(signatureRuleItem);
    return this;
  }

   /**
   * Get signatureRule
   * @return signatureRule
  **/
  @Schema(description = "")
  public List<String> getSignatureRule() {
    return signatureRule;
  }

  public void setSignatureRule(List<String> signatureRule) {
    this.signatureRule = signatureRule;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * Get timeFormat
   * @return timeFormat
  **/
  @Schema(description = "")
  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput timeName(String timeName) {
    this.timeName = timeName;
    return this;
  }

   /**
   * Get timeName
   * @return timeName
  **/
  @Schema(description = "")
  public String getTimeName() {
    return timeName;
  }

  public void setTimeName(String timeName) {
    this.timeName = timeName;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput urLAuthType(String urLAuthType) {
    this.urLAuthType = urLAuthType;
    return this;
  }

   /**
   * Get urLAuthType
   * @return urLAuthType
  **/
  @Schema(description = "")
  public String getUrLAuthType() {
    return urLAuthType;
  }

  public void setUrLAuthType(String urLAuthType) {
    this.urLAuthType = urLAuthType;
  }

  public SignedUrlAuthActionForUpdateCdnConfigInput urlAuthCustomAction(UrlAuthCustomActionForUpdateCdnConfigInput urlAuthCustomAction) {
    this.urlAuthCustomAction = urlAuthCustomAction;
    return this;
  }

   /**
   * Get urlAuthCustomAction
   * @return urlAuthCustomAction
  **/
  @Valid
  @Schema(description = "")
  public UrlAuthCustomActionForUpdateCdnConfigInput getUrlAuthCustomAction() {
    return urlAuthCustomAction;
  }

  public void setUrlAuthCustomAction(UrlAuthCustomActionForUpdateCdnConfigInput urlAuthCustomAction) {
    this.urlAuthCustomAction = urlAuthCustomAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedUrlAuthActionForUpdateCdnConfigInput signedUrlAuthActionForUpdateCdnConfigInput = (SignedUrlAuthActionForUpdateCdnConfigInput) o;
    return Objects.equals(this.authAlgorithm, signedUrlAuthActionForUpdateCdnConfigInput.authAlgorithm) &&
        Objects.equals(this.backupSecretKey, signedUrlAuthActionForUpdateCdnConfigInput.backupSecretKey) &&
        Objects.equals(this.customVariableRules, signedUrlAuthActionForUpdateCdnConfigInput.customVariableRules) &&
        Objects.equals(this.duration, signedUrlAuthActionForUpdateCdnConfigInput.duration) &&
        Objects.equals(this.keepOriginArg, signedUrlAuthActionForUpdateCdnConfigInput.keepOriginArg) &&
        Objects.equals(this.masterSecretKey, signedUrlAuthActionForUpdateCdnConfigInput.masterSecretKey) &&
        Objects.equals(this.mpdVarExpand, signedUrlAuthActionForUpdateCdnConfigInput.mpdVarExpand) &&
        Objects.equals(this.rewriteM3u8, signedUrlAuthActionForUpdateCdnConfigInput.rewriteM3u8) &&
        Objects.equals(this.rewriteM3u8Rule, signedUrlAuthActionForUpdateCdnConfigInput.rewriteM3u8Rule) &&
        Objects.equals(this.rewriteMpd, signedUrlAuthActionForUpdateCdnConfigInput.rewriteMpd) &&
        Objects.equals(this.signName, signedUrlAuthActionForUpdateCdnConfigInput.signName) &&
        Objects.equals(this.signatureRule, signedUrlAuthActionForUpdateCdnConfigInput.signatureRule) &&
        Objects.equals(this.timeFormat, signedUrlAuthActionForUpdateCdnConfigInput.timeFormat) &&
        Objects.equals(this.timeName, signedUrlAuthActionForUpdateCdnConfigInput.timeName) &&
        Objects.equals(this.urLAuthType, signedUrlAuthActionForUpdateCdnConfigInput.urLAuthType) &&
        Objects.equals(this.urlAuthCustomAction, signedUrlAuthActionForUpdateCdnConfigInput.urlAuthCustomAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAlgorithm, backupSecretKey, customVariableRules, duration, keepOriginArg, masterSecretKey, mpdVarExpand, rewriteM3u8, rewriteM3u8Rule, rewriteMpd, signName, signatureRule, timeFormat, timeName, urLAuthType, urlAuthCustomAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedUrlAuthActionForUpdateCdnConfigInput {\n");
    
    sb.append("    authAlgorithm: ").append(toIndentedString(authAlgorithm)).append("\n");
    sb.append("    backupSecretKey: ").append(toIndentedString(backupSecretKey)).append("\n");
    sb.append("    customVariableRules: ").append(toIndentedString(customVariableRules)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    keepOriginArg: ").append(toIndentedString(keepOriginArg)).append("\n");
    sb.append("    masterSecretKey: ").append(toIndentedString(masterSecretKey)).append("\n");
    sb.append("    mpdVarExpand: ").append(toIndentedString(mpdVarExpand)).append("\n");
    sb.append("    rewriteM3u8: ").append(toIndentedString(rewriteM3u8)).append("\n");
    sb.append("    rewriteM3u8Rule: ").append(toIndentedString(rewriteM3u8Rule)).append("\n");
    sb.append("    rewriteMpd: ").append(toIndentedString(rewriteMpd)).append("\n");
    sb.append("    signName: ").append(toIndentedString(signName)).append("\n");
    sb.append("    signatureRule: ").append(toIndentedString(signatureRule)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    timeName: ").append(toIndentedString(timeName)).append("\n");
    sb.append("    urLAuthType: ").append(toIndentedString(urLAuthType)).append("\n");
    sb.append("    urlAuthCustomAction: ").append(toIndentedString(urlAuthCustomAction)).append("\n");
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
