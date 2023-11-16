# Flattening
(*Flattening*)

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [ComponentBodyAndParamConflict](#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [ConflictingParams](#conflictingparams)
* [InlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## ComponentBodyAndParamConflict

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
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    simpleObject := shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        IntEnum: shared.IntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    }

    var str string = "string"

    ctx := context.Background()
    res, err := s.Flattening.ComponentBodyAndParamConflict(ctx, simpleObject, str)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `ctx`                                                             | [context.Context](https://pkg.go.dev/context#Context)             | :heavy_check_mark:                                                | The context to use for the request.                               |
| `simpleObject`                                                    | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                                | N/A                                                               |
| `str`                                                             | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |


### Response

**[*operations.ComponentBodyAndParamConflictResponse](../../pkg/models/operations/componentbodyandparamconflictresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## ComponentBodyAndParamNoConflict

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
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var paramStr string = "string"

    simpleObject := shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        IntEnum: shared.IntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    }

    ctx := context.Background()
    res, err := s.Flattening.ComponentBodyAndParamNoConflict(ctx, paramStr, simpleObject)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `ctx`                                                             | [context.Context](https://pkg.go.dev/context#Context)             | :heavy_check_mark:                                                | The context to use for the request.                               |
| `paramStr`                                                        | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `simpleObject`                                                    | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                                | N/A                                                               |


### Response

**[*operations.ComponentBodyAndParamNoConflictResponse](../../pkg/models/operations/componentbodyandparamnoconflictresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## ConflictingParams

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var strPathParameter string = "string"

    var strQueryParameter string = "string"

    ctx := context.Background()
    res, err := s.Flattening.ConflictingParams(ctx, strPathParameter, strQueryParameter)
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
| `strPathParameter`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `strQueryParameter`                                   | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.ConflictingParamsResponse](../../pkg/models/operations/conflictingparamsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## InlineBodyAndParamConflict

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    requestBody := operations.InlineBodyAndParamConflictRequestBody{
        Str: "string",
    }

    var str string = "string"

    ctx := context.Background()
    res, err := s.Flattening.InlineBodyAndParamConflict(ctx, requestBody, str)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                       | [context.Context](https://pkg.go.dev/context#Context)                                                                       | :heavy_check_mark:                                                                                                          | The context to use for the request.                                                                                         |
| `requestBody`                                                                                                               | [operations.InlineBodyAndParamConflictRequestBody](../../../pkg/models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `str`                                                                                                                       | *string*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |


### Response

**[*operations.InlineBodyAndParamConflictResponse](../../pkg/models/operations/inlinebodyandparamconflictresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## InlineBodyAndParamNoConflict

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    requestBody := operations.InlineBodyAndParamNoConflictRequestBody{
        BodyStr: "string",
    }

    var paramStr string = "string"

    ctx := context.Background()
    res, err := s.Flattening.InlineBodyAndParamNoConflict(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                           | [context.Context](https://pkg.go.dev/context#Context)                                                                           | :heavy_check_mark:                                                                                                              | The context to use for the request.                                                                                             |
| `requestBody`                                                                                                                   | [operations.InlineBodyAndParamNoConflictRequestBody](../../../pkg/models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `paramStr`                                                                                                                      | *string*                                                                                                                        | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |


### Response

**[*operations.InlineBodyAndParamNoConflictResponse](../../pkg/models/operations/inlinebodyandparamnoconflictresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |
