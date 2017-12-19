# ContractsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100InventoryLinksContractByLinkidAndContractidGet**](ContractsApi.md#100InventoryLinksContractByLinkidAndContractidGet) | **GET** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Get active Contract by ContractID
[**100InventoryLinksContractByLinkidAndContractidPut**](ContractsApi.md#100InventoryLinksContractByLinkidAndContractidPut) | **PUT** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Update active Contract by ContractID
[**100InventoryLinksContractByLinkidPost**](ContractsApi.md#100InventoryLinksContractByLinkidPost) | **POST** /1.0.0/inventory/links/{linkid}/contract | Create new Contract on specified link


<a name="100InventoryLinksContractByLinkidAndContractidGet"></a>
# **100InventoryLinksContractByLinkidAndContractidGet**
> Model100InventoryLinksContractResponse 100InventoryLinksContractByLinkidAndContractidGet(linkid, contractid)

Get active Contract by ContractID

Get active Contract by ContractID

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
String contractid = "contractid_example"; // String | Unique identifier representing a specific contract
try {
    Model100InventoryLinksContractResponse result = apiInstance.100InventoryLinksContractByLinkidAndContractidGet(linkid, contractid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#100InventoryLinksContractByLinkidAndContractidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryLinksContractByLinkidAndContractidPut"></a>
# **100InventoryLinksContractByLinkidAndContractidPut**
> Model100InventoryLinksContractResponse33 100InventoryLinksContractByLinkidAndContractidPut(linkid, contractid, body)

Update active Contract by ContractID

Update active Contract by ContractID

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
String contractid = "contractid_example"; // String | Unique identifier representing a specific contract
Model100InventoryLinksContractRequest body = new Model100InventoryLinksContractRequest(); // Model100InventoryLinksContractRequest | 
try {
    Model100InventoryLinksContractResponse33 result = apiInstance.100InventoryLinksContractByLinkidAndContractidPut(linkid, contractid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#100InventoryLinksContractByLinkidAndContractidPut");
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

[**Model100InventoryLinksContractResponse33**](Model100InventoryLinksContractResponse33.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryLinksContractByLinkidPost"></a>
# **100InventoryLinksContractByLinkidPost**
> Model100InventoryLinksContractResponse38 100InventoryLinksContractByLinkidPost(linkid, body)

Create new Contract on specified link

Create new Contract on specified link

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
Model100InventoryLinksContractRequest37 body = new Model100InventoryLinksContractRequest37(); // Model100InventoryLinksContractRequest37 | 
try {
    Model100InventoryLinksContractResponse38 result = apiInstance.100InventoryLinksContractByLinkidPost(linkid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#100InventoryLinksContractByLinkidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |
 **body** | [**Model100InventoryLinksContractRequest37**](Model100InventoryLinksContractRequest37.md)|  | [optional]

### Return type

[**Model100InventoryLinksContractResponse38**](Model100InventoryLinksContractResponse38.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

