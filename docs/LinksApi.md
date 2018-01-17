# LinksApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryLinkPost**](LinksApi.md#inventoryLinkPost) | **POST** /1.0.0/inventory/link | Create Link and initial Contract
[**inventoryLinksByLinkidGet**](LinksApi.md#inventoryLinksByLinkidGet) | **GET** /1.0.0/inventory/links/{linkid} | Get details of specified link
[**inventoryLinksCustomerByCustomeruuidGet**](LinksApi.md#inventoryLinksCustomerByCustomeruuidGet) | **GET** /1.0.0/inventory/links/customer/{customeruuid} | Get active Links
[**inventoryLinksHistoryByLinkidGet**](LinksApi.md#inventoryLinksHistoryByLinkidGet) | **GET** /1.0.0/inventory/links/history/{linkid} | Get Link history


<a name="inventoryLinkPost"></a>
# **inventoryLinkPost**
> InventoryLinkResponse inventoryLinkPost(body)

Create Link and initial Contract

Create Link and initial Contract

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.LinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LinksApi apiInstance = new LinksApi();
InventoryLinkRequest body = new InventoryLinkRequest(); // InventoryLinkRequest | 
try {
    InventoryLinkResponse result = apiInstance.inventoryLinkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#inventoryLinkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryLinkRequest**](InventoryLinkRequest.md)|  | [optional]

### Return type

[**InventoryLinkResponse**](InventoryLinkResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryLinksByLinkidGet"></a>
# **inventoryLinksByLinkidGet**
> InventoryLinksResponse inventoryLinksByLinkidGet(linkid)

Get details of specified link

Get details of specified link

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.LinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LinksApi apiInstance = new LinksApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
try {
    InventoryLinksResponse result = apiInstance.inventoryLinksByLinkidGet(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#inventoryLinksByLinkidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |

### Return type

[**InventoryLinksResponse**](InventoryLinksResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryLinksCustomerByCustomeruuidGet"></a>
# **inventoryLinksCustomerByCustomeruuidGet**
> List&lt;Link&gt; inventoryLinksCustomerByCustomeruuidGet(customeruuid)

Get active Links

Get active Links

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.LinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LinksApi apiInstance = new LinksApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    List<Link> result = apiInstance.inventoryLinksCustomerByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#inventoryLinksCustomerByCustomeruuidGet");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inventoryLinksHistoryByLinkidGet"></a>
# **inventoryLinksHistoryByLinkidGet**
> InventoryLinksHistoryResponse inventoryLinksHistoryByLinkidGet(linkid)

Get Link history

Get Link history

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.LinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LinksApi apiInstance = new LinksApi();
String linkid = "linkid_example"; // String | Unique identifier representing a specific link
try {
    InventoryLinksHistoryResponse result = apiInstance.inventoryLinksHistoryByLinkidGet(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#inventoryLinksHistoryByLinkidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkid** | **String**| Unique identifier representing a specific link |

### Return type

[**InventoryLinksHistoryResponse**](InventoryLinksHistoryResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

