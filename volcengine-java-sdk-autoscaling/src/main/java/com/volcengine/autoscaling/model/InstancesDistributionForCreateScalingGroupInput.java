/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * InstancesDistributionForCreateScalingGroupInput
 */


public class InstancesDistributionForCreateScalingGroupInput {
  @SerializedName("CompensateWithOnDemand")
  private Boolean compensateWithOnDemand = null;

  @SerializedName("OnDemandBaseCapacity")
  private Integer onDemandBaseCapacity = null;

  @SerializedName("OnDemandPercentageAboveBaseCapacity")
  private Integer onDemandPercentageAboveBaseCapacity = null;

  @SerializedName("SpotInstanceRemedy")
  private Boolean spotInstanceRemedy = null;

  public InstancesDistributionForCreateScalingGroupInput compensateWithOnDemand(Boolean compensateWithOnDemand) {
    this.compensateWithOnDemand = compensateWithOnDemand;
    return this;
  }

   /**
   * Get compensateWithOnDemand
   * @return compensateWithOnDemand
  **/
  @Schema(description = "")
  public Boolean isCompensateWithOnDemand() {
    return compensateWithOnDemand;
  }

  public void setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
    this.compensateWithOnDemand = compensateWithOnDemand;
  }

  public InstancesDistributionForCreateScalingGroupInput onDemandBaseCapacity(Integer onDemandBaseCapacity) {
    this.onDemandBaseCapacity = onDemandBaseCapacity;
    return this;
  }

   /**
   * Get onDemandBaseCapacity
   * minimum: 0
   * maximum: 2000
   * @return onDemandBaseCapacity
  **/
 @Min(0) @Max(2000)  @Schema(description = "")
  public Integer getOnDemandBaseCapacity() {
    return onDemandBaseCapacity;
  }

  public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
    this.onDemandBaseCapacity = onDemandBaseCapacity;
  }

  public InstancesDistributionForCreateScalingGroupInput onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
    this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    return this;
  }

   /**
   * Get onDemandPercentageAboveBaseCapacity
   * minimum: 0
   * maximum: 100
   * @return onDemandPercentageAboveBaseCapacity
  **/
 @Min(0) @Max(100)  @Schema(description = "")
  public Integer getOnDemandPercentageAboveBaseCapacity() {
    return onDemandPercentageAboveBaseCapacity;
  }

  public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
    this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
  }

  public InstancesDistributionForCreateScalingGroupInput spotInstanceRemedy(Boolean spotInstanceRemedy) {
    this.spotInstanceRemedy = spotInstanceRemedy;
    return this;
  }

   /**
   * Get spotInstanceRemedy
   * @return spotInstanceRemedy
  **/
  @Schema(description = "")
  public Boolean isSpotInstanceRemedy() {
    return spotInstanceRemedy;
  }

  public void setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
    this.spotInstanceRemedy = spotInstanceRemedy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancesDistributionForCreateScalingGroupInput instancesDistributionForCreateScalingGroupInput = (InstancesDistributionForCreateScalingGroupInput) o;
    return Objects.equals(this.compensateWithOnDemand, instancesDistributionForCreateScalingGroupInput.compensateWithOnDemand) &&
        Objects.equals(this.onDemandBaseCapacity, instancesDistributionForCreateScalingGroupInput.onDemandBaseCapacity) &&
        Objects.equals(this.onDemandPercentageAboveBaseCapacity, instancesDistributionForCreateScalingGroupInput.onDemandPercentageAboveBaseCapacity) &&
        Objects.equals(this.spotInstanceRemedy, instancesDistributionForCreateScalingGroupInput.spotInstanceRemedy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compensateWithOnDemand, onDemandBaseCapacity, onDemandPercentageAboveBaseCapacity, spotInstanceRemedy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancesDistributionForCreateScalingGroupInput {\n");
    
    sb.append("    compensateWithOnDemand: ").append(toIndentedString(compensateWithOnDemand)).append("\n");
    sb.append("    onDemandBaseCapacity: ").append(toIndentedString(onDemandBaseCapacity)).append("\n");
    sb.append("    onDemandPercentageAboveBaseCapacity: ").append(toIndentedString(onDemandPercentageAboveBaseCapacity)).append("\n");
    sb.append("    spotInstanceRemedy: ").append(toIndentedString(spotInstanceRemedy)).append("\n");
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
