/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * ServerForModifyServerGroupAttributesInput
 */


public class ServerForModifyServerGroupAttributesInput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public ServerForModifyServerGroupAttributesInput description(String description) {
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

  public ServerForModifyServerGroupAttributesInput port(Integer port) {
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

  public ServerForModifyServerGroupAttributesInput serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public ServerForModifyServerGroupAttributesInput weight(Integer weight) {
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
    ServerForModifyServerGroupAttributesInput serverForModifyServerGroupAttributesInput = (ServerForModifyServerGroupAttributesInput) o;
    return Objects.equals(this.description, serverForModifyServerGroupAttributesInput.description) &&
        Objects.equals(this.port, serverForModifyServerGroupAttributesInput.port) &&
        Objects.equals(this.serverId, serverForModifyServerGroupAttributesInput.serverId) &&
        Objects.equals(this.weight, serverForModifyServerGroupAttributesInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, port, serverId, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerForModifyServerGroupAttributesInput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
