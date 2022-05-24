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

package com.volcengine.volcstack.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.vpc.model.AssociateCenForDescribeVpcsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpcForDescribeVpcsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class VpcForDescribeVpcsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AssociateCens")
  private List<AssociateCenForDescribeVpcsOutput> associateCens = null;

  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DnsServers")
  private List<String> dnsServers = null;

  @SerializedName("IPv6CidrBlock")
  private String ipv6CidrBlock = null;

  @SerializedName("NatGatewayIds")
  private List<String> natGatewayIds = null;

  @SerializedName("NetworkAclNum")
  private String networkAclNum = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RouteTableIds")
  private List<String> routeTableIds = null;

  @SerializedName("SecondaryCidrBlocks")
  private List<String> secondaryCidrBlocks = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  public VpcForDescribeVpcsOutput accountId(String accountId) {
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

  public VpcForDescribeVpcsOutput associateCens(List<AssociateCenForDescribeVpcsOutput> associateCens) {
    this.associateCens = associateCens;
    return this;
  }

  public VpcForDescribeVpcsOutput addAssociateCensItem(AssociateCenForDescribeVpcsOutput associateCensItem) {
    if (this.associateCens == null) {
      this.associateCens = new ArrayList<AssociateCenForDescribeVpcsOutput>();
    }
    this.associateCens.add(associateCensItem);
    return this;
  }

   /**
   * Get associateCens
   * @return associateCens
  **/
  @Valid
  @Schema(description = "")
  public List<AssociateCenForDescribeVpcsOutput> getAssociateCens() {
    return associateCens;
  }

  public void setAssociateCens(List<AssociateCenForDescribeVpcsOutput> associateCens) {
    this.associateCens = associateCens;
  }

  public VpcForDescribeVpcsOutput cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public VpcForDescribeVpcsOutput creationTime(String creationTime) {
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

  public VpcForDescribeVpcsOutput description(String description) {
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

  public VpcForDescribeVpcsOutput dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public VpcForDescribeVpcsOutput addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<String>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @Schema(description = "")
  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  public VpcForDescribeVpcsOutput ipv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * Get ipv6CidrBlock
   * @return ipv6CidrBlock
  **/
  @Schema(description = "")
  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }

  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }

  public VpcForDescribeVpcsOutput natGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
    return this;
  }

  public VpcForDescribeVpcsOutput addNatGatewayIdsItem(String natGatewayIdsItem) {
    if (this.natGatewayIds == null) {
      this.natGatewayIds = new ArrayList<String>();
    }
    this.natGatewayIds.add(natGatewayIdsItem);
    return this;
  }

   /**
   * Get natGatewayIds
   * @return natGatewayIds
  **/
  @Schema(description = "")
  public List<String> getNatGatewayIds() {
    return natGatewayIds;
  }

  public void setNatGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
  }

  public VpcForDescribeVpcsOutput networkAclNum(String networkAclNum) {
    this.networkAclNum = networkAclNum;
    return this;
  }

   /**
   * Get networkAclNum
   * @return networkAclNum
  **/
  @Schema(description = "")
  public String getNetworkAclNum() {
    return networkAclNum;
  }

  public void setNetworkAclNum(String networkAclNum) {
    this.networkAclNum = networkAclNum;
  }

  public VpcForDescribeVpcsOutput projectName(String projectName) {
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

  public VpcForDescribeVpcsOutput routeTableIds(List<String> routeTableIds) {
    this.routeTableIds = routeTableIds;
    return this;
  }

  public VpcForDescribeVpcsOutput addRouteTableIdsItem(String routeTableIdsItem) {
    if (this.routeTableIds == null) {
      this.routeTableIds = new ArrayList<String>();
    }
    this.routeTableIds.add(routeTableIdsItem);
    return this;
  }

   /**
   * Get routeTableIds
   * @return routeTableIds
  **/
  @Schema(description = "")
  public List<String> getRouteTableIds() {
    return routeTableIds;
  }

  public void setRouteTableIds(List<String> routeTableIds) {
    this.routeTableIds = routeTableIds;
  }

  public VpcForDescribeVpcsOutput secondaryCidrBlocks(List<String> secondaryCidrBlocks) {
    this.secondaryCidrBlocks = secondaryCidrBlocks;
    return this;
  }

  public VpcForDescribeVpcsOutput addSecondaryCidrBlocksItem(String secondaryCidrBlocksItem) {
    if (this.secondaryCidrBlocks == null) {
      this.secondaryCidrBlocks = new ArrayList<String>();
    }
    this.secondaryCidrBlocks.add(secondaryCidrBlocksItem);
    return this;
  }

   /**
   * Get secondaryCidrBlocks
   * @return secondaryCidrBlocks
  **/
  @Schema(description = "")
  public List<String> getSecondaryCidrBlocks() {
    return secondaryCidrBlocks;
  }

  public void setSecondaryCidrBlocks(List<String> secondaryCidrBlocks) {
    this.secondaryCidrBlocks = secondaryCidrBlocks;
  }

  public VpcForDescribeVpcsOutput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public VpcForDescribeVpcsOutput addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public VpcForDescribeVpcsOutput status(String status) {
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

  public VpcForDescribeVpcsOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public VpcForDescribeVpcsOutput addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public VpcForDescribeVpcsOutput updateTime(String updateTime) {
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

  public VpcForDescribeVpcsOutput vpcId(String vpcId) {
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

  public VpcForDescribeVpcsOutput vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcForDescribeVpcsOutput vpcForDescribeVpcsOutput = (VpcForDescribeVpcsOutput) o;
    return Objects.equals(this.accountId, vpcForDescribeVpcsOutput.accountId) &&
        Objects.equals(this.associateCens, vpcForDescribeVpcsOutput.associateCens) &&
        Objects.equals(this.cidrBlock, vpcForDescribeVpcsOutput.cidrBlock) &&
        Objects.equals(this.creationTime, vpcForDescribeVpcsOutput.creationTime) &&
        Objects.equals(this.description, vpcForDescribeVpcsOutput.description) &&
        Objects.equals(this.dnsServers, vpcForDescribeVpcsOutput.dnsServers) &&
        Objects.equals(this.ipv6CidrBlock, vpcForDescribeVpcsOutput.ipv6CidrBlock) &&
        Objects.equals(this.natGatewayIds, vpcForDescribeVpcsOutput.natGatewayIds) &&
        Objects.equals(this.networkAclNum, vpcForDescribeVpcsOutput.networkAclNum) &&
        Objects.equals(this.projectName, vpcForDescribeVpcsOutput.projectName) &&
        Objects.equals(this.routeTableIds, vpcForDescribeVpcsOutput.routeTableIds) &&
        Objects.equals(this.secondaryCidrBlocks, vpcForDescribeVpcsOutput.secondaryCidrBlocks) &&
        Objects.equals(this.securityGroupIds, vpcForDescribeVpcsOutput.securityGroupIds) &&
        Objects.equals(this.status, vpcForDescribeVpcsOutput.status) &&
        Objects.equals(this.subnetIds, vpcForDescribeVpcsOutput.subnetIds) &&
        Objects.equals(this.updateTime, vpcForDescribeVpcsOutput.updateTime) &&
        Objects.equals(this.vpcId, vpcForDescribeVpcsOutput.vpcId) &&
        Objects.equals(this.vpcName, vpcForDescribeVpcsOutput.vpcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, associateCens, cidrBlock, creationTime, description, dnsServers, ipv6CidrBlock, natGatewayIds, networkAclNum, projectName, routeTableIds, secondaryCidrBlocks, securityGroupIds, status, subnetIds, updateTime, vpcId, vpcName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcForDescribeVpcsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    associateCens: ").append(toIndentedString(associateCens)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");
    sb.append("    natGatewayIds: ").append(toIndentedString(natGatewayIds)).append("\n");
    sb.append("    networkAclNum: ").append(toIndentedString(networkAclNum)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    routeTableIds: ").append(toIndentedString(routeTableIds)).append("\n");
    sb.append("    secondaryCidrBlocks: ").append(toIndentedString(secondaryCidrBlocks)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
