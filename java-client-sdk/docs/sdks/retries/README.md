# Retries
(*retries()*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesAfter](#retriesafter)
* [retriesConnectErrorGet](#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesFlatEmptyResponsePost](#retriesflatemptyresponsepost)
* [retriesGet](#retriesget)
* [retriesPost](#retriespost)

## retriesAfter

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesAfterResponse;
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

        RetriesAfterResponse res = sdk.retries().retriesAfter()
                .numRetries(282943L)
                .requestId("<id>")
                .retryAfterVal(502771L)
                .call();

        if (res.retries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `numRetries`                   | *Optional\<Long>*              | :heavy_minus_sign:             | N/A                            |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `retryAfterVal`                | *Optional\<Long>*              | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesAfterResponse](../../models/operations/RetriesAfterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## retriesConnectErrorGet

A request to a non-valid port to test connection errors

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesConnectErrorGetResponse;
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

        RetriesConnectErrorGetResponse res = sdk.retries().retriesConnectErrorGet()
                .call();

        if (res.retries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesConnectErrorGetResponse](../../models/operations/RetriesConnectErrorGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## retriesFlatEmptyResponsePost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesFlatEmptyResponsePostRequestBody;
import org.openapis.openapi.models.operations.RetriesFlatEmptyResponsePostResponse;
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

        RetriesFlatEmptyResponsePostResponse res = sdk.retries().retriesFlatEmptyResponsePost()
                .requestBody(RetriesFlatEmptyResponsePostRequestBody.builder()
                    .fieldOne("<value>")
                    .build())
                .numRetries(923715L)
                .requestId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                            | [Optional\<RetriesFlatEmptyResponsePostRequestBody>](../../models/operations/RetriesFlatEmptyResponsePostRequestBody.md) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `numRetries`                                                                                                             | *Optional\<Long>*                                                                                                        | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `requestId`                                                                                                              | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `serverURL`                                                                                                              | *String*                                                                                                                 | :heavy_minus_sign:                                                                                                       | An optional server URL to use.                                                                                           |

### Response

**[RetriesFlatEmptyResponsePostResponse](../../models/operations/RetriesFlatEmptyResponsePostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## retriesGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesGetResponse;
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

        RetriesGetResponse res = sdk.retries().retriesGet()
                .numRetries(75342L)
                .requestId("<id>")
                .call();

        if (res.retries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `numRetries`                   | *Optional\<Long>*              | :heavy_minus_sign:             | N/A                            |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesGetResponse](../../models/operations/RetriesGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## retriesPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesPostRequestBody;
import org.openapis.openapi.models.operations.RetriesPostResponse;
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

        RetriesPostResponse res = sdk.retries().retriesPost()
                .requestBody(RetriesPostRequestBody.builder()
                    .fieldOne("<value>")
                    .build())
                .numRetries(138258L)
                .requestId("<id>")
                .call();

        if (res.retries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `requestBody`                                                                          | [Optional\<RetriesPostRequestBody>](../../models/operations/RetriesPostRequestBody.md) | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `numRetries`                                                                           | *Optional\<Long>*                                                                      | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `requestId`                                                                            | *String*                                                                               | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `serverURL`                                                                            | *String*                                                                               | :heavy_minus_sign:                                                                     | An optional server URL to use.                                                         |

### Response

**[RetriesPostResponse](../../models/operations/RetriesPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |