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


package org.chargebee.spi.trn.api;

import org.chargebee.spi.trn.client.ApiCallback;
import org.chargebee.spi.trn.client.ApiClient;
import org.chargebee.spi.trn.client.ApiException;
import org.chargebee.spi.trn.client.ApiResponse;
import org.chargebee.spi.trn.client.Configuration;
import org.chargebee.spi.trn.client.Pair;
import org.chargebee.spi.trn.client.ProgressRequestBody;
import org.chargebee.spi.trn.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.chargebee.spi.trn.model.BasicErrorResponse;
import org.chargebee.spi.trn.model.HealthCheckResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HealthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HealthApi(ApiClient apiClient) {
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
     * Build call for fetchHealth
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Service is healthy. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchHealthCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/health";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchHealthValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return fetchHealthCall(_callback);

    }

    /**
     * Fetch the health status of the Service Provider.
     * This endpoint is used to fetch the health status of the Service Provider.
     * @return HealthCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Service is healthy. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public HealthCheckResponse fetchHealth() throws ApiException {
        ApiResponse<HealthCheckResponse> localVarResp = fetchHealthWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Fetch the health status of the Service Provider.
     * This endpoint is used to fetch the health status of the Service Provider.
     * @return ApiResponse&lt;HealthCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Service is healthy. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HealthCheckResponse> fetchHealthWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = fetchHealthValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch the health status of the Service Provider. (asynchronously)
     * This endpoint is used to fetch the health status of the Service Provider.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Service is healthy. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error while processing request. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is unhealthy. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchHealthAsync(final ApiCallback<HealthCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchHealthValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<HealthCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
