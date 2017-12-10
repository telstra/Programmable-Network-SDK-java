/*
 * Telstra Programmable Network API
 * Telstra Programmable Network is a self-provisioning platform that allows its users to create on-demand connectivity services between multiple end-points and add various network functions to those services. Programmable Network enables to connectivity to a global ecosystem of networking services as well as public and private cloud services. Once you are connected to the platform on one or more POPs (points of presence), you can start creating those services based on the use case that you want to accomplish. The Programmable Network API is available to all customers who have registered to use the Programmable Network. To register, please contact your account representative.
 *
 * OpenAPI spec version: 2.1.2
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
 * Params
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Params {
  @SerializedName("description")
  private String description = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("bandwidth")
  private Integer bandwidth = null;

  @SerializedName("latency")
  private Integer latency = null;

  @SerializedName("linkid")
  private String linkid = null;

  @SerializedName("contractid")
  private String contractid = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("connections")
  private List<String> connections = null;

  @SerializedName("topology_tag_uuid")
  private String topologyTagUuid = null;

  @SerializedName("billing-id")
  private String billingId = null;

  @SerializedName("renewal-option")
  private Integer renewalOption = null;

  @SerializedName("latency-sla")
  private String latencySla = null;

  @SerializedName("linkstatus")
  private Integer linkstatus = null;

  @SerializedName("link-type")
  private String linkType = null;

  public Params description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Params duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of contract in minutes
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of contract in minutes")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Params bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Bandwidth in kB/s
   * @return bandwidth
  **/
  @ApiModelProperty(value = "Bandwidth in kB/s")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public Params latency(Integer latency) {
    this.latency = latency;
    return this;
  }

   /**
   * Latency: 0&#x3D;Low, 1&#x3D;Standard, 2&#x3D;Best Effort
   * @return latency
  **/
  @ApiModelProperty(value = "Latency: 0=Low, 1=Standard, 2=Best Effort")
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public Params linkid(String linkid) {
    this.linkid = linkid;
    return this;
  }

   /**
   * Identifier of a link
   * @return linkid
  **/
  @ApiModelProperty(value = "Identifier of a link")
  public String getLinkid() {
    return linkid;
  }

  public void setLinkid(String linkid) {
    this.linkid = linkid;
  }

  public Params contractid(String contractid) {
    this.contractid = contractid;
    return this;
  }

   /**
   * Identifier of a contract
   * @return contractid
  **/
  @ApiModelProperty(value = "Identifier of a contract")
  public String getContractid() {
    return contractid;
  }

  public void setContractid(String contractid) {
    this.contractid = contractid;
  }

  public Params price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Params tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Params connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public Params addConnectionsItem(String connectionsItem) {
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
  @ApiModelProperty(value = "")
  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }

  public Params topologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
    return this;
  }

   /**
   * 
   * @return topologyTagUuid
  **/
  @ApiModelProperty(value = "")
  public String getTopologyTagUuid() {
    return topologyTagUuid;
  }

  public void setTopologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
  }

  public Params billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * 
   * @return billingId
  **/
  @ApiModelProperty(value = "")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public Params renewalOption(Integer renewalOption) {
    this.renewalOption = renewalOption;
    return this;
  }

   /**
   * Renewal Option: 0&#x3D;Auto Disconnect, 1&#x3D;Auto Renew, 2&#x3D;Pay per hour
   * @return renewalOption
  **/
  @ApiModelProperty(value = "Renewal Option: 0=Auto Disconnect, 1=Auto Renew, 2=Pay per hour")
  public Integer getRenewalOption() {
    return renewalOption;
  }

  public void setRenewalOption(Integer renewalOption) {
    this.renewalOption = renewalOption;
  }

  public Params latencySla(String latencySla) {
    this.latencySla = latencySla;
    return this;
  }

   /**
   * 
   * @return latencySla
  **/
  @ApiModelProperty(value = "")
  public String getLatencySla() {
    return latencySla;
  }

  public void setLatencySla(String latencySla) {
    this.latencySla = latencySla;
  }

  public Params linkstatus(Integer linkstatus) {
    this.linkstatus = linkstatus;
    return this;
  }

   /**
   * 
   * @return linkstatus
  **/
  @ApiModelProperty(value = "")
  public Integer getLinkstatus() {
    return linkstatus;
  }

  public void setLinkstatus(Integer linkstatus) {
    this.linkstatus = linkstatus;
  }

  public Params linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * 
   * @return linkType
  **/
  @ApiModelProperty(value = "")
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params params = (Params) o;
    return Objects.equals(this.description, params.description) &&
        Objects.equals(this.duration, params.duration) &&
        Objects.equals(this.bandwidth, params.bandwidth) &&
        Objects.equals(this.latency, params.latency) &&
        Objects.equals(this.linkid, params.linkid) &&
        Objects.equals(this.contractid, params.contractid) &&
        Objects.equals(this.price, params.price) &&
        Objects.equals(this.tag, params.tag) &&
        Objects.equals(this.connections, params.connections) &&
        Objects.equals(this.topologyTagUuid, params.topologyTagUuid) &&
        Objects.equals(this.billingId, params.billingId) &&
        Objects.equals(this.renewalOption, params.renewalOption) &&
        Objects.equals(this.latencySla, params.latencySla) &&
        Objects.equals(this.linkstatus, params.linkstatus) &&
        Objects.equals(this.linkType, params.linkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, bandwidth, latency, linkid, contractid, price, tag, connections, topologyTagUuid, billingId, renewalOption, latencySla, linkstatus, linkType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    linkid: ").append(toIndentedString(linkid)).append("\n");
    sb.append("    contractid: ").append(toIndentedString(contractid)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    topologyTagUuid: ").append(toIndentedString(topologyTagUuid)).append("\n");
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
    sb.append("    renewalOption: ").append(toIndentedString(renewalOption)).append("\n");
    sb.append("    latencySla: ").append(toIndentedString(latencySla)).append("\n");
    sb.append("    linkstatus: ").append(toIndentedString(linkstatus)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
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

