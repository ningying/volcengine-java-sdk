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
import com.volcengine.mcs.model.AdditionalInfoListForGetApiV1AlarmDetailOutput;
import com.volcengine.mcs.model.AffectedAssetForGetApiV1AlarmDetailOutput;
import com.volcengine.mcs.model.AlarmSourceProductForGetApiV1AlarmDetailOutput;
import com.volcengine.mcs.model.AlarmVendorAlertMetaForGetApiV1AlarmDetailOutput;
import com.volcengine.mcs.model.CloudAccountForGetApiV1AlarmDetailOutput;
import com.volcengine.mcs.model.VariationInfoForGetApiV1AlarmDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DetailForGetApiV1AlarmDetailOutput
 */



public class DetailForGetApiV1AlarmDetailOutput {
  @SerializedName("additional_info_list")
  private List<AdditionalInfoListForGetApiV1AlarmDetailOutput> additionalInfoList = null;

  @SerializedName("affected_asset")
  private AffectedAssetForGetApiV1AlarmDetailOutput affectedAsset = null;

  /**
   * Gets or Sets alarmAlertType
   */
  @JsonAdapter(AlarmAlertTypeEnum.Adapter.class)
  public enum AlarmAlertTypeEnum {
    @SerializedName("initial_access")
    INITIAL_ACCESS("initial_access"),
    @SerializedName("execution")
    EXECUTION("execution"),
    @SerializedName("persistence")
    PERSISTENCE("persistence"),
    @SerializedName("privilege_escalation")
    PRIVILEGE_ESCALATION("privilege_escalation"),
    @SerializedName("credential_access")
    CREDENTIAL_ACCESS("credential_access"),
    @SerializedName("discovery")
    DISCOVERY("discovery"),
    @SerializedName("collection")
    COLLECTION("collection"),
    @SerializedName("lateral_movement")
    LATERAL_MOVEMENT("lateral_movement"),
    @SerializedName("command_control")
    COMMAND_CONTROL("command_control"),
    @SerializedName("exfiltration")
    EXFILTRATION("exfiltration"),
    @SerializedName("impact")
    IMPACT("impact"),
    @SerializedName("brute_force")
    BRUTE_FORCE("brute_force"),
    @SerializedName("malware")
    MALWARE("malware"),
    @SerializedName("abnormal_login")
    ABNORMAL_LOGIN("abnormal_login"),
    @SerializedName("process_abnormal_activity")
    PROCESS_ABNORMAL_ACTIVITY("process_abnormal_activity"),
    @SerializedName("network_abnormal_activity")
    NETWORK_ABNORMAL_ACTIVITY("network_abnormal_activity"),
    @SerializedName("vulnerability_exploitation")
    VULNERABILITY_EXPLOITATION("vulnerability_exploitation"),
    @SerializedName("others")
    OTHERS("others"),
    @SerializedName("dos")
    DOS("dos"),
    @SerializedName("kill_chain")
    KILL_CHAIN("kill_chain"),
    @SerializedName("evasion")
    EVASION("evasion"),
    @SerializedName("precision_defense")
    PRECISION_DEFENSE("precision_defense"),
    @SerializedName("blacklist_banning")
    BLACKLIST_BANNING("blacklist_banning"),
    @SerializedName("api_abnormal")
    API_ABNORMAL("api_abnormal"),
    @SerializedName("bot")
    BOT("bot"),
    @SerializedName("cc_attack")
    CC_ATTACK("cc_attack");

    private String value;

    AlarmAlertTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlarmAlertTypeEnum fromValue(String input) {
      for (AlarmAlertTypeEnum b : AlarmAlertTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlarmAlertTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlarmAlertTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AlarmAlertTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AlarmAlertTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("alarm_alert_type")
  private AlarmAlertTypeEnum alarmAlertType = null;

  @SerializedName("alarm_created_time_milli")
  private Long alarmCreatedTimeMilli = null;

  @SerializedName("alarm_desc")
  private String alarmDesc = null;

  @SerializedName("alarm_id")
  private String alarmId = null;

  @SerializedName("alarm_raw_data")
  private String alarmRawData = null;

  /**
   * Gets or Sets alarmRiskLevel
   */
  @JsonAdapter(AlarmRiskLevelEnum.Adapter.class)
  public enum AlarmRiskLevelEnum {
    @SerializedName("050-security")
    _050_SECURITY("050-security"),
    @SerializedName("100-low")
    _100_LOW("100-low"),
    @SerializedName("300-mid")
    _300_MID("300-mid"),
    @SerializedName("500-high")
    _500_HIGH("500-high"),
    @SerializedName("700-critical")
    _700_CRITICAL("700-critical");

    private String value;

    AlarmRiskLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlarmRiskLevelEnum fromValue(String input) {
      for (AlarmRiskLevelEnum b : AlarmRiskLevelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlarmRiskLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlarmRiskLevelEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AlarmRiskLevelEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AlarmRiskLevelEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("alarm_risk_level")
  private AlarmRiskLevelEnum alarmRiskLevel = null;

  /**
   * Gets or Sets alarmRiskStatus
   */
  @JsonAdapter(AlarmRiskStatusEnum.Adapter.class)
  public enum AlarmRiskStatusEnum {
    @SerializedName("handled")
    HANDLED("handled"),
    @SerializedName("unhandled")
    UNHANDLED("unhandled"),
    @SerializedName("partial_handled")
    PARTIAL_HANDLED("partial_handled"),
    @SerializedName("whitened")
    WHITENED("whitened"),
    @SerializedName("ignored")
    IGNORED("ignored"),
    @SerializedName("inapplicable")
    INAPPLICABLE("inapplicable"),
    @SerializedName("suppressed")
    SUPPRESSED("suppressed");

    private String value;

    AlarmRiskStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlarmRiskStatusEnum fromValue(String input) {
      for (AlarmRiskStatusEnum b : AlarmRiskStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlarmRiskStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlarmRiskStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AlarmRiskStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AlarmRiskStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("alarm_risk_status")
  private AlarmRiskStatusEnum alarmRiskStatus = null;

  @SerializedName("alarm_source_product")
  private AlarmSourceProductForGetApiV1AlarmDetailOutput alarmSourceProduct = null;

  @SerializedName("alarm_title")
  private String alarmTitle = null;

  @SerializedName("alarm_updated_time_milli")
  private Long alarmUpdatedTimeMilli = null;

  @SerializedName("alarm_vendor_alert_meta")
  private AlarmVendorAlertMetaForGetApiV1AlarmDetailOutput alarmVendorAlertMeta = null;

  @SerializedName("cloud_account")
  private CloudAccountForGetApiV1AlarmDetailOutput cloudAccount = null;

  @SerializedName("llm_analysis_result")
  private String llmAnalysisResult = null;

  @SerializedName("variation_info")
  private VariationInfoForGetApiV1AlarmDetailOutput variationInfo = null;

  public DetailForGetApiV1AlarmDetailOutput additionalInfoList(List<AdditionalInfoListForGetApiV1AlarmDetailOutput> additionalInfoList) {
    this.additionalInfoList = additionalInfoList;
    return this;
  }

  public DetailForGetApiV1AlarmDetailOutput addAdditionalInfoListItem(AdditionalInfoListForGetApiV1AlarmDetailOutput additionalInfoListItem) {
    if (this.additionalInfoList == null) {
      this.additionalInfoList = new ArrayList<AdditionalInfoListForGetApiV1AlarmDetailOutput>();
    }
    this.additionalInfoList.add(additionalInfoListItem);
    return this;
  }

   /**
   * Get additionalInfoList
   * @return additionalInfoList
  **/
  @Valid
  @Schema(description = "")
  public List<AdditionalInfoListForGetApiV1AlarmDetailOutput> getAdditionalInfoList() {
    return additionalInfoList;
  }

  public void setAdditionalInfoList(List<AdditionalInfoListForGetApiV1AlarmDetailOutput> additionalInfoList) {
    this.additionalInfoList = additionalInfoList;
  }

  public DetailForGetApiV1AlarmDetailOutput affectedAsset(AffectedAssetForGetApiV1AlarmDetailOutput affectedAsset) {
    this.affectedAsset = affectedAsset;
    return this;
  }

   /**
   * Get affectedAsset
   * @return affectedAsset
  **/
  @Valid
  @Schema(description = "")
  public AffectedAssetForGetApiV1AlarmDetailOutput getAffectedAsset() {
    return affectedAsset;
  }

  public void setAffectedAsset(AffectedAssetForGetApiV1AlarmDetailOutput affectedAsset) {
    this.affectedAsset = affectedAsset;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmAlertType(AlarmAlertTypeEnum alarmAlertType) {
    this.alarmAlertType = alarmAlertType;
    return this;
  }

   /**
   * Get alarmAlertType
   * @return alarmAlertType
  **/
  @Schema(description = "")
  public AlarmAlertTypeEnum getAlarmAlertType() {
    return alarmAlertType;
  }

  public void setAlarmAlertType(AlarmAlertTypeEnum alarmAlertType) {
    this.alarmAlertType = alarmAlertType;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmCreatedTimeMilli(Long alarmCreatedTimeMilli) {
    this.alarmCreatedTimeMilli = alarmCreatedTimeMilli;
    return this;
  }

   /**
   * Get alarmCreatedTimeMilli
   * @return alarmCreatedTimeMilli
  **/
  @Schema(description = "")
  public Long getAlarmCreatedTimeMilli() {
    return alarmCreatedTimeMilli;
  }

  public void setAlarmCreatedTimeMilli(Long alarmCreatedTimeMilli) {
    this.alarmCreatedTimeMilli = alarmCreatedTimeMilli;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmDesc(String alarmDesc) {
    this.alarmDesc = alarmDesc;
    return this;
  }

   /**
   * Get alarmDesc
   * @return alarmDesc
  **/
  @Schema(description = "")
  public String getAlarmDesc() {
    return alarmDesc;
  }

  public void setAlarmDesc(String alarmDesc) {
    this.alarmDesc = alarmDesc;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmId(String alarmId) {
    this.alarmId = alarmId;
    return this;
  }

   /**
   * Get alarmId
   * @return alarmId
  **/
  @Schema(description = "")
  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmRawData(String alarmRawData) {
    this.alarmRawData = alarmRawData;
    return this;
  }

   /**
   * Get alarmRawData
   * @return alarmRawData
  **/
  @Schema(description = "")
  public String getAlarmRawData() {
    return alarmRawData;
  }

  public void setAlarmRawData(String alarmRawData) {
    this.alarmRawData = alarmRawData;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmRiskLevel(AlarmRiskLevelEnum alarmRiskLevel) {
    this.alarmRiskLevel = alarmRiskLevel;
    return this;
  }

   /**
   * Get alarmRiskLevel
   * @return alarmRiskLevel
  **/
  @Schema(description = "")
  public AlarmRiskLevelEnum getAlarmRiskLevel() {
    return alarmRiskLevel;
  }

  public void setAlarmRiskLevel(AlarmRiskLevelEnum alarmRiskLevel) {
    this.alarmRiskLevel = alarmRiskLevel;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmRiskStatus(AlarmRiskStatusEnum alarmRiskStatus) {
    this.alarmRiskStatus = alarmRiskStatus;
    return this;
  }

   /**
   * Get alarmRiskStatus
   * @return alarmRiskStatus
  **/
  @Schema(description = "")
  public AlarmRiskStatusEnum getAlarmRiskStatus() {
    return alarmRiskStatus;
  }

  public void setAlarmRiskStatus(AlarmRiskStatusEnum alarmRiskStatus) {
    this.alarmRiskStatus = alarmRiskStatus;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmSourceProduct(AlarmSourceProductForGetApiV1AlarmDetailOutput alarmSourceProduct) {
    this.alarmSourceProduct = alarmSourceProduct;
    return this;
  }

   /**
   * Get alarmSourceProduct
   * @return alarmSourceProduct
  **/
  @Valid
  @Schema(description = "")
  public AlarmSourceProductForGetApiV1AlarmDetailOutput getAlarmSourceProduct() {
    return alarmSourceProduct;
  }

  public void setAlarmSourceProduct(AlarmSourceProductForGetApiV1AlarmDetailOutput alarmSourceProduct) {
    this.alarmSourceProduct = alarmSourceProduct;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmTitle(String alarmTitle) {
    this.alarmTitle = alarmTitle;
    return this;
  }

   /**
   * Get alarmTitle
   * @return alarmTitle
  **/
  @Schema(description = "")
  public String getAlarmTitle() {
    return alarmTitle;
  }

  public void setAlarmTitle(String alarmTitle) {
    this.alarmTitle = alarmTitle;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmUpdatedTimeMilli(Long alarmUpdatedTimeMilli) {
    this.alarmUpdatedTimeMilli = alarmUpdatedTimeMilli;
    return this;
  }

   /**
   * Get alarmUpdatedTimeMilli
   * @return alarmUpdatedTimeMilli
  **/
  @Schema(description = "")
  public Long getAlarmUpdatedTimeMilli() {
    return alarmUpdatedTimeMilli;
  }

  public void setAlarmUpdatedTimeMilli(Long alarmUpdatedTimeMilli) {
    this.alarmUpdatedTimeMilli = alarmUpdatedTimeMilli;
  }

  public DetailForGetApiV1AlarmDetailOutput alarmVendorAlertMeta(AlarmVendorAlertMetaForGetApiV1AlarmDetailOutput alarmVendorAlertMeta) {
    this.alarmVendorAlertMeta = alarmVendorAlertMeta;
    return this;
  }

   /**
   * Get alarmVendorAlertMeta
   * @return alarmVendorAlertMeta
  **/
  @Valid
  @Schema(description = "")
  public AlarmVendorAlertMetaForGetApiV1AlarmDetailOutput getAlarmVendorAlertMeta() {
    return alarmVendorAlertMeta;
  }

  public void setAlarmVendorAlertMeta(AlarmVendorAlertMetaForGetApiV1AlarmDetailOutput alarmVendorAlertMeta) {
    this.alarmVendorAlertMeta = alarmVendorAlertMeta;
  }

  public DetailForGetApiV1AlarmDetailOutput cloudAccount(CloudAccountForGetApiV1AlarmDetailOutput cloudAccount) {
    this.cloudAccount = cloudAccount;
    return this;
  }

   /**
   * Get cloudAccount
   * @return cloudAccount
  **/
  @Valid
  @Schema(description = "")
  public CloudAccountForGetApiV1AlarmDetailOutput getCloudAccount() {
    return cloudAccount;
  }

  public void setCloudAccount(CloudAccountForGetApiV1AlarmDetailOutput cloudAccount) {
    this.cloudAccount = cloudAccount;
  }

  public DetailForGetApiV1AlarmDetailOutput llmAnalysisResult(String llmAnalysisResult) {
    this.llmAnalysisResult = llmAnalysisResult;
    return this;
  }

   /**
   * Get llmAnalysisResult
   * @return llmAnalysisResult
  **/
  @Schema(description = "")
  public String getLlmAnalysisResult() {
    return llmAnalysisResult;
  }

  public void setLlmAnalysisResult(String llmAnalysisResult) {
    this.llmAnalysisResult = llmAnalysisResult;
  }

  public DetailForGetApiV1AlarmDetailOutput variationInfo(VariationInfoForGetApiV1AlarmDetailOutput variationInfo) {
    this.variationInfo = variationInfo;
    return this;
  }

   /**
   * Get variationInfo
   * @return variationInfo
  **/
  @Valid
  @Schema(description = "")
  public VariationInfoForGetApiV1AlarmDetailOutput getVariationInfo() {
    return variationInfo;
  }

  public void setVariationInfo(VariationInfoForGetApiV1AlarmDetailOutput variationInfo) {
    this.variationInfo = variationInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailForGetApiV1AlarmDetailOutput detailForGetApiV1AlarmDetailOutput = (DetailForGetApiV1AlarmDetailOutput) o;
    return Objects.equals(this.additionalInfoList, detailForGetApiV1AlarmDetailOutput.additionalInfoList) &&
        Objects.equals(this.affectedAsset, detailForGetApiV1AlarmDetailOutput.affectedAsset) &&
        Objects.equals(this.alarmAlertType, detailForGetApiV1AlarmDetailOutput.alarmAlertType) &&
        Objects.equals(this.alarmCreatedTimeMilli, detailForGetApiV1AlarmDetailOutput.alarmCreatedTimeMilli) &&
        Objects.equals(this.alarmDesc, detailForGetApiV1AlarmDetailOutput.alarmDesc) &&
        Objects.equals(this.alarmId, detailForGetApiV1AlarmDetailOutput.alarmId) &&
        Objects.equals(this.alarmRawData, detailForGetApiV1AlarmDetailOutput.alarmRawData) &&
        Objects.equals(this.alarmRiskLevel, detailForGetApiV1AlarmDetailOutput.alarmRiskLevel) &&
        Objects.equals(this.alarmRiskStatus, detailForGetApiV1AlarmDetailOutput.alarmRiskStatus) &&
        Objects.equals(this.alarmSourceProduct, detailForGetApiV1AlarmDetailOutput.alarmSourceProduct) &&
        Objects.equals(this.alarmTitle, detailForGetApiV1AlarmDetailOutput.alarmTitle) &&
        Objects.equals(this.alarmUpdatedTimeMilli, detailForGetApiV1AlarmDetailOutput.alarmUpdatedTimeMilli) &&
        Objects.equals(this.alarmVendorAlertMeta, detailForGetApiV1AlarmDetailOutput.alarmVendorAlertMeta) &&
        Objects.equals(this.cloudAccount, detailForGetApiV1AlarmDetailOutput.cloudAccount) &&
        Objects.equals(this.llmAnalysisResult, detailForGetApiV1AlarmDetailOutput.llmAnalysisResult) &&
        Objects.equals(this.variationInfo, detailForGetApiV1AlarmDetailOutput.variationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfoList, affectedAsset, alarmAlertType, alarmCreatedTimeMilli, alarmDesc, alarmId, alarmRawData, alarmRiskLevel, alarmRiskStatus, alarmSourceProduct, alarmTitle, alarmUpdatedTimeMilli, alarmVendorAlertMeta, cloudAccount, llmAnalysisResult, variationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailForGetApiV1AlarmDetailOutput {\n");
    
    sb.append("    additionalInfoList: ").append(toIndentedString(additionalInfoList)).append("\n");
    sb.append("    affectedAsset: ").append(toIndentedString(affectedAsset)).append("\n");
    sb.append("    alarmAlertType: ").append(toIndentedString(alarmAlertType)).append("\n");
    sb.append("    alarmCreatedTimeMilli: ").append(toIndentedString(alarmCreatedTimeMilli)).append("\n");
    sb.append("    alarmDesc: ").append(toIndentedString(alarmDesc)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmRawData: ").append(toIndentedString(alarmRawData)).append("\n");
    sb.append("    alarmRiskLevel: ").append(toIndentedString(alarmRiskLevel)).append("\n");
    sb.append("    alarmRiskStatus: ").append(toIndentedString(alarmRiskStatus)).append("\n");
    sb.append("    alarmSourceProduct: ").append(toIndentedString(alarmSourceProduct)).append("\n");
    sb.append("    alarmTitle: ").append(toIndentedString(alarmTitle)).append("\n");
    sb.append("    alarmUpdatedTimeMilli: ").append(toIndentedString(alarmUpdatedTimeMilli)).append("\n");
    sb.append("    alarmVendorAlertMeta: ").append(toIndentedString(alarmVendorAlertMeta)).append("\n");
    sb.append("    cloudAccount: ").append(toIndentedString(cloudAccount)).append("\n");
    sb.append("    llmAnalysisResult: ").append(toIndentedString(llmAnalysisResult)).append("\n");
    sb.append("    variationInfo: ").append(toIndentedString(variationInfo)).append("\n");
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
