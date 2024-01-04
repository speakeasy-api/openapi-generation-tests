# Telemetry
(*Telemetry*)

## Overview

Endpoints for testing telemetry.

### Available Operations

* [TelemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](#telemetryuseragentget)

## TelemetrySpeakeasyUserAgentGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetrySpeakeasyUserAgentGetAsync(UserAgent: "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `UserAgent`        | *string*           | :heavy_check_mark: | N/A                |


### Response

**[TelemetrySpeakeasyUserAgentGetResponse](../../Models/Operations/TelemetrySpeakeasyUserAgentGetResponse.md)**


## TelemetryUserAgentGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetryUserAgentGetAsync();

// handle response
```


### Response

**[TelemetryUserAgentGetResponse](../../Models/Operations/TelemetryUserAgentGetResponse.md)**

