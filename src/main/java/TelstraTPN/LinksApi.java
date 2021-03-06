/*
 * Telstra Programmable Network API
 * Telstra Programmable Network is a self-provisioning platform that allows its users to create on-demand connectivity services between multiple end-points and add various network functions to those services. Programmable Network enables to connectivity to a global ecosystem of networking services as well as public and private cloud services. Once you are connected to the platform on one or more POPs (points of presence), you can start creating those services based on the use case that you want to accomplish. The Programmable Network API is available to all customers who have registered to use the Programmable Network. To register, please contact your account representative.
 *
 * OpenAPI spec version: 2.1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package TelstraTPN;

import invalidPackageName.ApiCallback;
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.ApiResponse;
import invalidPackageName.Configuration;
import invalidPackageName.Pair;
import invalidPackageName.ProgressRequestBody;
import invalidPackageName.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import TelstraTPN.InventoryLinkRequest;
import TelstraTPN.InventoryLinkResponse;
import TelstraTPN.InventoryLinksHistoryResponse;
import TelstraTPN.InventoryLinksResponse;
import TelstraTPN.Link;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinksApi {
    private ApiClient apiClient;

    public LinksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LinksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for inventoryLinkPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryLinkPostCall(InventoryLinkRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/link";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call inventoryLinkPostValidateBeforeCall(InventoryLinkRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = inventoryLinkPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Link and initial Contract
     * Create Link and initial Contract
     * @param body  (optional)
     * @return InventoryLinkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryLinkResponse inventoryLinkPost(InventoryLinkRequest body) throws ApiException {
        ApiResponse<InventoryLinkResponse> resp = inventoryLinkPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Link and initial Contract
     * Create Link and initial Contract
     * @param body  (optional)
     * @return ApiResponse&lt;InventoryLinkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryLinkResponse> inventoryLinkPostWithHttpInfo(InventoryLinkRequest body) throws ApiException {
        com.squareup.okhttp.Call call = inventoryLinkPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InventoryLinkResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Link and initial Contract (asynchronously)
     * Create Link and initial Contract
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryLinkPostAsync(InventoryLinkRequest body, final ApiCallback<InventoryLinkResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = inventoryLinkPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryLinkResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for inventoryLinksByLinkidGet
     * @param linkid Unique identifier representing a specific link (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksByLinkidGetCall(String linkid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/links/{linkid}"
            .replaceAll("\\{" + "linkid" + "\\}", apiClient.escapeString(linkid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call inventoryLinksByLinkidGetValidateBeforeCall(String linkid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'linkid' is set
        if (linkid == null) {
            throw new ApiException("Missing the required parameter 'linkid' when calling inventoryLinksByLinkidGet(Async)");
        }
        

        com.squareup.okhttp.Call call = inventoryLinksByLinkidGetCall(linkid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get details of specified link
     * Get details of specified link
     * @param linkid Unique identifier representing a specific link (required)
     * @return InventoryLinksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryLinksResponse inventoryLinksByLinkidGet(String linkid) throws ApiException {
        ApiResponse<InventoryLinksResponse> resp = inventoryLinksByLinkidGetWithHttpInfo(linkid);
        return resp.getData();
    }

    /**
     * Get details of specified link
     * Get details of specified link
     * @param linkid Unique identifier representing a specific link (required)
     * @return ApiResponse&lt;InventoryLinksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryLinksResponse> inventoryLinksByLinkidGetWithHttpInfo(String linkid) throws ApiException {
        com.squareup.okhttp.Call call = inventoryLinksByLinkidGetValidateBeforeCall(linkid, null, null);
        Type localVarReturnType = new TypeToken<InventoryLinksResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of specified link (asynchronously)
     * Get details of specified link
     * @param linkid Unique identifier representing a specific link (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksByLinkidGetAsync(String linkid, final ApiCallback<InventoryLinksResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = inventoryLinksByLinkidGetValidateBeforeCall(linkid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryLinksResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for inventoryLinksCustomerByCustomeruuidGet
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksCustomerByCustomeruuidGetCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/links/customer/{customeruuid}"
            .replaceAll("\\{" + "customeruuid" + "\\}", apiClient.escapeString(customeruuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call inventoryLinksCustomerByCustomeruuidGetValidateBeforeCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customeruuid' is set
        if (customeruuid == null) {
            throw new ApiException("Missing the required parameter 'customeruuid' when calling inventoryLinksCustomerByCustomeruuidGet(Async)");
        }
        

        com.squareup.okhttp.Call call = inventoryLinksCustomerByCustomeruuidGetCall(customeruuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get active Links
     * Get active Links
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return List&lt;Link&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Link> inventoryLinksCustomerByCustomeruuidGet(String customeruuid) throws ApiException {
        ApiResponse<List<Link>> resp = inventoryLinksCustomerByCustomeruuidGetWithHttpInfo(customeruuid);
        return resp.getData();
    }

    /**
     * Get active Links
     * Get active Links
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return ApiResponse&lt;List&lt;Link&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Link>> inventoryLinksCustomerByCustomeruuidGetWithHttpInfo(String customeruuid) throws ApiException {
        com.squareup.okhttp.Call call = inventoryLinksCustomerByCustomeruuidGetValidateBeforeCall(customeruuid, null, null);
        Type localVarReturnType = new TypeToken<List<Link>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get active Links (asynchronously)
     * Get active Links
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksCustomerByCustomeruuidGetAsync(String customeruuid, final ApiCallback<List<Link>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = inventoryLinksCustomerByCustomeruuidGetValidateBeforeCall(customeruuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Link>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for inventoryLinksHistoryByLinkidGet
     * @param linkid Unique identifier representing a specific link (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksHistoryByLinkidGetCall(String linkid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/links/history/{linkid}"
            .replaceAll("\\{" + "linkid" + "\\}", apiClient.escapeString(linkid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call inventoryLinksHistoryByLinkidGetValidateBeforeCall(String linkid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'linkid' is set
        if (linkid == null) {
            throw new ApiException("Missing the required parameter 'linkid' when calling inventoryLinksHistoryByLinkidGet(Async)");
        }
        

        com.squareup.okhttp.Call call = inventoryLinksHistoryByLinkidGetCall(linkid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Link history
     * Get Link history
     * @param linkid Unique identifier representing a specific link (required)
     * @return InventoryLinksHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryLinksHistoryResponse inventoryLinksHistoryByLinkidGet(String linkid) throws ApiException {
        ApiResponse<InventoryLinksHistoryResponse> resp = inventoryLinksHistoryByLinkidGetWithHttpInfo(linkid);
        return resp.getData();
    }

    /**
     * Get Link history
     * Get Link history
     * @param linkid Unique identifier representing a specific link (required)
     * @return ApiResponse&lt;InventoryLinksHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryLinksHistoryResponse> inventoryLinksHistoryByLinkidGetWithHttpInfo(String linkid) throws ApiException {
        com.squareup.okhttp.Call call = inventoryLinksHistoryByLinkidGetValidateBeforeCall(linkid, null, null);
        Type localVarReturnType = new TypeToken<InventoryLinksHistoryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Link history (asynchronously)
     * Get Link history
     * @param linkid Unique identifier representing a specific link (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryLinksHistoryByLinkidGetAsync(String linkid, final ApiCallback<InventoryLinksHistoryResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = inventoryLinksHistoryByLinkidGetValidateBeforeCall(linkid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryLinksHistoryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
