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
import com.volcengine.cv20240606.model.LogoInfoForFaceSwapInput;
import com.volcengine.cv20240606.model.MergeInfoForFaceSwapInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FaceSwapRequest
 */



public class FaceSwapRequest {
  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("face_type")
  private String faceType = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("logo_info")
  private LogoInfoForFaceSwapInput logoInfo = null;

  @SerializedName("merge_infos")
  private List<MergeInfoForFaceSwapInput> mergeInfos = null;

  @SerializedName("req_key")
  private String reqKey = null;

  @SerializedName("return_url")
  private Boolean returnUrl = null;

  @SerializedName("source_similarity")
  private String sourceSimilarity = null;

  public FaceSwapRequest binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public FaceSwapRequest addBinaryDataBase64Item(String binaryDataBase64Item) {
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

  public FaceSwapRequest faceType(String faceType) {
    this.faceType = faceType;
    return this;
  }

   /**
   * Get faceType
   * @return faceType
  **/
  @Schema(description = "")
  public String getFaceType() {
    return faceType;
  }

  public void setFaceType(String faceType) {
    this.faceType = faceType;
  }

  public FaceSwapRequest imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public FaceSwapRequest addImageUrlsItem(String imageUrlsItem) {
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

  public FaceSwapRequest logoInfo(LogoInfoForFaceSwapInput logoInfo) {
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * Get logoInfo
   * @return logoInfo
  **/
  @Valid
  @Schema(description = "")
  public LogoInfoForFaceSwapInput getLogoInfo() {
    return logoInfo;
  }

  public void setLogoInfo(LogoInfoForFaceSwapInput logoInfo) {
    this.logoInfo = logoInfo;
  }

  public FaceSwapRequest mergeInfos(List<MergeInfoForFaceSwapInput> mergeInfos) {
    this.mergeInfos = mergeInfos;
    return this;
  }

  public FaceSwapRequest addMergeInfosItem(MergeInfoForFaceSwapInput mergeInfosItem) {
    if (this.mergeInfos == null) {
      this.mergeInfos = new ArrayList<MergeInfoForFaceSwapInput>();
    }
    this.mergeInfos.add(mergeInfosItem);
    return this;
  }

   /**
   * Get mergeInfos
   * @return mergeInfos
  **/
  @Valid
  @Schema(description = "")
  public List<MergeInfoForFaceSwapInput> getMergeInfos() {
    return mergeInfos;
  }

  public void setMergeInfos(List<MergeInfoForFaceSwapInput> mergeInfos) {
    this.mergeInfos = mergeInfos;
  }

  public FaceSwapRequest reqKey(String reqKey) {
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

  public FaceSwapRequest returnUrl(Boolean returnUrl) {
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

  public FaceSwapRequest sourceSimilarity(String sourceSimilarity) {
    this.sourceSimilarity = sourceSimilarity;
    return this;
  }

   /**
   * Get sourceSimilarity
   * @return sourceSimilarity
  **/
  @Schema(description = "")
  public String getSourceSimilarity() {
    return sourceSimilarity;
  }

  public void setSourceSimilarity(String sourceSimilarity) {
    this.sourceSimilarity = sourceSimilarity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceSwapRequest faceSwapRequest = (FaceSwapRequest) o;
    return Objects.equals(this.binaryDataBase64, faceSwapRequest.binaryDataBase64) &&
        Objects.equals(this.faceType, faceSwapRequest.faceType) &&
        Objects.equals(this.imageUrls, faceSwapRequest.imageUrls) &&
        Objects.equals(this.logoInfo, faceSwapRequest.logoInfo) &&
        Objects.equals(this.mergeInfos, faceSwapRequest.mergeInfos) &&
        Objects.equals(this.reqKey, faceSwapRequest.reqKey) &&
        Objects.equals(this.returnUrl, faceSwapRequest.returnUrl) &&
        Objects.equals(this.sourceSimilarity, faceSwapRequest.sourceSimilarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataBase64, faceType, imageUrls, logoInfo, mergeInfos, reqKey, returnUrl, sourceSimilarity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceSwapRequest {\n");
    
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    faceType: ").append(toIndentedString(faceType)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    mergeInfos: ").append(toIndentedString(mergeInfos)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    sourceSimilarity: ").append(toIndentedString(sourceSimilarity)).append("\n");
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
