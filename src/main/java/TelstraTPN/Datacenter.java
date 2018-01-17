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
import TelstraTPN.EndpointPort;
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
 * Datacenter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class Datacenter {
  @SerializedName("datacenteruuid")
  private String datacenteruuid = null;

  @SerializedName("port")
  private List<EndpointPort> port = null;

  public Datacenter datacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
    return this;
  }

   /**
   * 
   * @return datacenteruuid
  **/
  @ApiModelProperty(example = "fb089004-53c9-476e-b7b2-3cc91829e0d1", value = "")
  public String getDatacenteruuid() {
    return datacenteruuid;
  }

  public void setDatacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
  }

  public Datacenter port(List<EndpointPort> port) {
    this.port = port;
    return this;
  }

  public Datacenter addPortItem(EndpointPort portItem) {
    if (this.port == null) {
      this.port = new ArrayList<EndpointPort>();
    }
    this.port.add(portItem);
    return this;
  }

   /**
   * 
   * @return port
  **/
  @ApiModelProperty(value = "")
  public List<EndpointPort> getPort() {
    return port;
  }

  public void setPort(List<EndpointPort> port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datacenter datacenter = (Datacenter) o;
    return Objects.equals(this.datacenteruuid, datacenter.datacenteruuid) &&
        Objects.equals(this.port, datacenter.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacenteruuid, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datacenter {\n");
    
    sb.append("    datacenteruuid: ").append(toIndentedString(datacenteruuid)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

