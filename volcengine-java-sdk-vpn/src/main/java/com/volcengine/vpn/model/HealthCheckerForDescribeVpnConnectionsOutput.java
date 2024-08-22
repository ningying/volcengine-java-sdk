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
 * HealthCheckerForDescribeVpnConnectionsOutput
 */



public class HealthCheckerForDescribeVpnConnectionsOutput {
  @SerializedName("CheckInterval")
  private String checkInterval = null;

  /**
   * Gets or Sets checkResult
   */
  @JsonAdapter(CheckResultEnum.Adapter.class)
  public enum CheckResultEnum {
    @SerializedName("Down")
    DOWN("Down"),
    @SerializedName(" Up")
    _UP(" Up");

    private String value;

    CheckResultEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CheckResultEnum fromValue(String input) {
      for (CheckResultEnum b : CheckResultEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CheckResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckResultEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CheckResultEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CheckResultEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CheckResult")
  private CheckResultEnum checkResult = null;

  @SerializedName("CheckerId")
  private String checkerId = null;

  @SerializedName("DownTime")
  private Integer downTime = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("RemoteIp")
  private String remoteIp = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("UpTime")
  private Integer upTime = null;

  public HealthCheckerForDescribeVpnConnectionsOutput checkInterval(String checkInterval) {
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * Get checkInterval
   * @return checkInterval
  **/
  @Schema(description = "")
  public String getCheckInterval() {
    return checkInterval;
  }

  public void setCheckInterval(String checkInterval) {
    this.checkInterval = checkInterval;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput checkResult(CheckResultEnum checkResult) {
    this.checkResult = checkResult;
    return this;
  }

   /**
   * Get checkResult
   * @return checkResult
  **/
  @Schema(description = "")
  public CheckResultEnum getCheckResult() {
    return checkResult;
  }

  public void setCheckResult(CheckResultEnum checkResult) {
    this.checkResult = checkResult;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput checkerId(String checkerId) {
    this.checkerId = checkerId;
    return this;
  }

   /**
   * Get checkerId
   * @return checkerId
  **/
  @Schema(description = "")
  public String getCheckerId() {
    return checkerId;
  }

  public void setCheckerId(String checkerId) {
    this.checkerId = checkerId;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput downTime(Integer downTime) {
    this.downTime = downTime;
    return this;
  }

   /**
   * Get downTime
   * @return downTime
  **/
  @Schema(description = "")
  public Integer getDownTime() {
    return downTime;
  }

  public void setDownTime(Integer downTime) {
    this.downTime = downTime;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @Schema(description = "")
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput remoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

   /**
   * Get remoteIp
   * @return remoteIp
  **/
  @Schema(description = "")
  public String getRemoteIp() {
    return remoteIp;
  }

  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public HealthCheckerForDescribeVpnConnectionsOutput timeout(Integer timeout) {
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

  public HealthCheckerForDescribeVpnConnectionsOutput upTime(Integer upTime) {
    this.upTime = upTime;
    return this;
  }

   /**
   * Get upTime
   * @return upTime
  **/
  @Schema(description = "")
  public Integer getUpTime() {
    return upTime;
  }

  public void setUpTime(Integer upTime) {
    this.upTime = upTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckerForDescribeVpnConnectionsOutput healthCheckerForDescribeVpnConnectionsOutput = (HealthCheckerForDescribeVpnConnectionsOutput) o;
    return Objects.equals(this.checkInterval, healthCheckerForDescribeVpnConnectionsOutput.checkInterval) &&
        Objects.equals(this.checkResult, healthCheckerForDescribeVpnConnectionsOutput.checkResult) &&
        Objects.equals(this.checkerId, healthCheckerForDescribeVpnConnectionsOutput.checkerId) &&
        Objects.equals(this.downTime, healthCheckerForDescribeVpnConnectionsOutput.downTime) &&
        Objects.equals(this.localIp, healthCheckerForDescribeVpnConnectionsOutput.localIp) &&
        Objects.equals(this.remoteIp, healthCheckerForDescribeVpnConnectionsOutput.remoteIp) &&
        Objects.equals(this.timeout, healthCheckerForDescribeVpnConnectionsOutput.timeout) &&
        Objects.equals(this.upTime, healthCheckerForDescribeVpnConnectionsOutput.upTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInterval, checkResult, checkerId, downTime, localIp, remoteIp, timeout, upTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckerForDescribeVpnConnectionsOutput {\n");
    
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
    sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
    sb.append("    checkerId: ").append(toIndentedString(checkerId)).append("\n");
    sb.append("    downTime: ").append(toIndentedString(downTime)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    upTime: ").append(toIndentedString(upTime)).append("\n");
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
