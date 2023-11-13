# Parameters
(*Parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [DeepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [DuplicateParam](#duplicateparam)
* [FormQueryParamsArray](#formqueryparamsarray)
* [FormQueryParamsCamelObject](#formqueryparamscamelobject)
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
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    mapParam := map[string]string{
        "test2": "value2",
        "test": "value",
    }

    mapArrParam := map[string][]string{
        "test": []string{
            "test",
            "test2",
        },
        "test2": []string{
            "test3",
            "test4",
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `mapParam`                                            | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   | [object Object]                                       |
| `mapArrParam`                                         | map[string][]*string*                                 | :heavy_minus_sign:                                    | N/A                                                   | [object Object]                                       |


### Response

**[*operations.DeepObjectQueryParamsMapResponse](../../pkg/models/operations/deepobjectqueryparamsmapresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## DeepObjectQueryParamsObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    objParam := shared.SimpleObject{
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

    objArrParam := &operations.ObjArrParam{
        Arr: []string{
            "test",
            "test2",
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |
| `objParam`                                                                                         | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objArrParam`                                                                                      | [*operations.ObjArrParam](../../../pkg/models/operations/objarrparam.md)                           | :heavy_minus_sign:                                                                                 | N/A                                                                                                |


### Response

**[*operations.DeepObjectQueryParamsObjectResponse](../../pkg/models/operations/deepobjectqueryparamsobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## DuplicateParam

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var duplicateParamRequest string = "string"

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

**[*operations.DuplicateParamResponse](../../pkg/models/operations/duplicateparamresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    arrParam := []string{
        "test",
        "test2",
    }

    arrParamExploded := []int64{
        1,
        2,
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

**[*operations.FormQueryParamsArrayResponse](../../pkg/models/operations/formqueryparamsarrayresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsCamelObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    objParamExploded := operations.ObjParamExploded{
        ItemCount: openapi.String("10"),
        SearchTerm: openapi.String("foo"),
    }

    objParam := &operations.ObjParam{
        EncodedCount: openapi.String("11"),
        EncodedTerm: openapi.String("bar"),
    }

    ctx := context.Background()
    res, err := s.Parameters.FormQueryParamsCamelObject(ctx, objParamExploded, objParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `ctx`                                                                             | [context.Context](https://pkg.go.dev/context#Context)                             | :heavy_check_mark:                                                                | The context to use for the request.                                               |
| `objParamExploded`                                                                | [operations.ObjParamExploded](../../../pkg/models/operations/objparamexploded.md) | :heavy_check_mark:                                                                | N/A                                                                               |
| `objParam`                                                                        | [*operations.ObjParam](../../../pkg/models/operations/objparam.md)                | :heavy_minus_sign:                                                                | N/A                                                                               |


### Response

**[*operations.FormQueryParamsCamelObjectResponse](../../pkg/models/operations/formqueryparamscamelobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    mapParam := map[string]string{
        "test": "value",
        "test2": "value2",
    }

    mapParamExploded := map[string]int64{
        "test": 1,
        "test2": 2,
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `mapParam`                                            | map[string]*string*                                   | :heavy_minus_sign:                                    | N/A                                                   | [object Object]                                       |
| `mapParamExploded`                                    | map[string]*int64*                                    | :heavy_minus_sign:                                    | N/A                                                   | [object Object]                                       |


### Response

**[*operations.FormQueryParamsMapResponse](../../pkg/models/operations/formqueryparamsmapresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    objParamExploded := shared.SimpleObject{
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

    objParam := &shared.SimpleObject{
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
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [*shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.FormQueryParamsObjectResponse](../../pkg/models/operations/formqueryparamsobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var boolParam bool = true

    var intParam int64 = 1

    var numParam float64 = 1.1

    var strParam string = "test"

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `boolParam`                                           | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   | true                                                  |
| `intParam`                                            | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   | 1                                                     |
| `numParam`                                            | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   | 1.1                                                   |
| `strParam`                                            | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | test                                                  |


### Response

**[*operations.FormQueryParamsPrimitiveResponse](../../pkg/models/operations/formqueryparamsprimitiveresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## FormQueryParamsRefParamObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    refObjParam := &shared.RefQueryParamObj{
        Bool: true,
        Int: 1,
        Num: 1.1,
        Str: "test",
    }

    refObjParamExploded := &shared.RefQueryParamObjExploded{
        Bool: true,
        Int: 1,
        Num: 1.1,
        Str: "test",
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

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `ctx`                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                      | :heavy_check_mark:                                                                         | The context to use for the request.                                                        |
| `refObjParam`                                                                              | [*shared.RefQueryParamObj](../../../pkg/models/shared/refqueryparamobj.md)                 | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `refObjParamExploded`                                                                      | [*shared.RefQueryParamObjExploded](../../../pkg/models/shared/refqueryparamobjexploded.md) | :heavy_minus_sign:                                                                         | N/A                                                                                        |


### Response

**[*operations.FormQueryParamsRefParamObjectResponse](../../pkg/models/operations/formqueryparamsrefparamobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## HeaderParamsArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    xHeaderArray := []string{
        "test1",
        "test2",
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

**[*operations.HeaderParamsArrayResponse](../../pkg/models/operations/headerparamsarrayresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## HeaderParamsMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    xHeaderMap := map[string]string{
        "key2": "value2",
        "key1": "value1",
    }

    xHeaderMapExplode := map[string]string{
        "test2": "val2",
        "test1": "val1",
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `xHeaderMap`                                          | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   | [object Object]                                       |
| `xHeaderMapExplode`                                   | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   | [object Object]                                       |


### Response

**[*operations.HeaderParamsMapResponse](../../pkg/models/operations/headerparamsmapresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## HeaderParamsObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    xHeaderObj := shared.SimpleObject{
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

    xHeaderObjExplode := shared.SimpleObject{
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
| `xHeaderObj`                                                                                       | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.HeaderParamsObjectResponse](../../pkg/models/operations/headerparamsobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## HeaderParamsPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var xHeaderBoolean bool = true

    var xHeaderInteger int64 = 1

    var xHeaderNumber float64 = 1.1

    var xHeaderString string = "test"

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `xHeaderBoolean`                                      | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   | true                                                  |
| `xHeaderInteger`                                      | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   | 1                                                     |
| `xHeaderNumber`                                       | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   | 1.1                                                   |
| `xHeaderString`                                       | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | test                                                  |


### Response

**[*operations.HeaderParamsPrimitiveResponse](../../pkg/models/operations/headerparamsprimitiveresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## JSONQueryParamsObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    deepObjParam := shared.DeepObject{
        Any: shared.CreateAnySimpleObject(
                shared.SimpleObject{
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
                },
        ),
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
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
            },
            shared.SimpleObject{
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
            },
        },
        Bool: true,
        Int: 1,
        Map: map[string]shared.SimpleObject{
            "key": shared.SimpleObject{
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
            },
            "key2": shared.SimpleObject{
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
            },
        },
        Num: 1.1,
        Obj: shared.SimpleObject{
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
        },
        Str: "test",
    }

    simpleObjParam := shared.SimpleObject{
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
| `deepObjParam`                                                                                     | [shared.DeepObject](../../../pkg/models/shared/deepobject.md)                                      | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.JSONQueryParamsObjectResponse](../../pkg/models/operations/jsonqueryparamsobjectresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## MixedParametersCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var headerParam string = "headerValue"

    var pathParam string = "pathValue"

    var queryStringParam string = "queryValue"

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `headerParam`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | headerValue                                           |
| `pathParam`                                           | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | pathValue                                             |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | queryValue                                            |


### Response

**[*operations.MixedParametersCamelCaseResponse](../../pkg/models/operations/mixedparameterscamelcaseresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## MixedParametersPrimitives

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var headerParam string = "headerValue"

    var pathParam string = "pathValue"

    var queryStringParam string = "queryValue"

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `headerParam`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | headerValue                                           |
| `pathParam`                                           | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | pathValue                                             |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | queryValue                                            |


### Response

**[*operations.MixedParametersPrimitivesResponse](../../pkg/models/operations/mixedparametersprimitivesresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## MixedQueryParams

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    deepObjectParam := shared.SimpleObject{
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

    formParam := shared.SimpleObject{
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

    jsonParam := shared.SimpleObject{
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
| `deepObjectParam`                                                                                  | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.MixedQueryParamsResponse](../../pkg/models/operations/mixedqueryparamsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## PathParameterJSON

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    jsonObj := shared.SimpleObject{
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
| `jsonObj`                                                                                          | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.PathParameterJSONResponse](../../pkg/models/operations/pathparameterjsonresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## PipeDelimitedQueryParamsArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    arrParam := []string{
        "test",
        "test2",
    }

    arrParamExploded := []int64{
        1,
        2,
    }

    mapParam := map[string]string{
        "key1": "val1",
        "key2": "val2",
    }

    objParam := &shared.SimpleObject{
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                              | :heavy_check_mark:                                                                                 | The context to use for the request.                                                                |                                                                                                    |
| `arrParam`                                                                                         | []*string*                                                                                         | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `arrParamExploded`                                                                                 | []*int64*                                                                                          | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |
| `mapParam`                                                                                         | map[string]*string*                                                                                | :heavy_minus_sign:                                                                                 | N/A                                                                                                | [object Object]                                                                                    |
| `objParam`                                                                                         | [*shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                 | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |                                                                                                    |


### Response

**[*operations.PipeDelimitedQueryParamsArrayResponse](../../pkg/models/operations/pipedelimitedqueryparamsarrayresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## SimplePathParameterArrays

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    arrParam := []string{
        "test",
        "test2",
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

**[*operations.SimplePathParameterArraysResponse](../../pkg/models/operations/simplepathparameterarraysresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## SimplePathParameterMaps

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    mapParam := map[string]string{
        "test2": "value2",
        "test": "value",
    }

    mapParamExploded := map[string]int64{
        "test": 1,
        "test2": 2,
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `mapParam`                                            | map[string]*string*                                   | :heavy_check_mark:                                    | N/A                                                   | [object Object]                                       |
| `mapParamExploded`                                    | map[string]*int64*                                    | :heavy_check_mark:                                    | N/A                                                   | [object Object]                                       |


### Response

**[*operations.SimplePathParameterMapsResponse](../../pkg/models/operations/simplepathparametermapsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## SimplePathParameterObjects

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    objParam := shared.SimpleObject{
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

    objParamExploded := shared.SimpleObject{
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
| `objParam`                                                                                         | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                  | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[*operations.SimplePathParameterObjectsResponse](../../pkg/models/operations/simplepathparameterobjectsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |

## SimplePathParameterPrimitives

### Example Usage

```go
package main

import(
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var boolParam bool = true

    var intParam int64 = 1

    var numParam float64 = 1.1

    var strParam string = "test"

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

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |                                                       |
| `boolParam`                                           | *bool*                                                | :heavy_check_mark:                                    | N/A                                                   | true                                                  |
| `intParam`                                            | *int64*                                               | :heavy_check_mark:                                    | N/A                                                   | 1                                                     |
| `numParam`                                            | *float64*                                             | :heavy_check_mark:                                    | N/A                                                   | 1.1                                                   |
| `strParam`                                            | *string*                                              | :heavy_check_mark:                                    | N/A                                                   | test                                                  |


### Response

**[*operations.SimplePathParameterPrimitivesResponse](../../pkg/models/operations/simplepathparameterprimitivesresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 400-600            | */*                |
