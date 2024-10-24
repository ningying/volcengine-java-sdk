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
import com.volcengine.rocketmq.model.AccessPolicyForModifyTopicAccessPoliciesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyTopicAccessPoliciesRequest
 */



public class ModifyTopicAccessPoliciesRequest {
  @SerializedName("AccessPolicies")
  private List<AccessPolicyForModifyTopicAccessPoliciesInput> accessPolicies = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public ModifyTopicAccessPoliciesRequest accessPolicies(List<AccessPolicyForModifyTopicAccessPoliciesInput> accessPolicies) {
    this.accessPolicies = accessPolicies;
    return this;
  }

  public ModifyTopicAccessPoliciesRequest addAccessPoliciesItem(AccessPolicyForModifyTopicAccessPoliciesInput accessPoliciesItem) {
    if (this.accessPolicies == null) {
      this.accessPolicies = new ArrayList<AccessPolicyForModifyTopicAccessPoliciesInput>();
    }
    this.accessPolicies.add(accessPoliciesItem);
    return this;
  }

   /**
   * Get accessPolicies
   * @return accessPolicies
  **/
  @Valid
  @Schema(description = "")
  public List<AccessPolicyForModifyTopicAccessPoliciesInput> getAccessPolicies() {
    return accessPolicies;
  }

  public void setAccessPolicies(List<AccessPolicyForModifyTopicAccessPoliciesInput> accessPolicies) {
    this.accessPolicies = accessPolicies;
  }

  public ModifyTopicAccessPoliciesRequest instanceId(String instanceId) {
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

  public ModifyTopicAccessPoliciesRequest topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @NotNull
 @Size(min=3,max=64)  @Schema(required = true, description = "")
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
    ModifyTopicAccessPoliciesRequest modifyTopicAccessPoliciesRequest = (ModifyTopicAccessPoliciesRequest) o;
    return Objects.equals(this.accessPolicies, modifyTopicAccessPoliciesRequest.accessPolicies) &&
        Objects.equals(this.instanceId, modifyTopicAccessPoliciesRequest.instanceId) &&
        Objects.equals(this.topicName, modifyTopicAccessPoliciesRequest.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicies, instanceId, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTopicAccessPoliciesRequest {\n");
    
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
