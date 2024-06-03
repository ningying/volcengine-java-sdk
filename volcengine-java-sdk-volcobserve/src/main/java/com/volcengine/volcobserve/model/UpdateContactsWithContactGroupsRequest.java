/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

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
 * UpdateContactsWithContactGroupsRequest
 */



public class UpdateContactsWithContactGroupsRequest {
  @SerializedName("ContactGroupIds")
  private List<String> contactGroupIds = null;

  @SerializedName("Id")
  private String id = null;

  public UpdateContactsWithContactGroupsRequest contactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
    return this;
  }

  public UpdateContactsWithContactGroupsRequest addContactGroupIdsItem(String contactGroupIdsItem) {
    if (this.contactGroupIds == null) {
      this.contactGroupIds = new ArrayList<String>();
    }
    this.contactGroupIds.add(contactGroupIdsItem);
    return this;
  }

   /**
   * Get contactGroupIds
   * @return contactGroupIds
  **/
  @Schema(description = "")
  public List<String> getContactGroupIds() {
    return contactGroupIds;
  }

  public void setContactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
  }

  public UpdateContactsWithContactGroupsRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateContactsWithContactGroupsRequest updateContactsWithContactGroupsRequest = (UpdateContactsWithContactGroupsRequest) o;
    return Objects.equals(this.contactGroupIds, updateContactsWithContactGroupsRequest.contactGroupIds) &&
        Objects.equals(this.id, updateContactsWithContactGroupsRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactGroupIds, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContactsWithContactGroupsRequest {\n");
    
    sb.append("    contactGroupIds: ").append(toIndentedString(contactGroupIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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