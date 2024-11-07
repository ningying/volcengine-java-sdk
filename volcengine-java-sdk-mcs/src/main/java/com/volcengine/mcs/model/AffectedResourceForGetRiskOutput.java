/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

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
 * AffectedResourceForGetRiskOutput
 */



public class AffectedResourceForGetRiskOutput {
  @SerializedName("AssetCreatedTimeMilli")
  private Long assetCreatedTimeMilli = null;

  @SerializedName("BusinessTagIDs")
  private List<String> businessTagIDs = null;

  @SerializedName("CloudAccountName")
  private String cloudAccountName = null;

  @SerializedName("CloudAccountUID")
  private String cloudAccountUID = null;

  @SerializedName("CloudAssetID")
  private String cloudAssetID = null;

  @SerializedName("CloudAssetName")
  private String cloudAssetName = null;

  @SerializedName("CloudAssetProductType")
  private String cloudAssetProductType = null;

  /**
   * Gets or Sets cloudAssetType
   */
  @JsonAdapter(CloudAssetTypeEnum.Adapter.class)
  public enum CloudAssetTypeEnum {
    @SerializedName("ComputeVm")
    COMPUTEVM("ComputeVm"),
    @SerializedName("K8SCluster")
    K8SCLUSTER("K8SCluster"),
    @SerializedName("K8SPOD")
    K8SPOD("K8SPOD"),
    @SerializedName("K8SContainer")
    K8SCONTAINER("K8SContainer"),
    @SerializedName("K8SApp")
    K8SAPP("K8SApp"),
    @SerializedName("ComputeCR")
    COMPUTECR("ComputeCR"),
    @SerializedName("NetworkSecurityGroup")
    NETWORKSECURITYGROUP("NetworkSecurityGroup"),
    @SerializedName("NetworkSlb")
    NETWORKSLB("NetworkSlb"),
    @SerializedName("NetworkVpc")
    NETWORKVPC("NetworkVpc"),
    @SerializedName("NetworkSubnet")
    NETWORKSUBNET("NetworkSubnet"),
    @SerializedName("NetworkNatGateway")
    NETWORKNATGATEWAY("NetworkNatGateway"),
    @SerializedName("NetworkAPIGateway")
    NETWORKAPIGATEWAY("NetworkAPIGateway"),
    @SerializedName("NetworkEip")
    NETWORKEIP("NetworkEip"),
    @SerializedName("NetworkInterface")
    NETWORKINTERFACE("NetworkInterface"),
    @SerializedName("NetworkRouteTable")
    NETWORKROUTETABLE("NetworkRouteTable"),
    @SerializedName("NetworkIPSecVPN")
    NETWORKIPSECVPN("NetworkIPSecVPN"),
    @SerializedName("NetworkSSLVPN")
    NETWORKSSLVPN("NetworkSSLVPN"),
    @SerializedName("NetworkDirectConnectGateway")
    NETWORKDIRECTCONNECTGATEWAY("NetworkDirectConnectGateway"),
    @SerializedName("NetworkCEN")
    NETWORKCEN("NetworkCEN"),
    @SerializedName("StorageOssBucket")
    STORAGEOSSBUCKET("StorageOssBucket"),
    @SerializedName("StorageDB")
    STORAGEDB("StorageDB"),
    @SerializedName("StorageVolume")
    STORAGEVOLUME("StorageVolume"),
    @SerializedName("IdentityIamAccount")
    IDENTITYIAMACCOUNT("IdentityIamAccount"),
    @SerializedName("ComputeMSERegistryCenter")
    COMPUTEMSEREGISTRYCENTER("ComputeMSERegistryCenter"),
    @SerializedName("ComputeMSEGateway")
    COMPUTEMSEGATEWAY("ComputeMSEGateway"),
    @SerializedName("MQInstance")
    MQINSTANCE("MQInstance");

    private String value;

    CloudAssetTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CloudAssetTypeEnum fromValue(String input) {
      for (CloudAssetTypeEnum b : CloudAssetTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CloudAssetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloudAssetTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CloudAssetTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CloudAssetTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CloudAssetType")
  private CloudAssetTypeEnum cloudAssetType = null;

  @SerializedName("CloudVendor")
  private String cloudVendor = null;

  @SerializedName("RecordUUID")
  private String recordUUID = null;

  /**
   * Gets or Sets securitySituationTagIDs
   */
  @JsonAdapter(SecuritySituationTagIDsEnum.Adapter.class)
  public enum SecuritySituationTagIDsEnum {
    @SerializedName("ExistAlarmRisk")
    EXISTALARMRISK("ExistAlarmRisk"),
    @SerializedName("ExistVulnRisk")
    EXISTVULNRISK("ExistVulnRisk"),
    @SerializedName("ExistCSPMRisk")
    EXISTCSPMRISK("ExistCSPMRisk");

    private String value;

    SecuritySituationTagIDsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SecuritySituationTagIDsEnum fromValue(String input) {
      for (SecuritySituationTagIDsEnum b : SecuritySituationTagIDsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SecuritySituationTagIDsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecuritySituationTagIDsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SecuritySituationTagIDsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SecuritySituationTagIDsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SecuritySituationTagIDs")
  private List<SecuritySituationTagIDsEnum> securitySituationTagIDs = null;

  public AffectedResourceForGetRiskOutput assetCreatedTimeMilli(Long assetCreatedTimeMilli) {
    this.assetCreatedTimeMilli = assetCreatedTimeMilli;
    return this;
  }

   /**
   * Get assetCreatedTimeMilli
   * @return assetCreatedTimeMilli
  **/
  @Schema(description = "")
  public Long getAssetCreatedTimeMilli() {
    return assetCreatedTimeMilli;
  }

  public void setAssetCreatedTimeMilli(Long assetCreatedTimeMilli) {
    this.assetCreatedTimeMilli = assetCreatedTimeMilli;
  }

  public AffectedResourceForGetRiskOutput businessTagIDs(List<String> businessTagIDs) {
    this.businessTagIDs = businessTagIDs;
    return this;
  }

  public AffectedResourceForGetRiskOutput addBusinessTagIDsItem(String businessTagIDsItem) {
    if (this.businessTagIDs == null) {
      this.businessTagIDs = new ArrayList<String>();
    }
    this.businessTagIDs.add(businessTagIDsItem);
    return this;
  }

   /**
   * Get businessTagIDs
   * @return businessTagIDs
  **/
  @Schema(description = "")
  public List<String> getBusinessTagIDs() {
    return businessTagIDs;
  }

  public void setBusinessTagIDs(List<String> businessTagIDs) {
    this.businessTagIDs = businessTagIDs;
  }

  public AffectedResourceForGetRiskOutput cloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @Schema(description = "")
  public String getCloudAccountName() {
    return cloudAccountName;
  }

  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }

  public AffectedResourceForGetRiskOutput cloudAccountUID(String cloudAccountUID) {
    this.cloudAccountUID = cloudAccountUID;
    return this;
  }

   /**
   * Get cloudAccountUID
   * @return cloudAccountUID
  **/
  @Schema(description = "")
  public String getCloudAccountUID() {
    return cloudAccountUID;
  }

  public void setCloudAccountUID(String cloudAccountUID) {
    this.cloudAccountUID = cloudAccountUID;
  }

  public AffectedResourceForGetRiskOutput cloudAssetID(String cloudAssetID) {
    this.cloudAssetID = cloudAssetID;
    return this;
  }

   /**
   * Get cloudAssetID
   * @return cloudAssetID
  **/
  @Schema(description = "")
  public String getCloudAssetID() {
    return cloudAssetID;
  }

  public void setCloudAssetID(String cloudAssetID) {
    this.cloudAssetID = cloudAssetID;
  }

  public AffectedResourceForGetRiskOutput cloudAssetName(String cloudAssetName) {
    this.cloudAssetName = cloudAssetName;
    return this;
  }

   /**
   * Get cloudAssetName
   * @return cloudAssetName
  **/
  @Schema(description = "")
  public String getCloudAssetName() {
    return cloudAssetName;
  }

  public void setCloudAssetName(String cloudAssetName) {
    this.cloudAssetName = cloudAssetName;
  }

  public AffectedResourceForGetRiskOutput cloudAssetProductType(String cloudAssetProductType) {
    this.cloudAssetProductType = cloudAssetProductType;
    return this;
  }

   /**
   * Get cloudAssetProductType
   * @return cloudAssetProductType
  **/
  @Schema(description = "")
  public String getCloudAssetProductType() {
    return cloudAssetProductType;
  }

  public void setCloudAssetProductType(String cloudAssetProductType) {
    this.cloudAssetProductType = cloudAssetProductType;
  }

  public AffectedResourceForGetRiskOutput cloudAssetType(CloudAssetTypeEnum cloudAssetType) {
    this.cloudAssetType = cloudAssetType;
    return this;
  }

   /**
   * Get cloudAssetType
   * @return cloudAssetType
  **/
  @Schema(description = "")
  public CloudAssetTypeEnum getCloudAssetType() {
    return cloudAssetType;
  }

  public void setCloudAssetType(CloudAssetTypeEnum cloudAssetType) {
    this.cloudAssetType = cloudAssetType;
  }

  public AffectedResourceForGetRiskOutput cloudVendor(String cloudVendor) {
    this.cloudVendor = cloudVendor;
    return this;
  }

   /**
   * Get cloudVendor
   * @return cloudVendor
  **/
  @Schema(description = "")
  public String getCloudVendor() {
    return cloudVendor;
  }

  public void setCloudVendor(String cloudVendor) {
    this.cloudVendor = cloudVendor;
  }

  public AffectedResourceForGetRiskOutput recordUUID(String recordUUID) {
    this.recordUUID = recordUUID;
    return this;
  }

   /**
   * Get recordUUID
   * @return recordUUID
  **/
  @Schema(description = "")
  public String getRecordUUID() {
    return recordUUID;
  }

  public void setRecordUUID(String recordUUID) {
    this.recordUUID = recordUUID;
  }

  public AffectedResourceForGetRiskOutput securitySituationTagIDs(List<SecuritySituationTagIDsEnum> securitySituationTagIDs) {
    this.securitySituationTagIDs = securitySituationTagIDs;
    return this;
  }

  public AffectedResourceForGetRiskOutput addSecuritySituationTagIDsItem(SecuritySituationTagIDsEnum securitySituationTagIDsItem) {
    if (this.securitySituationTagIDs == null) {
      this.securitySituationTagIDs = new ArrayList<SecuritySituationTagIDsEnum>();
    }
    this.securitySituationTagIDs.add(securitySituationTagIDsItem);
    return this;
  }

   /**
   * Get securitySituationTagIDs
   * @return securitySituationTagIDs
  **/
  @Schema(description = "")
  public List<SecuritySituationTagIDsEnum> getSecuritySituationTagIDs() {
    return securitySituationTagIDs;
  }

  public void setSecuritySituationTagIDs(List<SecuritySituationTagIDsEnum> securitySituationTagIDs) {
    this.securitySituationTagIDs = securitySituationTagIDs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedResourceForGetRiskOutput affectedResourceForGetRiskOutput = (AffectedResourceForGetRiskOutput) o;
    return Objects.equals(this.assetCreatedTimeMilli, affectedResourceForGetRiskOutput.assetCreatedTimeMilli) &&
        Objects.equals(this.businessTagIDs, affectedResourceForGetRiskOutput.businessTagIDs) &&
        Objects.equals(this.cloudAccountName, affectedResourceForGetRiskOutput.cloudAccountName) &&
        Objects.equals(this.cloudAccountUID, affectedResourceForGetRiskOutput.cloudAccountUID) &&
        Objects.equals(this.cloudAssetID, affectedResourceForGetRiskOutput.cloudAssetID) &&
        Objects.equals(this.cloudAssetName, affectedResourceForGetRiskOutput.cloudAssetName) &&
        Objects.equals(this.cloudAssetProductType, affectedResourceForGetRiskOutput.cloudAssetProductType) &&
        Objects.equals(this.cloudAssetType, affectedResourceForGetRiskOutput.cloudAssetType) &&
        Objects.equals(this.cloudVendor, affectedResourceForGetRiskOutput.cloudVendor) &&
        Objects.equals(this.recordUUID, affectedResourceForGetRiskOutput.recordUUID) &&
        Objects.equals(this.securitySituationTagIDs, affectedResourceForGetRiskOutput.securitySituationTagIDs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetCreatedTimeMilli, businessTagIDs, cloudAccountName, cloudAccountUID, cloudAssetID, cloudAssetName, cloudAssetProductType, cloudAssetType, cloudVendor, recordUUID, securitySituationTagIDs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedResourceForGetRiskOutput {\n");
    
    sb.append("    assetCreatedTimeMilli: ").append(toIndentedString(assetCreatedTimeMilli)).append("\n");
    sb.append("    businessTagIDs: ").append(toIndentedString(businessTagIDs)).append("\n");
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    cloudAccountUID: ").append(toIndentedString(cloudAccountUID)).append("\n");
    sb.append("    cloudAssetID: ").append(toIndentedString(cloudAssetID)).append("\n");
    sb.append("    cloudAssetName: ").append(toIndentedString(cloudAssetName)).append("\n");
    sb.append("    cloudAssetProductType: ").append(toIndentedString(cloudAssetProductType)).append("\n");
    sb.append("    cloudAssetType: ").append(toIndentedString(cloudAssetType)).append("\n");
    sb.append("    cloudVendor: ").append(toIndentedString(cloudVendor)).append("\n");
    sb.append("    recordUUID: ").append(toIndentedString(recordUUID)).append("\n");
    sb.append("    securitySituationTagIDs: ").append(toIndentedString(securitySituationTagIDs)).append("\n");
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
