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
import com.volcengine.cv20240606.model.LogoInfoForFaceSwapAIInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FaceSwapAIRequest
 */



public class FaceSwapAIRequest {
  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("do_risk")
  private Boolean doRisk = null;

  @SerializedName("gpen")
  private Float gpen = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("logo_info")
  private LogoInfoForFaceSwapAIInput logoInfo = null;

  @SerializedName("req_key")
  private String reqKey = null;

  @SerializedName("return_url")
  private Boolean returnUrl = null;

  @SerializedName("skin")
  private Float skin = null;

  @SerializedName("tou_repair")
  private Integer touRepair = null;

  public FaceSwapAIRequest binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public FaceSwapAIRequest addBinaryDataBase64Item(String binaryDataBase64Item) {
    if (this.binaryDataBase64 == null) {
      this.binaryDataBase64 = new ArrayList<String>();
    }
    this.binaryDataBase64.add(binaryDataBase64Item);
    return this;
  }

   /**
   * Get binaryDataBase64
   * @return binaryDataBase64
  **/
  @Schema(description = "")
  public List<String> getBinaryDataBase64() {
    return binaryDataBase64;
  }

  public void setBinaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
  }

  public FaceSwapAIRequest doRisk(Boolean doRisk) {
    this.doRisk = doRisk;
    return this;
  }

   /**
   * Get doRisk
   * @return doRisk
  **/
  @Schema(description = "")
  public Boolean isDoRisk() {
    return doRisk;
  }

  public void setDoRisk(Boolean doRisk) {
    this.doRisk = doRisk;
  }

  public FaceSwapAIRequest gpen(Float gpen) {
    this.gpen = gpen;
    return this;
  }

   /**
   * Get gpen
   * @return gpen
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Float getGpen() {
    return gpen;
  }

  public void setGpen(Float gpen) {
    this.gpen = gpen;
  }

  public FaceSwapAIRequest imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public FaceSwapAIRequest addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<String>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * Get imageUrls
   * @return imageUrls
  **/
  @Schema(description = "")
  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }

  public FaceSwapAIRequest logoInfo(LogoInfoForFaceSwapAIInput logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForFaceSwapAIInput getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForFaceSwapAIInput logoInfo) {
    this.logoInfo = logoInfo;
  }

  public FaceSwapAIRequest reqKey(String reqKey) {
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

  public FaceSwapAIRequest returnUrl(Boolean returnUrl) {
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

  public FaceSwapAIRequest skin(Float skin) {
    this.skin = skin;
    return this;
  }

   /**
   * Get skin
   * @return skin
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Float getSkin() {
    return skin;
  }

  public void setSkin(Float skin) {
    this.skin = skin;
  }

  public FaceSwapAIRequest touRepair(Integer touRepair) {
    this.touRepair = touRepair;
    return this;
  }

   /**
   * Get touRepair
   * @return touRepair
  **/
  @Schema(description = "")
  public Integer getTouRepair() {
    return touRepair;
  }

  public void setTouRepair(Integer touRepair) {
    this.touRepair = touRepair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceSwapAIRequest faceSwapAIRequest = (FaceSwapAIRequest) o;
    return Objects.equals(this.binaryDataBase64, faceSwapAIRequest.binaryDataBase64) &&
        Objects.equals(this.doRisk, faceSwapAIRequest.doRisk) &&
        Objects.equals(this.gpen, faceSwapAIRequest.gpen) &&
        Objects.equals(this.imageUrls, faceSwapAIRequest.imageUrls) &&
        Objects.equals(this.logoInfo, faceSwapAIRequest.logoInfo) &&
        Objects.equals(this.reqKey, faceSwapAIRequest.reqKey) &&
        Objects.equals(this.returnUrl, faceSwapAIRequest.returnUrl) &&
        Objects.equals(this.skin, faceSwapAIRequest.skin) &&
        Objects.equals(this.touRepair, faceSwapAIRequest.touRepair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataBase64, doRisk, gpen, imageUrls, logoInfo, reqKey, returnUrl, skin, touRepair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceSwapAIRequest {\n");
    
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    doRisk: ").append(toIndentedString(doRisk)).append("\n");
    sb.append("    gpen: ").append(toIndentedString(gpen)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    skin: ").append(toIndentedString(skin)).append("\n");
    sb.append("    touRepair: ").append(toIndentedString(touRepair)).append("\n");
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