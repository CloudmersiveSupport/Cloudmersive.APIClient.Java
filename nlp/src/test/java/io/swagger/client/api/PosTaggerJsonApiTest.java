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
import io.swagger.client.model.PosRequest;
import io.swagger.client.model.PosResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PosTaggerJsonApi
 */
@Ignore
public class PosTaggerJsonApiTest {

    private final PosTaggerJsonApi api = new PosTaggerJsonApi();

    
    /**
     * Part-of-speech tag a string
     *
     * Part-of-speech (POS) tag a string and return result as JSON
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void posTaggerJsonPostTest() throws ApiException {
        PosRequest request = null;
        PosResponse response = api.posTaggerJsonPost(request);

        // TODO: test validations
    }
    
}
