# DatacentresApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryDatacentersGet**](DatacentresApi.md#inventoryDatacentersGet) | **GET** /1.0.0/inventory/datacenters | Get list of all the data centers


<a name="inventoryDatacentersGet"></a>
# **inventoryDatacentersGet**
> List&lt;InventoryDatacentersResponse&gt; inventoryDatacentersGet()

Get list of all the data centers

Get list of all the data centers

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.DatacentresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

DatacentresApi apiInstance = new DatacentresApi();
try {
    List<InventoryDatacentersResponse> result = apiInstance.inventoryDatacentersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatacentresApi#inventoryDatacentersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InventoryDatacentersResponse&gt;**](InventoryDatacentersResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

