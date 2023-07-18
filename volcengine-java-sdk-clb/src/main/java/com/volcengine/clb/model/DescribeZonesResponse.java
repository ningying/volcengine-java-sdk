/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.MasterZoneForDescribeZonesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeZonesResponse
 */



public class DescribeZonesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("MasterZones")
  private List<MasterZoneForDescribeZonesOutput> masterZones = null;

  public DescribeZonesResponse masterZones(List<MasterZoneForDescribeZonesOutput> masterZones) {
    this.masterZones = masterZones;
    return this;
  }

  public DescribeZonesResponse addMasterZonesItem(MasterZoneForDescribeZonesOutput masterZonesItem) {
    if (this.masterZones == null) {
      this.masterZones = new ArrayList<MasterZoneForDescribeZonesOutput>();
    }
    this.masterZones.add(masterZonesItem);
    return this;
  }

   /**
   * Get masterZones
   * @return masterZones
  **/
  @Valid
  @Schema(description = "")
  public List<MasterZoneForDescribeZonesOutput> getMasterZones() {
    return masterZones;
  }

  public void setMasterZones(List<MasterZoneForDescribeZonesOutput> masterZones) {
    this.masterZones = masterZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeZonesResponse describeZonesResponse = (DescribeZonesResponse) o;
    return Objects.equals(this.masterZones, describeZonesResponse.masterZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeZonesResponse {\n");
    
    sb.append("    masterZones: ").append(toIndentedString(masterZones)).append("\n");
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
