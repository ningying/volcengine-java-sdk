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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SslVpnServerForDescribeSslVpnServersOutput
 */



public class SslVpnServerForDescribeSslVpnServersOutput {
  @SerializedName("Auth")
  private String auth = null;

  @SerializedName("Cipher")
  private String cipher = null;

  @SerializedName("ClientIpPool")
  private String clientIpPool = null;

  @SerializedName("Compress")
  private Boolean compress = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IsBlocked")
  private Boolean isBlocked = null;

  @SerializedName("LocalSubnets")
  private List<String> localSubnets = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("SslVpnServerId")
  private String sslVpnServerId = null;

  @SerializedName("SslVpnServerName")
  private String sslVpnServerName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public SslVpnServerForDescribeSslVpnServersOutput auth(String auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public String getAuth() {
    return auth;
  }

  public void setAuth(String auth) {
    this.auth = auth;
  }

  public SslVpnServerForDescribeSslVpnServersOutput cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

   /**
   * Get cipher
   * @return cipher
  **/
  @Schema(description = "")
  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public SslVpnServerForDescribeSslVpnServersOutput clientIpPool(String clientIpPool) {
    this.clientIpPool = clientIpPool;
    return this;
  }

   /**
   * Get clientIpPool
   * @return clientIpPool
  **/
  @Schema(description = "")
  public String getClientIpPool() {
    return clientIpPool;
  }

  public void setClientIpPool(String clientIpPool) {
    this.clientIpPool = clientIpPool;
  }

  public SslVpnServerForDescribeSslVpnServersOutput compress(Boolean compress) {
    this.compress = compress;
    return this;
  }

   /**
   * Get compress
   * @return compress
  **/
  @Schema(description = "")
  public Boolean isCompress() {
    return compress;
  }

  public void setCompress(Boolean compress) {
    this.compress = compress;
  }

  public SslVpnServerForDescribeSslVpnServersOutput creationTime(String creationTime) {
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

  public SslVpnServerForDescribeSslVpnServersOutput description(String description) {
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

  public SslVpnServerForDescribeSslVpnServersOutput isBlocked(Boolean isBlocked) {
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

  public SslVpnServerForDescribeSslVpnServersOutput localSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
    return this;
  }

  public SslVpnServerForDescribeSslVpnServersOutput addLocalSubnetsItem(String localSubnetsItem) {
    if (this.localSubnets == null) {
      this.localSubnets = new ArrayList<String>();
    }
    this.localSubnets.add(localSubnetsItem);
    return this;
  }

   /**
   * Get localSubnets
   * @return localSubnets
  **/
  @Schema(description = "")
  public List<String> getLocalSubnets() {
    return localSubnets;
  }

  public void setLocalSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
  }

  public SslVpnServerForDescribeSslVpnServersOutput port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SslVpnServerForDescribeSslVpnServersOutput projectName(String projectName) {
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

  public SslVpnServerForDescribeSslVpnServersOutput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SslVpnServerForDescribeSslVpnServersOutput sslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
    return this;
  }

   /**
   * Get sslVpnServerId
   * @return sslVpnServerId
  **/
  @Schema(description = "")
  public String getSslVpnServerId() {
    return sslVpnServerId;
  }

  public void setSslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
  }

  public SslVpnServerForDescribeSslVpnServersOutput sslVpnServerName(String sslVpnServerName) {
    this.sslVpnServerName = sslVpnServerName;
    return this;
  }

   /**
   * Get sslVpnServerName
   * @return sslVpnServerName
  **/
  @Schema(description = "")
  public String getSslVpnServerName() {
    return sslVpnServerName;
  }

  public void setSslVpnServerName(String sslVpnServerName) {
    this.sslVpnServerName = sslVpnServerName;
  }

  public SslVpnServerForDescribeSslVpnServersOutput status(String status) {
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

  public SslVpnServerForDescribeSslVpnServersOutput updateTime(String updateTime) {
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

  public SslVpnServerForDescribeSslVpnServersOutput vpnGatewayId(String vpnGatewayId) {
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
    SslVpnServerForDescribeSslVpnServersOutput sslVpnServerForDescribeSslVpnServersOutput = (SslVpnServerForDescribeSslVpnServersOutput) o;
    return Objects.equals(this.auth, sslVpnServerForDescribeSslVpnServersOutput.auth) &&
        Objects.equals(this.cipher, sslVpnServerForDescribeSslVpnServersOutput.cipher) &&
        Objects.equals(this.clientIpPool, sslVpnServerForDescribeSslVpnServersOutput.clientIpPool) &&
        Objects.equals(this.compress, sslVpnServerForDescribeSslVpnServersOutput.compress) &&
        Objects.equals(this.creationTime, sslVpnServerForDescribeSslVpnServersOutput.creationTime) &&
        Objects.equals(this.description, sslVpnServerForDescribeSslVpnServersOutput.description) &&
        Objects.equals(this.isBlocked, sslVpnServerForDescribeSslVpnServersOutput.isBlocked) &&
        Objects.equals(this.localSubnets, sslVpnServerForDescribeSslVpnServersOutput.localSubnets) &&
        Objects.equals(this.port, sslVpnServerForDescribeSslVpnServersOutput.port) &&
        Objects.equals(this.projectName, sslVpnServerForDescribeSslVpnServersOutput.projectName) &&
        Objects.equals(this.protocol, sslVpnServerForDescribeSslVpnServersOutput.protocol) &&
        Objects.equals(this.sslVpnServerId, sslVpnServerForDescribeSslVpnServersOutput.sslVpnServerId) &&
        Objects.equals(this.sslVpnServerName, sslVpnServerForDescribeSslVpnServersOutput.sslVpnServerName) &&
        Objects.equals(this.status, sslVpnServerForDescribeSslVpnServersOutput.status) &&
        Objects.equals(this.updateTime, sslVpnServerForDescribeSslVpnServersOutput.updateTime) &&
        Objects.equals(this.vpnGatewayId, sslVpnServerForDescribeSslVpnServersOutput.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, cipher, clientIpPool, compress, creationTime, description, isBlocked, localSubnets, port, projectName, protocol, sslVpnServerId, sslVpnServerName, status, updateTime, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SslVpnServerForDescribeSslVpnServersOutput {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
    sb.append("    clientIpPool: ").append(toIndentedString(clientIpPool)).append("\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sslVpnServerId: ").append(toIndentedString(sslVpnServerId)).append("\n");
    sb.append("    sslVpnServerName: ").append(toIndentedString(sslVpnServerName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
