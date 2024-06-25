/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam20210801.model.ProjectRoleForListProjectIdentitiesOutput;
import com.volcengine.iam20210801.model.ProjectUserForListProjectIdentitiesOutput;
import com.volcengine.iam20210801.model.ProjectUserGroupForListProjectIdentitiesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListProjectIdentitiesResponse
 */


public class ListProjectIdentitiesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("ProjectRoles")
  private List<ProjectRoleForListProjectIdentitiesOutput> projectRoles = null;

  @SerializedName("ProjectUserGroups")
  private List<ProjectUserGroupForListProjectIdentitiesOutput> projectUserGroups = null;

  @SerializedName("ProjectUsers")
  private List<ProjectUserForListProjectIdentitiesOutput> projectUsers = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListProjectIdentitiesResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListProjectIdentitiesResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListProjectIdentitiesResponse projectRoles(List<ProjectRoleForListProjectIdentitiesOutput> projectRoles) {
    this.projectRoles = projectRoles;
    return this;
  }

  public ListProjectIdentitiesResponse addProjectRolesItem(ProjectRoleForListProjectIdentitiesOutput projectRolesItem) {
    if (this.projectRoles == null) {
      this.projectRoles = new ArrayList<ProjectRoleForListProjectIdentitiesOutput>();
    }
    this.projectRoles.add(projectRolesItem);
    return this;
  }

   /**
   * Get projectRoles
   * @return projectRoles
  **/
  @Valid
  @Schema(description = "")
  public List<ProjectRoleForListProjectIdentitiesOutput> getProjectRoles() {
    return projectRoles;
  }

  public void setProjectRoles(List<ProjectRoleForListProjectIdentitiesOutput> projectRoles) {
    this.projectRoles = projectRoles;
  }

  public ListProjectIdentitiesResponse projectUserGroups(List<ProjectUserGroupForListProjectIdentitiesOutput> projectUserGroups) {
    this.projectUserGroups = projectUserGroups;
    return this;
  }

  public ListProjectIdentitiesResponse addProjectUserGroupsItem(ProjectUserGroupForListProjectIdentitiesOutput projectUserGroupsItem) {
    if (this.projectUserGroups == null) {
      this.projectUserGroups = new ArrayList<ProjectUserGroupForListProjectIdentitiesOutput>();
    }
    this.projectUserGroups.add(projectUserGroupsItem);
    return this;
  }

   /**
   * Get projectUserGroups
   * @return projectUserGroups
  **/
  @Valid
  @Schema(description = "")
  public List<ProjectUserGroupForListProjectIdentitiesOutput> getProjectUserGroups() {
    return projectUserGroups;
  }

  public void setProjectUserGroups(List<ProjectUserGroupForListProjectIdentitiesOutput> projectUserGroups) {
    this.projectUserGroups = projectUserGroups;
  }

  public ListProjectIdentitiesResponse projectUsers(List<ProjectUserForListProjectIdentitiesOutput> projectUsers) {
    this.projectUsers = projectUsers;
    return this;
  }

  public ListProjectIdentitiesResponse addProjectUsersItem(ProjectUserForListProjectIdentitiesOutput projectUsersItem) {
    if (this.projectUsers == null) {
      this.projectUsers = new ArrayList<ProjectUserForListProjectIdentitiesOutput>();
    }
    this.projectUsers.add(projectUsersItem);
    return this;
  }

   /**
   * Get projectUsers
   * @return projectUsers
  **/
  @Valid
  @Schema(description = "")
  public List<ProjectUserForListProjectIdentitiesOutput> getProjectUsers() {
    return projectUsers;
  }

  public void setProjectUsers(List<ProjectUserForListProjectIdentitiesOutput> projectUsers) {
    this.projectUsers = projectUsers;
  }

  public ListProjectIdentitiesResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProjectIdentitiesResponse listProjectIdentitiesResponse = (ListProjectIdentitiesResponse) o;
    return Objects.equals(this.limit, listProjectIdentitiesResponse.limit) &&
        Objects.equals(this.offset, listProjectIdentitiesResponse.offset) &&
        Objects.equals(this.projectRoles, listProjectIdentitiesResponse.projectRoles) &&
        Objects.equals(this.projectUserGroups, listProjectIdentitiesResponse.projectUserGroups) &&
        Objects.equals(this.projectUsers, listProjectIdentitiesResponse.projectUsers) &&
        Objects.equals(this.total, listProjectIdentitiesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, projectRoles, projectUserGroups, projectUsers, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProjectIdentitiesResponse {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    projectRoles: ").append(toIndentedString(projectRoles)).append("\n");
    sb.append("    projectUserGroups: ").append(toIndentedString(projectUserGroups)).append("\n");
    sb.append("    projectUsers: ").append(toIndentedString(projectUsers)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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