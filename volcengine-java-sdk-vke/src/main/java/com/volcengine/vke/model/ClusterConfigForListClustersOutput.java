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
import com.volcengine.vke.model.ApiServerEndpointsForListClustersOutput;
import com.volcengine.vke.model.ApiServerPublicAccessConfigForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ClusterConfigForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-16T11:30:28.141424+08:00[Asia/Shanghai]")
public class ClusterConfigForListClustersOutput {
  @SerializedName("ApiServerEndpoints")
  private ApiServerEndpointsForListClustersOutput apiServerEndpoints = null;

  @SerializedName("ApiServerPublicAccessConfig")
  private ApiServerPublicAccessConfigForListClustersOutput apiServerPublicAccessConfig = null;

  @SerializedName("ApiServerPublicAccessEnabled")
  private Boolean apiServerPublicAccessEnabled = null;

  @SerializedName("ResourcePublicAccessDefaultEnabled")
  private Boolean resourcePublicAccessDefaultEnabled = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public ClusterConfigForListClustersOutput apiServerEndpoints(ApiServerEndpointsForListClustersOutput apiServerEndpoints) {
    this.apiServerEndpoints = apiServerEndpoints;
    return this;
  }

   /**
   * Get apiServerEndpoints
   * @return apiServerEndpoints
  **/
  @Valid
  @Schema(description = "")
  public ApiServerEndpointsForListClustersOutput getApiServerEndpoints() {
    return apiServerEndpoints;
  }

  public void setApiServerEndpoints(ApiServerEndpointsForListClustersOutput apiServerEndpoints) {
    this.apiServerEndpoints = apiServerEndpoints;
  }

  public ClusterConfigForListClustersOutput apiServerPublicAccessConfig(ApiServerPublicAccessConfigForListClustersOutput apiServerPublicAccessConfig) {
    this.apiServerPublicAccessConfig = apiServerPublicAccessConfig;
    return this;
  }

   /**
   * Get apiServerPublicAccessConfig
   * @return apiServerPublicAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public ApiServerPublicAccessConfigForListClustersOutput getApiServerPublicAccessConfig() {
    return apiServerPublicAccessConfig;
  }

  public void setApiServerPublicAccessConfig(ApiServerPublicAccessConfigForListClustersOutput apiServerPublicAccessConfig) {
    this.apiServerPublicAccessConfig = apiServerPublicAccessConfig;
  }

  public ClusterConfigForListClustersOutput apiServerPublicAccessEnabled(Boolean apiServerPublicAccessEnabled) {
    this.apiServerPublicAccessEnabled = apiServerPublicAccessEnabled;
    return this;
  }

   /**
   * Get apiServerPublicAccessEnabled
   * @return apiServerPublicAccessEnabled
  **/
  @Schema(description = "")
  public Boolean isApiServerPublicAccessEnabled() {
    return apiServerPublicAccessEnabled;
  }

  public void setApiServerPublicAccessEnabled(Boolean apiServerPublicAccessEnabled) {
    this.apiServerPublicAccessEnabled = apiServerPublicAccessEnabled;
  }

  public ClusterConfigForListClustersOutput resourcePublicAccessDefaultEnabled(Boolean resourcePublicAccessDefaultEnabled) {
    this.resourcePublicAccessDefaultEnabled = resourcePublicAccessDefaultEnabled;
    return this;
  }

   /**
   * Get resourcePublicAccessDefaultEnabled
   * @return resourcePublicAccessDefaultEnabled
  **/
  @Schema(description = "")
  public Boolean isResourcePublicAccessDefaultEnabled() {
    return resourcePublicAccessDefaultEnabled;
  }

  public void setResourcePublicAccessDefaultEnabled(Boolean resourcePublicAccessDefaultEnabled) {
    this.resourcePublicAccessDefaultEnabled = resourcePublicAccessDefaultEnabled;
  }

  public ClusterConfigForListClustersOutput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public ClusterConfigForListClustersOutput addSecurityGroupIdsItem(String securityGroupIdsItem) {
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

  public ClusterConfigForListClustersOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public ClusterConfigForListClustersOutput addSubnetIdsItem(String subnetIdsItem) {
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

  public ClusterConfigForListClustersOutput vpcId(String vpcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterConfigForListClustersOutput clusterConfigForListClustersOutput = (ClusterConfigForListClustersOutput) o;
    return Objects.equals(this.apiServerEndpoints, clusterConfigForListClustersOutput.apiServerEndpoints) &&
        Objects.equals(this.apiServerPublicAccessConfig, clusterConfigForListClustersOutput.apiServerPublicAccessConfig) &&
        Objects.equals(this.apiServerPublicAccessEnabled, clusterConfigForListClustersOutput.apiServerPublicAccessEnabled) &&
        Objects.equals(this.resourcePublicAccessDefaultEnabled, clusterConfigForListClustersOutput.resourcePublicAccessDefaultEnabled) &&
        Objects.equals(this.securityGroupIds, clusterConfigForListClustersOutput.securityGroupIds) &&
        Objects.equals(this.subnetIds, clusterConfigForListClustersOutput.subnetIds) &&
        Objects.equals(this.vpcId, clusterConfigForListClustersOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServerEndpoints, apiServerPublicAccessConfig, apiServerPublicAccessEnabled, resourcePublicAccessDefaultEnabled, securityGroupIds, subnetIds, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterConfigForListClustersOutput {\n");
    
    sb.append("    apiServerEndpoints: ").append(toIndentedString(apiServerEndpoints)).append("\n");
    sb.append("    apiServerPublicAccessConfig: ").append(toIndentedString(apiServerPublicAccessConfig)).append("\n");
    sb.append("    apiServerPublicAccessEnabled: ").append(toIndentedString(apiServerPublicAccessEnabled)).append("\n");
    sb.append("    resourcePublicAccessDefaultEnabled: ").append(toIndentedString(resourcePublicAccessDefaultEnabled)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
