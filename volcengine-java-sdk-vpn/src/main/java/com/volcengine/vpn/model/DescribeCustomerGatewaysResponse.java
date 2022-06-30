/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.CustomerGatewayForDescribeCustomerGatewaysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCustomerGatewaysResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:32.674934+08:00[Asia/Shanghai]")
public class DescribeCustomerGatewaysResponse {
  @SerializedName("CustomerGateways")
  private List<CustomerGatewayForDescribeCustomerGatewaysOutput> customerGateways = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCustomerGatewaysResponse customerGateways(List<CustomerGatewayForDescribeCustomerGatewaysOutput> customerGateways) {
    this.customerGateways = customerGateways;
    return this;
  }

  public DescribeCustomerGatewaysResponse addCustomerGatewaysItem(CustomerGatewayForDescribeCustomerGatewaysOutput customerGatewaysItem) {
    if (this.customerGateways == null) {
      this.customerGateways = new ArrayList<CustomerGatewayForDescribeCustomerGatewaysOutput>();
    }
    this.customerGateways.add(customerGatewaysItem);
    return this;
  }

   /**
   * Get customerGateways
   * @return customerGateways
  **/
  @Valid
  @Schema(description = "")
  public List<CustomerGatewayForDescribeCustomerGatewaysOutput> getCustomerGateways() {
    return customerGateways;
  }

  public void setCustomerGateways(List<CustomerGatewayForDescribeCustomerGatewaysOutput> customerGateways) {
    this.customerGateways = customerGateways;
  }

  public DescribeCustomerGatewaysResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeCustomerGatewaysResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeCustomerGatewaysResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeCustomerGatewaysResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCustomerGatewaysResponse describeCustomerGatewaysResponse = (DescribeCustomerGatewaysResponse) o;
    return Objects.equals(this.customerGateways, describeCustomerGatewaysResponse.customerGateways) &&
        Objects.equals(this.pageNumber, describeCustomerGatewaysResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCustomerGatewaysResponse.pageSize) &&
        Objects.equals(this.requestId, describeCustomerGatewaysResponse.requestId) &&
        Objects.equals(this.totalCount, describeCustomerGatewaysResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerGateways, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCustomerGatewaysResponse {\n");
    
    sb.append("    customerGateways: ").append(toIndentedString(customerGateways)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
