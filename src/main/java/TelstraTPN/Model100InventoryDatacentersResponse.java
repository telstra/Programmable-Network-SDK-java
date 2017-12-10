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
 * Model100InventoryDatacentersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Model100InventoryDatacentersResponse {
  @SerializedName("cityname")
  private String cityname = null;

  @SerializedName("countryname")
  private String countryname = null;

  @SerializedName("datacentername")
  private String datacentername = null;

  @SerializedName("datacentercode")
  private String datacentercode = null;

  @SerializedName("datacenteruuid")
  private String datacenteruuid = null;

  @SerializedName("interfacetypes")
  private List<String> interfacetypes = null;

  @SerializedName("operatorname")
  private String operatorname = null;

  public Model100InventoryDatacentersResponse cityname(String cityname) {
    this.cityname = cityname;
    return this;
  }

   /**
   * 
   * @return cityname
  **/
  @ApiModelProperty(value = "")
  public String getCityname() {
    return cityname;
  }

  public void setCityname(String cityname) {
    this.cityname = cityname;
  }

  public Model100InventoryDatacentersResponse countryname(String countryname) {
    this.countryname = countryname;
    return this;
  }

   /**
   * 
   * @return countryname
  **/
  @ApiModelProperty(value = "")
  public String getCountryname() {
    return countryname;
  }

  public void setCountryname(String countryname) {
    this.countryname = countryname;
  }

  public Model100InventoryDatacentersResponse datacentername(String datacentername) {
    this.datacentername = datacentername;
    return this;
  }

   /**
   * 
   * @return datacentername
  **/
  @ApiModelProperty(value = "")
  public String getDatacentername() {
    return datacentername;
  }

  public void setDatacentername(String datacentername) {
    this.datacentername = datacentername;
  }

  public Model100InventoryDatacentersResponse datacentercode(String datacentercode) {
    this.datacentercode = datacentercode;
    return this;
  }

   /**
   * 
   * @return datacentercode
  **/
  @ApiModelProperty(value = "")
  public String getDatacentercode() {
    return datacentercode;
  }

  public void setDatacentercode(String datacentercode) {
    this.datacentercode = datacentercode;
  }

  public Model100InventoryDatacentersResponse datacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
    return this;
  }

   /**
   * 
   * @return datacenteruuid
  **/
  @ApiModelProperty(value = "")
  public String getDatacenteruuid() {
    return datacenteruuid;
  }

  public void setDatacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
  }

  public Model100InventoryDatacentersResponse interfacetypes(List<String> interfacetypes) {
    this.interfacetypes = interfacetypes;
    return this;
  }

  public Model100InventoryDatacentersResponse addInterfacetypesItem(String interfacetypesItem) {
    if (this.interfacetypes == null) {
      this.interfacetypes = new ArrayList<String>();
    }
    this.interfacetypes.add(interfacetypesItem);
    return this;
  }

   /**
   * 
   * @return interfacetypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getInterfacetypes() {
    return interfacetypes;
  }

  public void setInterfacetypes(List<String> interfacetypes) {
    this.interfacetypes = interfacetypes;
  }

  public Model100InventoryDatacentersResponse operatorname(String operatorname) {
    this.operatorname = operatorname;
    return this;
  }

   /**
   * 
   * @return operatorname
  **/
  @ApiModelProperty(value = "")
  public String getOperatorname() {
    return operatorname;
  }

  public void setOperatorname(String operatorname) {
    this.operatorname = operatorname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model100InventoryDatacentersResponse _100InventoryDatacentersResponse = (Model100InventoryDatacentersResponse) o;
    return Objects.equals(this.cityname, _100InventoryDatacentersResponse.cityname) &&
        Objects.equals(this.countryname, _100InventoryDatacentersResponse.countryname) &&
        Objects.equals(this.datacentername, _100InventoryDatacentersResponse.datacentername) &&
        Objects.equals(this.datacentercode, _100InventoryDatacentersResponse.datacentercode) &&
        Objects.equals(this.datacenteruuid, _100InventoryDatacentersResponse.datacenteruuid) &&
        Objects.equals(this.interfacetypes, _100InventoryDatacentersResponse.interfacetypes) &&
        Objects.equals(this.operatorname, _100InventoryDatacentersResponse.operatorname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityname, countryname, datacentername, datacentercode, datacenteruuid, interfacetypes, operatorname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model100InventoryDatacentersResponse {\n");
    
    sb.append("    cityname: ").append(toIndentedString(cityname)).append("\n");
    sb.append("    countryname: ").append(toIndentedString(countryname)).append("\n");
    sb.append("    datacentername: ").append(toIndentedString(datacentername)).append("\n");
    sb.append("    datacentercode: ").append(toIndentedString(datacentercode)).append("\n");
    sb.append("    datacenteruuid: ").append(toIndentedString(datacenteruuid)).append("\n");
    sb.append("    interfacetypes: ").append(toIndentedString(interfacetypes)).append("\n");
    sb.append("    operatorname: ").append(toIndentedString(operatorname)).append("\n");
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

