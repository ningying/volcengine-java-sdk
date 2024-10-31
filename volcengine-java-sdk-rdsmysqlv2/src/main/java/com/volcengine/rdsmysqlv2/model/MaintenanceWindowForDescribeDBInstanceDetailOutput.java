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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MaintenanceWindowForDescribeDBInstanceDetailOutput
 */



public class MaintenanceWindowForDescribeDBInstanceDetailOutput {
  @SerializedName("DayKind")
  private String dayKind = null;

  @SerializedName("DayOfWeek")
  private List<String> dayOfWeek = null;

  @SerializedName("MaintenanceTime")
  private String maintenanceTime = null;

  public MaintenanceWindowForDescribeDBInstanceDetailOutput dayKind(String dayKind) {
    this.dayKind = dayKind;
    return this;
  }

   /**
   * Get dayKind
   * @return dayKind
  **/
  @Schema(description = "")
  public String getDayKind() {
    return dayKind;
  }

  public void setDayKind(String dayKind) {
    this.dayKind = dayKind;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput dayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput addDayOfWeekItem(String dayOfWeekItem) {
    if (this.dayOfWeek == null) {
      this.dayOfWeek = new ArrayList<String>();
    }
    this.dayOfWeek.add(dayOfWeekItem);
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @Schema(description = "")
  public List<String> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput maintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
    return this;
  }

   /**
   * Get maintenanceTime
   * @return maintenanceTime
  **/
  @Schema(description = "")
  public String getMaintenanceTime() {
    return maintenanceTime;
  }

  public void setMaintenanceTime(String maintenanceTime) {
    this.maintenanceTime = maintenanceTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowForDescribeDBInstanceDetailOutput maintenanceWindowForDescribeDBInstanceDetailOutput = (MaintenanceWindowForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.dayKind, maintenanceWindowForDescribeDBInstanceDetailOutput.dayKind) &&
        Objects.equals(this.dayOfWeek, maintenanceWindowForDescribeDBInstanceDetailOutput.dayOfWeek) &&
        Objects.equals(this.maintenanceTime, maintenanceWindowForDescribeDBInstanceDetailOutput.maintenanceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayKind, dayOfWeek, maintenanceTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    dayKind: ").append(toIndentedString(dayKind)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    maintenanceTime: ").append(toIndentedString(maintenanceTime)).append("\n");
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