/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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


import java.io.File;
import com.cloudmersive.client.model.ImageDescriptionResponse;
import com.cloudmersive.client.model.ObjectDetectionResult;
import com.cloudmersive.client.model.VehicleLicensePlateDetectionResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecognizeApi {
    private ApiClient apiClient;

    public RecognizeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecognizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for recognizeDescribe
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeDescribeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/recognize/describe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call recognizeDescribeValidateBeforeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling recognizeDescribe(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeDescribeCall(imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ImageDescriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageDescriptionResponse recognizeDescribe(File imageFile) throws ApiException {
        ApiResponse<ImageDescriptionResponse> resp = recognizeDescribeWithHttpInfo(imageFile);
        return resp.getData();
    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;ImageDescriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageDescriptionResponse> recognizeDescribeWithHttpInfo(File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = recognizeDescribeValidateBeforeCall(imageFile, null, null);
        Type localVarReturnType = new TypeToken<ImageDescriptionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Describe an image in natural language (asynchronously)
     * Generate an English language text description of the image as a sentence.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeDescribeAsync(File imageFile, final ApiCallback<ImageDescriptionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeDescribeValidateBeforeCall(imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageDescriptionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for recognizeDetectAndUnskewDocument
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectAndUnskewDocumentCall(File imageFile, String postProcessingEffect, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/recognize/detect-document/unskew";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (postProcessingEffect != null)
        localVarHeaderParams.put("PostProcessingEffect", apiClient.parameterToString(postProcessingEffect));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call recognizeDetectAndUnskewDocumentValidateBeforeCall(File imageFile, String postProcessingEffect, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling recognizeDetectAndUnskewDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeDetectAndUnskewDocumentCall(imageFile, postProcessingEffect, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] recognizeDetectAndUnskewDocument(File imageFile, String postProcessingEffect) throws ApiException {
        ApiResponse<byte[]> resp = recognizeDetectAndUnskewDocumentWithHttpInfo(imageFile, postProcessingEffect);
        return resp.getData();
    }

    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> recognizeDetectAndUnskewDocumentWithHttpInfo(File imageFile, String postProcessingEffect) throws ApiException {
        com.squareup.okhttp.Call call = recognizeDetectAndUnskewDocumentValidateBeforeCall(imageFile, postProcessingEffect, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detect and unskew a photo of a document (asynchronously)
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectAndUnskewDocumentAsync(File imageFile, String postProcessingEffect, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeDetectAndUnskewDocumentValidateBeforeCall(imageFile, postProcessingEffect, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for recognizeDetectObjects
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectObjectsCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/recognize/detect-objects";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call recognizeDetectObjectsValidateBeforeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling recognizeDetectObjects(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeDetectObjectsCall(imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detect objects, including types and locations, in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ObjectDetectionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ObjectDetectionResult recognizeDetectObjects(File imageFile) throws ApiException {
        ApiResponse<ObjectDetectionResult> resp = recognizeDetectObjectsWithHttpInfo(imageFile);
        return resp.getData();
    }

    /**
     * Detect objects, including types and locations, in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;ObjectDetectionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ObjectDetectionResult> recognizeDetectObjectsWithHttpInfo(File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = recognizeDetectObjectsValidateBeforeCall(imageFile, null, null);
        Type localVarReturnType = new TypeToken<ObjectDetectionResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detect objects, including types and locations, in an image (asynchronously)
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectObjectsAsync(File imageFile, final ApiCallback<ObjectDetectionResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeDetectObjectsValidateBeforeCall(imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ObjectDetectionResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for recognizeDetectPeople
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectPeopleCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/recognize/detect-people";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call recognizeDetectPeopleValidateBeforeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling recognizeDetectPeople(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeDetectPeopleCall(imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detect people, including locations, in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ObjectDetectionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ObjectDetectionResult recognizeDetectPeople(File imageFile) throws ApiException {
        ApiResponse<ObjectDetectionResult> resp = recognizeDetectPeopleWithHttpInfo(imageFile);
        return resp.getData();
    }

    /**
     * Detect people, including locations, in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;ObjectDetectionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ObjectDetectionResult> recognizeDetectPeopleWithHttpInfo(File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = recognizeDetectPeopleValidateBeforeCall(imageFile, null, null);
        Type localVarReturnType = new TypeToken<ObjectDetectionResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detect people, including locations, in an image (asynchronously)
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectPeopleAsync(File imageFile, final ApiCallback<ObjectDetectionResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeDetectPeopleValidateBeforeCall(imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ObjectDetectionResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for recognizeDetectVehicleLicensePlates
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectVehicleLicensePlatesCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/recognize/detect-vehicle-license-plates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call recognizeDetectVehicleLicensePlatesValidateBeforeCall(File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling recognizeDetectVehicleLicensePlates(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeDetectVehicleLicensePlatesCall(imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return VehicleLicensePlateDetectionResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VehicleLicensePlateDetectionResult recognizeDetectVehicleLicensePlates(File imageFile) throws ApiException {
        ApiResponse<VehicleLicensePlateDetectionResult> resp = recognizeDetectVehicleLicensePlatesWithHttpInfo(imageFile);
        return resp.getData();
    }

    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;VehicleLicensePlateDetectionResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VehicleLicensePlateDetectionResult> recognizeDetectVehicleLicensePlatesWithHttpInfo(File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = recognizeDetectVehicleLicensePlatesValidateBeforeCall(imageFile, null, null);
        Type localVarReturnType = new TypeToken<VehicleLicensePlateDetectionResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detect vehicle license plates in an image (asynchronously)
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeDetectVehicleLicensePlatesAsync(File imageFile, final ApiCallback<VehicleLicensePlateDetectionResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeDetectVehicleLicensePlatesValidateBeforeCall(imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VehicleLicensePlateDetectionResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
