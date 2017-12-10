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

/**
 * Params32
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Params32 {
  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("linkid")
  private String linkid = null;

  @SerializedName("contractid")
  private String contractid = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("renewal-option")
  private Integer renewalOption = null;

  public Params32 duration(Integer duration) {
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

  public Params32 linkid(String linkid) {
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

  public Params32 contractid(String contractid) {
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

  public Params32 price(Integer price) {
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

  public Params32 renewalOption(Integer renewalOption) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params32 params32 = (Params32) o;
    return Objects.equals(this.duration, params32.duration) &&
        Objects.equals(this.linkid, params32.linkid) &&
        Objects.equals(this.contractid, params32.contractid) &&
        Objects.equals(this.price, params32.price) &&
        Objects.equals(this.renewalOption, params32.renewalOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, linkid, contractid, price, renewalOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params32 {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    linkid: ").append(toIndentedString(linkid)).append("\n");
    sb.append("    contractid: ").append(toIndentedString(contractid)).append("\n");
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
