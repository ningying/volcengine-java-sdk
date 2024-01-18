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
import com.volcengine.vke.model.LabelForListNodePoolsOutput;
import com.volcengine.vke.model.TaintForListNodePoolsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * KubernetesConfigForListNodePoolsOutput
 */


public class KubernetesConfigForListNodePoolsOutput {
  @SerializedName("Cordon")
  private Boolean cordon = null;

  @SerializedName("Labels")
  private List<LabelForListNodePoolsOutput> labels = null;

  @SerializedName("NamePrefix")
  private String namePrefix = null;

  @SerializedName("Taints")
  private List<TaintForListNodePoolsOutput> taints = null;

  public KubernetesConfigForListNodePoolsOutput cordon(Boolean cordon) {
    this.cordon = cordon;
    return this;
  }

   /**
   * Get cordon
   * @return cordon
  **/
  @Schema(description = "")
  public Boolean isCordon() {
    return cordon;
  }

  public void setCordon(Boolean cordon) {
    this.cordon = cordon;
  }

  public KubernetesConfigForListNodePoolsOutput labels(List<LabelForListNodePoolsOutput> labels) {
    this.labels = labels;
    return this;
  }

  public KubernetesConfigForListNodePoolsOutput addLabelsItem(LabelForListNodePoolsOutput labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<LabelForListNodePoolsOutput>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Valid
  @Schema(description = "")
  public List<LabelForListNodePoolsOutput> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelForListNodePoolsOutput> labels) {
    this.labels = labels;
  }

  public KubernetesConfigForListNodePoolsOutput namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @Schema(description = "")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public KubernetesConfigForListNodePoolsOutput taints(List<TaintForListNodePoolsOutput> taints) {
    this.taints = taints;
    return this;
  }

  public KubernetesConfigForListNodePoolsOutput addTaintsItem(TaintForListNodePoolsOutput taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<TaintForListNodePoolsOutput>();
    }
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * Get taints
   * @return taints
  **/
  @Valid
  @Schema(description = "")
  public List<TaintForListNodePoolsOutput> getTaints() {
    return taints;
  }

  public void setTaints(List<TaintForListNodePoolsOutput> taints) {
    this.taints = taints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesConfigForListNodePoolsOutput kubernetesConfigForListNodePoolsOutput = (KubernetesConfigForListNodePoolsOutput) o;
    return Objects.equals(this.cordon, kubernetesConfigForListNodePoolsOutput.cordon) &&
        Objects.equals(this.labels, kubernetesConfigForListNodePoolsOutput.labels) &&
        Objects.equals(this.namePrefix, kubernetesConfigForListNodePoolsOutput.namePrefix) &&
        Objects.equals(this.taints, kubernetesConfigForListNodePoolsOutput.taints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cordon, labels, namePrefix, taints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesConfigForListNodePoolsOutput {\n");
    
    sb.append("    cordon: ").append(toIndentedString(cordon)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
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
