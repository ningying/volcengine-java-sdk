/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vedbm.model.AddressForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EndpointForDescribeDBInstanceDetailOutput
 */


public class EndpointForDescribeDBInstanceDetailOutput {
  @SerializedName("Addresses")
  private List<AddressForDescribeDBInstanceDetailOutput> addresses = null;

  @SerializedName("AutoAddNewNodes")
  private Boolean autoAddNewNodes = null;

  @SerializedName("ConsistLevel")
  private String consistLevel = null;

  @SerializedName("ConsistTimeout")
  private Integer consistTimeout = null;

  @SerializedName("ConsistTimeoutAction")
  private String consistTimeoutAction = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DistributedTransaction")
  private Boolean distributedTransaction = null;

  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("EndpointType")
  private String endpointType = null;

  @SerializedName("MasterAcceptReadRequests")
  private Boolean masterAcceptReadRequests = null;

  @SerializedName("NodeIds")
  private List<String> nodeIds = null;

  @SerializedName("ReadWriteMode")
  private String readWriteMode = null;

  public EndpointForDescribeDBInstanceDetailOutput addresses(List<AddressForDescribeDBInstanceDetailOutput> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EndpointForDescribeDBInstanceDetailOutput addAddressesItem(AddressForDescribeDBInstanceDetailOutput addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<AddressForDescribeDBInstanceDetailOutput>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @Valid
  @Schema(description = "")
  public List<AddressForDescribeDBInstanceDetailOutput> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressForDescribeDBInstanceDetailOutput> addresses) {
    this.addresses = addresses;
  }

  public EndpointForDescribeDBInstanceDetailOutput autoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
    return this;
  }

   /**
   * Get autoAddNewNodes
   * @return autoAddNewNodes
  **/
  @Schema(description = "")
  public Boolean isAutoAddNewNodes() {
    return autoAddNewNodes;
  }

