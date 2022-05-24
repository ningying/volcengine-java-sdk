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

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyInstanceChargeTypeResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class ModifyInstanceChargeTypeResponse {
  @SerializedName("OrderId")
  private String orderId = null;

  @SerializedName("PreorderIds")
  private List<String> preorderIds = null;

  public ModifyInstanceChargeTypeResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ModifyInstanceChargeTypeResponse preorderIds(List<String> preorderIds) {
    this.preorderIds = preorderIds;
    return this;
  }

  public ModifyInstanceChargeTypeResponse addPreorderIdsItem(String preorderIdsItem) {
    if (this.preorderIds == null) {
      this.preorderIds = new ArrayList<String>();
    }
    this.preorderIds.add(preorderIdsItem);
    return this;
  }

   /**
   * Get preorderIds
   * @return preorderIds
  **/
  @Schema(description = "")
  public List<String> getPreorderIds() {
    return preorderIds;
  }

  public void setPreorderIds(List<String> preorderIds) {
    this.preorderIds = preorderIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeResponse = (ModifyInstanceChargeTypeResponse) o;
    return Objects.equals(this.orderId, modifyInstanceChargeTypeResponse.orderId) &&
        Objects.equals(this.preorderIds, modifyInstanceChargeTypeResponse.preorderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, preorderIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyInstanceChargeTypeResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    preorderIds: ").append(toIndentedString(preorderIds)).append("\n");
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
