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
import com.volcengine.dcdn.model.BrCompressForListDomainConfigOutput;
import com.volcengine.dcdn.model.CacheForListDomainConfigOutput;
import com.volcengine.dcdn.model.ConvertConvertOriginForListDomainConfigOutput;
import com.volcengine.dcdn.model.GzipCompressForListDomainConfigOutput;
import com.volcengine.dcdn.model.HttpsForListDomainConfigOutput;
import com.volcengine.dcdn.model.IpAccessForListDomainConfigOutput;
import com.volcengine.dcdn.model.PreConnectForListDomainConfigOutput;
import com.volcengine.dcdn.model.RTTOptimizeForListDomainConfigOutput;
import com.volcengine.dcdn.model.RefererAccessForListDomainConfigOutput;
import com.volcengine.dcdn.model.ResourceTagForListDomainConfigOutput;
import com.volcengine.dcdn.model.StaticOptimizationForListDomainConfigOutput;
import com.volcengine.dcdn.model.UploadOptimizeForListDomainConfigOutput;
import com.volcengine.dcdn.model.UrlAccessForListDomainConfigOutput;
import com.volcengine.dcdn.model.UrlRedirectForListDomainConfigOutput;
import com.volcengine.dcdn.model.UserAgentAccessForListDomainConfigOutput;
import com.volcengine.dcdn.model.WebSocketForListDomainConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DomainListForListDomainConfigOutput
 */



public class DomainListForListDomainConfigOutput {
  @SerializedName("BrCompress")
  private BrCompressForListDomainConfigOutput brCompress = null;

  @SerializedName("Cache")
  private CacheForListDomainConfigOutput cache = null;

  @SerializedName("Cname")
  private String cname = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EnableFailOver")
  private Boolean enableFailOver = null;

  @SerializedName("GzipCompress")
  private GzipCompressForListDomainConfigOutput gzipCompress = null;

  @SerializedName("Https")
  private HttpsForListDomainConfigOutput https = null;

  @SerializedName("IPv6Switch")
  private Boolean ipv6Switch = null;

  @SerializedName("IpAccess")
  private IpAccessForListDomainConfigOutput ipAccess = null;

  @SerializedName("IsCNAMEResolved")
  private Boolean isCNAMEResolved = null;

  @SerializedName("Origin")
  private ConvertConvertOriginForListDomainConfigOutput origin = null;

  @SerializedName("PreConnect")
  private PreConnectForListDomainConfigOutput preConnect = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RTTOptimize")
  private RTTOptimizeForListDomainConfigOutput rtTOptimize = null;

  @SerializedName("RecordFiling")
  private String recordFiling = null;

  @SerializedName("RefererAccess")
  private RefererAccessForListDomainConfigOutput refererAccess = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForListDomainConfigOutput> resourceTags = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("StaticOptimization")
  private StaticOptimizationForListDomainConfigOutput staticOptimization = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("StrategyType")
  private String strategyType = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("UploadOptimize")
  private UploadOptimizeForListDomainConfigOutput uploadOptimize = null;

  @SerializedName("UrlAccess")
  private UrlAccessForListDomainConfigOutput urlAccess = null;

  @SerializedName("UrlRedirect")
  private UrlRedirectForListDomainConfigOutput urlRedirect = null;

  @SerializedName("UserAgentAccess")
  private UserAgentAccessForListDomainConfigOutput userAgentAccess = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("WebSocket")
  private WebSocketForListDomainConfigOutput webSocket = null;

  public DomainListForListDomainConfigOutput brCompress(BrCompressForListDomainConfigOutput brCompress) {
    this.brCompress = brCompress;
    return this;
  }

   /**
   * Get brCompress
   * @return brCompress
  **/
  @Valid
  @Schema(description = "")
  public BrCompressForListDomainConfigOutput getBrCompress() {
    return brCompress;
  }

  public void setBrCompress(BrCompressForListDomainConfigOutput brCompress) {
    this.brCompress = brCompress;
  }

