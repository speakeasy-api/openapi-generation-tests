# TelemetrySDK
(*Telemetry*)

## Overview

Endpoints for testing telemetry.

### Available Operations

* [TelemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](#telemetryuseragentget)

## TelemetrySpeakeasyUserAgentGet

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Telemetry.TelemetrySpeakeasyUserAgentGetAsync("Bentley");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `UserAgent`        | *string*           | :heavy_check_mark: | N/A                |


### Response

**[TelemetrySpeakeasyUserAgentGetResponse](../../models/operations/TelemetrySpeakeasyUserAgentGetResponse.md)**


## TelemetryUserAgentGet

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Telemetry.TelemetryUserAgentGetAsync();

// handle response
```


### Response

**[TelemetryUserAgentGetResponse](../../models/operations/TelemetryUserAgentGetResponse.md)**

