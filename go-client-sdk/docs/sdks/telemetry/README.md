# Telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [TelemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](#telemetryuseragentget)

## TelemetrySpeakeasyUserAgentGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    userAgent := "adipisci"

    ctx := context.Background()
    res, err := s.Telemetry.TelemetrySpeakeasyUserAgentGet(ctx, userAgent)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `userAgent`                                           | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.TelemetrySpeakeasyUserAgentGetResponse](../../models/operations/telemetryspeakeasyuseragentgetresponse.md), error**


## TelemetryUserAgentGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Telemetry.TelemetryUserAgentGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.TelemetryUserAgentGetResponse](../../models/operations/telemetryuseragentgetresponse.md), error**

