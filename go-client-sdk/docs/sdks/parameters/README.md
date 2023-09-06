# Parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [DeepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [DuplicateParam](#duplicateparam)
* [FormQueryParamsArray](#formqueryparamsarray)
* [FormQueryParamsMap](#formqueryparamsmap)
* [FormQueryParamsObject](#formqueryparamsobject)
* [FormQueryParamsPrimitive](#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [HeaderParamsArray](#headerparamsarray)
* [HeaderParamsMap](#headerparamsmap)
* [HeaderParamsObject](#headerparamsobject)
* [HeaderParamsPrimitive](#headerparamsprimitive)
* [JSONQueryParamsObject](#jsonqueryparamsobject)
* [MixedParametersCamelCase](#mixedparameterscamelcase)
* [MixedParametersPrimitives](#mixedparametersprimitives)
* [MixedQueryParams](#mixedqueryparams)
* [PathParameterJSON](#pathparameterjson)
* [PipeDelimitedQueryParamsArray](#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](#simplepathparameterarrays)
* [SimplePathParameterMaps](#simplepathparametermaps)
* [SimplePathParameterObjects](#simplepathparameterobjects)
* [SimplePathParameterPrimitives](#simplepathparameterprimitives)

## DeepObjectQueryParamsMap

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    mapParam := map[string]string{
        "numquam": "veritatis",
    }
    mapArrParam := map[string][]string{
        "ipsa": []string{
            "ipsa",
        },
    }

    ctx := context.Background()
    res, err := s.Parameters.DeepObjectQueryParamsMap(ctx, mapParam, mapArrParam)
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
| `mapParam`                                            | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   |
| `mapArrParam`                                         | map[string][]*string*                                 | :heavy_minus_sign:                                    | N/A                                                   |


### Response

**[*operations.DeepObjectQueryParamsMapResponse](../../models/operations/deepobjectqueryparamsmapresponse.md), error**


## DeepObjectQueryParamsObject

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    objParam := shared.SimpleObject{
        Any: "iure",
        Bigint: big.NewInt(487838),
        BigintStr: types.MustBigIntFromString("311796"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(8810.05),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }
    objArrParam := &operations.DeepObjectQueryParamsObjectObjArrParam{
        Arr: []string{
            "voluptas",
        },
    }

    ctx := context.Background()
    res, err := s.Parameters.DeepObjectQueryParamsObject(ctx, objParam, objArrParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                   | [context.Context](https://pkg.go.dev/context#Context)                                                                   | :heavy_check_mark:                                                                                                      | The context to use for the request.                                                                                     |
| `objParam`                                                                                                              | [shared.SimpleObject](../../models/shared/simpleobject.md)                                                              | :heavy_check_mark:                                                                                                      | A simple object that uses all our supported primitive types and enums and has optional properties.                      |
| `objArrParam`                                                                                                           | [*operations.DeepObjectQueryParamsObjectObjArrParam](../../models/operations/deepobjectqueryparamsobjectobjarrparam.md) | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     |


### Response

**[*operations.DeepObjectQueryParamsObjectResponse](../../models/operations/deepobjectqueryparamsobjectresponse.md), error**


## DuplicateParam

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    duplicateParamRequest := "natus"

    ctx := context.Background()
    res, err := s.Parameters.DuplicateParam(ctx, duplicateParamRequest)
    if err != nil {
        log.Fatal(err)
    }

    if res.DuplicateParamResponse != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `duplicateParamRequest`                               | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.DuplicateParamResponse](../../models/operations/duplicateparamresponse.md), error**


## FormQueryParamsArray

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    arrParam := []string{
        "eos",
    }
    arrParamExploded := []int64{
        542499,
    }

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsArray(ctx, arrParam, arrParamExploded)
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
| `arrParam`                                            | []*string*                                            | :heavy_minus_sign:                                    | N/A                                                   |
| `arrParamExploded`                                    | []*int64*                                             | :heavy_minus_sign:                                    | N/A                                                   |


### Response

**[*operations.FormQueryParamsArrayResponse](../../models/operations/formqueryparamsarrayresponse.md), error**


## FormQueryParamsMap

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    mapParam := map[string]string{
        "sit": "fugiat",
    }
    mapParamExploded := map[string]int64{
        "ab": 743835,
    }

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsMap(ctx, mapParam, mapParamExploded)
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
| `mapParam`                                            | map[string]*string*                                   | :heavy_minus_sign:                                    | N/A                                                   |
| `mapParamExploded`                                    | map[string]*int64*                                    | :heavy_minus_sign:                                    | N/A                                                   |


### Response

**[*operations.FormQueryParamsMapResponse](../../models/operations/formqueryparamsmapresponse.md), error**


## FormQueryParamsObject

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    objParamExploded := shared.SimpleObject{
        Any: "dolorum",
        Bigint: big.NewInt(478596),
        BigintStr: types.MustBigIntFromString("453697"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(6770.82),
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
    }
    objParam := &shared.SimpleObject{
        Any: "necessitatibus",
        Bigint: big.NewInt(714697),
        BigintStr: types.MustBigIntFromString("990339"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(4694.97),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsObject(ctx, objParamExploded, objParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [*shared.SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.FormQueryParamsObjectResponse](../../models/operations/formqueryparamsobjectresponse.md), error**


## FormQueryParamsPrimitive

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    boolParam := false
    intParam := 663078
    numParam := 9064.18
    strParam := "eius"

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsPrimitive(ctx, boolParam, intParam, numParam, strParam)
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
| `boolParam`                                           | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   |
| `intParam`                                            | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   |
| `numParam`                                            | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   |
| `strParam`                                            | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.FormQueryParamsPrimitiveResponse](../../models/operations/formqueryparamsprimitiveresponse.md), error**


## FormQueryParamsRefParamObject

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    refObjParam := &shared.RefQueryParamObj{
        Bool: false,
        Int: 137220,
        Num: 206.51,
        Str: "amet",
    }
    refObjParamExploded := &shared.RefQueryParamObjExploded{
        Bool: false,
        Int: 758379,
        Num: 8815.86,
        Str: "ad",
    }

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsRefParamObject(ctx, refObjParam, refObjParamExploded)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `ctx`                                                                               | [context.Context](https://pkg.go.dev/context#Context)                               | :heavy_check_mark:                                                                  | The context to use for the request.                                                 |
| `refObjParam`                                                                       | [*shared.RefQueryParamObj](../../models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                  | N/A                                                                                 |
| `refObjParamExploded`                                                               | [*shared.RefQueryParamObjExploded](../../models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                  | N/A                                                                                 |


### Response

**[*operations.FormQueryParamsRefParamObjectResponse](../../models/operations/formqueryparamsrefparamobjectresponse.md), error**


## HeaderParamsArray

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    xHeaderArray := []string{
        "saepe",
    }

    ctx := context.Background()
    res, err := s.Parameters.HeaderParamsArray(ctx, xHeaderArray)
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
| `xHeaderArray`                                        | []*string*                                            | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.HeaderParamsArrayResponse](../../models/operations/headerparamsarrayresponse.md), error**


## HeaderParamsMap

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    xHeaderMap := map[string]string{
        "suscipit": "deserunt",
    }
    xHeaderMapExplode := map[string]string{
        "provident": "minima",
    }

    ctx := context.Background()
    res, err := s.Parameters.HeaderParamsMap(ctx, xHeaderMap, xHeaderMapExplode)
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
| `xHeaderMap`                                          | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   |
| `xHeaderMapExplode`                                   | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.HeaderParamsMapResponse](../../models/operations/headerparamsmapresponse.md), error**


## HeaderParamsObject

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    xHeaderObj := shared.SimpleObject{
        Any: "repellendus",
        Bigint: big.NewInt(519711),
        BigintStr: types.MustBigIntFromString("628982"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(0.55),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumFirst,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }
    xHeaderObjExplode := shared.SimpleObject{
        Any: "tempora",
        Bigint: big.NewInt(425451),
        BigintStr: types.MustBigIntFromString("798047"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(8853.38),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.HeaderParamsObject(ctx, xHeaderObj, xHeaderObjExplode)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `xHeaderObj`                                                                                       | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.HeaderParamsObjectResponse](../../models/operations/headerparamsobjectresponse.md), error**


## HeaderParamsPrimitive

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    xHeaderBoolean := false
    xHeaderInteger := 952792
    xHeaderNumber := 4561.3
    xHeaderString := "harum"

    ctx := context.Background()
    res, err := s.Parameters.HeaderParamsPrimitive(ctx, xHeaderBoolean, xHeaderInteger, xHeaderNumber, xHeaderString)
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
| `xHeaderBoolean`                                      | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   |
| `xHeaderInteger`                                      | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   |
| `xHeaderNumber`                                       | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   |
| `xHeaderString`                                       | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.HeaderParamsPrimitiveResponse](../../models/operations/headerparamsprimitiveresponse.md), error**


## JSONQueryParamsObject

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    deepObjParam := shared.DeepObject{
        Any: shared.SimpleObject{
            Any: "ipsum",
            Bigint: big.NewInt(788740),
            BigintStr: types.MustBigIntFromString("947371"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(2294.42),
            Enum: shared.EnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "numquam",
                Bigint: big.NewInt(313692),
                BigintStr: types.MustBigIntFromString("213312"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(9574.51),
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
            },
        },
        Bool: false,
        Int: 25662,
        Map: map[string]shared.SimpleObject{
            "expedita": shared.SimpleObject{
                Any: "neque",
                Bigint: big.NewInt(153694),
                BigintStr: types.MustBigIntFromString("424685"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(7304.42),
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
            },
        },
        Num: 4635.75,
        Obj: shared.SimpleObject{
            Any: "ipsum",
            Bigint: big.NewInt(277628),
            BigintStr: types.MustBigIntFromString("186458"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(5867.84),
            Enum: shared.EnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Str: "soluta",
        Type: sdk.String("dicta"),
    }
    simpleObjParam := shared.SimpleObject{
        Any: "laborum",
        Bigint: big.NewInt(517379),
        BigintStr: types.MustBigIntFromString("276894"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(1320.68),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.JSONQueryParamsObject(ctx, deepObjParam, simpleObjParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `deepObjParam`                                                                                     | [shared.DeepObject](../../models/shared/deepobject.md)                                             | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.JSONQueryParamsObjectResponse](../../models/operations/jsonqueryparamsobjectresponse.md), error**


## MixedParametersCamelCase

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    headerParam := "facilis"
    pathParam := "aliquid"
    queryStringParam := "quam"

    ctx := context.Background()
    res, err := s.Parameters.MixedParametersCamelCase(ctx, headerParam, pathParam, queryStringParam)
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
| `headerParam`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `pathParam`                                           | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.MixedParametersCamelCaseResponse](../../models/operations/mixedparameterscamelcaseresponse.md), error**


## MixedParametersPrimitives

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    headerParam := "molestias"
    pathParam := "temporibus"
    queryStringParam := "qui"

    ctx := context.Background()
    res, err := s.Parameters.MixedParametersPrimitives(ctx, headerParam, pathParam, queryStringParam)
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
| `headerParam`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `pathParam`                                           | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.MixedParametersPrimitivesResponse](../../models/operations/mixedparametersprimitivesresponse.md), error**


## MixedQueryParams

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    deepObjectParam := shared.SimpleObject{
        Any: "neque",
        Bigint: big.NewInt(144847),
        BigintStr: types.MustBigIntFromString("164959"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(4880.56),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }
    formParam := shared.SimpleObject{
        Any: "nam",
        Bigint: big.NewInt(940432),
        BigintStr: types.MustBigIntFromString("30452"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(7653.26),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }
    jsonParam := shared.SimpleObject{
        Any: "et",
        Bigint: big.NewInt(903720),
        BigintStr: types.MustBigIntFromString("217450"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(834.22),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.MixedQueryParams(ctx, deepObjectParam, formParam, jsonParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `deepObjectParam`                                                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.MixedQueryParamsResponse](../../models/operations/mixedqueryparamsresponse.md), error**


## PathParameterJSON

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    jsonObj := shared.SimpleObject{
        Any: "tempore",
        Bigint: big.NewInt(584476),
        BigintStr: types.MustBigIntFromString("45614"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(9619.37),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumFirst,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.PathParameterJSON(ctx, jsonObj)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `jsonObj`                                                                                          | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.PathParameterJSONResponse](../../models/operations/pathparameterjsonresponse.md), error**


## PipeDelimitedQueryParamsArray

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    arrParam := []string{
        "labore",
    }
    arrParamExploded := []int64{
        240829,
    }
    mapParam := map[string]string{
        "dolorum": "architecto",
    }
    objParam := &shared.SimpleObject{
        Any: "quae",
        Bigint: big.NewInt(16429),
        BigintStr: types.MustBigIntFromString("555649"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(9295.3),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.PipeDelimitedQueryParamsArray(ctx, arrParam, arrParamExploded, mapParam, objParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `arrParam`                                                                                         | []*string*                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `arrParamExploded`                                                                                 | []*int64*                                                                                          | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `mapParam`                                                                                         | map[string]*string*                                                                                | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `objParam`                                                                                         | [*shared.SimpleObject](../../models/shared/simpleobject.md)                                        | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.PipeDelimitedQueryParamsArrayResponse](../../models/operations/pipedelimitedqueryparamsarrayresponse.md), error**


## SimplePathParameterArrays

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    arrParam := []string{
        "repellendus",
    }

    ctx := context.Background()
    res, err := s.Parameters.SimplePathParameterArrays(ctx, arrParam)
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
| `arrParam`                                            | []*string*                                            | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.SimplePathParameterArraysResponse](../../models/operations/simplepathparameterarraysresponse.md), error**


## SimplePathParameterMaps

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    mapParam := map[string]string{
        "porro": "doloribus",
    }
    mapParamExploded := map[string]int64{
        "ut": 703495,
    }

    ctx := context.Background()
    res, err := s.Parameters.SimplePathParameterMaps(ctx, mapParam, mapParamExploded)
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
| `mapParam`                                            | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   |
| `mapParamExploded`                                    | map[string]*int64*                                    | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.SimplePathParameterMapsResponse](../../models/operations/simplepathparametermapsresponse.md), error**


## SimplePathParameterObjects

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    objParam := shared.SimpleObject{
        Any: "cupiditate",
        Bigint: big.NewInt(181631),
        BigintStr: types.MustBigIntFromString("63955"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(5123.93),
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
    }
    objParamExploded := shared.SimpleObject{
        Any: "voluptatibus",
        Bigint: big.NewInt(787542),
        BigintStr: types.MustBigIntFromString("876506"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(6064.76),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumFirst,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }

    ctx := context.Background()
    res, err := s.Parameters.SimplePathParameterObjects(ctx, objParam, objParamExploded)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `objParam`                                                                                         | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../models/shared/simpleobject.md)                                         | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.SimplePathParameterObjectsResponse](../../models/operations/simplepathparameterobjectsresponse.md), error**


## SimplePathParameterPrimitives

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    boolParam := false
    intParam := 961571
    numParam := 4551.69
    strParam := "consectetur"

    ctx := context.Background()
    res, err := s.Parameters.SimplePathParameterPrimitives(ctx, boolParam, intParam, numParam, strParam)
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
| `boolParam`                                           | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   |
| `intParam`                                            | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   |
| `numParam`                                            | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   |
| `strParam`                                            | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.SimplePathParameterPrimitivesResponse](../../models/operations/simplepathparameterprimitivesresponse.md), error**

