/*
 * escloud
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.escloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.escloud.model.ColdNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.ColdNodeStorageSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.CoordinatorNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.CoordinatorNodeStorageSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.HotNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.HotNodeStorageSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.KibanaNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.MasterNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.MasterNodeStorageSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.SubnetForDescribeInstanceOutput;
import com.volcengine.escloud.model.VPCForDescribeInstanceOutput;
import com.volcengine.escloud.model.WarmNodeResourceSpecForDescribeInstanceOutput;
import com.volcengine.escloud.model.WarmNodeStorageSpecForDescribeInstanceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceConfigurationForDescribeInstanceOutput
 */



public class InstanceConfigurationForDescribeInstanceOutput {
  @SerializedName("AdminUserName")
  private String adminUserName = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    @SerializedName("PrePaid")
    PREPAID("PrePaid"),
    @SerializedName("PostPaid")
    POSTPAID("PostPaid");

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

  @SerializedName("ColdNodeNumber")
  private Integer coldNodeNumber = null;

  @SerializedName("ColdNodeResourceSpec")
  private ColdNodeResourceSpecForDescribeInstanceOutput coldNodeResourceSpec = null;

  @SerializedName("ColdNodeStorageSpec")
  private ColdNodeStorageSpecForDescribeInstanceOutput coldNodeStorageSpec = null;

  @SerializedName("CoordinatorNodeNumber")
  private Integer coordinatorNodeNumber = null;

  @SerializedName("CoordinatorNodeResourceSpec")
  private CoordinatorNodeResourceSpecForDescribeInstanceOutput coordinatorNodeResourceSpec = null;

  @SerializedName("CoordinatorNodeStorageSpec")
  private CoordinatorNodeStorageSpecForDescribeInstanceOutput coordinatorNodeStorageSpec = null;

  @SerializedName("EnableHttps")
  private Boolean enableHttps = null;

  @SerializedName("EnablePureMaster")
  private Boolean enablePureMaster = null;

  @SerializedName("HotNodeNumber")
  private Integer hotNodeNumber = null;

  @SerializedName("HotNodeResourceSpec")
  private HotNodeResourceSpecForDescribeInstanceOutput hotNodeResourceSpec = null;

  @SerializedName("HotNodeStorageSpec")
  private HotNodeStorageSpecForDescribeInstanceOutput hotNodeStorageSpec = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("KibanaNodeNumber")
  private Integer kibanaNodeNumber = null;

  @SerializedName("KibanaNodeResourceSpec")
  private KibanaNodeResourceSpecForDescribeInstanceOutput kibanaNodeResourceSpec = null;

  @SerializedName("MasterNodeNumber")
  private Integer masterNodeNumber = null;

  @SerializedName("MasterNodeResourceSpec")
  private MasterNodeResourceSpecForDescribeInstanceOutput masterNodeResourceSpec = null;

  @SerializedName("MasterNodeStorageSpec")
  private MasterNodeStorageSpecForDescribeInstanceOutput masterNodeStorageSpec = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("Subnet")
  private SubnetForDescribeInstanceOutput subnet = null;

  @SerializedName("VPC")
  private VPCForDescribeInstanceOutput VPC = null;

  /**
   * Gets or Sets version
   */
  @JsonAdapter(VersionEnum.Adapter.class)
  public enum VersionEnum {
    @SerializedName("V6_7")
    V6_7("V6_7"),
    @SerializedName("V7_10")
    V7_10("V7_10"),
    @SerializedName("V7_TLS")
    V7_TLS("V7_TLS"),
    @SerializedName("V7_BYTE")
    V7_BYTE("V7_BYTE"),
    @SerializedName("OPEN_SEARCH_2_9")
    OPEN_SEARCH_2_9("OPEN_SEARCH_2_9");

    private String value;

    VersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VersionEnum fromValue(String input) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Version")
  private VersionEnum version = null;

  @SerializedName("WarmNodeNumber")
  private Integer warmNodeNumber = null;

