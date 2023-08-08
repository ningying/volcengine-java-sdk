/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.TagFilterForDescribeBandwidthPackagesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeBandwidthPackagesRequest
 */


public class DescribeBandwidthPackagesRequest {
  @SerializedName("BandwidthPackageIds")
  private List<String> bandwidthPackageIds = null;

  @SerializedName("BandwidthPackageName")
  private String bandwidthPackageName = null;

  /**
   * Gets or Sets ISP
   */
  @JsonAdapter(ISPEnum.Adapter.class)
  public enum ISPEnum {
    BGP("BGP"),
    CHINAMOBILE("ChinaMobile"),
    CHINAUNICOM("ChinaUnicom"),
    CHINATELECOM("ChinaTelecom"),
    CHINAMOBILE_VALUE("ChinaMobile_Value"),
    CHINAUNICOM_VALUE("ChinaUnicom_Value"),
    CHINATELECOM_VALUE("ChinaTelecom_Value");

    private String value;

    ISPEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ISPEnum fromValue(String input) {
      for (ISPEnum b : ISPEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ISPEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ISPEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ISPEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ISPEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ISP")
  private ISPEnum ISP = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    IPV4("IPv4"),
    IPV6("IPv6");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolEnum fromValue(String input) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProtocolEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("SecurityProtectionEnabled")
  private Boolean securityProtectionEnabled = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeBandwidthPackagesInput> tagFilters = null;

  public DescribeBandwidthPackagesRequest bandwidthPackageIds(List<String> bandwidthPackageIds) {
    this.bandwidthPackageIds = bandwidthPackageIds;
    return this;
  }

  public DescribeBandwidthPackagesRequest addBandwidthPackageIdsItem(String bandwidthPackageIdsItem) {
    if (this.bandwidthPackageIds == null) {
      this.bandwidthPackageIds = new ArrayList<String>();
    }
    this.bandwidthPackageIds.add(bandwidthPackageIdsItem);
    return this;
  }

   /**
   * Get bandwidthPackageIds
   * @return bandwidthPackageIds
  **/
  @Schema(description = "")
  public List<String> getBandwidthPackageIds() {
    return bandwidthPackageIds;
  }

  public void setBandwidthPackageIds(List<String> bandwidthPackageIds) {
    this.bandwidthPackageIds = bandwidthPackageIds;
  }

  public DescribeBandwidthPackagesRequest bandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
    return this;
  }

   /**
   * Get bandwidthPackageName
   * @return bandwidthPackageName
  **/
  @Schema(description = "")
  public String getBandwidthPackageName() {
    return bandwidthPackageName;
  }

  public void setBandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
  }

  public DescribeBandwidthPackagesRequest ISP(ISPEnum ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public ISPEnum getISP() {
    return ISP;
  }

  public void setISP(ISPEnum ISP) {
    this.ISP = ISP;
  }

  public DescribeBandwidthPackagesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeBandwidthPackagesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeBandwidthPackagesRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DescribeBandwidthPackagesRequest protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public DescribeBandwidthPackagesRequest securityProtectionEnabled(Boolean securityProtectionEnabled) {
    this.securityProtectionEnabled = securityProtectionEnabled;
    return this;
  }

   /**
   * Get securityProtectionEnabled
   * @return securityProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isSecurityProtectionEnabled() {
    return securityProtectionEnabled;
  }

  public void setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
    this.securityProtectionEnabled = securityProtectionEnabled;
  }

  public DescribeBandwidthPackagesRequest tagFilters(List<TagFilterForDescribeBandwidthPackagesInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeBandwidthPackagesRequest addTagFiltersItem(TagFilterForDescribeBandwidthPackagesInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeBandwidthPackagesInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeBandwidthPackagesInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeBandwidthPackagesInput> tagFilters) {
    this.tagFilters = tagFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBandwidthPackagesRequest describeBandwidthPackagesRequest = (DescribeBandwidthPackagesRequest) o;
    return Objects.equals(this.bandwidthPackageIds, describeBandwidthPackagesRequest.bandwidthPackageIds) &&
        Objects.equals(this.bandwidthPackageName, describeBandwidthPackagesRequest.bandwidthPackageName) &&
        Objects.equals(this.ISP, describeBandwidthPackagesRequest.ISP) &&
        Objects.equals(this.pageNumber, describeBandwidthPackagesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeBandwidthPackagesRequest.pageSize) &&
        Objects.equals(this.projectName, describeBandwidthPackagesRequest.projectName) &&
        Objects.equals(this.protocol, describeBandwidthPackagesRequest.protocol) &&
        Objects.equals(this.securityProtectionEnabled, describeBandwidthPackagesRequest.securityProtectionEnabled) &&
        Objects.equals(this.tagFilters, describeBandwidthPackagesRequest.tagFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthPackageIds, bandwidthPackageName, ISP, pageNumber, pageSize, projectName, protocol, securityProtectionEnabled, tagFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBandwidthPackagesRequest {\n");
    
    sb.append("    bandwidthPackageIds: ").append(toIndentedString(bandwidthPackageIds)).append("\n");
    sb.append("    bandwidthPackageName: ").append(toIndentedString(bandwidthPackageName)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    securityProtectionEnabled: ").append(toIndentedString(securityProtectionEnabled)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
