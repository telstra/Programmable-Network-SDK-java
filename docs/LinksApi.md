# LinksApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLinkAndInitialContract**](LinksApi.md#createLinkAndInitialContract) | **POST** /1.0.0/inventory/link | Create Link and initial Contract
[**getActiveLinks**](LinksApi.md#getActiveLinks) | **GET** /1.0.0/inventory/links/customer/{customeruuid} | Get active Links
[**getDetailsOfSpecifiedLink**](LinksApi.md#getDetailsOfSpecifiedLink) | **GET** /1.0.0/inventory/links/{linkid} | Get details of specified link
[**getLinkHistory**](LinksApi.md#getLinkHistory) | **GET** /1.0.0/inventory/links/history/{linkid} | Get Link history


<a name="createLinkAndInitialContract"></a>
# **createLinkAndInitialContract**
> Model100InventoryLinkResponse createLinkAndInitialContract(body)

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
Model100InventoryLinkRequest body = new Model100InventoryLinkRequest(); // Model100InventoryLinkRequest | 
try {
    Model100InventoryLinkResponse result = apiInstance.createLinkAndInitialContract(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#createLinkAndInitialContract");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActiveLinks"></a>
# **getActiveLinks**
> List&lt;Link&gt; getActiveLinks(customeruuid)

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
    List<Link> result = apiInstance.getActiveLinks(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#getActiveLinks");
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

<a name="getDetailsOfSpecifiedLink"></a>
# **getDetailsOfSpecifiedLink**
> Model100InventoryLinksResponse getDetailsOfSpecifiedLink(linkid)

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
    Model100InventoryLinksResponse result = apiInstance.getDetailsOfSpecifiedLink(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#getDetailsOfSpecifiedLink");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLinkHistory"></a>
# **getLinkHistory**
> Model100InventoryLinksHistoryResponse getLinkHistory(linkid)

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
    Model100InventoryLinksHistoryResponse result = apiInstance.getLinkHistory(linkid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinksApi#getLinkHistory");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

