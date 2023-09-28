# Retries
(*retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesGet](#retriesget)

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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            RetriesGetResponse res = sdk.retries.retriesGet("officiis", 100002L);

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

