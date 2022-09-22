/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.OperationDetailForDisassociateInstancesIamRoleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DisassociateInstancesIamRoleResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:28.947116+08:00[Asia/Shanghai]")
public class DisassociateInstancesIamRoleResponse {
  @SerializedName("OperationDetails")
  private List<OperationDetailForDisassociateInstancesIamRoleOutput> operationDetails = null;

  public DisassociateInstancesIamRoleResponse operationDetails(List<OperationDetailForDisassociateInstancesIamRoleOutput> operationDetails) {
    this.operationDetails = operationDetails;
    return this;
  }

  public DisassociateInstancesIamRoleResponse addOperationDetailsItem(OperationDetailForDisassociateInstancesIamRoleOutput operationDetailsItem) {
    if (this.operationDetails == null) {
      this.operationDetails = new ArrayList<OperationDetailForDisassociateInstancesIamRoleOutput>();
    }
    this.operationDetails.add(operationDetailsItem);
    return this;
  }

   /**
   * Get operationDetails
   * @return operationDetails
  **/
  @Valid
  @Schema(description = "")
  public List<OperationDetailForDisassociateInstancesIamRoleOutput> getOperationDetails() {
    return operationDetails;
  }

  public void setOperationDetails(List<OperationDetailForDisassociateInstancesIamRoleOutput> operationDetails) {
    this.operationDetails = operationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisassociateInstancesIamRoleResponse disassociateInstancesIamRoleResponse = (DisassociateInstancesIamRoleResponse) o;
    return Objects.equals(this.operationDetails, disassociateInstancesIamRoleResponse.operationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateInstancesIamRoleResponse {\n");
    
    sb.append("    operationDetails: ").append(toIndentedString(operationDetails)).append("\n");
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
