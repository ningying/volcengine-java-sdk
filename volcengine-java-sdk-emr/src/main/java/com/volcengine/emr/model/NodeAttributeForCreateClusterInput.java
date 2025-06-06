/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

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
 * NodeAttributeForCreateClusterInput
 */



public class NodeAttributeForCreateClusterInput {
  @SerializedName("EcsIamRole")
  private String ecsIamRole = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public NodeAttributeForCreateClusterInput ecsIamRole(String ecsIamRole) {
    this.ecsIamRole = ecsIamRole;
    return this;
  }

   /**
   * Get ecsIamRole
   * @return ecsIamRole
  **/
  @Schema(description = "")
  public String getEcsIamRole() {
    return ecsIamRole;
  }

  public void setEcsIamRole(String ecsIamRole) {
    this.ecsIamRole = ecsIamRole;
  }

  public NodeAttributeForCreateClusterInput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeAttributeForCreateClusterInput nodeAttributeForCreateClusterInput = (NodeAttributeForCreateClusterInput) o;
    return Objects.equals(this.ecsIamRole, nodeAttributeForCreateClusterInput.ecsIamRole) &&
        Objects.equals(this.zoneId, nodeAttributeForCreateClusterInput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecsIamRole, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeAttributeForCreateClusterInput {\n");
    
    sb.append("    ecsIamRole: ").append(toIndentedString(ecsIamRole)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
