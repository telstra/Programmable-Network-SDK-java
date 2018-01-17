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
import TelstraTPN.Datacenter;
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
 * InventoryEndpointResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T10:03:16.913+11:00")
public class InventoryEndpointResponse {
  @SerializedName("datacenter")
  private List<Datacenter> datacenter = null;

  public InventoryEndpointResponse datacenter(List<Datacenter> datacenter) {
    this.datacenter = datacenter;
    return this;
  }

  public InventoryEndpointResponse addDatacenterItem(Datacenter datacenterItem) {
    if (this.datacenter == null) {
      this.datacenter = new ArrayList<Datacenter>();
    }
    this.datacenter.add(datacenterItem);
    return this;
  }

   /**
   * 
   * @return datacenter
  **/
  @ApiModelProperty(value = "")
  public List<Datacenter> getDatacenter() {
    return datacenter;
  }

  public void setDatacenter(List<Datacenter> datacenter) {
    this.datacenter = datacenter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryEndpointResponse inventoryEndpointResponse = (InventoryEndpointResponse) o;
    return Objects.equals(this.datacenter, inventoryEndpointResponse.datacenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacenter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryEndpointResponse {\n");
    
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
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

