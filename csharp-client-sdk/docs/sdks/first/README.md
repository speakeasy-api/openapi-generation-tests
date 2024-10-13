# First
(*First*)

## Overview

### Available Operations

* [Get](#get)

## Get

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

var res = await sdk.First.GetAsync();

// handle response
```

### Response

**[GroupFirstGetResponse](../../Models/Operations/GroupFirstGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |