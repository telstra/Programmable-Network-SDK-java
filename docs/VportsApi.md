# VportsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryRegularvportPost**](VportsApi.md#inventoryRegularvportPost) | **POST** /1.0.0/inventory/regularvport | Create VPort for physical endpoint
[**inventoryVnfVportPost**](VportsApi.md#inventoryVnfVportPost) | **POST** /1.0.0/inventory/vnf/vport | Create VNF VPort
[**inventoryVportByVportuuidGet**](VportsApi.md#inventoryVportByVportuuidGet) | **GET** /1.0.0/inventory/vport/{vportuuid} | Get information about the specified VPort


<a name="inventoryRegularvportPost"></a>
# **inventoryRegularvportPost**
> InventoryRegularvportResponse inventoryRegularvportPost(body)

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
InventoryRegularvportRequest body = new InventoryRegularvportRequest(); // InventoryRegularvportRequest | 
try {
    InventoryRegularvportResponse result = apiInstance.inventoryRegularvportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#inventoryRegularvportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryRegularvportRequest**](InventoryRegularvportRequest.md)|  | [optional]

### Return type

[**InventoryRegularvportResponse**](InventoryRegularvportResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryVnfVportPost"></a>
# **inventoryVnfVportPost**
> InventoryVnfVportResponse inventoryVnfVportPost(body)

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
InventoryVnfVportRequest body = new InventoryVnfVportRequest(); // InventoryVnfVportRequest | 
try {
    InventoryVnfVportResponse result = apiInstance.inventoryVnfVportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#inventoryVnfVportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryVnfVportRequest**](InventoryVnfVportRequest.md)|  | [optional]

### Return type

[**InventoryVnfVportResponse**](InventoryVnfVportResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryVportByVportuuidGet"></a>
# **inventoryVportByVportuuidGet**
> List&lt;EndpointPort&gt; inventoryVportByVportuuidGet(vportuuid)

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
    List<EndpointPort> result = apiInstance.inventoryVportByVportuuidGet(vportuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#inventoryVportByVportuuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vportuuid** | **String**| Unique identifier representing a specific virtual port |

### Return type

[**List&lt;EndpointPort&gt;**](EndpointPort.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

