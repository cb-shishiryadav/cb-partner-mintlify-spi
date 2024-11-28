/*
 * Tax Registration Number Validation Service Adapter SPI
 * ## Overview Tax registration number validate is a Service Provider Interface (SPI) that helps Chargebee communicate with API platforms providing the following services: - Validate tax registration number - Validate tax registration numbers in batch  If you have an API that provides the services mentioned above and want Chargebee to be able to integrate with it, you can build an adapter service according to this specification.  ## Terminology Here's a list of terms we've used to describe this specification. ### Merchant    Chargebee’s customer who is carrying out the business of selling products. Also known as the Seller. The Seller has one or more Chargebee accounts. ### Chargebee   The SaaS which manages subscriptions and revenue operations on behalf of the Merchant. Chargebee makes API calls to the Tax Service Adapter for tax estimation and tax filing of transactions between the Merchant and the Customer. ### Customer  Merchant’s customer who purchases products from the Merchant. Their customer record(s) and other details are stored within Chargebee under the Merchant’s account. ### Service Provider The service which provides services for merchants. ### Service Adapter  The SPI for which the spec is defined in this document. This adapter serves the following purposes: - Translates API requests (as defined in this document) from Chargebee to the request format specified by the Service Provider's API. - Translates API responses from the Service Provider APIs to the format understood by Chargebee (as defined in this document). ### Authorization Chargebee uses HTTP header-based authorization for all the API endpoints associated with Service Adapter. We dynamically pass this authorization key in the HTTP header. The parameter that holds this key is found in the JSON object `api_configuration` required for configuring your onboarding on Chargebee's marketplace. In the `api_configuration` object, our [Taxes Service Adapter SPI](https://chargebee.atlassian.net/l/cp/ca5aZ1mA) checks the authorization key parameter from `credential_configuration.id` and creates the HTTP header-based input query parameter for authorization. The `credential_configuration` is an array of objects with an `id` attribute, and the value of `id` is the parameter containing the authorization key.      Following are the JSON snippets for your reference.       ```json       \"api_configuration\": {           \"api_base_url\": \"https://xyz.abc.com/chargebee\",           \"credential_configuration\": [              {               \"id\":\"authorization_key\",               \"name\": \"Authorization Key\",                \"type\": \"text\",               \"is_sensitive\": true              },             {               \"id\": \"client_secret\",               \"name\": \"Client Secret\",               \"type\": \"text\",               \"is_sensitive\": true             }           ]         }    ``` 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.chargebee.spi.trn.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.chargebee.spi.trn.model.BusinessStatus;
import org.chargebee.spi.trn.model.Country;
import org.chargebee.spi.trn.model.TrnStatus;

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

import org.chargebee.spi.trn.client.JSON;

/**
 * Contains the required properties for tax registration number validation response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrnValidateResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_TRN = "trn";
  @SerializedName(SERIALIZED_NAME_TRN)
  private String trn;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TRN_STATUS = "trnStatus";
  @SerializedName(SERIALIZED_NAME_TRN_STATUS)
  private TrnStatus trnStatus;

  public static final String SERIALIZED_NAME_IS_BUSINESS = "isBusiness";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS)
  private Boolean isBusiness;

  public static final String SERIALIZED_NAME_IS_REGISTERED = "isRegistered";
  @SerializedName(SERIALIZED_NAME_IS_REGISTERED)
  private Boolean isRegistered;

  public static final String SERIALIZED_NAME_BUSINESS_STATUS = "businessStatus";
  @SerializedName(SERIALIZED_NAME_BUSINESS_STATUS)
  private BusinessStatus businessStatus;

  public static final String SERIALIZED_NAME_VALIDATION_DATA_SOURCE = "validationDataSource";
  @SerializedName(SERIALIZED_NAME_VALIDATION_DATA_SOURCE)
  private String validationDataSource;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public TrnValidateResponse() {
  }

  public TrnValidateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique id of the request, this is to refer later to fetch the response.
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public TrnValidateResponse trn(String trn) {
    
    this.trn = trn;
    return this;
  }

   /**
   * Tax registration number
   * @return trn
  **/
  @javax.annotation.Nonnull
  public String getTrn() {
    return trn;
  }


  public void setTrn(String trn) {
    this.trn = trn;
  }


  public TrnValidateResponse country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public TrnValidateResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity(may be an individual or a business company) who owns the tax registration number
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrnValidateResponse address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of the entity(may be an individual or a business company) who owns the tax registration number
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TrnValidateResponse trnStatus(TrnStatus trnStatus) {
    
    this.trnStatus = trnStatus;
    return this;
  }

   /**
   * Get trnStatus
   * @return trnStatus
  **/
  @javax.annotation.Nullable
  public TrnStatus getTrnStatus() {
    return trnStatus;
  }


  public void setTrnStatus(TrnStatus trnStatus) {
    this.trnStatus = trnStatus;
  }


  public TrnValidateResponse isBusiness(Boolean isBusiness) {
    
    this.isBusiness = isBusiness;
    return this;
  }

   /**
   * Indicates that tax registration number belong to a business entity or not.
   * @return isBusiness
  **/
  @javax.annotation.Nullable
  public Boolean getIsBusiness() {
    return isBusiness;
  }


  public void setIsBusiness(Boolean isBusiness) {
    this.isBusiness = isBusiness;
  }


  public TrnValidateResponse isRegistered(Boolean isRegistered) {
    
    this.isRegistered = isRegistered;
    return this;
  }

   /**
   * Indicates that tax registration number is registered or not
   * @return isRegistered
  **/
  @javax.annotation.Nullable
  public Boolean getIsRegistered() {
    return isRegistered;
  }


  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }


  public TrnValidateResponse businessStatus(BusinessStatus businessStatus) {
    
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @javax.annotation.Nullable
  public BusinessStatus getBusinessStatus() {
    return businessStatus;
  }


  public void setBusinessStatus(BusinessStatus businessStatus) {
    this.businessStatus = businessStatus;
  }


  public TrnValidateResponse validationDataSource(String validationDataSource) {
    
    this.validationDataSource = validationDataSource;
    return this;
  }

   /**
   * Indicates name of the source of tax registration number validation (like database, vies)
   * @return validationDataSource
  **/
  @javax.annotation.Nullable
  public String getValidationDataSource() {
    return validationDataSource;
  }


  public void setValidationDataSource(String validationDataSource) {
    this.validationDataSource = validationDataSource;
  }


  public TrnValidateResponse externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The externalId passed in the request
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public TrnValidateResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Any message about tax registration number validation request
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrnValidateResponse trnValidateResponse = (TrnValidateResponse) o;
    return Objects.equals(this.requestId, trnValidateResponse.requestId) &&
        Objects.equals(this.trn, trnValidateResponse.trn) &&
        Objects.equals(this.country, trnValidateResponse.country) &&
        Objects.equals(this.name, trnValidateResponse.name) &&
        Objects.equals(this.address, trnValidateResponse.address) &&
        Objects.equals(this.trnStatus, trnValidateResponse.trnStatus) &&
        Objects.equals(this.isBusiness, trnValidateResponse.isBusiness) &&
        Objects.equals(this.isRegistered, trnValidateResponse.isRegistered) &&
        Objects.equals(this.businessStatus, trnValidateResponse.businessStatus) &&
        Objects.equals(this.validationDataSource, trnValidateResponse.validationDataSource) &&
        Objects.equals(this.externalId, trnValidateResponse.externalId) &&
        Objects.equals(this.message, trnValidateResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, trn, country, name, address, trnStatus, isBusiness, isRegistered, businessStatus, validationDataSource, externalId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnValidateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    trnStatus: ").append(toIndentedString(trnStatus)).append("\n");
    sb.append("    isBusiness: ").append(toIndentedString(isBusiness)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    validationDataSource: ").append(toIndentedString(validationDataSource)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("requestId");
    openapiFields.add("trn");
    openapiFields.add("country");
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("trnStatus");
    openapiFields.add("isBusiness");
    openapiFields.add("isRegistered");
    openapiFields.add("businessStatus");
    openapiFields.add("validationDataSource");
    openapiFields.add("externalId");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("trn");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TrnValidateResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrnValidateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrnValidateResponse is not found in the empty JSON string", TrnValidateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrnValidateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrnValidateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrnValidateResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if (!jsonObj.get("trn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trn").toString()));
      }
      // validate the required field `country`
      Country.validateJsonElement(jsonObj.get("country"));
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("validationDataSource") != null && !jsonObj.get("validationDataSource").isJsonNull()) && !jsonObj.get("validationDataSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationDataSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationDataSource").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrnValidateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrnValidateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrnValidateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrnValidateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TrnValidateResponse>() {
           @Override
           public void write(JsonWriter out, TrnValidateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrnValidateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrnValidateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrnValidateResponse
  * @throws IOException if the JSON string is invalid with respect to TrnValidateResponse
  */
  public static TrnValidateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrnValidateResponse.class);
  }

 /**
  * Convert an instance of TrnValidateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

