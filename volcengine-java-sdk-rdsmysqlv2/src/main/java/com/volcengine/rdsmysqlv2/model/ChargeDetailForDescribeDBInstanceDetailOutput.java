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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChargeDetailForDescribeDBInstanceDetailOutput
 */



public class ChargeDetailForDescribeDBInstanceDetailOutput {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  @SerializedName("ChargeEndTime")
  private String chargeEndTime = null;

  @SerializedName("ChargeStartTime")
  private String chargeStartTime = null;

  /**
   * Gets or Sets chargeStatus
   */
  @JsonAdapter(ChargeStatusEnum.Adapter.class)
  public enum ChargeStatusEnum {
    @SerializedName("Normal")
    NORMAL("Normal"),
    @SerializedName("Overdue")
    OVERDUE("Overdue"),
    @SerializedName("Unpaid")
    UNPAID("Unpaid");

    private String value;

    ChargeStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargeStatusEnum fromValue(String input) {
      for (ChargeStatusEnum b : ChargeStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargeStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargeStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargeStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargeStatus")
  private ChargeStatusEnum chargeStatus = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("NotEnabled")
    NOTENABLED("NotEnabled"),
    @SerializedName("PostPaid")
    POSTPAID("PostPaid"),
    @SerializedName("PrePaid")
    PREPAID("PrePaid");

    private String value;

    ChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargeTypeEnum fromValue(String input) {
      for (ChargeTypeEnum b : ChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargeType")
  private ChargeTypeEnum chargeType = null;

  @SerializedName("OverdueReclaimTime")
  private String overdueReclaimTime = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("Period")
  private Integer period = null;

  /**
   * Gets or Sets periodUnit
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    @SerializedName("Month")
    MONTH("Month"),
    @SerializedName("Year")
    YEAR("Year");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PeriodUnitEnum fromValue(String input) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PeriodUnit")
  private PeriodUnitEnum periodUnit = null;

  @SerializedName("TempModifyEndTime")
  private String tempModifyEndTime = null;

  @SerializedName("TempModifyStartTime")
  private String tempModifyStartTime = null;

  public ChargeDetailForDescribeDBInstanceDetailOutput autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput chargeEndTime(String chargeEndTime) {
    this.chargeEndTime = chargeEndTime;
    return this;
  }

   /**
   * Get chargeEndTime
   * @return chargeEndTime
  **/
  @Schema(description = "")
  public String getChargeEndTime() {
    return chargeEndTime;
  }

  public void setChargeEndTime(String chargeEndTime) {
    this.chargeEndTime = chargeEndTime;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput chargeStartTime(String chargeStartTime) {
    this.chargeStartTime = chargeStartTime;
    return this;
  }

   /**
   * Get chargeStartTime
   * @return chargeStartTime
  **/
  @Schema(description = "")
  public String getChargeStartTime() {
    return chargeStartTime;
  }

  public void setChargeStartTime(String chargeStartTime) {
    this.chargeStartTime = chargeStartTime;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput chargeStatus(ChargeStatusEnum chargeStatus) {
    this.chargeStatus = chargeStatus;
    return this;
  }

   /**
   * Get chargeStatus
   * @return chargeStatus
  **/
  @Schema(description = "")
  public ChargeStatusEnum getChargeStatus() {
    return chargeStatus;
  }

  public void setChargeStatus(ChargeStatusEnum chargeStatus) {
    this.chargeStatus = chargeStatus;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput overdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
    return this;
  }

   /**
   * Get overdueReclaimTime
   * @return overdueReclaimTime
  **/
  @Schema(description = "")
  public String getOverdueReclaimTime() {
    return overdueReclaimTime;
  }

  public void setOverdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput tempModifyEndTime(String tempModifyEndTime) {
    this.tempModifyEndTime = tempModifyEndTime;
    return this;
  }

   /**
   * Get tempModifyEndTime
   * @return tempModifyEndTime
  **/
  @Schema(description = "")
  public String getTempModifyEndTime() {
    return tempModifyEndTime;
  }

  public void setTempModifyEndTime(String tempModifyEndTime) {
    this.tempModifyEndTime = tempModifyEndTime;
  }

  public ChargeDetailForDescribeDBInstanceDetailOutput tempModifyStartTime(String tempModifyStartTime) {
    this.tempModifyStartTime = tempModifyStartTime;
    return this;
  }

   /**
   * Get tempModifyStartTime
   * @return tempModifyStartTime
  **/
  @Schema(description = "")
  public String getTempModifyStartTime() {
    return tempModifyStartTime;
  }

  public void setTempModifyStartTime(String tempModifyStartTime) {
    this.tempModifyStartTime = tempModifyStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeDetailForDescribeDBInstanceDetailOutput chargeDetailForDescribeDBInstanceDetailOutput = (ChargeDetailForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.autoRenew, chargeDetailForDescribeDBInstanceDetailOutput.autoRenew) &&
        Objects.equals(this.chargeEndTime, chargeDetailForDescribeDBInstanceDetailOutput.chargeEndTime) &&
        Objects.equals(this.chargeStartTime, chargeDetailForDescribeDBInstanceDetailOutput.chargeStartTime) &&
        Objects.equals(this.chargeStatus, chargeDetailForDescribeDBInstanceDetailOutput.chargeStatus) &&
        Objects.equals(this.chargeType, chargeDetailForDescribeDBInstanceDetailOutput.chargeType) &&
        Objects.equals(this.overdueReclaimTime, chargeDetailForDescribeDBInstanceDetailOutput.overdueReclaimTime) &&
        Objects.equals(this.overdueTime, chargeDetailForDescribeDBInstanceDetailOutput.overdueTime) &&
        Objects.equals(this.period, chargeDetailForDescribeDBInstanceDetailOutput.period) &&
        Objects.equals(this.periodUnit, chargeDetailForDescribeDBInstanceDetailOutput.periodUnit) &&
        Objects.equals(this.tempModifyEndTime, chargeDetailForDescribeDBInstanceDetailOutput.tempModifyEndTime) &&
        Objects.equals(this.tempModifyStartTime, chargeDetailForDescribeDBInstanceDetailOutput.tempModifyStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeEndTime, chargeStartTime, chargeStatus, chargeType, overdueReclaimTime, overdueTime, period, periodUnit, tempModifyEndTime, tempModifyStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeDetailForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeEndTime: ").append(toIndentedString(chargeEndTime)).append("\n");
    sb.append("    chargeStartTime: ").append(toIndentedString(chargeStartTime)).append("\n");
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    overdueReclaimTime: ").append(toIndentedString(overdueReclaimTime)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    tempModifyEndTime: ").append(toIndentedString(tempModifyEndTime)).append("\n");
    sb.append("    tempModifyStartTime: ").append(toIndentedString(tempModifyStartTime)).append("\n");
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
