/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * ListCdnDomainsRequest
 */



public class ListCdnDomainsRequest {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("ExactMatch")
  private Boolean exactMatch = null;

  @SerializedName("FeatureConfig")
  private Boolean featureConfig = null;

  @SerializedName("HTTPS")
  private Boolean HTTPS = null;

  @SerializedName("IPv6")
  private Boolean ipv6 = null;

  @SerializedName("OriginProtocol")
  private String originProtocol = null;

  @SerializedName("PageNum")
  private Long pageNum = null;

  @SerializedName("PageSize")
  private Long pageSize = null;

  @SerializedName("PrimaryOrigin")
  private String primaryOrigin = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("ResourceTags")
  private List<String> resourceTags = null;

  @SerializedName("ServiceRegion")
  private String serviceRegion = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TagConnective")
  private String tagConnective = null;

  public ListCdnDomainsRequest domain(String domain) {
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

  public ListCdnDomainsRequest exactMatch(Boolean exactMatch) {
    this.exactMatch = exactMatch;
    return this;
  }

   /**
   * Get exactMatch
   * @return exactMatch
  **/
  @Schema(description = "")
  public Boolean isExactMatch() {
    return exactMatch;
  }

  public void setExactMatch(Boolean exactMatch) {
    this.exactMatch = exactMatch;
  }

  public ListCdnDomainsRequest featureConfig(Boolean featureConfig) {
    this.featureConfig = featureConfig;
    return this;
  }

   /**
   * Get featureConfig
   * @return featureConfig
  **/
  @Schema(description = "")
  public Boolean isFeatureConfig() {
    return featureConfig;
  }

  public void setFeatureConfig(Boolean featureConfig) {
    this.featureConfig = featureConfig;
  }

  public ListCdnDomainsRequest HTTPS(Boolean HTTPS) {
    this.HTTPS = HTTPS;
    return this;
  }

   /**
   * Get HTTPS
   * @return HTTPS
  **/
  @Schema(description = "")
  public Boolean isHTTPS() {
    return HTTPS;
  }

  public void setHTTPS(Boolean HTTPS) {
    this.HTTPS = HTTPS;
  }

  public ListCdnDomainsRequest ipv6(Boolean ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @Schema(description = "")
  public Boolean isIpv6() {
    return ipv6;
  }

  public void setIpv6(Boolean ipv6) {
    this.ipv6 = ipv6;
  }

  public ListCdnDomainsRequest originProtocol(String originProtocol) {
    this.originProtocol = originProtocol;
    return this;
  }

   /**
   * Get originProtocol
   * @return originProtocol
  **/
  @Schema(description = "")
  public String getOriginProtocol() {
    return originProtocol;
  }

  public void setOriginProtocol(String originProtocol) {
    this.originProtocol = originProtocol;
  }

  public ListCdnDomainsRequest pageNum(Long pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @Schema(description = "")
  public Long getPageNum() {
    return pageNum;
  }

  public void setPageNum(Long pageNum) {
    this.pageNum = pageNum;
  }

  public ListCdnDomainsRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListCdnDomainsRequest primaryOrigin(String primaryOrigin) {
    this.primaryOrigin = primaryOrigin;
    return this;
  }

   /**
   * Get primaryOrigin
   * @return primaryOrigin
  **/
  @Schema(description = "")
  public String getPrimaryOrigin() {
    return primaryOrigin;
  }

  public void setPrimaryOrigin(String primaryOrigin) {
    this.primaryOrigin = primaryOrigin;
  }

  public ListCdnDomainsRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ListCdnDomainsRequest resourceTags(List<String> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public ListCdnDomainsRequest addResourceTagsItem(String resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<String>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Schema(description = "")
  public List<String> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<String> resourceTags) {
    this.resourceTags = resourceTags;
  }

  public ListCdnDomainsRequest serviceRegion(String serviceRegion) {
    this.serviceRegion = serviceRegion;
    return this;
  }

   /**
   * Get serviceRegion
   * @return serviceRegion
  **/
  @Schema(description = "")
  public String getServiceRegion() {
    return serviceRegion;
  }

  public void setServiceRegion(String serviceRegion) {
    this.serviceRegion = serviceRegion;
  }

  public ListCdnDomainsRequest serviceType(String serviceType) {
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

  public ListCdnDomainsRequest status(String status) {
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

  public ListCdnDomainsRequest tagConnective(String tagConnective) {
    this.tagConnective = tagConnective;
    return this;
  }

   /**
   * Get tagConnective
   * @return tagConnective
  **/
  @Schema(description = "")
  public String getTagConnective() {
    return tagConnective;
  }

  public void setTagConnective(String tagConnective) {
    this.tagConnective = tagConnective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCdnDomainsRequest listCdnDomainsRequest = (ListCdnDomainsRequest) o;
    return Objects.equals(this.domain, listCdnDomainsRequest.domain) &&
        Objects.equals(this.exactMatch, listCdnDomainsRequest.exactMatch) &&
        Objects.equals(this.featureConfig, listCdnDomainsRequest.featureConfig) &&
        Objects.equals(this.HTTPS, listCdnDomainsRequest.HTTPS) &&
        Objects.equals(this.ipv6, listCdnDomainsRequest.ipv6) &&
        Objects.equals(this.originProtocol, listCdnDomainsRequest.originProtocol) &&
        Objects.equals(this.pageNum, listCdnDomainsRequest.pageNum) &&
        Objects.equals(this.pageSize, listCdnDomainsRequest.pageSize) &&
        Objects.equals(this.primaryOrigin, listCdnDomainsRequest.primaryOrigin) &&
        Objects.equals(this.project, listCdnDomainsRequest.project) &&
        Objects.equals(this.resourceTags, listCdnDomainsRequest.resourceTags) &&
        Objects.equals(this.serviceRegion, listCdnDomainsRequest.serviceRegion) &&
        Objects.equals(this.serviceType, listCdnDomainsRequest.serviceType) &&
        Objects.equals(this.status, listCdnDomainsRequest.status) &&
        Objects.equals(this.tagConnective, listCdnDomainsRequest.tagConnective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, exactMatch, featureConfig, HTTPS, ipv6, originProtocol, pageNum, pageSize, primaryOrigin, project, resourceTags, serviceRegion, serviceType, status, tagConnective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCdnDomainsRequest {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    exactMatch: ").append(toIndentedString(exactMatch)).append("\n");
    sb.append("    featureConfig: ").append(toIndentedString(featureConfig)).append("\n");
    sb.append("    HTTPS: ").append(toIndentedString(HTTPS)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    originProtocol: ").append(toIndentedString(originProtocol)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    primaryOrigin: ").append(toIndentedString(primaryOrigin)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    serviceRegion: ").append(toIndentedString(serviceRegion)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagConnective: ").append(toIndentedString(tagConnective)).append("\n");
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
