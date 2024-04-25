/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.BrCompressForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.CacheForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.ConvertConvertOriginForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.GzipCompressForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.HttpsForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.IpAccessForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.PreConnectForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.RTTOptimizeForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.RefererAccessForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.StaticOptimizationForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.UploadOptimizeForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.UrlAccessForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.UrlRedirectForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.UserAgentAccessForUpdateSingleDomainConfigInput;
import com.volcengine.dcdn.model.WebSocketForUpdateSingleDomainConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateSingleDomainConfigRequest
 */


public class UpdateSingleDomainConfigRequest {
  @SerializedName("BrCompress")
  private BrCompressForUpdateSingleDomainConfigInput brCompress = null;

  @SerializedName("Cache")
  private CacheForUpdateSingleDomainConfigInput cache = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EnableFailOver")
  private Boolean enableFailOver = null;

  @SerializedName("GzipCompress")
  private GzipCompressForUpdateSingleDomainConfigInput gzipCompress = null;

  @SerializedName("Https")
  private HttpsForUpdateSingleDomainConfigInput https = null;

  @SerializedName("IPv6Switch")
  private Boolean ipv6Switch = null;

  @SerializedName("IpAccess")
  private IpAccessForUpdateSingleDomainConfigInput ipAccess = null;

  @SerializedName("Origin")
  private ConvertConvertOriginForUpdateSingleDomainConfigInput origin = null;

  @SerializedName("PreConnect")
  private PreConnectForUpdateSingleDomainConfigInput preConnect = null;

  @SerializedName("RTTOptimize")
  private RTTOptimizeForUpdateSingleDomainConfigInput rtTOptimize = null;

  @SerializedName("RefererAccess")
  private RefererAccessForUpdateSingleDomainConfigInput refererAccess = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("StaticOptimization")
  private StaticOptimizationForUpdateSingleDomainConfigInput staticOptimization = null;

  @SerializedName("StrategyType")
  private String strategyType = null;

  @SerializedName("UploadOptimize")
  private UploadOptimizeForUpdateSingleDomainConfigInput uploadOptimize = null;

  @SerializedName("UrlAccess")
  private UrlAccessForUpdateSingleDomainConfigInput urlAccess = null;

  @SerializedName("UrlRedirect")
  private UrlRedirectForUpdateSingleDomainConfigInput urlRedirect = null;

  @SerializedName("UserAgentAccess")
  private UserAgentAccessForUpdateSingleDomainConfigInput userAgentAccess = null;

  @SerializedName("WebSocket")
  private WebSocketForUpdateSingleDomainConfigInput webSocket = null;

  public UpdateSingleDomainConfigRequest brCompress(BrCompressForUpdateSingleDomainConfigInput brCompress) {
    this.brCompress = brCompress;
    return this;
  }

   /**
   * Get brCompress
   * @return brCompress
  **/
  @Valid
  @Schema(description = "")
  public BrCompressForUpdateSingleDomainConfigInput getBrCompress() {
    return brCompress;
  }

  public void setBrCompress(BrCompressForUpdateSingleDomainConfigInput brCompress) {
    this.brCompress = brCompress;
  }

