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
import com.volcengine.iam.model.UserGroupForListGroupsForUserOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListGroupsForUserResponse
 */



public class ListGroupsForUserResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("Total")
  private Integer total = null;

  @SerializedName("UserGroups")
  private List<UserGroupForListGroupsForUserOutput> userGroups = null;

  public ListGroupsForUserResponse limit(Integer limit) {
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

  public ListGroupsForUserResponse offset(Integer offset) {
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

  public ListGroupsForUserResponse total(Integer total) {
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

  public ListGroupsForUserResponse userGroups(List<UserGroupForListGroupsForUserOutput> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public ListGroupsForUserResponse addUserGroupsItem(UserGroupForListGroupsForUserOutput userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<UserGroupForListGroupsForUserOutput>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @Valid
  @Schema(description = "")
  public List<UserGroupForListGroupsForUserOutput> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<UserGroupForListGroupsForUserOutput> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGroupsForUserResponse listGroupsForUserResponse = (ListGroupsForUserResponse) o;
    return Objects.equals(this.limit, listGroupsForUserResponse.limit) &&
        Objects.equals(this.offset, listGroupsForUserResponse.offset) &&
        Objects.equals(this.total, listGroupsForUserResponse.total) &&
        Objects.equals(this.userGroups, listGroupsForUserResponse.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, total, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGroupsForUserResponse {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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
