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


package com.cloudmersive.client;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SentencesApi
 */
@Ignore
public class SentencesApiTest {

    private final SentencesApi api = new SentencesApi();

    
    /**
     * Extract sentences from string
     *
     * Segment an input string into separate sentences, output result as a string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sentencesPostTest() {
        String input = null;
        String response = api.sentencesPost(input);

        // TODO: test validations
    }
    
}