  public UpdateSingleDomainConfigRequest cache(CacheForUpdateSingleDomainConfigInput cache) {
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @Valid
  @Schema(description = "")
  public CacheForUpdateSingleDomainConfigInput getCache() {
    return cache;
  }

  public void setCache(CacheForUpdateSingleDomainConfigInput cache) {
    this.cache = cache;
  }

  public UpdateSingleDomainConfigRequest domain(String domain) {
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

  public UpdateSingleDomainConfigRequest enableFailOver(Boolean enableFailOver) {
    this.enableFailOver = enableFailOver;
    return this;
  }

   /**
   * Get enableFailOver
   * @return enableFailOver
  **/
  @Schema(description = "")
  public Boolean isEnableFailOver() {
    return enableFailOver;
  }

  public void setEnableFailOver(Boolean enableFailOver) {
    this.enableFailOver = enableFailOver;
  }

  public UpdateSingleDomainConfigRequest gzipCompress(GzipCompressForUpdateSingleDomainConfigInput gzipCompress) {
    this.gzipCompress = gzipCompress;
    return this;
  }

   /**
   * Get gzipCompress
   * @return gzipCompress
  **/
  @Valid
  @Schema(description = "")
  public GzipCompressForUpdateSingleDomainConfigInput getGzipCompress() {
    return gzipCompress;
  }

  public void setGzipCompress(GzipCompressForUpdateSingleDomainConfigInput gzipCompress) {
    this.gzipCompress = gzipCompress;
  }

  public UpdateSingleDomainConfigRequest https(HttpsForUpdateSingleDomainConfigInput https) {
    this.https = https;
    return this;
  }

   /**
   * Get https
   * @return https
  **/
  @Valid
  @Schema(description = "")
  public HttpsForUpdateSingleDomainConfigInput getHttps() {
    return https;
  }

  public void setHttps(HttpsForUpdateSingleDomainConfigInput https) {
    this.https = https;
  }

  public UpdateSingleDomainConfigRequest ipv6Switch(Boolean ipv6Switch) {
    this.ipv6Switch = ipv6Switch;
    return this;
  }

   /**
   * Get ipv6Switch
   * @return ipv6Switch
  **/
  @Schema(description = "")
  public Boolean isIpv6Switch() {
    return ipv6Switch;
  }

  public void setIpv6Switch(Boolean ipv6Switch) {
    this.ipv6Switch = ipv6Switch;
  }

  public UpdateSingleDomainConfigRequest ipAccess(IpAccessForUpdateSingleDomainConfigInput ipAccess) {
    this.ipAccess = ipAccess;
    return this;
  }

   /**
   * Get ipAccess
   * @return ipAccess
  **/
  @Valid
  @Schema(description = "")
  public IpAccessForUpdateSingleDomainConfigInput getIpAccess() {
    return ipAccess;
  }

  public void setIpAccess(IpAccessForUpdateSingleDomainConfigInput ipAccess) {
    this.ipAccess = ipAccess;
  }

  public UpdateSingleDomainConfigRequest origin(ConvertConvertOriginForUpdateSingleDomainConfigInput origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Valid
  @Schema(description = "")
  public ConvertConvertOriginForUpdateSingleDomainConfigInput getOrigin() {
    return origin;
  }

  public void setOrigin(ConvertConvertOriginForUpdateSingleDomainConfigInput origin) {
    this.origin = origin;
  }

  public UpdateSingleDomainConfigRequest preConnect(PreConnectForUpdateSingleDomainConfigInput preConnect) {
    this.preConnect = preConnect;
    return this;
  }

   /**
   * Get preConnect
   * @return preConnect
  **/
  @Valid
  @Schema(description = "")
  public PreConnectForUpdateSingleDomainConfigInput getPreConnect() {
    return preConnect;
  }

  public void setPreConnect(PreConnectForUpdateSingleDomainConfigInput preConnect) {
    this.preConnect = preConnect;
  }

  public UpdateSingleDomainConfigRequest rtTOptimize(RTTOptimizeForUpdateSingleDomainConfigInput rtTOptimize) {
    this.rtTOptimize = rtTOptimize;
    return this;
  }

   /**
   * Get rtTOptimize
   * @return rtTOptimize
  **/
  @Valid
  @Schema(description = "")
  public RTTOptimizeForUpdateSingleDomainConfigInput getRtTOptimize() {
    return rtTOptimize;
  }

  public void setRtTOptimize(RTTOptimizeForUpdateSingleDomainConfigInput rtTOptimize) {
    this.rtTOptimize = rtTOptimize;
  }

  public UpdateSingleDomainConfigRequest refererAccess(RefererAccessForUpdateSingleDomainConfigInput refererAccess) {
    this.refererAccess = refererAccess;
    return this;
  }

   /**
   * Get refererAccess
   * @return refererAccess
  **/
  @Valid
  @Schema(description = "")
  public RefererAccessForUpdateSingleDomainConfigInput getRefererAccess() {
    return refererAccess;
  }

  public void setRefererAccess(RefererAccessForUpdateSingleDomainConfigInput refererAccess) {
    this.refererAccess = refererAccess;
  }

  public UpdateSingleDomainConfigRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public UpdateSingleDomainConfigRequest serviceType(String serviceType) {
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

  public UpdateSingleDomainConfigRequest staticOptimization(StaticOptimizationForUpdateSingleDomainConfigInput staticOptimization) {
    this.staticOptimization = staticOptimization;
    return this;
  }

   /**
   * Get staticOptimization
   * @return staticOptimization
  **/
  @Valid
  @Schema(description = "")
  public StaticOptimizationForUpdateSingleDomainConfigInput getStaticOptimization() {
    return staticOptimization;
  }

  public void setStaticOptimization(StaticOptimizationForUpdateSingleDomainConfigInput staticOptimization) {
    this.staticOptimization = staticOptimization;
  }

  public UpdateSingleDomainConfigRequest strategyType(String strategyType) {
    this.strategyType = strategyType;
    return this;
  }

   /**
   * Get strategyType
   * @return strategyType
  **/
  @Schema(description = "")
  public String getStrategyType() {
    return strategyType;
  }

  public void setStrategyType(String strategyType) {
    this.strategyType = strategyType;
  }

  public UpdateSingleDomainConfigRequest uploadOptimize(UploadOptimizeForUpdateSingleDomainConfigInput uploadOptimize) {
    this.uploadOptimize = uploadOptimize;
    return this;
  }

   /**
   * Get uploadOptimize
   * @return uploadOptimize
  **/
  @Valid
  @Schema(description = "")
  public UploadOptimizeForUpdateSingleDomainConfigInput getUploadOptimize() {
    return uploadOptimize;
  }

  public void setUploadOptimize(UploadOptimizeForUpdateSingleDomainConfigInput uploadOptimize) {
    this.uploadOptimize = uploadOptimize;
  }

  public UpdateSingleDomainConfigRequest urlAccess(UrlAccessForUpdateSingleDomainConfigInput urlAccess) {
    this.urlAccess = urlAccess;
    return this;
  }

   /**
   * Get urlAccess
   * @return urlAccess
  **/
  @Valid
  @Schema(description = "")
  public UrlAccessForUpdateSingleDomainConfigInput getUrlAccess() {
    return urlAccess;
  }

  public void setUrlAccess(UrlAccessForUpdateSingleDomainConfigInput urlAccess) {
    this.urlAccess = urlAccess;
  }

  public UpdateSingleDomainConfigRequest urlRedirect(UrlRedirectForUpdateSingleDomainConfigInput urlRedirect) {
    this.urlRedirect = urlRedirect;
    return this;
  }

   /**
   * Get urlRedirect
   * @return urlRedirect
  **/
  @Valid
  @Schema(description = "")
  public UrlRedirectForUpdateSingleDomainConfigInput getUrlRedirect() {
    return urlRedirect;
  }

  public void setUrlRedirect(UrlRedirectForUpdateSingleDomainConfigInput urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  public UpdateSingleDomainConfigRequest userAgentAccess(UserAgentAccessForUpdateSingleDomainConfigInput userAgentAccess) {
    this.userAgentAccess = userAgentAccess;
    return this;
  }

   /**
   * Get userAgentAccess
   * @return userAgentAccess
  **/
  @Valid
  @Schema(description = "")
  public UserAgentAccessForUpdateSingleDomainConfigInput getUserAgentAccess() {
    return userAgentAccess;
  }

  public void setUserAgentAccess(UserAgentAccessForUpdateSingleDomainConfigInput userAgentAccess) {
    this.userAgentAccess = userAgentAccess;
  }

  public UpdateSingleDomainConfigRequest webSocket(WebSocketForUpdateSingleDomainConfigInput webSocket) {
    this.webSocket = webSocket;
    return this;
  }

   /**
   * Get webSocket
   * @return webSocket
  **/
  @Valid
  @Schema(description = "")
  public WebSocketForUpdateSingleDomainConfigInput getWebSocket() {
    return webSocket;
  }

  public void setWebSocket(WebSocketForUpdateSingleDomainConfigInput webSocket) {
    this.webSocket = webSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSingleDomainConfigRequest updateSingleDomainConfigRequest = (UpdateSingleDomainConfigRequest) o;
    return Objects.equals(this.brCompress, updateSingleDomainConfigRequest.brCompress) &&
        Objects.equals(this.cache, updateSingleDomainConfigRequest.cache) &&
        Objects.equals(this.domain, updateSingleDomainConfigRequest.domain) &&
        Objects.equals(this.enableFailOver, updateSingleDomainConfigRequest.enableFailOver) &&
        Objects.equals(this.gzipCompress, updateSingleDomainConfigRequest.gzipCompress) &&
        Objects.equals(this.https, updateSingleDomainConfigRequest.https) &&
        Objects.equals(this.ipv6Switch, updateSingleDomainConfigRequest.ipv6Switch) &&
        Objects.equals(this.ipAccess, updateSingleDomainConfigRequest.ipAccess) &&
        Objects.equals(this.origin, updateSingleDomainConfigRequest.origin) &&
        Objects.equals(this.preConnect, updateSingleDomainConfigRequest.preConnect) &&
        Objects.equals(this.rtTOptimize, updateSingleDomainConfigRequest.rtTOptimize) &&
        Objects.equals(this.refererAccess, updateSingleDomainConfigRequest.refererAccess) &&
        Objects.equals(this.scope, updateSingleDomainConfigRequest.scope) &&
        Objects.equals(this.serviceType, updateSingleDomainConfigRequest.serviceType) &&
        Objects.equals(this.staticOptimization, updateSingleDomainConfigRequest.staticOptimization) &&
        Objects.equals(this.strategyType, updateSingleDomainConfigRequest.strategyType) &&
        Objects.equals(this.uploadOptimize, updateSingleDomainConfigRequest.uploadOptimize) &&
        Objects.equals(this.urlAccess, updateSingleDomainConfigRequest.urlAccess) &&
        Objects.equals(this.urlRedirect, updateSingleDomainConfigRequest.urlRedirect) &&
        Objects.equals(this.userAgentAccess, updateSingleDomainConfigRequest.userAgentAccess) &&
        Objects.equals(this.webSocket, updateSingleDomainConfigRequest.webSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brCompress, cache, domain, enableFailOver, gzipCompress, https, ipv6Switch, ipAccess, origin, preConnect, rtTOptimize, refererAccess, scope, serviceType, staticOptimization, strategyType, uploadOptimize, urlAccess, urlRedirect, userAgentAccess, webSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSingleDomainConfigRequest {\n");
    
    sb.append("    brCompress: ").append(toIndentedString(brCompress)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enableFailOver: ").append(toIndentedString(enableFailOver)).append("\n");
    sb.append("    gzipCompress: ").append(toIndentedString(gzipCompress)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    ipv6Switch: ").append(toIndentedString(ipv6Switch)).append("\n");
    sb.append("    ipAccess: ").append(toIndentedString(ipAccess)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    preConnect: ").append(toIndentedString(preConnect)).append("\n");
    sb.append("    rtTOptimize: ").append(toIndentedString(rtTOptimize)).append("\n");
    sb.append("    refererAccess: ").append(toIndentedString(refererAccess)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    staticOptimization: ").append(toIndentedString(staticOptimization)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    uploadOptimize: ").append(toIndentedString(uploadOptimize)).append("\n");
    sb.append("    urlAccess: ").append(toIndentedString(urlAccess)).append("\n");
    sb.append("    urlRedirect: ").append(toIndentedString(urlRedirect)).append("\n");
    sb.append("    userAgentAccess: ").append(toIndentedString(userAgentAccess)).append("\n");
    sb.append("    webSocket: ").append(toIndentedString(webSocket)).append("\n");
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