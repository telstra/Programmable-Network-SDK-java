[![Build Status](https://travis-ci.org/telstra/Programmable-Network-SDK-java.svg?branch=master)](https://travis-ci.org/telstra/Programmable-Network-SDK-java)

# Telstra Programmable Network

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>IO.TelstraTPN</groupId>
    <artifactId>TelstraTPN</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "IO.TelstraTPN:TelstraTPN:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/TelstraTPN-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import invalidPackageName.*;
import invalidPackageName.auth.*;
import TelstraTPN.*;
import TelstraTPN.AuthenticationApi;

import java.io.File;
import java.util.*;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: auth
        OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
        auth.setAccessToken("YOUR ACCESS TOKEN");

        AuthenticationApi apiInstance = new AuthenticationApi();
        String grantType = "password"; // String | 
        String username = "username_example"; // String | 
        String password = "password_example"; // String | 
        try {
            Model100AuthGeneratetokenResponse result = apiInstance.createAnAuthenticationToken(grantType, username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#createAnAuthenticationToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://penapi.pacnetconnect.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**createAnAuthenticationToken**](docs/AuthenticationApi.md#createAnAuthenticationToken) | **POST** /1.0.0/auth/generatetoken | Create an authentication token
*AuthenticationApi* | [**validateAuthenticationToken**](docs/AuthenticationApi.md#validateAuthenticationToken) | **GET** /1.0.0/auth/validatetoken | Validate authentication token
*ContractsApi* | [**createNewContractOnSpecifiedLink**](docs/ContractsApi.md#createNewContractOnSpecifiedLink) | **POST** /1.0.0/inventory/links/{linkid}/contract | Create new Contract on specified link
*ContractsApi* | [**getActiveContractByContractID**](docs/ContractsApi.md#getActiveContractByContractID) | **GET** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Get active Contract by ContractID
*ContractsApi* | [**updateActiveContractByContractID**](docs/ContractsApi.md#updateActiveContractByContractID) | **PUT** /1.0.0/inventory/links/{linkid}/contract/{contractid} | Update active Contract by ContractID
*CustomersApi* | [**getAccountInformationDetails**](docs/CustomersApi.md#getAccountInformationDetails) | **GET** /1.0.0/account/{customeruuid} | Get account information details
*CustomersApi* | [**listUsers**](docs/CustomersApi.md#listUsers) | **GET** /1.0.0/account/{customeruuid}/user | List users
*DatacentresApi* | [**getListOfAllTheDataCenters**](docs/DatacentresApi.md#getListOfAllTheDataCenters) | **GET** /1.0.0/inventory/datacenters | Get list of all the data centers
*EndpointsApi* | [**createPhysicalPortEndpoint**](docs/EndpointsApi.md#createPhysicalPortEndpoint) | **POST** /1.0.0/inventory/regularendpoint | Create Physical (Port) Endpoint
*EndpointsApi* | [**createVNFEndpoint**](docs/EndpointsApi.md#createVNFEndpoint) | **POST** /1.0.0/inventory/vnfendpoint | Create VNF Endpoint
*EndpointsApi* | [**getInformationAboutTheSpecifiedEndpoint**](docs/EndpointsApi.md#getInformationAboutTheSpecifiedEndpoint) | **GET** /1.0.0/inventory/endpoint/{endpointuuid} | Get information about the specified endpoint
*EndpointsApi* | [**getListOfEndpointsForACustomer**](docs/EndpointsApi.md#getListOfEndpointsForACustomer) | **GET** /1.0.0/inventory/endpoints/customeruuid/{customeruuid} | Get list of endpoints for a customer
*LinksApi* | [**createLinkAndInitialContract**](docs/LinksApi.md#createLinkAndInitialContract) | **POST** /1.0.0/inventory/link | Create Link and initial Contract
*LinksApi* | [**getActiveLinks**](docs/LinksApi.md#getActiveLinks) | **GET** /1.0.0/inventory/links/customer/{customeruuid} | Get active Links
*LinksApi* | [**getDetailsOfSpecifiedLink**](docs/LinksApi.md#getDetailsOfSpecifiedLink) | **GET** /1.0.0/inventory/links/{linkid} | Get details of specified link
*LinksApi* | [**getLinkHistory**](docs/LinksApi.md#getLinkHistory) | **GET** /1.0.0/inventory/links/history/{linkid} | Get Link history
*TopologiesApi* | [**createANamedTopologyTag**](docs/TopologiesApi.md#createANamedTopologyTag) | **POST** /ttms/1.0.0/topology_tag | Create a named topology tag
*TopologiesApi* | [**getInformationAboutTheSpecifiedTopologyTag**](docs/TopologiesApi.md#getInformationAboutTheSpecifiedTopologyTag) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/ | Get information about the specified topology tag
*TopologiesApi* | [**listAllTopologyTags**](docs/TopologiesApi.md#listAllTopologyTags) | **GET** /ttms/1.0.0/topology_tag | List all topology tags
*TopologiesApi* | [**listObjectsForTopology**](docs/TopologiesApi.md#listObjectsForTopology) | **GET** /ttms/1.0.0/topology_tag/{topotaguuid}/objects/ | List objects for Topology
*VnfsApi* | [**listImagesInTheMarketplace**](docs/VnfsApi.md#listImagesInTheMarketplace) | **GET** /1.0.0/marketplace/image | List images in the Marketplace
*VportsApi* | [**createVNFVPort**](docs/VportsApi.md#createVNFVPort) | **POST** /1.0.0/inventory/vnf/vport | Create VNF VPort
*VportsApi* | [**createVPortForPhysicalEndpoint**](docs/VportsApi.md#createVPortForPhysicalEndpoint) | **POST** /1.0.0/inventory/regularvport | Create VPort for physical endpoint
*VportsApi* | [**getInformationAboutTheSpecifiedVPort**](docs/VportsApi.md#getInformationAboutTheSpecifiedVPort) | **GET** /1.0.0/inventory/vport/{vportuuid} | Get information about the specified VPort


## Documentation for Models

 - [Billing](docs/Billing.md)
 - [Classification](docs/Classification.md)
 - [Contract](docs/Contract.md)
 - [Datacenter](docs/Datacenter.md)
 - [Endpoint](docs/Endpoint.md)
 - [EndpointPort](docs/EndpointPort.md)
 - [Endpointlist](docs/Endpointlist.md)
 - [Error](docs/Error.md)
 - [Error70](docs/Error70.md)
 - [Flavor](docs/Flavor.md)
 - [GlanceImage](docs/GlanceImage.md)
 - [Link](docs/Link.md)
 - [Link62](docs/Link62.md)
 - [Meta](docs/Meta.md)
 - [Model100AccountResponse](docs/Model100AccountResponse.md)
 - [Model100AuthGeneratetokenResponse](docs/Model100AuthGeneratetokenResponse.md)
 - [Model100AuthValidatetokenResponse](docs/Model100AuthValidatetokenResponse.md)
 - [Model100InventoryDatacenters401Error](docs/Model100InventoryDatacenters401Error.md)
 - [Model100InventoryDatacentersResponse](docs/Model100InventoryDatacentersResponse.md)
 - [Model100InventoryEndpointResponse](docs/Model100InventoryEndpointResponse.md)
 - [Model100InventoryEndpointsCustomeruuidResponse](docs/Model100InventoryEndpointsCustomeruuidResponse.md)
 - [Model100InventoryLinkRequest](docs/Model100InventoryLinkRequest.md)
 - [Model100InventoryLinkResponse](docs/Model100InventoryLinkResponse.md)
 - [Model100InventoryLinksContractRequest](docs/Model100InventoryLinksContractRequest.md)
 - [Model100InventoryLinksContractRequest35](docs/Model100InventoryLinksContractRequest35.md)
 - [Model100InventoryLinksContractResponse](docs/Model100InventoryLinksContractResponse.md)
 - [Model100InventoryLinksContractResponse31](docs/Model100InventoryLinksContractResponse31.md)
 - [Model100InventoryLinksContractResponse36](docs/Model100InventoryLinksContractResponse36.md)
 - [Model100InventoryLinksHistoryResponse](docs/Model100InventoryLinksHistoryResponse.md)
 - [Model100InventoryLinksResponse](docs/Model100InventoryLinksResponse.md)
 - [Model100InventoryRegularendpointRequest](docs/Model100InventoryRegularendpointRequest.md)
 - [Model100InventoryRegularendpointResponse](docs/Model100InventoryRegularendpointResponse.md)
 - [Model100InventoryRegularvportRequest](docs/Model100InventoryRegularvportRequest.md)
 - [Model100InventoryRegularvportResponse](docs/Model100InventoryRegularvportResponse.md)
 - [Model100InventoryVnfVportRequest](docs/Model100InventoryVnfVportRequest.md)
 - [Model100InventoryVnfVportResponse](docs/Model100InventoryVnfVportResponse.md)
 - [Model100InventoryVnfendpointRequest](docs/Model100InventoryVnfendpointRequest.md)
 - [Model100InventoryVnfendpointResponse](docs/Model100InventoryVnfendpointResponse.md)
 - [Model100MarketplaceImageResponse](docs/Model100MarketplaceImageResponse.md)
 - [Object50](docs/Object50.md)
 - [Params](docs/Params.md)
 - [Params29](docs/Params29.md)
 - [Params32](docs/Params32.md)
 - [Params37](docs/Params37.md)
 - [Product](docs/Product.md)
 - [Role](docs/Role.md)
 - [SuccessFragment](docs/SuccessFragment.md)
 - [Topology](docs/Topology.md)
 - [Ttms100TopologyTagObjectsResponse](docs/Ttms100TopologyTagObjectsResponse.md)
 - [Ttms100TopologyTagRequest](docs/Ttms100TopologyTagRequest.md)
 - [User](docs/User.md)
 - [Vlan](docs/Vlan.md)
 - [VnfTag](docs/VnfTag.md)
 - [Vport](docs/Vport.md)
 - [Vportvalue](docs/Vportvalue.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.




