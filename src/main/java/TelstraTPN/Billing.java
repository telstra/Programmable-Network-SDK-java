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
 * Billing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class Billing {
  @SerializedName("billingid")
  private String billingid = null;

  @SerializedName("billing-account")
  private String billingAccount = null;

  public Billing billingid(String billingid) {
    this.billingid = billingid;
    return this;
  }

   /**
   * 
   * @return billingid
  **/
  @ApiModelProperty(example = "dae2cb75-89f2-4b5b-be99-5cf3ae3faa20", value = "")
  public String getBillingid() {
    return billingid;
  }

  public void setBillingid(String billingid) {
    this.billingid = billingid;
  }

  public Billing billingAccount(String billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

   /**
   * 
   * @return billingAccount
  **/
  @ApiModelProperty(example = "60012345", value = "")
  public String getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(String billingAccount) {
    this.billingAccount = billingAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billing billing = (Billing) o;
    return Objects.equals(this.billingid, billing.billingid) &&
        Objects.equals(this.billingAccount, billing.billingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingid, billingAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billing {\n");
    
    sb.append("    billingid: ").append(toIndentedString(billingid)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
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

