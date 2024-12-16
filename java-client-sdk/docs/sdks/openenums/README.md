# OpenEnums
(*openEnums()*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [openEnumsPostUnrecognized](#openenumspostunrecognized)

## openEnumsPostUnrecognized

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OpenEnumsPostUnrecognizedResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.ThemeRequestOpaque;

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

        ThemeRequestOpaque req = ThemeRequestOpaque.builder()
                .color("green")
                .heroWidth(480L)
                .icon("tick")
                .build();

        OpenEnumsPostUnrecognizedResponse res = sdk.openEnums().openEnumsPostUnrecognized()
                .request(req)
                .call();

        if (res.themeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ThemeRequestOpaque](../../models/shared/ThemeRequestOpaque.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[OpenEnumsPostUnrecognizedResponse](../../models/operations/OpenEnumsPostUnrecognizedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |