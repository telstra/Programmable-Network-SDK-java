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


import TelstraTPN.EndpointPort;
import TelstraTPN.InventoryRegularvportRequest;
import TelstraTPN.InventoryRegularvportResponse;
import TelstraTPN.InventoryVnfVportRequest;
import TelstraTPN.InventoryVnfVportResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VportsApi {
    private ApiClient apiClient;

    public VportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for inventoryRegularvportPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryRegularvportPostCall(InventoryRegularvportRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/regularvport";

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
    private com.squareup.okhttp.Call inventoryRegularvportPostValidateBeforeCall(InventoryRegularvportRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = inventoryRegularvportPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create VPort for physical endpoint
     * Create VPort representing a VLAN on a Physical Ethernet Port
     * @param body  (optional)
     * @return InventoryRegularvportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryRegularvportResponse inventoryRegularvportPost(InventoryRegularvportRequest body) throws ApiException {
        ApiResponse<InventoryRegularvportResponse> resp = inventoryRegularvportPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create VPort for physical endpoint
     * Create VPort representing a VLAN on a Physical Ethernet Port
     * @param body  (optional)
     * @return ApiResponse&lt;InventoryRegularvportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryRegularvportResponse> inventoryRegularvportPostWithHttpInfo(InventoryRegularvportRequest body) throws ApiException {
        com.squareup.okhttp.Call call = inventoryRegularvportPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InventoryRegularvportResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create VPort for physical endpoint (asynchronously)
     * Create VPort representing a VLAN on a Physical Ethernet Port
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryRegularvportPostAsync(InventoryRegularvportRequest body, final ApiCallback<InventoryRegularvportResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = inventoryRegularvportPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryRegularvportResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for inventoryVnfVportPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryVnfVportPostCall(InventoryVnfVportRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/vnf/vport";

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
    private com.squareup.okhttp.Call inventoryVnfVportPostValidateBeforeCall(InventoryVnfVportRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = inventoryVnfVportPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create VNF VPort
     * Create VNF VPort
     * @param body  (optional)
     * @return InventoryVnfVportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InventoryVnfVportResponse inventoryVnfVportPost(InventoryVnfVportRequest body) throws ApiException {
        ApiResponse<InventoryVnfVportResponse> resp = inventoryVnfVportPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create VNF VPort
     * Create VNF VPort
     * @param body  (optional)
     * @return ApiResponse&lt;InventoryVnfVportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InventoryVnfVportResponse> inventoryVnfVportPostWithHttpInfo(InventoryVnfVportRequest body) throws ApiException {
        com.squareup.okhttp.Call call = inventoryVnfVportPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InventoryVnfVportResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create VNF VPort (asynchronously)
     * Create VNF VPort
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryVnfVportPostAsync(InventoryVnfVportRequest body, final ApiCallback<InventoryVnfVportResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = inventoryVnfVportPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InventoryVnfVportResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for inventoryVportByVportuuidGet
     * @param vportuuid Unique identifier representing a specific virtual port (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call inventoryVportByVportuuidGetCall(String vportuuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1.0.0/inventory/vport/{vportuuid}"
            .replaceAll("\\{" + "vportuuid" + "\\}", apiClient.escapeString(vportuuid.toString()));

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
    private com.squareup.okhttp.Call inventoryVportByVportuuidGetValidateBeforeCall(String vportuuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'vportuuid' is set
        if (vportuuid == null) {
            throw new ApiException("Missing the required parameter 'vportuuid' when calling inventoryVportByVportuuidGet(Async)");
        }
        

        com.squareup.okhttp.Call call = inventoryVportByVportuuidGetCall(vportuuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get information about the specified VPort
     * Get information about the specified VPort
     * @param vportuuid Unique identifier representing a specific virtual port (required)
     * @return List&lt;EndpointPort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EndpointPort> inventoryVportByVportuuidGet(String vportuuid) throws ApiException {
        ApiResponse<List<EndpointPort>> resp = inventoryVportByVportuuidGetWithHttpInfo(vportuuid);
        return resp.getData();
    }

    /**
     * Get information about the specified VPort
     * Get information about the specified VPort
     * @param vportuuid Unique identifier representing a specific virtual port (required)
     * @return ApiResponse&lt;List&lt;EndpointPort&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EndpointPort>> inventoryVportByVportuuidGetWithHttpInfo(String vportuuid) throws ApiException {
        com.squareup.okhttp.Call call = inventoryVportByVportuuidGetValidateBeforeCall(vportuuid, null, null);
        Type localVarReturnType = new TypeToken<List<EndpointPort>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get information about the specified VPort (asynchronously)
     * Get information about the specified VPort
     * @param vportuuid Unique identifier representing a specific virtual port (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inventoryVportByVportuuidGetAsync(String vportuuid, final ApiCallback<List<EndpointPort>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = inventoryVportByVportuuidGetValidateBeforeCall(vportuuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EndpointPort>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
