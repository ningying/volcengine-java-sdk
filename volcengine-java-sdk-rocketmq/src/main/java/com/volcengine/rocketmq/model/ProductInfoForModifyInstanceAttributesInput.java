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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProductInfoForModifyInstanceAttributesInput
 */



public class ProductInfoForModifyInstanceAttributesInput {
  @SerializedName("SendReceiveRatio")
  private Integer sendReceiveRatio = null;

  public ProductInfoForModifyInstanceAttributesInput sendReceiveRatio(Integer sendReceiveRatio) {
    this.sendReceiveRatio = sendReceiveRatio;
    return this;
  }

   /**
   * Get sendReceiveRatio
   * @return sendReceiveRatio
  **/
  @Schema(description = "")
  public Integer getSendReceiveRatio() {
    return sendReceiveRatio;
  }

  public void setSendReceiveRatio(Integer sendReceiveRatio) {
    this.sendReceiveRatio = sendReceiveRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInfoForModifyInstanceAttributesInput productInfoForModifyInstanceAttributesInput = (ProductInfoForModifyInstanceAttributesInput) o;
    return Objects.equals(this.sendReceiveRatio, productInfoForModifyInstanceAttributesInput.sendReceiveRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendReceiveRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfoForModifyInstanceAttributesInput {\n");
    
    sb.append("    sendReceiveRatio: ").append(toIndentedString(sendReceiveRatio)).append("\n");
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
