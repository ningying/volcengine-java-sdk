/*
 * vedbm
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vedbm.model;

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
 * CreateDBEndpointRequest
 */



public class CreateDBEndpointRequest {
  @SerializedName("AutoAddNewNodes")
  private Boolean autoAddNewNodes = null;

  /**
   * Gets or Sets consistLevel
   */
  @JsonAdapter(ConsistLevelEnum.Adapter.class)
  public enum ConsistLevelEnum {
    @SerializedName("Eventual")
    EVENTUAL("Eventual"),
    @SerializedName("Session")
    SESSION("Session"),
    @SerializedName("Global")
    GLOBAL("Global");

    private String value;

    ConsistLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConsistLevelEnum fromValue(String input) {
      for (ConsistLevelEnum b : ConsistLevelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConsistLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConsistLevelEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConsistLevelEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConsistLevelEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ConsistLevel")
  private ConsistLevelEnum consistLevel = null;

  @SerializedName("ConsistTimeout")
  private Integer consistTimeout = null;

  /**
   * Gets or Sets consistTimeoutAction
   */
  @JsonAdapter(ConsistTimeoutActionEnum.Adapter.class)
  public enum ConsistTimeoutActionEnum {
    @SerializedName("ReturnError")
    RETURNERROR("ReturnError"),
    @SerializedName("ReadMaster")
    READMASTER("ReadMaster");

    private String value;

    ConsistTimeoutActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConsistTimeoutActionEnum fromValue(String input) {
      for (ConsistTimeoutActionEnum b : ConsistTimeoutActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConsistTimeoutActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConsistTimeoutActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConsistTimeoutActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConsistTimeoutActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ConsistTimeoutAction")
  private ConsistTimeoutActionEnum consistTimeoutAction = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DistributedTransaction")
  private Boolean distributedTransaction = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  /**
   * Gets or Sets endpointType
   */
  @JsonAdapter(EndpointTypeEnum.Adapter.class)
  public enum EndpointTypeEnum {
    @SerializedName("Custom")
    CUSTOM("Custom");

    private String value;

    EndpointTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EndpointTypeEnum fromValue(String input) {
      for (EndpointTypeEnum b : EndpointTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EndpointTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndpointTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EndpointTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EndpointTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("EndpointType")
  private EndpointTypeEnum endpointType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("MasterAcceptReadRequests")
  private Boolean masterAcceptReadRequests = null;

  @SerializedName("Nodes")
  private String nodes = null;

  /**
   * Gets or Sets readWriteMode
   */
  @JsonAdapter(ReadWriteModeEnum.Adapter.class)
  public enum ReadWriteModeEnum {
    @SerializedName("ReadWrite")
    READWRITE("ReadWrite"),
    @SerializedName("ReadOnly")
    READONLY("ReadOnly");

    private String value;

    ReadWriteModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReadWriteModeEnum fromValue(String input) {
      for (ReadWriteModeEnum b : ReadWriteModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReadWriteModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReadWriteModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ReadWriteModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ReadWriteModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ReadWriteMode")
  private ReadWriteModeEnum readWriteMode = null;

  public CreateDBEndpointRequest autoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
    return this;
  }

   /**
   * Get autoAddNewNodes
   * @return autoAddNewNodes
  **/
  @Schema(description = "")
  public Boolean isAutoAddNewNodes() {
    return autoAddNewNodes;
  }

  public void setAutoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
  }

  public CreateDBEndpointRequest consistLevel(ConsistLevelEnum consistLevel) {
    this.consistLevel = consistLevel;
    return this;
  }

   /**
   * Get consistLevel
   * @return consistLevel
  **/
  @Schema(description = "")
  public ConsistLevelEnum getConsistLevel() {
    return consistLevel;
  }

  public void setConsistLevel(ConsistLevelEnum consistLevel) {
    this.consistLevel = consistLevel;
  }

  public CreateDBEndpointRequest consistTimeout(Integer consistTimeout) {
    this.consistTimeout = consistTimeout;
    return this;
  }

   /**
   * Get consistTimeout
   * @return consistTimeout
  **/
  @Schema(description = "")
  public Integer getConsistTimeout() {
    return consistTimeout;
  }

  public void setConsistTimeout(Integer consistTimeout) {
    this.consistTimeout = consistTimeout;
  }

  public CreateDBEndpointRequest consistTimeoutAction(ConsistTimeoutActionEnum consistTimeoutAction) {
    this.consistTimeoutAction = consistTimeoutAction;
    return this;
  }

   /**
   * Get consistTimeoutAction
   * @return consistTimeoutAction
  **/
  @Schema(description = "")
  public ConsistTimeoutActionEnum getConsistTimeoutAction() {
    return consistTimeoutAction;
  }

  public void setConsistTimeoutAction(ConsistTimeoutActionEnum consistTimeoutAction) {
    this.consistTimeoutAction = consistTimeoutAction;
  }

  public CreateDBEndpointRequest description(String description) {
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

  public CreateDBEndpointRequest distributedTransaction(Boolean distributedTransaction) {
    this.distributedTransaction = distributedTransaction;
    return this;
  }

   /**
   * Get distributedTransaction
   * @return distributedTransaction
  **/
  @Schema(description = "")
  public Boolean isDistributedTransaction() {
    return distributedTransaction;
  }

  public void setDistributedTransaction(Boolean distributedTransaction) {
    this.distributedTransaction = distributedTransaction;
  }

  public CreateDBEndpointRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public CreateDBEndpointRequest endpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public EndpointTypeEnum getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
  }

  public CreateDBEndpointRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public CreateDBEndpointRequest masterAcceptReadRequests(Boolean masterAcceptReadRequests) {
    this.masterAcceptReadRequests = masterAcceptReadRequests;
    return this;
  }

   /**
   * Get masterAcceptReadRequests
   * @return masterAcceptReadRequests
  **/
  @Schema(description = "")
  public Boolean isMasterAcceptReadRequests() {
    return masterAcceptReadRequests;
  }

  public void setMasterAcceptReadRequests(Boolean masterAcceptReadRequests) {
    this.masterAcceptReadRequests = masterAcceptReadRequests;
  }

  public CreateDBEndpointRequest nodes(String nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNodes() {
    return nodes;
  }

  public void setNodes(String nodes) {
    this.nodes = nodes;
  }

  public CreateDBEndpointRequest readWriteMode(ReadWriteModeEnum readWriteMode) {
    this.readWriteMode = readWriteMode;
    return this;
  }

   /**
   * Get readWriteMode
   * @return readWriteMode
  **/
  @Schema(description = "")
  public ReadWriteModeEnum getReadWriteMode() {
    return readWriteMode;
  }

  public void setReadWriteMode(ReadWriteModeEnum readWriteMode) {
    this.readWriteMode = readWriteMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBEndpointRequest createDBEndpointRequest = (CreateDBEndpointRequest) o;
    return Objects.equals(this.autoAddNewNodes, createDBEndpointRequest.autoAddNewNodes) &&
        Objects.equals(this.consistLevel, createDBEndpointRequest.consistLevel) &&
        Objects.equals(this.consistTimeout, createDBEndpointRequest.consistTimeout) &&
        Objects.equals(this.consistTimeoutAction, createDBEndpointRequest.consistTimeoutAction) &&
        Objects.equals(this.description, createDBEndpointRequest.description) &&
        Objects.equals(this.distributedTransaction, createDBEndpointRequest.distributedTransaction) &&
        Objects.equals(this.endpointName, createDBEndpointRequest.endpointName) &&
        Objects.equals(this.endpointType, createDBEndpointRequest.endpointType) &&
        Objects.equals(this.instanceId, createDBEndpointRequest.instanceId) &&
        Objects.equals(this.masterAcceptReadRequests, createDBEndpointRequest.masterAcceptReadRequests) &&
        Objects.equals(this.nodes, createDBEndpointRequest.nodes) &&
        Objects.equals(this.readWriteMode, createDBEndpointRequest.readWriteMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAddNewNodes, consistLevel, consistTimeout, consistTimeoutAction, description, distributedTransaction, endpointName, endpointType, instanceId, masterAcceptReadRequests, nodes, readWriteMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBEndpointRequest {\n");
    
    sb.append("    autoAddNewNodes: ").append(toIndentedString(autoAddNewNodes)).append("\n");
    sb.append("    consistLevel: ").append(toIndentedString(consistLevel)).append("\n");
    sb.append("    consistTimeout: ").append(toIndentedString(consistTimeout)).append("\n");
    sb.append("    consistTimeoutAction: ").append(toIndentedString(consistTimeoutAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributedTransaction: ").append(toIndentedString(distributedTransaction)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    masterAcceptReadRequests: ").append(toIndentedString(masterAcceptReadRequests)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    readWriteMode: ").append(toIndentedString(readWriteMode)).append("\n");
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
