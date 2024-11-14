/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

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
 * AddControlPolicyRequest
 */



public class AddControlPolicyRequest {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    @SerializedName("accept")
    ACCEPT("accept"),
    @SerializedName("deny")
    DENY("deny"),
    @SerializedName("monitor")
    MONITOR("monitor");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionEnum fromValue(String input) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Action")
  private ActionEnum action = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestPort")
  private String destPort = null;

  /**
   * Gets or Sets destPortType
   */
  @JsonAdapter(DestPortTypeEnum.Adapter.class)
  public enum DestPortTypeEnum {
    @SerializedName("port")
    PORT("port"),
    @SerializedName("group")
    GROUP("group");

    private String value;

    DestPortTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DestPortTypeEnum fromValue(String input) {
      for (DestPortTypeEnum b : DestPortTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DestPortTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestPortTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DestPortTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DestPortTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DestPortType")
  private DestPortTypeEnum destPortType = null;

  @SerializedName("Destination")
  private String destination = null;

  /**
   * Gets or Sets destinationType
   */
  @JsonAdapter(DestinationTypeEnum.Adapter.class)
  public enum DestinationTypeEnum {
    @SerializedName("net")
    NET("net"),
    @SerializedName("location")
    LOCATION("location"),
    @SerializedName("group")
    GROUP("group"),
    @SerializedName("domain")
    DOMAIN("domain");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DestinationTypeEnum fromValue(String input) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DestinationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DestinationType")
  private DestinationTypeEnum destinationType = null;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    @SerializedName("in")
    IN("in"),
    @SerializedName("out")
    OUT("out");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String input) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DirectionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Direction")
  private DirectionEnum direction = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("Prio")
  private Integer prio = null;

  /**
   * Gets or Sets proto
   */
  @JsonAdapter(ProtoEnum.Adapter.class)
  public enum ProtoEnum {
    @SerializedName("ICMP")
    ICMP("ICMP"),
    @SerializedName("TCP")
    TCP("TCP"),
    @SerializedName("UDP")
    UDP("UDP"),
    @SerializedName("ANY")
    ANY("ANY");

    private String value;

    ProtoEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtoEnum fromValue(String input) {
      for (ProtoEnum b : ProtoEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtoEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProtoEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProtoEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Proto")
  private ProtoEnum proto = null;

  @SerializedName("RepeatDays")
  private List<Integer> repeatDays = null;

  @SerializedName("RepeatEndTime")
  private String repeatEndTime = null;

  @SerializedName("RepeatStartTime")
  private String repeatStartTime = null;

  /**
   * Gets or Sets repeatType
   */
  @JsonAdapter(RepeatTypeEnum.Adapter.class)
  public enum RepeatTypeEnum {
    @SerializedName("Permanent")
    PERMANENT("Permanent"),
    @SerializedName("Once")
    ONCE("Once"),
    @SerializedName("Daily")
    DAILY("Daily"),
    @SerializedName("Weekly")
    WEEKLY("Weekly"),
    @SerializedName("Monthly")
    MONTHLY("Monthly");

    private String value;

    RepeatTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RepeatTypeEnum fromValue(String input) {
      for (RepeatTypeEnum b : RepeatTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RepeatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepeatTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RepeatTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RepeatTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("RepeatType")
  private RepeatTypeEnum repeatType = null;

  @SerializedName("Source")
  private String source = null;

  /**
   * Gets or Sets sourceType
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    @SerializedName("net")
    NET("net"),
    @SerializedName("location")
    LOCATION("location"),
    @SerializedName("group")
    GROUP("group");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceTypeEnum fromValue(String input) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SourceType")
  private SourceTypeEnum sourceType = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  @SerializedName("Status")
  private Boolean status = null;

  public AddControlPolicyRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AddControlPolicyRequest description(String description) {
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

  public AddControlPolicyRequest destPort(String destPort) {
    this.destPort = destPort;
    return this;
  }

   /**
   * Get destPort
   * @return destPort
  **/
  @Schema(description = "")
  public String getDestPort() {
    return destPort;
  }

  public void setDestPort(String destPort) {
    this.destPort = destPort;
  }

  public AddControlPolicyRequest destPortType(DestPortTypeEnum destPortType) {
    this.destPortType = destPortType;
    return this;
  }

   /**
   * Get destPortType
   * @return destPortType
  **/
  @Schema(description = "")
  public DestPortTypeEnum getDestPortType() {
    return destPortType;
  }

  public void setDestPortType(DestPortTypeEnum destPortType) {
    this.destPortType = destPortType;
  }

  public AddControlPolicyRequest destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public AddControlPolicyRequest destinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }

  public AddControlPolicyRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @NotNull
  @Schema(required = true, description = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public AddControlPolicyRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AddControlPolicyRequest prio(Integer prio) {
    this.prio = prio;
    return this;
  }

   /**
   * Get prio
   * @return prio
  **/
  @Schema(description = "")
  public Integer getPrio() {
    return prio;
  }

  public void setPrio(Integer prio) {
    this.prio = prio;
  }

  public AddControlPolicyRequest proto(ProtoEnum proto) {
    this.proto = proto;
    return this;
  }

   /**
   * Get proto
   * @return proto
  **/
  @NotNull
  @Schema(required = true, description = "")
  public ProtoEnum getProto() {
    return proto;
  }

  public void setProto(ProtoEnum proto) {
    this.proto = proto;
  }

  public AddControlPolicyRequest repeatDays(List<Integer> repeatDays) {
    this.repeatDays = repeatDays;
    return this;
  }

  public AddControlPolicyRequest addRepeatDaysItem(Integer repeatDaysItem) {
    if (this.repeatDays == null) {
      this.repeatDays = new ArrayList<Integer>();
    }
    this.repeatDays.add(repeatDaysItem);
    return this;
  }

   /**
   * Get repeatDays
   * @return repeatDays
  **/
  @Schema(description = "")
  public List<Integer> getRepeatDays() {
    return repeatDays;
  }

  public void setRepeatDays(List<Integer> repeatDays) {
    this.repeatDays = repeatDays;
  }

  public AddControlPolicyRequest repeatEndTime(String repeatEndTime) {
    this.repeatEndTime = repeatEndTime;
    return this;
  }

   /**
   * Get repeatEndTime
   * @return repeatEndTime
  **/
  @Schema(description = "")
  public String getRepeatEndTime() {
    return repeatEndTime;
  }

  public void setRepeatEndTime(String repeatEndTime) {
    this.repeatEndTime = repeatEndTime;
  }

  public AddControlPolicyRequest repeatStartTime(String repeatStartTime) {
    this.repeatStartTime = repeatStartTime;
    return this;
  }

   /**
   * Get repeatStartTime
   * @return repeatStartTime
  **/
  @Schema(description = "")
  public String getRepeatStartTime() {
    return repeatStartTime;
  }

  public void setRepeatStartTime(String repeatStartTime) {
    this.repeatStartTime = repeatStartTime;
  }

  public AddControlPolicyRequest repeatType(RepeatTypeEnum repeatType) {
    this.repeatType = repeatType;
    return this;
  }

   /**
   * Get repeatType
   * @return repeatType
  **/
  @Schema(description = "")
  public RepeatTypeEnum getRepeatType() {
    return repeatType;
  }

  public void setRepeatType(RepeatTypeEnum repeatType) {
    this.repeatType = repeatType;
  }

  public AddControlPolicyRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AddControlPolicyRequest sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public AddControlPolicyRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AddControlPolicyRequest status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddControlPolicyRequest addControlPolicyRequest = (AddControlPolicyRequest) o;
    return Objects.equals(this.action, addControlPolicyRequest.action) &&
        Objects.equals(this.description, addControlPolicyRequest.description) &&
        Objects.equals(this.destPort, addControlPolicyRequest.destPort) &&
        Objects.equals(this.destPortType, addControlPolicyRequest.destPortType) &&
        Objects.equals(this.destination, addControlPolicyRequest.destination) &&
        Objects.equals(this.destinationType, addControlPolicyRequest.destinationType) &&
        Objects.equals(this.direction, addControlPolicyRequest.direction) &&
        Objects.equals(this.endTime, addControlPolicyRequest.endTime) &&
        Objects.equals(this.prio, addControlPolicyRequest.prio) &&
        Objects.equals(this.proto, addControlPolicyRequest.proto) &&
        Objects.equals(this.repeatDays, addControlPolicyRequest.repeatDays) &&
        Objects.equals(this.repeatEndTime, addControlPolicyRequest.repeatEndTime) &&
        Objects.equals(this.repeatStartTime, addControlPolicyRequest.repeatStartTime) &&
        Objects.equals(this.repeatType, addControlPolicyRequest.repeatType) &&
        Objects.equals(this.source, addControlPolicyRequest.source) &&
        Objects.equals(this.sourceType, addControlPolicyRequest.sourceType) &&
        Objects.equals(this.startTime, addControlPolicyRequest.startTime) &&
        Objects.equals(this.status, addControlPolicyRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description, destPort, destPortType, destination, destinationType, direction, endTime, prio, proto, repeatDays, repeatEndTime, repeatStartTime, repeatType, source, sourceType, startTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddControlPolicyRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
    sb.append("    destPortType: ").append(toIndentedString(destPortType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    prio: ").append(toIndentedString(prio)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    repeatDays: ").append(toIndentedString(repeatDays)).append("\n");
    sb.append("    repeatEndTime: ").append(toIndentedString(repeatEndTime)).append("\n");
    sb.append("    repeatStartTime: ").append(toIndentedString(repeatStartTime)).append("\n");
    sb.append("    repeatType: ").append(toIndentedString(repeatType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
