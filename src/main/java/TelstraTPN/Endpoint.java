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
 * Endpoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-30T09:45:30.716+11:00")
public class Endpoint {
  @SerializedName("endpoint_uuid")
  private String endpointUuid = null;

  @SerializedName("vports")
  private List<String> vports = null;

  public Endpoint endpointUuid(String endpointUuid) {
    this.endpointUuid = endpointUuid;
    return this;
  }

   /**
   * 
   * @return endpointUuid
  **/
  @ApiModelProperty(value = "")
  public String getEndpointUuid() {
    return endpointUuid;
  }

  public void setEndpointUuid(String endpointUuid) {
    this.endpointUuid = endpointUuid;
  }

  public Endpoint vports(List<String> vports) {
    this.vports = vports;
    return this;
  }

  public Endpoint addVportsItem(String vportsItem) {
    if (this.vports == null) {
      this.vports = new ArrayList<String>();
    }
    this.vports.add(vportsItem);
    return this;
  }

   /**
   * 
   * @return vports
  **/
  @ApiModelProperty(value = "")
  public List<String> getVports() {
    return vports;
  }

  public void setVports(List<String> vports) {
    this.vports = vports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.endpointUuid, endpoint.endpointUuid) &&
        Objects.equals(this.vports, endpoint.vports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUuid, vports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    endpointUuid: ").append(toIndentedString(endpointUuid)).append("\n");
    sb.append("    vports: ").append(toIndentedString(vports)).append("\n");
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

