/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rocketmq.model.ResendResultForResendDLQMessageByIdOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResendDLQMessageByIdResponse
 */



public class ResendDLQMessageByIdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ResendResult")
  private List<ResendResultForResendDLQMessageByIdOutput> resendResult = null;

  public ResendDLQMessageByIdResponse resendResult(List<ResendResultForResendDLQMessageByIdOutput> resendResult) {
    this.resendResult = resendResult;
    return this;
  }

  public ResendDLQMessageByIdResponse addResendResultItem(ResendResultForResendDLQMessageByIdOutput resendResultItem) {
    if (this.resendResult == null) {
      this.resendResult = new ArrayList<ResendResultForResendDLQMessageByIdOutput>();
    }
    this.resendResult.add(resendResultItem);
    return this;
  }

   /**
   * Get resendResult
   * @return resendResult
  **/
  @Valid
  @Schema(description = "")
  public List<ResendResultForResendDLQMessageByIdOutput> getResendResult() {
    return resendResult;
  }

  public void setResendResult(List<ResendResultForResendDLQMessageByIdOutput> resendResult) {
    this.resendResult = resendResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResendDLQMessageByIdResponse resendDLQMessageByIdResponse = (ResendDLQMessageByIdResponse) o;
    return Objects.equals(this.resendResult, resendDLQMessageByIdResponse.resendResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resendResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendDLQMessageByIdResponse {\n");
    
    sb.append("    resendResult: ").append(toIndentedString(resendResult)).append("\n");
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
