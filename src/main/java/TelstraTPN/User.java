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
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class User {
  @SerializedName("useruuid")
  private String useruuid = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("usercountry")
  private String usercountry = null;

  @SerializedName("emailaddress")
  private String emailaddress = null;

  @SerializedName("jobtitle")
  private String jobtitle = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("middlename")
  private String middlename = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("phonenumber")
  private String phonenumber = null;

  @SerializedName("phoneext")
  private String phoneext = null;

  @SerializedName("phonetype")
  private String phonetype = null;

  public User useruuid(String useruuid) {
    this.useruuid = useruuid;
    return this;
  }

   /**
   * 
   * @return useruuid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUseruuid() {
    return useruuid;
  }

  public void setUseruuid(String useruuid) {
    this.useruuid = useruuid;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public User title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User usercountry(String usercountry) {
    this.usercountry = usercountry;
    return this;
  }

   /**
   * 
   * @return usercountry
  **/
  @ApiModelProperty(value = "")
  public String getUsercountry() {
    return usercountry;
  }

  public void setUsercountry(String usercountry) {
    this.usercountry = usercountry;
  }

  public User emailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
    return this;
  }

   /**
   * 
   * @return emailaddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailaddress() {
    return emailaddress;
  }

  public void setEmailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
  }

  public User jobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
    return this;
  }

   /**
   * 
   * @return jobtitle
  **/
  @ApiModelProperty(value = "")
  public String getJobtitle() {
    return jobtitle;
  }

  public void setJobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * 
   * @return firstname
  **/
  @ApiModelProperty(value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User middlename(String middlename) {
    this.middlename = middlename;
    return this;
  }

   /**
   * 
   * @return middlename
  **/
  @ApiModelProperty(value = "")
  public String getMiddlename() {
    return middlename;
  }

  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * 
   * @return lastname
  **/
  @ApiModelProperty(value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * 
   * @return phonenumber
  **/
  @ApiModelProperty(value = "")
  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  public User phoneext(String phoneext) {
    this.phoneext = phoneext;
    return this;
  }

   /**
   * 
   * @return phoneext
  **/
  @ApiModelProperty(value = "")
  public String getPhoneext() {
    return phoneext;
  }

  public void setPhoneext(String phoneext) {
    this.phoneext = phoneext;
  }

  public User phonetype(String phonetype) {
    this.phonetype = phonetype;
    return this;
  }

   /**
   * 
   * @return phonetype
  **/
  @ApiModelProperty(value = "")
  public String getPhonetype() {
    return phonetype;
  }

  public void setPhonetype(String phonetype) {
    this.phonetype = phonetype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.useruuid, user.useruuid) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.usercountry, user.usercountry) &&
        Objects.equals(this.emailaddress, user.emailaddress) &&
        Objects.equals(this.jobtitle, user.jobtitle) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.middlename, user.middlename) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.phonenumber, user.phonenumber) &&
        Objects.equals(this.phoneext, user.phoneext) &&
        Objects.equals(this.phonetype, user.phonetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useruuid, status, title, usercountry, emailaddress, jobtitle, firstname, middlename, lastname, phonenumber, phoneext, phonetype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    useruuid: ").append(toIndentedString(useruuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    usercountry: ").append(toIndentedString(usercountry)).append("\n");
    sb.append("    emailaddress: ").append(toIndentedString(emailaddress)).append("\n");
    sb.append("    jobtitle: ").append(toIndentedString(jobtitle)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
    sb.append("    phoneext: ").append(toIndentedString(phoneext)).append("\n");
    sb.append("    phonetype: ").append(toIndentedString(phonetype)).append("\n");
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

