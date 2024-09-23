# Hooks
(*hooks()*)

## Overview

Endpoints for testing hooks

### Available Operations

* [authorizationHeaderModification](#authorizationheadermodification)
* [testHooks](#testhooks)
* [testHooksAfterResponse](#testhooksafterresponse)
* [testHooksBeforeCreateRequestPaths](#testhooksbeforecreaterequestpaths)
* [testHooksError](#testhookserror)

## authorizationHeaderModification

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AuthorizationHeaderModificationResponse;
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

        AuthorizationHeaderModificationResponse res = sdk.hooks().authorizationHeaderModification()
                .call();

        if (res.token().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[AuthorizationHeaderModificationResponse](../../models/operations/AuthorizationHeaderModificationResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## testHooks

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksResponse;
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

        TestHooksResponse res = sdk.hooks().testHooks()
                .someParam("someInitialValue")
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `someParam`        | *String*           | :heavy_check_mark: | N/A                | someInitialValue   |

### Response

**[TestHooksResponse](../../models/operations/TestHooksResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## testHooksAfterResponse

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksAfterResponseResponse;
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

        TestHooksAfterResponseResponse res = sdk.hooks().testHooksAfterResponse()
                .call();

        // handle response
    }
}
```

### Response

**[TestHooksAfterResponseResponse](../../models/operations/TestHooksAfterResponseResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## testHooksBeforeCreateRequestPaths

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksBeforeCreateRequestPathsResponse;
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

        TestHooksBeforeCreateRequestPathsResponse res = sdk.hooks().testHooksBeforeCreateRequestPaths()
                .namespace("<value>")
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `namespace`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[TestHooksBeforeCreateRequestPathsResponse](../../models/operations/TestHooksBeforeCreateRequestPathsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## testHooksError

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksErrorResponse;
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

        TestHooksErrorResponse res = sdk.hooks().testHooksError()
                .call();

        // handle response
    }
}
```

### Response

**[TestHooksErrorResponse](../../models/operations/TestHooksErrorResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
