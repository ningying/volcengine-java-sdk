/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * IpFailedForDeleteProhibitionBlackOutput
 */



public class IpFailedForDeleteProhibitionBlackOutput {
  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("Reason")
  private String reason = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  public IpFailedForDeleteProhibitionBlackOutput ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IpFailedForDeleteProhibitionBlackOutput reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IpFailedForDeleteProhibitionBlackOutput ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @Schema(description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public IpFailedForDeleteProhibitionBlackOutput ruleTag(String ruleTag) {
    this.ruleTag = ruleTag;
    return this;
  }

   /**
   * Get ruleTag
   * @return ruleTag
  **/
  @Schema(description = "")
  public String getRuleTag() {
    return ruleTag;
  }

  public void setRuleTag(String ruleTag) {
    this.ruleTag = ruleTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpFailedForDeleteProhibitionBlackOutput ipFailedForDeleteProhibitionBlackOutput = (IpFailedForDeleteProhibitionBlackOutput) o;
    return Objects.equals(this.ip, ipFailedForDeleteProhibitionBlackOutput.ip) &&
        Objects.equals(this.reason, ipFailedForDeleteProhibitionBlackOutput.reason) &&
        Objects.equals(this.ruleName, ipFailedForDeleteProhibitionBlackOutput.ruleName) &&
        Objects.equals(this.ruleTag, ipFailedForDeleteProhibitionBlackOutput.ruleTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, reason, ruleName, ruleTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpFailedForDeleteProhibitionBlackOutput {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
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
