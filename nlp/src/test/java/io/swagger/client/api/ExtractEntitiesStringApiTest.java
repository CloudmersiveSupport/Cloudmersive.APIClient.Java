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
 * API tests for ExtractEntitiesStringApi
 */
@Ignore
public class ExtractEntitiesStringApiTest {

    private final ExtractEntitiesStringApi api = new ExtractEntitiesStringApi();

    
    /**
     * Extract entities from string
     *
     * Extract the named entitites from an input string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extractEntitiesStringPostTest() throws ApiException {
        String value = null;
        String response = api.extractEntitiesStringPost(value);

        // TODO: test validations
    }
    
}
