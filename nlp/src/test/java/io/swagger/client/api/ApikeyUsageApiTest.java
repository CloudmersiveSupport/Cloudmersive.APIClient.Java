/*
 * nlpapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
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
 * API tests for ApikeyUsageApi
 */
@Ignore
public class ApikeyUsageApiTest {

    private final ApikeyUsageApi api = new ApikeyUsageApi();

    
    /**
     * Get API Key usage
     *
     * Use this API to determine how many API calls you have made during this month.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apikeyUsageGetTest() throws ApiException {
        String id = null;
        Long response = api.apikeyUsageGet(id);

        // TODO: test validations
    }
    
}