  public void setAutoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
  }

  public EndpointForDescribeDBInstanceDetailOutput consistLevel(String consistLevel) {
    this.consistLevel = consistLevel;
    return this;
  }

   /**
   * Get consistLevel
   * @return consistLevel
  **/
  @Schema(description = "")
  public String getConsistLevel() {
    return consistLevel;
  }

  public void setConsistLevel(String consistLevel) {
    this.consistLevel = consistLevel;
  }

  public EndpointForDescribeDBInstanceDetailOutput consistTimeout(Integer consistTimeout) {
    this.consistTimeout = consistTimeout;
    return this;
  }

   /**
   * Get consistTimeout
   * @return consistTimeout
  **/
  @Schema(description = "")
  public Integer getConsistTimeout() {
    return consistTimeout;
  }

  public void setConsistTimeout(Integer consistTimeout) {
    this.consistTimeout = consistTimeout;
  }

  public EndpointForDescribeDBInstanceDetailOutput consistTimeoutAction(String consistTimeoutAction) {
    this.consistTimeoutAction = consistTimeoutAction;
    return this;
  }

   /**
   * Get consistTimeoutAction
   * @return consistTimeoutAction
  **/
  @Schema(description = "")
  public String getConsistTimeoutAction() {
    return consistTimeoutAction;
  }

  public void setConsistTimeoutAction(String consistTimeoutAction) {
    this.consistTimeoutAction = consistTimeoutAction;
  }

  public EndpointForDescribeDBInstanceDetailOutput description(String description) {
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

  public EndpointForDescribeDBInstanceDetailOutput distributedTransaction(Boolean distributedTransaction) {
    this.distributedTransaction = distributedTransaction;
    return this;
  }

   /**
   * Get distributedTransaction
   * @return distributedTransaction
  **/
  @Schema(description = "")
  public Boolean isDistributedTransaction() {
    return distributedTransaction;
  }

  public void setDistributedTransaction(Boolean distributedTransaction) {
    this.distributedTransaction = distributedTransaction;
  }

  public EndpointForDescribeDBInstanceDetailOutput endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @Schema(description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public EndpointForDescribeDBInstanceDetailOutput endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public EndpointForDescribeDBInstanceDetailOutput endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public EndpointForDescribeDBInstanceDetailOutput masterAcceptReadRequests(Boolean masterAcceptReadRequests) {
    this.masterAcceptReadRequests = masterAcceptReadRequests;
    return this;
  }

   /**
   * Get masterAcceptReadRequests
   * @return masterAcceptReadRequests
  **/
  @Schema(description = "")
  public Boolean isMasterAcceptReadRequests() {
    return masterAcceptReadRequests;
  }

  public void setMasterAcceptReadRequests(Boolean masterAcceptReadRequests) {
    this.masterAcceptReadRequests = masterAcceptReadRequests;
  }

  public EndpointForDescribeDBInstanceDetailOutput nodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  public EndpointForDescribeDBInstanceDetailOutput addNodeIdsItem(String nodeIdsItem) {
    if (this.nodeIds == null) {
      this.nodeIds = new ArrayList<String>();
    }
    this.nodeIds.add(nodeIdsItem);
    return this;
  }

   /**
   * Get nodeIds
   * @return nodeIds
  **/
  @Schema(description = "")
  public List<String> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
  }

  public EndpointForDescribeDBInstanceDetailOutput readWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
    return this;
  }

   /**
   * Get readWriteMode
   * @return readWriteMode
  **/
  @Schema(description = "")
  public String getReadWriteMode() {
    return readWriteMode;
  }

  public void setReadWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointForDescribeDBInstanceDetailOutput endpointForDescribeDBInstanceDetailOutput = (EndpointForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.addresses, endpointForDescribeDBInstanceDetailOutput.addresses) &&
        Objects.equals(this.autoAddNewNodes, endpointForDescribeDBInstanceDetailOutput.autoAddNewNodes) &&
        Objects.equals(this.consistLevel, endpointForDescribeDBInstanceDetailOutput.consistLevel) &&
        Objects.equals(this.consistTimeout, endpointForDescribeDBInstanceDetailOutput.consistTimeout) &&
        Objects.equals(this.consistTimeoutAction, endpointForDescribeDBInstanceDetailOutput.consistTimeoutAction) &&
        Objects.equals(this.description, endpointForDescribeDBInstanceDetailOutput.description) &&
        Objects.equals(this.distributedTransaction, endpointForDescribeDBInstanceDetailOutput.distributedTransaction) &&
        Objects.equals(this.endpointId, endpointForDescribeDBInstanceDetailOutput.endpointId) &&
        Objects.equals(this.endpointName, endpointForDescribeDBInstanceDetailOutput.endpointName) &&
        Objects.equals(this.endpointType, endpointForDescribeDBInstanceDetailOutput.endpointType) &&
        Objects.equals(this.masterAcceptReadRequests, endpointForDescribeDBInstanceDetailOutput.masterAcceptReadRequests) &&
        Objects.equals(this.nodeIds, endpointForDescribeDBInstanceDetailOutput.nodeIds) &&
        Objects.equals(this.readWriteMode, endpointForDescribeDBInstanceDetailOutput.readWriteMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, autoAddNewNodes, consistLevel, consistTimeout, consistTimeoutAction, description, distributedTransaction, endpointId, endpointName, endpointType, masterAcceptReadRequests, nodeIds, readWriteMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    autoAddNewNodes: ").append(toIndentedString(autoAddNewNodes)).append("\n");
    sb.append("    consistLevel: ").append(toIndentedString(consistLevel)).append("\n");
    sb.append("    consistTimeout: ").append(toIndentedString(consistTimeout)).append("\n");
    sb.append("    consistTimeoutAction: ").append(toIndentedString(consistTimeoutAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributedTransaction: ").append(toIndentedString(distributedTransaction)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    masterAcceptReadRequests: ").append(toIndentedString(masterAcceptReadRequests)).append("\n");
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
    sb.append("    readWriteMode: ").append(toIndentedString(readWriteMode)).append("\n");
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