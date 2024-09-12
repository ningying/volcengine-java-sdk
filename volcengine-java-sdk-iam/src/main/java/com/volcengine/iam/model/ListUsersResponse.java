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
import com.volcengine.iam.model.UserMetadataForListUsersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListUsersResponse
 */



public class ListUsersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("Total")
  private Integer total = null;

  @SerializedName("UserMetadata")
  private List<UserMetadataForListUsersOutput> userMetadata = null;

  public ListUsersResponse limit(Integer limit) {
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

  public ListUsersResponse offset(Integer offset) {
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

  public ListUsersResponse total(Integer total) {
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

  public ListUsersResponse userMetadata(List<UserMetadataForListUsersOutput> userMetadata) {
    this.userMetadata = userMetadata;
    return this;
  }

  public ListUsersResponse addUserMetadataItem(UserMetadataForListUsersOutput userMetadataItem) {
    if (this.userMetadata == null) {
      this.userMetadata = new ArrayList<UserMetadataForListUsersOutput>();
    }
    this.userMetadata.add(userMetadataItem);
    return this;
  }

   /**
   * Get userMetadata
   * @return userMetadata
  **/
  @Valid
  @Schema(description = "")
  public List<UserMetadataForListUsersOutput> getUserMetadata() {
    return userMetadata;
  }

  public void setUserMetadata(List<UserMetadataForListUsersOutput> userMetadata) {
    this.userMetadata = userMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUsersResponse listUsersResponse = (ListUsersResponse) o;
    return Objects.equals(this.limit, listUsersResponse.limit) &&
        Objects.equals(this.offset, listUsersResponse.offset) &&
        Objects.equals(this.total, listUsersResponse.total) &&
        Objects.equals(this.userMetadata, listUsersResponse.userMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, total, userMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUsersResponse {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    userMetadata: ").append(toIndentedString(userMetadata)).append("\n");
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
