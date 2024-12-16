/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * UpdateRecordSetRequest
 */



public class UpdateRecordSetRequest {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("WeightEnabled")
  private Boolean weightEnabled = null;

  public UpdateRecordSetRequest ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public UpdateRecordSetRequest weightEnabled(Boolean weightEnabled) {
    this.weightEnabled = weightEnabled;
    return this;
  }

   /**
   * Get weightEnabled
   * @return weightEnabled
  **/
  @Schema(description = "")
  public Boolean isWeightEnabled() {
    return weightEnabled;
  }

  public void setWeightEnabled(Boolean weightEnabled) {
    this.weightEnabled = weightEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRecordSetRequest updateRecordSetRequest = (UpdateRecordSetRequest) o;
    return Objects.equals(this.ID, updateRecordSetRequest.ID) &&
        Objects.equals(this.weightEnabled, updateRecordSetRequest.weightEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, weightEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRecordSetRequest {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    weightEnabled: ").append(toIndentedString(weightEnabled)).append("\n");
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