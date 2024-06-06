/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * TaskForDescribeTasksOutput
 */



public class TaskForDescribeTasksOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("EndAt")
  private String endAt = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Process")
  private Long process = null;

  @SerializedName("ResourceId")
  private String resourceId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("UnknownStatus")
    UNKNOWNSTATUS("UnknownStatus"),
    @SerializedName("Pending")
    PENDING("Pending"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Succeeded")
    SUCCEEDED("Succeeded"),
    @SerializedName("Failed")
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("UnknownType")
    UNKNOWNTYPE("UnknownType"),
    @SerializedName("ExportImage")
    EXPORTIMAGE("ExportImage"),
    @SerializedName("CopyImage")
    COPYIMAGE("CopyImage"),
    @SerializedName("PreheatImage")
    PREHEATIMAGE("PreheatImage"),
    @SerializedName("ImportImage")
    IMPORTIMAGE("ImportImage"),
    @SerializedName("CreateImage")
    CREATEIMAGE("CreateImage");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public TaskForDescribeTasksOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public TaskForDescribeTasksOutput endAt(String endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @Schema(description = "")
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }

  public TaskForDescribeTasksOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaskForDescribeTasksOutput process(Long process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @Schema(description = "")
  public Long getProcess() {
    return process;
  }

  public void setProcess(Long process) {
    this.process = process;
  }

  public TaskForDescribeTasksOutput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public TaskForDescribeTasksOutput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskForDescribeTasksOutput type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TaskForDescribeTasksOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskForDescribeTasksOutput taskForDescribeTasksOutput = (TaskForDescribeTasksOutput) o;
    return Objects.equals(this.createdAt, taskForDescribeTasksOutput.createdAt) &&
        Objects.equals(this.endAt, taskForDescribeTasksOutput.endAt) &&
        Objects.equals(this.id, taskForDescribeTasksOutput.id) &&
        Objects.equals(this.process, taskForDescribeTasksOutput.process) &&
        Objects.equals(this.resourceId, taskForDescribeTasksOutput.resourceId) &&
        Objects.equals(this.status, taskForDescribeTasksOutput.status) &&
        Objects.equals(this.type, taskForDescribeTasksOutput.type) &&
        Objects.equals(this.updatedAt, taskForDescribeTasksOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, endAt, id, process, resourceId, status, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskForDescribeTasksOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
