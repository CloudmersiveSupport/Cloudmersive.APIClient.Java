# DomainApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainCheck**](DomainApi.md#domainCheck) | **POST** /validate/domain/check | Validate a domain name
[**domainPost**](DomainApi.md#domainPost) | **POST** /validate/domain/whois | Get WHOIS information for a domain
[**domainUrlFull**](DomainApi.md#domainUrlFull) | **POST** /validate/domain/url/full | Validate a URL fully
[**domainUrlSyntaxOnly**](DomainApi.md#domainUrlSyntaxOnly) | **POST** /validate/domain/url/syntax-only | Validate a URL syntactically


<a name="domainCheck"></a>
# **domainCheck**
> CheckResponse domainCheck(domain)

Validate a domain name

Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.DomainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

DomainApi apiInstance = new DomainApi();
String domain = "domain_example"; // String | Domain name to check, for example \"cloudmersive.com\".  The input is a string so be sure to enclose it in double-quotes.
try {
    CheckResponse result = apiInstance.domainCheck(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**CheckResponse**](CheckResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="domainPost"></a>
# **domainPost**
> WhoisResponse domainPost(domain)

Get WHOIS information for a domain

Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.DomainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

DomainApi apiInstance = new DomainApi();
String domain = "domain_example"; // String | Domain name to check, for example \"cloudmersive.com\".   The input is a string so be sure to enclose it in double-quotes.
try {
    WhoisResponse result = apiInstance.domainPost(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**WhoisResponse**](WhoisResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="domainUrlFull"></a>
# **domainUrlFull**
> ValidateUrlResponseFull domainUrlFull(request)

Validate a URL fully

Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.DomainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

DomainApi apiInstance = new DomainApi();
ValidateUrlRequestFull request = new ValidateUrlRequestFull(); // ValidateUrlRequestFull | 
try {
    ValidateUrlResponseFull result = apiInstance.domainUrlFull(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainUrlFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ValidateUrlRequestFull**](ValidateUrlRequestFull.md)|  |

### Return type

[**ValidateUrlResponseFull**](ValidateUrlResponseFull.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="domainUrlSyntaxOnly"></a>
# **domainUrlSyntaxOnly**
> ValidateUrlResponseSyntaxOnly domainUrlSyntaxOnly(request)

Validate a URL syntactically

Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.DomainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

DomainApi apiInstance = new DomainApi();
ValidateUrlRequestSyntaxOnly request = new ValidateUrlRequestSyntaxOnly(); // ValidateUrlRequestSyntaxOnly | 
try {
    ValidateUrlResponseSyntaxOnly result = apiInstance.domainUrlSyntaxOnly(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainUrlSyntaxOnly");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ValidateUrlRequestSyntaxOnly**](ValidateUrlRequestSyntaxOnly.md)|  |

### Return type

[**ValidateUrlResponseSyntaxOnly**](ValidateUrlResponseSyntaxOnly.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

