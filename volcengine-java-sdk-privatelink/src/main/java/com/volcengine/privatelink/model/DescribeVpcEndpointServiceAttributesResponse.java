/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatelink.model.PrivateDNSNameConfigurationForDescribeVpcEndpointServiceAttributesOutput;
import com.volcengine.privatelink.model.TagForDescribeVpcEndpointServiceAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpcEndpointServiceAttributesResponse
 */



public class DescribeVpcEndpointServiceAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AutoAcceptEnabled")
  private Boolean autoAcceptEnabled = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpAddressVersions")
  private List<String> ipAddressVersions = null;

  @SerializedName("Payer")
  private String payer = null;

  @SerializedName("PrivateDNSEnabled")
  private Boolean privateDNSEnabled = null;

  @SerializedName("PrivateDNSName")
  private String privateDNSName = null;

  @SerializedName("PrivateDNSNameConfiguration")
  private PrivateDNSNameConfigurationForDescribeVpcEndpointServiceAttributesOutput privateDNSNameConfiguration = null;

  @SerializedName("PrivateDNSType")
  private String privateDNSType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServiceDomain")
  private String serviceDomain = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("ServiceOwner")
  private String serviceOwner = null;

  @SerializedName("ServiceResourceType")
  private String serviceResourceType = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeVpcEndpointServiceAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("WildcardDomainEnabled")
  private Boolean wildcardDomainEnabled = null;

  @SerializedName("ZoneIds")
  private List<String> zoneIds = null;

  @SerializedName("ZoneIds.N")
  private List<String> zoneIdsN = null;

  public DescribeVpcEndpointServiceAttributesResponse autoAcceptEnabled(Boolean autoAcceptEnabled) {
    this.autoAcceptEnabled = autoAcceptEnabled;
    return this;
  }

   /**
   * Get autoAcceptEnabled
   * @return autoAcceptEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoAcceptEnabled() {
    return autoAcceptEnabled;
  }

  public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
    this.autoAcceptEnabled = autoAcceptEnabled;
  }

  public DescribeVpcEndpointServiceAttributesResponse billingType(Integer billingType) {
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

  public DescribeVpcEndpointServiceAttributesResponse businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public DescribeVpcEndpointServiceAttributesResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DescribeVpcEndpointServiceAttributesResponse description(String description) {
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

  public DescribeVpcEndpointServiceAttributesResponse ipAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
    return this;
  }

  public DescribeVpcEndpointServiceAttributesResponse addIpAddressVersionsItem(String ipAddressVersionsItem) {
    if (this.ipAddressVersions == null) {
      this.ipAddressVersions = new ArrayList<String>();
    }
    this.ipAddressVersions.add(ipAddressVersionsItem);
    return this;
  }

   /**
   * Get ipAddressVersions
   * @return ipAddressVersions
  **/
  @Schema(description = "")
  public List<String> getIpAddressVersions() {
    return ipAddressVersions;
  }

  public void setIpAddressVersions(List<String> ipAddressVersions) {
    this.ipAddressVersions = ipAddressVersions;
  }

  public DescribeVpcEndpointServiceAttributesResponse payer(String payer) {
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @Schema(description = "")
  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public DescribeVpcEndpointServiceAttributesResponse privateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
    return this;
  }

   /**
   * Get privateDNSEnabled
   * @return privateDNSEnabled
  **/
  @Schema(description = "")
  public Boolean isPrivateDNSEnabled() {
    return privateDNSEnabled;
  }

  public void setPrivateDNSEnabled(Boolean privateDNSEnabled) {
    this.privateDNSEnabled = privateDNSEnabled;
  }

  public DescribeVpcEndpointServiceAttributesResponse privateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
    return this;
  }

   /**
   * Get privateDNSName
   * @return privateDNSName
  **/
  @Schema(description = "")
  public String getPrivateDNSName() {
    return privateDNSName;
  }

  public void setPrivateDNSName(String privateDNSName) {
    this.privateDNSName = privateDNSName;
  }

  public DescribeVpcEndpointServiceAttributesResponse privateDNSNameConfiguration(PrivateDNSNameConfigurationForDescribeVpcEndpointServiceAttributesOutput privateDNSNameConfiguration) {
    this.privateDNSNameConfiguration = privateDNSNameConfiguration;
    return this;
  }

   /**
   * Get privateDNSNameConfiguration
   * @return privateDNSNameConfiguration
  **/
  @Valid
  @Schema(description = "")
  public PrivateDNSNameConfigurationForDescribeVpcEndpointServiceAttributesOutput getPrivateDNSNameConfiguration() {
    return privateDNSNameConfiguration;
  }

  public void setPrivateDNSNameConfiguration(PrivateDNSNameConfigurationForDescribeVpcEndpointServiceAttributesOutput privateDNSNameConfiguration) {
    this.privateDNSNameConfiguration = privateDNSNameConfiguration;
  }

  public DescribeVpcEndpointServiceAttributesResponse privateDNSType(String privateDNSType) {
    this.privateDNSType = privateDNSType;
    return this;
  }

   /**
   * Get privateDNSType
   * @return privateDNSType
  **/
  @Schema(description = "")
  public String getPrivateDNSType() {
    return privateDNSType;
  }

  public void setPrivateDNSType(String privateDNSType) {
    this.privateDNSType = privateDNSType;
  }

  public DescribeVpcEndpointServiceAttributesResponse projectName(String projectName) {
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

  public DescribeVpcEndpointServiceAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceDomain(String serviceDomain) {
    this.serviceDomain = serviceDomain;
    return this;
  }

   /**
   * Get serviceDomain
   * @return serviceDomain
  **/
  @Schema(description = "")
  public String getServiceDomain() {
    return serviceDomain;
  }

  public void setServiceDomain(String serviceDomain) {
    this.serviceDomain = serviceDomain;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceOwner(String serviceOwner) {
    this.serviceOwner = serviceOwner;
    return this;
  }

   /**
   * Get serviceOwner
   * @return serviceOwner
  **/
  @Schema(description = "")
  public String getServiceOwner() {
    return serviceOwner;
  }

  public void setServiceOwner(String serviceOwner) {
    this.serviceOwner = serviceOwner;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceResourceType(String serviceResourceType) {
    this.serviceResourceType = serviceResourceType;
    return this;
  }

   /**
   * Get serviceResourceType
   * @return serviceResourceType
  **/
  @Schema(description = "")
  public String getServiceResourceType() {
    return serviceResourceType;
  }

  public void setServiceResourceType(String serviceResourceType) {
    this.serviceResourceType = serviceResourceType;
  }

  public DescribeVpcEndpointServiceAttributesResponse serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @Schema(description = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public DescribeVpcEndpointServiceAttributesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeVpcEndpointServiceAttributesResponse tags(List<TagForDescribeVpcEndpointServiceAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeVpcEndpointServiceAttributesResponse addTagsItem(TagForDescribeVpcEndpointServiceAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeVpcEndpointServiceAttributesOutput>();
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
  public List<TagForDescribeVpcEndpointServiceAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeVpcEndpointServiceAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeVpcEndpointServiceAttributesResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public DescribeVpcEndpointServiceAttributesResponse wildcardDomainEnabled(Boolean wildcardDomainEnabled) {
    this.wildcardDomainEnabled = wildcardDomainEnabled;
    return this;
  }

   /**
   * Get wildcardDomainEnabled
   * @return wildcardDomainEnabled
  **/
  @Schema(description = "")
  public Boolean isWildcardDomainEnabled() {
    return wildcardDomainEnabled;
  }

  public void setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
    this.wildcardDomainEnabled = wildcardDomainEnabled;
  }

  public DescribeVpcEndpointServiceAttributesResponse zoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
    return this;
  }

  public DescribeVpcEndpointServiceAttributesResponse addZoneIdsItem(String zoneIdsItem) {
    if (this.zoneIds == null) {
      this.zoneIds = new ArrayList<String>();
    }
    this.zoneIds.add(zoneIdsItem);
    return this;
  }

   /**
   * Get zoneIds
   * @return zoneIds
  **/
  @Schema(description = "")
  public List<String> getZoneIds() {
    return zoneIds;
  }

  public void setZoneIds(List<String> zoneIds) {
    this.zoneIds = zoneIds;
  }

  public DescribeVpcEndpointServiceAttributesResponse zoneIdsN(List<String> zoneIdsN) {
    this.zoneIdsN = zoneIdsN;
    return this;
  }

  public DescribeVpcEndpointServiceAttributesResponse addZoneIdsNItem(String zoneIdsNItem) {
    if (this.zoneIdsN == null) {
      this.zoneIdsN = new ArrayList<String>();
    }
    this.zoneIdsN.add(zoneIdsNItem);
    return this;
  }

   /**
   * Get zoneIdsN
   * @return zoneIdsN
  **/
  @Schema(description = "")
  public List<String> getZoneIdsN() {
    return zoneIdsN;
  }

  public void setZoneIdsN(List<String> zoneIdsN) {
    this.zoneIdsN = zoneIdsN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpcEndpointServiceAttributesResponse describeVpcEndpointServiceAttributesResponse = (DescribeVpcEndpointServiceAttributesResponse) o;
    return Objects.equals(this.autoAcceptEnabled, describeVpcEndpointServiceAttributesResponse.autoAcceptEnabled) &&
        Objects.equals(this.billingType, describeVpcEndpointServiceAttributesResponse.billingType) &&
        Objects.equals(this.businessStatus, describeVpcEndpointServiceAttributesResponse.businessStatus) &&
        Objects.equals(this.creationTime, describeVpcEndpointServiceAttributesResponse.creationTime) &&
        Objects.equals(this.description, describeVpcEndpointServiceAttributesResponse.description) &&
        Objects.equals(this.ipAddressVersions, describeVpcEndpointServiceAttributesResponse.ipAddressVersions) &&
        Objects.equals(this.payer, describeVpcEndpointServiceAttributesResponse.payer) &&
        Objects.equals(this.privateDNSEnabled, describeVpcEndpointServiceAttributesResponse.privateDNSEnabled) &&
        Objects.equals(this.privateDNSName, describeVpcEndpointServiceAttributesResponse.privateDNSName) &&
        Objects.equals(this.privateDNSNameConfiguration, describeVpcEndpointServiceAttributesResponse.privateDNSNameConfiguration) &&
        Objects.equals(this.privateDNSType, describeVpcEndpointServiceAttributesResponse.privateDNSType) &&
        Objects.equals(this.projectName, describeVpcEndpointServiceAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeVpcEndpointServiceAttributesResponse.requestId) &&
        Objects.equals(this.serviceDomain, describeVpcEndpointServiceAttributesResponse.serviceDomain) &&
        Objects.equals(this.serviceId, describeVpcEndpointServiceAttributesResponse.serviceId) &&
        Objects.equals(this.serviceName, describeVpcEndpointServiceAttributesResponse.serviceName) &&
        Objects.equals(this.serviceOwner, describeVpcEndpointServiceAttributesResponse.serviceOwner) &&
        Objects.equals(this.serviceResourceType, describeVpcEndpointServiceAttributesResponse.serviceResourceType) &&
        Objects.equals(this.serviceType, describeVpcEndpointServiceAttributesResponse.serviceType) &&
        Objects.equals(this.status, describeVpcEndpointServiceAttributesResponse.status) &&
        Objects.equals(this.tags, describeVpcEndpointServiceAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeVpcEndpointServiceAttributesResponse.updateTime) &&
        Objects.equals(this.wildcardDomainEnabled, describeVpcEndpointServiceAttributesResponse.wildcardDomainEnabled) &&
        Objects.equals(this.zoneIds, describeVpcEndpointServiceAttributesResponse.zoneIds) &&
        Objects.equals(this.zoneIdsN, describeVpcEndpointServiceAttributesResponse.zoneIdsN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAcceptEnabled, billingType, businessStatus, creationTime, description, ipAddressVersions, payer, privateDNSEnabled, privateDNSName, privateDNSNameConfiguration, privateDNSType, projectName, requestId, serviceDomain, serviceId, serviceName, serviceOwner, serviceResourceType, serviceType, status, tags, updateTime, wildcardDomainEnabled, zoneIds, zoneIdsN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcEndpointServiceAttributesResponse {\n");
    
    sb.append("    autoAcceptEnabled: ").append(toIndentedString(autoAcceptEnabled)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddressVersions: ").append(toIndentedString(ipAddressVersions)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    privateDNSEnabled: ").append(toIndentedString(privateDNSEnabled)).append("\n");
    sb.append("    privateDNSName: ").append(toIndentedString(privateDNSName)).append("\n");
    sb.append("    privateDNSNameConfiguration: ").append(toIndentedString(privateDNSNameConfiguration)).append("\n");
    sb.append("    privateDNSType: ").append(toIndentedString(privateDNSType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serviceDomain: ").append(toIndentedString(serviceDomain)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceOwner: ").append(toIndentedString(serviceOwner)).append("\n");
    sb.append("    serviceResourceType: ").append(toIndentedString(serviceResourceType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    wildcardDomainEnabled: ").append(toIndentedString(wildcardDomainEnabled)).append("\n");
    sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
    sb.append("    zoneIdsN: ").append(toIndentedString(zoneIdsN)).append("\n");
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
