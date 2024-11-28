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
import com.volcengine.cv20240606.model.AlgorithmBaseRespForLensVidaVideoGetResultOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForLensVidaVideoGetResultOutput
 */



public class DataForLensVidaVideoGetResultOutput {
  @SerializedName("algorithm_base_resp")
  private AlgorithmBaseRespForLensVidaVideoGetResultOutput algorithmBaseResp = null;

  @SerializedName("binary_data_base64")
  private List<String> binaryDataBase64 = null;

  @SerializedName("image_urls")
  private List<String> imageUrls = null;

  @SerializedName("resp_data")
  private String respData = null;

  @SerializedName("response_data")
  private String responseData = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("task_id")
  private String taskId = null;

  public DataForLensVidaVideoGetResultOutput algorithmBaseResp(AlgorithmBaseRespForLensVidaVideoGetResultOutput algorithmBaseResp) {
    this.algorithmBaseResp = algorithmBaseResp;
    return this;
  }

   /**
   * Get algorithmBaseResp
   * @return algorithmBaseResp
  **/
  @Valid
  @Schema(description = "")
  public AlgorithmBaseRespForLensVidaVideoGetResultOutput getAlgorithmBaseResp() {
    return algorithmBaseResp;
  }

  public void setAlgorithmBaseResp(AlgorithmBaseRespForLensVidaVideoGetResultOutput algorithmBaseResp) {
    this.algorithmBaseResp = algorithmBaseResp;
  }

  public DataForLensVidaVideoGetResultOutput binaryDataBase64(List<String> binaryDataBase64) {
    this.binaryDataBase64 = binaryDataBase64;
    return this;
  }

  public DataForLensVidaVideoGetResultOutput addBinaryDataBase64Item(String binaryDataBase64Item) {
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

  public DataForLensVidaVideoGetResultOutput imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public DataForLensVidaVideoGetResultOutput addImageUrlsItem(String imageUrlsItem) {
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

  public DataForLensVidaVideoGetResultOutput respData(String respData) {
    this.respData = respData;
    return this;
  }

   /**
   * Get respData
   * @return respData
  **/
  @Schema(description = "")
  public String getRespData() {
    return respData;
  }

  public void setRespData(String respData) {
    this.respData = respData;
  }

  public DataForLensVidaVideoGetResultOutput responseData(String responseData) {
    this.responseData = responseData;
    return this;
  }

   /**
   * Get responseData
   * @return responseData
  **/
  @Schema(description = "")
  public String getResponseData() {
    return responseData;
  }

  public void setResponseData(String responseData) {
    this.responseData = responseData;
  }

  public DataForLensVidaVideoGetResultOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DataForLensVidaVideoGetResultOutput taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForLensVidaVideoGetResultOutput dataForLensVidaVideoGetResultOutput = (DataForLensVidaVideoGetResultOutput) o;
    return Objects.equals(this.algorithmBaseResp, dataForLensVidaVideoGetResultOutput.algorithmBaseResp) &&
        Objects.equals(this.binaryDataBase64, dataForLensVidaVideoGetResultOutput.binaryDataBase64) &&
        Objects.equals(this.imageUrls, dataForLensVidaVideoGetResultOutput.imageUrls) &&
        Objects.equals(this.respData, dataForLensVidaVideoGetResultOutput.respData) &&
        Objects.equals(this.responseData, dataForLensVidaVideoGetResultOutput.responseData) &&
        Objects.equals(this.status, dataForLensVidaVideoGetResultOutput.status) &&
        Objects.equals(this.taskId, dataForLensVidaVideoGetResultOutput.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithmBaseResp, binaryDataBase64, imageUrls, respData, responseData, status, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForLensVidaVideoGetResultOutput {\n");
    
    sb.append("    algorithmBaseResp: ").append(toIndentedString(algorithmBaseResp)).append("\n");
    sb.append("    binaryDataBase64: ").append(toIndentedString(binaryDataBase64)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    respData: ").append(toIndentedString(respData)).append("\n");
    sb.append("    responseData: ").append(toIndentedString(responseData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
