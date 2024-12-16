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
import com.volcengine.vpn.model.TagForDescribeVpnGatewaysBillingOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpnGatewayForDescribeVpnGatewaysBillingOutput
 */



public class VpnGatewayForDescribeVpnGatewaysBillingOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Asn")
  private Integer asn = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("ConnectionCount")
  private Integer connectionCount = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("IpsecEnabled")
  private Boolean ipsecEnabled = null;

  @SerializedName("IsBlocked")
  private Boolean isBlocked = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RouteCount")
  private Integer routeCount = null;

  @SerializedName("SslEnabled")
  private Boolean sslEnabled = null;

  @SerializedName("SslMaxConnections")
  private Integer sslMaxConnections = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeVpnGatewaysBillingOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public VpnGatewayForDescribeVpnGatewaysBillingOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput asn(Integer asn) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput bandwidth(Integer bandwidth) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput billingType(Integer billingType) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput businessStatus(String businessStatus) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  @Schema(description = "")
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput creationTime(String creationTime) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput description(String description) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput ipsecEnabled(Boolean ipsecEnabled) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Get isBlocked
   * @return isBlocked
  **/
  @Schema(description = "")
  public Boolean isIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput projectName(String projectName) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput routeCount(Integer routeCount) {
    this.routeCount = routeCount;
    return this;
  }

   /**
   * Get routeCount
   * @return routeCount
  **/
  @Schema(description = "")
  public Integer getRouteCount() {
    return routeCount;
  }

  public void setRouteCount(Integer routeCount) {
    this.routeCount = routeCount;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput sslEnabled(Boolean sslEnabled) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput sslMaxConnections(Integer sslMaxConnections) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput status(String status) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput tags(List<TagForDescribeVpnGatewaysBillingOutput> tags) {
    this.tags = tags;
    return this;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput addTagsItem(TagForDescribeVpnGatewaysBillingOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeVpnGatewaysBillingOutput>();
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
  public List<TagForDescribeVpnGatewaysBillingOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeVpnGatewaysBillingOutput> tags) {
    this.tags = tags;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput updateTime(String updateTime) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @Schema(description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput vpnGatewayName(String vpnGatewayName) {
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
    VpnGatewayForDescribeVpnGatewaysBillingOutput vpnGatewayForDescribeVpnGatewaysBillingOutput = (VpnGatewayForDescribeVpnGatewaysBillingOutput) o;
    return Objects.equals(this.accountId, vpnGatewayForDescribeVpnGatewaysBillingOutput.accountId) &&
        Objects.equals(this.asn, vpnGatewayForDescribeVpnGatewaysBillingOutput.asn) &&
        Objects.equals(this.bandwidth, vpnGatewayForDescribeVpnGatewaysBillingOutput.bandwidth) &&
        Objects.equals(this.billingType, vpnGatewayForDescribeVpnGatewaysBillingOutput.billingType) &&
        Objects.equals(this.businessStatus, vpnGatewayForDescribeVpnGatewaysBillingOutput.businessStatus) &&
        Objects.equals(this.connectionCount, vpnGatewayForDescribeVpnGatewaysBillingOutput.connectionCount) &&
        Objects.equals(this.creationTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.creationTime) &&
        Objects.equals(this.deletedTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.deletedTime) &&
        Objects.equals(this.description, vpnGatewayForDescribeVpnGatewaysBillingOutput.description) &&
        Objects.equals(this.expiredTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.expiredTime) &&
        Objects.equals(this.ipAddress, vpnGatewayForDescribeVpnGatewaysBillingOutput.ipAddress) &&
        Objects.equals(this.ipsecEnabled, vpnGatewayForDescribeVpnGatewaysBillingOutput.ipsecEnabled) &&
        Objects.equals(this.isBlocked, vpnGatewayForDescribeVpnGatewaysBillingOutput.isBlocked) &&
        Objects.equals(this.lockReason, vpnGatewayForDescribeVpnGatewaysBillingOutput.lockReason) &&
        Objects.equals(this.overdueTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.overdueTime) &&
        Objects.equals(this.projectName, vpnGatewayForDescribeVpnGatewaysBillingOutput.projectName) &&
        Objects.equals(this.routeCount, vpnGatewayForDescribeVpnGatewaysBillingOutput.routeCount) &&
        Objects.equals(this.sslEnabled, vpnGatewayForDescribeVpnGatewaysBillingOutput.sslEnabled) &&
        Objects.equals(this.sslMaxConnections, vpnGatewayForDescribeVpnGatewaysBillingOutput.sslMaxConnections) &&
        Objects.equals(this.status, vpnGatewayForDescribeVpnGatewaysBillingOutput.status) &&
        Objects.equals(this.subnetId, vpnGatewayForDescribeVpnGatewaysBillingOutput.subnetId) &&
        Objects.equals(this.tags, vpnGatewayForDescribeVpnGatewaysBillingOutput.tags) &&
        Objects.equals(this.updateTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.updateTime) &&
        Objects.equals(this.vpcId, vpnGatewayForDescribeVpnGatewaysBillingOutput.vpcId) &&
        Objects.equals(this.vpnGatewayId, vpnGatewayForDescribeVpnGatewaysBillingOutput.vpnGatewayId) &&
        Objects.equals(this.vpnGatewayName, vpnGatewayForDescribeVpnGatewaysBillingOutput.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, asn, bandwidth, billingType, businessStatus, connectionCount, creationTime, deletedTime, description, expiredTime, ipAddress, ipsecEnabled, isBlocked, lockReason, overdueTime, projectName, routeCount, sslEnabled, sslMaxConnections, status, subnetId, tags, updateTime, vpcId, vpnGatewayId, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnGatewayForDescribeVpnGatewaysBillingOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipsecEnabled: ").append(toIndentedString(ipsecEnabled)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    routeCount: ").append(toIndentedString(routeCount)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    sslMaxConnections: ").append(toIndentedString(sslMaxConnections)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
