/*
 * Simple  API
 * This is a simple API with auto mocking enabled
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hariprakash@nousinfo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevelopersApi
 */
@Ignore
public class DevelopersApiTest {

    private final DevelopersApi api = new DevelopersApi();

    /**
     * app login
     *
     * login to app 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        String userId = null;
        String response = api.login(userId);

        // TODO: test validations
    }
}