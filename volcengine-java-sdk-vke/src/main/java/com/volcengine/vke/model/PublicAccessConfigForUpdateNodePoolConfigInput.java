/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * PublicAccessConfigForUpdateNodePoolConfigInput
 */



public class PublicAccessConfigForUpdateNodePoolConfigInput {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  /**
   * Gets or Sets isp
   */
  @JsonAdapter(IspEnum.Adapter.class)
  public enum IspEnum {
    @SerializedName("BGP")
    BGP("BGP"),
    @SerializedName("ChinaMobile")
    CHINAMOBILE("ChinaMobile"),
    @SerializedName("ChinaTelecom")
    CHINATELECOM("ChinaTelecom"),
    @SerializedName("ChinaUnicom")
    CHINAUNICOM("ChinaUnicom");

    private String value;

    IspEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IspEnum fromValue(String input) {
      for (IspEnum b : IspEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IspEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IspEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IspEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IspEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Isp")
  private IspEnum isp = null;

  public PublicAccessConfigForUpdateNodePoolConfigInput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public PublicAccessConfigForUpdateNodePoolConfigInput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public PublicAccessConfigForUpdateNodePoolConfigInput isp(IspEnum isp) {
    this.isp = isp;
    return this;
  }

   /**
   * Get isp
   * @return isp
  **/
  @Schema(description = "")
  public IspEnum getIsp() {
    return isp;
  }

  public void setIsp(IspEnum isp) {
    this.isp = isp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicAccessConfigForUpdateNodePoolConfigInput publicAccessConfigForUpdateNodePoolConfigInput = (PublicAccessConfigForUpdateNodePoolConfigInput) o;
    return Objects.equals(this.bandwidth, publicAccessConfigForUpdateNodePoolConfigInput.bandwidth) &&
        Objects.equals(this.billingType, publicAccessConfigForUpdateNodePoolConfigInput.billingType) &&
        Objects.equals(this.isp, publicAccessConfigForUpdateNodePoolConfigInput.isp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, billingType, isp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAccessConfigForUpdateNodePoolConfigInput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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
