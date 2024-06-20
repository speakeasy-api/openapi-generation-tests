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

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [org.openapis.openapi.models.shared.ThemeRequestOpaque](../../models/shared/ThemeRequestOpaque.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.OpenEnumsPostUnrecognizedResponse>](../../models/operations/OpenEnumsPostUnrecognizedResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
