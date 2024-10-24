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
 * MessageListForQueryMessageByMsgKeyOutput
 */



public class MessageListForQueryMessageByMsgKeyOutput {
  @SerializedName("Body")
  private String body = null;

  @SerializedName("CreateTimestamp")
  private Long createTimestamp = null;

  @SerializedName("IsExist")
  private Boolean isExist = null;

  @SerializedName("MessageId")
  private String messageId = null;

  @SerializedName("MessageKey")
  private String messageKey = null;

  @SerializedName("MessageSize")
  private Integer messageSize = null;

  @SerializedName("ProducerHost")
  private String producerHost = null;

  @SerializedName("StoreTimestamp")
  private Long storeTimestamp = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public MessageListForQueryMessageByMsgKeyOutput body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(description = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MessageListForQueryMessageByMsgKeyOutput createTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * Get createTimestamp
   * @return createTimestamp
  **/
  @Schema(description = "")
  public Long getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public MessageListForQueryMessageByMsgKeyOutput isExist(Boolean isExist) {
    this.isExist = isExist;
    return this;
  }

   /**
   * Get isExist
   * @return isExist
  **/
  @Schema(description = "")
  public Boolean isIsExist() {
    return isExist;
  }

  public void setIsExist(Boolean isExist) {
    this.isExist = isExist;
  }

  public MessageListForQueryMessageByMsgKeyOutput messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @Schema(description = "")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MessageListForQueryMessageByMsgKeyOutput messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

   /**
   * Get messageKey
   * @return messageKey
  **/
  @Schema(description = "")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public MessageListForQueryMessageByMsgKeyOutput messageSize(Integer messageSize) {
    this.messageSize = messageSize;
    return this;
  }

   /**
   * Get messageSize
   * @return messageSize
  **/
  @Schema(description = "")
  public Integer getMessageSize() {
    return messageSize;
  }

  public void setMessageSize(Integer messageSize) {
    this.messageSize = messageSize;
  }

  public MessageListForQueryMessageByMsgKeyOutput producerHost(String producerHost) {
    this.producerHost = producerHost;
    return this;
  }

   /**
   * Get producerHost
   * @return producerHost
  **/
  @Schema(description = "")
  public String getProducerHost() {
    return producerHost;
  }

  public void setProducerHost(String producerHost) {
    this.producerHost = producerHost;
  }

  public MessageListForQueryMessageByMsgKeyOutput storeTimestamp(Long storeTimestamp) {
    this.storeTimestamp = storeTimestamp;
    return this;
  }

   /**
   * Get storeTimestamp
   * @return storeTimestamp
  **/
  @Schema(description = "")
  public Long getStoreTimestamp() {
    return storeTimestamp;
  }

  public void setStoreTimestamp(Long storeTimestamp) {
    this.storeTimestamp = storeTimestamp;
  }

  public MessageListForQueryMessageByMsgKeyOutput tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public MessageListForQueryMessageByMsgKeyOutput topicName(String topicName) {
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
    MessageListForQueryMessageByMsgKeyOutput messageListForQueryMessageByMsgKeyOutput = (MessageListForQueryMessageByMsgKeyOutput) o;
    return Objects.equals(this.body, messageListForQueryMessageByMsgKeyOutput.body) &&
        Objects.equals(this.createTimestamp, messageListForQueryMessageByMsgKeyOutput.createTimestamp) &&
        Objects.equals(this.isExist, messageListForQueryMessageByMsgKeyOutput.isExist) &&
        Objects.equals(this.messageId, messageListForQueryMessageByMsgKeyOutput.messageId) &&
        Objects.equals(this.messageKey, messageListForQueryMessageByMsgKeyOutput.messageKey) &&
        Objects.equals(this.messageSize, messageListForQueryMessageByMsgKeyOutput.messageSize) &&
        Objects.equals(this.producerHost, messageListForQueryMessageByMsgKeyOutput.producerHost) &&
        Objects.equals(this.storeTimestamp, messageListForQueryMessageByMsgKeyOutput.storeTimestamp) &&
        Objects.equals(this.tag, messageListForQueryMessageByMsgKeyOutput.tag) &&
        Objects.equals(this.topicName, messageListForQueryMessageByMsgKeyOutput.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, createTimestamp, isExist, messageId, messageKey, messageSize, producerHost, storeTimestamp, tag, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageListForQueryMessageByMsgKeyOutput {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    isExist: ").append(toIndentedString(isExist)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    messageSize: ").append(toIndentedString(messageSize)).append("\n");
    sb.append("    producerHost: ").append(toIndentedString(producerHost)).append("\n");
    sb.append("    storeTimestamp: ").append(toIndentedString(storeTimestamp)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
