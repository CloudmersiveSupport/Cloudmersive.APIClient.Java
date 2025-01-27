/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import java.io.File;
import com.cloudmersive.client.model.HtmlMdResult;
import com.cloudmersive.client.model.HtmlToOfficeRequest;
import com.cloudmersive.client.model.HtmlToPdfRequest;
import com.cloudmersive.client.model.ScreenshotRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertWebApi
 */
@Ignore
public class ConvertWebApiTest {

    private final ConvertWebApi api = new ConvertWebApi();

    
    /**
     * HTML to DOCX
     *
     * Convert HTML to Office Word Document (DOCX) format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToDocxTest() throws ApiException {
        HtmlToOfficeRequest inputRequest = null;
        byte[] response = api.convertWebHtmlToDocx(inputRequest);

        // TODO: test validations
    }
    
    /**
     * Convert HTML string to PDF
     *
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToPdfTest() throws ApiException {
        HtmlToPdfRequest input = null;
        byte[] response = api.convertWebHtmlToPdf(input);

        // TODO: test validations
    }
    
    /**
     * Convert Markdown to HTML
     *
     * Convert a markdown file (.md) to HTML
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertWebMdToHtmlTest() throws ApiException {
        File inputFile = null;
        HtmlMdResult response = api.convertWebMdToHtml(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert a URL to PDF
     *
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertWebUrlToPdfTest() throws ApiException {
        ScreenshotRequest input = null;
        byte[] response = api.convertWebUrlToPdf(input);

        // TODO: test validations
    }
    
    /**
     * Take screenshot of URL
     *
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertWebUrlToScreenshotTest() throws ApiException {
        ScreenshotRequest input = null;
        byte[] response = api.convertWebUrlToScreenshot(input);

        // TODO: test validations
    }
    
}
