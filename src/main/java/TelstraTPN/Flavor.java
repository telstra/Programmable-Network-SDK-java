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
 * Flavor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T10:03:16.913+11:00")
public class Flavor {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disk")
  private Integer disk = null;

  @SerializedName("ephemeral")
  private Integer ephemeral = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("ram")
  private Integer ram = null;

  @SerializedName("specific_customer")
  private String specificCustomer = null;

  @SerializedName("swap")
  private Integer swap = null;

  @SerializedName("vcpus")
  private Integer vcpus = null;

  public Flavor currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Flavor description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "Flavor for CSP image", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Flavor disk(Integer disk) {
    this.disk = disk;
    return this;
  }

   /**
   * 
   * @return disk
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getDisk() {
    return disk;
  }

  public void setDisk(Integer disk) {
    this.disk = disk;
  }

  public Flavor ephemeral(Integer ephemeral) {
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * 
   * @return ephemeral
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getEphemeral() {
    return ephemeral;
  }

  public void setEphemeral(Integer ephemeral) {
    this.ephemeral = ephemeral;
  }

  public Flavor id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "3", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Flavor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "Medium-CSP", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Flavor price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @ApiModelProperty(example = "0.4", value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Flavor ram(Integer ram) {
    this.ram = ram;
    return this;
  }

   /**
   * 
   * @return ram
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getRam() {
    return ram;
  }

  public void setRam(Integer ram) {
    this.ram = ram;
  }

  public Flavor specificCustomer(String specificCustomer) {
    this.specificCustomer = specificCustomer;
    return this;
  }

   /**
   * 
   * @return specificCustomer
  **/
  @ApiModelProperty(value = "")
  public String getSpecificCustomer() {
    return specificCustomer;
  }

  public void setSpecificCustomer(String specificCustomer) {
    this.specificCustomer = specificCustomer;
  }

  public Flavor swap(Integer swap) {
    this.swap = swap;
    return this;
  }

   /**
   * 
   * @return swap
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getSwap() {
    return swap;
  }

  public void setSwap(Integer swap) {
    this.swap = swap;
  }

  public Flavor vcpus(Integer vcpus) {
    this.vcpus = vcpus;
    return this;
  }

   /**
   * 
   * @return vcpus
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getVcpus() {
    return vcpus;
  }

  public void setVcpus(Integer vcpus) {
    this.vcpus = vcpus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flavor flavor = (Flavor) o;
    return Objects.equals(this.currency, flavor.currency) &&
        Objects.equals(this.description, flavor.description) &&
        Objects.equals(this.disk, flavor.disk) &&
        Objects.equals(this.ephemeral, flavor.ephemeral) &&
        Objects.equals(this.id, flavor.id) &&
        Objects.equals(this.name, flavor.name) &&
        Objects.equals(this.price, flavor.price) &&
        Objects.equals(this.ram, flavor.ram) &&
        Objects.equals(this.specificCustomer, flavor.specificCustomer) &&
        Objects.equals(this.swap, flavor.swap) &&
        Objects.equals(this.vcpus, flavor.vcpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, description, disk, ephemeral, id, name, price, ram, specificCustomer, swap, vcpus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flavor {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    specificCustomer: ").append(toIndentedString(specificCustomer)).append("\n");
    sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
    sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
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

