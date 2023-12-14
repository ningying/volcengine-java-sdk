/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * TaintForListNodesOutput
 */


public class TaintForListNodesOutput {
  /**
   * Gets or Sets effect
   */
  @JsonAdapter(EffectEnum.Adapter.class)
  public enum EffectEnum {
    NOSCHEDULE("NoSchedule"),
    NOEXECUTE("NoExecute"),
    PREFERNOSCHEDULE("PreferNoSchedule");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EffectEnum fromValue(String input) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EffectEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EffectEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Effect")
  private EffectEnum effect = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  public TaintForListNodesOutput effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @Schema(description = "")
  public EffectEnum getEffect() {
    return effect;
  }

  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }

  public TaintForListNodesOutput key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TaintForListNodesOutput value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaintForListNodesOutput taintForListNodesOutput = (TaintForListNodesOutput) o;
    return Objects.equals(this.effect, taintForListNodesOutput.effect) &&
        Objects.equals(this.key, taintForListNodesOutput.key) &&
        Objects.equals(this.value, taintForListNodesOutput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaintForListNodesOutput {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
