# Errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [ConnectionErrorGet](#connectionerrorget)
* [StatusGet](#statusget)
* [StatusPostRetries](#statuspostretries)

## ConnectionErrorGet

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.Errors.ConnectionErrorGet(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## StatusGet

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
    res, err := s.Errors.StatusGet(ctx, operations.StatusGetRequest{
        StatusCode: 692532,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

## StatusPostRetries

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
    res, err := s.Errors.StatusPostRetries(ctx, operations.StatusPostRetriesRequest{
        SimpleObject: &shared.SimpleObject{
            Any: "provident",
            Bigint: big.NewInt(725255),
            BigintStr: types.MustBigIntFromString("659669"),
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
        StatusCode: 956084,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```
