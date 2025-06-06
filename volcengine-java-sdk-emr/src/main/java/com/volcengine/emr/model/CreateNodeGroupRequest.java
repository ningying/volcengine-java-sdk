/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.emr.model.ApplicationLayoutForCreateNodeGroupInput;
import com.volcengine.emr.model.DataDiskForCreateNodeGroupInput;
import com.volcengine.emr.model.SystemDiskForCreateNodeGroupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateNodeGroupRequest
 */



public class CreateNodeGroupRequest {
  @SerializedName("ApplicationLayouts")
  private List<ApplicationLayoutForCreateNodeGroupInput> applicationLayouts = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("PRE")
    PRE("PRE"),
    @SerializedName("POST")
    POST("POST");

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

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("DataDisks")
  private List<DataDiskForCreateNodeGroupInput> dataDisks = null;

  @SerializedName("EcsInstanceTypes")
  private List<String> ecsInstanceTypes = null;

  @SerializedName("NodeCount")
  private Integer nodeCount = null;

  @SerializedName("NodeGroupName")
  private String nodeGroupName = null;

  @SerializedName("NodeGroupType")
  private String nodeGroupType = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("SystemDisk")
  private SystemDiskForCreateNodeGroupInput systemDisk = null;

  @SerializedName("WithPublicIp")
  private Boolean withPublicIp = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public CreateNodeGroupRequest applicationLayouts(List<ApplicationLayoutForCreateNodeGroupInput> applicationLayouts) {
    this.applicationLayouts = applicationLayouts;
    return this;
  }

  public CreateNodeGroupRequest addApplicationLayoutsItem(ApplicationLayoutForCreateNodeGroupInput applicationLayoutsItem) {
    if (this.applicationLayouts == null) {
      this.applicationLayouts = new ArrayList<ApplicationLayoutForCreateNodeGroupInput>();
    }
    this.applicationLayouts.add(applicationLayoutsItem);
    return this;
  }

   /**
   * Get applicationLayouts
   * @return applicationLayouts
  **/
  @Valid
  @Schema(description = "")
  public List<ApplicationLayoutForCreateNodeGroupInput> getApplicationLayouts() {
    return applicationLayouts;
  }

  public void setApplicationLayouts(List<ApplicationLayoutForCreateNodeGroupInput> applicationLayouts) {
    this.applicationLayouts = applicationLayouts;
  }

