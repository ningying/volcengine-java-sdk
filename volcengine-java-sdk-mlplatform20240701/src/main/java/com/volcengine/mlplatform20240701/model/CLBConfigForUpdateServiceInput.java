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
 * CLBConfigForUpdateServiceInput
 */



public class CLBConfigForUpdateServiceInput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  /**
   * Gets or Sets scheduler
   */
  @JsonAdapter(SchedulerEnum.Adapter.class)
  public enum SchedulerEnum {
    @SerializedName("wrr")
    WRR("wrr"),
    @SerializedName("wlc")
    WLC("wlc"),
    @SerializedName("sh")
    SH("sh");

    private String value;

    SchedulerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SchedulerEnum fromValue(String input) {
      for (SchedulerEnum b : SchedulerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SchedulerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchedulerEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SchedulerEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SchedulerEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Scheduler")
  private SchedulerEnum scheduler = null;

  public CLBConfigForUpdateServiceInput instanceId(String instanceId) {
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

  public CLBConfigForUpdateServiceInput scheduler(SchedulerEnum scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @Schema(description = "")
  public SchedulerEnum getScheduler() {
    return scheduler;
  }

  public void setScheduler(SchedulerEnum scheduler) {
    this.scheduler = scheduler;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CLBConfigForUpdateServiceInput clBConfigForUpdateServiceInput = (CLBConfigForUpdateServiceInput) o;
    return Objects.equals(this.instanceId, clBConfigForUpdateServiceInput.instanceId) &&
        Objects.equals(this.scheduler, clBConfigForUpdateServiceInput.scheduler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, scheduler);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CLBConfigForUpdateServiceInput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
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
