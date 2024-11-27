/*
 * advdefence
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.advdefence.model.ProxySetHeaderForBatchUpdHostRuleInput;
import com.volcengine.advdefence.model.ServerForBatchUpdHostRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfListForBatchUpdHostRuleInput
 */



public class ConfListForBatchUpdHostRuleInput {
  @SerializedName("AllSSLCipher")
  private Integer allSSLCipher = null;

  @SerializedName("BackUpStatus")
  private Integer backUpStatus = null;

  @SerializedName("ChunkMode")
  private Integer chunkMode = null;

  @SerializedName("ClientMaxBodySize")
  private Integer clientMaxBodySize = null;

  @SerializedName("DefIp")
  private List<String> defIp = null;

  @SerializedName("GzipMode")
  private Integer gzipMode = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Http2")
  private Integer http2 = null;

  @SerializedName("KeepAliveRequests")
  private Integer keepAliveRequests = null;

  @SerializedName("KeepAliveTimeOut")
  private Integer keepAliveTimeOut = null;

  @SerializedName("LBAlgorithm")
  private String lbAlgorithm = null;

  @SerializedName("Labels")
  private List<String> labels = null;

  @SerializedName("ProtoFollow")
  private Integer protoFollow = null;

  @SerializedName("Protocols")
  private List<String> protocols = null;

  @SerializedName("ProxyConnectTimeOut")
  private Integer proxyConnectTimeOut = null;

  @SerializedName("ProxyKeepAliveRequests")
  private Integer proxyKeepAliveRequests = null;

  @SerializedName("ProxyKeepAliveTimeOut")
  private Integer proxyKeepAliveTimeOut = null;

  @SerializedName("ProxyReadTimeOut")
  private Integer proxyReadTimeOut = null;

  @SerializedName("ProxyRetry")
  private Integer proxyRetry = null;

  @SerializedName("ProxySendTimeOut")
  private Integer proxySendTimeOut = null;

  @SerializedName("ProxySetHeader")
  private List<ProxySetHeaderForBatchUpdHostRuleInput> proxySetHeader = null;

  @SerializedName("SSLCiphers")
  private List<String> ssLCiphers = null;

  @SerializedName("SSLProtocols")
  private List<String> ssLProtocols = null;

  @SerializedName("Servers")
  private List<ServerForBatchUpdHostRuleInput> servers = null;

  @SerializedName("TLSEnable")
  private Integer tlSEnable = null;

  @SerializedName("UserCertId")
  private String userCertId = null;

  public ConfListForBatchUpdHostRuleInput allSSLCipher(Integer allSSLCipher) {
    this.allSSLCipher = allSSLCipher;
    return this;
  }

   /**
   * Get allSSLCipher
   * @return allSSLCipher
  **/
  @Schema(description = "")
  public Integer getAllSSLCipher() {
    return allSSLCipher;
  }

  public void setAllSSLCipher(Integer allSSLCipher) {
    this.allSSLCipher = allSSLCipher;
  }

  public ConfListForBatchUpdHostRuleInput backUpStatus(Integer backUpStatus) {
    this.backUpStatus = backUpStatus;
    return this;
  }

   /**
   * Get backUpStatus
   * @return backUpStatus
  **/
  @Schema(description = "")
  public Integer getBackUpStatus() {
    return backUpStatus;
  }

  public void setBackUpStatus(Integer backUpStatus) {
    this.backUpStatus = backUpStatus;
  }

  public ConfListForBatchUpdHostRuleInput chunkMode(Integer chunkMode) {
    this.chunkMode = chunkMode;
    return this;
  }

   /**
   * Get chunkMode
   * @return chunkMode
  **/
  @Schema(description = "")
  public Integer getChunkMode() {
    return chunkMode;
  }

  public void setChunkMode(Integer chunkMode) {
    this.chunkMode = chunkMode;
  }

  public ConfListForBatchUpdHostRuleInput clientMaxBodySize(Integer clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
    return this;
  }

   /**
   * Get clientMaxBodySize
   * @return clientMaxBodySize
  **/
  @Schema(description = "")
  public Integer getClientMaxBodySize() {
    return clientMaxBodySize;
  }

