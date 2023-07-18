/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ModifyImageAttributeRequest
 */



public class ModifyImageAttributeRequest {
  @SerializedName("BootMode")
  private String bootMode = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("ImageName")
  private String imageName = null;

  public ModifyImageAttributeRequest bootMode(String bootMode) {
    this.bootMode = bootMode;
    return this;
  }

   /**
   * Get bootMode
   * @return bootMode
  **/
  @Schema(description = "")
  public String getBootMode() {
    return bootMode;
  }

  public void setBootMode(String bootMode) {
    this.bootMode = bootMode;
  }

  public ModifyImageAttributeRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyImageAttributeRequest imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ModifyImageAttributeRequest imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @Schema(description = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyImageAttributeRequest modifyImageAttributeRequest = (ModifyImageAttributeRequest) o;
    return Objects.equals(this.bootMode, modifyImageAttributeRequest.bootMode) &&
        Objects.equals(this.description, modifyImageAttributeRequest.description) &&
        Objects.equals(this.imageId, modifyImageAttributeRequest.imageId) &&
        Objects.equals(this.imageName, modifyImageAttributeRequest.imageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootMode, description, imageId, imageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyImageAttributeRequest {\n");
    
    sb.append("    bootMode: ").append(toIndentedString(bootMode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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
