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
 * API tests for ParseStringApi
 */
@Ignore
public class ParseStringApiTest {

    private final ParseStringApi api = new ParseStringApi();

    
    /**
     * Parse string to syntax tree
     *
     * Parses the input string into a Penn Treebank syntax tree
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseStringPostTest() throws ApiException {
        String input = null;
        String response = api.parseStringPost(input);

        // TODO: test validations
    }
    
}
