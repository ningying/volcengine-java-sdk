/*
 * volc_content_platform
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volccontentplatform.model;

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
 * GroupAudioForBatchCreateSourceArticleInBulkInput
 */



public class GroupAudioForBatchCreateSourceArticleInBulkInput {
  @SerializedName("AudioSize")
  private Long audioSize = null;

  @SerializedName("Duration")
  private Double duration = null;

  @SerializedName("OpenId")
  private String openId = null;

  @SerializedName("Url")
  private String url = null;

  public GroupAudioForBatchCreateSourceArticleInBulkInput audioSize(Long audioSize) {
    this.audioSize = audioSize;
    return this;
  }

   /**
   * Get audioSize
   * @return audioSize
  **/
  @Schema(description = "")
  public Long getAudioSize() {
    return audioSize;
  }

  public void setAudioSize(Long audioSize) {
    this.audioSize = audioSize;
  }

  public GroupAudioForBatchCreateSourceArticleInBulkInput duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public GroupAudioForBatchCreateSourceArticleInBulkInput openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * Get openId
   * @return openId
  **/
  @Schema(description = "")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public GroupAudioForBatchCreateSourceArticleInBulkInput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAudioForBatchCreateSourceArticleInBulkInput groupAudioForBatchCreateSourceArticleInBulkInput = (GroupAudioForBatchCreateSourceArticleInBulkInput) o;
    return Objects.equals(this.audioSize, groupAudioForBatchCreateSourceArticleInBulkInput.audioSize) &&
        Objects.equals(this.duration, groupAudioForBatchCreateSourceArticleInBulkInput.duration) &&
        Objects.equals(this.openId, groupAudioForBatchCreateSourceArticleInBulkInput.openId) &&
        Objects.equals(this.url, groupAudioForBatchCreateSourceArticleInBulkInput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioSize, duration, openId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAudioForBatchCreateSourceArticleInBulkInput {\n");
    
    sb.append("    audioSize: ").append(toIndentedString(audioSize)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
