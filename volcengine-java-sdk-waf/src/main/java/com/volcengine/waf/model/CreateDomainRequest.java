/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.BackendGroupForCreateDomainInput;
import com.volcengine.waf.model.CloudAccessConfigForCreateDomainInput;
import com.volcengine.waf.model.ProtocolPortsForCreateDomainInput;
import com.volcengine.waf.model.TLSFieldsConfigForCreateDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDomainRequest
 */



public class CreateDomainRequest {
  @SerializedName("AccessMode")
  private Integer accessMode = null;

  @SerializedName("BackendGroups")
  private List<BackendGroupForCreateDomainInput> backendGroups = null;

  @SerializedName("BotDytokenEnable")
  private Integer botDytokenEnable = null;

  @SerializedName("BotFrequencyEnable")
  private Integer botFrequencyEnable = null;

  @SerializedName("BotRepeatEnable")
  private Integer botRepeatEnable = null;

  @SerializedName("BotSequenceDefaultAction")
  private Integer botSequenceDefaultAction = null;

  @SerializedName("BotSequenceEnable")
  private Integer botSequenceEnable = null;

  @SerializedName("CertificateID")
  private Integer certificateID = null;

  @SerializedName("CertificatePlatform")
  private String certificatePlatform = null;

  @SerializedName("ClientIPLocation")
  private Integer clientIPLocation = null;

  @SerializedName("ClientMaxBodySize")
  private Integer clientMaxBodySize = null;

  @SerializedName("CloudAccessConfig")
  private List<CloudAccessConfigForCreateDomainInput> cloudAccessConfig = null;

  @SerializedName("CustomHeader")
  private List<String> customHeader = null;

  @SerializedName("CustomSNI")
  private String customSNI = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EnableCustomRedirect")
  private Integer enableCustomRedirect = null;

  @SerializedName("EnableHTTP2")
  private Integer enableHTTP2 = null;

  @SerializedName("EnableIPv6")
  private Integer enableIPv6 = null;

  @SerializedName("EnableSNI")
  private Integer enableSNI = null;

  @SerializedName("KeepAliveRequest")
  private Integer keepAliveRequest = null;

  @SerializedName("KeepAliveTimeOut")
  private Integer keepAliveTimeOut = null;

  @SerializedName("LBAlgorithm")
  private String lbAlgorithm = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ProtocolFollow")
  private Integer protocolFollow = null;

  @SerializedName("ProtocolPorts")
  private ProtocolPortsForCreateDomainInput protocolPorts = null;

  @SerializedName("Protocols")
  private List<String> protocols = null;

  @SerializedName("ProxyConfig")
  private Integer proxyConfig = null;

  @SerializedName("ProxyConnectTimeOut")
  private Integer proxyConnectTimeOut = null;

  @SerializedName("ProxyKeepAlive")
  private Integer proxyKeepAlive = null;

  @SerializedName("ProxyKeepAliveTimeOut")
  private Integer proxyKeepAliveTimeOut = null;

  @SerializedName("ProxyReadTimeOut")
  private Integer proxyReadTimeOut = null;

  @SerializedName("ProxyRetry")
  private Integer proxyRetry = null;

  @SerializedName("ProxyWriteTimeOut")
  private Integer proxyWriteTimeOut = null;

  @SerializedName("PublicRealServer")
  private Integer publicRealServer = null;

  @SerializedName("RedirectHTTPS")
  private Boolean redirectHTTPS = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("SSLCiphers")
  private List<String> ssLCiphers = null;

  @SerializedName("SSLProtocols")
  private List<String> ssLProtocols = null;

  @SerializedName("TLSEnable")
  private Integer tlSEnable = null;

  @SerializedName("TLSFieldsConfig")
  private TLSFieldsConfigForCreateDomainInput tlSFieldsConfig = null;

