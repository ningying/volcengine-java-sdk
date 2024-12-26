/*
 * cloud_trail
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail.model;

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
 * LookupConditionForLookupEventsInput
 */



public class LookupConditionForLookupEventsInput {
  @SerializedName("LookupConditionKey")
  private String lookupConditionKey = null;

  @SerializedName("LookupConditionValue")
  private String lookupConditionValue = null;

  public LookupConditionForLookupEventsInput lookupConditionKey(String lookupConditionKey) {
    this.lookupConditionKey = lookupConditionKey;
    return this;
  }

   /**
   * Get lookupConditionKey
   * @return lookupConditionKey
  **/
  @Schema(description = "")
  public String getLookupConditionKey() {
    return lookupConditionKey;
  }

  public void setLookupConditionKey(String lookupConditionKey) {
    this.lookupConditionKey = lookupConditionKey;
  }

  public LookupConditionForLookupEventsInput lookupConditionValue(String lookupConditionValue) {
    this.lookupConditionValue = lookupConditionValue;
    return this;
  }

   /**
   * Get lookupConditionValue
   * @return lookupConditionValue
  **/
  @Schema(description = "")
  public String getLookupConditionValue() {
    return lookupConditionValue;
  }

  public void setLookupConditionValue(String lookupConditionValue) {
    this.lookupConditionValue = lookupConditionValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupConditionForLookupEventsInput lookupConditionForLookupEventsInput = (LookupConditionForLookupEventsInput) o;
    return Objects.equals(this.lookupConditionKey, lookupConditionForLookupEventsInput.lookupConditionKey) &&
        Objects.equals(this.lookupConditionValue, lookupConditionForLookupEventsInput.lookupConditionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookupConditionKey, lookupConditionValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupConditionForLookupEventsInput {\n");
    
    sb.append("    lookupConditionKey: ").append(toIndentedString(lookupConditionKey)).append("\n");
    sb.append("    lookupConditionValue: ").append(toIndentedString(lookupConditionValue)).append("\n");
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
