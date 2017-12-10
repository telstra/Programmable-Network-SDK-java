# EndpointsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhysicalPortEndpoint**](EndpointsApi.md#createPhysicalPortEndpoint) | **POST** /1.0.0/inventory/regularendpoint | Create Physical (Port) Endpoint
[**createVNFEndpoint**](EndpointsApi.md#createVNFEndpoint) | **POST** /1.0.0/inventory/vnfendpoint | Create VNF Endpoint
[**getInformationAboutTheSpecifiedEndpoint**](EndpointsApi.md#getInformationAboutTheSpecifiedEndpoint) | **GET** /1.0.0/inventory/endpoint/{endpointuuid} | Get information about the specified endpoint
[**getListOfEndpointsForACustomer**](EndpointsApi.md#getListOfEndpointsForACustomer) | **GET** /1.0.0/inventory/endpoints/customeruuid/{customeruuid} | Get list of endpoints for a customer


<a name="createPhysicalPortEndpoint"></a>
# **createPhysicalPortEndpoint**
> Model100InventoryRegularendpointResponse createPhysicalPortEndpoint(body)

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
Model100InventoryRegularendpointRequest body = new Model100InventoryRegularendpointRequest(); // Model100InventoryRegularendpointRequest | 
try {
    Model100InventoryRegularendpointResponse result = apiInstance.createPhysicalPortEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#createPhysicalPortEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model100InventoryRegularendpointRequest**](Model100InventoryRegularendpointRequest.md)|  | [optional]

### Return type

[**Model100InventoryRegularendpointResponse**](Model100InventoryRegularendpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVNFEndpoint"></a>
# **createVNFEndpoint**
> Model100InventoryVnfendpointResponse createVNFEndpoint(body)

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
Model100InventoryVnfendpointRequest body = new Model100InventoryVnfendpointRequest(); // Model100InventoryVnfendpointRequest | 
try {
    Model100InventoryVnfendpointResponse result = apiInstance.createVNFEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#createVNFEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model100InventoryVnfendpointRequest**](Model100InventoryVnfendpointRequest.md)|  | [optional]

### Return type

[**Model100InventoryVnfendpointResponse**](Model100InventoryVnfendpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInformationAboutTheSpecifiedEndpoint"></a>
# **getInformationAboutTheSpecifiedEndpoint**
> Model100InventoryEndpointResponse getInformationAboutTheSpecifiedEndpoint(endpointuuid)

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
    Model100InventoryEndpointResponse result = apiInstance.getInformationAboutTheSpecifiedEndpoint(endpointuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getInformationAboutTheSpecifiedEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointuuid** | **String**| Unique identifier representing a specific endpoint |

### Return type

[**Model100InventoryEndpointResponse**](Model100InventoryEndpointResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListOfEndpointsForACustomer"></a>
# **getListOfEndpointsForACustomer**
> Model100InventoryEndpointsCustomeruuidResponse getListOfEndpointsForACustomer(customeruuid)

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
    Model100InventoryEndpointsCustomeruuidResponse result = apiInstance.getListOfEndpointsForACustomer(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getListOfEndpointsForACustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**Model100InventoryEndpointsCustomeruuidResponse**](Model100InventoryEndpointsCustomeruuidResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

