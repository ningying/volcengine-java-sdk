/*
 * kms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kms.model;

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
 * KeyForCreateKeyOutput
 */



public class KeyForCreateKeyOutput {
  @SerializedName("CreationDate")
  private Long creationDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EncryptionAlgorithms")
  private String encryptionAlgorithms = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("KeyMaterialExpireTime")
  private String keyMaterialExpireTime = null;

  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeySpec")
  private String keySpec = null;

  @SerializedName("KeyState")
  private String keyState = null;

  @SerializedName("KeyUsage")
  private String keyUsage = null;

  @SerializedName("LastRotationTime")
  private String lastRotationTime = null;

  @SerializedName("Origin")
  private String origin = null;

  @SerializedName("ProtectionLevel")
  private String protectionLevel = null;

  @SerializedName("RotationState")
  private String rotationState = null;

  @SerializedName("ScheduleDeleteTime")
  private String scheduleDeleteTime = null;

  @SerializedName("ScheduleRotationTime")
  private String scheduleRotationTime = null;

  @SerializedName("Trn")
  private String trn = null;

  @SerializedName("UpdateDate")
  private Long updateDate = null;

  public KeyForCreateKeyOutput creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public KeyForCreateKeyOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KeyForCreateKeyOutput encryptionAlgorithms(String encryptionAlgorithms) {
    this.encryptionAlgorithms = encryptionAlgorithms;
    return this;
  }

   /**
   * Get encryptionAlgorithms
   * @return encryptionAlgorithms
  **/
  @Schema(description = "")
  public String getEncryptionAlgorithms() {
    return encryptionAlgorithms;
  }

  public void setEncryptionAlgorithms(String encryptionAlgorithms) {
    this.encryptionAlgorithms = encryptionAlgorithms;
  }

  public KeyForCreateKeyOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public KeyForCreateKeyOutput keyMaterialExpireTime(String keyMaterialExpireTime) {
    this.keyMaterialExpireTime = keyMaterialExpireTime;
    return this;
  }

   /**
   * Get keyMaterialExpireTime
   * @return keyMaterialExpireTime
  **/
  @Schema(description = "")
  public String getKeyMaterialExpireTime() {
    return keyMaterialExpireTime;
  }

  public void setKeyMaterialExpireTime(String keyMaterialExpireTime) {
    this.keyMaterialExpireTime = keyMaterialExpireTime;
  }

  public KeyForCreateKeyOutput keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Get keyName
   * @return keyName
  **/
  @Schema(description = "")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public KeyForCreateKeyOutput keySpec(String keySpec) {
    this.keySpec = keySpec;
    return this;
  }

   /**
   * Get keySpec
   * @return keySpec
  **/
  @Schema(description = "")
  public String getKeySpec() {
    return keySpec;
  }

  public void setKeySpec(String keySpec) {
    this.keySpec = keySpec;
  }

  public KeyForCreateKeyOutput keyState(String keyState) {
    this.keyState = keyState;
    return this;
  }

   /**
   * Get keyState
   * @return keyState
  **/
  @Schema(description = "")
  public String getKeyState() {
    return keyState;
  }

  public void setKeyState(String keyState) {
    this.keyState = keyState;
  }

  public KeyForCreateKeyOutput keyUsage(String keyUsage) {
    this.keyUsage = keyUsage;
    return this;
  }

   /**
   * Get keyUsage
   * @return keyUsage
  **/
  @Schema(description = "")
  public String getKeyUsage() {
    return keyUsage;
  }

  public void setKeyUsage(String keyUsage) {
    this.keyUsage = keyUsage;
  }

  public KeyForCreateKeyOutput lastRotationTime(String lastRotationTime) {
    this.lastRotationTime = lastRotationTime;
    return this;
  }

   /**
   * Get lastRotationTime
   * @return lastRotationTime
  **/
  @Schema(description = "")
  public String getLastRotationTime() {
    return lastRotationTime;
  }

  public void setLastRotationTime(String lastRotationTime) {
    this.lastRotationTime = lastRotationTime;
  }

