# EndpointsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100InventoryEndpointByEndpointuuidGet**](EndpointsApi.md#100InventoryEndpointByEndpointuuidGet) | **GET** /1.0.0/inventory/endpoint/{endpointuuid} | Get information about the specified endpoint
[**100InventoryEndpointsCustomeruuidByCustomeruuidGet**](EndpointsApi.md#100InventoryEndpointsCustomeruuidByCustomeruuidGet) | **GET** /1.0.0/inventory/endpoints/customeruuid/{customeruuid} | Get list of endpoints for a customer
[**100InventoryRegularendpointPost**](EndpointsApi.md#100InventoryRegularendpointPost) | **POST** /1.0.0/inventory/regularendpoint | Create Physical (Port) Endpoint
[**100InventoryVnfendpointPost**](EndpointsApi.md#100InventoryVnfendpointPost) | **POST** /1.0.0/inventory/vnfendpoint | Create VNF Endpoint
[**eis100EndpointsAssignTopologyTagByEndpointuuidPost**](EndpointsApi.md#eis100EndpointsAssignTopologyTagByEndpointuuidPost) | **POST** /eis/1.0.0/endpoints/{endpointuuid}/assign_topology_tag | Assign a Topology Tag to an Endpoint


<a name="100InventoryEndpointByEndpointuuidGet"></a>
# **100InventoryEndpointByEndpointuuidGet**
> Model100InventoryEndpointResponse 100InventoryEndpointByEndpointuuidGet(endpointuuid)

Get information about the specified endpoint

Get information about the specified endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.EndpointsApi;


EndpointsApi apiInstance = new EndpointsApi();
String endpointuuid = "endpointuuid_example"; // String | Unique identifier representing a specific endpoint
try {
    Model100InventoryEndpointResponse result = apiInstance.100InventoryEndpointByEndpointuuidGet(endpointuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#100InventoryEndpointByEndpointuuidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryEndpointsCustomeruuidByCustomeruuidGet"></a>
# **100InventoryEndpointsCustomeruuidByCustomeruuidGet**
> Model100InventoryEndpointsCustomeruuidResponse 100InventoryEndpointsCustomeruuidByCustomeruuidGet(customeruuid)

Get list of endpoints for a customer

Get list of endpoints for a customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.EndpointsApi;


EndpointsApi apiInstance = new EndpointsApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    Model100InventoryEndpointsCustomeruuidResponse result = apiInstance.100InventoryEndpointsCustomeruuidByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#100InventoryEndpointsCustomeruuidByCustomeruuidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryRegularendpointPost"></a>
# **100InventoryRegularendpointPost**
> Model100InventoryRegularendpointResponse 100InventoryRegularendpointPost(body)

Create Physical (Port) Endpoint

Create Physical (Port) Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.EndpointsApi;


EndpointsApi apiInstance = new EndpointsApi();
Model100InventoryRegularendpointRequest body = new Model100InventoryRegularendpointRequest(); // Model100InventoryRegularendpointRequest | 
try {
    Model100InventoryRegularendpointResponse result = apiInstance.100InventoryRegularendpointPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#100InventoryRegularendpointPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryVnfendpointPost"></a>
# **100InventoryVnfendpointPost**
> Model100InventoryVnfendpointResponse 100InventoryVnfendpointPost(body)

Create VNF Endpoint

Create VNF Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.EndpointsApi;


EndpointsApi apiInstance = new EndpointsApi();
Model100InventoryVnfendpointRequest body = new Model100InventoryVnfendpointRequest(); // Model100InventoryVnfendpointRequest | 
try {
    Model100InventoryVnfendpointResponse result = apiInstance.100InventoryVnfendpointPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#100InventoryVnfendpointPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eis100EndpointsAssignTopologyTagByEndpointuuidPost"></a>
# **eis100EndpointsAssignTopologyTagByEndpointuuidPost**
> SuccessFragment eis100EndpointsAssignTopologyTagByEndpointuuidPost(endpointuuid, body)

Assign a Topology Tag to an Endpoint

Assign a Topology Tag to an Endpoint

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.EndpointsApi;


EndpointsApi apiInstance = new EndpointsApi();
String endpointuuid = "endpointuuid_example"; // String | Unique identifier representing a specific endpoint
Eis100EndpointsAssignTopologyTagRequest body = new Eis100EndpointsAssignTopologyTagRequest(); // Eis100EndpointsAssignTopologyTagRequest | 
try {
    SuccessFragment result = apiInstance.eis100EndpointsAssignTopologyTagByEndpointuuidPost(endpointuuid, body);
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

[**SuccessFragment**](SuccessFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

