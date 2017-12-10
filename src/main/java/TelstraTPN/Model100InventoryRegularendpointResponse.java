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
 * Model100InventoryRegularendpointResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Model100InventoryRegularendpointResponse {
  @SerializedName("success-auxiliary")
  private String successAuxiliary = null;

  @SerializedName("success-code")
  private Integer successCode = null;

  @SerializedName("success-message")
  private String successMessage = null;

  @SerializedName("endpointuuid")
  private String endpointuuid = null;

  public Model100InventoryRegularendpointResponse successAuxiliary(String successAuxiliary) {
    this.successAuxiliary = successAuxiliary;
    return this;
  }

   /**
   * 
   * @return successAuxiliary
  **/
  @ApiModelProperty(value = "")
  public String getSuccessAuxiliary() {
    return successAuxiliary;
  }

  public void setSuccessAuxiliary(String successAuxiliary) {
    this.successAuxiliary = successAuxiliary;
  }

  public Model100InventoryRegularendpointResponse successCode(Integer successCode) {
    this.successCode = successCode;
    return this;
  }

   /**
   * 
   * @return successCode
  **/
  @ApiModelProperty(value = "")
  public Integer getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(Integer successCode) {
    this.successCode = successCode;
  }

  public Model100InventoryRegularendpointResponse successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

   /**
   * 
   * @return successMessage
  **/
  @ApiModelProperty(value = "")
  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public Model100InventoryRegularendpointResponse endpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
    return this;
  }

   /**
   * 
   * @return endpointuuid
  **/
  @ApiModelProperty(value = "")
  public String getEndpointuuid() {
    return endpointuuid;
  }

  public void setEndpointuuid(String endpointuuid) {
    this.endpointuuid = endpointuuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model100InventoryRegularendpointResponse _100InventoryRegularendpointResponse = (Model100InventoryRegularendpointResponse) o;
    return Objects.equals(this.successAuxiliary, _100InventoryRegularendpointResponse.successAuxiliary) &&
        Objects.equals(this.successCode, _100InventoryRegularendpointResponse.successCode) &&
        Objects.equals(this.successMessage, _100InventoryRegularendpointResponse.successMessage) &&
        Objects.equals(this.endpointuuid, _100InventoryRegularendpointResponse.endpointuuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successAuxiliary, successCode, successMessage, endpointuuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model100InventoryRegularendpointResponse {\n");
    
    sb.append("    successAuxiliary: ").append(toIndentedString(successAuxiliary)).append("\n");
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    endpointuuid: ").append(toIndentedString(endpointuuid)).append("\n");
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

