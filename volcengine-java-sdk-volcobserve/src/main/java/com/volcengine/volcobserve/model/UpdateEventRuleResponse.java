/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.DataForUpdateEventRuleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateEventRuleResponse
 */



public class UpdateEventRuleResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Data")
  private DataForUpdateEventRuleOutput data = null;

  public UpdateEventRuleResponse data(DataForUpdateEventRuleOutput data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public DataForUpdateEventRuleOutput getData() {
    return data;
  }

  public void setData(DataForUpdateEventRuleOutput data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEventRuleResponse updateEventRuleResponse = (UpdateEventRuleResponse) o;
    return Objects.equals(this.data, updateEventRuleResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventRuleResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
