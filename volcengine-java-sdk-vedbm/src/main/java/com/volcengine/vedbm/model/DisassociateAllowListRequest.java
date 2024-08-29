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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DisassociateAllowListRequest
 */



public class DisassociateAllowListRequest {
  @SerializedName("AllowListIds")
  private List<String> allowListIds = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  public DisassociateAllowListRequest allowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
    return this;
  }

  public DisassociateAllowListRequest addAllowListIdsItem(String allowListIdsItem) {
    if (this.allowListIds == null) {
      this.allowListIds = new ArrayList<String>();
    }
    this.allowListIds.add(allowListIdsItem);
    return this;
  }

   /**
   * Get allowListIds
   * @return allowListIds
  **/
  @Schema(description = "")
  public List<String> getAllowListIds() {
    return allowListIds;
  }

  public void setAllowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
  }

  public DisassociateAllowListRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public DisassociateAllowListRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisassociateAllowListRequest disassociateAllowListRequest = (DisassociateAllowListRequest) o;
    return Objects.equals(this.allowListIds, disassociateAllowListRequest.allowListIds) &&
        Objects.equals(this.instanceIds, disassociateAllowListRequest.instanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListIds, instanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateAllowListRequest {\n");
    
    sb.append("    allowListIds: ").append(toIndentedString(allowListIds)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
