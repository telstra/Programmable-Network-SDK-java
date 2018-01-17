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

/**
 * InventoryVnfendpointRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class InventoryVnfendpointRequest {
  @SerializedName("customeruuid")
  private String customeruuid = null;

  @SerializedName("imageuuid")
  private Integer imageuuid = null;

  @SerializedName("flavoruuid")
  private Integer flavoruuid = null;

  @SerializedName("datacenteruuid")
  private String datacenteruuid = null;

  @SerializedName("config")
  private String config = null;

  @SerializedName("topology_tag_uuid")
  private String topologyTagUuid = null;

  public InventoryVnfendpointRequest customeruuid(String customeruuid) {
    this.customeruuid = customeruuid;
    return this;
  }

   /**
   * 
   * @return customeruuid
  **/
  @ApiModelProperty(example = "e66546d2-eb85-442f-a4d4-a4f6f4cee6bc", required = true, value = "")
  public String getCustomeruuid() {
    return customeruuid;
  }

  public void setCustomeruuid(String customeruuid) {
    this.customeruuid = customeruuid;
  }

  public InventoryVnfendpointRequest imageuuid(Integer imageuuid) {
    this.imageuuid = imageuuid;
    return this;
  }

   /**
   * 
   * @return imageuuid
  **/
  @ApiModelProperty(example = "21", required = true, value = "")
  public Integer getImageuuid() {
    return imageuuid;
  }

  public void setImageuuid(Integer imageuuid) {
    this.imageuuid = imageuuid;
  }

  public InventoryVnfendpointRequest flavoruuid(Integer flavoruuid) {
    this.flavoruuid = flavoruuid;
    return this;
  }

   /**
   * 
   * @return flavoruuid
  **/
  @ApiModelProperty(example = "22", required = true, value = "")
  public Integer getFlavoruuid() {
    return flavoruuid;
  }

  public void setFlavoruuid(Integer flavoruuid) {
    this.flavoruuid = flavoruuid;
  }

  public InventoryVnfendpointRequest datacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
    return this;
  }

   /**
   * 
   * @return datacenteruuid
  **/
  @ApiModelProperty(example = "2e5ff2d1-da1b-4e5d-81a8-58f1780b1031", required = true, value = "")
  public String getDatacenteruuid() {
    return datacenteruuid;
  }

  public void setDatacenteruuid(String datacenteruuid) {
    this.datacenteruuid = datacenteruuid;
  }

  public InventoryVnfendpointRequest config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Boot configuration for VNF, base64 encoded
   * @return config
  **/
  @ApiModelProperty(required = true, value = "Boot configuration for VNF, base64 encoded")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public InventoryVnfendpointRequest topologyTagUuid(String topologyTagUuid) {
    this.topologyTagUuid = topologyTagUuid;
    return this;
  }

   /**
   * 
   * @return topologyTagUuid
  **/
  @ApiModelProperty(example = "f6c14b31-f29f-4be2-919b-5b7f463e4a3c", value = "")
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
    InventoryVnfendpointRequest inventoryVnfendpointRequest = (InventoryVnfendpointRequest) o;
    return Objects.equals(this.customeruuid, inventoryVnfendpointRequest.customeruuid) &&
        Objects.equals(this.imageuuid, inventoryVnfendpointRequest.imageuuid) &&
        Objects.equals(this.flavoruuid, inventoryVnfendpointRequest.flavoruuid) &&
        Objects.equals(this.datacenteruuid, inventoryVnfendpointRequest.datacenteruuid) &&
        Objects.equals(this.config, inventoryVnfendpointRequest.config) &&
        Objects.equals(this.topologyTagUuid, inventoryVnfendpointRequest.topologyTagUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customeruuid, imageuuid, flavoruuid, datacenteruuid, config, topologyTagUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryVnfendpointRequest {\n");
    
    sb.append("    customeruuid: ").append(toIndentedString(customeruuid)).append("\n");
    sb.append("    imageuuid: ").append(toIndentedString(imageuuid)).append("\n");
    sb.append("    flavoruuid: ").append(toIndentedString(flavoruuid)).append("\n");
    sb.append("    datacenteruuid: ").append(toIndentedString(datacenteruuid)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
