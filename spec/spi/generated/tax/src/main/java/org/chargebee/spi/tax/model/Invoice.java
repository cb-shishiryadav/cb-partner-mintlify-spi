/*
 * Taxes Service Adapter SPI
 * ## Overview Tax Service Adapter is a Service Provider Interface (SPI) that helps Chargebee communicate with API platforms providing the following services: - Address validation - Estimating taxes for sales - Submitting invoices for tax filing  If you have an API that provides the services mentioned above and want Chargebee to be able to integrate with it, you can build an adapter service according to this specification.  ## Terminology Here's a list of terms we've used to describe this specification. ### Merchant    Chargebee’s customer who is carrying out the business of selling products. Also known as the Seller. The Seller has one or more Chargebee accounts. ### Chargebee   The SaaS which manages subscriptions and revenue operations on behalf of the Merchant. Chargebee makes API calls to the Tax Service Adapter for tax estimation and tax filing of transactions between the Merchant and the Customer. ### Customer  Merchant’s customer who purchases products from the Merchant. Their customer record(s) and other details are stored within Chargebee under the Merchant’s account. ### Tax Authority The institution, usually a government, that is responsible for collecting taxes for commercial transactions between Merchants and their Customers.   ### Tax Service Provider The service which provides tax estimation and tax filing services for merchants. ### Tax Service Adapter  The SPI for which the spec is defined in this document. This adapter serves the following purposes: - Translates API requests (as defined in this document) from Chargebee to the request format specified by the Tax Service Provider's API. - Translates API responses from the Tax Service Provider APIs to the format understood by Chargebee (as defined in this document). ### Authorization Chargebee uses HTTP header-based authorization for all the API endpoints associated with Tax Service Adapter. We dynamically pass this authorization key in the HTTP header. The parameter that holds this key is found in the JSON object `api_configuration` required for configuring your onboarding on Chargebee's marketplace. In the `api_configuration` object, our [Taxes Service Adapter SPI](https://chargebee.atlassian.net/l/cp/ca5aZ1mA) checks the authorization key parameter from `credential_configuration.id` and creates the HTTP header-based input query parameter for authorization. The `credential_configuration` is an array of objects with an `id` attribute, and the value of `id` is the parameter containing the authorization key.    Following are the JSON snippets for your reference.     ```json       \"api_configuration\": {           \"api_base_url\": \"https://xyz.abc.com/chargebee\",           \"credential_configuration\": [              {               \"id\":\"authorization_key\",               \"name\": \"Authorization Key\",                \"type\": \"text\",               \"is_sensitive\": true              },             {               \"id\": \"client_secret\",               \"name\": \"Client Secret\",               \"type\": \"text\",               \"is_sensitive\": true             }           ]         }    ```     `\"Authorization\":\"{\"<authorization_key>\":\"test_GykCvTykZFTBqHQAFzjMN9R1Thgdho0Q\"}\"` 
 *
 * The version of the OpenAPI document: 0.3.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.chargebee.spi.tax.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chargebee.spi.tax.model.Customer;
import org.chargebee.spi.tax.model.DocumentStatus;
import org.chargebee.spi.tax.model.InvoiceLineItem;
import org.chargebee.spi.tax.model.Seller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.chargebee.spi.tax.client.JSON;

/**
 * The details of an invoice as returned by the Tax Service Adapter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Invoice {
  public static final String SERIALIZED_NAME_INVOICE_ID = "invoiceId";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoiceCode";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_DOCUMENT_DATE_TIME = "documentDateTime";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DATE_TIME)
  private OffsetDateTime documentDateTime;

  public static final String SERIALIZED_NAME_TAX_DATE_TIME = "taxDateTime";
  @SerializedName(SERIALIZED_NAME_TAX_DATE_TIME)
  private OffsetDateTime taxDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentStatus status;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private Seller seller;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private Double subtotal;

  public static final String SERIALIZED_NAME_EXEMPT_AMOUNT = "exemptAmount";
  @SerializedName(SERIALIZED_NAME_EXEMPT_AMOUNT)
  private Double exemptAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Double discountAmount;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT = "taxableAmount";
  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT)
  private Double taxableAmount;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "taxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Double taxAmount;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<InvoiceLineItem> lineItems = new ArrayList<>();

  public Invoice() {
  }

  public Invoice invoiceId(String invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The unique identifier of the invoice in the Tax Service Adapter or the Tax Service Provider.
   * @return invoiceId
  **/
  @javax.annotation.Nonnull
  public String getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }


  public Invoice invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * The unique identifier of the invoice in Chargebee.
   * @return invoiceCode
  **/
  @javax.annotation.Nonnull
  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public Invoice documentDateTime(OffsetDateTime documentDateTime) {
    
    this.documentDateTime = documentDateTime;
    return this;
  }

   /**
   * The date and time at which the invoice was generated in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the &#39;Z&#39; indicating that the time is in UTC.
   * @return documentDateTime
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDocumentDateTime() {
    return documentDateTime;
  }


  public void setDocumentDateTime(OffsetDateTime documentDateTime) {
    this.documentDateTime = documentDateTime;
  }


  public Invoice taxDateTime(OffsetDateTime taxDateTime) {
    
    this.taxDateTime = taxDateTime;
    return this;
  }

   /**
   * The date and time at which the tax was applicable in Chargebee. For example, if the value is 2022-10-28T15:36:28.129+05:30, then the timestamp represents October 28, 2022, at 15:36:28.129, with an offset of +05:30. This means that the time represented is 5 hours and 30 minutes ahead of UTC/GMT.In the case of a merchant site located in UTC, these data types would send a timestamp in the format 2022-11-11T15:40:44.65Z. This timestamp represents November 11, 2022, at 15:40:44.65, with the &#39;Z&#39; indicating that the time is in UTC.
   * @return taxDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTaxDateTime() {
    return taxDateTime;
  }


  public void setTaxDateTime(OffsetDateTime taxDateTime) {
    this.taxDateTime = taxDateTime;
  }


  public Invoice status(DocumentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public DocumentStatus getStatus() {
    return status;
  }


  public void setStatus(DocumentStatus status) {
    this.status = status;
  }


  public Invoice currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The [currency](https://en.wikipedia.org/wiki/Currency) in the [ISO-4217 format](https://www.iso.org/iso-4217-currency-codes.html).
   * @return currency
  **/
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Invoice seller(Seller seller) {
    
    this.seller = seller;
    return this;
  }

   /**
   * Get seller
   * @return seller
  **/
  @javax.annotation.Nonnull
  public Seller getSeller() {
    return seller;
  }


  public void setSeller(Seller seller) {
    this.seller = seller;
  }


  public Invoice customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public Invoice subtotal(Double subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * The amount after discounts. This is the sum of all &#x60;lineItems.subtotal&#x60;.
   * @return subtotal
  **/
  @javax.annotation.Nonnull
  public Double getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }


  public Invoice exemptAmount(Double exemptAmount) {
    
    this.exemptAmount = exemptAmount;
    return this;
  }

   /**
   * The part of the &#x60;subtotal&#x60; that is exempted from tax.
   * @return exemptAmount
  **/
  @javax.annotation.Nonnull
  public Double getExemptAmount() {
    return exemptAmount;
  }


  public void setExemptAmount(Double exemptAmount) {
    this.exemptAmount = exemptAmount;
  }


  public Invoice discountAmount(Double discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The total discount applied. This is the sum of all &#x60;lineItems.discount&#x60;.
   * @return discountAmount
  **/
  @javax.annotation.Nonnull
  public Double getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public Invoice taxableAmount(Double taxableAmount) {
    
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * The part of the &#x60;subtotal&#x60; that is taxable.
   * @return taxableAmount
  **/
  @javax.annotation.Nonnull
  public Double getTaxableAmount() {
    return taxableAmount;
  }


  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }


  public Invoice taxAmount(Double taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The total tax payable. This is the sum of all &#x60;lineItems.taxAmount&#x60;.
   * @return taxAmount
  **/
  @javax.annotation.Nonnull
  public Double getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  public Invoice total(Double total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total after discounts and taxes. This is the same as &#x60;subtotal&#x60; if it is tax inclusive; otherwise it is &#x60;subtotal&#x60; + &#x60;taxAmount&#x60;. &#x60;total&#x60; can also be expressed as &#x60;exemptAmount&#x60; + &#x60;taxableAmount&#x60; + &#x60;taxAmount&#x60;.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    this.total = total;
  }


  public Invoice lineItems(List<InvoiceLineItem> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(InvoiceLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @javax.annotation.Nonnull
  public List<InvoiceLineItem> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.invoiceCode, invoice.invoiceCode) &&
        Objects.equals(this.documentDateTime, invoice.documentDateTime) &&
        Objects.equals(this.taxDateTime, invoice.taxDateTime) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.seller, invoice.seller) &&
        Objects.equals(this.customer, invoice.customer) &&
        Objects.equals(this.subtotal, invoice.subtotal) &&
        Objects.equals(this.exemptAmount, invoice.exemptAmount) &&
        Objects.equals(this.discountAmount, invoice.discountAmount) &&
        Objects.equals(this.taxableAmount, invoice.taxableAmount) &&
        Objects.equals(this.taxAmount, invoice.taxAmount) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.lineItems, invoice.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceCode, documentDateTime, taxDateTime, status, currency, seller, customer, subtotal, exemptAmount, discountAmount, taxableAmount, taxAmount, total, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    documentDateTime: ").append(toIndentedString(documentDateTime)).append("\n");
    sb.append("    taxDateTime: ").append(toIndentedString(taxDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("invoiceId");
    openapiFields.add("invoiceCode");
    openapiFields.add("documentDateTime");
    openapiFields.add("taxDateTime");
    openapiFields.add("status");
    openapiFields.add("currency");
    openapiFields.add("seller");
    openapiFields.add("customer");
    openapiFields.add("subtotal");
    openapiFields.add("exemptAmount");
    openapiFields.add("discountAmount");
    openapiFields.add("taxableAmount");
    openapiFields.add("taxAmount");
    openapiFields.add("total");
    openapiFields.add("lineItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoiceId");
    openapiRequiredFields.add("invoiceCode");
    openapiRequiredFields.add("documentDateTime");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("seller");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("subtotal");
    openapiRequiredFields.add("exemptAmount");
    openapiRequiredFields.add("discountAmount");
    openapiRequiredFields.add("taxableAmount");
    openapiRequiredFields.add("taxAmount");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("lineItems");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Invoice
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Invoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Invoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invoice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Invoice.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("invoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceId").toString()));
      }
      if (!jsonObj.get("invoiceCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceCode").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `seller`
      Seller.validateJsonElement(jsonObj.get("seller"));
      // validate the required field `customer`
      Customer.validateJsonElement(jsonObj.get("customer"));
      // ensure the json data is an array
      if (!jsonObj.get("lineItems").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineItems` to be an array in the JSON string but got `%s`", jsonObj.get("lineItems").toString()));
      }

      JsonArray jsonArraylineItems = jsonObj.getAsJsonArray("lineItems");
      // validate the required field `lineItems` (array)
      for (int i = 0; i < jsonArraylineItems.size(); i++) {
        InvoiceLineItem.validateJsonElement(jsonArraylineItems.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invoice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Invoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invoice
  * @throws IOException if the JSON string is invalid with respect to Invoice
  */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

 /**
  * Convert an instance of Invoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

