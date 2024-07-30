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
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetrySpeakeasyUserAgentGetAsync(userAgent: "<value>");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `UserAgent`        | *string*           | :heavy_check_mark: | N/A                |


### Response

**[TelemetrySpeakeasyUserAgentGetResponse](../../Models/Operations/TelemetrySpeakeasyUserAgentGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## TelemetryUserAgentGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Telemetry.TelemetryUserAgentGetAsync();

// handle response
```


### Response

**[TelemetryUserAgentGetResponse](../../Models/Operations/TelemetryUserAgentGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