  @SerializedName("WarmNodeResourceSpec")
  private WarmNodeResourceSpecForDescribeInstanceOutput warmNodeResourceSpec = null;

  @SerializedName("WarmNodeStorageSpec")
  private WarmNodeStorageSpecForDescribeInstanceOutput warmNodeStorageSpec = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneNumber")
  private Integer zoneNumber = null;

  public InstanceConfigurationForDescribeInstanceOutput adminUserName(String adminUserName) {
    this.adminUserName = adminUserName;
    return this;
  }

   /**
   * Get adminUserName
   * @return adminUserName
  **/
  @Schema(description = "")
  public String getAdminUserName() {
    return adminUserName;
  }

  public void setAdminUserName(String adminUserName) {
    this.adminUserName = adminUserName;
  }

  public InstanceConfigurationForDescribeInstanceOutput chargeType(ChargeTypeEnum chargeType) {
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

  public InstanceConfigurationForDescribeInstanceOutput coldNodeNumber(Integer coldNodeNumber) {
    this.coldNodeNumber = coldNodeNumber;
    return this;
  }

   /**
   * Get coldNodeNumber
   * @return coldNodeNumber
  **/
  @Schema(description = "")
  public Integer getColdNodeNumber() {
    return coldNodeNumber;
  }

  public void setColdNodeNumber(Integer coldNodeNumber) {
    this.coldNodeNumber = coldNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput coldNodeResourceSpec(ColdNodeResourceSpecForDescribeInstanceOutput coldNodeResourceSpec) {
    this.coldNodeResourceSpec = coldNodeResourceSpec;
    return this;
  }

   /**
   * Get coldNodeResourceSpec
   * @return coldNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public ColdNodeResourceSpecForDescribeInstanceOutput getColdNodeResourceSpec() {
    return coldNodeResourceSpec;
  }

  public void setColdNodeResourceSpec(ColdNodeResourceSpecForDescribeInstanceOutput coldNodeResourceSpec) {
    this.coldNodeResourceSpec = coldNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput coldNodeStorageSpec(ColdNodeStorageSpecForDescribeInstanceOutput coldNodeStorageSpec) {
    this.coldNodeStorageSpec = coldNodeStorageSpec;
    return this;
  }

   /**
   * Get coldNodeStorageSpec
   * @return coldNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public ColdNodeStorageSpecForDescribeInstanceOutput getColdNodeStorageSpec() {
    return coldNodeStorageSpec;
  }

  public void setColdNodeStorageSpec(ColdNodeStorageSpecForDescribeInstanceOutput coldNodeStorageSpec) {
    this.coldNodeStorageSpec = coldNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput coordinatorNodeNumber(Integer coordinatorNodeNumber) {
    this.coordinatorNodeNumber = coordinatorNodeNumber;
    return this;
  }

   /**
   * Get coordinatorNodeNumber
   * @return coordinatorNodeNumber
  **/
  @Schema(description = "")
  public Integer getCoordinatorNodeNumber() {
    return coordinatorNodeNumber;
  }

  public void setCoordinatorNodeNumber(Integer coordinatorNodeNumber) {
    this.coordinatorNodeNumber = coordinatorNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput coordinatorNodeResourceSpec(CoordinatorNodeResourceSpecForDescribeInstanceOutput coordinatorNodeResourceSpec) {
    this.coordinatorNodeResourceSpec = coordinatorNodeResourceSpec;
    return this;
  }

   /**
   * Get coordinatorNodeResourceSpec
   * @return coordinatorNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public CoordinatorNodeResourceSpecForDescribeInstanceOutput getCoordinatorNodeResourceSpec() {
    return coordinatorNodeResourceSpec;
  }

  public void setCoordinatorNodeResourceSpec(CoordinatorNodeResourceSpecForDescribeInstanceOutput coordinatorNodeResourceSpec) {
    this.coordinatorNodeResourceSpec = coordinatorNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput coordinatorNodeStorageSpec(CoordinatorNodeStorageSpecForDescribeInstanceOutput coordinatorNodeStorageSpec) {
    this.coordinatorNodeStorageSpec = coordinatorNodeStorageSpec;
    return this;
  }

   /**
   * Get coordinatorNodeStorageSpec
   * @return coordinatorNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public CoordinatorNodeStorageSpecForDescribeInstanceOutput getCoordinatorNodeStorageSpec() {
    return coordinatorNodeStorageSpec;
  }

  public void setCoordinatorNodeStorageSpec(CoordinatorNodeStorageSpecForDescribeInstanceOutput coordinatorNodeStorageSpec) {
    this.coordinatorNodeStorageSpec = coordinatorNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput enableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
    return this;
  }

   /**
   * Get enableHttps
   * @return enableHttps
  **/
  @Schema(description = "")
  public Boolean isEnableHttps() {
    return enableHttps;
  }

  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  public InstanceConfigurationForDescribeInstanceOutput enablePureMaster(Boolean enablePureMaster) {
    this.enablePureMaster = enablePureMaster;
    return this;
  }

   /**
   * Get enablePureMaster
   * @return enablePureMaster
  **/
  @Schema(description = "")
  public Boolean isEnablePureMaster() {
    return enablePureMaster;
  }

  public void setEnablePureMaster(Boolean enablePureMaster) {
    this.enablePureMaster = enablePureMaster;
  }

  public InstanceConfigurationForDescribeInstanceOutput hotNodeNumber(Integer hotNodeNumber) {
    this.hotNodeNumber = hotNodeNumber;
    return this;
  }

   /**
   * Get hotNodeNumber
   * @return hotNodeNumber
  **/
  @Schema(description = "")
  public Integer getHotNodeNumber() {
    return hotNodeNumber;
  }

  public void setHotNodeNumber(Integer hotNodeNumber) {
    this.hotNodeNumber = hotNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput hotNodeResourceSpec(HotNodeResourceSpecForDescribeInstanceOutput hotNodeResourceSpec) {
    this.hotNodeResourceSpec = hotNodeResourceSpec;
    return this;
  }

   /**
   * Get hotNodeResourceSpec
   * @return hotNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public HotNodeResourceSpecForDescribeInstanceOutput getHotNodeResourceSpec() {
    return hotNodeResourceSpec;
  }

  public void setHotNodeResourceSpec(HotNodeResourceSpecForDescribeInstanceOutput hotNodeResourceSpec) {
    this.hotNodeResourceSpec = hotNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput hotNodeStorageSpec(HotNodeStorageSpecForDescribeInstanceOutput hotNodeStorageSpec) {
    this.hotNodeStorageSpec = hotNodeStorageSpec;
    return this;
  }

   /**
   * Get hotNodeStorageSpec
   * @return hotNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public HotNodeStorageSpecForDescribeInstanceOutput getHotNodeStorageSpec() {
    return hotNodeStorageSpec;
  }

  public void setHotNodeStorageSpec(HotNodeStorageSpecForDescribeInstanceOutput hotNodeStorageSpec) {
    this.hotNodeStorageSpec = hotNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput instanceName(String instanceName) {
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

  public InstanceConfigurationForDescribeInstanceOutput kibanaNodeNumber(Integer kibanaNodeNumber) {
    this.kibanaNodeNumber = kibanaNodeNumber;
    return this;
  }

   /**
   * Get kibanaNodeNumber
   * @return kibanaNodeNumber
  **/
  @Schema(description = "")
  public Integer getKibanaNodeNumber() {
    return kibanaNodeNumber;
  }

  public void setKibanaNodeNumber(Integer kibanaNodeNumber) {
    this.kibanaNodeNumber = kibanaNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput kibanaNodeResourceSpec(KibanaNodeResourceSpecForDescribeInstanceOutput kibanaNodeResourceSpec) {
    this.kibanaNodeResourceSpec = kibanaNodeResourceSpec;
    return this;
  }

   /**
   * Get kibanaNodeResourceSpec
   * @return kibanaNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public KibanaNodeResourceSpecForDescribeInstanceOutput getKibanaNodeResourceSpec() {
    return kibanaNodeResourceSpec;
  }

  public void setKibanaNodeResourceSpec(KibanaNodeResourceSpecForDescribeInstanceOutput kibanaNodeResourceSpec) {
    this.kibanaNodeResourceSpec = kibanaNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput masterNodeNumber(Integer masterNodeNumber) {
    this.masterNodeNumber = masterNodeNumber;
    return this;
  }

   /**
   * Get masterNodeNumber
   * @return masterNodeNumber
  **/
  @Schema(description = "")
  public Integer getMasterNodeNumber() {
    return masterNodeNumber;
  }

  public void setMasterNodeNumber(Integer masterNodeNumber) {
    this.masterNodeNumber = masterNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput masterNodeResourceSpec(MasterNodeResourceSpecForDescribeInstanceOutput masterNodeResourceSpec) {
    this.masterNodeResourceSpec = masterNodeResourceSpec;
    return this;
  }

   /**
   * Get masterNodeResourceSpec
   * @return masterNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public MasterNodeResourceSpecForDescribeInstanceOutput getMasterNodeResourceSpec() {
    return masterNodeResourceSpec;
  }

  public void setMasterNodeResourceSpec(MasterNodeResourceSpecForDescribeInstanceOutput masterNodeResourceSpec) {
    this.masterNodeResourceSpec = masterNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput masterNodeStorageSpec(MasterNodeStorageSpecForDescribeInstanceOutput masterNodeStorageSpec) {
    this.masterNodeStorageSpec = masterNodeStorageSpec;
    return this;
  }

   /**
   * Get masterNodeStorageSpec
   * @return masterNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public MasterNodeStorageSpecForDescribeInstanceOutput getMasterNodeStorageSpec() {
    return masterNodeStorageSpec;
  }

  public void setMasterNodeStorageSpec(MasterNodeStorageSpecForDescribeInstanceOutput masterNodeStorageSpec) {
    this.masterNodeStorageSpec = masterNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public InstanceConfigurationForDescribeInstanceOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public InstanceConfigurationForDescribeInstanceOutput subnet(SubnetForDescribeInstanceOutput subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * Get subnet
   * @return subnet
  **/
  @Valid
  @Schema(description = "")
  public SubnetForDescribeInstanceOutput getSubnet() {
    return subnet;
  }

  public void setSubnet(SubnetForDescribeInstanceOutput subnet) {
    this.subnet = subnet;
  }

  public InstanceConfigurationForDescribeInstanceOutput VPC(VPCForDescribeInstanceOutput VPC) {
    this.VPC = VPC;
    return this;
  }

   /**
   * Get VPC
   * @return VPC
  **/
  @Valid
  @Schema(description = "")
  public VPCForDescribeInstanceOutput getVPC() {
    return VPC;
  }

  public void setVPC(VPCForDescribeInstanceOutput VPC) {
    this.VPC = VPC;
  }

  public InstanceConfigurationForDescribeInstanceOutput version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public VersionEnum getVersion() {
    return version;
  }

  public void setVersion(VersionEnum version) {
    this.version = version;
  }

  public InstanceConfigurationForDescribeInstanceOutput warmNodeNumber(Integer warmNodeNumber) {
    this.warmNodeNumber = warmNodeNumber;
    return this;
  }

   /**
   * Get warmNodeNumber
   * @return warmNodeNumber
  **/
  @Schema(description = "")
  public Integer getWarmNodeNumber() {
    return warmNodeNumber;
  }

  public void setWarmNodeNumber(Integer warmNodeNumber) {
    this.warmNodeNumber = warmNodeNumber;
  }

  public InstanceConfigurationForDescribeInstanceOutput warmNodeResourceSpec(WarmNodeResourceSpecForDescribeInstanceOutput warmNodeResourceSpec) {
    this.warmNodeResourceSpec = warmNodeResourceSpec;
    return this;
  }

   /**
   * Get warmNodeResourceSpec
   * @return warmNodeResourceSpec
  **/
  @Valid
  @Schema(description = "")
  public WarmNodeResourceSpecForDescribeInstanceOutput getWarmNodeResourceSpec() {
    return warmNodeResourceSpec;
  }

  public void setWarmNodeResourceSpec(WarmNodeResourceSpecForDescribeInstanceOutput warmNodeResourceSpec) {
    this.warmNodeResourceSpec = warmNodeResourceSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput warmNodeStorageSpec(WarmNodeStorageSpecForDescribeInstanceOutput warmNodeStorageSpec) {
    this.warmNodeStorageSpec = warmNodeStorageSpec;
    return this;
  }

   /**
   * Get warmNodeStorageSpec
   * @return warmNodeStorageSpec
  **/
  @Valid
  @Schema(description = "")
  public WarmNodeStorageSpecForDescribeInstanceOutput getWarmNodeStorageSpec() {
    return warmNodeStorageSpec;
  }

  public void setWarmNodeStorageSpec(WarmNodeStorageSpecForDescribeInstanceOutput warmNodeStorageSpec) {
    this.warmNodeStorageSpec = warmNodeStorageSpec;
  }

  public InstanceConfigurationForDescribeInstanceOutput zoneId(String zoneId) {
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

  public InstanceConfigurationForDescribeInstanceOutput zoneNumber(Integer zoneNumber) {
    this.zoneNumber = zoneNumber;
    return this;
  }

   /**
   * Get zoneNumber
   * @return zoneNumber
  **/
  @Schema(description = "")
  public Integer getZoneNumber() {
    return zoneNumber;
  }

  public void setZoneNumber(Integer zoneNumber) {
    this.zoneNumber = zoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationForDescribeInstanceOutput instanceConfigurationForDescribeInstanceOutput = (InstanceConfigurationForDescribeInstanceOutput) o;
    return Objects.equals(this.adminUserName, instanceConfigurationForDescribeInstanceOutput.adminUserName) &&
        Objects.equals(this.chargeType, instanceConfigurationForDescribeInstanceOutput.chargeType) &&
        Objects.equals(this.coldNodeNumber, instanceConfigurationForDescribeInstanceOutput.coldNodeNumber) &&
        Objects.equals(this.coldNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.coldNodeResourceSpec) &&
        Objects.equals(this.coldNodeStorageSpec, instanceConfigurationForDescribeInstanceOutput.coldNodeStorageSpec) &&
        Objects.equals(this.coordinatorNodeNumber, instanceConfigurationForDescribeInstanceOutput.coordinatorNodeNumber) &&
        Objects.equals(this.coordinatorNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.coordinatorNodeResourceSpec) &&
        Objects.equals(this.coordinatorNodeStorageSpec, instanceConfigurationForDescribeInstanceOutput.coordinatorNodeStorageSpec) &&
        Objects.equals(this.enableHttps, instanceConfigurationForDescribeInstanceOutput.enableHttps) &&
        Objects.equals(this.enablePureMaster, instanceConfigurationForDescribeInstanceOutput.enablePureMaster) &&
        Objects.equals(this.hotNodeNumber, instanceConfigurationForDescribeInstanceOutput.hotNodeNumber) &&
        Objects.equals(this.hotNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.hotNodeResourceSpec) &&
        Objects.equals(this.hotNodeStorageSpec, instanceConfigurationForDescribeInstanceOutput.hotNodeStorageSpec) &&
        Objects.equals(this.instanceName, instanceConfigurationForDescribeInstanceOutput.instanceName) &&
        Objects.equals(this.kibanaNodeNumber, instanceConfigurationForDescribeInstanceOutput.kibanaNodeNumber) &&
        Objects.equals(this.kibanaNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.kibanaNodeResourceSpec) &&
        Objects.equals(this.masterNodeNumber, instanceConfigurationForDescribeInstanceOutput.masterNodeNumber) &&
        Objects.equals(this.masterNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.masterNodeResourceSpec) &&
        Objects.equals(this.masterNodeStorageSpec, instanceConfigurationForDescribeInstanceOutput.masterNodeStorageSpec) &&
        Objects.equals(this.projectName, instanceConfigurationForDescribeInstanceOutput.projectName) &&
        Objects.equals(this.regionId, instanceConfigurationForDescribeInstanceOutput.regionId) &&
        Objects.equals(this.subnet, instanceConfigurationForDescribeInstanceOutput.subnet) &&
        Objects.equals(this.VPC, instanceConfigurationForDescribeInstanceOutput.VPC) &&
        Objects.equals(this.version, instanceConfigurationForDescribeInstanceOutput.version) &&
        Objects.equals(this.warmNodeNumber, instanceConfigurationForDescribeInstanceOutput.warmNodeNumber) &&
        Objects.equals(this.warmNodeResourceSpec, instanceConfigurationForDescribeInstanceOutput.warmNodeResourceSpec) &&
        Objects.equals(this.warmNodeStorageSpec, instanceConfigurationForDescribeInstanceOutput.warmNodeStorageSpec) &&
        Objects.equals(this.zoneId, instanceConfigurationForDescribeInstanceOutput.zoneId) &&
        Objects.equals(this.zoneNumber, instanceConfigurationForDescribeInstanceOutput.zoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminUserName, chargeType, coldNodeNumber, coldNodeResourceSpec, coldNodeStorageSpec, coordinatorNodeNumber, coordinatorNodeResourceSpec, coordinatorNodeStorageSpec, enableHttps, enablePureMaster, hotNodeNumber, hotNodeResourceSpec, hotNodeStorageSpec, instanceName, kibanaNodeNumber, kibanaNodeResourceSpec, masterNodeNumber, masterNodeResourceSpec, masterNodeStorageSpec, projectName, regionId, subnet, VPC, version, warmNodeNumber, warmNodeResourceSpec, warmNodeStorageSpec, zoneId, zoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationForDescribeInstanceOutput {\n");
    
    sb.append("    adminUserName: ").append(toIndentedString(adminUserName)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    coldNodeNumber: ").append(toIndentedString(coldNodeNumber)).append("\n");
    sb.append("    coldNodeResourceSpec: ").append(toIndentedString(coldNodeResourceSpec)).append("\n");
    sb.append("    coldNodeStorageSpec: ").append(toIndentedString(coldNodeStorageSpec)).append("\n");
    sb.append("    coordinatorNodeNumber: ").append(toIndentedString(coordinatorNodeNumber)).append("\n");
    sb.append("    coordinatorNodeResourceSpec: ").append(toIndentedString(coordinatorNodeResourceSpec)).append("\n");
    sb.append("    coordinatorNodeStorageSpec: ").append(toIndentedString(coordinatorNodeStorageSpec)).append("\n");
    sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
    sb.append("    enablePureMaster: ").append(toIndentedString(enablePureMaster)).append("\n");
    sb.append("    hotNodeNumber: ").append(toIndentedString(hotNodeNumber)).append("\n");
    sb.append("    hotNodeResourceSpec: ").append(toIndentedString(hotNodeResourceSpec)).append("\n");
    sb.append("    hotNodeStorageSpec: ").append(toIndentedString(hotNodeStorageSpec)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    kibanaNodeNumber: ").append(toIndentedString(kibanaNodeNumber)).append("\n");
    sb.append("    kibanaNodeResourceSpec: ").append(toIndentedString(kibanaNodeResourceSpec)).append("\n");
    sb.append("    masterNodeNumber: ").append(toIndentedString(masterNodeNumber)).append("\n");
    sb.append("    masterNodeResourceSpec: ").append(toIndentedString(masterNodeResourceSpec)).append("\n");
    sb.append("    masterNodeStorageSpec: ").append(toIndentedString(masterNodeStorageSpec)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    VPC: ").append(toIndentedString(VPC)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    warmNodeNumber: ").append(toIndentedString(warmNodeNumber)).append("\n");
    sb.append("    warmNodeResourceSpec: ").append(toIndentedString(warmNodeResourceSpec)).append("\n");
    sb.append("    warmNodeStorageSpec: ").append(toIndentedString(warmNodeStorageSpec)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneNumber: ").append(toIndentedString(zoneNumber)).append("\n");
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