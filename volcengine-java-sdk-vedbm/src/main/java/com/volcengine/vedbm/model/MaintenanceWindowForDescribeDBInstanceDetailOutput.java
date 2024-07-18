/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
  /**
   * Gets or Sets dayKind
   */
  @JsonAdapter(DayKindEnum.Adapter.class)
  public enum DayKindEnum {
    @SerializedName("Week")
    WEEK("Week"),
    @SerializedName("Month")
    MONTH("Month");

    private String value;

    DayKindEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DayKindEnum fromValue(String input) {
      for (DayKindEnum b : DayKindEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DayKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayKindEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DayKindEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DayKindEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DayKind")
  private DayKindEnum dayKind = null;

  @SerializedName("DayOfMonth")
  private List<Integer> dayOfMonth = null;

  /**
   * Gets or Sets dayOfWeek
   */
  @JsonAdapter(DayOfWeekEnum.Adapter.class)
  public enum DayOfWeekEnum {
    @SerializedName("Sunday")
    SUNDAY("Sunday"),
    @SerializedName("Monday")
    MONDAY("Monday"),
    @SerializedName("Tuesday")
    TUESDAY("Tuesday"),
    @SerializedName("Wednesday")
    WEDNESDAY("Wednesday"),
    @SerializedName("Thursday")
    THURSDAY("Thursday"),
    @SerializedName("Friday")
    FRIDAY("Friday"),
    @SerializedName("Saturday")
    SATURDAY("Saturday");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DayOfWeekEnum fromValue(String input) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DayOfWeekEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DayOfWeek")
  private List<DayOfWeekEnum> dayOfWeek = null;

  @SerializedName("MaintenanceTime")
  private String maintenanceTime = null;

  public MaintenanceWindowForDescribeDBInstanceDetailOutput dayKind(DayKindEnum dayKind) {
    this.dayKind = dayKind;
    return this;
  }

   /**
   * Get dayKind
   * @return dayKind
  **/
  @Schema(description = "")
  public DayKindEnum getDayKind() {
    return dayKind;
  }

  public void setDayKind(DayKindEnum dayKind) {
    this.dayKind = dayKind;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput dayOfMonth(List<Integer> dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput addDayOfMonthItem(Integer dayOfMonthItem) {
    if (this.dayOfMonth == null) {
      this.dayOfMonth = new ArrayList<Integer>();
    }
    this.dayOfMonth.add(dayOfMonthItem);
    return this;
  }

   /**
   * Get dayOfMonth
   * @return dayOfMonth
  **/
  @Schema(description = "")
  public List<Integer> getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(List<Integer> dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput dayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public MaintenanceWindowForDescribeDBInstanceDetailOutput addDayOfWeekItem(DayOfWeekEnum dayOfWeekItem) {
    if (this.dayOfWeek == null) {
      this.dayOfWeek = new ArrayList<DayOfWeekEnum>();
    }
    this.dayOfWeek.add(dayOfWeekItem);
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @Schema(description = "")
  public List<DayOfWeekEnum> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
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
        Objects.equals(this.dayOfMonth, maintenanceWindowForDescribeDBInstanceDetailOutput.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, maintenanceWindowForDescribeDBInstanceDetailOutput.dayOfWeek) &&
        Objects.equals(this.maintenanceTime, maintenanceWindowForDescribeDBInstanceDetailOutput.maintenanceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayKind, dayOfMonth, dayOfWeek, maintenanceTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    dayKind: ").append(toIndentedString(dayKind)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
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
