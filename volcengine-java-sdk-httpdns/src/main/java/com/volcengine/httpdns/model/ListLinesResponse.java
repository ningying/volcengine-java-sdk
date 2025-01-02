/*
 * httpdns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.httpdns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.httpdns.model.LineForListLinesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListLinesResponse
 */



public class ListLinesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Lines")
  private List<LineForListLinesOutput> lines = null;

  public ListLinesResponse lines(List<LineForListLinesOutput> lines) {
    this.lines = lines;
    return this;
  }

  public ListLinesResponse addLinesItem(LineForListLinesOutput linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<LineForListLinesOutput>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @Valid
  @Schema(description = "")
  public List<LineForListLinesOutput> getLines() {
    return lines;
  }

  public void setLines(List<LineForListLinesOutput> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLinesResponse listLinesResponse = (ListLinesResponse) o;
    return Objects.equals(this.lines, listLinesResponse.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLinesResponse {\n");
    
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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