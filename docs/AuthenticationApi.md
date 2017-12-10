# AuthenticationApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnAuthenticationToken**](AuthenticationApi.md#createAnAuthenticationToken) | **POST** /1.0.0/auth/generatetoken | Create an authentication token
[**validateAuthenticationToken**](AuthenticationApi.md#validateAuthenticationToken) | **GET** /1.0.0/auth/validatetoken | Validate authentication token


<a name="createAnAuthenticationToken"></a>
# **createAnAuthenticationToken**
> Model100AuthGeneratetokenResponse createAnAuthenticationToken(grantType, username, password)

Create an authentication token

Create an authentication token

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AuthenticationApi apiInstance = new AuthenticationApi();
String grantType = "grantType_example"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    Model100AuthGeneratetokenResponse result = apiInstance.createAnAuthenticationToken(grantType, username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createAnAuthenticationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  |
 **username** | **String**|  |
 **password** | **String**|  |

### Return type

[**Model100AuthGeneratetokenResponse**](Model100AuthGeneratetokenResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="validateAuthenticationToken"></a>
# **validateAuthenticationToken**
> Model100AuthValidatetokenResponse validateAuthenticationToken()

Validate authentication token

Validate the authentication token and get information about the user (roles, permissions, etc.)

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Model100AuthValidatetokenResponse result = apiInstance.validateAuthenticationToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#validateAuthenticationToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Model100AuthValidatetokenResponse**](Model100AuthValidatetokenResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

