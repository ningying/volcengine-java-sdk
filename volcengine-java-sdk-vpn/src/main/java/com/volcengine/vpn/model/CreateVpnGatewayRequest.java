/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.TagForCreateVpnGatewayInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVpnGatewayRequest
 */



public class CreateVpnGatewayRequest {
  @SerializedName("Asn")
  private Integer asn = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpsecEnabled")
  private Boolean ipsecEnabled = null;

  @SerializedName("Period")
  private Integer period = null;

  @SerializedName("PeriodUnit")
  private String periodUnit = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SslEnabled")
  private Boolean sslEnabled = null;

  @SerializedName("SslMaxConnections")
  private Integer sslMaxConnections = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForCreateVpnGatewayInput> tags = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public CreateVpnGatewayRequest asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(description = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public CreateVpnGatewayRequest bandwidth(Integer bandwidth) {
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

  public CreateVpnGatewayRequest billingType(Integer billingType) {
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

  public CreateVpnGatewayRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateVpnGatewayRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateVpnGatewayRequest ipsecEnabled(Boolean ipsecEnabled) {
    this.ipsecEnabled = ipsecEnabled;
    return this;
  }

   /**
   * Get ipsecEnabled
   * @return ipsecEnabled
  **/
  @Schema(description = "")
  public Boolean isIpsecEnabled() {
    return ipsecEnabled;
  }

  public void setIpsecEnabled(Boolean ipsecEnabled) {
    this.ipsecEnabled = ipsecEnabled;
  }

  public CreateVpnGatewayRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public CreateVpnGatewayRequest periodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public String getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateVpnGatewayRequest projectName(String projectName) {
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

  public CreateVpnGatewayRequest sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * Get sslEnabled
   * @return sslEnabled
  **/
  @Schema(description = "")
  public Boolean isSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public CreateVpnGatewayRequest sslMaxConnections(Integer sslMaxConnections) {
    this.sslMaxConnections = sslMaxConnections;
    return this;
  }

   /**
   * Get sslMaxConnections
   * @return sslMaxConnections
  **/
  @Schema(description = "")
  public Integer getSslMaxConnections() {
    return sslMaxConnections;
  }

  public void setSslMaxConnections(Integer sslMaxConnections) {
    this.sslMaxConnections = sslMaxConnections;
  }

  public CreateVpnGatewayRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public CreateVpnGatewayRequest tags(List<TagForCreateVpnGatewayInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateVpnGatewayRequest addTagsItem(TagForCreateVpnGatewayInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateVpnGatewayInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateVpnGatewayInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateVpnGatewayInput> tags) {
    this.tags = tags;
  }

  public CreateVpnGatewayRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public CreateVpnGatewayRequest vpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
    return this;
  }

   /**
   * Get vpnGatewayName
   * @return vpnGatewayName
  **/
  @Schema(description = "")
  public String getVpnGatewayName() {
    return vpnGatewayName;
  }

  public void setVpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpnGatewayRequest createVpnGatewayRequest = (CreateVpnGatewayRequest) o;
    return Objects.equals(this.asn, createVpnGatewayRequest.asn) &&
        Objects.equals(this.bandwidth, createVpnGatewayRequest.bandwidth) &&
        Objects.equals(this.billingType, createVpnGatewayRequest.billingType) &&
        Objects.equals(this.clientToken, createVpnGatewayRequest.clientToken) &&
        Objects.equals(this.description, createVpnGatewayRequest.description) &&
        Objects.equals(this.ipsecEnabled, createVpnGatewayRequest.ipsecEnabled) &&
        Objects.equals(this.period, createVpnGatewayRequest.period) &&
        Objects.equals(this.periodUnit, createVpnGatewayRequest.periodUnit) &&
        Objects.equals(this.projectName, createVpnGatewayRequest.projectName) &&
        Objects.equals(this.sslEnabled, createVpnGatewayRequest.sslEnabled) &&
        Objects.equals(this.sslMaxConnections, createVpnGatewayRequest.sslMaxConnections) &&
        Objects.equals(this.subnetId, createVpnGatewayRequest.subnetId) &&
        Objects.equals(this.tags, createVpnGatewayRequest.tags) &&
        Objects.equals(this.vpcId, createVpnGatewayRequest.vpcId) &&
        Objects.equals(this.vpnGatewayName, createVpnGatewayRequest.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, bandwidth, billingType, clientToken, description, ipsecEnabled, period, periodUnit, projectName, sslEnabled, sslMaxConnections, subnetId, tags, vpcId, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpnGatewayRequest {\n");
    
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipsecEnabled: ").append(toIndentedString(ipsecEnabled)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    sslMaxConnections: ").append(toIndentedString(sslMaxConnections)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpnGatewayName: ").append(toIndentedString(vpnGatewayName)).append("\n");
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