  @SerializedName("VolcCertificateID")
  private String volcCertificateID = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  public CreateDomainRequest accessMode(Integer accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(Integer accessMode) {
    this.accessMode = accessMode;
  }

  public CreateDomainRequest backendGroups(List<BackendGroupForCreateDomainInput> backendGroups) {
    this.backendGroups = backendGroups;
    return this;
  }

  public CreateDomainRequest addBackendGroupsItem(BackendGroupForCreateDomainInput backendGroupsItem) {
    if (this.backendGroups == null) {
      this.backendGroups = new ArrayList<BackendGroupForCreateDomainInput>();
    }
    this.backendGroups.add(backendGroupsItem);
    return this;
  }

   /**
   * Get backendGroups
   * @return backendGroups
  **/
  @Valid
  @Schema(description = "")
  public List<BackendGroupForCreateDomainInput> getBackendGroups() {
    return backendGroups;
  }

  public void setBackendGroups(List<BackendGroupForCreateDomainInput> backendGroups) {
    this.backendGroups = backendGroups;
  }

  public CreateDomainRequest botDytokenEnable(Integer botDytokenEnable) {
    this.botDytokenEnable = botDytokenEnable;
    return this;
  }

   /**
   * Get botDytokenEnable
   * @return botDytokenEnable
  **/
  @Schema(description = "")
  public Integer getBotDytokenEnable() {
    return botDytokenEnable;
  }

  public void setBotDytokenEnable(Integer botDytokenEnable) {
    this.botDytokenEnable = botDytokenEnable;
  }

  public CreateDomainRequest botFrequencyEnable(Integer botFrequencyEnable) {
    this.botFrequencyEnable = botFrequencyEnable;
    return this;
  }

   /**
   * Get botFrequencyEnable
   * @return botFrequencyEnable
  **/
  @Schema(description = "")
  public Integer getBotFrequencyEnable() {
    return botFrequencyEnable;
  }

  public void setBotFrequencyEnable(Integer botFrequencyEnable) {
    this.botFrequencyEnable = botFrequencyEnable;
  }

  public CreateDomainRequest botRepeatEnable(Integer botRepeatEnable) {
    this.botRepeatEnable = botRepeatEnable;
    return this;
  }

   /**
   * Get botRepeatEnable
   * @return botRepeatEnable
  **/
  @Schema(description = "")
  public Integer getBotRepeatEnable() {
    return botRepeatEnable;
  }

  public void setBotRepeatEnable(Integer botRepeatEnable) {
    this.botRepeatEnable = botRepeatEnable;
  }

  public CreateDomainRequest botSequenceDefaultAction(Integer botSequenceDefaultAction) {
    this.botSequenceDefaultAction = botSequenceDefaultAction;
    return this;
  }

   /**
   * Get botSequenceDefaultAction
   * @return botSequenceDefaultAction
  **/
  @Schema(description = "")
  public Integer getBotSequenceDefaultAction() {
    return botSequenceDefaultAction;
  }

  public void setBotSequenceDefaultAction(Integer botSequenceDefaultAction) {
    this.botSequenceDefaultAction = botSequenceDefaultAction;
  }

  public CreateDomainRequest botSequenceEnable(Integer botSequenceEnable) {
    this.botSequenceEnable = botSequenceEnable;
    return this;
  }

   /**
   * Get botSequenceEnable
   * @return botSequenceEnable
  **/
  @Schema(description = "")
  public Integer getBotSequenceEnable() {
    return botSequenceEnable;
  }

  public void setBotSequenceEnable(Integer botSequenceEnable) {
    this.botSequenceEnable = botSequenceEnable;
  }

  public CreateDomainRequest certificateID(Integer certificateID) {
    this.certificateID = certificateID;
    return this;
  }

   /**
   * Get certificateID
   * @return certificateID
  **/
  @Schema(description = "")
  public Integer getCertificateID() {
    return certificateID;
  }

  public void setCertificateID(Integer certificateID) {
    this.certificateID = certificateID;
  }

  public CreateDomainRequest certificatePlatform(String certificatePlatform) {
    this.certificatePlatform = certificatePlatform;
    return this;
  }

   /**
   * Get certificatePlatform
   * @return certificatePlatform
  **/
  @Schema(description = "")
  public String getCertificatePlatform() {
    return certificatePlatform;
  }

  public void setCertificatePlatform(String certificatePlatform) {
    this.certificatePlatform = certificatePlatform;
  }

  public CreateDomainRequest clientIPLocation(Integer clientIPLocation) {
    this.clientIPLocation = clientIPLocation;
    return this;
  }

   /**
   * Get clientIPLocation
   * @return clientIPLocation
  **/
  @Schema(description = "")
  public Integer getClientIPLocation() {
    return clientIPLocation;
  }

  public void setClientIPLocation(Integer clientIPLocation) {
    this.clientIPLocation = clientIPLocation;
  }

  public CreateDomainRequest clientMaxBodySize(Integer clientMaxBodySize) {
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

  public CreateDomainRequest cloudAccessConfig(List<CloudAccessConfigForCreateDomainInput> cloudAccessConfig) {
    this.cloudAccessConfig = cloudAccessConfig;
    return this;
  }

  public CreateDomainRequest addCloudAccessConfigItem(CloudAccessConfigForCreateDomainInput cloudAccessConfigItem) {
    if (this.cloudAccessConfig == null) {
      this.cloudAccessConfig = new ArrayList<CloudAccessConfigForCreateDomainInput>();
    }
    this.cloudAccessConfig.add(cloudAccessConfigItem);
    return this;
  }

   /**
   * Get cloudAccessConfig
   * @return cloudAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public List<CloudAccessConfigForCreateDomainInput> getCloudAccessConfig() {
    return cloudAccessConfig;
  }

  public void setCloudAccessConfig(List<CloudAccessConfigForCreateDomainInput> cloudAccessConfig) {
    this.cloudAccessConfig = cloudAccessConfig;
  }

  public CreateDomainRequest customHeader(List<String> customHeader) {
    this.customHeader = customHeader;
    return this;
  }

  public CreateDomainRequest addCustomHeaderItem(String customHeaderItem) {
    if (this.customHeader == null) {
      this.customHeader = new ArrayList<String>();
    }
    this.customHeader.add(customHeaderItem);
    return this;
  }

   /**
   * Get customHeader
   * @return customHeader
  **/
  @Schema(description = "")
  public List<String> getCustomHeader() {
    return customHeader;
  }

  public void setCustomHeader(List<String> customHeader) {
    this.customHeader = customHeader;
  }

  public CreateDomainRequest customSNI(String customSNI) {
    this.customSNI = customSNI;
    return this;
  }

   /**
   * Get customSNI
   * @return customSNI
  **/
  @Schema(description = "")
  public String getCustomSNI() {
    return customSNI;
  }

  public void setCustomSNI(String customSNI) {
    this.customSNI = customSNI;
  }

  public CreateDomainRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public CreateDomainRequest enableCustomRedirect(Integer enableCustomRedirect) {
    this.enableCustomRedirect = enableCustomRedirect;
    return this;
  }

   /**
   * Get enableCustomRedirect
   * @return enableCustomRedirect
  **/
  @Schema(description = "")
  public Integer getEnableCustomRedirect() {
    return enableCustomRedirect;
  }

  public void setEnableCustomRedirect(Integer enableCustomRedirect) {
    this.enableCustomRedirect = enableCustomRedirect;
  }

  public CreateDomainRequest enableHTTP2(Integer enableHTTP2) {
    this.enableHTTP2 = enableHTTP2;
    return this;
  }

   /**
   * Get enableHTTP2
   * @return enableHTTP2
  **/
  @Schema(description = "")
  public Integer getEnableHTTP2() {
    return enableHTTP2;
  }

  public void setEnableHTTP2(Integer enableHTTP2) {
    this.enableHTTP2 = enableHTTP2;
  }

  public CreateDomainRequest enableIPv6(Integer enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

   /**
   * Get enableIPv6
   * @return enableIPv6
  **/
  @Schema(description = "")
  public Integer getEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Integer enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public CreateDomainRequest enableSNI(Integer enableSNI) {
    this.enableSNI = enableSNI;
    return this;
  }

   /**
   * Get enableSNI
   * @return enableSNI
  **/
  @Schema(description = "")
  public Integer getEnableSNI() {
    return enableSNI;
  }

  public void setEnableSNI(Integer enableSNI) {
    this.enableSNI = enableSNI;
  }

  public CreateDomainRequest keepAliveRequest(Integer keepAliveRequest) {
    this.keepAliveRequest = keepAliveRequest;
    return this;
  }

   /**
   * Get keepAliveRequest
   * @return keepAliveRequest
  **/
  @Schema(description = "")
  public Integer getKeepAliveRequest() {
    return keepAliveRequest;
  }

  public void setKeepAliveRequest(Integer keepAliveRequest) {
    this.keepAliveRequest = keepAliveRequest;
  }

  public CreateDomainRequest keepAliveTimeOut(Integer keepAliveTimeOut) {
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

  public CreateDomainRequest lbAlgorithm(String lbAlgorithm) {
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

  public CreateDomainRequest projectName(String projectName) {
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

  public CreateDomainRequest protocolFollow(Integer protocolFollow) {
    this.protocolFollow = protocolFollow;
    return this;
  }

   /**
   * Get protocolFollow
   * @return protocolFollow
  **/
  @Schema(description = "")
  public Integer getProtocolFollow() {
    return protocolFollow;
  }

  public void setProtocolFollow(Integer protocolFollow) {
    this.protocolFollow = protocolFollow;
  }

  public CreateDomainRequest protocolPorts(ProtocolPortsForCreateDomainInput protocolPorts) {
    this.protocolPorts = protocolPorts;
    return this;
  }

   /**
   * Get protocolPorts
   * @return protocolPorts
  **/
  @Valid
  @Schema(description = "")
  public ProtocolPortsForCreateDomainInput getProtocolPorts() {
    return protocolPorts;
  }

  public void setProtocolPorts(ProtocolPortsForCreateDomainInput protocolPorts) {
    this.protocolPorts = protocolPorts;
  }

  public CreateDomainRequest protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public CreateDomainRequest addProtocolsItem(String protocolsItem) {
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

  public CreateDomainRequest proxyConfig(Integer proxyConfig) {
    this.proxyConfig = proxyConfig;
    return this;
  }

   /**
   * Get proxyConfig
   * @return proxyConfig
  **/
  @Schema(description = "")
  public Integer getProxyConfig() {
    return proxyConfig;
  }

  public void setProxyConfig(Integer proxyConfig) {
    this.proxyConfig = proxyConfig;
  }

  public CreateDomainRequest proxyConnectTimeOut(Integer proxyConnectTimeOut) {
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

  public CreateDomainRequest proxyKeepAlive(Integer proxyKeepAlive) {
    this.proxyKeepAlive = proxyKeepAlive;
    return this;
  }

   /**
   * Get proxyKeepAlive
   * @return proxyKeepAlive
  **/
  @Schema(description = "")
  public Integer getProxyKeepAlive() {
    return proxyKeepAlive;
  }

  public void setProxyKeepAlive(Integer proxyKeepAlive) {
    this.proxyKeepAlive = proxyKeepAlive;
  }

  public CreateDomainRequest proxyKeepAliveTimeOut(Integer proxyKeepAliveTimeOut) {
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

  public CreateDomainRequest proxyReadTimeOut(Integer proxyReadTimeOut) {
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

  public CreateDomainRequest proxyRetry(Integer proxyRetry) {
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

  public CreateDomainRequest proxyWriteTimeOut(Integer proxyWriteTimeOut) {
    this.proxyWriteTimeOut = proxyWriteTimeOut;
    return this;
  }

   /**
   * Get proxyWriteTimeOut
   * @return proxyWriteTimeOut
  **/
  @Schema(description = "")
  public Integer getProxyWriteTimeOut() {
    return proxyWriteTimeOut;
  }

  public void setProxyWriteTimeOut(Integer proxyWriteTimeOut) {
    this.proxyWriteTimeOut = proxyWriteTimeOut;
  }

  public CreateDomainRequest publicRealServer(Integer publicRealServer) {
    this.publicRealServer = publicRealServer;
    return this;
  }

   /**
   * Get publicRealServer
   * @return publicRealServer
  **/
  @Schema(description = "")
  public Integer getPublicRealServer() {
    return publicRealServer;
  }

  public void setPublicRealServer(Integer publicRealServer) {
    this.publicRealServer = publicRealServer;
  }

  public CreateDomainRequest redirectHTTPS(Boolean redirectHTTPS) {
    this.redirectHTTPS = redirectHTTPS;
    return this;
  }

   /**
   * Get redirectHTTPS
   * @return redirectHTTPS
  **/
  @Schema(description = "")
  public Boolean isRedirectHTTPS() {
    return redirectHTTPS;
  }

  public void setRedirectHTTPS(Boolean redirectHTTPS) {
    this.redirectHTTPS = redirectHTTPS;
  }

  public CreateDomainRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CreateDomainRequest ssLCiphers(List<String> ssLCiphers) {
    this.ssLCiphers = ssLCiphers;
    return this;
  }

  public CreateDomainRequest addSsLCiphersItem(String ssLCiphersItem) {
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

  public CreateDomainRequest ssLProtocols(List<String> ssLProtocols) {
    this.ssLProtocols = ssLProtocols;
    return this;
  }

  public CreateDomainRequest addSsLProtocolsItem(String ssLProtocolsItem) {
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

  public CreateDomainRequest tlSEnable(Integer tlSEnable) {
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

  public CreateDomainRequest tlSFieldsConfig(TLSFieldsConfigForCreateDomainInput tlSFieldsConfig) {
    this.tlSFieldsConfig = tlSFieldsConfig;
    return this;
  }

   /**
   * Get tlSFieldsConfig
   * @return tlSFieldsConfig
  **/
  @Valid
  @Schema(description = "")
  public TLSFieldsConfigForCreateDomainInput getTlSFieldsConfig() {
    return tlSFieldsConfig;
  }

  public void setTlSFieldsConfig(TLSFieldsConfigForCreateDomainInput tlSFieldsConfig) {
    this.tlSFieldsConfig = tlSFieldsConfig;
  }

  public CreateDomainRequest volcCertificateID(String volcCertificateID) {
    this.volcCertificateID = volcCertificateID;
    return this;
  }

   /**
   * Get volcCertificateID
   * @return volcCertificateID
  **/
  @Schema(description = "")
  public String getVolcCertificateID() {
    return volcCertificateID;
  }

  public void setVolcCertificateID(String volcCertificateID) {
    this.volcCertificateID = volcCertificateID;
  }

  public CreateDomainRequest vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDomainRequest createDomainRequest = (CreateDomainRequest) o;
    return Objects.equals(this.accessMode, createDomainRequest.accessMode) &&
        Objects.equals(this.backendGroups, createDomainRequest.backendGroups) &&
        Objects.equals(this.botDytokenEnable, createDomainRequest.botDytokenEnable) &&
        Objects.equals(this.botFrequencyEnable, createDomainRequest.botFrequencyEnable) &&
        Objects.equals(this.botRepeatEnable, createDomainRequest.botRepeatEnable) &&
        Objects.equals(this.botSequenceDefaultAction, createDomainRequest.botSequenceDefaultAction) &&
        Objects.equals(this.botSequenceEnable, createDomainRequest.botSequenceEnable) &&
        Objects.equals(this.certificateID, createDomainRequest.certificateID) &&
        Objects.equals(this.certificatePlatform, createDomainRequest.certificatePlatform) &&
        Objects.equals(this.clientIPLocation, createDomainRequest.clientIPLocation) &&
        Objects.equals(this.clientMaxBodySize, createDomainRequest.clientMaxBodySize) &&
        Objects.equals(this.cloudAccessConfig, createDomainRequest.cloudAccessConfig) &&
        Objects.equals(this.customHeader, createDomainRequest.customHeader) &&
        Objects.equals(this.customSNI, createDomainRequest.customSNI) &&
        Objects.equals(this.domain, createDomainRequest.domain) &&
        Objects.equals(this.enableCustomRedirect, createDomainRequest.enableCustomRedirect) &&
        Objects.equals(this.enableHTTP2, createDomainRequest.enableHTTP2) &&
        Objects.equals(this.enableIPv6, createDomainRequest.enableIPv6) &&
        Objects.equals(this.enableSNI, createDomainRequest.enableSNI) &&
        Objects.equals(this.keepAliveRequest, createDomainRequest.keepAliveRequest) &&
        Objects.equals(this.keepAliveTimeOut, createDomainRequest.keepAliveTimeOut) &&
        Objects.equals(this.lbAlgorithm, createDomainRequest.lbAlgorithm) &&
        Objects.equals(this.projectName, createDomainRequest.projectName) &&
        Objects.equals(this.protocolFollow, createDomainRequest.protocolFollow) &&
        Objects.equals(this.protocolPorts, createDomainRequest.protocolPorts) &&
        Objects.equals(this.protocols, createDomainRequest.protocols) &&
        Objects.equals(this.proxyConfig, createDomainRequest.proxyConfig) &&
        Objects.equals(this.proxyConnectTimeOut, createDomainRequest.proxyConnectTimeOut) &&
        Objects.equals(this.proxyKeepAlive, createDomainRequest.proxyKeepAlive) &&
        Objects.equals(this.proxyKeepAliveTimeOut, createDomainRequest.proxyKeepAliveTimeOut) &&
        Objects.equals(this.proxyReadTimeOut, createDomainRequest.proxyReadTimeOut) &&
        Objects.equals(this.proxyRetry, createDomainRequest.proxyRetry) &&
        Objects.equals(this.proxyWriteTimeOut, createDomainRequest.proxyWriteTimeOut) &&
        Objects.equals(this.publicRealServer, createDomainRequest.publicRealServer) &&
        Objects.equals(this.redirectHTTPS, createDomainRequest.redirectHTTPS) &&
        Objects.equals(this.region, createDomainRequest.region) &&
        Objects.equals(this.ssLCiphers, createDomainRequest.ssLCiphers) &&
        Objects.equals(this.ssLProtocols, createDomainRequest.ssLProtocols) &&
        Objects.equals(this.tlSEnable, createDomainRequest.tlSEnable) &&
        Objects.equals(this.tlSFieldsConfig, createDomainRequest.tlSFieldsConfig) &&
        Objects.equals(this.volcCertificateID, createDomainRequest.volcCertificateID) &&
        Objects.equals(this.vpcID, createDomainRequest.vpcID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, backendGroups, botDytokenEnable, botFrequencyEnable, botRepeatEnable, botSequenceDefaultAction, botSequenceEnable, certificateID, certificatePlatform, clientIPLocation, clientMaxBodySize, cloudAccessConfig, customHeader, customSNI, domain, enableCustomRedirect, enableHTTP2, enableIPv6, enableSNI, keepAliveRequest, keepAliveTimeOut, lbAlgorithm, projectName, protocolFollow, protocolPorts, protocols, proxyConfig, proxyConnectTimeOut, proxyKeepAlive, proxyKeepAliveTimeOut, proxyReadTimeOut, proxyRetry, proxyWriteTimeOut, publicRealServer, redirectHTTPS, region, ssLCiphers, ssLProtocols, tlSEnable, tlSFieldsConfig, volcCertificateID, vpcID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDomainRequest {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    backendGroups: ").append(toIndentedString(backendGroups)).append("\n");
    sb.append("    botDytokenEnable: ").append(toIndentedString(botDytokenEnable)).append("\n");
    sb.append("    botFrequencyEnable: ").append(toIndentedString(botFrequencyEnable)).append("\n");
    sb.append("    botRepeatEnable: ").append(toIndentedString(botRepeatEnable)).append("\n");
    sb.append("    botSequenceDefaultAction: ").append(toIndentedString(botSequenceDefaultAction)).append("\n");
    sb.append("    botSequenceEnable: ").append(toIndentedString(botSequenceEnable)).append("\n");
    sb.append("    certificateID: ").append(toIndentedString(certificateID)).append("\n");
    sb.append("    certificatePlatform: ").append(toIndentedString(certificatePlatform)).append("\n");
    sb.append("    clientIPLocation: ").append(toIndentedString(clientIPLocation)).append("\n");
    sb.append("    clientMaxBodySize: ").append(toIndentedString(clientMaxBodySize)).append("\n");
    sb.append("    cloudAccessConfig: ").append(toIndentedString(cloudAccessConfig)).append("\n");
    sb.append("    customHeader: ").append(toIndentedString(customHeader)).append("\n");
    sb.append("    customSNI: ").append(toIndentedString(customSNI)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enableCustomRedirect: ").append(toIndentedString(enableCustomRedirect)).append("\n");
    sb.append("    enableHTTP2: ").append(toIndentedString(enableHTTP2)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    enableSNI: ").append(toIndentedString(enableSNI)).append("\n");
    sb.append("    keepAliveRequest: ").append(toIndentedString(keepAliveRequest)).append("\n");
    sb.append("    keepAliveTimeOut: ").append(toIndentedString(keepAliveTimeOut)).append("\n");
    sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocolFollow: ").append(toIndentedString(protocolFollow)).append("\n");
    sb.append("    protocolPorts: ").append(toIndentedString(protocolPorts)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    proxyConfig: ").append(toIndentedString(proxyConfig)).append("\n");
    sb.append("    proxyConnectTimeOut: ").append(toIndentedString(proxyConnectTimeOut)).append("\n");
    sb.append("    proxyKeepAlive: ").append(toIndentedString(proxyKeepAlive)).append("\n");
    sb.append("    proxyKeepAliveTimeOut: ").append(toIndentedString(proxyKeepAliveTimeOut)).append("\n");
    sb.append("    proxyReadTimeOut: ").append(toIndentedString(proxyReadTimeOut)).append("\n");
    sb.append("    proxyRetry: ").append(toIndentedString(proxyRetry)).append("\n");
    sb.append("    proxyWriteTimeOut: ").append(toIndentedString(proxyWriteTimeOut)).append("\n");
    sb.append("    publicRealServer: ").append(toIndentedString(publicRealServer)).append("\n");
    sb.append("    redirectHTTPS: ").append(toIndentedString(redirectHTTPS)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    ssLCiphers: ").append(toIndentedString(ssLCiphers)).append("\n");
    sb.append("    ssLProtocols: ").append(toIndentedString(ssLProtocols)).append("\n");
    sb.append("    tlSEnable: ").append(toIndentedString(tlSEnable)).append("\n");
    sb.append("    tlSFieldsConfig: ").append(toIndentedString(tlSFieldsConfig)).append("\n");
    sb.append("    volcCertificateID: ").append(toIndentedString(volcCertificateID)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
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
