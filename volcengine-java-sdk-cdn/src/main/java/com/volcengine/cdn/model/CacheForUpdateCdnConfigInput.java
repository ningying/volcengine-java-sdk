/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.CacheActionForUpdateCdnConfigInput;
import com.volcengine.cdn.model.ConditionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CacheForUpdateCdnConfigInput
 */



public class CacheForUpdateCdnConfigInput {
  @SerializedName("CacheAction")
  private CacheActionForUpdateCdnConfigInput cacheAction = null;

  @SerializedName("Condition")
  private ConditionForUpdateCdnConfigInput condition = null;

  public CacheForUpdateCdnConfigInput cacheAction(CacheActionForUpdateCdnConfigInput cacheAction) {
    this.cacheAction = cacheAction;
    return this;
  }

   /**
   * Get cacheAction
   * @return cacheAction
  **/
  @Valid
  @Schema(description = "")
  public CacheActionForUpdateCdnConfigInput getCacheAction() {
    return cacheAction;
  }

  public void setCacheAction(CacheActionForUpdateCdnConfigInput cacheAction) {
    this.cacheAction = cacheAction;
  }

  public CacheForUpdateCdnConfigInput condition(ConditionForUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForUpdateCdnConfigInput condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheForUpdateCdnConfigInput cacheForUpdateCdnConfigInput = (CacheForUpdateCdnConfigInput) o;
    return Objects.equals(this.cacheAction, cacheForUpdateCdnConfigInput.cacheAction) &&
        Objects.equals(this.condition, cacheForUpdateCdnConfigInput.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheAction, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheForUpdateCdnConfigInput {\n");
    
    sb.append("    cacheAction: ").append(toIndentedString(cacheAction)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
