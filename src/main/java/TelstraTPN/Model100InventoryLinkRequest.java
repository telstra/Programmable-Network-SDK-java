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
 * Model100InventoryLinkRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-19T14:16:29.049+11:00")
public class Model100InventoryLinkRequest {
  @SerializedName("billing-id")
  private String billingId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("connections")
  private List<String> connections = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("latency")
  private Integer latency = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("bandwidth")
  private Integer bandwidth = null;

  @SerializedName("renewal-option")
  private Integer renewalOption = null;

  @SerializedName("link-type")
  private Integer linkType = null;

  @SerializedName("topology_tag_uuid")
  private String topologyTagUuid = null;

  public Model100InventoryLinkRequest billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * 
   * @return billingId
  **/
  @ApiModelProperty(example = "684903a3-78b0-4005-9bfe-eece54ad42f3", value = "")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public Model100InventoryLinkRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "Replication link between Equinix Sydney and Melbourne NextDC", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Model100InventoryLinkRequest connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public Model100InventoryLinkRequest addConnectionsItem(String connectionsItem) {
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

  public Model100InventoryLinkRequest tag(String tag) {
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

  public Model100InventoryLinkRequest latency(Integer latency) {
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

  public Model100InventoryLinkRequest duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of contract in minutes
   * @return duration
  **/
  @ApiModelProperty(example = "3600", value = "Duration of contract in minutes")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Model100InventoryLinkRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Bandwidth in kB/s
   * @return bandwidth
  **/
  @ApiModelProperty(example = "1000", value = "Bandwidth in kB/s")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public Model100InventoryLinkRequest renewalOption(Integer renewalOption) {
    this.renewalOption = renewalOption;
    return this;
  }

   /**
   * Renewal Option: 0&#x3D;Auto Disconnect, 1&#x3D;Auto Renew, 2&#x3D;Pay per hour
   * @return renewalOption
  **/
  @ApiModelProperty(example = "0", value = "Renewal Option: 0=Auto Disconnect, 1=Auto Renew, 2=Pay per hour")
  public Integer getRenewalOption() {
    return renewalOption;
  }

  public void setRenewalOption(Integer renewalOption) {
    this.renewalOption = renewalOption;
  }

  public Model100InventoryLinkRequest linkType(Integer linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * 1&#x3D;VLAN, 2&#x3D;VNF
   * @return linkType
  **/
  @ApiModelProperty(example = "1", value = "1=VLAN, 2=VNF")
  public Integer getLinkType() {
    return linkType;
  }

  public void setLinkType(Integer linkType) {
    this.linkType = linkType;
  }

  public Model100InventoryLinkRequest topologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
    return this;
  }

   /**
   * 
   * @return topologyTagUuid
  **/
  @ApiModelProperty(example = "684903a3-78b0-4005-9bfe-eece54ad42f3", value = "")
  public String getTopologyTagUuid() {
    return topologyTagUuid;
  }

  public void setTopologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model100InventoryLinkRequest _100InventoryLinkRequest = (Model100InventoryLinkRequest) o;
    return Objects.equals(this.billingId, _100InventoryLinkRequest.billingId) &&
        Objects.equals(this.description, _100InventoryLinkRequest.description) &&
        Objects.equals(this.connections, _100InventoryLinkRequest.connections) &&
        Objects.equals(this.tag, _100InventoryLinkRequest.tag) &&
        Objects.equals(this.latency, _100InventoryLinkRequest.latency) &&
        Objects.equals(this.duration, _100InventoryLinkRequest.duration) &&
        Objects.equals(this.bandwidth, _100InventoryLinkRequest.bandwidth) &&
        Objects.equals(this.renewalOption, _100InventoryLinkRequest.renewalOption) &&
        Objects.equals(this.linkType, _100InventoryLinkRequest.linkType) &&
        Objects.equals(this.topologyTagUuid, _100InventoryLinkRequest.topologyTagUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingId, description, connections, tag, latency, duration, bandwidth, renewalOption, linkType, topologyTagUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model100InventoryLinkRequest {\n");
    
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    renewalOption: ").append(toIndentedString(renewalOption)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    topologyTagUuid: ").append(toIndentedString(topologyTagUuid)).append("\n");
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

