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
import TelstraTPN.Vportvalue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Model100InventoryRegularvportRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Model100InventoryRegularvportRequest {
  @SerializedName("vporttype")
  private String vporttype = null;

  @SerializedName("endpointuuid")
  private String endpointuuid = null;

  @SerializedName("vportvalue")
  private Vportvalue vportvalue = null;

  public Model100InventoryRegularvportRequest vporttype(String vporttype) {
    this.vporttype = vporttype;
    return this;
  }

   /**
   * 
   * @return vporttype
  **/
  @ApiModelProperty(value = "")
  public String getVporttype() {
    return vporttype;
  }

  public void setVporttype(String vporttype) {
    this.vporttype = vporttype;
  }

  public Model100InventoryRegularvportRequest endpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
    return this;
  }

   /**
   * 
   * @return endpointuuid
  **/
  @ApiModelProperty(value = "")
  public String getEndpointuuid() {
    return endpointuuid;
  }

  public void setEndpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
  }

  public Model100InventoryRegularvportRequest vportvalue(Vportvalue vportvalue) {
    this.vportvalue = vportvalue;
    return this;
  }

   /**
   * Get vportvalue
   * @return vportvalue
  **/
  @ApiModelProperty(value = "")
  public Vportvalue getVportvalue() {
    return vportvalue;
  }

  public void setVportvalue(Vportvalue vportvalue) {
    this.vportvalue = vportvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model100InventoryRegularvportRequest _100InventoryRegularvportRequest = (Model100InventoryRegularvportRequest) o;
    return Objects.equals(this.vporttype, _100InventoryRegularvportRequest.vporttype) &&
        Objects.equals(this.endpointuuid, _100InventoryRegularvportRequest.endpointuuid) &&
        Objects.equals(this.vportvalue, _100InventoryRegularvportRequest.vportvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vporttype, endpointuuid, vportvalue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model100InventoryRegularvportRequest {\n");
    
    sb.append("    vporttype: ").append(toIndentedString(vporttype)).append("\n");
    sb.append("    endpointuuid: ").append(toIndentedString(endpointuuid)).append("\n");
    sb.append("    vportvalue: ").append(toIndentedString(vportvalue)).append("\n");
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