  public CreateNodeGroupRequest chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }

  public CreateNodeGroupRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateNodeGroupRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public CreateNodeGroupRequest dataDisks(List<DataDiskForCreateNodeGroupInput> dataDisks) {
    this.dataDisks = dataDisks;
    return this;
  }

  public CreateNodeGroupRequest addDataDisksItem(DataDiskForCreateNodeGroupInput dataDisksItem) {
    if (this.dataDisks == null) {
      this.dataDisks = new ArrayList<DataDiskForCreateNodeGroupInput>();
    }
    this.dataDisks.add(dataDisksItem);
    return this;
  }

   /**
   * Get dataDisks
   * @return dataDisks
  **/
  @Valid
  @Schema(description = "")
  public List<DataDiskForCreateNodeGroupInput> getDataDisks() {
    return dataDisks;
  }

  public void setDataDisks(List<DataDiskForCreateNodeGroupInput> dataDisks) {
    this.dataDisks = dataDisks;
  }

  public CreateNodeGroupRequest ecsInstanceTypes(List<String> ecsInstanceTypes) {
    this.ecsInstanceTypes = ecsInstanceTypes;
    return this;
  }

  public CreateNodeGroupRequest addEcsInstanceTypesItem(String ecsInstanceTypesItem) {
    if (this.ecsInstanceTypes == null) {
      this.ecsInstanceTypes = new ArrayList<String>();
    }
    this.ecsInstanceTypes.add(ecsInstanceTypesItem);
    return this;
  }

   /**
   * Get ecsInstanceTypes
   * @return ecsInstanceTypes
  **/
  @Schema(description = "")
  public List<String> getEcsInstanceTypes() {
    return ecsInstanceTypes;
  }

  public void setEcsInstanceTypes(List<String> ecsInstanceTypes) {
    this.ecsInstanceTypes = ecsInstanceTypes;
  }

  public CreateNodeGroupRequest nodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * Get nodeCount
   * minimum: 0
   * maximum: 1000
   * @return nodeCount
  **/
  @NotNull
 @Min(0) @Max(1000)  @Schema(required = true, description = "")
  public Integer getNodeCount() {
    return nodeCount;
  }

  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  public CreateNodeGroupRequest nodeGroupName(String nodeGroupName) {
    this.nodeGroupName = nodeGroupName;
    return this;
  }

   /**
   * Get nodeGroupName
   * @return nodeGroupName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNodeGroupName() {
    return nodeGroupName;
  }

  public void setNodeGroupName(String nodeGroupName) {
    this.nodeGroupName = nodeGroupName;
  }

  public CreateNodeGroupRequest nodeGroupType(String nodeGroupType) {
    this.nodeGroupType = nodeGroupType;
    return this;
  }

   /**
   * Get nodeGroupType
   * @return nodeGroupType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNodeGroupType() {
    return nodeGroupType;
  }

  public void setNodeGroupType(String nodeGroupType) {
    this.nodeGroupType = nodeGroupType;
  }

  public CreateNodeGroupRequest subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public CreateNodeGroupRequest addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public CreateNodeGroupRequest systemDisk(SystemDiskForCreateNodeGroupInput systemDisk) {
    this.systemDisk = systemDisk;
    return this;
  }

   /**
   * Get systemDisk
   * @return systemDisk
  **/
  @Valid
  @Schema(description = "")
  public SystemDiskForCreateNodeGroupInput getSystemDisk() {
    return systemDisk;
  }

  public void setSystemDisk(SystemDiskForCreateNodeGroupInput systemDisk) {
    this.systemDisk = systemDisk;
  }

  public CreateNodeGroupRequest withPublicIp(Boolean withPublicIp) {
    this.withPublicIp = withPublicIp;
    return this;
  }

   /**
   * Get withPublicIp
   * @return withPublicIp
  **/
  @Schema(description = "")
  public Boolean isWithPublicIp() {
    return withPublicIp;
  }

  public void setWithPublicIp(Boolean withPublicIp) {
    this.withPublicIp = withPublicIp;
  }

  public CreateNodeGroupRequest zoneId(String zoneId) {
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
    CreateNodeGroupRequest createNodeGroupRequest = (CreateNodeGroupRequest) o;
    return Objects.equals(this.applicationLayouts, createNodeGroupRequest.applicationLayouts) &&
        Objects.equals(this.chargeType, createNodeGroupRequest.chargeType) &&
        Objects.equals(this.clientToken, createNodeGroupRequest.clientToken) &&
        Objects.equals(this.clusterId, createNodeGroupRequest.clusterId) &&
        Objects.equals(this.dataDisks, createNodeGroupRequest.dataDisks) &&
        Objects.equals(this.ecsInstanceTypes, createNodeGroupRequest.ecsInstanceTypes) &&
        Objects.equals(this.nodeCount, createNodeGroupRequest.nodeCount) &&
        Objects.equals(this.nodeGroupName, createNodeGroupRequest.nodeGroupName) &&
        Objects.equals(this.nodeGroupType, createNodeGroupRequest.nodeGroupType) &&
        Objects.equals(this.subnetIds, createNodeGroupRequest.subnetIds) &&
        Objects.equals(this.systemDisk, createNodeGroupRequest.systemDisk) &&
        Objects.equals(this.withPublicIp, createNodeGroupRequest.withPublicIp) &&
        Objects.equals(this.zoneId, createNodeGroupRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLayouts, chargeType, clientToken, clusterId, dataDisks, ecsInstanceTypes, nodeCount, nodeGroupName, nodeGroupType, subnetIds, systemDisk, withPublicIp, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNodeGroupRequest {\n");
    
    sb.append("    applicationLayouts: ").append(toIndentedString(applicationLayouts)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dataDisks: ").append(toIndentedString(dataDisks)).append("\n");
    sb.append("    ecsInstanceTypes: ").append(toIndentedString(ecsInstanceTypes)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
    sb.append("    nodeGroupType: ").append(toIndentedString(nodeGroupType)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    systemDisk: ").append(toIndentedString(systemDisk)).append("\n");
    sb.append("    withPublicIp: ").append(toIndentedString(withPublicIp)).append("\n");
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
