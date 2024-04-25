/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.FileListForDescribeDomainLogsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDomainLogsResponse
 */


public class DescribeDomainLogsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("FileLists")
  private List<FileListForDescribeDomainLogsOutput> fileLists = null;

  @SerializedName("FilesCount")
  private Integer filesCount = null;

  @SerializedName("PageNum")
  private Integer pageNum = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeDomainLogsResponse fileLists(List<FileListForDescribeDomainLogsOutput> fileLists) {
    this.fileLists = fileLists;
    return this;
  }

  public DescribeDomainLogsResponse addFileListsItem(FileListForDescribeDomainLogsOutput fileListsItem) {
    if (this.fileLists == null) {
      this.fileLists = new ArrayList<FileListForDescribeDomainLogsOutput>();
    }
    this.fileLists.add(fileListsItem);
    return this;
  }

   /**
   * Get fileLists
   * @return fileLists
  **/
  @Valid
  @Schema(description = "")
  public List<FileListForDescribeDomainLogsOutput> getFileLists() {
    return fileLists;
  }

  public void setFileLists(List<FileListForDescribeDomainLogsOutput> fileLists) {
    this.fileLists = fileLists;
  }

  public DescribeDomainLogsResponse filesCount(Integer filesCount) {
    this.filesCount = filesCount;
    return this;
  }

   /**
   * Get filesCount
   * @return filesCount
  **/
  @Schema(description = "")
  public Integer getFilesCount() {
    return filesCount;
  }

  public void setFilesCount(Integer filesCount) {
    this.filesCount = filesCount;
  }

  public DescribeDomainLogsResponse pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @Schema(description = "")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public DescribeDomainLogsResponse pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDomainLogsResponse describeDomainLogsResponse = (DescribeDomainLogsResponse) o;
    return Objects.equals(this.fileLists, describeDomainLogsResponse.fileLists) &&
        Objects.equals(this.filesCount, describeDomainLogsResponse.filesCount) &&
        Objects.equals(this.pageNum, describeDomainLogsResponse.pageNum) &&
        Objects.equals(this.pageSize, describeDomainLogsResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileLists, filesCount, pageNum, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDomainLogsResponse {\n");
    
    sb.append("    fileLists: ").append(toIndentedString(fileLists)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
