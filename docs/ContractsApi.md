# ContractsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewContractOnSpecifiedLink**](ContractsApi.md#createNewContractOnSpecifiedLink) | **POST** /1.0.0/inventory/links/{linkid}/contract | Create new Contract on specified link
[**getActiveContractByContractID**](ContractsApi.md#getActiveContractByContractID) | **GET** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Get active Contract by ContractID
[**updateActiveContractByContractID**](ContractsApi.md#updateActiveContractByContractID) | **PUT** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Update active Contract by ContractID


<a name="createNewContractOnSpecifiedLink"></a>
# **createNewContractOnSpecifiedLink**
> Model100InventoryLinksContractResponse36 createNewContractOnSpecifiedLink(linkid, body)

Create new Contract on specified link

Create new Contract on specified link

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
Model100InventoryLinksContractRequest35 body = new Model100InventoryLinksContractRequest35(); // Model100InventoryLinksContractRequest35 | 
try {
    Model100InventoryLinksContractResponse36 result = apiInstance.createNewContractOnSpecifiedLink(linkid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#createNewContractOnSpecifiedLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **body** | [**Model100InventoryLinksContractRequest35**](Model100InventoryLinksContractRequest35.md)|  | [optional]

### Return type

[**Model100InventoryLinksContractResponse36**](Model100InventoryLinksContractResponse36.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActiveContractByContractID"></a>
# **getActiveContractByContractID**
> Model100InventoryLinksContractResponse getActiveContractByContractID(linkid, contractid)

Get active Contract by ContractID

Get active Contract by ContractID

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
String contractid = "contractid_example"; // String | Unique identifier representing a specific contract
try {
    Model100InventoryLinksContractResponse result = apiInstance.getActiveContractByContractID(linkid, contractid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getActiveContractByContractID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **contractid** | **String**| Unique identifier representing a specific contract |

### Return type

[**Model100InventoryLinksContractResponse**](Model100InventoryLinksContractResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateActiveContractByContractID"></a>
# **updateActiveContractByContractID**
> Model100InventoryLinksContractResponse31 updateActiveContractByContractID(linkid, contractid, body)

Update active Contract by ContractID

Update active Contract by ContractID

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
String contractid = "contractid_example"; // String | Unique identifier representing a specific contract
Model100InventoryLinksContractRequest body = new Model100InventoryLinksContractRequest(); // Model100InventoryLinksContractRequest | 
try {
    Model100InventoryLinksContractResponse31 result = apiInstance.updateActiveContractByContractID(linkid, contractid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#updateActiveContractByContractID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **contractid** | **String**| Unique identifier representing a specific contract |
 **body** | [**Model100InventoryLinksContractRequest**](Model100InventoryLinksContractRequest.md)|  | [optional]

### Return type

[**Model100InventoryLinksContractResponse31**](Model100InventoryLinksContractResponse31.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

