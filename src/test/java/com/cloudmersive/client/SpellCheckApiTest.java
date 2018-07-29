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
import com.cloudmersive.client.model.CheckJsonResponse;
import com.cloudmersive.client.model.CheckSentenceJsonResponse;
import com.cloudmersive.client.model.CorrectJsonResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpellCheckApi
 */
@Ignore
public class SpellCheckApiTest {

    private final SpellCheckApi api = new SpellCheckApi();

    
    /**
     * Spell check word
     *
     * Spell check a word as JSON
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckCheckJsonTest() throws ApiException {
        String value = null;
        CheckJsonResponse response = api.spellCheckCheckJson(value);

        // TODO: test validations
    }
    
    /**
     * Check if sentence is spelled correctly
     *
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckCheckSentenceJsonTest() throws ApiException {
        String value = null;
        CheckSentenceJsonResponse response = api.spellCheckCheckSentenceJson(value);

        // TODO: test validations
    }
    
    /**
     * Spell check a sentence
     *
     * Check if a sentence is spelled correctly
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckCheckSentenceStringTest() throws ApiException {
        String value = null;
        Boolean response = api.spellCheckCheckSentenceString(value);

        // TODO: test validations
    }
    
    /**
     * Find spelling corrections
     *
     * Find the spelling corrections for a word
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckCorrectTest() throws ApiException {
        String value = null;
        String response = api.spellCheckCorrect(value);

        // TODO: test validations
    }
    
    /**
     * Find spelling corrections
     *
     * Find spelling correction suggestions and return result as JSON
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckCorrectJsonTest() throws ApiException {
        String value = null;
        CorrectJsonResponse response = api.spellCheckCorrectJson(value);

        // TODO: test validations
    }
    
    /**
     * Spell check a word
     *
     * Check if a word is spelled correctly
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spellCheckPostTest() throws ApiException {
        String value = null;
        Boolean response = api.spellCheckPost(value);

        // TODO: test validations
    }
    
}
