# First
(*first()*)

## Overview

### Available Operations

* [get](#get)

## get

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GroupFirstGetResponse;
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

        GroupFirstGetResponse res = sdk.first().get()
                .call();

        // handle response
    }
}
```

### Response

**[GroupFirstGetResponse](../../models/operations/GroupFirstGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |