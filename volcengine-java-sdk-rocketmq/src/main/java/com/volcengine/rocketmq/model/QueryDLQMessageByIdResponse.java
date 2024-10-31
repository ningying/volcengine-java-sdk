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
import com.volcengine.rocketmq.model.DLQMessageInfoForQueryDLQMessageByIdOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryDLQMessageByIdResponse
 */



public class QueryDLQMessageByIdResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DLQMessageInfo")
  private DLQMessageInfoForQueryDLQMessageByIdOutput dlQMessageInfo = null;

  public QueryDLQMessageByIdResponse dlQMessageInfo(DLQMessageInfoForQueryDLQMessageByIdOutput dlQMessageInfo) {
    this.dlQMessageInfo = dlQMessageInfo;
    return this;
  }

   /**
   * Get dlQMessageInfo
   * @return dlQMessageInfo
  **/
  @Valid
  @Schema(description = "")
  public DLQMessageInfoForQueryDLQMessageByIdOutput getDlQMessageInfo() {
    return dlQMessageInfo;
  }

  public void setDlQMessageInfo(DLQMessageInfoForQueryDLQMessageByIdOutput dlQMessageInfo) {
    this.dlQMessageInfo = dlQMessageInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryDLQMessageByIdResponse queryDLQMessageByIdResponse = (QueryDLQMessageByIdResponse) o;
    return Objects.equals(this.dlQMessageInfo, queryDLQMessageByIdResponse.dlQMessageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dlQMessageInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryDLQMessageByIdResponse {\n");
    
    sb.append("    dlQMessageInfo: ").append(toIndentedString(dlQMessageInfo)).append("\n");
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