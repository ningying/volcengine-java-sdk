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
import com.volcengine.escloud.model.ExtraPerformanceForCreateInstanceInOneStepInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeSpecsAssignForCreateInstanceInOneStepInput
 */



public class NodeSpecsAssignForCreateInstanceInOneStepInput {
  @SerializedName("ExtraPerformance")
  private ExtraPerformanceForCreateInstanceInOneStepInput extraPerformance = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("ResourceSpecName")
  private String resourceSpecName = null;

  @SerializedName("StorageSize")
  private Integer storageSize = null;

  @SerializedName("StorageSpecName")
  private String storageSpecName = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("Master")
    MASTER("Master"),
    @SerializedName("Kibana")
    KIBANA("Kibana"),
    @SerializedName("Hot")
    HOT("Hot"),
    @SerializedName("Warm")
    WARM("Warm"),
    @SerializedName("Cold")
    COLD("Cold"),
    @SerializedName("Coordinator")
    COORDINATOR("Coordinator"),
    @SerializedName("Other")
    OTHER("Other");

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

  public NodeSpecsAssignForCreateInstanceInOneStepInput extraPerformance(ExtraPerformanceForCreateInstanceInOneStepInput extraPerformance) {
    this.extraPerformance = extraPerformance;
    return this;
  }

   /**
   * Get extraPerformance
   * @return extraPerformance
  **/
  @Valid
  @Schema(description = "")
  public ExtraPerformanceForCreateInstanceInOneStepInput getExtraPerformance() {
    return extraPerformance;
  }

  public void setExtraPerformance(ExtraPerformanceForCreateInstanceInOneStepInput extraPerformance) {
    this.extraPerformance = extraPerformance;
  }

  public NodeSpecsAssignForCreateInstanceInOneStepInput number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public NodeSpecsAssignForCreateInstanceInOneStepInput resourceSpecName(String resourceSpecName) {
    this.resourceSpecName = resourceSpecName;
    return this;
  }

   /**
   * Get resourceSpecName
   * @return resourceSpecName
  **/
  @Schema(description = "")
  public String getResourceSpecName() {
    return resourceSpecName;
  }

  public void setResourceSpecName(String resourceSpecName) {
    this.resourceSpecName = resourceSpecName;
  }

  public NodeSpecsAssignForCreateInstanceInOneStepInput storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

   /**
   * Get storageSize
   * @return storageSize
  **/
  @Schema(description = "")
  public Integer getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

  public NodeSpecsAssignForCreateInstanceInOneStepInput storageSpecName(String storageSpecName) {
    this.storageSpecName = storageSpecName;
    return this;
  }

   /**
   * Get storageSpecName
   * @return storageSpecName
  **/
  @Schema(description = "")
  public String getStorageSpecName() {
    return storageSpecName;
  }

  public void setStorageSpecName(String storageSpecName) {
    this.storageSpecName = storageSpecName;
  }

  public NodeSpecsAssignForCreateInstanceInOneStepInput type(TypeEnum type) {
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
    NodeSpecsAssignForCreateInstanceInOneStepInput nodeSpecsAssignForCreateInstanceInOneStepInput = (NodeSpecsAssignForCreateInstanceInOneStepInput) o;
    return Objects.equals(this.extraPerformance, nodeSpecsAssignForCreateInstanceInOneStepInput.extraPerformance) &&
        Objects.equals(this.number, nodeSpecsAssignForCreateInstanceInOneStepInput.number) &&
        Objects.equals(this.resourceSpecName, nodeSpecsAssignForCreateInstanceInOneStepInput.resourceSpecName) &&
        Objects.equals(this.storageSize, nodeSpecsAssignForCreateInstanceInOneStepInput.storageSize) &&
        Objects.equals(this.storageSpecName, nodeSpecsAssignForCreateInstanceInOneStepInput.storageSpecName) &&
        Objects.equals(this.type, nodeSpecsAssignForCreateInstanceInOneStepInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraPerformance, number, resourceSpecName, storageSize, storageSpecName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSpecsAssignForCreateInstanceInOneStepInput {\n");
    
    sb.append("    extraPerformance: ").append(toIndentedString(extraPerformance)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    resourceSpecName: ").append(toIndentedString(resourceSpecName)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    storageSpecName: ").append(toIndentedString(storageSpecName)).append("\n");
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