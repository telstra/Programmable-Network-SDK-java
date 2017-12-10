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
import TelstraTPN.Model100AuthGeneratetokenResponse;
import TelstraTPN.Model100AuthValidatetokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Ignore
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    
    /**
     * Create an authentication token
     *
     * Create an authentication token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAnAuthenticationTokenTest() throws ApiException {
        String grantType = null;
        String username = null;
        String password = null;
        Model100AuthGeneratetokenResponse response = api.createAnAuthenticationToken(grantType, username, password);

        // TODO: test validations
    }
    
    /**
     * Validate authentication token
     *
     * Validate the authentication token and get information about the user (roles, permissions, etc.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateAuthenticationTokenTest() throws ApiException {
        Model100AuthValidatetokenResponse response = api.validateAuthenticationToken();

        // TODO: test validations
    }
    
}