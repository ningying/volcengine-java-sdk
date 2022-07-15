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
import com.volcengine.rdsmysql.model.DataForListDBInstanceIPListsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDBInstanceIPListsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:46.453185+08:00[Asia/Shanghai]")
public class ListDBInstanceIPListsResponse {
  @SerializedName("Datas")
  private List<DataForListDBInstanceIPListsOutput> datas = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListDBInstanceIPListsResponse datas(List<DataForListDBInstanceIPListsOutput> datas) {
    this.datas = datas;
    return this;
  }

  public ListDBInstanceIPListsResponse addDatasItem(DataForListDBInstanceIPListsOutput datasItem) {
    if (this.datas == null) {
      this.datas = new ArrayList<DataForListDBInstanceIPListsOutput>();
    }
    this.datas.add(datasItem);
    return this;
  }

   /**
   * Get datas
   * @return datas
  **/
  @Valid
  @Schema(description = "")
  public List<DataForListDBInstanceIPListsOutput> getDatas() {
    return datas;
  }

  public void setDatas(List<DataForListDBInstanceIPListsOutput> datas) {
    this.datas = datas;
  }

  public ListDBInstanceIPListsResponse total(Integer total) {
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
    ListDBInstanceIPListsResponse listDBInstanceIPListsResponse = (ListDBInstanceIPListsResponse) o;
    return Objects.equals(this.datas, listDBInstanceIPListsResponse.datas) &&
        Objects.equals(this.total, listDBInstanceIPListsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datas, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDBInstanceIPListsResponse {\n");
    
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
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
