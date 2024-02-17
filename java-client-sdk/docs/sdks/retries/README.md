# Retries
(*retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesAfter](#retriesafter)
* [retriesGet](#retriesget)
* [retriesPost](#retriespost)

## retriesAfter

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesAfterRequest;
import org.openapis.openapi.models.operations.RetriesAfterResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RetriesAfterResponse res = sdk.retries.retriesAfter("<value>", 282943L, 861810L);

            if (res.retries != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `numRetries`                   | *Long*                         | :heavy_minus_sign:             | N/A                            |
| `retryAfterVal`                | *Long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.RetriesAfterResponse](../../models/operations/RetriesAfterResponse.md)**


## retriesGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesGetRequest;
import org.openapis.openapi.models.operations.RetriesGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RetriesGetResponse res = sdk.retries.retriesGet("<value>", 75342L);

            if (res.retries != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `requestId`                    | *String*                       | :heavy_check_mark:             | N/A                            |
| `numRetries`                   | *Long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.RetriesGetResponse](../../models/operations/RetriesGetResponse.md)**


## retriesPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesPostRequest;
import org.openapis.openapi.models.operations.RetriesPostRequestBody;
import org.openapis.openapi.models.operations.RetriesPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RetriesPostResponse res = sdk.retries.retriesPost("<value>", new RetriesPostRequestBody(
            "<value>"){{
                fieldOne = "<value>";
            }}, 138258L);

            if (res.retries != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `requestId`                                                                                                        | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `requestBody`                                                                                                      | [org.openapis.openapi.models.operations.RetriesPostRequestBody](../../models/operations/RetriesPostRequestBody.md) | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |
| `numRetries`                                                                                                       | *Long*                                                                                                             | :heavy_minus_sign:                                                                                                 | N/A                                                                                                                |
| `serverURL`                                                                                                        | *String*                                                                                                           | :heavy_minus_sign:                                                                                                 | An optional server URL to use.                                                                                     |


### Response

**[org.openapis.openapi.models.operations.RetriesPostResponse](../../models/operations/RetriesPostResponse.md)**

