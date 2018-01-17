# VnfsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketplaceImageGet**](VnfsApi.md#marketplaceImageGet) | **GET** /1.0.0/marketplace/image | List images in the Marketplace


<a name="marketplaceImageGet"></a>
# **marketplaceImageGet**
> MarketplaceImageResponse marketplaceImageGet()

List images in the Marketplace

List images in the Marketplace

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.VnfsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

VnfsApi apiInstance = new VnfsApi();
try {
    MarketplaceImageResponse result = apiInstance.marketplaceImageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VnfsApi#marketplaceImageGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MarketplaceImageResponse**](MarketplaceImageResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

