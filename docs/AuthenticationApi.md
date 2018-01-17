# AuthenticationApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authGeneratetokenPost**](AuthenticationApi.md#authGeneratetokenPost) | **POST** /1.0.0/auth/generatetoken | Create an authentication token
[**authValidatetokenGet**](AuthenticationApi.md#authValidatetokenGet) | **GET** /1.0.0/auth/validatetoken | Validate authentication token


<a name="authGeneratetokenPost"></a>
# **authGeneratetokenPost**
> AuthGeneratetokenResponse authGeneratetokenPost(grantType, username, password)

Create an authentication token

Create an authentication token

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String grantType = "grantType_example"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    AuthGeneratetokenResponse result = apiInstance.authGeneratetokenPost(grantType, username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authGeneratetokenPost");
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

[**AuthGeneratetokenResponse**](AuthGeneratetokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="authValidatetokenGet"></a>
# **authValidatetokenGet**
> AuthValidatetokenResponse authValidatetokenGet()

Validate authentication token

Validate the authentication token and get information about the user (roles, permissions, etc.)

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    AuthValidatetokenResponse result = apiInstance.authValidatetokenGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authValidatetokenGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthValidatetokenResponse**](AuthValidatetokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

