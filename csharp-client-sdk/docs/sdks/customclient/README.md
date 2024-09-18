# CustomClient
(*CustomClient*)

## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [CustomClientPost](#customclientpost)

## CustomClientPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.CustomClient.CustomClientPostAsync(
    headerParam: "headerValue",
    pathParam: "pathValue",
    queryStringParam: "queryValue",
    simpleObject: new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
        Enum = Openapi.Models.Shared.Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
        IntEnum = Openapi.Models.Shared.IntEnum.Second,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        Float64Str = "1.1",
        Int64Str = "100",
        StrOpt = "testOptional",
    }
);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `HeaderParam`                                       | *string*                                            | :heavy_check_mark:                                  | N/A                                                 | headerValue                                         |
| `PathParam`                                         | *string*                                            | :heavy_check_mark:                                  | N/A                                                 | pathValue                                           |
| `QueryStringParam`                                  | *string*                                            | :heavy_check_mark:                                  | N/A                                                 | queryValue                                          |
| `SimpleObject`                                      | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_minus_sign:                                  | N/A                                                 |                                                     |

### Response

**[CustomClientPostResponse](../../Models/Operations/CustomClientPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
