/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mongodb.model.DBInstanceForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstanceDetailResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class DescribeDBInstanceDetailResponse {
  @SerializedName("DBInstance")
  private DBInstanceForDescribeDBInstanceDetailOutput dbInstance = null;

  public DescribeDBInstanceDetailResponse dbInstance(DBInstanceForDescribeDBInstanceDetailOutput dbInstance) {
    this.dbInstance = dbInstance;
    return this;
  }

   /**
   * Get dbInstance
   * @return dbInstance
  **/
  @Valid
  @Schema(description = "")
  public DBInstanceForDescribeDBInstanceDetailOutput getDbInstance() {
    return dbInstance;
  }

  public void setDbInstance(DBInstanceForDescribeDBInstanceDetailOutput dbInstance) {
    this.dbInstance = dbInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstanceDetailResponse describeDBInstanceDetailResponse = (DescribeDBInstanceDetailResponse) o;
    return Objects.equals(this.dbInstance, describeDBInstanceDetailResponse.dbInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbInstance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceDetailResponse {\n");
    
    sb.append("    dbInstance: ").append(toIndentedString(dbInstance)).append("\n");
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
