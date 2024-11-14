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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CloudAccountForGetRiskStatInput
 */



public class CloudAccountForGetRiskStatInput {
  @SerializedName("CloudAccountName")
  private String cloudAccountName = null;

  @SerializedName("CloudAccountUID")
  private String cloudAccountUID = null;

  /**
   * Gets or Sets cloudVendor
   */
  @JsonAdapter(CloudVendorEnum.Adapter.class)
  public enum CloudVendorEnum {
    @SerializedName("volcengine")
    VOLCENGINE("volcengine"),
    @SerializedName("aliyun")
    ALIYUN("aliyun"),
    @SerializedName("huaweicloud")
    HUAWEICLOUD("huaweicloud"),
    @SerializedName("tencent")
    TENCENT("tencent");

    private String value;

    CloudVendorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CloudVendorEnum fromValue(String input) {
      for (CloudVendorEnum b : CloudVendorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CloudVendorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloudVendorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CloudVendorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CloudVendorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CloudVendor")
  private CloudVendorEnum cloudVendor = null;

  public CloudAccountForGetRiskStatInput cloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @Schema(description = "")
  public String getCloudAccountName() {
    return cloudAccountName;
  }

  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }

  public CloudAccountForGetRiskStatInput cloudAccountUID(String cloudAccountUID) {
    this.cloudAccountUID = cloudAccountUID;
    return this;
  }

   /**
   * Get cloudAccountUID
   * @return cloudAccountUID
  **/
  @Schema(description = "")
  public String getCloudAccountUID() {
    return cloudAccountUID;
  }

  public void setCloudAccountUID(String cloudAccountUID) {
    this.cloudAccountUID = cloudAccountUID;
  }

  public CloudAccountForGetRiskStatInput cloudVendor(CloudVendorEnum cloudVendor) {
    this.cloudVendor = cloudVendor;
    return this;
  }

   /**
   * Get cloudVendor
   * @return cloudVendor
  **/
  @Schema(description = "")
  public CloudVendorEnum getCloudVendor() {
    return cloudVendor;
  }

  public void setCloudVendor(CloudVendorEnum cloudVendor) {
    this.cloudVendor = cloudVendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountForGetRiskStatInput cloudAccountForGetRiskStatInput = (CloudAccountForGetRiskStatInput) o;
    return Objects.equals(this.cloudAccountName, cloudAccountForGetRiskStatInput.cloudAccountName) &&
        Objects.equals(this.cloudAccountUID, cloudAccountForGetRiskStatInput.cloudAccountUID) &&
        Objects.equals(this.cloudVendor, cloudAccountForGetRiskStatInput.cloudVendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountName, cloudAccountUID, cloudVendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountForGetRiskStatInput {\n");
    
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    cloudAccountUID: ").append(toIndentedString(cloudAccountUID)).append("\n");
    sb.append("    cloudVendor: ").append(toIndentedString(cloudVendor)).append("\n");
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
