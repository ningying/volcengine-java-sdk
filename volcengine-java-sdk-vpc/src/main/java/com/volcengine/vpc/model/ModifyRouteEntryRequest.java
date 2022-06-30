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
 * ModifyRouteEntryRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:25.796697+08:00[Asia/Shanghai]")
public class ModifyRouteEntryRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("RouteEntryId")
  private String routeEntryId = null;

  @SerializedName("RouteEntryName")
  private String routeEntryName = null;

  public ModifyRouteEntryRequest description(String description) {
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

  public ModifyRouteEntryRequest routeEntryId(String routeEntryId) {
    this.routeEntryId = routeEntryId;
    return this;
  }

   /**
   * Get routeEntryId
   * @return routeEntryId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRouteEntryId() {
    return routeEntryId;
  }

  public void setRouteEntryId(String routeEntryId) {
    this.routeEntryId = routeEntryId;
  }

  public ModifyRouteEntryRequest routeEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
    return this;
  }

   /**
   * Get routeEntryName
   * @return routeEntryName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getRouteEntryName() {
    return routeEntryName;
  }

  public void setRouteEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyRouteEntryRequest modifyRouteEntryRequest = (ModifyRouteEntryRequest) o;
    return Objects.equals(this.description, modifyRouteEntryRequest.description) &&
        Objects.equals(this.routeEntryId, modifyRouteEntryRequest.routeEntryId) &&
        Objects.equals(this.routeEntryName, modifyRouteEntryRequest.routeEntryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, routeEntryId, routeEntryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyRouteEntryRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routeEntryId: ").append(toIndentedString(routeEntryId)).append("\n");
    sb.append("    routeEntryName: ").append(toIndentedString(routeEntryName)).append("\n");
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
