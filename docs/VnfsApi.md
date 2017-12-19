# VnfsApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100MarketplaceImageGet**](VnfsApi.md#100MarketplaceImageGet) | **GET** /1.0.0/marketplace/image | List images in the Marketplace


<a name="100MarketplaceImageGet"></a>
# **100MarketplaceImageGet**
> Model100MarketplaceImageResponse 100MarketplaceImageGet()

List images in the Marketplace

List images in the Marketplace

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.VnfsApi;


VnfsApi apiInstance = new VnfsApi();
try {
    Model100MarketplaceImageResponse result = apiInstance.100MarketplaceImageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VnfsApi#100MarketplaceImageGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Model100MarketplaceImageResponse**](Model100MarketplaceImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

