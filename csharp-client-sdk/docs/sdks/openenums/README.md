# OpenEnums
(*OpenEnums*)

## Overview

Endpoints for testing open/closed enums

### Available Operations

* [OpenEnumsPostUnrecognized](#openenumspostunrecognized)

## OpenEnumsPostUnrecognized

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

ThemeRequestOpaque req = new ThemeRequestOpaque() {
    Color = "green",
    HeroWidth = 480,
    Icon = "tick",
};

var res = await sdk.OpenEnums.OpenEnumsPostUnrecognizedAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ThemeRequestOpaque](../../Models/Shared/ThemeRequestOpaque.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[OpenEnumsPostUnrecognizedResponse](../../Models/Operations/OpenEnumsPostUnrecognizedResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |