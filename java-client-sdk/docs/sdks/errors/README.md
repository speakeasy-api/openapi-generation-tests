# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGet](#statusget)

## connectionErrorGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConnectionErrorGetResponse;
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

            ConnectionErrorGetResponse res = sdk.errors.connectionErrorGet();

            if (res.statusCode == 200) {
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
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.ConnectionErrorGetResponse](../../models/operations/ConnectionErrorGetResponse.md)**


## statusGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetRequest;
import org.openapis.openapi.models.operations.StatusGetResponse;
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

            StatusGetResponse res = sdk.errors.statusGet(551816L);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `statusCode`       | *Long*             | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.StatusGetResponse](../../models/operations/StatusGetResponse.md)**

