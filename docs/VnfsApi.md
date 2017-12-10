# VnfsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listImagesInTheMarketplace**](VnfsApi.md#listImagesInTheMarketplace) | **GET** /1.0.0/marketplace/image | List images in the Marketplace


<a name="listImagesInTheMarketplace"></a>
# **listImagesInTheMarketplace**
> Model100MarketplaceImageResponse listImagesInTheMarketplace()

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
    Model100MarketplaceImageResponse result = apiInstance.listImagesInTheMarketplace();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VnfsApi#listImagesInTheMarketplace");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Model100MarketplaceImageResponse**](Model100MarketplaceImageResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

