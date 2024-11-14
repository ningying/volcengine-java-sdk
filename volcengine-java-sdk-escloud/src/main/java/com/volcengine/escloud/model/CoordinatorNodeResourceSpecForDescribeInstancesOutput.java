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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CoordinatorNodeResourceSpecForDescribeInstancesOutput
 */



public class CoordinatorNodeResourceSpecForDescribeInstancesOutput {
  @SerializedName("CPU")
  private Integer CPU = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Memory")
  private Integer memory = null;

  @SerializedName("Name")
  private String name = null;

  public CoordinatorNodeResourceSpecForDescribeInstancesOutput CPU(Integer CPU) {
    this.CPU = CPU;
    return this;
  }

   /**
   * Get CPU
   * @return CPU
  **/
  @Schema(description = "")
  public Integer getCPU() {
    return CPU;
  }

  public void setCPU(Integer CPU) {
    this.CPU = CPU;
  }

  public CoordinatorNodeResourceSpecForDescribeInstancesOutput description(String description) {
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

  public CoordinatorNodeResourceSpecForDescribeInstancesOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CoordinatorNodeResourceSpecForDescribeInstancesOutput memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public CoordinatorNodeResourceSpecForDescribeInstancesOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoordinatorNodeResourceSpecForDescribeInstancesOutput coordinatorNodeResourceSpecForDescribeInstancesOutput = (CoordinatorNodeResourceSpecForDescribeInstancesOutput) o;
    return Objects.equals(this.CPU, coordinatorNodeResourceSpecForDescribeInstancesOutput.CPU) &&
        Objects.equals(this.description, coordinatorNodeResourceSpecForDescribeInstancesOutput.description) &&
        Objects.equals(this.displayName, coordinatorNodeResourceSpecForDescribeInstancesOutput.displayName) &&
        Objects.equals(this.memory, coordinatorNodeResourceSpecForDescribeInstancesOutput.memory) &&
        Objects.equals(this.name, coordinatorNodeResourceSpecForDescribeInstancesOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CPU, description, displayName, memory, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoordinatorNodeResourceSpecForDescribeInstancesOutput {\n");
    
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
