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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ServerForBatchAddHostRuleInput
 */



public class ServerForBatchAddHostRuleInput {
  @SerializedName("Addr")
  private String addr = null;

  @SerializedName("BackUp")
  private Integer backUp = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public ServerForBatchAddHostRuleInput addr(String addr) {
    this.addr = addr;
    return this;
  }

   /**
   * Get addr
   * @return addr
  **/
  @Schema(description = "")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public ServerForBatchAddHostRuleInput backUp(Integer backUp) {
    this.backUp = backUp;
    return this;
  }

   /**
   * Get backUp
   * @return backUp
  **/
  @Schema(description = "")
  public Integer getBackUp() {
    return backUp;
  }

  public void setBackUp(Integer backUp) {
    this.backUp = backUp;
  }

  public ServerForBatchAddHostRuleInput port(Integer port) {
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

  public ServerForBatchAddHostRuleInput protocol(String protocol) {
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

  public ServerForBatchAddHostRuleInput weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerForBatchAddHostRuleInput serverForBatchAddHostRuleInput = (ServerForBatchAddHostRuleInput) o;
    return Objects.equals(this.addr, serverForBatchAddHostRuleInput.addr) &&
        Objects.equals(this.backUp, serverForBatchAddHostRuleInput.backUp) &&
        Objects.equals(this.port, serverForBatchAddHostRuleInput.port) &&
        Objects.equals(this.protocol, serverForBatchAddHostRuleInput.protocol) &&
        Objects.equals(this.weight, serverForBatchAddHostRuleInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, backUp, port, protocol, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerForBatchAddHostRuleInput {\n");
    
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    backUp: ").append(toIndentedString(backUp)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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