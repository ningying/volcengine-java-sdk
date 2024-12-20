/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.NamePairForDescribeCdnRegionAndIspOutput;
import com.volcengine.mcdn.model.RegionForDescribeCdnRegionAndIspOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CountryForDescribeCdnRegionAndIspOutput
 */



public class CountryForDescribeCdnRegionAndIspOutput {
  @SerializedName("NamePair")
  private NamePairForDescribeCdnRegionAndIspOutput namePair = null;

  @SerializedName("Regions")
  private List<RegionForDescribeCdnRegionAndIspOutput> regions = null;

  public CountryForDescribeCdnRegionAndIspOutput namePair(NamePairForDescribeCdnRegionAndIspOutput namePair) {
    this.namePair = namePair;
    return this;
  }

   /**
   * Get namePair
   * @return namePair
  **/
  @Valid
  @Schema(description = "")
  public NamePairForDescribeCdnRegionAndIspOutput getNamePair() {
    return namePair;
  }

  public void setNamePair(NamePairForDescribeCdnRegionAndIspOutput namePair) {
    this.namePair = namePair;
  }

  public CountryForDescribeCdnRegionAndIspOutput regions(List<RegionForDescribeCdnRegionAndIspOutput> regions) {
    this.regions = regions;
    return this;
  }

  public CountryForDescribeCdnRegionAndIspOutput addRegionsItem(RegionForDescribeCdnRegionAndIspOutput regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<RegionForDescribeCdnRegionAndIspOutput>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @Valid
  @Schema(description = "")
  public List<RegionForDescribeCdnRegionAndIspOutput> getRegions() {
    return regions;
  }

  public void setRegions(List<RegionForDescribeCdnRegionAndIspOutput> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryForDescribeCdnRegionAndIspOutput countryForDescribeCdnRegionAndIspOutput = (CountryForDescribeCdnRegionAndIspOutput) o;
    return Objects.equals(this.namePair, countryForDescribeCdnRegionAndIspOutput.namePair) &&
        Objects.equals(this.regions, countryForDescribeCdnRegionAndIspOutput.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namePair, regions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryForDescribeCdnRegionAndIspOutput {\n");
    
    sb.append("    namePair: ").append(toIndentedString(namePair)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
