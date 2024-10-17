/*
 * nta
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.nta.model;

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
 * GetFileDetectionResponse
 */



public class GetFileDetectionResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("FileMd5")
  private String fileMd5 = null;

  @SerializedName("FileSecType")
  private Integer fileSecType = null;

  @SerializedName("FileSize")
  private Long fileSize = null;

  @SerializedName("Finish")
  private Integer finish = null;

  @SerializedName("VirusDesc")
  private String virusDesc = null;

  public GetFileDetectionResponse fileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
    return this;
  }

   /**
   * Get fileMd5
   * @return fileMd5
  **/
  @Schema(description = "")
  public String getFileMd5() {
    return fileMd5;
  }

  public void setFileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
  }

  public GetFileDetectionResponse fileSecType(Integer fileSecType) {
    this.fileSecType = fileSecType;
    return this;
  }

   /**
   * Get fileSecType
   * @return fileSecType
  **/
  @Schema(description = "")
  public Integer getFileSecType() {
    return fileSecType;
  }

  public void setFileSecType(Integer fileSecType) {
    this.fileSecType = fileSecType;
  }

  public GetFileDetectionResponse fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @Schema(description = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public GetFileDetectionResponse finish(Integer finish) {
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @Schema(description = "")
  public Integer getFinish() {
    return finish;
  }

  public void setFinish(Integer finish) {
    this.finish = finish;
  }

  public GetFileDetectionResponse virusDesc(String virusDesc) {
    this.virusDesc = virusDesc;
    return this;
  }

   /**
   * Get virusDesc
   * @return virusDesc
  **/
  @Schema(description = "")
  public String getVirusDesc() {
    return virusDesc;
  }

  public void setVirusDesc(String virusDesc) {
    this.virusDesc = virusDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFileDetectionResponse getFileDetectionResponse = (GetFileDetectionResponse) o;
    return Objects.equals(this.fileMd5, getFileDetectionResponse.fileMd5) &&
        Objects.equals(this.fileSecType, getFileDetectionResponse.fileSecType) &&
        Objects.equals(this.fileSize, getFileDetectionResponse.fileSize) &&
        Objects.equals(this.finish, getFileDetectionResponse.finish) &&
        Objects.equals(this.virusDesc, getFileDetectionResponse.virusDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileMd5, fileSecType, fileSize, finish, virusDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFileDetectionResponse {\n");
    
    sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
    sb.append("    fileSecType: ").append(toIndentedString(fileSecType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    virusDesc: ").append(toIndentedString(virusDesc)).append("\n");
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
