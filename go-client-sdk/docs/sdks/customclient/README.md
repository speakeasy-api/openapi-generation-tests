# CustomClient
(*CustomClient*)

## Overview

Endpoints for testing custom HTTP clients

### Available Operations

* [CustomClientPost](#customclientpost)

## CustomClientPost

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenHeaderParam("<value>"),
        openapi.WithGlobalHiddenPathParam("<value>"),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var headerParam string = "headerValue"

    var pathParam string = "pathValue"

    var queryStringParam string = "queryValue"

    var simpleObject *shared.SimpleObject = &shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    }
    ctx := context.Background()
    res, err := s.CustomClient.CustomClientPost(ctx, headerParam, pathParam, queryStringParam, simpleObject)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `ctx`                                                           | [context.Context](https://pkg.go.dev/context#Context)           | :heavy_check_mark:                                              | The context to use for the request.                             |                                                                 |
| `headerParam`                                                   | *string*                                                        | :heavy_check_mark:                                              | N/A                                                             | headerValue                                                     |
| `pathParam`                                                     | *string*                                                        | :heavy_check_mark:                                              | N/A                                                             | pathValue                                                       |
| `queryStringParam`                                              | *string*                                                        | :heavy_check_mark:                                              | N/A                                                             | queryValue                                                      |
| `simpleObject`                                                  | [*shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_minus_sign:                                              | N/A                                                             |                                                                 |


### Response

**[*operations.CustomClientPostResponse](../../pkg/models/operations/customclientpostresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
