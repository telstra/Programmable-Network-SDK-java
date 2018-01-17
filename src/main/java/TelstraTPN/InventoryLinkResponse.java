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
import TelstraTPN.Params;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InventoryLinkResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T10:03:16.913+11:00")
public class InventoryLinkResponse {
  @SerializedName("success-auxiliary")
  private String successAuxiliary = null;

  @SerializedName("success-code")
  private Integer successCode = null;

  @SerializedName("success-message")
  private String successMessage = null;

  @SerializedName("params")
  private Params params = null;

  public InventoryLinkResponse successAuxiliary(String successAuxiliary) {
    this.successAuxiliary = successAuxiliary;
    return this;
  }

   /**
   * 
   * @return successAuxiliary
  **/
  @ApiModelProperty(example = "success", value = "")
  public String getSuccessAuxiliary() {
    return successAuxiliary;
  }

  public void setSuccessAuxiliary(String successAuxiliary) {
    this.successAuxiliary = successAuxiliary;
  }

  public InventoryLinkResponse successCode(Integer successCode) {
    this.successCode = successCode;
    return this;
  }

   /**
   * 
   * @return successCode
  **/
  @ApiModelProperty(example = "20000", value = "")
  public Integer getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(Integer successCode) {
    this.successCode = successCode;
  }

  public InventoryLinkResponse successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

   /**
   * 
   * @return successMessage
  **/
  @ApiModelProperty(example = "vport created successfully", value = "")
  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public InventoryLinkResponse params(Params params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public Params getParams() {
    return params;
  }

  public void setParams(Params params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryLinkResponse inventoryLinkResponse = (InventoryLinkResponse) o;
    return Objects.equals(this.successAuxiliary, inventoryLinkResponse.successAuxiliary) &&
        Objects.equals(this.successCode, inventoryLinkResponse.successCode) &&
        Objects.equals(this.successMessage, inventoryLinkResponse.successMessage) &&
        Objects.equals(this.params, inventoryLinkResponse.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successAuxiliary, successCode, successMessage, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryLinkResponse {\n");
    
    sb.append("    successAuxiliary: ").append(toIndentedString(successAuxiliary)).append("\n");
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

