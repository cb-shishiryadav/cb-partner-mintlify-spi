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


package org.chargebee.spi.tax.api;

import org.chargebee.spi.tax.client.ApiCallback;
import org.chargebee.spi.tax.client.ApiClient;
import org.chargebee.spi.tax.client.ApiException;
import org.chargebee.spi.tax.client.ApiResponse;
import org.chargebee.spi.tax.client.Configuration;
import org.chargebee.spi.tax.client.Pair;
import org.chargebee.spi.tax.client.ProgressRequestBody;
import org.chargebee.spi.tax.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.chargebee.spi.tax.model.AddressValidationRequest;
import org.chargebee.spi.tax.model.AddressValidationResponse;
import org.chargebee.spi.tax.model.BasicErrorResponse;
import org.chargebee.spi.tax.model.CheckAddressTaxabilityRequest;
import org.chargebee.spi.tax.model.CheckAddressTaxabilityResponse;
import org.chargebee.spi.tax.model.HealthCheckResponse;
import org.chargebee.spi.tax.model.ValidationErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for checkAddressTaxability
     * @param checkAddressTaxabilityRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax can be calculated for the address provided. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkAddressTaxabilityCall(CheckAddressTaxabilityRequest checkAddressTaxabilityRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = checkAddressTaxabilityRequest;

        // create path and map variables
        String localVarPath = "/address/check-taxability";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkAddressTaxabilityValidateBeforeCall(CheckAddressTaxabilityRequest checkAddressTaxabilityRequest, final ApiCallback _callback) throws ApiException {
        return checkAddressTaxabilityCall(checkAddressTaxabilityRequest, _callback);

    }

    /**
     * Check taxability
     * Checks whether the tax address is valid in terms of tax calculation. This endpoint checks whether the address information of the customer is sufficient for the tax provider to return a tax rate. It does not consider the nexus status of the merchant and is mandatory to integrate for the tax provider.
     * @param checkAddressTaxabilityRequest  (optional)
     * @return CheckAddressTaxabilityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax can be calculated for the address provided. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public CheckAddressTaxabilityResponse checkAddressTaxability(CheckAddressTaxabilityRequest checkAddressTaxabilityRequest) throws ApiException {
        ApiResponse<CheckAddressTaxabilityResponse> localVarResp = checkAddressTaxabilityWithHttpInfo(checkAddressTaxabilityRequest);
        return localVarResp.getData();
    }

    /**
     * Check taxability
     * Checks whether the tax address is valid in terms of tax calculation. This endpoint checks whether the address information of the customer is sufficient for the tax provider to return a tax rate. It does not consider the nexus status of the merchant and is mandatory to integrate for the tax provider.
     * @param checkAddressTaxabilityRequest  (optional)
     * @return ApiResponse&lt;CheckAddressTaxabilityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax can be calculated for the address provided. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CheckAddressTaxabilityResponse> checkAddressTaxabilityWithHttpInfo(CheckAddressTaxabilityRequest checkAddressTaxabilityRequest) throws ApiException {
        okhttp3.Call localVarCall = checkAddressTaxabilityValidateBeforeCall(checkAddressTaxabilityRequest, null);
        Type localVarReturnType = new TypeToken<CheckAddressTaxabilityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check taxability (asynchronously)
     * Checks whether the tax address is valid in terms of tax calculation. This endpoint checks whether the address information of the customer is sufficient for the tax provider to return a tax rate. It does not consider the nexus status of the merchant and is mandatory to integrate for the tax provider.
     * @param checkAddressTaxabilityRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Tax can be calculated for the address provided. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkAddressTaxabilityAsync(CheckAddressTaxabilityRequest checkAddressTaxabilityRequest, final ApiCallback<CheckAddressTaxabilityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkAddressTaxabilityValidateBeforeCall(checkAddressTaxabilityRequest, _callback);
        Type localVarReturnType = new TypeToken<CheckAddressTaxabilityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateAddress
     * @param addressValidationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Address is validated successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateAddressCall(AddressValidationRequest addressValidationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addressValidationRequest;

        // create path and map variables
        String localVarPath = "/address/validate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateAddressValidateBeforeCall(AddressValidationRequest addressValidationRequest, final ApiCallback _callback) throws ApiException {
        return validateAddressCall(addressValidationRequest, _callback);

    }

    /**
     * Address validation
     * Checks whether a given address is a valid delivery address for shipping purposes. The tax provider can decide whether to mention the full or valid address depending on their requirement.
     * @param addressValidationRequest  (optional)
     * @return AddressValidationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Address is validated successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public AddressValidationResponse validateAddress(AddressValidationRequest addressValidationRequest) throws ApiException {
        ApiResponse<AddressValidationResponse> localVarResp = validateAddressWithHttpInfo(addressValidationRequest);
        return localVarResp.getData();
    }

    /**
     * Address validation
     * Checks whether a given address is a valid delivery address for shipping purposes. The tax provider can decide whether to mention the full or valid address depending on their requirement.
     * @param addressValidationRequest  (optional)
     * @return ApiResponse&lt;AddressValidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Address is validated successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressValidationResponse> validateAddressWithHttpInfo(AddressValidationRequest addressValidationRequest) throws ApiException {
        okhttp3.Call localVarCall = validateAddressValidateBeforeCall(addressValidationRequest, null);
        Type localVarReturnType = new TypeToken<AddressValidationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Address validation (asynchronously)
     * Checks whether a given address is a valid delivery address for shipping purposes. The tax provider can decide whether to mention the full or valid address depending on their requirement.
     * @param addressValidationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Address is validated successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateAddressAsync(AddressValidationRequest addressValidationRequest, final ApiCallback<AddressValidationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateAddressValidateBeforeCall(addressValidationRequest, _callback);
        Type localVarReturnType = new TypeToken<AddressValidationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}