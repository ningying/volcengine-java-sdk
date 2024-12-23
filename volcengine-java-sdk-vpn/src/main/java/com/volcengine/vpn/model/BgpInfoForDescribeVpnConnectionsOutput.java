/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * BgpInfoForDescribeVpnConnectionsOutput
 */



public class BgpInfoForDescribeVpnConnectionsOutput {
  @SerializedName("EnableBgp")
  private Boolean enableBgp = null;

  @SerializedName("LocalAsn")
  private Integer localAsn = null;

  @SerializedName("LocalBgpIp")
  private String localBgpIp = null;

  @SerializedName("PeerAsn")
  private String peerAsn = null;

  @SerializedName("PeerBgpIp")
  private String peerBgpIp = null;

  /**
   * Gets or Sets sessionStatus
   */
  @JsonAdapter(SessionStatusEnum.Adapter.class)
  public enum SessionStatusEnum {
    @SerializedName("Up")
    UP("Up"),
    @SerializedName(" Down")
    _DOWN(" Down");

    private String value;

    SessionStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SessionStatusEnum fromValue(String input) {
      for (SessionStatusEnum b : SessionStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SessionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SessionStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SessionStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SessionStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SessionStatus")
  private SessionStatusEnum sessionStatus = null;

  @SerializedName("TunnelCidr")
  private String tunnelCidr = null;

  public BgpInfoForDescribeVpnConnectionsOutput enableBgp(Boolean enableBgp) {
    this.enableBgp = enableBgp;
    return this;
  }

   /**
   * Get enableBgp
   * @return enableBgp
  **/
  @Schema(description = "")
  public Boolean isEnableBgp() {
    return enableBgp;
  }

  public void setEnableBgp(Boolean enableBgp) {
    this.enableBgp = enableBgp;
  }

  public BgpInfoForDescribeVpnConnectionsOutput localAsn(Integer localAsn) {
    this.localAsn = localAsn;
    return this;
  }

   /**
   * Get localAsn
   * @return localAsn
  **/
  @Schema(description = "")
  public Integer getLocalAsn() {
    return localAsn;
  }

  public void setLocalAsn(Integer localAsn) {
    this.localAsn = localAsn;
  }

  public BgpInfoForDescribeVpnConnectionsOutput localBgpIp(String localBgpIp) {
    this.localBgpIp = localBgpIp;
    return this;
  }

   /**
   * Get localBgpIp
   * @return localBgpIp
  **/
  @Schema(description = "")
  public String getLocalBgpIp() {
    return localBgpIp;
  }

  public void setLocalBgpIp(String localBgpIp) {
    this.localBgpIp = localBgpIp;
  }

  public BgpInfoForDescribeVpnConnectionsOutput peerAsn(String peerAsn) {
    this.peerAsn = peerAsn;
    return this;
  }

   /**
   * Get peerAsn
   * @return peerAsn
  **/
  @Schema(description = "")
  public String getPeerAsn() {
    return peerAsn;
  }

  public void setPeerAsn(String peerAsn) {
    this.peerAsn = peerAsn;
  }

  public BgpInfoForDescribeVpnConnectionsOutput peerBgpIp(String peerBgpIp) {
    this.peerBgpIp = peerBgpIp;
    return this;
  }

   /**
   * Get peerBgpIp
   * @return peerBgpIp
  **/
  @Schema(description = "")
  public String getPeerBgpIp() {
    return peerBgpIp;
  }

  public void setPeerBgpIp(String peerBgpIp) {
    this.peerBgpIp = peerBgpIp;
  }

  public BgpInfoForDescribeVpnConnectionsOutput sessionStatus(SessionStatusEnum sessionStatus) {
    this.sessionStatus = sessionStatus;
    return this;
  }

   /**
   * Get sessionStatus
   * @return sessionStatus
  **/
  @Schema(description = "")
  public SessionStatusEnum getSessionStatus() {
    return sessionStatus;
  }

  public void setSessionStatus(SessionStatusEnum sessionStatus) {
    this.sessionStatus = sessionStatus;
  }

  public BgpInfoForDescribeVpnConnectionsOutput tunnelCidr(String tunnelCidr) {
    this.tunnelCidr = tunnelCidr;
    return this;
  }

   /**
   * Get tunnelCidr
   * @return tunnelCidr
  **/
  @Schema(description = "")
  public String getTunnelCidr() {
    return tunnelCidr;
  }

  public void setTunnelCidr(String tunnelCidr) {
    this.tunnelCidr = tunnelCidr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpInfoForDescribeVpnConnectionsOutput bgpInfoForDescribeVpnConnectionsOutput = (BgpInfoForDescribeVpnConnectionsOutput) o;
    return Objects.equals(this.enableBgp, bgpInfoForDescribeVpnConnectionsOutput.enableBgp) &&
        Objects.equals(this.localAsn, bgpInfoForDescribeVpnConnectionsOutput.localAsn) &&
        Objects.equals(this.localBgpIp, bgpInfoForDescribeVpnConnectionsOutput.localBgpIp) &&
        Objects.equals(this.peerAsn, bgpInfoForDescribeVpnConnectionsOutput.peerAsn) &&
        Objects.equals(this.peerBgpIp, bgpInfoForDescribeVpnConnectionsOutput.peerBgpIp) &&
        Objects.equals(this.sessionStatus, bgpInfoForDescribeVpnConnectionsOutput.sessionStatus) &&
        Objects.equals(this.tunnelCidr, bgpInfoForDescribeVpnConnectionsOutput.tunnelCidr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableBgp, localAsn, localBgpIp, peerAsn, peerBgpIp, sessionStatus, tunnelCidr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpInfoForDescribeVpnConnectionsOutput {\n");
    
    sb.append("    enableBgp: ").append(toIndentedString(enableBgp)).append("\n");
    sb.append("    localAsn: ").append(toIndentedString(localAsn)).append("\n");
    sb.append("    localBgpIp: ").append(toIndentedString(localBgpIp)).append("\n");
    sb.append("    peerAsn: ").append(toIndentedString(peerAsn)).append("\n");
    sb.append("    peerBgpIp: ").append(toIndentedString(peerBgpIp)).append("\n");
    sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
    sb.append("    tunnelCidr: ").append(toIndentedString(tunnelCidr)).append("\n");
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
