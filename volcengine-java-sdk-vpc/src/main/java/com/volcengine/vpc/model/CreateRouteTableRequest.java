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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateRouteTableRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class CreateRouteTableRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RouteTableName")
  private String routeTableName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateRouteTableRequest clientToken(String clientToken) {
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

  public CreateRouteTableRequest description(String description) {
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

  public CreateRouteTableRequest projectName(String projectName) {
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

  public CreateRouteTableRequest routeTableName(String routeTableName) {
    this.routeTableName = routeTableName;
    return this;
  }

   /**
   * Get routeTableName
   * @return routeTableName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getRouteTableName() {
    return routeTableName;
  }

  public void setRouteTableName(String routeTableName) {
    this.routeTableName = routeTableName;
  }

  public CreateRouteTableRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRouteTableRequest createRouteTableRequest = (CreateRouteTableRequest) o;
    return Objects.equals(this.clientToken, createRouteTableRequest.clientToken) &&
        Objects.equals(this.description, createRouteTableRequest.description) &&
        Objects.equals(this.projectName, createRouteTableRequest.projectName) &&
        Objects.equals(this.routeTableName, createRouteTableRequest.routeTableName) &&
        Objects.equals(this.vpcId, createRouteTableRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, projectName, routeTableName, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRouteTableRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    routeTableName: ").append(toIndentedString(routeTableName)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
