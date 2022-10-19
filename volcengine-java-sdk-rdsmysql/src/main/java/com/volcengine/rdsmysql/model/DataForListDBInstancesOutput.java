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
import com.volcengine.rdsmysql.model.InstanceSpecForListDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListDBInstancesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class DataForListDBInstancesOutput {
  /**
   * Gets or Sets chargeStatus
   */
  @JsonAdapter(ChargeStatusEnum.Adapter.class)
  public enum ChargeStatusEnum {
    NORMAL("Normal"),
    OVERDUE("Overdue"),
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
    NOTENABLED("NotEnabled"),
    POSTPAID("PostPaid"),
    PREPAID("Prepaid");

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

  @SerializedName("CreateTime")
  private String createTime = null;

  /**
   * Gets or Sets dbEngine
   */
  @JsonAdapter(DbEngineEnum.Adapter.class)
  public enum DbEngineEnum {
    MYSQL("MySQL");

    private String value;

    DbEngineEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbEngineEnum fromValue(String input) {
      for (DbEngineEnum b : DbEngineEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbEngineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbEngineEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbEngineEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbEngineEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBEngine")
  private DbEngineEnum dbEngine = null;

  /**
   * Gets or Sets dbEngineVersion
   */
  @JsonAdapter(DbEngineVersionEnum.Adapter.class)
  public enum DbEngineVersionEnum {
    _8_0("MySQL_8_0"),
    COMMUNITY_5_7("MySQL_Community_5_7");

    private String value;

    DbEngineVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbEngineVersionEnum fromValue(String input) {
      for (DbEngineVersionEnum b : DbEngineVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbEngineVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbEngineVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbEngineVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbEngineVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBEngineVersion")
  private DbEngineVersionEnum dbEngineVersion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceSpec")
  private InstanceSpecForListDBInstancesOutput instanceSpec = null;

  /**
   * Gets or Sets instanceStatus
   */
  @JsonAdapter(InstanceStatusEnum.Adapter.class)
  public enum InstanceStatusEnum {
    ALLOWLISTMAINTAINING("AllowListMaintaining"),
    CLOSED("Closed"),
    CLOSING("Closing"),
    CREATEFAILED("CreateFailed"),
    CREATING("Creating"),
    DELETING("Deleting"),
    DESTROYED("Destroyed"),
    DESTROYING("Destroying"),
    ERROR("Error"),
    IMPORTING("Importing"),
    MAINTAINING("Maintaining"),
    MASTERCHANGING("MasterChanging"),
    MIGRATING("Migrating"),
    RECLAIMING("Reclaiming"),
    RECYCLED("Recycled"),
    RELEASED("Released"),
    RESTARTING("Restarting"),
    RESTORING("Restoring"),
    RESUMING("Resuming"),
    RUNNING("Running"),
    SSLUPDATING("SSLUpdating"),
    TDEUPDATING("TDEUpdating"),
    UNKNOWN("Unknown"),
    UPDATING("Updating"),
    UPGRADING("Upgrading"),
    WAITINGPAID("WaitingPaid");

    private String value;

    InstanceStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceStatusEnum fromValue(String input) {
      for (InstanceStatusEnum b : InstanceStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceStatus")
  private InstanceStatusEnum instanceStatus = null;

  /**
   * Gets or Sets instanceType
   */
  @JsonAdapter(InstanceTypeEnum.Adapter.class)
  public enum InstanceTypeEnum {
    HA("HA");

    private String value;

    InstanceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceTypeEnum fromValue(String input) {
      for (InstanceTypeEnum b : InstanceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceType")
  private InstanceTypeEnum instanceType = null;

  @SerializedName("ReadOnlyInstanceIds")
  private List<String> readOnlyInstanceIds = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("StorageSpaceGB")
  private Integer storageSpaceGB = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  @SerializedName("Zone")
  private String zone = null;

  public DataForListDBInstancesOutput chargeStatus(ChargeStatusEnum chargeStatus) {
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

  public DataForListDBInstancesOutput chargeType(ChargeTypeEnum chargeType) {
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

  public DataForListDBInstancesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public DataForListDBInstancesOutput dbEngine(DbEngineEnum dbEngine) {
    this.dbEngine = dbEngine;
    return this;
  }

   /**
   * Get dbEngine
   * @return dbEngine
  **/
  @Schema(description = "")
  public DbEngineEnum getDbEngine() {
    return dbEngine;
  }

  public void setDbEngine(DbEngineEnum dbEngine) {
    this.dbEngine = dbEngine;
  }

  public DataForListDBInstancesOutput dbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public DbEngineVersionEnum getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public DataForListDBInstancesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DataForListDBInstancesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public DataForListDBInstancesOutput instanceSpec(InstanceSpecForListDBInstancesOutput instanceSpec) {
    this.instanceSpec = instanceSpec;
    return this;
  }

   /**
   * Get instanceSpec
   * @return instanceSpec
  **/
  @Valid
  @Schema(description = "")
  public InstanceSpecForListDBInstancesOutput getInstanceSpec() {
    return instanceSpec;
  }

  public void setInstanceSpec(InstanceSpecForListDBInstancesOutput instanceSpec) {
    this.instanceSpec = instanceSpec;
  }

  public DataForListDBInstancesOutput instanceStatus(InstanceStatusEnum instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public InstanceStatusEnum getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(InstanceStatusEnum instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public DataForListDBInstancesOutput instanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public InstanceTypeEnum getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
  }

  public DataForListDBInstancesOutput readOnlyInstanceIds(List<String> readOnlyInstanceIds) {
    this.readOnlyInstanceIds = readOnlyInstanceIds;
    return this;
  }

  public DataForListDBInstancesOutput addReadOnlyInstanceIdsItem(String readOnlyInstanceIdsItem) {
    if (this.readOnlyInstanceIds == null) {
      this.readOnlyInstanceIds = new ArrayList<String>();
    }
    this.readOnlyInstanceIds.add(readOnlyInstanceIdsItem);
    return this;
  }

   /**
   * Get readOnlyInstanceIds
   * @return readOnlyInstanceIds
  **/
  @Schema(description = "")
  public List<String> getReadOnlyInstanceIds() {
    return readOnlyInstanceIds;
  }

  public void setReadOnlyInstanceIds(List<String> readOnlyInstanceIds) {
    this.readOnlyInstanceIds = readOnlyInstanceIds;
  }

  public DataForListDBInstancesOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DataForListDBInstancesOutput storageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
    return this;
  }

   /**
   * Get storageSpaceGB
   * @return storageSpaceGB
  **/
  @Schema(description = "")
  public Integer getStorageSpaceGB() {
    return storageSpaceGB;
  }

  public void setStorageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
  }

  public DataForListDBInstancesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public DataForListDBInstancesOutput vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }

  public DataForListDBInstancesOutput zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListDBInstancesOutput dataForListDBInstancesOutput = (DataForListDBInstancesOutput) o;
    return Objects.equals(this.chargeStatus, dataForListDBInstancesOutput.chargeStatus) &&
        Objects.equals(this.chargeType, dataForListDBInstancesOutput.chargeType) &&
        Objects.equals(this.createTime, dataForListDBInstancesOutput.createTime) &&
        Objects.equals(this.dbEngine, dataForListDBInstancesOutput.dbEngine) &&
        Objects.equals(this.dbEngineVersion, dataForListDBInstancesOutput.dbEngineVersion) &&
        Objects.equals(this.instanceId, dataForListDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, dataForListDBInstancesOutput.instanceName) &&
        Objects.equals(this.instanceSpec, dataForListDBInstancesOutput.instanceSpec) &&
        Objects.equals(this.instanceStatus, dataForListDBInstancesOutput.instanceStatus) &&
        Objects.equals(this.instanceType, dataForListDBInstancesOutput.instanceType) &&
        Objects.equals(this.readOnlyInstanceIds, dataForListDBInstancesOutput.readOnlyInstanceIds) &&
        Objects.equals(this.region, dataForListDBInstancesOutput.region) &&
        Objects.equals(this.storageSpaceGB, dataForListDBInstancesOutput.storageSpaceGB) &&
        Objects.equals(this.updateTime, dataForListDBInstancesOutput.updateTime) &&
        Objects.equals(this.vpcID, dataForListDBInstancesOutput.vpcID) &&
        Objects.equals(this.zone, dataForListDBInstancesOutput.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeStatus, chargeType, createTime, dbEngine, dbEngineVersion, instanceId, instanceName, instanceSpec, instanceStatus, instanceType, readOnlyInstanceIds, region, storageSpaceGB, updateTime, vpcID, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListDBInstancesOutput {\n");
    
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceSpec: ").append(toIndentedString(instanceSpec)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    readOnlyInstanceIds: ").append(toIndentedString(readOnlyInstanceIds)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storageSpaceGB: ").append(toIndentedString(storageSpaceGB)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
