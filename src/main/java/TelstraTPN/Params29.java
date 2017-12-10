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
 * Params29
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Params29 {
  @SerializedName("description")
  private String description = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("bandwidth")
  private Integer bandwidth = null;

  @SerializedName("latency")
  private Integer latency = null;

  @SerializedName("linkid")
  private String linkid = null;

  @SerializedName("contractid")
  private String contractid = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("contractStatus")
  private Integer contractStatus = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("deletedtimestamp")
  private Integer deletedtimestamp = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("connection")
  private List<String> connection = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("billing-id")
  private String billingId = null;

  @SerializedName("renewal-option")
  private Integer renewalOption = null;

  @SerializedName("contract-start-time")
  private Integer contractStartTime = null;

  @SerializedName("contract-end-time")
  private Integer contractEndTime = null;

  public Params29 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Params29 duration(Integer duration) {
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

  public Params29 bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Bandwidth in kB/s
   * @return bandwidth
  **/
  @ApiModelProperty(value = "Bandwidth in kB/s")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public Params29 latency(Integer latency) {
    this.latency = latency;
    return this;
  }

   /**
   * Latency: 0&#x3D;Low, 1&#x3D;Standard, 2&#x3D;Best Effort
   * @return latency
  **/
  @ApiModelProperty(value = "Latency: 0=Low, 1=Standard, 2=Best Effort")
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public Params29 linkid(String linkid) {
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

  public Params29 contractid(String contractid) {
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

  public Params29 price(Integer price) {
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

  public Params29 contractStatus(Integer contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

   /**
   * 
   * @return contractStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(Integer contractStatus) {
    this.contractStatus = contractStatus;
  }

  public Params29 version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Params29 deletedtimestamp(Integer deletedtimestamp) {
    this.deletedtimestamp = deletedtimestamp;
    return this;
  }

   /**
   * 
   * @return deletedtimestamp
  **/
  @ApiModelProperty(value = "")
  public Integer getDeletedtimestamp() {
    return deletedtimestamp;
  }

  public void setDeletedtimestamp(Integer deletedtimestamp) {
    this.deletedtimestamp = deletedtimestamp;
  }

  public Params29 tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Params29 connection(List<String> connection) {
    this.connection = connection;
    return this;
  }

  public Params29 addConnectionItem(String connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<String>();
    }
    this.connection.add(connectionItem);
    return this;
  }

   /**
   * 
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public List<String> getConnection() {
    return connection;
  }

  public void setConnection(List<String> connection) {
    this.connection = connection;
  }

  public Params29 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Params29 billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * 
   * @return billingId
  **/
  @ApiModelProperty(value = "")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public Params29 renewalOption(Integer renewalOption) {
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

  public Params29 contractStartTime(Integer contractStartTime) {
    this.contractStartTime = contractStartTime;
    return this;
  }

   /**
   * 
   * @return contractStartTime
  **/
  @ApiModelProperty(value = "")
  public Integer getContractStartTime() {
    return contractStartTime;
  }

  public void setContractStartTime(Integer contractStartTime) {
    this.contractStartTime = contractStartTime;
  }

  public Params29 contractEndTime(Integer contractEndTime) {
    this.contractEndTime = contractEndTime;
    return this;
  }

   /**
   * 
   * @return contractEndTime
  **/
  @ApiModelProperty(value = "")
  public Integer getContractEndTime() {
    return contractEndTime;
  }

  public void setContractEndTime(Integer contractEndTime) {
    this.contractEndTime = contractEndTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params29 params29 = (Params29) o;
    return Objects.equals(this.description, params29.description) &&
        Objects.equals(this.duration, params29.duration) &&
        Objects.equals(this.bandwidth, params29.bandwidth) &&
        Objects.equals(this.latency, params29.latency) &&
        Objects.equals(this.linkid, params29.linkid) &&
        Objects.equals(this.contractid, params29.contractid) &&
        Objects.equals(this.price, params29.price) &&
        Objects.equals(this.contractStatus, params29.contractStatus) &&
        Objects.equals(this.version, params29.version) &&
        Objects.equals(this.deletedtimestamp, params29.deletedtimestamp) &&
        Objects.equals(this.tag, params29.tag) &&
        Objects.equals(this.connection, params29.connection) &&
        Objects.equals(this.type, params29.type) &&
        Objects.equals(this.billingId, params29.billingId) &&
        Objects.equals(this.renewalOption, params29.renewalOption) &&
        Objects.equals(this.contractStartTime, params29.contractStartTime) &&
        Objects.equals(this.contractEndTime, params29.contractEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, bandwidth, latency, linkid, contractid, price, contractStatus, version, deletedtimestamp, tag, connection, type, billingId, renewalOption, contractStartTime, contractEndTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params29 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    linkid: ").append(toIndentedString(linkid)).append("\n");
    sb.append("    contractid: ").append(toIndentedString(contractid)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    deletedtimestamp: ").append(toIndentedString(deletedtimestamp)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
    sb.append("    renewalOption: ").append(toIndentedString(renewalOption)).append("\n");
    sb.append("    contractStartTime: ").append(toIndentedString(contractStartTime)).append("\n");
    sb.append("    contractEndTime: ").append(toIndentedString(contractEndTime)).append("\n");
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

