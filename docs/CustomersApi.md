# CustomersApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountByCustomeruuidGet**](CustomersApi.md#accountByCustomeruuidGet) | **GET** /1.0.0/account/{customeruuid} | Get account information details
[**accountUserByCustomeruuidGet**](CustomersApi.md#accountUserByCustomeruuidGet) | **GET** /1.0.0/account/{customeruuid}/user | List users


<a name="accountByCustomeruuidGet"></a>
# **accountByCustomeruuidGet**
> List&lt;AccountResponse&gt; accountByCustomeruuidGet(customeruuid)

Get account information details

Get the account information for the specified customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CustomersApi apiInstance = new CustomersApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    List<AccountResponse> result = apiInstance.accountByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#accountByCustomeruuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customeruuid** | **String**| Unique identifier representing a specific customer |

### Return type

[**List&lt;AccountResponse&gt;**](AccountResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserByCustomeruuidGet"></a>
# **accountUserByCustomeruuidGet**
> List&lt;User&gt; accountUserByCustomeruuidGet(customeruuid)

List users

List all users associated with the specified customer

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CustomersApi apiInstance = new CustomersApi();
String customeruuid = "customeruuid_example"; // String | Unique identifier representing a specific customer
try {
    List<User> result = apiInstance.accountUserByCustomeruuidGet(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#accountUserByCustomeruuidGet");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

