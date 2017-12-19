# LinksApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100InventoryLinkPost**](LinksApi.md#100InventoryLinkPost) | **POST** /1.0.0/inventory/link | Create Link and initial Contract
[**100InventoryLinksByLinkidGet**](LinksApi.md#100InventoryLinksByLinkidGet) | **GET** /1.0.0/inventory/links/{linkid} | Get details of specified link
[**100InventoryLinksCustomerByCustomeruuidGet**](LinksApi.md#100InventoryLinksCustomerByCustomeruuidGet) | **GET** /1.0.0/inventory/links/customer/{customeruuid} | Get active Links
[**100InventoryLinksHistoryByLinkidGet**](LinksApi.md#100InventoryLinksHistoryByLinkidGet) | **GET** /1.0.0/inventory/links/history/{linkid} | Get Link history


<a name="100InventoryLinkPost"></a>
# **100InventoryLinkPost**
> Model100InventoryLinkResponse 100InventoryLinkPost(body)

Create Link and initial Contract

Create Link and initial Contract

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.LinksApi;


LinksApi apiInstance = new LinksApi();
Model100InventoryLinkRequest body = new Model100InventoryLinkRequest(); // Model100InventoryLinkRequest | 
try {
    Model100InventoryLinkResponse result = apiInstance.100InventoryLinkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#100InventoryLinkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model100InventoryLinkRequest**](Model100InventoryLinkRequest.md)|  | [optional]

### Return type

[**Model100InventoryLinkResponse**](Model100InventoryLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryLinksByLinkidGet"></a>
# **100InventoryLinksByLinkidGet**
> Model100InventoryLinksResponse 100InventoryLinksByLinkidGet(linkid)

Get details of specified link

Get details of specified link

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.LinksApi;


LinksApi apiInstance = new LinksApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
try {
    Model100InventoryLinksResponse result = apiInstance.100InventoryLinksByLinkidGet(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#100InventoryLinksByLinkidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |

### Return type

[**Model100InventoryLinksResponse**](Model100InventoryLinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryLinksCustomerByCustomeruuidGet"></a>
# **100InventoryLinksCustomerByCustomeruuidGet**
> List&lt;Link&gt; 100InventoryLinksCustomerByCustomeruuidGet(customeruuid)

Get active Links

Get active Links

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.LinksApi;


LinksApi apiInstance = new LinksApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    List<Link> result = apiInstance.100InventoryLinksCustomerByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#100InventoryLinksCustomerByCustomeruuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**List&lt;Link&gt;**](Link.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100InventoryLinksHistoryByLinkidGet"></a>
# **100InventoryLinksHistoryByLinkidGet**
> Model100InventoryLinksHistoryResponse 100InventoryLinksHistoryByLinkidGet(linkid)

Get Link history

Get Link history

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.LinksApi;


LinksApi apiInstance = new LinksApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
try {
    Model100InventoryLinksHistoryResponse result = apiInstance.100InventoryLinksHistoryByLinkidGet(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#100InventoryLinksHistoryByLinkidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |

### Return type

[**Model100InventoryLinksHistoryResponse**](Model100InventoryLinksHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

