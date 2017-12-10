# DatacentresApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListOfAllTheDataCenters**](DatacentresApi.md#getListOfAllTheDataCenters) | **GET** /1.0.0/inventory/datacenters | Get list of all the data centers


<a name="getListOfAllTheDataCenters"></a>
# **getListOfAllTheDataCenters**
> List&lt;Model100InventoryDatacentersResponse&gt; getListOfAllTheDataCenters()

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
    List<Model100InventoryDatacentersResponse> result = apiInstance.getListOfAllTheDataCenters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatacentresApi#getListOfAllTheDataCenters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Model100InventoryDatacentersResponse&gt;**](Model100InventoryDatacentersResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

