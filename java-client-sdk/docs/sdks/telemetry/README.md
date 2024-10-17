# Telemetry
(*telemetry()*)

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](#telemetryuseragentget)

## telemetrySpeakeasyUserAgentGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse;
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

        TelemetrySpeakeasyUserAgentGetResponse res = sdk.telemetry().telemetrySpeakeasyUserAgentGet()
                .userAgent("<value>")
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
| `userAgent`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[TelemetrySpeakeasyUserAgentGetResponse](../../models/operations/TelemetrySpeakeasyUserAgentGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## telemetryUserAgentGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse;
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

        TelemetryUserAgentGetResponse res = sdk.telemetry().telemetryUserAgentGet()
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[TelemetryUserAgentGetResponse](../../models/operations/TelemetryUserAgentGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |