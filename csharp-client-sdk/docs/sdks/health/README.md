# Health
(*Health*)

## Overview

### Available Operations

* [Check](#check)

## Check

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Health.CheckAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[CheckResponse](../../Models/Operations/CheckResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |