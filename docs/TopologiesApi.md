# TopologiesApi

All URIs are relative to *https://penapi.pacnetconnect.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ttms100TopologyTagByTopotaguuidDelete**](TopologiesApi.md#ttms100TopologyTagByTopotaguuidDelete) | **DELETE** /ttms/1.0.0/topology_tag/{topotaguuid}/ | Delete a topology tag
[**ttms100TopologyTagByTopotaguuidGet**](TopologiesApi.md#ttms100TopologyTagByTopotaguuidGet) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/ | Get information about the specified topology tag
[**ttms100TopologyTagByTopotaguuidPut**](TopologiesApi.md#ttms100TopologyTagByTopotaguuidPut) | **PUT** /ttms/1.0.0/topology_tag/{topotaguuid}/ | Update a topology tag&#39;s name and/or description
[**ttms100TopologyTagGet**](TopologiesApi.md#ttms100TopologyTagGet) | **GET** /ttms/1.0.0/topology_tag | List all topology tags
[**ttms100TopologyTagObjectsByTopotaguuidGet**](TopologiesApi.md#ttms100TopologyTagObjectsByTopotaguuidGet) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/objects/ | List objects for Topology
[**ttms100TopologyTagPost**](TopologiesApi.md#ttms100TopologyTagPost) | **POST** /ttms/1.0.0/topology_tag | Create a named topology tag


<a name="ttms100TopologyTagByTopotaguuidDelete"></a>
# **ttms100TopologyTagByTopotaguuidDelete**
> ttms100TopologyTagByTopotaguuidDelete(topotaguuid)

Delete a topology tag

Delete a topology tag

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
try {
    apiInstance.ttms100TopologyTagByTopotaguuidDelete(topotaguuid);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagByTopotaguuidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topotaguuid** | **String**| Unique identifier representing a specific topology tag |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ttms100TopologyTagByTopotaguuidGet"></a>
# **ttms100TopologyTagByTopotaguuidGet**
> Topology ttms100TopologyTagByTopotaguuidGet(topotaguuid)

Get information about the specified topology tag

Get information about the specified topology tag

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
try {
    Topology result = apiInstance.ttms100TopologyTagByTopotaguuidGet(topotaguuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagByTopotaguuidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ttms100TopologyTagByTopotaguuidPut"></a>
# **ttms100TopologyTagByTopotaguuidPut**
> Topology ttms100TopologyTagByTopotaguuidPut(topotaguuid, body)

Update a topology tag&#39;s name and/or description

Update a topology tag&#39;s name and/or description

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
Ttms100TopologyTagRequest body = new Ttms100TopologyTagRequest(); // Ttms100TopologyTagRequest | 
try {
    Topology result = apiInstance.ttms100TopologyTagByTopotaguuidPut(topotaguuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagByTopotaguuidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topotaguuid** | **String**| Unique identifier representing a specific topology tag |
 **body** | [**Ttms100TopologyTagRequest**](Ttms100TopologyTagRequest.md)|  | [optional]

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ttms100TopologyTagGet"></a>
# **ttms100TopologyTagGet**
> List&lt;Topology&gt; ttms100TopologyTagGet()

List all topology tags

List all topology tags

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
try {
    List<Topology> result = apiInstance.ttms100TopologyTagGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Topology&gt;**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ttms100TopologyTagObjectsByTopotaguuidGet"></a>
# **ttms100TopologyTagObjectsByTopotaguuidGet**
> Ttms100TopologyTagObjectsResponse ttms100TopologyTagObjectsByTopotaguuidGet(topotaguuid)

List objects for Topology

List all objects (Endpoints, Links, VPorts, etc.) associated with the topology tag.

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
String topotaguuid = "topotaguuid_example"; // String | Unique identifier representing a specific topology tag
try {
    Ttms100TopologyTagObjectsResponse result = apiInstance.ttms100TopologyTagObjectsByTopotaguuidGet(topotaguuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagObjectsByTopotaguuidGet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ttms100TopologyTagPost"></a>
# **ttms100TopologyTagPost**
> Topology ttms100TopologyTagPost(body)

Create a named topology tag

Create a named topology tag

### Example
```java
// Import classes:
//import invalidPackageName.ApiException;
//import TelstraTPN.TopologiesApi;


TopologiesApi apiInstance = new TopologiesApi();
Ttms100TopologyTagRequest body = new Ttms100TopologyTagRequest(); // Ttms100TopologyTagRequest | 
try {
    Topology result = apiInstance.ttms100TopologyTagPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopologiesApi#ttms100TopologyTagPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