  public DomainListForListDomainConfigOutput cache(CacheForListDomainConfigOutput cache) {
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @Valid
  @Schema(description = "")
  public CacheForListDomainConfigOutput getCache() {
    return cache;
  }

  public void setCache(CacheForListDomainConfigOutput cache) {
    this.cache = cache;
  }

  public DomainListForListDomainConfigOutput cname(String cname) {
    this.cname = cname;
    return this;
  }

   /**
   * Get cname
   * @return cname
  **/
  @Schema(description = "")
  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public DomainListForListDomainConfigOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public DomainListForListDomainConfigOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DomainListForListDomainConfigOutput enableFailOver(Boolean enableFailOver) {
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

  public DomainListForListDomainConfigOutput gzipCompress(GzipCompressForListDomainConfigOutput gzipCompress) {
    this.gzipCompress = gzipCompress;
    return this;
  }

   /**
   * Get gzipCompress
   * @return gzipCompress
  **/
  @Valid
  @Schema(description = "")
  public GzipCompressForListDomainConfigOutput getGzipCompress() {
    return gzipCompress;
  }

  public void setGzipCompress(GzipCompressForListDomainConfigOutput gzipCompress) {
    this.gzipCompress = gzipCompress;
  }

  public DomainListForListDomainConfigOutput https(HttpsForListDomainConfigOutput https) {
    this.https = https;
    return this;
  }

   /**
   * Get https
   * @return https
  **/
  @Valid
  @Schema(description = "")
  public HttpsForListDomainConfigOutput getHttps() {
    return https;
  }

  public void setHttps(HttpsForListDomainConfigOutput https) {
    this.https = https;
  }

  public DomainListForListDomainConfigOutput ipv6Switch(Boolean ipv6Switch) {
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

  public DomainListForListDomainConfigOutput ipAccess(IpAccessForListDomainConfigOutput ipAccess) {
    this.ipAccess = ipAccess;
    return this;
  }

   /**
   * Get ipAccess
   * @return ipAccess
  **/
  @Valid
  @Schema(description = "")
  public IpAccessForListDomainConfigOutput getIpAccess() {
    return ipAccess;
  }

  public void setIpAccess(IpAccessForListDomainConfigOutput ipAccess) {
    this.ipAccess = ipAccess;
  }

  public DomainListForListDomainConfigOutput isCNAMEResolved(Boolean isCNAMEResolved) {
    this.isCNAMEResolved = isCNAMEResolved;
    return this;
  }

   /**
   * Get isCNAMEResolved
   * @return isCNAMEResolved
  **/
  @Schema(description = "")
  public Boolean isIsCNAMEResolved() {
    return isCNAMEResolved;
  }

  public void setIsCNAMEResolved(Boolean isCNAMEResolved) {
    this.isCNAMEResolved = isCNAMEResolved;
  }

  public DomainListForListDomainConfigOutput origin(ConvertConvertOriginForListDomainConfigOutput origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Valid
  @Schema(description = "")
  public ConvertConvertOriginForListDomainConfigOutput getOrigin() {
    return origin;
  }

  public void setOrigin(ConvertConvertOriginForListDomainConfigOutput origin) {
    this.origin = origin;
  }

  public DomainListForListDomainConfigOutput preConnect(PreConnectForListDomainConfigOutput preConnect) {
    this.preConnect = preConnect;
    return this;
  }

   /**
   * Get preConnect
   * @return preConnect
  **/
  @Valid
  @Schema(description = "")
  public PreConnectForListDomainConfigOutput getPreConnect() {
    return preConnect;
  }

  public void setPreConnect(PreConnectForListDomainConfigOutput preConnect) {
    this.preConnect = preConnect;
  }

  public DomainListForListDomainConfigOutput projectName(String projectName) {
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

  public DomainListForListDomainConfigOutput rtTOptimize(RTTOptimizeForListDomainConfigOutput rtTOptimize) {
    this.rtTOptimize = rtTOptimize;
    return this;
  }

   /**
   * Get rtTOptimize
   * @return rtTOptimize
  **/
  @Valid
  @Schema(description = "")
  public RTTOptimizeForListDomainConfigOutput getRtTOptimize() {
    return rtTOptimize;
  }

  public void setRtTOptimize(RTTOptimizeForListDomainConfigOutput rtTOptimize) {
    this.rtTOptimize = rtTOptimize;
  }

  public DomainListForListDomainConfigOutput recordFiling(String recordFiling) {
    this.recordFiling = recordFiling;
    return this;
  }

   /**
   * Get recordFiling
   * @return recordFiling
  **/
  @Schema(description = "")
  public String getRecordFiling() {
    return recordFiling;
  }

  public void setRecordFiling(String recordFiling) {
    this.recordFiling = recordFiling;
  }

  public DomainListForListDomainConfigOutput refererAccess(RefererAccessForListDomainConfigOutput refererAccess) {
    this.refererAccess = refererAccess;
    return this;
  }

   /**
   * Get refererAccess
   * @return refererAccess
  **/
  @Valid
  @Schema(description = "")
  public RefererAccessForListDomainConfigOutput getRefererAccess() {
    return refererAccess;
  }

  public void setRefererAccess(RefererAccessForListDomainConfigOutput refererAccess) {
    this.refererAccess = refererAccess;
  }

  public DomainListForListDomainConfigOutput resourceTags(List<ResourceTagForListDomainConfigOutput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public DomainListForListDomainConfigOutput addResourceTagsItem(ResourceTagForListDomainConfigOutput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForListDomainConfigOutput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForListDomainConfigOutput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForListDomainConfigOutput> resourceTags) {
    this.resourceTags = resourceTags;
  }

  public DomainListForListDomainConfigOutput scope(String scope) {
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

  public DomainListForListDomainConfigOutput serviceType(String serviceType) {
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

  public DomainListForListDomainConfigOutput staticOptimization(StaticOptimizationForListDomainConfigOutput staticOptimization) {
    this.staticOptimization = staticOptimization;
    return this;
  }

   /**
   * Get staticOptimization
   * @return staticOptimization
  **/
  @Valid
  @Schema(description = "")
  public StaticOptimizationForListDomainConfigOutput getStaticOptimization() {
    return staticOptimization;
  }

  public void setStaticOptimization(StaticOptimizationForListDomainConfigOutput staticOptimization) {
    this.staticOptimization = staticOptimization;
  }

  public DomainListForListDomainConfigOutput status(String status) {
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

  public DomainListForListDomainConfigOutput strategyType(String strategyType) {
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

  public DomainListForListDomainConfigOutput updateTime(String updateTime) {
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

  public DomainListForListDomainConfigOutput uploadOptimize(UploadOptimizeForListDomainConfigOutput uploadOptimize) {
    this.uploadOptimize = uploadOptimize;
    return this;
  }

   /**
   * Get uploadOptimize
   * @return uploadOptimize
  **/
  @Valid
  @Schema(description = "")
  public UploadOptimizeForListDomainConfigOutput getUploadOptimize() {
    return uploadOptimize;
  }

  public void setUploadOptimize(UploadOptimizeForListDomainConfigOutput uploadOptimize) {
    this.uploadOptimize = uploadOptimize;
  }

  public DomainListForListDomainConfigOutput urlAccess(UrlAccessForListDomainConfigOutput urlAccess) {
    this.urlAccess = urlAccess;
    return this;
  }

   /**
   * Get urlAccess
   * @return urlAccess
  **/
  @Valid
  @Schema(description = "")
  public UrlAccessForListDomainConfigOutput getUrlAccess() {
    return urlAccess;
  }

  public void setUrlAccess(UrlAccessForListDomainConfigOutput urlAccess) {
    this.urlAccess = urlAccess;
  }

  public DomainListForListDomainConfigOutput urlRedirect(UrlRedirectForListDomainConfigOutput urlRedirect) {
    this.urlRedirect = urlRedirect;
    return this;
  }

   /**
   * Get urlRedirect
   * @return urlRedirect
  **/
  @Valid
  @Schema(description = "")
  public UrlRedirectForListDomainConfigOutput getUrlRedirect() {
    return urlRedirect;
  }

  public void setUrlRedirect(UrlRedirectForListDomainConfigOutput urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  public DomainListForListDomainConfigOutput userAgentAccess(UserAgentAccessForListDomainConfigOutput userAgentAccess) {
    this.userAgentAccess = userAgentAccess;
    return this;
  }

   /**
   * Get userAgentAccess
   * @return userAgentAccess
  **/
  @Valid
  @Schema(description = "")
  public UserAgentAccessForListDomainConfigOutput getUserAgentAccess() {
    return userAgentAccess;
  }

  public void setUserAgentAccess(UserAgentAccessForListDomainConfigOutput userAgentAccess) {
    this.userAgentAccess = userAgentAccess;
  }

  public DomainListForListDomainConfigOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public DomainListForListDomainConfigOutput webSocket(WebSocketForListDomainConfigOutput webSocket) {
    this.webSocket = webSocket;
    return this;
  }

   /**
   * Get webSocket
   * @return webSocket
  **/
  @Valid
  @Schema(description = "")
  public WebSocketForListDomainConfigOutput getWebSocket() {
    return webSocket;
  }

  public void setWebSocket(WebSocketForListDomainConfigOutput webSocket) {
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
    DomainListForListDomainConfigOutput domainListForListDomainConfigOutput = (DomainListForListDomainConfigOutput) o;
    return Objects.equals(this.brCompress, domainListForListDomainConfigOutput.brCompress) &&
        Objects.equals(this.cache, domainListForListDomainConfigOutput.cache) &&
        Objects.equals(this.cname, domainListForListDomainConfigOutput.cname) &&
        Objects.equals(this.createTime, domainListForListDomainConfigOutput.createTime) &&
        Objects.equals(this.domain, domainListForListDomainConfigOutput.domain) &&
        Objects.equals(this.enableFailOver, domainListForListDomainConfigOutput.enableFailOver) &&
        Objects.equals(this.gzipCompress, domainListForListDomainConfigOutput.gzipCompress) &&
        Objects.equals(this.https, domainListForListDomainConfigOutput.https) &&
        Objects.equals(this.ipv6Switch, domainListForListDomainConfigOutput.ipv6Switch) &&
        Objects.equals(this.ipAccess, domainListForListDomainConfigOutput.ipAccess) &&
        Objects.equals(this.isCNAMEResolved, domainListForListDomainConfigOutput.isCNAMEResolved) &&
        Objects.equals(this.origin, domainListForListDomainConfigOutput.origin) &&
        Objects.equals(this.preConnect, domainListForListDomainConfigOutput.preConnect) &&
        Objects.equals(this.projectName, domainListForListDomainConfigOutput.projectName) &&
        Objects.equals(this.rtTOptimize, domainListForListDomainConfigOutput.rtTOptimize) &&
        Objects.equals(this.recordFiling, domainListForListDomainConfigOutput.recordFiling) &&
        Objects.equals(this.refererAccess, domainListForListDomainConfigOutput.refererAccess) &&
        Objects.equals(this.resourceTags, domainListForListDomainConfigOutput.resourceTags) &&
        Objects.equals(this.scope, domainListForListDomainConfigOutput.scope) &&
        Objects.equals(this.serviceType, domainListForListDomainConfigOutput.serviceType) &&
        Objects.equals(this.staticOptimization, domainListForListDomainConfigOutput.staticOptimization) &&
        Objects.equals(this.status, domainListForListDomainConfigOutput.status) &&
        Objects.equals(this.strategyType, domainListForListDomainConfigOutput.strategyType) &&
        Objects.equals(this.updateTime, domainListForListDomainConfigOutput.updateTime) &&
        Objects.equals(this.uploadOptimize, domainListForListDomainConfigOutput.uploadOptimize) &&
        Objects.equals(this.urlAccess, domainListForListDomainConfigOutput.urlAccess) &&
        Objects.equals(this.urlRedirect, domainListForListDomainConfigOutput.urlRedirect) &&
        Objects.equals(this.userAgentAccess, domainListForListDomainConfigOutput.userAgentAccess) &&
        Objects.equals(this.userName, domainListForListDomainConfigOutput.userName) &&
        Objects.equals(this.webSocket, domainListForListDomainConfigOutput.webSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brCompress, cache, cname, createTime, domain, enableFailOver, gzipCompress, https, ipv6Switch, ipAccess, isCNAMEResolved, origin, preConnect, projectName, rtTOptimize, recordFiling, refererAccess, resourceTags, scope, serviceType, staticOptimization, status, strategyType, updateTime, uploadOptimize, urlAccess, urlRedirect, userAgentAccess, userName, webSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainListForListDomainConfigOutput {\n");
    
    sb.append("    brCompress: ").append(toIndentedString(brCompress)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enableFailOver: ").append(toIndentedString(enableFailOver)).append("\n");
    sb.append("    gzipCompress: ").append(toIndentedString(gzipCompress)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    ipv6Switch: ").append(toIndentedString(ipv6Switch)).append("\n");
    sb.append("    ipAccess: ").append(toIndentedString(ipAccess)).append("\n");
    sb.append("    isCNAMEResolved: ").append(toIndentedString(isCNAMEResolved)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    preConnect: ").append(toIndentedString(preConnect)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    rtTOptimize: ").append(toIndentedString(rtTOptimize)).append("\n");
    sb.append("    recordFiling: ").append(toIndentedString(recordFiling)).append("\n");
    sb.append("    refererAccess: ").append(toIndentedString(refererAccess)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    staticOptimization: ").append(toIndentedString(staticOptimization)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    uploadOptimize: ").append(toIndentedString(uploadOptimize)).append("\n");
    sb.append("    urlAccess: ").append(toIndentedString(urlAccess)).append("\n");
    sb.append("    urlRedirect: ").append(toIndentedString(urlRedirect)).append("\n");
    sb.append("    userAgentAccess: ").append(toIndentedString(userAgentAccess)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
