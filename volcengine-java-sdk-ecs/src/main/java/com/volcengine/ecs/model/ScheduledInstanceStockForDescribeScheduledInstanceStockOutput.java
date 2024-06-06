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
 * ScheduledInstanceStockForDescribeScheduledInstanceStockOutput
 */



public class ScheduledInstanceStockForDescribeScheduledInstanceStockOutput {
  @SerializedName("EndDeliveryAt")
  private String endDeliveryAt = null;

  @SerializedName("StartDeliveryAt")
  private String startDeliveryAt = null;

  @SerializedName("Status")
  private String status = null;

  public ScheduledInstanceStockForDescribeScheduledInstanceStockOutput endDeliveryAt(String endDeliveryAt) {
    this.endDeliveryAt = endDeliveryAt;
    return this;
  }

   /**
   * Get endDeliveryAt
   * @return endDeliveryAt
  **/
  @Schema(description = "")
  public String getEndDeliveryAt() {
    return endDeliveryAt;
  }

  public void setEndDeliveryAt(String endDeliveryAt) {
    this.endDeliveryAt = endDeliveryAt;
  }

  public ScheduledInstanceStockForDescribeScheduledInstanceStockOutput startDeliveryAt(String startDeliveryAt) {
    this.startDeliveryAt = startDeliveryAt;
    return this;
  }

   /**
   * Get startDeliveryAt
   * @return startDeliveryAt
  **/
  @Schema(description = "")
  public String getStartDeliveryAt() {
    return startDeliveryAt;
  }

  public void setStartDeliveryAt(String startDeliveryAt) {
    this.startDeliveryAt = startDeliveryAt;
  }

  public ScheduledInstanceStockForDescribeScheduledInstanceStockOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledInstanceStockForDescribeScheduledInstanceStockOutput scheduledInstanceStockForDescribeScheduledInstanceStockOutput = (ScheduledInstanceStockForDescribeScheduledInstanceStockOutput) o;
    return Objects.equals(this.endDeliveryAt, scheduledInstanceStockForDescribeScheduledInstanceStockOutput.endDeliveryAt) &&
        Objects.equals(this.startDeliveryAt, scheduledInstanceStockForDescribeScheduledInstanceStockOutput.startDeliveryAt) &&
        Objects.equals(this.status, scheduledInstanceStockForDescribeScheduledInstanceStockOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDeliveryAt, startDeliveryAt, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledInstanceStockForDescribeScheduledInstanceStockOutput {\n");
    
    sb.append("    endDeliveryAt: ").append(toIndentedString(endDeliveryAt)).append("\n");
    sb.append("    startDeliveryAt: ").append(toIndentedString(startDeliveryAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
