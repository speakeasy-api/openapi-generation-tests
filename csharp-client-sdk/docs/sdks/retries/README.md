# RetriesSDK
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesGet](#retriesget)

## RetriesGet

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

var res = await sdk.Retries.RetriesGetAsync("Cambridgeshire", 496130);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `RequestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `NumRetries`                   | *long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[RetriesGetResponse](../../models/operations/RetriesGetResponse.md)**

