/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAmortizedCostBillDetailRequest
 */


public class ListAmortizedCostBillDetailRequest {
  @SerializedName("AmortizedDay")
  private String amortizedDay = null;

  @SerializedName("AmortizedMonth")
  private String amortizedMonth = null;

  @SerializedName("AmortizedType")
  private List<String> amortizedType = null;

  @SerializedName("BillCategory")
  private List<String> billCategory = null;

  @SerializedName("BillPeriod")
  private String billPeriod = null;

  @SerializedName("BillingMode")
  private List<String> billingMode = null;

  @SerializedName("IgnoreZero")
  private Integer ignoreZero = null;

  @SerializedName("InstanceNo")
  private String instanceNo = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("NeedRecordNum")
  private Integer needRecordNum = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("Product")
  private List<String> product = null;

  public ListAmortizedCostBillDetailRequest amortizedDay(String amortizedDay) {
    this.amortizedDay = amortizedDay;
    return this;
  }

   /**
   * Get amortizedDay
   * @return amortizedDay
  **/
  @Schema(description = "")
  public String getAmortizedDay() {
    return amortizedDay;
  }

  public void setAmortizedDay(String amortizedDay) {
    this.amortizedDay = amortizedDay;
  }

  public ListAmortizedCostBillDetailRequest amortizedMonth(String amortizedMonth) {
    this.amortizedMonth = amortizedMonth;
    return this;
  }

   /**
   * Get amortizedMonth
   * @return amortizedMonth
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAmortizedMonth() {
    return amortizedMonth;
  }

  public void setAmortizedMonth(String amortizedMonth) {
    this.amortizedMonth = amortizedMonth;
  }

  public ListAmortizedCostBillDetailRequest amortizedType(List<String> amortizedType) {
    this.amortizedType = amortizedType;
    return this;
  }

  public ListAmortizedCostBillDetailRequest addAmortizedTypeItem(String amortizedTypeItem) {
    if (this.amortizedType == null) {
      this.amortizedType = new ArrayList<String>();
    }
    this.amortizedType.add(amortizedTypeItem);
    return this;
  }

   /**
   * Get amortizedType
   * @return amortizedType
  **/
  @Schema(description = "")
  public List<String> getAmortizedType() {
    return amortizedType;
  }

  public void setAmortizedType(List<String> amortizedType) {
    this.amortizedType = amortizedType;
  }

  public ListAmortizedCostBillDetailRequest billCategory(List<String> billCategory) {
    this.billCategory = billCategory;
    return this;
  }

  public ListAmortizedCostBillDetailRequest addBillCategoryItem(String billCategoryItem) {
    if (this.billCategory == null) {
      this.billCategory = new ArrayList<String>();
    }
    this.billCategory.add(billCategoryItem);
    return this;
  }

   /**
   * Get billCategory
   * @return billCategory
  **/
  @Schema(description = "")
  public List<String> getBillCategory() {
    return billCategory;
  }

  public void setBillCategory(List<String> billCategory) {
    this.billCategory = billCategory;
  }

