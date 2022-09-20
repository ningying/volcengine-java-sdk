/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.ResourceForAssociateNetworkAclInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssociateNetworkAclRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:41.789411+08:00[Asia/Shanghai]")
public class AssociateNetworkAclRequest {
  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  @SerializedName("Resource")
  private List<ResourceForAssociateNetworkAclInput> resource = null;

  public AssociateNetworkAclRequest networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }

  public AssociateNetworkAclRequest resource(List<ResourceForAssociateNetworkAclInput> resource) {
    this.resource = resource;
    return this;
  }

  public AssociateNetworkAclRequest addResourceItem(ResourceForAssociateNetworkAclInput resourceItem) {
    if (this.resource == null) {
      this.resource = new ArrayList<ResourceForAssociateNetworkAclInput>();
    }
    this.resource.add(resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceForAssociateNetworkAclInput> getResource() {
    return resource;
  }

  public void setResource(List<ResourceForAssociateNetworkAclInput> resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateNetworkAclRequest associateNetworkAclRequest = (AssociateNetworkAclRequest) o;
    return Objects.equals(this.networkAclId, associateNetworkAclRequest.networkAclId) &&
        Objects.equals(this.resource, associateNetworkAclRequest.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAclId, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateNetworkAclRequest {\n");
    
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
