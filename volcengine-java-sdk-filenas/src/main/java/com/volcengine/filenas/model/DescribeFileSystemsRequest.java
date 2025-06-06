/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.FilterForDescribeFileSystemsInput;
import com.volcengine.filenas.model.TagFilterForDescribeFileSystemsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeFileSystemsRequest
 */



public class DescribeFileSystemsRequest {
  @SerializedName("FileSystemIds")
  private String fileSystemIds = null;

  /**
   * Gets or Sets fileSystemType
   */
  @JsonAdapter(FileSystemTypeEnum.Adapter.class)
  public enum FileSystemTypeEnum {
    @SerializedName("Extreme")
    EXTREME("Extreme"),
    @SerializedName("Capacity")
    CAPACITY("Capacity"),
    @SerializedName("Cache")
    CACHE("Cache");

    private String value;

    FileSystemTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FileSystemTypeEnum fromValue(String input) {
      for (FileSystemTypeEnum b : FileSystemTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FileSystemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileSystemTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FileSystemTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FileSystemTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("FileSystemType")
  private FileSystemTypeEnum fileSystemType = null;

  @SerializedName("Filters")
  private List<FilterForDescribeFileSystemsInput> filters = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeFileSystemsInput> tagFilters = null;

  public DescribeFileSystemsRequest fileSystemIds(String fileSystemIds) {
    this.fileSystemIds = fileSystemIds;
    return this;
  }

   /**
   * Get fileSystemIds
   * @return fileSystemIds
  **/
  @Schema(description = "")
  public String getFileSystemIds() {
    return fileSystemIds;
  }

  public void setFileSystemIds(String fileSystemIds) {
    this.fileSystemIds = fileSystemIds;
  }

  public DescribeFileSystemsRequest fileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @Schema(description = "")
  public FileSystemTypeEnum getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public DescribeFileSystemsRequest filters(List<FilterForDescribeFileSystemsInput> filters) {
    this.filters = filters;
    return this;
  }

  public DescribeFileSystemsRequest addFiltersItem(FilterForDescribeFileSystemsInput filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<FilterForDescribeFileSystemsInput>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Valid
  @Schema(description = "")
  public List<FilterForDescribeFileSystemsInput> getFilters() {
    return filters;
  }

  public void setFilters(List<FilterForDescribeFileSystemsInput> filters) {
    this.filters = filters;
  }

  public DescribeFileSystemsRequest pageNumber(Integer pageNumber) {
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

  public DescribeFileSystemsRequest pageSize(Integer pageSize) {
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

  public DescribeFileSystemsRequest projectName(String projectName) {
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

  public DescribeFileSystemsRequest tagFilters(List<TagFilterForDescribeFileSystemsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeFileSystemsRequest addTagFiltersItem(TagFilterForDescribeFileSystemsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeFileSystemsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeFileSystemsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeFileSystemsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeFileSystemsRequest describeFileSystemsRequest = (DescribeFileSystemsRequest) o;
    return Objects.equals(this.fileSystemIds, describeFileSystemsRequest.fileSystemIds) &&
        Objects.equals(this.fileSystemType, describeFileSystemsRequest.fileSystemType) &&
        Objects.equals(this.filters, describeFileSystemsRequest.filters) &&
        Objects.equals(this.pageNumber, describeFileSystemsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeFileSystemsRequest.pageSize) &&
        Objects.equals(this.projectName, describeFileSystemsRequest.projectName) &&
        Objects.equals(this.tagFilters, describeFileSystemsRequest.tagFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemIds, fileSystemType, filters, pageNumber, pageSize, projectName, tagFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeFileSystemsRequest {\n");
    
    sb.append("    fileSystemIds: ").append(toIndentedString(fileSystemIds)).append("\n");
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
