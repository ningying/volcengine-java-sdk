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
import com.volcengine.vpn.model.IkeConfigForDescribeVpnConnectionAttributesOutput;
import com.volcengine.vpn.model.IpsecConfigForDescribeVpnConnectionAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnConnectionAttributesResponse
 */



public class DescribeVpnConnectionAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AttachStatus")
  private String attachStatus = null;

  @SerializedName("AttachType")
  private String attachType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("ConnectStatus")
  private String connectStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerGatewayId")
  private String customerGatewayId = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DpdAction")
  private String dpdAction = null;

  @SerializedName("IkeConfig")
  private IkeConfigForDescribeVpnConnectionAttributesOutput ikeConfig = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("IpsecConfig")
  private IpsecConfigForDescribeVpnConnectionAttributesOutput ipsecConfig = null;

  @SerializedName("IsBlocked")
  private Boolean isBlocked = null;

  @SerializedName("LocalSubnet")
  private List<String> localSubnet = null;

  @SerializedName("LogEnabled")
  private Boolean logEnabled = null;

  @SerializedName("NatTraversal")
  private Boolean natTraversal = null;

  @SerializedName("NegotiateInstantly")
  private Boolean negotiateInstantly = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RemoteSubnet")
  private List<String> remoteSubnet = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpnConnectionId")
  private String vpnConnectionId = null;

  @SerializedName("VpnConnectionName")
  private String vpnConnectionName = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public DescribeVpnConnectionAttributesResponse accountId(String accountId) {
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

  public DescribeVpnConnectionAttributesResponse attachStatus(String attachStatus) {
    this.attachStatus = attachStatus;
    return this;
  }

   /**
   * Get attachStatus
   * @return attachStatus
  **/
  @Schema(description = "")
  public String getAttachStatus() {
    return attachStatus;
  }

  public void setAttachStatus(String attachStatus) {
    this.attachStatus = attachStatus;
  }

  public DescribeVpnConnectionAttributesResponse attachType(String attachType) {
    this.attachType = attachType;
    return this;
  }

   /**
   * Get attachType
   * @return attachType
  **/
  @Schema(description = "")
  public String getAttachType() {
    return attachType;
  }

  public void setAttachType(String attachType) {
    this.attachType = attachType;
  }

  public DescribeVpnConnectionAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeVpnConnectionAttributesResponse connectStatus(String connectStatus) {
    this.connectStatus = connectStatus;
    return this;
  }

   /**
   * Get connectStatus
   * @return connectStatus
  **/
  @Schema(description = "")
  public String getConnectStatus() {
    return connectStatus;
  }

  public void setConnectStatus(String connectStatus) {
    this.connectStatus = connectStatus;
  }

  public DescribeVpnConnectionAttributesResponse creationTime(String creationTime) {
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

  public DescribeVpnConnectionAttributesResponse customerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
    return this;
  }

   /**
   * Get customerGatewayId
   * @return customerGatewayId
  **/
  @Schema(description = "")
  public String getCustomerGatewayId() {
    return customerGatewayId;
  }

  public void setCustomerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
  }

  public DescribeVpnConnectionAttributesResponse deletedTime(String deletedTime) {
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

  public DescribeVpnConnectionAttributesResponse description(String description) {
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

  public DescribeVpnConnectionAttributesResponse dpdAction(String dpdAction) {
    this.dpdAction = dpdAction;
    return this;
  }

   /**
   * Get dpdAction
   * @return dpdAction
  **/
  @Schema(description = "")
  public String getDpdAction() {
    return dpdAction;
  }

  public void setDpdAction(String dpdAction) {
    this.dpdAction = dpdAction;
  }

  public DescribeVpnConnectionAttributesResponse ikeConfig(IkeConfigForDescribeVpnConnectionAttributesOutput ikeConfig) {
    this.ikeConfig = ikeConfig;
    return this;
  }

   /**
   * Get ikeConfig
   * @return ikeConfig
  **/
  @Valid
  @Schema(description = "")
  public IkeConfigForDescribeVpnConnectionAttributesOutput getIkeConfig() {
    return ikeConfig;
  }

  public void setIkeConfig(IkeConfigForDescribeVpnConnectionAttributesOutput ikeConfig) {
    this.ikeConfig = ikeConfig;
  }

  public DescribeVpnConnectionAttributesResponse ipAddress(String ipAddress) {
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

  public DescribeVpnConnectionAttributesResponse ipsecConfig(IpsecConfigForDescribeVpnConnectionAttributesOutput ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
    return this;
  }

   /**
   * Get ipsecConfig
   * @return ipsecConfig
  **/
  @Valid
  @Schema(description = "")
  public IpsecConfigForDescribeVpnConnectionAttributesOutput getIpsecConfig() {
    return ipsecConfig;
  }

  public void setIpsecConfig(IpsecConfigForDescribeVpnConnectionAttributesOutput ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
  }

  public DescribeVpnConnectionAttributesResponse isBlocked(Boolean isBlocked) {
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

  public DescribeVpnConnectionAttributesResponse localSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
    return this;
  }

  public DescribeVpnConnectionAttributesResponse addLocalSubnetItem(String localSubnetItem) {
    if (this.localSubnet == null) {
      this.localSubnet = new ArrayList<String>();
    }
    this.localSubnet.add(localSubnetItem);
    return this;
  }

   /**
   * Get localSubnet
   * @return localSubnet
  **/
  @Schema(description = "")
  public List<String> getLocalSubnet() {
    return localSubnet;
  }

  public void setLocalSubnet(List<String> localSubnet) {
    this.localSubnet = localSubnet;
  }

  public DescribeVpnConnectionAttributesResponse logEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
    return this;
  }

   /**
   * Get logEnabled
   * @return logEnabled
  **/
  @Schema(description = "")
  public Boolean isLogEnabled() {
    return logEnabled;
  }

  public void setLogEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
  }

  public DescribeVpnConnectionAttributesResponse natTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
    return this;
  }

   /**
   * Get natTraversal
   * @return natTraversal
  **/
  @Schema(description = "")
  public Boolean isNatTraversal() {
    return natTraversal;
  }

  public void setNatTraversal(Boolean natTraversal) {
    this.natTraversal = natTraversal;
  }

  public DescribeVpnConnectionAttributesResponse negotiateInstantly(Boolean negotiateInstantly) {
    this.negotiateInstantly = negotiateInstantly;
    return this;
  }

   /**
   * Get negotiateInstantly
   * @return negotiateInstantly
  **/
  @Schema(description = "")
  public Boolean isNegotiateInstantly() {
    return negotiateInstantly;
  }

  public void setNegotiateInstantly(Boolean negotiateInstantly) {
    this.negotiateInstantly = negotiateInstantly;
  }

  public DescribeVpnConnectionAttributesResponse overdueTime(String overdueTime) {
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

  public DescribeVpnConnectionAttributesResponse projectName(String projectName) {
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

  public DescribeVpnConnectionAttributesResponse remoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
    return this;
  }

  public DescribeVpnConnectionAttributesResponse addRemoteSubnetItem(String remoteSubnetItem) {
    if (this.remoteSubnet == null) {
      this.remoteSubnet = new ArrayList<String>();
    }
    this.remoteSubnet.add(remoteSubnetItem);
    return this;
  }

   /**
   * Get remoteSubnet
   * @return remoteSubnet
  **/
  @Schema(description = "")
  public List<String> getRemoteSubnet() {
    return remoteSubnet;
  }

  public void setRemoteSubnet(List<String> remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
  }

  public DescribeVpnConnectionAttributesResponse requestId(String requestId) {
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

  public DescribeVpnConnectionAttributesResponse status(String status) {
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

  public DescribeVpnConnectionAttributesResponse updateTime(String updateTime) {
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

  public DescribeVpnConnectionAttributesResponse vpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * Get vpnConnectionId
   * @return vpnConnectionId
  **/
  @Schema(description = "")
  public String getVpnConnectionId() {
    return vpnConnectionId;
  }

  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }

  public DescribeVpnConnectionAttributesResponse vpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
    return this;
  }

   /**
   * Get vpnConnectionName
   * @return vpnConnectionName
  **/
  @Schema(description = "")
  public String getVpnConnectionName() {
    return vpnConnectionName;
  }

  public void setVpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
  }

  public DescribeVpnConnectionAttributesResponse vpnGatewayId(String vpnGatewayId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnConnectionAttributesResponse describeVpnConnectionAttributesResponse = (DescribeVpnConnectionAttributesResponse) o;
    return Objects.equals(this.accountId, describeVpnConnectionAttributesResponse.accountId) &&
        Objects.equals(this.attachStatus, describeVpnConnectionAttributesResponse.attachStatus) &&
        Objects.equals(this.attachType, describeVpnConnectionAttributesResponse.attachType) &&
        Objects.equals(this.businessStatus, describeVpnConnectionAttributesResponse.businessStatus) &&
        Objects.equals(this.connectStatus, describeVpnConnectionAttributesResponse.connectStatus) &&
        Objects.equals(this.creationTime, describeVpnConnectionAttributesResponse.creationTime) &&
        Objects.equals(this.customerGatewayId, describeVpnConnectionAttributesResponse.customerGatewayId) &&
        Objects.equals(this.deletedTime, describeVpnConnectionAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeVpnConnectionAttributesResponse.description) &&
        Objects.equals(this.dpdAction, describeVpnConnectionAttributesResponse.dpdAction) &&
        Objects.equals(this.ikeConfig, describeVpnConnectionAttributesResponse.ikeConfig) &&
        Objects.equals(this.ipAddress, describeVpnConnectionAttributesResponse.ipAddress) &&
        Objects.equals(this.ipsecConfig, describeVpnConnectionAttributesResponse.ipsecConfig) &&
        Objects.equals(this.isBlocked, describeVpnConnectionAttributesResponse.isBlocked) &&
        Objects.equals(this.localSubnet, describeVpnConnectionAttributesResponse.localSubnet) &&
        Objects.equals(this.logEnabled, describeVpnConnectionAttributesResponse.logEnabled) &&
        Objects.equals(this.natTraversal, describeVpnConnectionAttributesResponse.natTraversal) &&
        Objects.equals(this.negotiateInstantly, describeVpnConnectionAttributesResponse.negotiateInstantly) &&
        Objects.equals(this.overdueTime, describeVpnConnectionAttributesResponse.overdueTime) &&
        Objects.equals(this.projectName, describeVpnConnectionAttributesResponse.projectName) &&
        Objects.equals(this.remoteSubnet, describeVpnConnectionAttributesResponse.remoteSubnet) &&
        Objects.equals(this.requestId, describeVpnConnectionAttributesResponse.requestId) &&
        Objects.equals(this.status, describeVpnConnectionAttributesResponse.status) &&
        Objects.equals(this.updateTime, describeVpnConnectionAttributesResponse.updateTime) &&
        Objects.equals(this.vpnConnectionId, describeVpnConnectionAttributesResponse.vpnConnectionId) &&
        Objects.equals(this.vpnConnectionName, describeVpnConnectionAttributesResponse.vpnConnectionName) &&
        Objects.equals(this.vpnGatewayId, describeVpnConnectionAttributesResponse.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, attachStatus, attachType, businessStatus, connectStatus, creationTime, customerGatewayId, deletedTime, description, dpdAction, ikeConfig, ipAddress, ipsecConfig, isBlocked, localSubnet, logEnabled, natTraversal, negotiateInstantly, overdueTime, projectName, remoteSubnet, requestId, status, updateTime, vpnConnectionId, vpnConnectionName, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnConnectionAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    attachStatus: ").append(toIndentedString(attachStatus)).append("\n");
    sb.append("    attachType: ").append(toIndentedString(attachType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dpdAction: ").append(toIndentedString(dpdAction)).append("\n");
    sb.append("    ikeConfig: ").append(toIndentedString(ikeConfig)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipsecConfig: ").append(toIndentedString(ipsecConfig)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    localSubnet: ").append(toIndentedString(localSubnet)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    natTraversal: ").append(toIndentedString(natTraversal)).append("\n");
    sb.append("    negotiateInstantly: ").append(toIndentedString(negotiateInstantly)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    remoteSubnet: ").append(toIndentedString(remoteSubnet)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
    sb.append("    vpnConnectionName: ").append(toIndentedString(vpnConnectionName)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
