/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

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
 * StatusForGetJobOutput
 */



public class StatusForGetJobOutput {
  @SerializedName("ConsumeRetriedTimes")
  private Boolean consumeRetriedTimes = null;

  @SerializedName("DiagnoseMessage")
  private String diagnoseMessage = null;

  /**
   * Gets or Sets diagnoseState
   */
  @JsonAdapter(DiagnoseStateEnum.Adapter.class)
  public enum DiagnoseStateEnum {
    @SerializedName("Waiting")
    WAITING("Waiting"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Passed")
    PASSED("Passed"),
    @SerializedName("Failed")
    FAILED("Failed"),
    @SerializedName("Abnormal")
    ABNORMAL("Abnormal");

    private String value;

    DiagnoseStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DiagnoseStateEnum fromValue(String input) {
      for (DiagnoseStateEnum b : DiagnoseStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DiagnoseStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiagnoseStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DiagnoseStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DiagnoseStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DiagnoseState")
  private DiagnoseStateEnum diagnoseState = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("HoldingEndTime")
  private String holdingEndTime = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("RetriedTimes")
  private Long retriedTimes = null;

  /**
   * Gets or Sets retryTrigger
   */
  @JsonAdapter(RetryTriggerEnum.Adapter.class)
  public enum RetryTriggerEnum {
    @SerializedName("JobFailed")
    JOBFAILED("JobFailed"),
    @SerializedName("MachineFailure")
    MACHINEFAILURE("MachineFailure"),
    @SerializedName("InstanceReclaimed")
    INSTANCERECLAIMED("InstanceReclaimed"),
    @SerializedName("AutoGPUCompacted")
    AUTOGPUCOMPACTED("AutoGPUCompacted"),
    @SerializedName("EnvironmentalDiagnosisFailed")
    ENVIRONMENTALDIAGNOSISFAILED("EnvironmentalDiagnosisFailed"),
    @SerializedName("PythonDetectionFailed")
    PYTHONDETECTIONFAILED("PythonDetectionFailed"),
    @SerializedName("LogDetectionFailed")
    LOGDETECTIONFAILED("LogDetectionFailed");

    private String value;

    RetryTriggerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RetryTriggerEnum fromValue(String input) {
      for (RetryTriggerEnum b : RetryTriggerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RetryTriggerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetryTriggerEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RetryTriggerEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RetryTriggerEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RetryTrigger")
  private RetryTriggerEnum retryTrigger = null;

  /**
   * Gets or Sets secondaryState
   */
  @JsonAdapter(SecondaryStateEnum.Adapter.class)
  public enum SecondaryStateEnum {
    @SerializedName("CompletedHolding")
    COMPLETEDHOLDING("CompletedHolding"),
    @SerializedName("FailedHolding")
    FAILEDHOLDING("FailedHolding"),
    @SerializedName("NodeWentDown")
    NODEWENTDOWN("NodeWentDown"),
    @SerializedName("MachineFault")
    MACHINEFAULT("MachineFault"),
    @SerializedName("MachineSuspected")
    MACHINESUSPECTED("MachineSuspected"),
    @SerializedName("MachineRegular")
    MACHINEREGULAR("MachineRegular"),
    @SerializedName("PodOOMKilled")
    PODOOMKILLED("PodOOMKilled"),
    @SerializedName("PodReclaimed")
    PODRECLAIMED("PodReclaimed"),
    @SerializedName("PodAutoGPUCompacted")
    PODAUTOGPUCOMPACTED("PodAutoGPUCompacted"),
    @SerializedName("PodEvictByQOS")
    PODEVICTBYQOS("PodEvictByQOS"),
    @SerializedName("PodEvictByGPUPreemptCPU")
    PODEVICTBYGPUPREEMPTCPU("PodEvictByGPUPreemptCPU"),
    @SerializedName("DiagnosisEnvDiagFailed")
    DIAGNOSISENVDIAGFAILED("DiagnosisEnvDiagFailed");

    private String value;

    SecondaryStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SecondaryStateEnum fromValue(String input) {
      for (SecondaryStateEnum b : SecondaryStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SecondaryStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecondaryStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SecondaryStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SecondaryStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SecondaryState")
  private SecondaryStateEnum secondaryState = null;

  @SerializedName("StartTime")
  private String startTime = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    @SerializedName("Creating")
    CREATING("Creating"),
    @SerializedName("Waiting")
    WAITING("Waiting"),
    @SerializedName("Queueing")
    QUEUEING("Queueing"),
    @SerializedName("Deploying")
    DEPLOYING("Deploying"),
    @SerializedName("Running")
    RUNNING("Running"),
    @SerializedName("Completed")
    COMPLETED("Completed"),
    @SerializedName("Failed")
    FAILED("Failed"),
    @SerializedName("Stopping")
    STOPPING("Stopping"),
    @SerializedName("Stopped")
    STOPPED("Stopped");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String input) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("State")
  private StateEnum state = null;

  public StatusForGetJobOutput consumeRetriedTimes(Boolean consumeRetriedTimes) {
    this.consumeRetriedTimes = consumeRetriedTimes;
    return this;
  }

   /**
   * Get consumeRetriedTimes
   * @return consumeRetriedTimes
  **/
  @Schema(description = "")
  public Boolean isConsumeRetriedTimes() {
    return consumeRetriedTimes;
  }

  public void setConsumeRetriedTimes(Boolean consumeRetriedTimes) {
    this.consumeRetriedTimes = consumeRetriedTimes;
  }

  public StatusForGetJobOutput diagnoseMessage(String diagnoseMessage) {
    this.diagnoseMessage = diagnoseMessage;
    return this;
  }

   /**
   * Get diagnoseMessage
   * @return diagnoseMessage
  **/
  @Schema(description = "")
  public String getDiagnoseMessage() {
    return diagnoseMessage;
  }

  public void setDiagnoseMessage(String diagnoseMessage) {
    this.diagnoseMessage = diagnoseMessage;
  }

  public StatusForGetJobOutput diagnoseState(DiagnoseStateEnum diagnoseState) {
    this.diagnoseState = diagnoseState;
    return this;
  }

   /**
   * Get diagnoseState
   * @return diagnoseState
  **/
  @Schema(description = "")
  public DiagnoseStateEnum getDiagnoseState() {
    return diagnoseState;
  }

  public void setDiagnoseState(DiagnoseStateEnum diagnoseState) {
    this.diagnoseState = diagnoseState;
  }

  public StatusForGetJobOutput endTime(String endTime) {
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

  public StatusForGetJobOutput holdingEndTime(String holdingEndTime) {
    this.holdingEndTime = holdingEndTime;
    return this;
  }

   /**
   * Get holdingEndTime
   * @return holdingEndTime
  **/
  @Schema(description = "")
  public String getHoldingEndTime() {
    return holdingEndTime;
  }

  public void setHoldingEndTime(String holdingEndTime) {
    this.holdingEndTime = holdingEndTime;
  }

  public StatusForGetJobOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StatusForGetJobOutput retriedTimes(Long retriedTimes) {
    this.retriedTimes = retriedTimes;
    return this;
  }

   /**
   * Get retriedTimes
   * @return retriedTimes
  **/
  @Schema(description = "")
  public Long getRetriedTimes() {
    return retriedTimes;
  }

  public void setRetriedTimes(Long retriedTimes) {
    this.retriedTimes = retriedTimes;
  }

  public StatusForGetJobOutput retryTrigger(RetryTriggerEnum retryTrigger) {
    this.retryTrigger = retryTrigger;
    return this;
  }

   /**
   * Get retryTrigger
   * @return retryTrigger
  **/
  @Schema(description = "")
  public RetryTriggerEnum getRetryTrigger() {
    return retryTrigger;
  }

  public void setRetryTrigger(RetryTriggerEnum retryTrigger) {
    this.retryTrigger = retryTrigger;
  }

  public StatusForGetJobOutput secondaryState(SecondaryStateEnum secondaryState) {
    this.secondaryState = secondaryState;
    return this;
  }

   /**
   * Get secondaryState
   * @return secondaryState
  **/
  @Schema(description = "")
  public SecondaryStateEnum getSecondaryState() {
    return secondaryState;
  }

  public void setSecondaryState(SecondaryStateEnum secondaryState) {
    this.secondaryState = secondaryState;
  }

  public StatusForGetJobOutput startTime(String startTime) {
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

  public StatusForGetJobOutput state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusForGetJobOutput statusForGetJobOutput = (StatusForGetJobOutput) o;
    return Objects.equals(this.consumeRetriedTimes, statusForGetJobOutput.consumeRetriedTimes) &&
        Objects.equals(this.diagnoseMessage, statusForGetJobOutput.diagnoseMessage) &&
        Objects.equals(this.diagnoseState, statusForGetJobOutput.diagnoseState) &&
        Objects.equals(this.endTime, statusForGetJobOutput.endTime) &&
        Objects.equals(this.holdingEndTime, statusForGetJobOutput.holdingEndTime) &&
        Objects.equals(this.message, statusForGetJobOutput.message) &&
        Objects.equals(this.retriedTimes, statusForGetJobOutput.retriedTimes) &&
        Objects.equals(this.retryTrigger, statusForGetJobOutput.retryTrigger) &&
        Objects.equals(this.secondaryState, statusForGetJobOutput.secondaryState) &&
        Objects.equals(this.startTime, statusForGetJobOutput.startTime) &&
        Objects.equals(this.state, statusForGetJobOutput.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumeRetriedTimes, diagnoseMessage, diagnoseState, endTime, holdingEndTime, message, retriedTimes, retryTrigger, secondaryState, startTime, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusForGetJobOutput {\n");
    
    sb.append("    consumeRetriedTimes: ").append(toIndentedString(consumeRetriedTimes)).append("\n");
    sb.append("    diagnoseMessage: ").append(toIndentedString(diagnoseMessage)).append("\n");
    sb.append("    diagnoseState: ").append(toIndentedString(diagnoseState)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    holdingEndTime: ").append(toIndentedString(holdingEndTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    retriedTimes: ").append(toIndentedString(retriedTimes)).append("\n");
    sb.append("    retryTrigger: ").append(toIndentedString(retryTrigger)).append("\n");
    sb.append("    secondaryState: ").append(toIndentedString(secondaryState)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
