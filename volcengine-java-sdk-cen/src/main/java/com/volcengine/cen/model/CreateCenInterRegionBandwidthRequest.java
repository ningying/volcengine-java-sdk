/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cen.model;

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
 * CreateCenInterRegionBandwidthRequest
 */



public class CreateCenInterRegionBandwidthRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("LocalRegionId")
  private String localRegionId = null;

  @SerializedName("PeerRegionId")
  private String peerRegionId = null;

  public CreateCenInterRegionBandwidthRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CreateCenInterRegionBandwidthRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public CreateCenInterRegionBandwidthRequest localRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
    return this;
  }

   /**
   * Get localRegionId
   * @return localRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLocalRegionId() {
    return localRegionId;
  }

  public void setLocalRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
  }

  public CreateCenInterRegionBandwidthRequest peerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
    return this;
  }

   /**
   * Get peerRegionId
   * @return peerRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPeerRegionId() {
    return peerRegionId;
  }

  public void setPeerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCenInterRegionBandwidthRequest createCenInterRegionBandwidthRequest = (CreateCenInterRegionBandwidthRequest) o;
    return Objects.equals(this.bandwidth, createCenInterRegionBandwidthRequest.bandwidth) &&
        Objects.equals(this.cenId, createCenInterRegionBandwidthRequest.cenId) &&
        Objects.equals(this.localRegionId, createCenInterRegionBandwidthRequest.localRegionId) &&
        Objects.equals(this.peerRegionId, createCenInterRegionBandwidthRequest.peerRegionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, cenId, localRegionId, peerRegionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCenInterRegionBandwidthRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
    sb.append("    peerRegionId: ").append(toIndentedString(peerRegionId)).append("\n");
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
