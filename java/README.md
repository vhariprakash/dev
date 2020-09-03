# swagger-java-client

Sample Application Flow OAuth2 Project
- API version: 1.0.0
  - Build date: 2020-09-03T10:04:54.782Z

This is an example of using OAuth2 Application Flow in a specification to describe security to your API.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/hariprakash/Jsontool/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**exampleGet**](docs/DefaultApi.md#exampleGet) | **GET** /example | Server example operation
*DefaultApi* | [**pingGet**](docs/DefaultApi.md#pingGet) | **GET** /ping | Server heartbeat operation


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### application

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - write: allows modifying resources
  - read: allows reading resources


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


