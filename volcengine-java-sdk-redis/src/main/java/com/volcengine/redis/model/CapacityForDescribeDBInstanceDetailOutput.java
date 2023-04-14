/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * CapacityForDescribeDBInstanceDetailOutput
 */


public class CapacityForDescribeDBInstanceDetailOutput {
  @SerializedName("Total")
  private Long total = null;

  @SerializedName("Used")
  private Long used = null;

  public CapacityForDescribeDBInstanceDetailOutput total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public CapacityForDescribeDBInstanceDetailOutput used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @Schema(description = "")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityForDescribeDBInstanceDetailOutput capacityForDescribeDBInstanceDetailOutput = (CapacityForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.total, capacityForDescribeDBInstanceDetailOutput.total) &&
        Objects.equals(this.used, capacityForDescribeDBInstanceDetailOutput.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