  public KeyForCreateKeyOutput origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(description = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public KeyForCreateKeyOutput protectionLevel(String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

   /**
   * Get protectionLevel
   * @return protectionLevel
  **/
  @Schema(description = "")
  public String getProtectionLevel() {
    return protectionLevel;
  }

  public void setProtectionLevel(String protectionLevel) {
    this.protectionLevel = protectionLevel;
  }

  public KeyForCreateKeyOutput rotationState(String rotationState) {
    this.rotationState = rotationState;
    return this;
  }

   /**
   * Get rotationState
   * @return rotationState
  **/
  @Schema(description = "")
  public String getRotationState() {
    return rotationState;
  }

  public void setRotationState(String rotationState) {
    this.rotationState = rotationState;
  }

  public KeyForCreateKeyOutput scheduleDeleteTime(String scheduleDeleteTime) {
    this.scheduleDeleteTime = scheduleDeleteTime;
    return this;
  }

   /**
   * Get scheduleDeleteTime
   * @return scheduleDeleteTime
  **/
  @Schema(description = "")
  public String getScheduleDeleteTime() {
    return scheduleDeleteTime;
  }

  public void setScheduleDeleteTime(String scheduleDeleteTime) {
    this.scheduleDeleteTime = scheduleDeleteTime;
  }

  public KeyForCreateKeyOutput scheduleRotationTime(String scheduleRotationTime) {
    this.scheduleRotationTime = scheduleRotationTime;
    return this;
  }

   /**
   * Get scheduleRotationTime
   * @return scheduleRotationTime
  **/
  @Schema(description = "")
  public String getScheduleRotationTime() {
    return scheduleRotationTime;
  }

  public void setScheduleRotationTime(String scheduleRotationTime) {
    this.scheduleRotationTime = scheduleRotationTime;
  }

  public KeyForCreateKeyOutput trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @Schema(description = "")
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public KeyForCreateKeyOutput updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public Long getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Long updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyForCreateKeyOutput keyForCreateKeyOutput = (KeyForCreateKeyOutput) o;
    return Objects.equals(this.creationDate, keyForCreateKeyOutput.creationDate) &&
        Objects.equals(this.description, keyForCreateKeyOutput.description) &&
        Objects.equals(this.encryptionAlgorithms, keyForCreateKeyOutput.encryptionAlgorithms) &&
        Objects.equals(this.ID, keyForCreateKeyOutput.ID) &&
        Objects.equals(this.keyMaterialExpireTime, keyForCreateKeyOutput.keyMaterialExpireTime) &&
        Objects.equals(this.keyName, keyForCreateKeyOutput.keyName) &&
        Objects.equals(this.keySpec, keyForCreateKeyOutput.keySpec) &&
        Objects.equals(this.keyState, keyForCreateKeyOutput.keyState) &&
        Objects.equals(this.keyUsage, keyForCreateKeyOutput.keyUsage) &&
        Objects.equals(this.lastRotationTime, keyForCreateKeyOutput.lastRotationTime) &&
        Objects.equals(this.origin, keyForCreateKeyOutput.origin) &&
        Objects.equals(this.protectionLevel, keyForCreateKeyOutput.protectionLevel) &&
        Objects.equals(this.rotationState, keyForCreateKeyOutput.rotationState) &&
        Objects.equals(this.scheduleDeleteTime, keyForCreateKeyOutput.scheduleDeleteTime) &&
        Objects.equals(this.scheduleRotationTime, keyForCreateKeyOutput.scheduleRotationTime) &&
        Objects.equals(this.trn, keyForCreateKeyOutput.trn) &&
        Objects.equals(this.updateDate, keyForCreateKeyOutput.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, description, encryptionAlgorithms, ID, keyMaterialExpireTime, keyName, keySpec, keyState, keyUsage, lastRotationTime, origin, protectionLevel, rotationState, scheduleDeleteTime, scheduleRotationTime, trn, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyForCreateKeyOutput {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionAlgorithms: ").append(toIndentedString(encryptionAlgorithms)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    keyMaterialExpireTime: ").append(toIndentedString(keyMaterialExpireTime)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
    sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    lastRotationTime: ").append(toIndentedString(lastRotationTime)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    protectionLevel: ").append(toIndentedString(protectionLevel)).append("\n");
    sb.append("    rotationState: ").append(toIndentedString(rotationState)).append("\n");
    sb.append("    scheduleDeleteTime: ").append(toIndentedString(scheduleDeleteTime)).append("\n");
    sb.append("    scheduleRotationTime: ").append(toIndentedString(scheduleRotationTime)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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