  public void setClientMaxBodySize(Integer clientMaxBodySize) {
    this.clientMaxBodySize = clientMaxBodySize;
  }

  public ConfListForBatchUpdHostRuleInput defIp(List<String> defIp) {
    this.defIp = defIp;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addDefIpItem(String defIpItem) {
    if (this.defIp == null) {
      this.defIp = new ArrayList<String>();
    }
    this.defIp.add(defIpItem);
    return this;
  }

   /**
   * Get defIp
   * @return defIp
  **/
  @Schema(description = "")
  public List<String> getDefIp() {
    return defIp;
  }

  public void setDefIp(List<String> defIp) {
    this.defIp = defIp;
  }

  public ConfListForBatchUpdHostRuleInput gzipMode(Integer gzipMode) {
    this.gzipMode = gzipMode;
    return this;
  }

   /**
   * Get gzipMode
   * @return gzipMode
  **/
  @Schema(description = "")
  public Integer getGzipMode() {
    return gzipMode;
  }

  public void setGzipMode(Integer gzipMode) {
    this.gzipMode = gzipMode;
  }

  public ConfListForBatchUpdHostRuleInput host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ConfListForBatchUpdHostRuleInput http2(Integer http2) {
    this.http2 = http2;
    return this;
  }

   /**
   * Get http2
   * @return http2
  **/
  @Schema(description = "")
  public Integer getHttp2() {
    return http2;
  }

  public void setHttp2(Integer http2) {
    this.http2 = http2;
  }

  public ConfListForBatchUpdHostRuleInput keepAliveRequests(Integer keepAliveRequests) {
    this.keepAliveRequests = keepAliveRequests;
    return this;
  }

   /**
   * Get keepAliveRequests
   * @return keepAliveRequests
  **/
  @Schema(description = "")
  public Integer getKeepAliveRequests() {
    return keepAliveRequests;
  }

  public void setKeepAliveRequests(Integer keepAliveRequests) {
    this.keepAliveRequests = keepAliveRequests;
  }

  public ConfListForBatchUpdHostRuleInput keepAliveTimeOut(Integer keepAliveTimeOut) {
    this.keepAliveTimeOut = keepAliveTimeOut;
    return this;
  }

   /**
   * Get keepAliveTimeOut
   * @return keepAliveTimeOut
  **/
  @Schema(description = "")
  public Integer getKeepAliveTimeOut() {
    return keepAliveTimeOut;
  }

  public void setKeepAliveTimeOut(Integer keepAliveTimeOut) {
    this.keepAliveTimeOut = keepAliveTimeOut;
  }

  public ConfListForBatchUpdHostRuleInput lbAlgorithm(String lbAlgorithm) {
    this.lbAlgorithm = lbAlgorithm;
    return this;
  }

   /**
   * Get lbAlgorithm
   * @return lbAlgorithm
  **/
  @Schema(description = "")
  public String getLbAlgorithm() {
    return lbAlgorithm;
  }

  public void setLbAlgorithm(String lbAlgorithm) {
    this.lbAlgorithm = lbAlgorithm;
  }

  public ConfListForBatchUpdHostRuleInput labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public ConfListForBatchUpdHostRuleInput protoFollow(Integer protoFollow) {
    this.protoFollow = protoFollow;
    return this;
  }

   /**
   * Get protoFollow
   * @return protoFollow
  **/
  @Schema(description = "")
  public Integer getProtoFollow() {
    return protoFollow;
  }

  public void setProtoFollow(Integer protoFollow) {
    this.protoFollow = protoFollow;
  }

  public ConfListForBatchUpdHostRuleInput protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addProtocolsItem(String protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<String>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @Schema(description = "")
  public List<String> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }

  public ConfListForBatchUpdHostRuleInput proxyConnectTimeOut(Integer proxyConnectTimeOut) {
    this.proxyConnectTimeOut = proxyConnectTimeOut;
    return this;
  }

   /**
   * Get proxyConnectTimeOut
   * @return proxyConnectTimeOut
  **/
  @Schema(description = "")
  public Integer getProxyConnectTimeOut() {
    return proxyConnectTimeOut;
  }

  public void setProxyConnectTimeOut(Integer proxyConnectTimeOut) {
    this.proxyConnectTimeOut = proxyConnectTimeOut;
  }

  public ConfListForBatchUpdHostRuleInput proxyKeepAliveRequests(Integer proxyKeepAliveRequests) {
    this.proxyKeepAliveRequests = proxyKeepAliveRequests;
    return this;
  }

   /**
   * Get proxyKeepAliveRequests
   * @return proxyKeepAliveRequests
  **/
  @Schema(description = "")
  public Integer getProxyKeepAliveRequests() {
    return proxyKeepAliveRequests;
  }

  public void setProxyKeepAliveRequests(Integer proxyKeepAliveRequests) {
    this.proxyKeepAliveRequests = proxyKeepAliveRequests;
  }

  public ConfListForBatchUpdHostRuleInput proxyKeepAliveTimeOut(Integer proxyKeepAliveTimeOut) {
    this.proxyKeepAliveTimeOut = proxyKeepAliveTimeOut;
    return this;
  }

   /**
   * Get proxyKeepAliveTimeOut
   * @return proxyKeepAliveTimeOut
  **/
  @Schema(description = "")
  public Integer getProxyKeepAliveTimeOut() {
    return proxyKeepAliveTimeOut;
  }

  public void setProxyKeepAliveTimeOut(Integer proxyKeepAliveTimeOut) {
    this.proxyKeepAliveTimeOut = proxyKeepAliveTimeOut;
  }

  public ConfListForBatchUpdHostRuleInput proxyReadTimeOut(Integer proxyReadTimeOut) {
    this.proxyReadTimeOut = proxyReadTimeOut;
    return this;
  }

   /**
   * Get proxyReadTimeOut
   * @return proxyReadTimeOut
  **/
  @Schema(description = "")
  public Integer getProxyReadTimeOut() {
    return proxyReadTimeOut;
  }

  public void setProxyReadTimeOut(Integer proxyReadTimeOut) {
    this.proxyReadTimeOut = proxyReadTimeOut;
  }

  public ConfListForBatchUpdHostRuleInput proxyRetry(Integer proxyRetry) {
    this.proxyRetry = proxyRetry;
    return this;
  }

   /**
   * Get proxyRetry
   * @return proxyRetry
  **/
  @Schema(description = "")
  public Integer getProxyRetry() {
    return proxyRetry;
  }

  public void setProxyRetry(Integer proxyRetry) {
    this.proxyRetry = proxyRetry;
  }

  public ConfListForBatchUpdHostRuleInput proxySendTimeOut(Integer proxySendTimeOut) {
    this.proxySendTimeOut = proxySendTimeOut;
    return this;
  }

   /**
   * Get proxySendTimeOut
   * @return proxySendTimeOut
  **/
  @Schema(description = "")
  public Integer getProxySendTimeOut() {
    return proxySendTimeOut;
  }

  public void setProxySendTimeOut(Integer proxySendTimeOut) {
    this.proxySendTimeOut = proxySendTimeOut;
  }

  public ConfListForBatchUpdHostRuleInput proxySetHeader(List<ProxySetHeaderForBatchUpdHostRuleInput> proxySetHeader) {
    this.proxySetHeader = proxySetHeader;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addProxySetHeaderItem(ProxySetHeaderForBatchUpdHostRuleInput proxySetHeaderItem) {
    if (this.proxySetHeader == null) {
      this.proxySetHeader = new ArrayList<ProxySetHeaderForBatchUpdHostRuleInput>();
    }
    this.proxySetHeader.add(proxySetHeaderItem);
    return this;
  }

   /**
   * Get proxySetHeader
   * @return proxySetHeader
  **/
  @Valid
  @Schema(description = "")
  public List<ProxySetHeaderForBatchUpdHostRuleInput> getProxySetHeader() {
    return proxySetHeader;
  }

  public void setProxySetHeader(List<ProxySetHeaderForBatchUpdHostRuleInput> proxySetHeader) {
    this.proxySetHeader = proxySetHeader;
  }

  public ConfListForBatchUpdHostRuleInput ssLCiphers(List<String> ssLCiphers) {
    this.ssLCiphers = ssLCiphers;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addSsLCiphersItem(String ssLCiphersItem) {
    if (this.ssLCiphers == null) {
      this.ssLCiphers = new ArrayList<String>();
    }
    this.ssLCiphers.add(ssLCiphersItem);
    return this;
  }

   /**
   * Get ssLCiphers
   * @return ssLCiphers
  **/
  @Schema(description = "")
  public List<String> getSsLCiphers() {
    return ssLCiphers;
  }

  public void setSsLCiphers(List<String> ssLCiphers) {
    this.ssLCiphers = ssLCiphers;
  }

  public ConfListForBatchUpdHostRuleInput ssLProtocols(List<String> ssLProtocols) {
    this.ssLProtocols = ssLProtocols;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addSsLProtocolsItem(String ssLProtocolsItem) {
    if (this.ssLProtocols == null) {
      this.ssLProtocols = new ArrayList<String>();
    }
    this.ssLProtocols.add(ssLProtocolsItem);
    return this;
  }

   /**
   * Get ssLProtocols
   * @return ssLProtocols
  **/
  @Schema(description = "")
  public List<String> getSsLProtocols() {
    return ssLProtocols;
  }

  public void setSsLProtocols(List<String> ssLProtocols) {
    this.ssLProtocols = ssLProtocols;
  }

  public ConfListForBatchUpdHostRuleInput servers(List<ServerForBatchUpdHostRuleInput> servers) {
    this.servers = servers;
    return this;
  }

  public ConfListForBatchUpdHostRuleInput addServersItem(ServerForBatchUpdHostRuleInput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForBatchUpdHostRuleInput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForBatchUpdHostRuleInput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForBatchUpdHostRuleInput> servers) {
    this.servers = servers;
  }

  public ConfListForBatchUpdHostRuleInput tlSEnable(Integer tlSEnable) {
    this.tlSEnable = tlSEnable;
    return this;
  }

   /**
   * Get tlSEnable
   * @return tlSEnable
  **/
  @Schema(description = "")
  public Integer getTlSEnable() {
    return tlSEnable;
  }

  public void setTlSEnable(Integer tlSEnable) {
    this.tlSEnable = tlSEnable;
  }

  public ConfListForBatchUpdHostRuleInput userCertId(String userCertId) {
    this.userCertId = userCertId;
    return this;
  }

   /**
   * Get userCertId
   * @return userCertId
  **/
  @Schema(description = "")
  public String getUserCertId() {
    return userCertId;
  }

  public void setUserCertId(String userCertId) {
    this.userCertId = userCertId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfListForBatchUpdHostRuleInput confListForBatchUpdHostRuleInput = (ConfListForBatchUpdHostRuleInput) o;
    return Objects.equals(this.allSSLCipher, confListForBatchUpdHostRuleInput.allSSLCipher) &&
        Objects.equals(this.backUpStatus, confListForBatchUpdHostRuleInput.backUpStatus) &&
        Objects.equals(this.chunkMode, confListForBatchUpdHostRuleInput.chunkMode) &&
        Objects.equals(this.clientMaxBodySize, confListForBatchUpdHostRuleInput.clientMaxBodySize) &&
        Objects.equals(this.defIp, confListForBatchUpdHostRuleInput.defIp) &&
        Objects.equals(this.gzipMode, confListForBatchUpdHostRuleInput.gzipMode) &&
        Objects.equals(this.host, confListForBatchUpdHostRuleInput.host) &&
        Objects.equals(this.http2, confListForBatchUpdHostRuleInput.http2) &&
        Objects.equals(this.keepAliveRequests, confListForBatchUpdHostRuleInput.keepAliveRequests) &&
        Objects.equals(this.keepAliveTimeOut, confListForBatchUpdHostRuleInput.keepAliveTimeOut) &&
        Objects.equals(this.lbAlgorithm, confListForBatchUpdHostRuleInput.lbAlgorithm) &&
        Objects.equals(this.labels, confListForBatchUpdHostRuleInput.labels) &&
        Objects.equals(this.protoFollow, confListForBatchUpdHostRuleInput.protoFollow) &&
        Objects.equals(this.protocols, confListForBatchUpdHostRuleInput.protocols) &&
        Objects.equals(this.proxyConnectTimeOut, confListForBatchUpdHostRuleInput.proxyConnectTimeOut) &&
        Objects.equals(this.proxyKeepAliveRequests, confListForBatchUpdHostRuleInput.proxyKeepAliveRequests) &&
        Objects.equals(this.proxyKeepAliveTimeOut, confListForBatchUpdHostRuleInput.proxyKeepAliveTimeOut) &&
        Objects.equals(this.proxyReadTimeOut, confListForBatchUpdHostRuleInput.proxyReadTimeOut) &&
        Objects.equals(this.proxyRetry, confListForBatchUpdHostRuleInput.proxyRetry) &&
        Objects.equals(this.proxySendTimeOut, confListForBatchUpdHostRuleInput.proxySendTimeOut) &&
        Objects.equals(this.proxySetHeader, confListForBatchUpdHostRuleInput.proxySetHeader) &&
        Objects.equals(this.ssLCiphers, confListForBatchUpdHostRuleInput.ssLCiphers) &&
        Objects.equals(this.ssLProtocols, confListForBatchUpdHostRuleInput.ssLProtocols) &&
        Objects.equals(this.servers, confListForBatchUpdHostRuleInput.servers) &&
        Objects.equals(this.tlSEnable, confListForBatchUpdHostRuleInput.tlSEnable) &&
        Objects.equals(this.userCertId, confListForBatchUpdHostRuleInput.userCertId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allSSLCipher, backUpStatus, chunkMode, clientMaxBodySize, defIp, gzipMode, host, http2, keepAliveRequests, keepAliveTimeOut, lbAlgorithm, labels, protoFollow, protocols, proxyConnectTimeOut, proxyKeepAliveRequests, proxyKeepAliveTimeOut, proxyReadTimeOut, proxyRetry, proxySendTimeOut, proxySetHeader, ssLCiphers, ssLProtocols, servers, tlSEnable, userCertId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfListForBatchUpdHostRuleInput {\n");
    
    sb.append("    allSSLCipher: ").append(toIndentedString(allSSLCipher)).append("\n");
    sb.append("    backUpStatus: ").append(toIndentedString(backUpStatus)).append("\n");
    sb.append("    chunkMode: ").append(toIndentedString(chunkMode)).append("\n");
    sb.append("    clientMaxBodySize: ").append(toIndentedString(clientMaxBodySize)).append("\n");
    sb.append("    defIp: ").append(toIndentedString(defIp)).append("\n");
    sb.append("    gzipMode: ").append(toIndentedString(gzipMode)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
    sb.append("    keepAliveRequests: ").append(toIndentedString(keepAliveRequests)).append("\n");
    sb.append("    keepAliveTimeOut: ").append(toIndentedString(keepAliveTimeOut)).append("\n");
    sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    protoFollow: ").append(toIndentedString(protoFollow)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    proxyConnectTimeOut: ").append(toIndentedString(proxyConnectTimeOut)).append("\n");
    sb.append("    proxyKeepAliveRequests: ").append(toIndentedString(proxyKeepAliveRequests)).append("\n");
    sb.append("    proxyKeepAliveTimeOut: ").append(toIndentedString(proxyKeepAliveTimeOut)).append("\n");
    sb.append("    proxyReadTimeOut: ").append(toIndentedString(proxyReadTimeOut)).append("\n");
    sb.append("    proxyRetry: ").append(toIndentedString(proxyRetry)).append("\n");
    sb.append("    proxySendTimeOut: ").append(toIndentedString(proxySendTimeOut)).append("\n");
    sb.append("    proxySetHeader: ").append(toIndentedString(proxySetHeader)).append("\n");
    sb.append("    ssLCiphers: ").append(toIndentedString(ssLCiphers)).append("\n");
    sb.append("    ssLProtocols: ").append(toIndentedString(ssLProtocols)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    tlSEnable: ").append(toIndentedString(tlSEnable)).append("\n");
    sb.append("    userCertId: ").append(toIndentedString(userCertId)).append("\n");
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
