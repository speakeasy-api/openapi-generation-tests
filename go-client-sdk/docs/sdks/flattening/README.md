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
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Flattening.ComponentBodyAndParamConflict(ctx, shared.SimpleObject{
        Any: "provident",
        Bigint: big.NewInt(725255),
        BigintStr: types.MustBigIntFromString("659669"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }, "sapiente")
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
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Flattening.ComponentBodyAndParamNoConflict(ctx, "amet", shared.SimpleObject{
        Any: "deserunt",
        Bigint: big.NewInt(394869),
        BigintStr: types.MustBigIntFromString("423855"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    })
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
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Flattening.ConflictingParams(ctx, "molestiae", "perferendis")
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
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Flattening.InlineBodyAndParamConflict(ctx, operations.InlineBodyAndParamConflictRequestBody{
        Str: "nihil",
    }, "magnam")
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
	"openapi/pkg/models/operations"
)

func main() {
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Flattening.InlineBodyAndParamNoConflict(ctx, operations.InlineBodyAndParamNoConflictRequestBody{
        BodyStr: "distinctio",
    }, "id")
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

