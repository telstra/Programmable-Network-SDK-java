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
 * Eis100EndpointsAssignTopologyTagRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T21:20:10.329+11:00")
public class Eis100EndpointsAssignTopologyTagRequest {
  @SerializedName("topology_tag")
  private String topologyTag = null;

  public Eis100EndpointsAssignTopologyTagRequest topologyTag(String topologyTag) {
    this.topologyTag = topologyTag;
    return this;
  }

   /**
   * 
   * @return topologyTag
  **/
  @ApiModelProperty(example = "38d17228-0179-491f-9e84-36ddd078b8e6", value = "")
  public String getTopologyTag() {
    return topologyTag;
  }

  public void setTopologyTag(String topologyTag) {
    this.topologyTag = topologyTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eis100EndpointsAssignTopologyTagRequest eis100EndpointsAssignTopologyTagRequest = (Eis100EndpointsAssignTopologyTagRequest) o;
    return Objects.equals(this.topologyTag, eis100EndpointsAssignTopologyTagRequest.topologyTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eis100EndpointsAssignTopologyTagRequest {\n");
    
    sb.append("    topologyTag: ").append(toIndentedString(topologyTag)).append("\n");
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

