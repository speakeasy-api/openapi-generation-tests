# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGetError](#statusgeterror)
* [statusGetXSpeakeasyErrors](#statusgetxspeakeasyerrors)

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


## statusGetError

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetErrorRequest;
import org.openapis.openapi.models.operations.StatusGetErrorResponse;
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

            StatusGetErrorResponse res = sdk.errors.statusGetError(37559L);

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

**[org.openapis.openapi.models.operations.StatusGetErrorResponse](../../models/operations/StatusGetErrorResponse.md)**


## statusGetXSpeakeasyErrors

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsRequest;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse;
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

            StatusGetXSpeakeasyErrorsResponse res = sdk.errors.statusGetXSpeakeasyErrors(162493L);

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
| `statusCode`                   | *Long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse](../../models/operations/StatusGetXSpeakeasyErrorsResponse.md)**

