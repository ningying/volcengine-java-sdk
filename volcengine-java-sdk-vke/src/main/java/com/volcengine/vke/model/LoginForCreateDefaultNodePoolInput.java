/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * LoginForCreateDefaultNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class LoginForCreateDefaultNodePoolInput {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("SshKeyPairName")
  private String sshKeyPairName = null;

  public LoginForCreateDefaultNodePoolInput password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginForCreateDefaultNodePoolInput sshKeyPairName(String sshKeyPairName) {
    this.sshKeyPairName = sshKeyPairName;
    return this;
  }

   /**
   * Get sshKeyPairName
   * @return sshKeyPairName
  **/
  @Schema(description = "")
  public String getSshKeyPairName() {
    return sshKeyPairName;
  }

  public void setSshKeyPairName(String sshKeyPairName) {
    this.sshKeyPairName = sshKeyPairName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginForCreateDefaultNodePoolInput loginForCreateDefaultNodePoolInput = (LoginForCreateDefaultNodePoolInput) o;
    return Objects.equals(this.password, loginForCreateDefaultNodePoolInput.password) &&
        Objects.equals(this.sshKeyPairName, loginForCreateDefaultNodePoolInput.sshKeyPairName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, sshKeyPairName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginForCreateDefaultNodePoolInput {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshKeyPairName: ").append(toIndentedString(sshKeyPairName)).append("\n");
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
