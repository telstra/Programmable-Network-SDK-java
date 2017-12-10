# CustomersApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountInformationDetails**](CustomersApi.md#getAccountInformationDetails) | **GET** /1.0.0/account/{customeruuid} | Get account information details
[**listUsers**](CustomersApi.md#listUsers) | **GET** /1.0.0/account/{customeruuid}/user | List users


<a name="getAccountInformationDetails"></a>
# **getAccountInformationDetails**
> Model100AccountResponse getAccountInformationDetails(customeruuid)

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
    Model100AccountResponse result = apiInstance.getAccountInformationDetails(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getAccountInformationDetails");
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;User&gt; listUsers(customeruuid)

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
    List<User> result = apiInstance.listUsers(customeruuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#listUsers");
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

