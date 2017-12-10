# TopologiesApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createANamedTopologyTag**](TopologiesApi.md#createANamedTopologyTag) | **POST** /ttms/1.0.0/topology_tag | Create a named topology tag
[**getInformationAboutTheSpecifiedTopologyTag**](TopologiesApi.md#getInformationAboutTheSpecifiedTopologyTag) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/ | Get information about the specified topology tag
[**listAllTopologyTags**](TopologiesApi.md#listAllTopologyTags) | **GET** /ttms/1.0.0/topology_tag | List all topology tags
[**listObjectsForTopology**](TopologiesApi.md#listObjectsForTopology) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/objects/ | List objects for Topology


<a name="createANamedTopologyTag"></a>
# **createANamedTopologyTag**
> Topology createANamedTopologyTag(body)

Create a named topology tag

Create a named topology tag

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.TopologiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TopologiesApi apiInstance = new TopologiesApi();
Ttms100TopologyTagRequest body = new Ttms100TopologyTagRequest(); // Ttms100TopologyTagRequest | 
try {
    Topology result = apiInstance.createANamedTopologyTag(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#createANamedTopologyTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Ttms100TopologyTagRequest**](Ttms100TopologyTagRequest.md)|  | [optional]

### Return type

[**Topology**](Topology.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInformationAboutTheSpecifiedTopologyTag"></a>
# **getInformationAboutTheSpecifiedTopologyTag**
> Topology getInformationAboutTheSpecifiedTopologyTag(topotaguuid)

Get information about the specified topology tag

Get information about the specified topology tag

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.TopologiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
try {
    Topology result = apiInstance.getInformationAboutTheSpecifiedTopologyTag(topotaguuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#getInformationAboutTheSpecifiedTopologyTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topotaguuid** | **String**| Unique identifier representing a specific topology tag |

### Return type

[**Topology**](Topology.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAllTopologyTags"></a>
# **listAllTopologyTags**
> List&lt;Topology&gt; listAllTopologyTags()

List all topology tags

List all topology tags

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.TopologiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TopologiesApi apiInstance = new TopologiesApi();
try {
    List<Topology> result = apiInstance.listAllTopologyTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#listAllTopologyTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Topology&gt;**](Topology.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjectsForTopology"></a>
# **listObjectsForTopology**
> Ttms100TopologyTagObjectsResponse listObjectsForTopology(topotaguuid)

List objects for Topology

List all objects (Endpoints, Links, VPorts, etc.) associated with the topology tag.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import TelstraTPN.TopologiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
try {
    Ttms100TopologyTagObjectsResponse result = apiInstance.listObjectsForTopology(topotaguuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#listObjectsForTopology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topotaguuid** | **String**| Unique identifier representing a specific topology tag |

### Return type

[**Ttms100TopologyTagObjectsResponse**](Ttms100TopologyTagObjectsResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

