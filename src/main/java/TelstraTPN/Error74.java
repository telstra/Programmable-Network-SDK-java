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
 * Error74
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class Error74 {
  @SerializedName("ns")
  private String ns = null;

  @SerializedName("error-code")
  private Integer errorCode = null;

  @SerializedName("error-message")
  private String errorMessage = null;

  @SerializedName("error-auxiliary")
  private String errorAuxiliary = null;

  public Error74 ns(String ns) {
    this.ns = ns;
    return this;
  }

   /**
   * 
   * @return ns
  **/
  @ApiModelProperty(value = "")
  public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public Error74 errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 
   * @return errorCode
  **/
  @ApiModelProperty(example = "1010099", value = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public Error74 errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Error74 errorAuxiliary(String errorAuxiliary) {
    this.errorAuxiliary = errorAuxiliary;
    return this;
  }

   /**
   * 
   * @return errorAuxiliary
  **/
  @ApiModelProperty(value = "")
  public String getErrorAuxiliary() {
    return errorAuxiliary;
  }

  public void setErrorAuxiliary(String errorAuxiliary) {
    this.errorAuxiliary = errorAuxiliary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error74 error74 = (Error74) o;
    return Objects.equals(this.ns, error74.ns) &&
        Objects.equals(this.errorCode, error74.errorCode) &&
        Objects.equals(this.errorMessage, error74.errorMessage) &&
        Objects.equals(this.errorAuxiliary, error74.errorAuxiliary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ns, errorCode, errorMessage, errorAuxiliary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error74 {\n");
    
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorAuxiliary: ").append(toIndentedString(errorAuxiliary)).append("\n");
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

