# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/hariprakash/Jsontool/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exampleGet**](DefaultApi.md#exampleGet) | **GET** /example | Server example operation
[**pingGet**](DefaultApi.md#pingGet) | **GET** /ping | Server heartbeat operation

<a name="exampleGet"></a>
# **exampleGet**
> exampleGet()

Server example operation

This is an example operation to show how security is applied to the call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.exampleGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#exampleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingGet"></a>
# **pingGet**
> pingGet()

Server heartbeat operation

This operation shows how to override the global security defined above, as we want to open it up for all users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.pingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

