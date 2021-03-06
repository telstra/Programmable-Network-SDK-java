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
import TelstraTPN.Vport;
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
 * EndpointPort
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class EndpointPort {
  @SerializedName("cabletype")
  private String cabletype = null;

  @SerializedName("connectortype")
  private String connectortype = null;

  @SerializedName("cfa")
  private String cfa = null;

  @SerializedName("endpointuuid")
  private String endpointuuid = null;

  @SerializedName("interfacespeed")
  private String interfacespeed = null;

  @SerializedName("interfacetype")
  private String interfacetype = null;

  @SerializedName("vport")
  private List<Vport> vport = null;

  public EndpointPort cabletype(String cabletype) {
    this.cabletype = cabletype;
    return this;
  }

   /**
   * 
   * @return cabletype
  **/
  @ApiModelProperty(example = "SMF", value = "")
  public String getCabletype() {
    return cabletype;
  }

  public void setCabletype(String cabletype) {
    this.cabletype = cabletype;
  }

  public EndpointPort connectortype(String connectortype) {
    this.connectortype = connectortype;
    return this;
  }

   /**
   * 
   * @return connectortype
  **/
  @ApiModelProperty(example = "LC", value = "")
  public String getConnectortype() {
    return connectortype;
  }

  public void setConnectortype(String connectortype) {
    this.connectortype = connectortype;
  }

  public EndpointPort cfa(String cfa) {
    this.cfa = cfa;
    return this;
  }

   /**
   * 
   * @return cfa
  **/
  @ApiModelProperty(example = "10GBase-LR SMF/LC", value = "")
  public String getCfa() {
    return cfa;
  }

  public void setCfa(String cfa) {
    this.cfa = cfa;
  }

  public EndpointPort endpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
    return this;
  }

   /**
   * 
   * @return endpointuuid
  **/
  @ApiModelProperty(example = "8843fd24-4ef6-4a7d-8241-aed3778d6f07", value = "")
  public String getEndpointuuid() {
    return endpointuuid;
  }

  public void setEndpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
  }

  public EndpointPort interfacespeed(String interfacespeed) {
    this.interfacespeed = interfacespeed;
    return this;
  }

   /**
   * 
   * @return interfacespeed
  **/
  @ApiModelProperty(example = "100", value = "")
  public String getInterfacespeed() {
    return interfacespeed;
  }

  public void setInterfacespeed(String interfacespeed) {
    this.interfacespeed = interfacespeed;
  }

  public EndpointPort interfacetype(String interfacetype) {
    this.interfacetype = interfacetype;
    return this;
  }

   /**
   * 
   * @return interfacetype
  **/
  @ApiModelProperty(example = "10GBase-LR", value = "")
  public String getInterfacetype() {
    return interfacetype;
  }

  public void setInterfacetype(String interfacetype) {
    this.interfacetype = interfacetype;
  }

  public EndpointPort vport(List<Vport> vport) {
    this.vport = vport;
    return this;
  }

  public EndpointPort addVportItem(Vport vportItem) {
    if (this.vport == null) {
      this.vport = new ArrayList<Vport>();
    }
    this.vport.add(vportItem);
    return this;
  }

   /**
   * 
   * @return vport
  **/
  @ApiModelProperty(value = "")
  public List<Vport> getVport() {
    return vport;
  }

  public void setVport(List<Vport> vport) {
    this.vport = vport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPort endpointPort = (EndpointPort) o;
    return Objects.equals(this.cabletype, endpointPort.cabletype) &&
        Objects.equals(this.connectortype, endpointPort.connectortype) &&
        Objects.equals(this.cfa, endpointPort.cfa) &&
        Objects.equals(this.endpointuuid, endpointPort.endpointuuid) &&
        Objects.equals(this.interfacespeed, endpointPort.interfacespeed) &&
        Objects.equals(this.interfacetype, endpointPort.interfacetype) &&
        Objects.equals(this.vport, endpointPort.vport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabletype, connectortype, cfa, endpointuuid, interfacespeed, interfacetype, vport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPort {\n");
    
    sb.append("    cabletype: ").append(toIndentedString(cabletype)).append("\n");
    sb.append("    connectortype: ").append(toIndentedString(connectortype)).append("\n");
    sb.append("    cfa: ").append(toIndentedString(cfa)).append("\n");
    sb.append("    endpointuuid: ").append(toIndentedString(endpointuuid)).append("\n");
    sb.append("    interfacespeed: ").append(toIndentedString(interfacespeed)).append("\n");
    sb.append("    interfacetype: ").append(toIndentedString(interfacetype)).append("\n");
    sb.append("    vport: ").append(toIndentedString(vport)).append("\n");
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

