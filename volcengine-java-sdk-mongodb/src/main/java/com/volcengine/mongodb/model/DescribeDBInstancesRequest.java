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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstancesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class DescribeDBInstancesRequest {
  @SerializedName("CreateEndTime")
  private String createEndTime = null;

  @SerializedName("CreateStartTime")
  private String createStartTime = null;

  /**
   * Gets or Sets dbEngine
   */
  @JsonAdapter(DbEngineEnum.Adapter.class)
  public enum DbEngineEnum {
    MONGODB("MongoDB");

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
    _4_0("MongoDB_4_0"),
    _5_0("MongoDB_5_0");

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
    DELETED("Deleted"),
    DELETING("Deleting"),
    DESTROYED("Destroyed"),
    DESTROYING("Destroying"),
    ERROR("Error"),
    IMPORTING("Importing"),
    MIGRATING("Migrating"),
    NETCREATING("NetCreating"),
    NETRELEASING("NetReleasing"),
    NETWORKMAINTAINING("NetworkMaintaining"),
    REBUILDING("Rebuilding"),
    RECLAIMING("Reclaiming"),
    RECYCLED("Recycled"),
    RELEASED("Released"),
    RESTARTING("Restarting"),
    RESTORING("Restoring"),
    RESUMING("Resuming"),
    RUNNING("Running"),
    SSLUPDATING("SSLUpdating"),
    SCALING("Scaling"),
    TDEMAINTAINING("TDEMaintaining"),
    TASKFAILED_AVAILABLE("TaskFailed_Available"),
    UNAVAILABLE("Unavailable"),
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
    REPLICASET("ReplicaSet"),
    SHARDEDCLUSTER("ShardedCluster");

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

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("UpdateEndTime")
  private String updateEndTime = null;

  @SerializedName("UpdateStartTime")
  private String updateStartTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeDBInstancesRequest createEndTime(String createEndTime) {
    this.createEndTime = createEndTime;
    return this;
  }

   /**
   * Get createEndTime
   * @return createEndTime
  **/
  @Schema(description = "")
  public String getCreateEndTime() {
    return createEndTime;
  }

  public void setCreateEndTime(String createEndTime) {
    this.createEndTime = createEndTime;
  }

  public DescribeDBInstancesRequest createStartTime(String createStartTime) {
    this.createStartTime = createStartTime;
    return this;
  }

   /**
   * Get createStartTime
   * @return createStartTime
  **/
  @Schema(description = "")
  public String getCreateStartTime() {
    return createStartTime;
  }

  public void setCreateStartTime(String createStartTime) {
    this.createStartTime = createStartTime;
  }

  public DescribeDBInstancesRequest dbEngine(DbEngineEnum dbEngine) {
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

  public DescribeDBInstancesRequest dbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
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

  public DescribeDBInstancesRequest instanceId(String instanceId) {
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

  public DescribeDBInstancesRequest instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
 @Size(max=64)  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public DescribeDBInstancesRequest instanceStatus(InstanceStatusEnum instanceStatus) {
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

  public DescribeDBInstancesRequest instanceType(InstanceTypeEnum instanceType) {
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

  public DescribeDBInstancesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeDBInstancesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeDBInstancesRequest updateEndTime(String updateEndTime) {
    this.updateEndTime = updateEndTime;
    return this;
  }

   /**
   * Get updateEndTime
   * @return updateEndTime
  **/
  @Schema(description = "")
  public String getUpdateEndTime() {
    return updateEndTime;
  }

  public void setUpdateEndTime(String updateEndTime) {
    this.updateEndTime = updateEndTime;
  }

  public DescribeDBInstancesRequest updateStartTime(String updateStartTime) {
    this.updateStartTime = updateStartTime;
    return this;
  }

   /**
   * Get updateStartTime
   * @return updateStartTime
  **/
  @Schema(description = "")
  public String getUpdateStartTime() {
    return updateStartTime;
  }

  public void setUpdateStartTime(String updateStartTime) {
    this.updateStartTime = updateStartTime;
  }

  public DescribeDBInstancesRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public DescribeDBInstancesRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstancesRequest describeDBInstancesRequest = (DescribeDBInstancesRequest) o;
    return Objects.equals(this.createEndTime, describeDBInstancesRequest.createEndTime) &&
        Objects.equals(this.createStartTime, describeDBInstancesRequest.createStartTime) &&
        Objects.equals(this.dbEngine, describeDBInstancesRequest.dbEngine) &&
        Objects.equals(this.dbEngineVersion, describeDBInstancesRequest.dbEngineVersion) &&
        Objects.equals(this.instanceId, describeDBInstancesRequest.instanceId) &&
        Objects.equals(this.instanceName, describeDBInstancesRequest.instanceName) &&
        Objects.equals(this.instanceStatus, describeDBInstancesRequest.instanceStatus) &&
        Objects.equals(this.instanceType, describeDBInstancesRequest.instanceType) &&
        Objects.equals(this.pageNumber, describeDBInstancesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDBInstancesRequest.pageSize) &&
        Objects.equals(this.updateEndTime, describeDBInstancesRequest.updateEndTime) &&
        Objects.equals(this.updateStartTime, describeDBInstancesRequest.updateStartTime) &&
        Objects.equals(this.vpcId, describeDBInstancesRequest.vpcId) &&
        Objects.equals(this.zoneId, describeDBInstancesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createEndTime, createStartTime, dbEngine, dbEngineVersion, instanceId, instanceName, instanceStatus, instanceType, pageNumber, pageSize, updateEndTime, updateStartTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstancesRequest {\n");
    
    sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
    sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    updateEndTime: ").append(toIndentedString(updateEndTime)).append("\n");
    sb.append("    updateStartTime: ").append(toIndentedString(updateStartTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
