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

import com.cloudmersive.client.invoker.ApiCallback;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.ApiResponse;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.Pair;
import com.cloudmersive.client.invoker.ProgressRequestBody;
import com.cloudmersive.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cloudmersive.client.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.model.HtmlTemplateApplicationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertTemplateApi {
    private ApiClient apiClient;

    public ConvertTemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConvertTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for convertTemplateApplyHtmlTemplate
     * @param value Operations to apply to template (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call convertTemplateApplyHtmlTemplateCall(HtmlTemplateApplicationRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/convert/template/html/apply";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call convertTemplateApplyHtmlTemplateValidateBeforeCall(HtmlTemplateApplicationRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = convertTemplateApplyHtmlTemplateCall(value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * @param value Operations to apply to template (required)
     * @return HtmlTemplateApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(HtmlTemplateApplicationRequest value) throws ApiException {
        ApiResponse<HtmlTemplateApplicationResponse> resp = convertTemplateApplyHtmlTemplateWithHttpInfo(value);
        return resp.getData();
    }

    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * @param value Operations to apply to template (required)
     * @return ApiResponse&lt;HtmlTemplateApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlTemplateApplicationResponse> convertTemplateApplyHtmlTemplateWithHttpInfo(HtmlTemplateApplicationRequest value) throws ApiException {
        com.squareup.okhttp.Call call = convertTemplateApplyHtmlTemplateValidateBeforeCall(value, null, null);
        Type localVarReturnType = new TypeToken<HtmlTemplateApplicationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Apply HTML template (asynchronously)
     * Apply operations to fill in an HTML template, generating a final HTML result
     * @param value Operations to apply to template (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call convertTemplateApplyHtmlTemplateAsync(HtmlTemplateApplicationRequest value, final ApiCallback<HtmlTemplateApplicationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = convertTemplateApplyHtmlTemplateValidateBeforeCall(value, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlTemplateApplicationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
