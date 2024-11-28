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
import com.volcengine.cv20240606.model.LogoInfoForText2ImgXLSftInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Text2ImgXLSftRequest
 */



public class Text2ImgXLSftRequest {
  @SerializedName("ddim_step")
  private Integer ddimStep = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("logo_info")
  private LogoInfoForText2ImgXLSftInput logoInfo = null;

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

  @SerializedName("width")
  private Integer width = null;

  public Text2ImgXLSftRequest ddimStep(Integer ddimStep) {
    this.ddimStep = ddimStep;
    return this;
  }

   /**
   * Get ddimStep
   * @return ddimStep
  **/
  @Schema(description = "")
  public Integer getDdimStep() {
    return ddimStep;
  }

  public void setDdimStep(Integer ddimStep) {
    this.ddimStep = ddimStep;
  }

  public Text2ImgXLSftRequest height(Integer height) {
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

  public Text2ImgXLSftRequest logoInfo(LogoInfoForText2ImgXLSftInput logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForText2ImgXLSftInput getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForText2ImgXLSftInput logoInfo) {
    this.logoInfo = logoInfo;
  }

  public Text2ImgXLSftRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @Schema(description = "")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public Text2ImgXLSftRequest reqKey(String reqKey) {
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

  public Text2ImgXLSftRequest returnUrl(Boolean returnUrl) {
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

  public Text2ImgXLSftRequest scale(Float scale) {
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

  public Text2ImgXLSftRequest seed(Integer seed) {
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

  public Text2ImgXLSftRequest width(Integer width) {
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
    Text2ImgXLSftRequest text2ImgXLSftRequest = (Text2ImgXLSftRequest) o;
    return Objects.equals(this.ddimStep, text2ImgXLSftRequest.ddimStep) &&
        Objects.equals(this.height, text2ImgXLSftRequest.height) &&
        Objects.equals(this.logoInfo, text2ImgXLSftRequest.logoInfo) &&
        Objects.equals(this.prompt, text2ImgXLSftRequest.prompt) &&
        Objects.equals(this.reqKey, text2ImgXLSftRequest.reqKey) &&
        Objects.equals(this.returnUrl, text2ImgXLSftRequest.returnUrl) &&
        Objects.equals(this.scale, text2ImgXLSftRequest.scale) &&
        Objects.equals(this.seed, text2ImgXLSftRequest.seed) &&
        Objects.equals(this.width, text2ImgXLSftRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddimStep, height, logoInfo, prompt, reqKey, returnUrl, scale, seed, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text2ImgXLSftRequest {\n");
    
    sb.append("    ddimStep: ").append(toIndentedString(ddimStep)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
