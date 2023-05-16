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
    res, err := s.Flattening.ComponentBodyAndParamConflict(ctx, operations.ComponentBodyAndParamConflictRequest{
        SimpleObject: shared.SimpleObject{
            Any: "amet",
            Bigint: big.NewInt(643990),
            BigintStr: types.MustBigIntFromString("394869"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumSecond,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Str: "omnis",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
    res, err := s.Flattening.ComponentBodyAndParamNoConflict(ctx, operations.ComponentBodyAndParamNoConflictRequest{
        ParamStr: "molestiae",
        SimpleObject: shared.SimpleObject{
            Any: "perferendis",
            Bigint: big.NewInt(470132),
            BigintStr: types.MustBigIntFromString("301575"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumEnumSecond,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
    res, err := s.Flattening.ConflictingParams(ctx, operations.ConflictingParamsRequest{
        StrPathParameter: "labore",
        StrQueryParameter: "labore",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
    res, err := s.Flattening.InlineBodyAndParamConflict(ctx, operations.InlineBodyAndParamConflictRequest{
        RequestBody: operations.InlineBodyAndParamConflictRequestBody{
            Str: "suscipit",
        },
        Str: "natus",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
    res, err := s.Flattening.InlineBodyAndParamNoConflict(ctx, operations.InlineBodyAndParamNoConflictRequest{
        RequestBody: operations.InlineBodyAndParamNoConflictRequestBody{
            BodyStr: "nobis",
        },
        ParamStr: "eum",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
