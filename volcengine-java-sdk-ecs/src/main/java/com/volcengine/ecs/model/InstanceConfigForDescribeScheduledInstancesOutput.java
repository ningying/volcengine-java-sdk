/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.EipAddressForDescribeScheduledInstancesOutput;
import com.volcengine.ecs.model.NetworkInterfacesReForDescribeScheduledInstancesOutput;
import com.volcengine.ecs.model.TagForDescribeScheduledInstancesOutput;
import com.volcengine.ecs.model.VolumeForDescribeScheduledInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstanceConfigForDescribeScheduledInstancesOutput
 */



public class InstanceConfigForDescribeScheduledInstancesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddress")
  private EipAddressForDescribeScheduledInstancesOutput eipAddress = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("NetworkInterfacesRes")
  private List<NetworkInterfacesReForDescribeScheduledInstancesOutput> networkInterfacesRes = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForDescribeScheduledInstancesOutput> tags = null;

  @SerializedName("Volumes")
  private List<VolumeForDescribeScheduledInstancesOutput> volumes = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public InstanceConfigForDescribeScheduledInstancesOutput description(String description) {
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

  public InstanceConfigForDescribeScheduledInstancesOutput eipAddress(EipAddressForDescribeScheduledInstancesOutput eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Valid
  @Schema(description = "")
  public EipAddressForDescribeScheduledInstancesOutput getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(EipAddressForDescribeScheduledInstancesOutput eipAddress) {
    this.eipAddress = eipAddress;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @Schema(description = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput networkInterfacesRes(List<NetworkInterfacesReForDescribeScheduledInstancesOutput> networkInterfacesRes) {
    this.networkInterfacesRes = networkInterfacesRes;
    return this;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput addNetworkInterfacesResItem(NetworkInterfacesReForDescribeScheduledInstancesOutput networkInterfacesResItem) {
    if (this.networkInterfacesRes == null) {
      this.networkInterfacesRes = new ArrayList<NetworkInterfacesReForDescribeScheduledInstancesOutput>();
    }
    this.networkInterfacesRes.add(networkInterfacesResItem);
    return this;
  }

   /**
   * Get networkInterfacesRes
   * @return networkInterfacesRes
  **/
  @Valid
  @Schema(description = "")
  public List<NetworkInterfacesReForDescribeScheduledInstancesOutput> getNetworkInterfacesRes() {
    return networkInterfacesRes;
  }

  public void setNetworkInterfacesRes(List<NetworkInterfacesReForDescribeScheduledInstancesOutput> networkInterfacesRes) {
    this.networkInterfacesRes = networkInterfacesRes;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput tags(List<TagForDescribeScheduledInstancesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput addTagsItem(TagForDescribeScheduledInstancesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeScheduledInstancesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeScheduledInstancesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeScheduledInstancesOutput> tags) {
    this.tags = tags;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput volumes(List<VolumeForDescribeScheduledInstancesOutput> volumes) {
    this.volumes = volumes;
    return this;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput addVolumesItem(VolumeForDescribeScheduledInstancesOutput volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<VolumeForDescribeScheduledInstancesOutput>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @Valid
  @Schema(description = "")
  public List<VolumeForDescribeScheduledInstancesOutput> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<VolumeForDescribeScheduledInstancesOutput> volumes) {
    this.volumes = volumes;
  }

  public InstanceConfigForDescribeScheduledInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigForDescribeScheduledInstancesOutput instanceConfigForDescribeScheduledInstancesOutput = (InstanceConfigForDescribeScheduledInstancesOutput) o;
    return Objects.equals(this.description, instanceConfigForDescribeScheduledInstancesOutput.description) &&
        Objects.equals(this.eipAddress, instanceConfigForDescribeScheduledInstancesOutput.eipAddress) &&
        Objects.equals(this.hostName, instanceConfigForDescribeScheduledInstancesOutput.hostName) &&
        Objects.equals(this.imageId, instanceConfigForDescribeScheduledInstancesOutput.imageId) &&
        Objects.equals(this.instanceName, instanceConfigForDescribeScheduledInstancesOutput.instanceName) &&
        Objects.equals(this.instanceTypeId, instanceConfigForDescribeScheduledInstancesOutput.instanceTypeId) &&
        Objects.equals(this.keyPairName, instanceConfigForDescribeScheduledInstancesOutput.keyPairName) &&
        Objects.equals(this.networkInterfacesRes, instanceConfigForDescribeScheduledInstancesOutput.networkInterfacesRes) &&
        Objects.equals(this.projectName, instanceConfigForDescribeScheduledInstancesOutput.projectName) &&
        Objects.equals(this.tags, instanceConfigForDescribeScheduledInstancesOutput.tags) &&
        Objects.equals(this.volumes, instanceConfigForDescribeScheduledInstancesOutput.volumes) &&
        Objects.equals(this.zoneId, instanceConfigForDescribeScheduledInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, eipAddress, hostName, imageId, instanceName, instanceTypeId, keyPairName, networkInterfacesRes, projectName, tags, volumes, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigForDescribeScheduledInstancesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    networkInterfacesRes: ").append(toIndentedString(networkInterfacesRes)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
