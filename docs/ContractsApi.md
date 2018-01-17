# ContractsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryLinksContractByLinkidAndContractidGet**](ContractsApi.md#inventoryLinksContractByLinkidAndContractidGet) | **GET** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Get active Contract by ContractID
[**inventoryLinksContractByLinkidAndContractidPut**](ContractsApi.md#inventoryLinksContractByLinkidAndContractidPut) | **PUT** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Update active Contract by ContractID
[**inventoryLinksContractByLinkidPost**](ContractsApi.md#inventoryLinksContractByLinkidPost) | **POST** /1.0.0/inventory/links/{linkid}/contract | Create new Contract on specified link


<a name="inventoryLinksContractByLinkidAndContractidGet"></a>
# **inventoryLinksContractByLinkidAndContractidGet**
> InventoryLinksContractResponse inventoryLinksContractByLinkidAndContractidGet(linkid, contractid)

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
    InventoryLinksContractResponse result = apiInstance.inventoryLinksContractByLinkidAndContractidGet(linkid, contractid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#inventoryLinksContractByLinkidAndContractidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **contractid** | **String**| Unique identifier representing a specific contract |

### Return type

[**InventoryLinksContractResponse**](InventoryLinksContractResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryLinksContractByLinkidAndContractidPut"></a>
# **inventoryLinksContractByLinkidAndContractidPut**
> InventoryLinksContractResponse33 inventoryLinksContractByLinkidAndContractidPut(linkid, contractid, body)

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
InventoryLinksContractRequest body = new InventoryLinksContractRequest(); // InventoryLinksContractRequest | 
try {
    InventoryLinksContractResponse33 result = apiInstance.inventoryLinksContractByLinkidAndContractidPut(linkid, contractid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#inventoryLinksContractByLinkidAndContractidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **contractid** | **String**| Unique identifier representing a specific contract |
 **body** | [**InventoryLinksContractRequest**](InventoryLinksContractRequest.md)|  | [optional]

### Return type

[**InventoryLinksContractResponse33**](InventoryLinksContractResponse33.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryLinksContractByLinkidPost"></a>
# **inventoryLinksContractByLinkidPost**
> List&lt;InventoryLinksContractResponse38&gt; inventoryLinksContractByLinkidPost(linkid, body)

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
InventoryLinksContractRequest37 body = new InventoryLinksContractRequest37(); // InventoryLinksContractRequest37 | 
try {
    List<InventoryLinksContractResponse38> result = apiInstance.inventoryLinksContractByLinkidPost(linkid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#inventoryLinksContractByLinkidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **body** | [**InventoryLinksContractRequest37**](InventoryLinksContractRequest37.md)|  | [optional]

### Return type

[**List&lt;InventoryLinksContractResponse38&gt;**](InventoryLinksContractResponse38.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

