/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.transitrouter.model.AttachPointForDescribeTransitRouterVpcAttachmentsOutput;
import com.volcengine.transitrouter.model.TagForDescribeTransitRouterVpcAttachmentsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput
 */



public class TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput {
  @SerializedName("AttachPoints")
  private List<AttachPointForDescribeTransitRouterVpcAttachmentsOutput> attachPoints = null;

  @SerializedName("AutoPublishRouteEnabled")
  private Boolean autoPublishRouteEnabled = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ipv6Enabled")
  private Boolean ipv6Enabled = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTransitRouterVpcAttachmentsOutput> tags = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  @SerializedName("TransitRouterAttachmentName")
  private String transitRouterAttachmentName = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput attachPoints(List<AttachPointForDescribeTransitRouterVpcAttachmentsOutput> attachPoints) {
    this.attachPoints = attachPoints;
    return this;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput addAttachPointsItem(AttachPointForDescribeTransitRouterVpcAttachmentsOutput attachPointsItem) {
    if (this.attachPoints == null) {
      this.attachPoints = new ArrayList<AttachPointForDescribeTransitRouterVpcAttachmentsOutput>();
    }
    this.attachPoints.add(attachPointsItem);
    return this;
  }

   /**
   * Get attachPoints
   * @return attachPoints
  **/
  @Valid
  @Schema(description = "")
  public List<AttachPointForDescribeTransitRouterVpcAttachmentsOutput> getAttachPoints() {
    return attachPoints;
  }

  public void setAttachPoints(List<AttachPointForDescribeTransitRouterVpcAttachmentsOutput> attachPoints) {
    this.attachPoints = attachPoints;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
    this.autoPublishRouteEnabled = autoPublishRouteEnabled;
    return this;
  }

   /**
   * Get autoPublishRouteEnabled
   * @return autoPublishRouteEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoPublishRouteEnabled() {
    return autoPublishRouteEnabled;
  }

  public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
    this.autoPublishRouteEnabled = autoPublishRouteEnabled;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput creationTime(String creationTime) {
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

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput description(String description) {
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

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Get ipv6Enabled
   * @return ipv6Enabled
  **/
  @Schema(description = "")
  public Boolean isIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput status(String status) {
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

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput tags(List<TagForDescribeTransitRouterVpcAttachmentsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput addTagsItem(TagForDescribeTransitRouterVpcAttachmentsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTransitRouterVpcAttachmentsOutput>();
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
  public List<TagForDescribeTransitRouterVpcAttachmentsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTransitRouterVpcAttachmentsOutput> tags) {
    this.tags = tags;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput transitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
    return this;
  }

   /**
   * Get transitRouterAttachmentId
   * @return transitRouterAttachmentId
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentId() {
    return transitRouterAttachmentId;
  }

  public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput transitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
    return this;
  }

   /**
   * Get transitRouterAttachmentName
   * @return transitRouterAttachmentName
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentName() {
    return transitRouterAttachmentName;
  }

  public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @Schema(description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput updateTime(String updateTime) {
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

  public TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput vpcId(String vpcId) {
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
    TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput = (TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput) o;
    return Objects.equals(this.attachPoints, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.attachPoints) &&
        Objects.equals(this.autoPublishRouteEnabled, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.autoPublishRouteEnabled) &&
        Objects.equals(this.creationTime, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.creationTime) &&
        Objects.equals(this.description, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.description) &&
        Objects.equals(this.ipv6Enabled, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.ipv6Enabled) &&
        Objects.equals(this.status, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.status) &&
        Objects.equals(this.tags, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.tags) &&
        Objects.equals(this.transitRouterAttachmentId, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.transitRouterAttachmentId) &&
        Objects.equals(this.transitRouterAttachmentName, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.transitRouterAttachmentName) &&
        Objects.equals(this.transitRouterId, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.transitRouterId) &&
        Objects.equals(this.updateTime, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.updateTime) &&
        Objects.equals(this.vpcId, transitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachPoints, autoPublishRouteEnabled, creationTime, description, ipv6Enabled, status, tags, transitRouterAttachmentId, transitRouterAttachmentName, transitRouterId, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput {\n");
    
    sb.append("    attachPoints: ").append(toIndentedString(attachPoints)).append("\n");
    sb.append("    autoPublishRouteEnabled: ").append(toIndentedString(autoPublishRouteEnabled)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
    sb.append("    transitRouterAttachmentName: ").append(toIndentedString(transitRouterAttachmentName)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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