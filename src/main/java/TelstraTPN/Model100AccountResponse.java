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
 * Model100AccountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-19T14:16:29.049+11:00")
public class Model100AccountResponse {
  @SerializedName("phone")
  private String phone = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("companyuuid")
  private String companyuuid = null;

  @SerializedName("companyname")
  private String companyname = null;

  @SerializedName("postalcode")
  private String postalcode = null;

  @SerializedName("customertype")
  private String customertype = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("customeraccountid")
  private String customeraccountid = null;

  public Model100AccountResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * 
   * @return phone
  **/
  @ApiModelProperty(example = "7026661954", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Model100AccountResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(example = "Dallas", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Model100AccountResponse fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * 
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Model100AccountResponse country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(example = "USA", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Model100AccountResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @ApiModelProperty(example = "555 Paularino Avenue", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Model100AccountResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(example = "Texas", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Model100AccountResponse website(String website) {
    this.website = website;
    return this;
  }

   /**
   * 
   * @return website
  **/
  @ApiModelProperty(example = "http://dummy.com", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Model100AccountResponse companyuuid(String companyuuid) {
    this.companyuuid = companyuuid;
    return this;
  }

   /**
   * 
   * @return companyuuid
  **/
  @ApiModelProperty(example = "a6cef301-de34-4654-8933-ceafc7d2ae6e", value = "")
  public String getCompanyuuid() {
    return companyuuid;
  }

  public void setCompanyuuid(String companyuuid) {
    this.companyuuid = companyuuid;
  }

  public Model100AccountResponse companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * 
   * @return companyname
  **/
  @ApiModelProperty(example = "customer.pen.10", value = "")
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public Model100AccountResponse postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

   /**
   * 
   * @return postalcode
  **/
  @ApiModelProperty(example = "75024", value = "")
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }

  public Model100AccountResponse customertype(String customertype) {
    this.customertype = customertype;
    return this;
  }

   /**
   * 
   * @return customertype
  **/
  @ApiModelProperty(value = "")
  public String getCustomertype() {
    return customertype;
  }

  public void setCustomertype(String customertype) {
    this.customertype = customertype;
  }

  public Model100AccountResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Model100AccountResponse customeraccountid(String customeraccountid) {
    this.customeraccountid = customeraccountid;
    return this;
  }

   /**
   * 
   * @return customeraccountid
  **/
  @ApiModelProperty(example = "71234010", value = "")
  public String getCustomeraccountid() {
    return customeraccountid;
  }

  public void setCustomeraccountid(String customeraccountid) {
    this.customeraccountid = customeraccountid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model100AccountResponse _100AccountResponse = (Model100AccountResponse) o;
    return Objects.equals(this.phone, _100AccountResponse.phone) &&
        Objects.equals(this.city, _100AccountResponse.city) &&
        Objects.equals(this.fax, _100AccountResponse.fax) &&
        Objects.equals(this.country, _100AccountResponse.country) &&
        Objects.equals(this.address, _100AccountResponse.address) &&
        Objects.equals(this.state, _100AccountResponse.state) &&
        Objects.equals(this.website, _100AccountResponse.website) &&
        Objects.equals(this.companyuuid, _100AccountResponse.companyuuid) &&
        Objects.equals(this.companyname, _100AccountResponse.companyname) &&
        Objects.equals(this.postalcode, _100AccountResponse.postalcode) &&
        Objects.equals(this.customertype, _100AccountResponse.customertype) &&
        Objects.equals(this.status, _100AccountResponse.status) &&
        Objects.equals(this.customeraccountid, _100AccountResponse.customeraccountid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, city, fax, country, address, state, website, companyuuid, companyname, postalcode, customertype, status, customeraccountid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model100AccountResponse {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    companyuuid: ").append(toIndentedString(companyuuid)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    customertype: ").append(toIndentedString(customertype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customeraccountid: ").append(toIndentedString(customeraccountid)).append("\n");
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

