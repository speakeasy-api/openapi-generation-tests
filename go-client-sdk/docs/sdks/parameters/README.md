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
        "voluptate": "dolorum",
        "deleniti": "omnis",
    }
    mapArrParam := map[string][]string{
        "distinctio": []string{
            "nihil",
            "ipsum",
            "voluptate",
            "id",
        },
        "saepe": []string{
            "aspernatur",
            "perferendis",
        },
        "amet": []string{
            "accusamus",
            "ad",
            "saepe",
            "suscipit",
        },
        "deserunt": []string{
            "minima",
            "repellendus",
            "totam",
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
        Any: "similique",
        Bigint: big.NewInt(55),
        BigintStr: types.MustBigIntFromString("872651"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    objArrParam := &operations.DeepObjectQueryParamsObjectObjArrParam{
        Arr: []string{
            "quod",
            "officiis",
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
    duplicateParamRequest := "qui"

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
        "a",
        "esse",
        "harum",
    }
    arrParamExploded := []int64{
        215507,
        788740,
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
        "amet": "tempore",
        "accusamus": "numquam",
        "enim": "dolorem",
        "sapiente": "totam",
    }
    mapParamExploded := map[string]int64{
        "sit": 711584,
        "neque": 153694,
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
        Any: "vel",
        Bigint: big.NewInt(730442),
        BigintStr: types.MustBigIntFromString("374170"),
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
    }
    objParam := &shared.SimpleObject{
        Any: "ipsum",
        Bigint: big.NewInt(277628),
        BigintStr: types.MustBigIntFromString("186458"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumThird,
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
    intParam := 863856
    numParam := 7470.8
    strParam := "dicta"

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
        Int: 674848,
        Num: 5173.79,
        Str: "incidunt",
    }
    refObjParamExploded := &shared.RefQueryParamObjExploded{
        Bool: false,
        Int: 132068,
        Num: 1749.09,
        Str: "distinctio",
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
        "aliquid",
        "quam",
        "molestias",
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
        "qui": "neque",
        "fugit": "magni",
        "odio": "sunt",
        "ullam": "nam",
    }
    xHeaderMapExplode := map[string]string{
        "voluptatem": "cumque",
        "soluta": "nobis",
        "et": "saepe",
        "ipsum": "veritatis",
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
        Any: "nobis",
        Bigint: big.NewInt(552193),
        BigintStr: types.MustBigIntFromString("731694"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    xHeaderObjExplode := shared.SimpleObject{
        Any: "delectus",
        Bigint: big.NewInt(209157),
        BigintStr: types.MustBigIntFromString("292147"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    xHeaderInteger := 677263
    xHeaderNumber := 1002.94
    xHeaderString := "quae"

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
            Any: "quas",
            Bigint: big.NewInt(929530),
            BigintStr: types.MustBigIntFromString("9240"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
                Any: "doloribus",
                Bigint: big.NewInt(281730),
                BigintStr: types.MustBigIntFromString("703495"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            },
            shared.SimpleObject{
                Any: "quae",
                Bigint: big.NewInt(512393),
                BigintStr: types.MustBigIntFromString("485628"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "quisquam",
                Bigint: big.NewInt(876506),
                BigintStr: types.MustBigIntFromString("606476"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            },
            shared.SimpleObject{
                Any: "delectus",
                Bigint: big.NewInt(455169),
                BigintStr: types.MustBigIntFromString("231701"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
        },
        Bool: false,
        Int: 492268,
        Map: map[string]shared.SimpleObject{
            "distinctio": shared.SimpleObject{
                Any: "quod",
                Bigint: big.NewInt(486160),
                BigintStr: types.MustBigIntFromString("630448"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            "ducimus": shared.SimpleObject{
                Any: "dolore",
                Bigint: big.NewInt(844550),
                BigintStr: types.MustBigIntFromString("848944"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            },
            "impedit": shared.SimpleObject{
                Any: "aut",
                Bigint: big.NewInt(974259),
                BigintStr: types.MustBigIntFromString("347233"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            },
            "porro": shared.SimpleObject{
                Any: "maiores",
                Bigint: big.NewInt(985033),
                BigintStr: types.MustBigIntFromString("478370"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
            },
        },
        Num: 40.48,
        Obj: shared.SimpleObject{
            Any: "officia",
            Bigint: big.NewInt(269479),
            BigintStr: types.MustBigIntFromString("368584"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
        },
        Str: "vel",
        Type: sdk.String("possimus"),
    }
    simpleObjParam := shared.SimpleObject{
        Any: "magnam",
        Bigint: big.NewInt(189848),
        BigintStr: types.MustBigIntFromString("401132"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    headerParam := "dolor"
    pathParam := "maiores"
    queryStringParam := "quasi"

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
    headerParam := "ex"
    pathParam := "nulla"
    queryStringParam := "excepturi"

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
        Any: "voluptatibus",
        Bigint: big.NewInt(343605),
        BigintStr: types.MustBigIntFromString("960835"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    formParam := shared.SimpleObject{
        Any: "ea",
        Bigint: big.NewInt(774048),
        BigintStr: types.MustBigIntFromString("359271"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
    jsonParam := shared.SimpleObject{
        Any: "inventore",
        Bigint: big.NewInt(301831),
        BigintStr: types.MustBigIntFromString("407241"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
        Any: "recusandae",
        Bigint: big.NewInt(132487),
        BigintStr: types.MustBigIntFromString("325310"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
        "aut",
        "aut",
        "deleniti",
    }
    arrParamExploded := []int64{
        304582,
        146946,
        882860,
        79522,
    }
    mapParam := map[string]string{
        "et": "dolorum",
        "laborum": "placeat",
    }
    objParam := &shared.SimpleObject{
        Any: "velit",
        Bigint: big.NewInt(432148),
        BigintStr: types.MustBigIntFromString("420539"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
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
        "nulla",
        "voluptas",
        "libero",
        "quasi",
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
        "numquam": "explicabo",
        "provident": "ipsa",
    }
    mapParamExploded := map[string]int64{
        "magnam": 487935,
        "eius": 458515,
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
        Any: "esse",
        Bigint: big.NewInt(524593),
        BigintStr: types.MustBigIntFromString("683282"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumThird,
        IntOptNull: sdk.Int64(999999),
        Num: 1.1,
        NumOptNull: sdk.Float64(1.1),
        Str: "example",
        StrOpt: sdk.String("optional example"),
    }
    objParamExploded := shared.SimpleObject{
        Any: "fugiat",
        Bigint: big.NewInt(283519),
        BigintStr: types.MustBigIntFromString("433439"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumThird,
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
    intParam := 181151
    numParam := 5093.42
    strParam := "quisquam"

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

