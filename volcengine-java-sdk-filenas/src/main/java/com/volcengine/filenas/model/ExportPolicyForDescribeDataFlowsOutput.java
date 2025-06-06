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
import com.volcengine.filenas.model.FilterInfoForDescribeDataFlowsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ExportPolicyForDescribeDataFlowsOutput
 */



public class ExportPolicyForDescribeDataFlowsOutput {
  @SerializedName("FilterInfo")
  private FilterInfoForDescribeDataFlowsOutput filterInfo = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("Starting")
    STARTING("Starting"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Stopping")
    STOPPING("Stopping"),
    @SerializedName("Stopped")
    STOPPED("Stopped"),
    @SerializedName("Error")
    ERROR("Error");

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
    @SerializedName("None")
    NONE("None"),
    @SerializedName("Customize")
    CUSTOMIZE("Customize");

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

  public ExportPolicyForDescribeDataFlowsOutput filterInfo(FilterInfoForDescribeDataFlowsOutput filterInfo) {
    this.filterInfo = filterInfo;
    return this;
  }

   /**
   * Get filterInfo
   * @return filterInfo
  **/
  @Valid
  @Schema(description = "")
  public FilterInfoForDescribeDataFlowsOutput getFilterInfo() {
    return filterInfo;
  }

  public void setFilterInfo(FilterInfoForDescribeDataFlowsOutput filterInfo) {
    this.filterInfo = filterInfo;
  }

  public ExportPolicyForDescribeDataFlowsOutput status(StatusEnum status) {
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

  public ExportPolicyForDescribeDataFlowsOutput type(TypeEnum type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPolicyForDescribeDataFlowsOutput exportPolicyForDescribeDataFlowsOutput = (ExportPolicyForDescribeDataFlowsOutput) o;
    return Objects.equals(this.filterInfo, exportPolicyForDescribeDataFlowsOutput.filterInfo) &&
        Objects.equals(this.status, exportPolicyForDescribeDataFlowsOutput.status) &&
        Objects.equals(this.type, exportPolicyForDescribeDataFlowsOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterInfo, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPolicyForDescribeDataFlowsOutput {\n");
    
    sb.append("    filterInfo: ").append(toIndentedString(filterInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
