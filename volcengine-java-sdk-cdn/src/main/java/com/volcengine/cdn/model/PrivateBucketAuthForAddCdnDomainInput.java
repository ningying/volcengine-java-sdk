/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.TosAuthInformationForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PrivateBucketAuthForAddCdnDomainInput
 */



public class PrivateBucketAuthForAddCdnDomainInput {
  @SerializedName("AuthType")
  private String authType = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  @SerializedName("TosAuthInformation")
  private TosAuthInformationForAddCdnDomainInput tosAuthInformation = null;

  public PrivateBucketAuthForAddCdnDomainInput authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @Schema(description = "")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public PrivateBucketAuthForAddCdnDomainInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }

  public PrivateBucketAuthForAddCdnDomainInput tosAuthInformation(TosAuthInformationForAddCdnDomainInput tosAuthInformation) {
    this.tosAuthInformation = tosAuthInformation;
    return this;
  }

   /**
   * Get tosAuthInformation
   * @return tosAuthInformation
  **/
  @Valid
  @Schema(description = "")
  public TosAuthInformationForAddCdnDomainInput getTosAuthInformation() {
    return tosAuthInformation;
  }

  public void setTosAuthInformation(TosAuthInformationForAddCdnDomainInput tosAuthInformation) {
    this.tosAuthInformation = tosAuthInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateBucketAuthForAddCdnDomainInput privateBucketAuthForAddCdnDomainInput = (PrivateBucketAuthForAddCdnDomainInput) o;
    return Objects.equals(this.authType, privateBucketAuthForAddCdnDomainInput.authType) &&
        Objects.equals(this._switch, privateBucketAuthForAddCdnDomainInput._switch) &&
        Objects.equals(this.tosAuthInformation, privateBucketAuthForAddCdnDomainInput.tosAuthInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, _switch, tosAuthInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateBucketAuthForAddCdnDomainInput {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    tosAuthInformation: ").append(toIndentedString(tosAuthInformation)).append("\n");
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
