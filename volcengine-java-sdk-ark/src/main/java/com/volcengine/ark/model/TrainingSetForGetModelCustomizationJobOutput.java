/*
 * ark
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ark.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ark.model.DatasetForGetModelCustomizationJobOutput;
import com.volcengine.ark.model.PresetDatasetForGetModelCustomizationJobOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrainingSetForGetModelCustomizationJobOutput
 */



public class TrainingSetForGetModelCustomizationJobOutput {
  @SerializedName("Datasets")
  private List<DatasetForGetModelCustomizationJobOutput> datasets = null;

  @SerializedName("PresetData")
  private String presetData = null;

  @SerializedName("PresetDataPercentage")
  private Integer presetDataPercentage = null;

  @SerializedName("PresetDatasets")
  private List<PresetDatasetForGetModelCustomizationJobOutput> presetDatasets = null;

  @SerializedName("TosBucket")
  private String tosBucket = null;

  @SerializedName("TosPaths")
  private List<String> tosPaths = null;

  public TrainingSetForGetModelCustomizationJobOutput datasets(List<DatasetForGetModelCustomizationJobOutput> datasets) {
    this.datasets = datasets;
    return this;
  }

  public TrainingSetForGetModelCustomizationJobOutput addDatasetsItem(DatasetForGetModelCustomizationJobOutput datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<DatasetForGetModelCustomizationJobOutput>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Get datasets
   * @return datasets
  **/
  @Valid
  @Schema(description = "")
  public List<DatasetForGetModelCustomizationJobOutput> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<DatasetForGetModelCustomizationJobOutput> datasets) {
    this.datasets = datasets;
  }

  public TrainingSetForGetModelCustomizationJobOutput presetData(String presetData) {
    this.presetData = presetData;
    return this;
  }

   /**
   * Get presetData
   * @return presetData
  **/
  @Schema(description = "")
  public String getPresetData() {
    return presetData;
  }

  public void setPresetData(String presetData) {
    this.presetData = presetData;
  }

  public TrainingSetForGetModelCustomizationJobOutput presetDataPercentage(Integer presetDataPercentage) {
    this.presetDataPercentage = presetDataPercentage;
    return this;
  }

   /**
   * Get presetDataPercentage
   * @return presetDataPercentage
  **/
  @Schema(description = "")
  public Integer getPresetDataPercentage() {
    return presetDataPercentage;
  }

  public void setPresetDataPercentage(Integer presetDataPercentage) {
    this.presetDataPercentage = presetDataPercentage;
  }

  public TrainingSetForGetModelCustomizationJobOutput presetDatasets(List<PresetDatasetForGetModelCustomizationJobOutput> presetDatasets) {
    this.presetDatasets = presetDatasets;
    return this;
  }

  public TrainingSetForGetModelCustomizationJobOutput addPresetDatasetsItem(PresetDatasetForGetModelCustomizationJobOutput presetDatasetsItem) {
    if (this.presetDatasets == null) {
      this.presetDatasets = new ArrayList<PresetDatasetForGetModelCustomizationJobOutput>();
    }
    this.presetDatasets.add(presetDatasetsItem);
    return this;
  }

   /**
   * Get presetDatasets
   * @return presetDatasets
  **/
  @Valid
  @Schema(description = "")
  public List<PresetDatasetForGetModelCustomizationJobOutput> getPresetDatasets() {
    return presetDatasets;
  }

  public void setPresetDatasets(List<PresetDatasetForGetModelCustomizationJobOutput> presetDatasets) {
    this.presetDatasets = presetDatasets;
  }

  public TrainingSetForGetModelCustomizationJobOutput tosBucket(String tosBucket) {
    this.tosBucket = tosBucket;
    return this;
  }

   /**
   * Get tosBucket
   * @return tosBucket
  **/
  @Schema(description = "")
  public String getTosBucket() {
    return tosBucket;
  }

  public void setTosBucket(String tosBucket) {
    this.tosBucket = tosBucket;
  }

  public TrainingSetForGetModelCustomizationJobOutput tosPaths(List<String> tosPaths) {
    this.tosPaths = tosPaths;
    return this;
  }

  public TrainingSetForGetModelCustomizationJobOutput addTosPathsItem(String tosPathsItem) {
    if (this.tosPaths == null) {
      this.tosPaths = new ArrayList<String>();
    }
    this.tosPaths.add(tosPathsItem);
    return this;
  }

   /**
   * Get tosPaths
   * @return tosPaths
  **/
  @Schema(description = "")
  public List<String> getTosPaths() {
    return tosPaths;
  }

  public void setTosPaths(List<String> tosPaths) {
    this.tosPaths = tosPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainingSetForGetModelCustomizationJobOutput trainingSetForGetModelCustomizationJobOutput = (TrainingSetForGetModelCustomizationJobOutput) o;
    return Objects.equals(this.datasets, trainingSetForGetModelCustomizationJobOutput.datasets) &&
        Objects.equals(this.presetData, trainingSetForGetModelCustomizationJobOutput.presetData) &&
        Objects.equals(this.presetDataPercentage, trainingSetForGetModelCustomizationJobOutput.presetDataPercentage) &&
        Objects.equals(this.presetDatasets, trainingSetForGetModelCustomizationJobOutput.presetDatasets) &&
        Objects.equals(this.tosBucket, trainingSetForGetModelCustomizationJobOutput.tosBucket) &&
        Objects.equals(this.tosPaths, trainingSetForGetModelCustomizationJobOutput.tosPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, presetData, presetDataPercentage, presetDatasets, tosBucket, tosPaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingSetForGetModelCustomizationJobOutput {\n");
    
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    presetData: ").append(toIndentedString(presetData)).append("\n");
    sb.append("    presetDataPercentage: ").append(toIndentedString(presetDataPercentage)).append("\n");
    sb.append("    presetDatasets: ").append(toIndentedString(presetDatasets)).append("\n");
    sb.append("    tosBucket: ").append(toIndentedString(tosBucket)).append("\n");
    sb.append("    tosPaths: ").append(toIndentedString(tosPaths)).append("\n");
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
