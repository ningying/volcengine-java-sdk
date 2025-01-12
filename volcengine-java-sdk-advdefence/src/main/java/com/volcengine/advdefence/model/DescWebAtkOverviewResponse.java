/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

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
 * DescWebAtkOverviewResponse
 */



public class DescWebAtkOverviewResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AttackCount")
  private Integer attackCount = null;

  @SerializedName("AttackIPCount")
  private Integer attackIPCount = null;

  @SerializedName("PeakAttackQps")
  private Integer peakAttackQps = null;

  public DescWebAtkOverviewResponse attackCount(Integer attackCount) {
    this.attackCount = attackCount;
    return this;
  }

   /**
   * Get attackCount
   * @return attackCount
  **/
  @Schema(description = "")
  public Integer getAttackCount() {
    return attackCount;
  }

  public void setAttackCount(Integer attackCount) {
    this.attackCount = attackCount;
  }

  public DescWebAtkOverviewResponse attackIPCount(Integer attackIPCount) {
    this.attackIPCount = attackIPCount;
    return this;
  }

   /**
   * Get attackIPCount
   * @return attackIPCount
  **/
  @Schema(description = "")
  public Integer getAttackIPCount() {
    return attackIPCount;
  }

  public void setAttackIPCount(Integer attackIPCount) {
    this.attackIPCount = attackIPCount;
  }

  public DescWebAtkOverviewResponse peakAttackQps(Integer peakAttackQps) {
    this.peakAttackQps = peakAttackQps;
    return this;
  }

   /**
   * Get peakAttackQps
   * @return peakAttackQps
  **/
  @Schema(description = "")
  public Integer getPeakAttackQps() {
    return peakAttackQps;
  }

  public void setPeakAttackQps(Integer peakAttackQps) {
    this.peakAttackQps = peakAttackQps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescWebAtkOverviewResponse descWebAtkOverviewResponse = (DescWebAtkOverviewResponse) o;
    return Objects.equals(this.attackCount, descWebAtkOverviewResponse.attackCount) &&
        Objects.equals(this.attackIPCount, descWebAtkOverviewResponse.attackIPCount) &&
        Objects.equals(this.peakAttackQps, descWebAtkOverviewResponse.peakAttackQps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackCount, attackIPCount, peakAttackQps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescWebAtkOverviewResponse {\n");
    
    sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
    sb.append("    attackIPCount: ").append(toIndentedString(attackIPCount)).append("\n");
    sb.append("    peakAttackQps: ").append(toIndentedString(peakAttackQps)).append("\n");
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
