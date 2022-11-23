/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * ModifyAclAttributesRequest
 */


public class ModifyAclAttributesRequest {
  @SerializedName("AclId")
  private String aclId = null;

  @SerializedName("AclName")
  private String aclName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyAclAttributesRequest aclId(String aclId) {
    this.aclId = aclId;
    return this;
  }

   /**
   * Get aclId
   * @return aclId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAclId() {
    return aclId;
  }

  public void setAclId(String aclId) {
    this.aclId = aclId;
  }

  public ModifyAclAttributesRequest aclName(String aclName) {
    this.aclName = aclName;
    return this;
  }

   /**
   * Get aclName
   * @return aclName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getAclName() {
    return aclName;
  }

  public void setAclName(String aclName) {
    this.aclName = aclName;
  }

  public ModifyAclAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyAclAttributesRequest modifyAclAttributesRequest = (ModifyAclAttributesRequest) o;
    return Objects.equals(this.aclId, modifyAclAttributesRequest.aclId) &&
        Objects.equals(this.aclName, modifyAclAttributesRequest.aclName) &&
        Objects.equals(this.description, modifyAclAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclId, aclName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAclAttributesRequest {\n");
    
    sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
    sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