  public ListAmortizedCostBillDetailRequest billPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
    return this;
  }

   /**
   * Get billPeriod
   * @return billPeriod
  **/
  @Schema(description = "")
  public String getBillPeriod() {
    return billPeriod;
  }

  public void setBillPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
  }

  public ListAmortizedCostBillDetailRequest billingMode(List<String> billingMode) {
    this.billingMode = billingMode;
    return this;
  }

  public ListAmortizedCostBillDetailRequest addBillingModeItem(String billingModeItem) {
    if (this.billingMode == null) {
      this.billingMode = new ArrayList<String>();
    }
    this.billingMode.add(billingModeItem);
    return this;
  }

   /**
   * Get billingMode
   * @return billingMode
  **/
  @Schema(description = "")
  public List<String> getBillingMode() {
    return billingMode;
  }

  public void setBillingMode(List<String> billingMode) {
    this.billingMode = billingMode;
  }

  public ListAmortizedCostBillDetailRequest ignoreZero(Integer ignoreZero) {
    this.ignoreZero = ignoreZero;
    return this;
  }

   /**
   * Get ignoreZero
   * @return ignoreZero
  **/
  @Schema(description = "")
  public Integer getIgnoreZero() {
    return ignoreZero;
  }

  public void setIgnoreZero(Integer ignoreZero) {
    this.ignoreZero = ignoreZero;
  }

  public ListAmortizedCostBillDetailRequest instanceNo(String instanceNo) {
    this.instanceNo = instanceNo;
    return this;
  }

   /**
   * Get instanceNo
   * @return instanceNo
  **/
  @Schema(description = "")
  public String getInstanceNo() {
    return instanceNo;
  }

  public void setInstanceNo(String instanceNo) {
    this.instanceNo = instanceNo;
  }

  public ListAmortizedCostBillDetailRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListAmortizedCostBillDetailRequest needRecordNum(Integer needRecordNum) {
    this.needRecordNum = needRecordNum;
    return this;
  }

   /**
   * Get needRecordNum
   * @return needRecordNum
  **/
  @Schema(description = "")
  public Integer getNeedRecordNum() {
    return needRecordNum;
  }

  public void setNeedRecordNum(Integer needRecordNum) {
    this.needRecordNum = needRecordNum;
  }

  public ListAmortizedCostBillDetailRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListAmortizedCostBillDetailRequest product(List<String> product) {
    this.product = product;
    return this;
  }

  public ListAmortizedCostBillDetailRequest addProductItem(String productItem) {
    if (this.product == null) {
      this.product = new ArrayList<String>();
    }
    this.product.add(productItem);
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public List<String> getProduct() {
    return product;
  }

  public void setProduct(List<String> product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAmortizedCostBillDetailRequest listAmortizedCostBillDetailRequest = (ListAmortizedCostBillDetailRequest) o;
    return Objects.equals(this.amortizedDay, listAmortizedCostBillDetailRequest.amortizedDay) &&
        Objects.equals(this.amortizedMonth, listAmortizedCostBillDetailRequest.amortizedMonth) &&
        Objects.equals(this.amortizedType, listAmortizedCostBillDetailRequest.amortizedType) &&
        Objects.equals(this.billCategory, listAmortizedCostBillDetailRequest.billCategory) &&
        Objects.equals(this.billPeriod, listAmortizedCostBillDetailRequest.billPeriod) &&
        Objects.equals(this.billingMode, listAmortizedCostBillDetailRequest.billingMode) &&
        Objects.equals(this.ignoreZero, listAmortizedCostBillDetailRequest.ignoreZero) &&
        Objects.equals(this.instanceNo, listAmortizedCostBillDetailRequest.instanceNo) &&
        Objects.equals(this.limit, listAmortizedCostBillDetailRequest.limit) &&
        Objects.equals(this.needRecordNum, listAmortizedCostBillDetailRequest.needRecordNum) &&
        Objects.equals(this.offset, listAmortizedCostBillDetailRequest.offset) &&
        Objects.equals(this.product, listAmortizedCostBillDetailRequest.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amortizedDay, amortizedMonth, amortizedType, billCategory, billPeriod, billingMode, ignoreZero, instanceNo, limit, needRecordNum, offset, product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAmortizedCostBillDetailRequest {\n");
    
    sb.append("    amortizedDay: ").append(toIndentedString(amortizedDay)).append("\n");
    sb.append("    amortizedMonth: ").append(toIndentedString(amortizedMonth)).append("\n");
    sb.append("    amortizedType: ").append(toIndentedString(amortizedType)).append("\n");
    sb.append("    billCategory: ").append(toIndentedString(billCategory)).append("\n");
    sb.append("    billPeriod: ").append(toIndentedString(billPeriod)).append("\n");
    sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
    sb.append("    ignoreZero: ").append(toIndentedString(ignoreZero)).append("\n");
    sb.append("    instanceNo: ").append(toIndentedString(instanceNo)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    needRecordNum: ").append(toIndentedString(needRecordNum)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
