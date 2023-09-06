# telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](#telemetryuseragentget)

## telemetrySpeakeasyUserAgentGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRequest;
import org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse;
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

            TelemetrySpeakeasyUserAgentGetResponse res = sdk.telemetry.telemetrySpeakeasyUserAgentGet("nostrum");

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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `userAgent`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse](../../models/operations/TelemetrySpeakeasyUserAgentGetResponse.md)**


## telemetryUserAgentGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse;
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

            TelemetryUserAgentGetResponse res = sdk.telemetry.telemetryUserAgentGet();

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse](../../models/operations/TelemetryUserAgentGetResponse.md)**

