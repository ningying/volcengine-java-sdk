/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * PolicyScopeForListAttachedUserPoliciesOutput
 */



public class PolicyScopeForListAttachedUserPoliciesOutput {
  @SerializedName("AttachDate")
  private String attachDate = null;

  @SerializedName("PolicyScopeType")
  private String policyScopeType = null;

  @SerializedName("ProjectDisplayName")
  private String projectDisplayName = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public PolicyScopeForListAttachedUserPoliciesOutput attachDate(String attachDate) {
    this.attachDate = attachDate;
    return this;
  }

   /**
   * Get attachDate
   * @return attachDate
  **/
  @Schema(description = "")
  public String getAttachDate() {
    return attachDate;
  }

  public void setAttachDate(String attachDate) {
    this.attachDate = attachDate;
  }

  public PolicyScopeForListAttachedUserPoliciesOutput policyScopeType(String policyScopeType) {
    this.policyScopeType = policyScopeType;
    return this;
  }

   /**
   * Get policyScopeType
   * @return policyScopeType
  **/
  @Schema(description = "")
  public String getPolicyScopeType() {
    return policyScopeType;
  }

  public void setPolicyScopeType(String policyScopeType) {
    this.policyScopeType = policyScopeType;
  }

  public PolicyScopeForListAttachedUserPoliciesOutput projectDisplayName(String projectDisplayName) {
    this.projectDisplayName = projectDisplayName;
    return this;
  }

   /**
   * Get projectDisplayName
   * @return projectDisplayName
  **/
  @Schema(description = "")
  public String getProjectDisplayName() {
    return projectDisplayName;
  }

  public void setProjectDisplayName(String projectDisplayName) {
    this.projectDisplayName = projectDisplayName;
  }

  public PolicyScopeForListAttachedUserPoliciesOutput projectName(String projectName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyScopeForListAttachedUserPoliciesOutput policyScopeForListAttachedUserPoliciesOutput = (PolicyScopeForListAttachedUserPoliciesOutput) o;
    return Objects.equals(this.attachDate, policyScopeForListAttachedUserPoliciesOutput.attachDate) &&
        Objects.equals(this.policyScopeType, policyScopeForListAttachedUserPoliciesOutput.policyScopeType) &&
        Objects.equals(this.projectDisplayName, policyScopeForListAttachedUserPoliciesOutput.projectDisplayName) &&
        Objects.equals(this.projectName, policyScopeForListAttachedUserPoliciesOutput.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachDate, policyScopeType, projectDisplayName, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyScopeForListAttachedUserPoliciesOutput {\n");
    
    sb.append("    attachDate: ").append(toIndentedString(attachDate)).append("\n");
    sb.append("    policyScopeType: ").append(toIndentedString(policyScopeType)).append("\n");
    sb.append("    projectDisplayName: ").append(toIndentedString(projectDisplayName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
