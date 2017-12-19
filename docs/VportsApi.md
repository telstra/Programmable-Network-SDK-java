# VportsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100InventoryRegularvportPost**](VportsApi.md#100InventoryRegularvportPost) | **POST** /1.0.0/inventory/regularvport | Create VPort for physical endpoint
[**100InventoryVnfVportPost**](VportsApi.md#100InventoryVnfVportPost) | **POST** /1.0.0/inventory/vnf/vport | Create VNF VPort
[**100InventoryVportByVportuuidGet**](VportsApi.md#100InventoryVportByVportuuidGet) | **GET** /1.0.0/inventory/vport/{vportuuid} | Get information about the specified VPort


<a name="100InventoryRegularvportPost"></a>
# **100InventoryRegularvportPost**
> Model100InventoryRegularvportResponse 100InventoryRegularvportPost(body)

Create VPort for physical endpoint

Create VPort representing a VLAN on a Physical Ethernet Port

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.VportsApi;


VportsApi apiInstance = new VportsApi();
Model100InventoryRegularvportRequest body = new Model100InventoryRegularvportRequest(); // Model100InventoryRegularvportRequest | 
try {
    Model100InventoryRegularvportResponse result = apiInstance.100InventoryRegularvportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#100InventoryRegularvportPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryVnfVportPost"></a>
# **100InventoryVnfVportPost**
> Model100InventoryVnfVportResponse 100InventoryVnfVportPost(body)

Create VNF VPort

Create VNF VPort

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.VportsApi;


VportsApi apiInstance = new VportsApi();
Model100InventoryVnfVportRequest body = new Model100InventoryVnfVportRequest(); // Model100InventoryVnfVportRequest | 
try {
    Model100InventoryVnfVportResponse result = apiInstance.100InventoryVnfVportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#100InventoryVnfVportPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryVportByVportuuidGet"></a>
# **100InventoryVportByVportuuidGet**
> EndpointPort 100InventoryVportByVportuuidGet(vportuuid)

Get information about the specified VPort

Get information about the specified VPort

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.VportsApi;


VportsApi apiInstance = new VportsApi();
String vportuuid = "vportuuid_example"; // String | Unique identifier representing a specific virtual port
try {
    EndpointPort result = apiInstance.100InventoryVportByVportuuidGet(vportuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VportsApi#100InventoryVportByVportuuidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

