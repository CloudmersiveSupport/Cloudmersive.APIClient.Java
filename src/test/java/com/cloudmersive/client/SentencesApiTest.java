/*
 * nlpapi
 * The powerful Natural Language Processing APIs let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
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
    public void sentencesPostTest() throws ApiException {
        String input = null;
        String response = api.sentencesPost(input);

        // TODO: test validations
    }
    
}
