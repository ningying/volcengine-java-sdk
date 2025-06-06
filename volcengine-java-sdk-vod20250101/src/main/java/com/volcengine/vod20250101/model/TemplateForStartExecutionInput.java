/*
 * vod20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vod20250101.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vod20250101.model.ByteHDForStartExecutionInput;
import com.volcengine.vod20250101.model.EnhanceForStartExecutionInput;
import com.volcengine.vod20250101.model.TranscodeAudioForStartExecutionInput;
import com.volcengine.vod20250101.model.TranscodeVideoForStartExecutionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TemplateForStartExecutionInput
 */



public class TemplateForStartExecutionInput {
  @SerializedName("ByteHD")
  private ByteHDForStartExecutionInput byteHD = null;

  @SerializedName("Enhance")
  private EnhanceForStartExecutionInput enhance = null;

  @SerializedName("TranscodeAudio")
  private TranscodeAudioForStartExecutionInput transcodeAudio = null;

  @SerializedName("TranscodeVideo")
  private TranscodeVideoForStartExecutionInput transcodeVideo = null;

  @SerializedName("Type")
  private String type = null;

  public TemplateForStartExecutionInput byteHD(ByteHDForStartExecutionInput byteHD) {
    this.byteHD = byteHD;
    return this;
  }

   /**
   * Get byteHD
   * @return byteHD
  **/
  @Valid
  @Schema(description = "")
  public ByteHDForStartExecutionInput getByteHD() {
    return byteHD;
  }

  public void setByteHD(ByteHDForStartExecutionInput byteHD) {
    this.byteHD = byteHD;
  }

  public TemplateForStartExecutionInput enhance(EnhanceForStartExecutionInput enhance) {
    this.enhance = enhance;
    return this;
  }

   /**
   * Get enhance
   * @return enhance
  **/
  @Valid
  @Schema(description = "")
  public EnhanceForStartExecutionInput getEnhance() {
    return enhance;
  }

  public void setEnhance(EnhanceForStartExecutionInput enhance) {
    this.enhance = enhance;
  }

  public TemplateForStartExecutionInput transcodeAudio(TranscodeAudioForStartExecutionInput transcodeAudio) {
    this.transcodeAudio = transcodeAudio;
    return this;
  }

   /**
   * Get transcodeAudio
   * @return transcodeAudio
  **/
  @Valid
  @Schema(description = "")
  public TranscodeAudioForStartExecutionInput getTranscodeAudio() {
    return transcodeAudio;
  }

  public void setTranscodeAudio(TranscodeAudioForStartExecutionInput transcodeAudio) {
    this.transcodeAudio = transcodeAudio;
  }

  public TemplateForStartExecutionInput transcodeVideo(TranscodeVideoForStartExecutionInput transcodeVideo) {
    this.transcodeVideo = transcodeVideo;
    return this;
  }

   /**
   * Get transcodeVideo
   * @return transcodeVideo
  **/
  @Valid
  @Schema(description = "")
  public TranscodeVideoForStartExecutionInput getTranscodeVideo() {
    return transcodeVideo;
  }

  public void setTranscodeVideo(TranscodeVideoForStartExecutionInput transcodeVideo) {
    this.transcodeVideo = transcodeVideo;
  }

  public TemplateForStartExecutionInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateForStartExecutionInput templateForStartExecutionInput = (TemplateForStartExecutionInput) o;
    return Objects.equals(this.byteHD, templateForStartExecutionInput.byteHD) &&
        Objects.equals(this.enhance, templateForStartExecutionInput.enhance) &&
        Objects.equals(this.transcodeAudio, templateForStartExecutionInput.transcodeAudio) &&
        Objects.equals(this.transcodeVideo, templateForStartExecutionInput.transcodeVideo) &&
        Objects.equals(this.type, templateForStartExecutionInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteHD, enhance, transcodeAudio, transcodeVideo, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateForStartExecutionInput {\n");
    
    sb.append("    byteHD: ").append(toIndentedString(byteHD)).append("\n");
    sb.append("    enhance: ").append(toIndentedString(enhance)).append("\n");
    sb.append("    transcodeAudio: ").append(toIndentedString(transcodeAudio)).append("\n");
    sb.append("    transcodeVideo: ").append(toIndentedString(transcodeVideo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
