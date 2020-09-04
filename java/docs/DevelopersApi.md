# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/hariprakash/SimpleApi/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](DevelopersApi.md#login) | **GET** /app/login/{userId} | 

<a name="login"></a>
# **login**
> InlineResponse200 login(userId)



login to app

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String userId = "userId_example"; // String | user id to authenticate
try {
    InlineResponse200 result = apiInstance.login(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user id to authenticate |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

