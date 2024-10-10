/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * VisitAddrForDescribeEnterpriseDBInstanceDetailOutput
 */



public class VisitAddrForDescribeEnterpriseDBInstanceDetailOutput {
  @SerializedName("AddrType")
  private String addrType = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("IPAddress")
  private String ipAddress = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("VIP")
  private String VIP = null;

  public VisitAddrForDescribeEnterpriseDBInstanceDetailOutput addrType(String addrType) {
    this.addrType = addrType;
    return this;
  }

   /**
   * Get addrType
   * @return addrType
  **/
  @Schema(description = "")
  public String getAddrType() {
    return addrType;
  }

  public void setAddrType(String addrType) {
    this.addrType = addrType;
  }

  public VisitAddrForDescribeEnterpriseDBInstanceDetailOutput eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @Schema(description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public VisitAddrForDescribeEnterpriseDBInstanceDetailOutput ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VisitAddrForDescribeEnterpriseDBInstanceDetailOutput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public VisitAddrForDescribeEnterpriseDBInstanceDetailOutput VIP(String VIP) {
    this.VIP = VIP;
    return this;
  }

   /**
   * Get VIP
   * @return VIP
  **/
  @Schema(description = "")
  public String getVIP() {
    return VIP;
  }

  public void setVIP(String VIP) {
    this.VIP = VIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitAddrForDescribeEnterpriseDBInstanceDetailOutput visitAddrForDescribeEnterpriseDBInstanceDetailOutput = (VisitAddrForDescribeEnterpriseDBInstanceDetailOutput) o;
    return Objects.equals(this.addrType, visitAddrForDescribeEnterpriseDBInstanceDetailOutput.addrType) &&
        Objects.equals(this.eipId, visitAddrForDescribeEnterpriseDBInstanceDetailOutput.eipId) &&
        Objects.equals(this.ipAddress, visitAddrForDescribeEnterpriseDBInstanceDetailOutput.ipAddress) &&
        Objects.equals(this.port, visitAddrForDescribeEnterpriseDBInstanceDetailOutput.port) &&
        Objects.equals(this.VIP, visitAddrForDescribeEnterpriseDBInstanceDetailOutput.VIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrType, eipId, ipAddress, port, VIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitAddrForDescribeEnterpriseDBInstanceDetailOutput {\n");
    
    sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    VIP: ").append(toIndentedString(VIP)).append("\n");
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
