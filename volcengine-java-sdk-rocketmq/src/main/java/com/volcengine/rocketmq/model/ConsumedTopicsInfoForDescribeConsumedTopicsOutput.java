/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

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
 * ConsumedTopicsInfoForDescribeConsumedTopicsOutput
 */



public class ConsumedTopicsInfoForDescribeConsumedTopicsOutput {
  @SerializedName("QueueNum")
  private Integer queueNum = null;

  @SerializedName("SubString")
  private String subString = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public ConsumedTopicsInfoForDescribeConsumedTopicsOutput queueNum(Integer queueNum) {
    this.queueNum = queueNum;
    return this;
  }

   /**
   * Get queueNum
   * @return queueNum
  **/
  @Schema(description = "")
  public Integer getQueueNum() {
    return queueNum;
  }

  public void setQueueNum(Integer queueNum) {
    this.queueNum = queueNum;
  }

  public ConsumedTopicsInfoForDescribeConsumedTopicsOutput subString(String subString) {
    this.subString = subString;
    return this;
  }

   /**
   * Get subString
   * @return subString
  **/
  @Schema(description = "")
  public String getSubString() {
    return subString;
  }

  public void setSubString(String subString) {
    this.subString = subString;
  }

  public ConsumedTopicsInfoForDescribeConsumedTopicsOutput topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @Schema(description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumedTopicsInfoForDescribeConsumedTopicsOutput consumedTopicsInfoForDescribeConsumedTopicsOutput = (ConsumedTopicsInfoForDescribeConsumedTopicsOutput) o;
    return Objects.equals(this.queueNum, consumedTopicsInfoForDescribeConsumedTopicsOutput.queueNum) &&
        Objects.equals(this.subString, consumedTopicsInfoForDescribeConsumedTopicsOutput.subString) &&
        Objects.equals(this.topicName, consumedTopicsInfoForDescribeConsumedTopicsOutput.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueNum, subString, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumedTopicsInfoForDescribeConsumedTopicsOutput {\n");
    
    sb.append("    queueNum: ").append(toIndentedString(queueNum)).append("\n");
    sb.append("    subString: ").append(toIndentedString(subString)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
