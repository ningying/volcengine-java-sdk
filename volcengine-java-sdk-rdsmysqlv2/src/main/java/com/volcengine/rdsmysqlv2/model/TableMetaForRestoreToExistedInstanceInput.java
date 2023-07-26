/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.TableForRestoreToExistedInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TableMetaForRestoreToExistedInstanceInput
 */


public class TableMetaForRestoreToExistedInstanceInput {
  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("NewDBName")
  private String newDBName = null;

  @SerializedName("Table")
  private List<TableForRestoreToExistedInstanceInput> table = null;

  public TableMetaForRestoreToExistedInstanceInput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public TableMetaForRestoreToExistedInstanceInput newDBName(String newDBName) {
    this.newDBName = newDBName;
    return this;
  }

   /**
   * Get newDBName
   * @return newDBName
  **/
  @Schema(description = "")
  public String getNewDBName() {
    return newDBName;
  }

  public void setNewDBName(String newDBName) {
    this.newDBName = newDBName;
  }

  public TableMetaForRestoreToExistedInstanceInput table(List<TableForRestoreToExistedInstanceInput> table) {
    this.table = table;
    return this;
  }

  public TableMetaForRestoreToExistedInstanceInput addTableItem(TableForRestoreToExistedInstanceInput tableItem) {
    if (this.table == null) {
      this.table = new ArrayList<TableForRestoreToExistedInstanceInput>();
    }
    this.table.add(tableItem);
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @Valid
  @Schema(description = "")
  public List<TableForRestoreToExistedInstanceInput> getTable() {
    return table;
  }

  public void setTable(List<TableForRestoreToExistedInstanceInput> table) {
    this.table = table;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableMetaForRestoreToExistedInstanceInput tableMetaForRestoreToExistedInstanceInput = (TableMetaForRestoreToExistedInstanceInput) o;
    return Objects.equals(this.dbName, tableMetaForRestoreToExistedInstanceInput.dbName) &&
        Objects.equals(this.newDBName, tableMetaForRestoreToExistedInstanceInput.newDBName) &&
        Objects.equals(this.table, tableMetaForRestoreToExistedInstanceInput.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbName, newDBName, table);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetaForRestoreToExistedInstanceInput {\n");
    
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    newDBName: ").append(toIndentedString(newDBName)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
