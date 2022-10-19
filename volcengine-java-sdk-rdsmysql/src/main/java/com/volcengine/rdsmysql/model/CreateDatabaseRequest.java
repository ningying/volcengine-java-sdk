/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * CreateDatabaseRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class CreateDatabaseRequest {
  @SerializedName("CharacterSetName")
  private String characterSetName = null;

  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public CreateDatabaseRequest characterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
    return this;
  }

   /**
   * Get characterSetName
   * @return characterSetName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  public CreateDatabaseRequest dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
 @Size(min=2,max=64)  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public CreateDatabaseRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatabaseRequest createDatabaseRequest = (CreateDatabaseRequest) o;
    return Objects.equals(this.characterSetName, createDatabaseRequest.characterSetName) &&
        Objects.equals(this.dbName, createDatabaseRequest.dbName) &&
        Objects.equals(this.instanceId, createDatabaseRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterSetName, dbName, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatabaseRequest {\n");
    
    sb.append("    characterSetName: ").append(toIndentedString(characterSetName)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
