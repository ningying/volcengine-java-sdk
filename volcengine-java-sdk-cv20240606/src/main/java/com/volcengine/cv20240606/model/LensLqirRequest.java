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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LensLqirRequest
 */



public class LensLqirRequest {
  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("enable_hdr")
  private Boolean enableHdr = null;

  @SerializedName("enable_wb")
  private Boolean enableWb = null;

  @SerializedName("hdr_strength")
  private Float hdrStrength = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("jpg_quality")
  private Integer jpgQuality = null;

  @SerializedName("req_key")
  private String reqKey = null;

  @SerializedName("resolution_boundary")
  private String resolutionBoundary = null;

  @SerializedName("result_format")
  private Integer resultFormat = null;

  public LensLqirRequest binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public LensLqirRequest addBinaryDataBase64Item(String binaryDataBase64Item) {
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

  public LensLqirRequest enableHdr(Boolean enableHdr) {
    this.enableHdr = enableHdr;
    return this;
  }

   /**
   * Get enableHdr
   * @return enableHdr
  **/
  @Schema(description = "")
  public Boolean isEnableHdr() {
    return enableHdr;
  }

  public void setEnableHdr(Boolean enableHdr) {
    this.enableHdr = enableHdr;
  }

  public LensLqirRequest enableWb(Boolean enableWb) {
    this.enableWb = enableWb;
    return this;
  }

   /**
   * Get enableWb
   * @return enableWb
  **/
  @Schema(description = "")
  public Boolean isEnableWb() {
    return enableWb;
  }

  public void setEnableWb(Boolean enableWb) {
    this.enableWb = enableWb;
  }

  public LensLqirRequest hdrStrength(Float hdrStrength) {
    this.hdrStrength = hdrStrength;
    return this;
  }

   /**
   * Get hdrStrength
   * @return hdrStrength
  **/
  @Schema(description = "")
  public Float getHdrStrength() {
    return hdrStrength;
  }

  public void setHdrStrength(Float hdrStrength) {
    this.hdrStrength = hdrStrength;
  }

  public LensLqirRequest imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public LensLqirRequest addImageUrlsItem(String imageUrlsItem) {
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

  public LensLqirRequest jpgQuality(Integer jpgQuality) {
    this.jpgQuality = jpgQuality;
    return this;
  }

   /**
   * Get jpgQuality
   * @return jpgQuality
  **/
  @Schema(description = "")
  public Integer getJpgQuality() {
    return jpgQuality;
  }

  public void setJpgQuality(Integer jpgQuality) {
    this.jpgQuality = jpgQuality;
  }

  public LensLqirRequest reqKey(String reqKey) {
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

  public LensLqirRequest resolutionBoundary(String resolutionBoundary) {
    this.resolutionBoundary = resolutionBoundary;
    return this;
  }

   /**
   * Get resolutionBoundary
   * @return resolutionBoundary
  **/
  @Schema(description = "")
  public String getResolutionBoundary() {
    return resolutionBoundary;
  }

  public void setResolutionBoundary(String resolutionBoundary) {
    this.resolutionBoundary = resolutionBoundary;
  }

  public LensLqirRequest resultFormat(Integer resultFormat) {
    this.resultFormat = resultFormat;
    return this;
  }

   /**
   * Get resultFormat
   * @return resultFormat
  **/
  @Schema(description = "")
  public Integer getResultFormat() {
    return resultFormat;
  }

  public void setResultFormat(Integer resultFormat) {
    this.resultFormat = resultFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LensLqirRequest lensLqirRequest = (LensLqirRequest) o;
    return Objects.equals(this.binaryDataBase64, lensLqirRequest.binaryDataBase64) &&
        Objects.equals(this.enableHdr, lensLqirRequest.enableHdr) &&
        Objects.equals(this.enableWb, lensLqirRequest.enableWb) &&
        Objects.equals(this.hdrStrength, lensLqirRequest.hdrStrength) &&
        Objects.equals(this.imageUrls, lensLqirRequest.imageUrls) &&
        Objects.equals(this.jpgQuality, lensLqirRequest.jpgQuality) &&
        Objects.equals(this.reqKey, lensLqirRequest.reqKey) &&
        Objects.equals(this.resolutionBoundary, lensLqirRequest.resolutionBoundary) &&
        Objects.equals(this.resultFormat, lensLqirRequest.resultFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryDataBase64, enableHdr, enableWb, hdrStrength, imageUrls, jpgQuality, reqKey, resolutionBoundary, resultFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LensLqirRequest {\n");
    
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    enableHdr: ").append(toIndentedString(enableHdr)).append("\n");
    sb.append("    enableWb: ").append(toIndentedString(enableWb)).append("\n");
    sb.append("    hdrStrength: ").append(toIndentedString(hdrStrength)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    jpgQuality: ").append(toIndentedString(jpgQuality)).append("\n");
    sb.append("    reqKey: ").append(toIndentedString(reqKey)).append("\n");
    sb.append("    resolutionBoundary: ").append(toIndentedString(resolutionBoundary)).append("\n");
    sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
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