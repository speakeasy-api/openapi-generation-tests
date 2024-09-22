# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>

### Available Operations

* [ambiguousQueryParam](#ambiguousqueryparam) - Tests conflict with C# System namespace
* [authenticatedRequest](#authenticatedrequest)
* [conflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](#ignoredgenerationput)
* [multilineExample](#multilineexample)
* [postAdditionalPropertiesWithNullableFields](#postadditionalpropertieswithnullablefields)
* [responseBodyJsonGet](#responsebodyjsonget)

## ambiguousQueryParam

Tests conflict with C# System namespace

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AmbiguousQueryParamResponse;
import org.openapis.openapi.models.operations.Console;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        AmbiguousQueryParamResponse res = sdk.ambiguousQueryParam()
                .console(Console.THREE)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `console`                                     | [Console](../../models/operations/Console.md) | :heavy_check_mark:                            | N/A                                           |

### Response

**[AmbiguousQueryParamResponse](../../models/operations/AmbiguousQueryParamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## authenticatedRequest

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AuthenticatedRequestRequestBody;
import org.openapis.openapi.models.operations.AuthenticatedRequestResponse;
import org.openapis.openapi.models.operations.AuthenticatedRequestSecurity;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        AuthenticatedRequestRequestBody req = AuthenticatedRequestRequestBody.builder()
                .build();

        AuthenticatedRequestResponse res = sdk.authenticatedRequest()
                .request(req)
                .security(AuthenticatedRequestSecurity.builder()
                    .clientCredentials("<YOUR_CLIENT_CREDENTIALS_HERE>")
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [AuthenticatedRequestRequestBody](../../models/operations/AuthenticatedRequestRequestBody.md)                                  | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [org.openapis.openapi.models.operations.AuthenticatedRequestSecurity](../../models/operations/AuthenticatedRequestSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |

### Response

**[AuthenticatedRequestResponse](../../models/operations/AuthenticatedRequestResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## conflictingEnum

Test potential namespace conflicts with java.lang.Object

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConflictingEnumResponse;
import org.openapis.openapi.models.shared.ConflictingEnum;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ConflictingEnum req = ConflictingEnum.builder()
                .build();

        ConflictingEnumResponse res = sdk.conflictingEnum()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ConflictingEnum](../../models/shared/ConflictingEnum.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[ConflictingEnumResponse](../../models/operations/ConflictingEnumResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## ignoredGenerationPut

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.lang.String;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IgnoredGenerationPutResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        String req = "<value>";

        IgnoredGenerationPutResponse res = sdk.ignoredGenerationPut()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[IgnoredGenerationPutResponse](../../models/operations/IgnoredGenerationPutResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## multilineExample

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultilineExampleRequestBody;
import org.openapis.openapi.models.operations.MultilineExampleResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        MultilineExampleRequestBody req = MultilineExampleRequestBody.builder()
                .message("hello\nthere!")
                .build();

        MultilineExampleResponse res = sdk.multilineExample()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [MultilineExampleRequestBody](../../models/operations/MultilineExampleRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[MultilineExampleResponse](../../models/operations/MultilineExampleResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## postAdditionalPropertiesWithNullableFields

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PostAdditionalPropertiesWithNullableFieldsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        Map<String, Object> req = Map.ofEntries(
                Map.entry("key", "<value>"));

        PostAdditionalPropertiesWithNullableFieldsResponse res = sdk.postAdditionalPropertiesWithNullableFields()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Map<String, Object>](../../models//.md)   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[PostAdditionalPropertiesWithNullableFieldsResponse](../../models/operations/PostAdditionalPropertiesWithNullableFieldsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## responseBodyJsonGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ResponseBodyJsonGetResponse res = sdk.responseBodyJsonGet()
                .call();

        if (res.httpBinSimpleJsonObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ResponseBodyJsonGetResponse](../../models/operations/ResponseBodyJsonGetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
