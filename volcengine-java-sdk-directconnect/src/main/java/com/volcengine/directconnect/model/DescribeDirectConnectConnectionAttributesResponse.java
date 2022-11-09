/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.TagForDescribeDirectConnectConnectionAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectConnectionAttributesResponse
 */


public class DescribeDirectConnectConnectionAttributesResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("ConnectionType")
  private String connectionType = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerContactEmail")
  private String customerContactEmail = null;

  @SerializedName("CustomerContactPhone")
  private String customerContactPhone = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectAccessPointId")
  private String directConnectAccessPointId = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("LineOperator")
  private String lineOperator = null;

  @SerializedName("ParentConnectionAccountId")
  private String parentConnectionAccountId = null;

  @SerializedName("ParentConnectionId")
  private String parentConnectionId = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("PortType")
  private String portType = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeDirectConnectConnectionAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DescribeDirectConnectConnectionAttributesResponse accountId(String accountId) {
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

  public DescribeDirectConnectConnectionAttributesResponse bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public DescribeDirectConnectConnectionAttributesResponse connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @Schema(description = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public DescribeDirectConnectConnectionAttributesResponse creationTime(String creationTime) {
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

  public DescribeDirectConnectConnectionAttributesResponse customerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
    return this;
  }

   /**
   * Get customerContactEmail
   * @return customerContactEmail
  **/
  @Schema(description = "")
  public String getCustomerContactEmail() {
    return customerContactEmail;
  }

  public void setCustomerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
  }

  public DescribeDirectConnectConnectionAttributesResponse customerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
    return this;
  }

   /**
   * Get customerContactPhone
   * @return customerContactPhone
  **/
  @Schema(description = "")
  public String getCustomerContactPhone() {
    return customerContactPhone;
  }

  public void setCustomerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
  }

  public DescribeDirectConnectConnectionAttributesResponse customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @Schema(description = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public DescribeDirectConnectConnectionAttributesResponse description(String description) {
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

  public DescribeDirectConnectConnectionAttributesResponse directConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
    return this;
  }

   /**
   * Get directConnectAccessPointId
   * @return directConnectAccessPointId
  **/
  @Schema(description = "")
  public String getDirectConnectAccessPointId() {
    return directConnectAccessPointId;
  }

  public void setDirectConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
  }

  public DescribeDirectConnectConnectionAttributesResponse directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public DescribeDirectConnectConnectionAttributesResponse directConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
    return this;
  }

   /**
   * Get directConnectConnectionName
   * @return directConnectConnectionName
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionName() {
    return directConnectConnectionName;
  }

  public void setDirectConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
  }

  public DescribeDirectConnectConnectionAttributesResponse lineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
    return this;
  }

   /**
   * Get lineOperator
   * @return lineOperator
  **/
  @Schema(description = "")
  public String getLineOperator() {
    return lineOperator;
  }

  public void setLineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
  }

  public DescribeDirectConnectConnectionAttributesResponse parentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
    return this;
  }

   /**
   * Get parentConnectionAccountId
   * @return parentConnectionAccountId
  **/
  @Schema(description = "")
  public String getParentConnectionAccountId() {
    return parentConnectionAccountId;
  }

  public void setParentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
  }

  public DescribeDirectConnectConnectionAttributesResponse parentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
    return this;
  }

   /**
   * Get parentConnectionId
   * @return parentConnectionId
  **/
  @Schema(description = "")
  public String getParentConnectionId() {
    return parentConnectionId;
  }

  public void setParentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
  }

  public DescribeDirectConnectConnectionAttributesResponse peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @Schema(description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public DescribeDirectConnectConnectionAttributesResponse portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @Schema(description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public DescribeDirectConnectConnectionAttributesResponse requestId(String requestId) {
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

  public DescribeDirectConnectConnectionAttributesResponse status(String status) {
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

  public DescribeDirectConnectConnectionAttributesResponse tags(List<TagForDescribeDirectConnectConnectionAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeDirectConnectConnectionAttributesResponse addTagsItem(TagForDescribeDirectConnectConnectionAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDirectConnectConnectionAttributesOutput>();
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
  public List<TagForDescribeDirectConnectConnectionAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDirectConnectConnectionAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeDirectConnectConnectionAttributesResponse updateTime(String updateTime) {
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

  public DescribeDirectConnectConnectionAttributesResponse vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectConnectionAttributesResponse describeDirectConnectConnectionAttributesResponse = (DescribeDirectConnectConnectionAttributesResponse) o;
    return Objects.equals(this.accountId, describeDirectConnectConnectionAttributesResponse.accountId) &&
        Objects.equals(this.bandwidth, describeDirectConnectConnectionAttributesResponse.bandwidth) &&
        Objects.equals(this.connectionType, describeDirectConnectConnectionAttributesResponse.connectionType) &&
        Objects.equals(this.creationTime, describeDirectConnectConnectionAttributesResponse.creationTime) &&
        Objects.equals(this.customerContactEmail, describeDirectConnectConnectionAttributesResponse.customerContactEmail) &&
        Objects.equals(this.customerContactPhone, describeDirectConnectConnectionAttributesResponse.customerContactPhone) &&
        Objects.equals(this.customerName, describeDirectConnectConnectionAttributesResponse.customerName) &&
        Objects.equals(this.description, describeDirectConnectConnectionAttributesResponse.description) &&
        Objects.equals(this.directConnectAccessPointId, describeDirectConnectConnectionAttributesResponse.directConnectAccessPointId) &&
        Objects.equals(this.directConnectConnectionId, describeDirectConnectConnectionAttributesResponse.directConnectConnectionId) &&
        Objects.equals(this.directConnectConnectionName, describeDirectConnectConnectionAttributesResponse.directConnectConnectionName) &&
        Objects.equals(this.lineOperator, describeDirectConnectConnectionAttributesResponse.lineOperator) &&
        Objects.equals(this.parentConnectionAccountId, describeDirectConnectConnectionAttributesResponse.parentConnectionAccountId) &&
        Objects.equals(this.parentConnectionId, describeDirectConnectConnectionAttributesResponse.parentConnectionId) &&
        Objects.equals(this.peerLocation, describeDirectConnectConnectionAttributesResponse.peerLocation) &&
        Objects.equals(this.portType, describeDirectConnectConnectionAttributesResponse.portType) &&
        Objects.equals(this.requestId, describeDirectConnectConnectionAttributesResponse.requestId) &&
        Objects.equals(this.status, describeDirectConnectConnectionAttributesResponse.status) &&
        Objects.equals(this.tags, describeDirectConnectConnectionAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeDirectConnectConnectionAttributesResponse.updateTime) &&
        Objects.equals(this.vlanId, describeDirectConnectConnectionAttributesResponse.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, connectionType, creationTime, customerContactEmail, customerContactPhone, customerName, description, directConnectAccessPointId, directConnectConnectionId, directConnectConnectionName, lineOperator, parentConnectionAccountId, parentConnectionId, peerLocation, portType, requestId, status, tags, updateTime, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectConnectionAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerContactEmail: ").append(toIndentedString(customerContactEmail)).append("\n");
    sb.append("    customerContactPhone: ").append(toIndentedString(customerContactPhone)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectAccessPointId: ").append(toIndentedString(directConnectAccessPointId)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    lineOperator: ").append(toIndentedString(lineOperator)).append("\n");
    sb.append("    parentConnectionAccountId: ").append(toIndentedString(parentConnectionAccountId)).append("\n");
    sb.append("    parentConnectionId: ").append(toIndentedString(parentConnectionId)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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