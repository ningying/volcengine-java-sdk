/*
 * flink20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.flink20250101.model;

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
 * DeployRequestForListApplicationInstanceOutput
 */



public class DeployRequestForListApplicationInstanceOutput {
  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("Queue")
  private String queue = null;

  @SerializedName("ResourcePool")
  private String resourcePool = null;

  /**
   * Gets or Sets schedulePolicy
   */
  @JsonAdapter(SchedulePolicyEnum.Adapter.class)
  public enum SchedulePolicyEnum {
    @SerializedName("GANG")
    GANG("GANG"),
    @SerializedName("DRF")
    DRF("DRF");

    private String value;

    SchedulePolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SchedulePolicyEnum fromValue(String input) {
      for (SchedulePolicyEnum b : SchedulePolicyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SchedulePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchedulePolicyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SchedulePolicyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SchedulePolicyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SchedulePolicy")
  private SchedulePolicyEnum schedulePolicy = null;

  @SerializedName("ScheduleTimeout")
  private String scheduleTimeout = null;

  public DeployRequestForListApplicationInstanceOutput namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public DeployRequestForListApplicationInstanceOutput priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public DeployRequestForListApplicationInstanceOutput queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @Schema(description = "")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public DeployRequestForListApplicationInstanceOutput resourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
    return this;
  }

   /**
   * Get resourcePool
   * @return resourcePool
  **/
  @Schema(description = "")
  public String getResourcePool() {
    return resourcePool;
  }

  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  public DeployRequestForListApplicationInstanceOutput schedulePolicy(SchedulePolicyEnum schedulePolicy) {
    this.schedulePolicy = schedulePolicy;
    return this;
  }

   /**
   * Get schedulePolicy
   * @return schedulePolicy
  **/
  @Schema(description = "")
  public SchedulePolicyEnum getSchedulePolicy() {
    return schedulePolicy;
  }

  public void setSchedulePolicy(SchedulePolicyEnum schedulePolicy) {
    this.schedulePolicy = schedulePolicy;
  }

  public DeployRequestForListApplicationInstanceOutput scheduleTimeout(String scheduleTimeout) {
    this.scheduleTimeout = scheduleTimeout;
    return this;
  }

   /**
   * Get scheduleTimeout
   * @return scheduleTimeout
  **/
  @Schema(description = "")
  public String getScheduleTimeout() {
    return scheduleTimeout;
  }

  public void setScheduleTimeout(String scheduleTimeout) {
    this.scheduleTimeout = scheduleTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployRequestForListApplicationInstanceOutput deployRequestForListApplicationInstanceOutput = (DeployRequestForListApplicationInstanceOutput) o;
    return Objects.equals(this.namespace, deployRequestForListApplicationInstanceOutput.namespace) &&
        Objects.equals(this.priority, deployRequestForListApplicationInstanceOutput.priority) &&
        Objects.equals(this.queue, deployRequestForListApplicationInstanceOutput.queue) &&
        Objects.equals(this.resourcePool, deployRequestForListApplicationInstanceOutput.resourcePool) &&
        Objects.equals(this.schedulePolicy, deployRequestForListApplicationInstanceOutput.schedulePolicy) &&
        Objects.equals(this.scheduleTimeout, deployRequestForListApplicationInstanceOutput.scheduleTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, priority, queue, resourcePool, schedulePolicy, scheduleTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployRequestForListApplicationInstanceOutput {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
    sb.append("    schedulePolicy: ").append(toIndentedString(schedulePolicy)).append("\n");
    sb.append("    scheduleTimeout: ").append(toIndentedString(scheduleTimeout)).append("\n");
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
