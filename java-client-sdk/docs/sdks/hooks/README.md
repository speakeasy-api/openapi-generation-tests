# Hooks
(*hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [testHooks](#testhooks)
* [testHooksAfterResponse](#testhooksafterresponse)
* [testHooksError](#testhookserror)

## testHooks

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksRequest;
import org.openapis.openapi.models.operations.TestHooksResponse;
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

            org.openapis.openapi.models.operations.TestHooksResponse res = sdk.hooks.testHooks("someInitialValue");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `someParam`        | *String*           | :heavy_check_mark: | N/A                | someInitialValue   |


### Response

**[org.openapis.openapi.models.operations.TestHooksResponse](../../models/operations/TestHooksResponse.md)**


## testHooksAfterResponse

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksAfterResponseResponse;
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

            org.openapis.openapi.models.operations.TestHooksAfterResponseResponse res = sdk.hooks.testHooksAfterResponse();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.TestHooksAfterResponseResponse](../../models/operations/TestHooksAfterResponseResponse.md)**


## testHooksError

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TestHooksErrorResponse;
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

            org.openapis.openapi.models.operations.TestHooksErrorResponse res = sdk.hooks.testHooksError();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.TestHooksErrorResponse](../../models/operations/TestHooksErrorResponse.md)**

