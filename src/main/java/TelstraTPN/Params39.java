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
 * Params39
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T10:03:16.913+11:00")
public class Params39 {
  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("bandwidth")
  private Integer bandwidth = null;

  @SerializedName("linkid")
  private String linkid = null;

  @SerializedName("contractid")
  private String contractid = null;

  @SerializedName("currencyId")
  private String currencyId = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("renewal-option")
  private Integer renewalOption = null;

  public Params39 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of contract in minutes
   * minimum: 3600
   * @return duration
  **/
  @ApiModelProperty(example = "3600", value = "Duration of contract in minutes")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Params39 bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Bandwidth in kB/s
   * minimum: 0
   * maximum: 0
   * @return bandwidth
  **/
  @ApiModelProperty(example = "0", value = "Bandwidth in kB/s")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public Params39 linkid(String linkid) {
    this.linkid = linkid;
    return this;
  }

   /**
   * Identifier of a link
   * @return linkid
  **/
  @ApiModelProperty(example = "f070660600c1c45f", value = "Identifier of a link")
  public String getLinkid() {
    return linkid;
  }

  public void setLinkid(String linkid) {
    this.linkid = linkid;
  }

  public Params39 contractid(String contractid) {
    this.contractid = contractid;
    return this;
  }

   /**
   * Identifier of a contract
   * @return contractid
  **/
  @ApiModelProperty(example = "f070660600c1c45f.2", value = "Identifier of a contract")
  public String getContractid() {
    return contractid;
  }

  public void setContractid(String contractid) {
    this.contractid = contractid;
  }

  public Params39 currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * 
   * @return currencyId
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Params39 price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @ApiModelProperty(example = "259", value = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Params39 renewalOption(Integer renewalOption) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params39 params39 = (Params39) o;
    return Objects.equals(this.duration, params39.duration) &&
        Objects.equals(this.bandwidth, params39.bandwidth) &&
        Objects.equals(this.linkid, params39.linkid) &&
        Objects.equals(this.contractid, params39.contractid) &&
        Objects.equals(this.currencyId, params39.currencyId) &&
        Objects.equals(this.price, params39.price) &&
        Objects.equals(this.renewalOption, params39.renewalOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, bandwidth, linkid, contractid, currencyId, price, renewalOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params39 {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    linkid: ").append(toIndentedString(linkid)).append("\n");
    sb.append("    contractid: ").append(toIndentedString(contractid)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    renewalOption: ").append(toIndentedString(renewalOption)).append("\n");
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

