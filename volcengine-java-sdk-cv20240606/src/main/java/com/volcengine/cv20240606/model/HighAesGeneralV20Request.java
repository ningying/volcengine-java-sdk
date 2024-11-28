/*
 * cv20240606
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cv20240606.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cv20240606.model.LogoInfoForHighAesGeneralV20Input;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HighAesGeneralV20Request
 */



public class HighAesGeneralV20Request {
  @SerializedName("ddim_steps")
  private Integer ddimSteps = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("logo_info")
  private LogoInfoForHighAesGeneralV20Input logoInfo = null;

  @SerializedName("model_version")
  private String modelVersion = null;

  @SerializedName("prompt")
  private String prompt = null;

  @SerializedName("req_key")
  private String reqKey = null;

  @SerializedName("return_url")
  private Boolean returnUrl = null;

  @SerializedName("scale")
  private Float scale = null;

  @SerializedName("seed")
  private Integer seed = null;

  @SerializedName("use_rephraser")
  private Boolean useRephraser = null;

  @SerializedName("use_sr")
  private Boolean useSr = null;

  @SerializedName("width")
  private Integer width = null;

  public HighAesGeneralV20Request ddimSteps(Integer ddimSteps) {
    this.ddimSteps = ddimSteps;
    return this;
  }

   /**
   * Get ddimSteps
   * @return ddimSteps
  **/
  @Schema(description = "")
  public Integer getDdimSteps() {
    return ddimSteps;
  }

  public void setDdimSteps(Integer ddimSteps) {
    this.ddimSteps = ddimSteps;
  }

  public HighAesGeneralV20Request height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public HighAesGeneralV20Request logoInfo(LogoInfoForHighAesGeneralV20Input logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForHighAesGeneralV20Input getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForHighAesGeneralV20Input logoInfo) {
    this.logoInfo = logoInfo;
  }

  public HighAesGeneralV20Request modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

   /**
   * Get modelVersion
   * @return modelVersion
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getModelVersion() {
    return modelVersion;
  }

  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }

  public HighAesGeneralV20Request prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public HighAesGeneralV20Request reqKey(String reqKey) {
    this.reqKey = reqKey;
    return this;
  }

   /**
   * Get reqKey
   * @return reqKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getReqKey() {
    return reqKey;
  }

  public void setReqKey(String reqKey) {
    this.reqKey = reqKey;
  }

  public HighAesGeneralV20Request returnUrl(Boolean returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Get returnUrl
   * @return returnUrl
  **/
  @Schema(description = "")
  public Boolean isReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(Boolean returnUrl) {
    this.returnUrl = returnUrl;
  }

  public HighAesGeneralV20Request scale(Float scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @Schema(description = "")
  public Float getScale() {
    return scale;
  }

  public void setScale(Float scale) {
    this.scale = scale;
  }

  public HighAesGeneralV20Request seed(Integer seed) {
    this.seed = seed;
    return this;
  }

   /**
   * Get seed
   * @return seed
  **/
  @Schema(description = "")
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public HighAesGeneralV20Request useRephraser(Boolean useRephraser) {
    this.useRephraser = useRephraser;
    return this;
  }

   /**
   * Get useRephraser
   * @return useRephraser
  **/
  @Schema(description = "")
  public Boolean isUseRephraser() {
    return useRephraser;
  }

  public void setUseRephraser(Boolean useRephraser) {
    this.useRephraser = useRephraser;
  }

  public HighAesGeneralV20Request useSr(Boolean useSr) {
    this.useSr = useSr;
    return this;
  }

   /**
   * Get useSr
   * @return useSr
  **/
  @Schema(description = "")
  public Boolean isUseSr() {
    return useSr;
  }

  public void setUseSr(Boolean useSr) {
    this.useSr = useSr;
  }

  public HighAesGeneralV20Request width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighAesGeneralV20Request highAesGeneralV20Request = (HighAesGeneralV20Request) o;
    return Objects.equals(this.ddimSteps, highAesGeneralV20Request.ddimSteps) &&
        Objects.equals(this.height, highAesGeneralV20Request.height) &&
        Objects.equals(this.logoInfo, highAesGeneralV20Request.logoInfo) &&
        Objects.equals(this.modelVersion, highAesGeneralV20Request.modelVersion) &&
        Objects.equals(this.prompt, highAesGeneralV20Request.prompt) &&
        Objects.equals(this.reqKey, highAesGeneralV20Request.reqKey) &&
        Objects.equals(this.returnUrl, highAesGeneralV20Request.returnUrl) &&
        Objects.equals(this.scale, highAesGeneralV20Request.scale) &&
        Objects.equals(this.seed, highAesGeneralV20Request.seed) &&
        Objects.equals(this.useRephraser, highAesGeneralV20Request.useRephraser) &&
        Objects.equals(this.useSr, highAesGeneralV20Request.useSr) &&
        Objects.equals(this.width, highAesGeneralV20Request.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddimSteps, height, logoInfo, modelVersion, prompt, reqKey, returnUrl, scale, seed, useRephraser, useSr, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighAesGeneralV20Request {\n");
    
    sb.append("    ddimSteps: ").append(toIndentedString(ddimSteps)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    useRephraser: ").append(toIndentedString(useRephraser)).append("\n");
    sb.append("    useSr: ").append(toIndentedString(useSr)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
