/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.ConvertOptionsForGetDevInstanceOutput;
import com.volcengine.mlplatform20240701.model.TosForGetDevInstanceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SfcsForGetDevInstanceOutput
 */



public class SfcsForGetDevInstanceOutput {
  @SerializedName("CachePolicyId")
  private String cachePolicyId = null;

  @SerializedName("FileSystemName")
  private String fileSystemName = null;

  @SerializedName("Options")
  private ConvertOptionsForGetDevInstanceOutput options = null;

  @SerializedName("Tos")
  private TosForGetDevInstanceOutput tos = null;

  public SfcsForGetDevInstanceOutput cachePolicyId(String cachePolicyId) {
    this.cachePolicyId = cachePolicyId;
    return this;
  }

   /**
   * Get cachePolicyId
   * @return cachePolicyId
  **/
  @Schema(description = "")
  public String getCachePolicyId() {
    return cachePolicyId;
  }

  public void setCachePolicyId(String cachePolicyId) {
    this.cachePolicyId = cachePolicyId;
  }

  public SfcsForGetDevInstanceOutput fileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
    return this;
  }

   /**
   * Get fileSystemName
   * @return fileSystemName
  **/
  @Schema(description = "")
  public String getFileSystemName() {
    return fileSystemName;
  }

  public void setFileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
  }

  public SfcsForGetDevInstanceOutput options(ConvertOptionsForGetDevInstanceOutput options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Valid
  @Schema(description = "")
  public ConvertOptionsForGetDevInstanceOutput getOptions() {
    return options;
  }

  public void setOptions(ConvertOptionsForGetDevInstanceOutput options) {
    this.options = options;
  }

  public SfcsForGetDevInstanceOutput tos(TosForGetDevInstanceOutput tos) {
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @Valid
  @Schema(description = "")
  public TosForGetDevInstanceOutput getTos() {
    return tos;
  }

  public void setTos(TosForGetDevInstanceOutput tos) {
    this.tos = tos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SfcsForGetDevInstanceOutput sfcsForGetDevInstanceOutput = (SfcsForGetDevInstanceOutput) o;
    return Objects.equals(this.cachePolicyId, sfcsForGetDevInstanceOutput.cachePolicyId) &&
        Objects.equals(this.fileSystemName, sfcsForGetDevInstanceOutput.fileSystemName) &&
        Objects.equals(this.options, sfcsForGetDevInstanceOutput.options) &&
        Objects.equals(this.tos, sfcsForGetDevInstanceOutput.tos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachePolicyId, fileSystemName, options, tos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SfcsForGetDevInstanceOutput {\n");
    
    sb.append("    cachePolicyId: ").append(toIndentedString(cachePolicyId)).append("\n");
    sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    tos: ").append(toIndentedString(tos)).append("\n");
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
