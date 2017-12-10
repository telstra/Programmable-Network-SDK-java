/*
 * Telstra Programmable Network API
 * Telstra Programmable Network is a self-provisioning platform that allows its users to create on-demand connectivity services between multiple end-points and add various network functions to those services. Programmable Network enables to connectivity to a global ecosystem of networking services as well as public and private cloud services. Once you are connected to the platform on one or more POPs (points of presence), you can start creating those services based on the use case that you want to accomplish. The Programmable Network API is available to all customers who have registered to use the Programmable Network. To register, please contact your account representative.
 *
 * OpenAPI spec version: 2.1.2
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


import TelstraTPN.Error;
import TelstraTPN.Model100AccountResponse;
import TelstraTPN.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomersApi {
    private ApiClient apiClient;

    public CustomersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAccountInformationDetails
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountInformationDetailsCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/1.0.0/account/{customeruuid}"
            .replaceAll("\\{" + "customeruuid" + "\\}", apiClient.escapeString(customeruuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountInformationDetailsValidateBeforeCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customeruuid' is set
        if (customeruuid == null) {
            throw new ApiException("Missing the required parameter 'customeruuid' when calling getAccountInformationDetails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountInformationDetailsCall(customeruuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get account information details
     * Get the account information for the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return Model100AccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model100AccountResponse getAccountInformationDetails(String customeruuid) throws ApiException {
        ApiResponse<Model100AccountResponse> resp = getAccountInformationDetailsWithHttpInfo(customeruuid);
        return resp.getData();
    }

    /**
     * Get account information details
     * Get the account information for the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return ApiResponse&lt;Model100AccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model100AccountResponse> getAccountInformationDetailsWithHttpInfo(String customeruuid) throws ApiException {
        com.squareup.okhttp.Call call = getAccountInformationDetailsValidateBeforeCall(customeruuid, null, null);
        Type localVarReturnType = new TypeToken<Model100AccountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get account information details (asynchronously)
     * Get the account information for the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountInformationDetailsAsync(String customeruuid, final ApiCallback<Model100AccountResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountInformationDetailsValidateBeforeCall(customeruuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model100AccountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listUsers
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUsersCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/1.0.0/account/{customeruuid}/user"
            .replaceAll("\\{" + "customeruuid" + "\\}", apiClient.escapeString(customeruuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listUsersValidateBeforeCall(String customeruuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customeruuid' is set
        if (customeruuid == null) {
            throw new ApiException("Missing the required parameter 'customeruuid' when calling listUsers(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listUsersCall(customeruuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List users
     * List all users associated with the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return List&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<User> listUsers(String customeruuid) throws ApiException {
        ApiResponse<List<User>> resp = listUsersWithHttpInfo(customeruuid);
        return resp.getData();
    }

    /**
     * List users
     * List all users associated with the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @return ApiResponse&lt;List&lt;User&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<User>> listUsersWithHttpInfo(String customeruuid) throws ApiException {
        com.squareup.okhttp.Call call = listUsersValidateBeforeCall(customeruuid, null, null);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List users (asynchronously)
     * List all users associated with the specified customer
     * @param customeruuid Unique identifier representing a specific customer (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUsersAsync(String customeruuid, final ApiCallback<List<User>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listUsersValidateBeforeCall(customeruuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}