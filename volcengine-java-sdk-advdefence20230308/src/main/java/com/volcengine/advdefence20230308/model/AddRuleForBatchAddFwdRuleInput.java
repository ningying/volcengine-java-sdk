/*
 * advdefence20230308
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence20230308.model;

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
 * AddRuleForBatchAddFwdRuleInput
 */



public class AddRuleForBatchAddFwdRuleInput {
  @SerializedName("FwdPort")
  private Integer fwdPort = null;

  @SerializedName("InstanceIp")
  private String instanceIp = null;

  @SerializedName("Proto")
  private String proto = null;

  @SerializedName("SrcIpList")
  private List<String> srcIpList = null;

  @SerializedName("SrcPort")
  private Integer srcPort = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  public AddRuleForBatchAddFwdRuleInput fwdPort(Integer fwdPort) {
    this.fwdPort = fwdPort;
    return this;
  }

   /**
   * Get fwdPort
   * @return fwdPort
  **/
  @Schema(description = "")
  public Integer getFwdPort() {
    return fwdPort;
  }

  public void setFwdPort(Integer fwdPort) {
    this.fwdPort = fwdPort;
  }

  public AddRuleForBatchAddFwdRuleInput instanceIp(String instanceIp) {
    this.instanceIp = instanceIp;
    return this;
  }

   /**
   * Get instanceIp
   * @return instanceIp
  **/
  @Schema(description = "")
  public String getInstanceIp() {
    return instanceIp;
  }

  public void setInstanceIp(String instanceIp) {
    this.instanceIp = instanceIp;
  }

  public AddRuleForBatchAddFwdRuleInput proto(String proto) {
    this.proto = proto;
    return this;
  }

   /**
   * Get proto
   * @return proto
  **/
  @Schema(description = "")
  public String getProto() {
    return proto;
  }

  public void setProto(String proto) {
    this.proto = proto;
  }

  public AddRuleForBatchAddFwdRuleInput srcIpList(List<String> srcIpList) {
    this.srcIpList = srcIpList;
    return this;
  }

  public AddRuleForBatchAddFwdRuleInput addSrcIpListItem(String srcIpListItem) {
    if (this.srcIpList == null) {
      this.srcIpList = new ArrayList<String>();
    }
    this.srcIpList.add(srcIpListItem);
    return this;
  }

   /**
   * Get srcIpList
   * @return srcIpList
  **/
  @Schema(description = "")
  public List<String> getSrcIpList() {
    return srcIpList;
  }

  public void setSrcIpList(List<String> srcIpList) {
    this.srcIpList = srcIpList;
  }

  public AddRuleForBatchAddFwdRuleInput srcPort(Integer srcPort) {
    this.srcPort = srcPort;
    return this;
  }

   /**
   * Get srcPort
   * @return srcPort
  **/
  @Schema(description = "")
  public Integer getSrcPort() {
    return srcPort;
  }

  public void setSrcPort(Integer srcPort) {
    this.srcPort = srcPort;
  }

  public AddRuleForBatchAddFwdRuleInput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRuleForBatchAddFwdRuleInput addRuleForBatchAddFwdRuleInput = (AddRuleForBatchAddFwdRuleInput) o;
    return Objects.equals(this.fwdPort, addRuleForBatchAddFwdRuleInput.fwdPort) &&
        Objects.equals(this.instanceIp, addRuleForBatchAddFwdRuleInput.instanceIp) &&
        Objects.equals(this.proto, addRuleForBatchAddFwdRuleInput.proto) &&
        Objects.equals(this.srcIpList, addRuleForBatchAddFwdRuleInput.srcIpList) &&
        Objects.equals(this.srcPort, addRuleForBatchAddFwdRuleInput.srcPort) &&
        Objects.equals(this.timeout, addRuleForBatchAddFwdRuleInput.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fwdPort, instanceIp, proto, srcIpList, srcPort, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRuleForBatchAddFwdRuleInput {\n");
    
    sb.append("    fwdPort: ").append(toIndentedString(fwdPort)).append("\n");
    sb.append("    instanceIp: ").append(toIndentedString(instanceIp)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    srcIpList: ").append(toIndentedString(srcIpList)).append("\n");
    sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
