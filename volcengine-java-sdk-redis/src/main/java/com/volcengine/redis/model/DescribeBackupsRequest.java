/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * DescribeBackupsRequest
 */



public class DescribeBackupsRequest {
  @SerializedName("BackupPointId")
  private String backupPointId = null;

  @SerializedName("BackupPointName")
  private String backupPointName = null;

  @SerializedName("BackupStrategyList")
  private List<String> backupStrategyList = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    @SerializedName("OneInstance")
    ONEINSTANCE("OneInstance"),
    @SerializedName("DestroyedInstances")
    DESTROYEDINSTANCES("DestroyedInstances"),
    @SerializedName("AccountInstances")
    ACCOUNTINSTANCES("AccountInstances");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScopeEnum fromValue(String input) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Scope")
  private ScopeEnum scope = null;

  @SerializedName("StartTime")
  private String startTime = null;

  public DescribeBackupsRequest backupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
    return this;
  }

   /**
   * Get backupPointId
   * @return backupPointId
  **/
  @Schema(description = "")
  public String getBackupPointId() {
    return backupPointId;
  }

  public void setBackupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
  }

  public DescribeBackupsRequest backupPointName(String backupPointName) {
    this.backupPointName = backupPointName;
    return this;
  }

   /**
   * Get backupPointName
   * @return backupPointName
  **/
  @Schema(description = "")
  public String getBackupPointName() {
    return backupPointName;
  }

  public void setBackupPointName(String backupPointName) {
    this.backupPointName = backupPointName;
  }

  public DescribeBackupsRequest backupStrategyList(List<String> backupStrategyList) {
    this.backupStrategyList = backupStrategyList;
    return this;
  }

  public DescribeBackupsRequest addBackupStrategyListItem(String backupStrategyListItem) {
    if (this.backupStrategyList == null) {
      this.backupStrategyList = new ArrayList<String>();
    }
    this.backupStrategyList.add(backupStrategyListItem);
    return this;
  }

   /**
   * Get backupStrategyList
   * @return backupStrategyList
  **/
  @Schema(description = "")
  public List<String> getBackupStrategyList() {
    return backupStrategyList;
  }

  public void setBackupStrategyList(List<String> backupStrategyList) {
    this.backupStrategyList = backupStrategyList;
  }

  public DescribeBackupsRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeBackupsRequest instanceId(String instanceId) {
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

  public DescribeBackupsRequest pageNumber(Integer pageNumber) {
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

  public DescribeBackupsRequest pageSize(Integer pageSize) {
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

  public DescribeBackupsRequest projectName(String projectName) {
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

  public DescribeBackupsRequest scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public DescribeBackupsRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBackupsRequest describeBackupsRequest = (DescribeBackupsRequest) o;
    return Objects.equals(this.backupPointId, describeBackupsRequest.backupPointId) &&
        Objects.equals(this.backupPointName, describeBackupsRequest.backupPointName) &&
        Objects.equals(this.backupStrategyList, describeBackupsRequest.backupStrategyList) &&
        Objects.equals(this.endTime, describeBackupsRequest.endTime) &&
        Objects.equals(this.instanceId, describeBackupsRequest.instanceId) &&
        Objects.equals(this.pageNumber, describeBackupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeBackupsRequest.pageSize) &&
        Objects.equals(this.projectName, describeBackupsRequest.projectName) &&
        Objects.equals(this.scope, describeBackupsRequest.scope) &&
        Objects.equals(this.startTime, describeBackupsRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPointId, backupPointName, backupStrategyList, endTime, instanceId, pageNumber, pageSize, projectName, scope, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBackupsRequest {\n");
    
    sb.append("    backupPointId: ").append(toIndentedString(backupPointId)).append("\n");
    sb.append("    backupPointName: ").append(toIndentedString(backupPointName)).append("\n");
    sb.append("    backupStrategyList: ").append(toIndentedString(backupStrategyList)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
