/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PostApiV1OverviewDescribeAssetInfoRequest
 */



public class PostApiV1OverviewDescribeAssetInfoRequest {
  @SerializedName("resource_cloud_account_list")
  private List<ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput> resourceCloudAccountList = null;

  /**
   * Gets or Sets resourceVendor
   */
  @JsonAdapter(ResourceVendorEnum.Adapter.class)
  public enum ResourceVendorEnum {
    @SerializedName("volcengine")
    VOLCENGINE("volcengine"),
    @SerializedName("aliyun")
    ALIYUN("aliyun"),
    @SerializedName("huaweicloud")
    HUAWEICLOUD("huaweicloud"),
    @SerializedName("tencent")
    TENCENT("tencent");

    private String value;

    ResourceVendorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceVendorEnum fromValue(String input) {
      for (ResourceVendorEnum b : ResourceVendorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceVendorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceVendorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceVendorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceVendorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("resource_vendor")
  private List<ResourceVendorEnum> resourceVendor = null;

  public PostApiV1OverviewDescribeAssetInfoRequest resourceCloudAccountList(List<ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput> resourceCloudAccountList) {
    this.resourceCloudAccountList = resourceCloudAccountList;
    return this;
  }

  public PostApiV1OverviewDescribeAssetInfoRequest addResourceCloudAccountListItem(ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput resourceCloudAccountListItem) {
    if (this.resourceCloudAccountList == null) {
      this.resourceCloudAccountList = new ArrayList<ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput>();
    }
    this.resourceCloudAccountList.add(resourceCloudAccountListItem);
    return this;
  }

   /**
   * Get resourceCloudAccountList
   * @return resourceCloudAccountList
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput> getResourceCloudAccountList() {
    return resourceCloudAccountList;
  }

  public void setResourceCloudAccountList(List<ResourceCloudAccountListForPostApiV1OverviewDescribeAssetInfoInput> resourceCloudAccountList) {
    this.resourceCloudAccountList = resourceCloudAccountList;
  }

  public PostApiV1OverviewDescribeAssetInfoRequest resourceVendor(List<ResourceVendorEnum> resourceVendor) {
    this.resourceVendor = resourceVendor;
    return this;
  }

  public PostApiV1OverviewDescribeAssetInfoRequest addResourceVendorItem(ResourceVendorEnum resourceVendorItem) {
    if (this.resourceVendor == null) {
      this.resourceVendor = new ArrayList<ResourceVendorEnum>();
    }
    this.resourceVendor.add(resourceVendorItem);
    return this;
  }

   /**
   * Get resourceVendor
   * @return resourceVendor
  **/
  @Schema(description = "")
  public List<ResourceVendorEnum> getResourceVendor() {
    return resourceVendor;
  }

  public void setResourceVendor(List<ResourceVendorEnum> resourceVendor) {
    this.resourceVendor = resourceVendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostApiV1OverviewDescribeAssetInfoRequest postApiV1OverviewDescribeAssetInfoRequest = (PostApiV1OverviewDescribeAssetInfoRequest) o;
    return Objects.equals(this.resourceCloudAccountList, postApiV1OverviewDescribeAssetInfoRequest.resourceCloudAccountList) &&
        Objects.equals(this.resourceVendor, postApiV1OverviewDescribeAssetInfoRequest.resourceVendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCloudAccountList, resourceVendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApiV1OverviewDescribeAssetInfoRequest {\n");
    
    sb.append("    resourceCloudAccountList: ").append(toIndentedString(resourceCloudAccountList)).append("\n");
    sb.append("    resourceVendor: ").append(toIndentedString(resourceVendor)).append("\n");
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