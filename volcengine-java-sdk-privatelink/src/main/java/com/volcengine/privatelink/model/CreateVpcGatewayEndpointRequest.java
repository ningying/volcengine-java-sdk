/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatelink.model.TagForCreateVpcGatewayEndpointInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVpcGatewayEndpointRequest
 */



public class CreateVpcGatewayEndpointRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("Tags")
  private List<TagForCreateVpcGatewayEndpointInput> tags = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcPolicy")
  private String vpcPolicy = null;

  public CreateVpcGatewayEndpointRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateVpcGatewayEndpointRequest description(String description) {
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

  public CreateVpcGatewayEndpointRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public CreateVpcGatewayEndpointRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateVpcGatewayEndpointRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public CreateVpcGatewayEndpointRequest tags(List<TagForCreateVpcGatewayEndpointInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateVpcGatewayEndpointRequest addTagsItem(TagForCreateVpcGatewayEndpointInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateVpcGatewayEndpointInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateVpcGatewayEndpointInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateVpcGatewayEndpointInput> tags) {
    this.tags = tags;
  }

  public CreateVpcGatewayEndpointRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public CreateVpcGatewayEndpointRequest vpcPolicy(String vpcPolicy) {
    this.vpcPolicy = vpcPolicy;
    return this;
  }

   /**
   * Get vpcPolicy
   * @return vpcPolicy
  **/
  @Schema(description = "")
  public String getVpcPolicy() {
    return vpcPolicy;
  }

  public void setVpcPolicy(String vpcPolicy) {
    this.vpcPolicy = vpcPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpcGatewayEndpointRequest createVpcGatewayEndpointRequest = (CreateVpcGatewayEndpointRequest) o;
    return Objects.equals(this.clientToken, createVpcGatewayEndpointRequest.clientToken) &&
        Objects.equals(this.description, createVpcGatewayEndpointRequest.description) &&
        Objects.equals(this.endpointName, createVpcGatewayEndpointRequest.endpointName) &&
        Objects.equals(this.projectName, createVpcGatewayEndpointRequest.projectName) &&
        Objects.equals(this.serviceId, createVpcGatewayEndpointRequest.serviceId) &&
        Objects.equals(this.tags, createVpcGatewayEndpointRequest.tags) &&
        Objects.equals(this.vpcId, createVpcGatewayEndpointRequest.vpcId) &&
        Objects.equals(this.vpcPolicy, createVpcGatewayEndpointRequest.vpcPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, endpointName, projectName, serviceId, tags, vpcId, vpcPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpcGatewayEndpointRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcPolicy: ").append(toIndentedString(vpcPolicy)).append("\n");
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
