# EndpointsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eis100EndpointsAssignTopologyTagByEndpointuuidPost**](EndpointsApi.md#eis100EndpointsAssignTopologyTagByEndpointuuidPost) | **POST** /eis/1.0.0/endpoints/{endpointuuid}/assign_topology_tag | Assign a Topology Tag to an Endpoint
[**inventoryEndpointByEndpointuuidGet**](EndpointsApi.md#inventoryEndpointByEndpointuuidGet) | **GET** /1.0.0/inventory/endpoint/{endpointuuid} | Get information about the specified endpoint
[**inventoryEndpointsCustomeruuidByCustomeruuidGet**](EndpointsApi.md#inventoryEndpointsCustomeruuidByCustomeruuidGet) | **GET** /1.0.0/inventory/endpoints/customeruuid/{customeruuid} | Get list of endpoints for a customer
[**inventoryRegularendpointPost**](EndpointsApi.md#inventoryRegularendpointPost) | **POST** /1.0.0/inventory/regularendpoint | Create Physical (Port) Endpoint
[**inventoryVnfendpointPost**](EndpointsApi.md#inventoryVnfendpointPost) | **POST** /1.0.0/inventory/vnfendpoint | Create VNF Endpoint


<a name="eis100EndpointsAssignTopologyTagByEndpointuuidPost"></a>
# **eis100EndpointsAssignTopologyTagByEndpointuuidPost**
> List&lt;SuccessFragment&gt; eis100EndpointsAssignTopologyTagByEndpointuuidPost(endpointuuid, body)

Assign a Topology Tag to an Endpoint

Assign a Topology Tag to an Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

EndpointsApi apiInstance = new EndpointsApi();
String endpointuuid = "endpointuuid_example"; // String | Unique identifier representing a specific endpoint
Eis100EndpointsAssignTopologyTagRequest body = new Eis100EndpointsAssignTopologyTagRequest(); // Eis100EndpointsAssignTopologyTagRequest | 
try {
    List<SuccessFragment> result = apiInstance.eis100EndpointsAssignTopologyTagByEndpointuuidPost(endpointuuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#eis100EndpointsAssignTopologyTagByEndpointuuidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointuuid** | **String**| Unique identifier representing a specific endpoint |
 **body** | [**Eis100EndpointsAssignTopologyTagRequest**](Eis100EndpointsAssignTopologyTagRequest.md)|  | [optional]

### Return type

[**List&lt;SuccessFragment&gt;**](SuccessFragment.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryEndpointByEndpointuuidGet"></a>
# **inventoryEndpointByEndpointuuidGet**
> InventoryEndpointResponse inventoryEndpointByEndpointuuidGet(endpointuuid)

Get information about the specified endpoint

Get information about the specified endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

EndpointsApi apiInstance = new EndpointsApi();
String endpointuuid = "endpointuuid_example"; // String | Unique identifier representing a specific endpoint
try {
    InventoryEndpointResponse result = apiInstance.inventoryEndpointByEndpointuuidGet(endpointuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#inventoryEndpointByEndpointuuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointuuid** | **String**| Unique identifier representing a specific endpoint |

### Return type

[**InventoryEndpointResponse**](InventoryEndpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryEndpointsCustomeruuidByCustomeruuidGet"></a>
# **inventoryEndpointsCustomeruuidByCustomeruuidGet**
> InventoryEndpointsCustomeruuidResponse inventoryEndpointsCustomeruuidByCustomeruuidGet(customeruuid)

Get list of endpoints for a customer

Get list of endpoints for a customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

EndpointsApi apiInstance = new EndpointsApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    InventoryEndpointsCustomeruuidResponse result = apiInstance.inventoryEndpointsCustomeruuidByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#inventoryEndpointsCustomeruuidByCustomeruuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**InventoryEndpointsCustomeruuidResponse**](InventoryEndpointsCustomeruuidResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryRegularendpointPost"></a>
# **inventoryRegularendpointPost**
> List&lt;InventoryRegularendpointResponse&gt; inventoryRegularendpointPost(body)

Create Physical (Port) Endpoint

Create Physical (Port) Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

EndpointsApi apiInstance = new EndpointsApi();
InventoryRegularendpointRequest body = new InventoryRegularendpointRequest(); // InventoryRegularendpointRequest | 
try {
    List<InventoryRegularendpointResponse> result = apiInstance.inventoryRegularendpointPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#inventoryRegularendpointPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryRegularendpointRequest**](InventoryRegularendpointRequest.md)|  | [optional]

### Return type

[**List&lt;InventoryRegularendpointResponse&gt;**](InventoryRegularendpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryVnfendpointPost"></a>
# **inventoryVnfendpointPost**
> List&lt;InventoryVnfendpointResponse&gt; inventoryVnfendpointPost(body)

Create VNF Endpoint

Create VNF Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

EndpointsApi apiInstance = new EndpointsApi();
InventoryVnfendpointRequest body = new InventoryVnfendpointRequest(); // InventoryVnfendpointRequest | 
try {
    List<InventoryVnfendpointResponse> result = apiInstance.inventoryVnfendpointPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#inventoryVnfendpointPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryVnfendpointRequest**](InventoryVnfendpointRequest.md)|  | [optional]

### Return type

[**List&lt;InventoryVnfendpointResponse&gt;**](InventoryVnfendpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

