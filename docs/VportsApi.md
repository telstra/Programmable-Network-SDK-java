# VportsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVNFVPort**](VportsApi.md#createVNFVPort) | **POST** /1.0.0/inventory/vnf/vport | Create VNF VPort
[**createVPortForPhysicalEndpoint**](VportsApi.md#createVPortForPhysicalEndpoint) | **POST** /1.0.0/inventory/regularvport | Create VPort for physical endpoint
[**getInformationAboutTheSpecifiedVPort**](VportsApi.md#getInformationAboutTheSpecifiedVPort) | **GET** /1.0.0/inventory/vport/{vportuuid} | Get information about the specified VPort


<a name="createVNFVPort"></a>
# **createVNFVPort**
> Model100InventoryVnfVportResponse createVNFVPort(body)

Create VNF VPort

Create VNF VPort

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.VportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VportsApi apiInstance = new VportsApi();
Model100InventoryVnfVportRequest body = new Model100InventoryVnfVportRequest(); // Model100InventoryVnfVportRequest | 
try {
    Model100InventoryVnfVportResponse result = apiInstance.createVNFVPort(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#createVNFVPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model100InventoryVnfVportRequest**](Model100InventoryVnfVportRequest.md)|  | [optional]

### Return type

[**Model100InventoryVnfVportResponse**](Model100InventoryVnfVportResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVPortForPhysicalEndpoint"></a>
# **createVPortForPhysicalEndpoint**
> Model100InventoryRegularvportResponse createVPortForPhysicalEndpoint(body)

Create VPort for physical endpoint

Create VPort representing a VLAN on a Physical Ethernet Port

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.VportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VportsApi apiInstance = new VportsApi();
Model100InventoryRegularvportRequest body = new Model100InventoryRegularvportRequest(); // Model100InventoryRegularvportRequest | 
try {
    Model100InventoryRegularvportResponse result = apiInstance.createVPortForPhysicalEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#createVPortForPhysicalEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model100InventoryRegularvportRequest**](Model100InventoryRegularvportRequest.md)|  | [optional]

### Return type

[**Model100InventoryRegularvportResponse**](Model100InventoryRegularvportResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInformationAboutTheSpecifiedVPort"></a>
# **getInformationAboutTheSpecifiedVPort**
> EndpointPort getInformationAboutTheSpecifiedVPort(vportuuid)

Get information about the specified VPort

Get information about the specified VPort

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.VportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VportsApi apiInstance = new VportsApi();
String vportuuid = "vportuuid_example"; // String | Unique identifier representing a specific virtual port
try {
    EndpointPort result = apiInstance.getInformationAboutTheSpecifiedVPort(vportuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#getInformationAboutTheSpecifiedVPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vportuuid** | **String**| Unique identifier representing a specific virtual port |

### Return type

[**EndpointPort**](EndpointPort.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

