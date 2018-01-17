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
import TelstraTPN.Endpoint;
import TelstraTPN.Link66;
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
 * Ttms100TopologyTagObjectsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T10:03:16.913+11:00")
public class Ttms100TopologyTagObjectsResponse {
  @SerializedName("endpoints")
  private List<Endpoint> endpoints = null;

  @SerializedName("links")
  private List<Link66> links = null;

  @SerializedName("sharedvports")
  private List<String> sharedvports = null;

  @SerializedName("topology_tag")
  private String topologyTag = null;

  public Ttms100TopologyTagObjectsResponse endpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Ttms100TopologyTagObjectsResponse addEndpointsItem(Endpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<Endpoint>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * 
   * @return endpoints
  **/
  @ApiModelProperty(value = "")
  public List<Endpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }

  public Ttms100TopologyTagObjectsResponse links(List<Link66> links) {
    this.links = links;
    return this;
  }

  public Ttms100TopologyTagObjectsResponse addLinksItem(Link66 linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link66>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * 
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link66> getLinks() {
    return links;
  }

  public void setLinks(List<Link66> links) {
    this.links = links;
  }

  public Ttms100TopologyTagObjectsResponse sharedvports(List<String> sharedvports) {
    this.sharedvports = sharedvports;
    return this;
  }

  public Ttms100TopologyTagObjectsResponse addSharedvportsItem(String sharedvportsItem) {
    if (this.sharedvports == null) {
      this.sharedvports = new ArrayList<String>();
    }
    this.sharedvports.add(sharedvportsItem);
    return this;
  }

   /**
   * 
   * @return sharedvports
  **/
  @ApiModelProperty(value = "")
  public List<String> getSharedvports() {
    return sharedvports;
  }

  public void setSharedvports(List<String> sharedvports) {
    this.sharedvports = sharedvports;
  }

  public Ttms100TopologyTagObjectsResponse topologyTag(String topologyTag) {
    this.topologyTag = topologyTag;
    return this;
  }

   /**
   * 
   * @return topologyTag
  **/
  @ApiModelProperty(example = "7a09af3d-d4e5-4538-a1e6-9f83d751e163", value = "")
  public String getTopologyTag() {
    return topologyTag;
  }

  public void setTopologyTag(String topologyTag) {
    this.topologyTag = topologyTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ttms100TopologyTagObjectsResponse ttms100TopologyTagObjectsResponse = (Ttms100TopologyTagObjectsResponse) o;
    return Objects.equals(this.endpoints, ttms100TopologyTagObjectsResponse.endpoints) &&
        Objects.equals(this.links, ttms100TopologyTagObjectsResponse.links) &&
        Objects.equals(this.sharedvports, ttms100TopologyTagObjectsResponse.sharedvports) &&
        Objects.equals(this.topologyTag, ttms100TopologyTagObjectsResponse.topologyTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, links, sharedvports, topologyTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ttms100TopologyTagObjectsResponse {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    sharedvports: ").append(toIndentedString(sharedvports)).append("\n");
    sb.append("    topologyTag: ").append(toIndentedString(topologyTag)).append("\n");
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

