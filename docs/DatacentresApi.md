# DatacentresApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100InventoryDatacentersGet**](DatacentresApi.md#100InventoryDatacentersGet) | **GET** /1.0.0/inventory/datacenters | Get list of all the data centers


<a name="100InventoryDatacentersGet"></a>
# **100InventoryDatacentersGet**
> List&lt;Model100InventoryDatacentersResponse&gt; 100InventoryDatacentersGet()

Get list of all the data centers

Get list of all the data centers

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.DatacentresApi;


DatacentresApi apiInstance = new DatacentresApi();
try {
    List<Model100InventoryDatacentersResponse> result = apiInstance.100InventoryDatacentersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatacentresApi#100InventoryDatacentersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Model100InventoryDatacentersResponse&gt;**](Model100InventoryDatacentersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

