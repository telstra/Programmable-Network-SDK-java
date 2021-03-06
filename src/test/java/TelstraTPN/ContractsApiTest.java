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

import invalidPackageName.ApiException;
import TelstraTPN.Model100InventoryLinksContractRequest;
import TelstraTPN.Model100InventoryLinksContractRequest35;
import TelstraTPN.Model100InventoryLinksContractResponse;
import TelstraTPN.Model100InventoryLinksContractResponse31;
import TelstraTPN.Model100InventoryLinksContractResponse36;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
@Ignore
public class ContractsApiTest {

    private final ContractsApi api = new ContractsApi();

    
    /**
     * Create new Contract on specified link
     *
     * Create new Contract on specified link
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewContractOnSpecifiedLinkTest() throws ApiException {
        String linkid = null;
        Model100InventoryLinksContractRequest35 body = null;
        Model100InventoryLinksContractResponse36 response = api.createNewContractOnSpecifiedLink(linkid, body);

        // TODO: test validations
    }
    
    /**
     * Get active Contract by ContractID
     *
     * Get active Contract by ContractID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveContractByContractIDTest() throws ApiException {
        String linkid = null;
        String contractid = null;
        Model100InventoryLinksContractResponse response = api.getActiveContractByContractID(linkid, contractid);

        // TODO: test validations
    }
    
    /**
     * Update active Contract by ContractID
     *
     * Update active Contract by ContractID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateActiveContractByContractIDTest() throws ApiException {
        String linkid = null;
        String contractid = null;
        Model100InventoryLinksContractRequest body = null;
        Model100InventoryLinksContractResponse31 response = api.updateActiveContractByContractID(linkid, contractid, body);

        // TODO: test validations
    }
    
}
