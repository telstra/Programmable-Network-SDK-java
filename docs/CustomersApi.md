# CustomersApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**100AccountByCustomeruuidGet**](CustomersApi.md#100AccountByCustomeruuidGet) | **GET** /1.0.0/account/{customeruuid} | Get account information details
[**100AccountUserByCustomeruuidGet**](CustomersApi.md#100AccountUserByCustomeruuidGet) | **GET** /1.0.0/account/{customeruuid}/user | List users


<a name="100AccountByCustomeruuidGet"></a>
# **100AccountByCustomeruuidGet**
> Model100AccountResponse 100AccountByCustomeruuidGet(customeruuid)

Get account information details

Get the account information for the specified customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    Model100AccountResponse result = apiInstance.100AccountByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#100AccountByCustomeruuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**Model100AccountResponse**](Model100AccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="100AccountUserByCustomeruuidGet"></a>
# **100AccountUserByCustomeruuidGet**
> List&lt;User&gt; 100AccountUserByCustomeruuidGet(customeruuid)

List users

List all users associated with the specified customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    List<User> result = apiInstance.100AccountUserByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#100AccountUserByCustomeruuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

