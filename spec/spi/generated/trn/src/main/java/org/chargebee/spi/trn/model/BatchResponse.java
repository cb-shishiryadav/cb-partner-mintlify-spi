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
import org.chargebee.spi.trn.model.Status;

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
 * Contains the required properties for response of batch request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchResponse {
  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_BATCH_NAME = "batchName";
  @SerializedName(SERIALIZED_NAME_BATCH_NAME)
  private String batchName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_COMPLETION_PERCENTAGE = "completionPercentage";
  @SerializedName(SERIALIZED_NAME_COMPLETION_PERCENTAGE)
  private Integer completionPercentage;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public BatchResponse() {
  }

  public BatchResponse batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Id of the batch request.
   * @return batchId
  **/
  @javax.annotation.Nonnull
  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public BatchResponse batchName(String batchName) {
    
    this.batchName = batchName;
    return this;
  }

   /**
   * Name of the batch request.
   * @return batchName
  **/
  @javax.annotation.Nullable
  public String getBatchName() {
    return batchName;
  }


  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  public BatchResponse status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


  public BatchResponse limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Use for the pagination for batch request, limit indicates the maximum number of records to be returned in the response.
   * @return limit
  **/
  @javax.annotation.Nonnull
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public BatchResponse offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Use for the pagination for batch request, offset indicates the starting point of records to be returned in the response.
   * @return offset
  **/
  @javax.annotation.Nonnull
  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public BatchResponse completionPercentage(Integer completionPercentage) {
    
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Percentage of batch request processing.
   * @return completionPercentage
  **/
  @javax.annotation.Nullable
  public Integer getCompletionPercentage() {
    return completionPercentage;
  }


  public void setCompletionPercentage(Integer completionPercentage) {
    this.completionPercentage = completionPercentage;
  }


  public BatchResponse externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The externalId passed in request.
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.batchId, batchResponse.batchId) &&
        Objects.equals(this.batchName, batchResponse.batchName) &&
        Objects.equals(this.status, batchResponse.status) &&
        Objects.equals(this.limit, batchResponse.limit) &&
        Objects.equals(this.offset, batchResponse.offset) &&
        Objects.equals(this.completionPercentage, batchResponse.completionPercentage) &&
        Objects.equals(this.externalId, batchResponse.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, status, limit, offset, completionPercentage, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("batchId");
    openapiFields.add("batchName");
    openapiFields.add("status");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("completionPercentage");
    openapiFields.add("externalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batchId");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("offset");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BatchResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchResponse is not found in the empty JSON string", BatchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("batchId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchId").toString()));
      }
      if ((jsonObj.get("batchName") != null && !jsonObj.get("batchName").isJsonNull()) && !jsonObj.get("batchName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchName").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchResponse>() {
           @Override
           public void write(JsonWriter out, BatchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchResponse
  * @throws IOException if the JSON string is invalid with respect to BatchResponse
  */
  public static BatchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchResponse.class);
  }

 /**
  * Convert an instance of BatchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
