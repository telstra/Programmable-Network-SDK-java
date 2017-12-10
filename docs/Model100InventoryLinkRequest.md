
# Model100InventoryLinkRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**connections** | **List&lt;String&gt;** |  |  [optional]
**tag** | **String** |  |  [optional]
**latency** | **Integer** | Latency: 0&#x3D;Low, 1&#x3D;Standard, 2&#x3D;Best Effort |  [optional]
**duration** | **Integer** | Duration of contract in minutes |  [optional]
**bandwidth** | **Integer** | Bandwidth in kB/s |  [optional]
**renewalOption** | **Integer** | Renewal Option: 0&#x3D;Auto Disconnect, 1&#x3D;Auto Renew, 2&#x3D;Pay per hour |  [optional]
**linkType** | **Integer** | 1&#x3D;VLAN, 2&#x3D;VNF |  [optional]
**topologyTagUuid** | **String** |  |  [optional]



