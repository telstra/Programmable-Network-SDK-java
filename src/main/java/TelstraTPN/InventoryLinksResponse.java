/*
 * Telstra Programmable Network API
 * Telstra Programmable Network is a self-provisioning platform that allows its users to create on-demand connectivity services between multiple end-points and add various network functions to those services. Programmable Network enables to connectivity to a global ecosystem of networking services as well as public and private cloud services. Once you are connected to the platform on one or more POPs (points of presence), you can start creating those services based on the use case that you want to accomplish. The Programmable Network API is available to all customers who have registered to use the Programmable Network. To register, please contact your account representative.
 *
 * OpenAPI spec version: 2.1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package TelstraTPN;

import java.util.Objects;
import TelstraTPN.Contract;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InventoryLinksResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class InventoryLinksResponse {
  @SerializedName("description")
  private String description = null;

  @SerializedName("latency")
  private Integer latency = null;

  @SerializedName("linkid")
  private String linkid = null;

  @SerializedName("contracts")
  private List<Contract> contracts = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("connections")
  private List<String> connections = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("linkStatus")
  private Integer linkStatus = null;

  @SerializedName("topology_tag_uuid")
  private String topologyTagUuid = null;

  @SerializedName("billing-id")
  private String billingId = null;

  public InventoryLinksResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "MEL-SYD", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InventoryLinksResponse latency(Integer latency) {
    this.latency = latency;
    return this;
  }

   /**
   * Latency: 0&#x3D;Low, 1&#x3D;Standard, 2&#x3D;Best Effort
   * @return latency
  **/
  @ApiModelProperty(example = "0", value = "Latency: 0=Low, 1=Standard, 2=Best Effort")
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public InventoryLinksResponse linkid(String linkid) {
    this.linkid = linkid;
    return this;
  }

   /**
   * Identifier of a link
   * @return linkid
  **/
  @ApiModelProperty(example = "f070660600c1c45f", value = "Identifier of a link")
  public String getLinkid() {
    return linkid;
  }

  public void setLinkid(String linkid) {
    this.linkid = linkid;
  }

  public InventoryLinksResponse contracts(List<Contract> contracts) {
    this.contracts = contracts;
    return this;
  }

  public InventoryLinksResponse addContractsItem(Contract contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<Contract>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * 
   * @return contracts
  **/
  @ApiModelProperty(value = "")
  public List<Contract> getContracts() {
    return contracts;
  }

  public void setContracts(List<Contract> contracts) {
    this.contracts = contracts;
  }

  public InventoryLinksResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @ApiModelProperty(example = "prod", value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public InventoryLinksResponse connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public InventoryLinksResponse addConnectionsItem(String connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<String>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * 
   * @return connections
  **/
  @ApiModelProperty(example = "[\"5134d2ba-ce81-4b1c-9242-d2f30896c3a0\",\"e2f182ee-8c06-410d-b0fe-e21c9e7ee7bd\"]", value = "")
  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }

  public InventoryLinksResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InventoryLinksResponse linkStatus(Integer linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }

   /**
   * 
   * @return linkStatus
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getLinkStatus() {
    return linkStatus;
  }

  public void setLinkStatus(Integer linkStatus) {
    this.linkStatus = linkStatus;
  }

  public InventoryLinksResponse topologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
    return this;
  }

   /**
   * 
   * @return topologyTagUuid
  **/
  @ApiModelProperty(example = "5f02ee19-8de3-4a0d-8baf-823e4aa16780", value = "")
  public String getTopologyTagUuid() {
    return topologyTagUuid;
  }

  public void setTopologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
  }

  public InventoryLinksResponse billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * 
   * @return billingId
  **/
  @ApiModelProperty(example = "d04544ba-6c9c-4e84-bd60-848e56a116c4", value = "")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryLinksResponse inventoryLinksResponse = (InventoryLinksResponse) o;
    return Objects.equals(this.description, inventoryLinksResponse.description) &&
        Objects.equals(this.latency, inventoryLinksResponse.latency) &&
        Objects.equals(this.linkid, inventoryLinksResponse.linkid) &&
        Objects.equals(this.contracts, inventoryLinksResponse.contracts) &&
        Objects.equals(this.tag, inventoryLinksResponse.tag) &&
        Objects.equals(this.connections, inventoryLinksResponse.connections) &&
        Objects.equals(this.type, inventoryLinksResponse.type) &&
        Objects.equals(this.linkStatus, inventoryLinksResponse.linkStatus) &&
        Objects.equals(this.topologyTagUuid, inventoryLinksResponse.topologyTagUuid) &&
        Objects.equals(this.billingId, inventoryLinksResponse.billingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, latency, linkid, contracts, tag, connections, type, linkStatus, topologyTagUuid, billingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryLinksResponse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    linkid: ").append(toIndentedString(linkid)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    topologyTagUuid: ").append(toIndentedString(topologyTagUuid)).append("\n");
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

