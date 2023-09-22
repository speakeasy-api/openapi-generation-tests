# Flattening

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
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
	"math/big"
	"openapi/pkg/types"
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
        Any: "nesciunt",
        Bigint: big.NewInt(179490),
        BigintStr: big.NewInt(18521),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: types.MustNewDecimalFromString("1709.86"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: openapi.Int64(999999),
        Num: 1.1,
        NumOptNull: openapi.Float64(1.1),
        Str: "example",
        StrOpt: openapi.String("optional example"),
    }
    str := "dolor"

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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `simpleObject`                                             | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | N/A                                                        |
| `str`                                                      | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        |


### Response

**[*operations.ComponentBodyAndParamConflictResponse](../../models/operations/componentbodyandparamconflictresponse.md), error**


## ComponentBodyAndParamNoConflict

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    paramStr := "vero"
    simpleObject := shared.SimpleObject{
        Any: "nostrum",
        Bigint: big.NewInt(944120),
        BigintStr: big.NewInt(928082),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: types.MustNewDecimalFromString("6082.53"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: openapi.Int64(999999),
        Num: 1.1,
        NumOptNull: openapi.Float64(1.1),
        Str: "example",
        StrOpt: openapi.String("optional example"),
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `paramStr`                                                 | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `simpleObject`                                             | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | N/A                                                        |


### Response

**[*operations.ComponentBodyAndParamNoConflictResponse](../../models/operations/componentbodyandparamnoconflictresponse.md), error**


## ConflictingParams

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    strPathParameter := "voluptatem"
    strQueryParameter := "porro"

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

**[*operations.ConflictingParamsResponse](../../models/operations/conflictingparamsresponse.md), error**


## InlineBodyAndParamConflict

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
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
        Str: "consequuntur",
    }
    str := "blanditiis"

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `requestBody`                                                                                                        | [operations.InlineBodyAndParamConflictRequestBody](../../models/operations/inlinebodyandparamconflictrequestbody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `str`                                                                                                                | *string*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |


### Response

**[*operations.InlineBodyAndParamConflictResponse](../../models/operations/inlinebodyandparamconflictresponse.md), error**


## InlineBodyAndParamNoConflict

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
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
        BodyStr: "error",
    }
    paramStr := "eaque"

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `requestBody`                                                                                                            | [operations.InlineBodyAndParamNoConflictRequestBody](../../models/operations/inlinebodyandparamnoconflictrequestbody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `paramStr`                                                                                                               | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |


### Response

**[*operations.InlineBodyAndParamNoConflictResponse](../../models/operations/inlinebodyandparamnoconflictresponse.md), error**

