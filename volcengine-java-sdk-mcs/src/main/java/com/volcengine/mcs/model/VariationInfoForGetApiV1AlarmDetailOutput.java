/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.AlarmFeatureInfoMalwareForGetApiV1AlarmDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VariationInfoForGetApiV1AlarmDetailOutput
 */



public class VariationInfoForGetApiV1AlarmDetailOutput {
  @SerializedName("alarm_feature_info_malware")
  private AlarmFeatureInfoMalwareForGetApiV1AlarmDetailOutput alarmFeatureInfoMalware = null;

  public VariationInfoForGetApiV1AlarmDetailOutput alarmFeatureInfoMalware(AlarmFeatureInfoMalwareForGetApiV1AlarmDetailOutput alarmFeatureInfoMalware) {
    this.alarmFeatureInfoMalware = alarmFeatureInfoMalware;
    return this;
  }

   /**
   * Get alarmFeatureInfoMalware
   * @return alarmFeatureInfoMalware
  **/
  @Valid
  @Schema(description = "")
  public AlarmFeatureInfoMalwareForGetApiV1AlarmDetailOutput getAlarmFeatureInfoMalware() {
    return alarmFeatureInfoMalware;
  }

  public void setAlarmFeatureInfoMalware(AlarmFeatureInfoMalwareForGetApiV1AlarmDetailOutput alarmFeatureInfoMalware) {
    this.alarmFeatureInfoMalware = alarmFeatureInfoMalware;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariationInfoForGetApiV1AlarmDetailOutput variationInfoForGetApiV1AlarmDetailOutput = (VariationInfoForGetApiV1AlarmDetailOutput) o;
    return Objects.equals(this.alarmFeatureInfoMalware, variationInfoForGetApiV1AlarmDetailOutput.alarmFeatureInfoMalware);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmFeatureInfoMalware);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariationInfoForGetApiV1AlarmDetailOutput {\n");
    
    sb.append("    alarmFeatureInfoMalware: ").append(toIndentedString(alarmFeatureInfoMalware)).append("\n");
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