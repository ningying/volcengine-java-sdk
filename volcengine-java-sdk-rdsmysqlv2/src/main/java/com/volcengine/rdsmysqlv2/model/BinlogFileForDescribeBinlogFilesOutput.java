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
 * BinlogFileForDescribeBinlogFilesOutput
 */



public class BinlogFileForDescribeBinlogFilesOutput {
  @SerializedName("BackupRegion")
  private String backupRegion = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("DownloadStatus")
  private String downloadStatus = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("FileSize")
  private Long fileSize = null;

  @SerializedName("IsEncrypted")
  private Boolean isEncrypted = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public BinlogFileForDescribeBinlogFilesOutput backupRegion(String backupRegion) {
    this.backupRegion = backupRegion;
    return this;
  }

   /**
   * Get backupRegion
   * @return backupRegion
  **/
  @Schema(description = "")
  public String getBackupRegion() {
    return backupRegion;
  }

  public void setBackupRegion(String backupRegion) {
    this.backupRegion = backupRegion;
  }

  public BinlogFileForDescribeBinlogFilesOutput backupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public String getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
  }

  public BinlogFileForDescribeBinlogFilesOutput downloadStatus(String downloadStatus) {
    this.downloadStatus = downloadStatus;
    return this;
  }

   /**
   * Get downloadStatus
   * @return downloadStatus
  **/
  @Schema(description = "")
  public String getDownloadStatus() {
    return downloadStatus;
  }

  public void setDownloadStatus(String downloadStatus) {
    this.downloadStatus = downloadStatus;
  }

  public BinlogFileForDescribeBinlogFilesOutput fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public BinlogFileForDescribeBinlogFilesOutput fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @Schema(description = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public BinlogFileForDescribeBinlogFilesOutput isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Get isEncrypted
   * @return isEncrypted
  **/
  @Schema(description = "")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public BinlogFileForDescribeBinlogFilesOutput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public BinlogFileForDescribeBinlogFilesOutput updateTime(String updateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinlogFileForDescribeBinlogFilesOutput binlogFileForDescribeBinlogFilesOutput = (BinlogFileForDescribeBinlogFilesOutput) o;
    return Objects.equals(this.backupRegion, binlogFileForDescribeBinlogFilesOutput.backupRegion) &&
        Objects.equals(this.backupStatus, binlogFileForDescribeBinlogFilesOutput.backupStatus) &&
        Objects.equals(this.downloadStatus, binlogFileForDescribeBinlogFilesOutput.downloadStatus) &&
        Objects.equals(this.fileName, binlogFileForDescribeBinlogFilesOutput.fileName) &&
        Objects.equals(this.fileSize, binlogFileForDescribeBinlogFilesOutput.fileSize) &&
        Objects.equals(this.isEncrypted, binlogFileForDescribeBinlogFilesOutput.isEncrypted) &&
        Objects.equals(this.nodeId, binlogFileForDescribeBinlogFilesOutput.nodeId) &&
        Objects.equals(this.updateTime, binlogFileForDescribeBinlogFilesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRegion, backupStatus, downloadStatus, fileName, fileSize, isEncrypted, nodeId, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinlogFileForDescribeBinlogFilesOutput {\n");
    
    sb.append("    backupRegion: ").append(toIndentedString(backupRegion)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    downloadStatus: ").append(toIndentedString(downloadStatus)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
