# RequestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [RequestBodyPostApplicationJSONArray](#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJSONArrayObj](#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJSONArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJSONMap](#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJSONMapObj](#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJSONMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJSONMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJSONSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostEmptyObject](#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](#requestbodypostformsimple)
* [RequestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNullArray](#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [RequestBodyPutBytes](#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [RequestBodyPutString](#requestbodyputstring)
* [RequestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [RequestBodyWriteOnly](#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)

## RequestBodyPostApplicationJSONArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArray(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "quo",
            Bigint: big.NewInt(847276),
            BigintStr: types.MustBigIntFromString("777408"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(6813.59),
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
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.SimpleObjects != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]shared.SimpleObject](../../models//.md)               | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayresponse.md), error**


## RequestBodyPostApplicationJSONArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "ab",
            BigintStrVal: types.MustBigIntFromString("587600"),
            BigintVal: big.NewInt(9688),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(2728.22),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "aspernatur",
            BigintStrVal: types.MustBigIntFromString("197054"),
            BigintVal: big.NewInt(779192),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(4598.56),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.SimpleObjectCamelCases != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]shared.SimpleObjectCamelCase](../../models//.md)      | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayObj

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObj(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "quod",
            Bigint: big.NewInt(490819),
            BigintStr: types.MustBigIntFromString("76956"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(4694.98),
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
            Any: "aliquam",
            Bigint: big.NewInt(488410),
            BigintStr: types.MustBigIntFromString("577543"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(4145.67),
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
        shared.SimpleObject{
            Any: "deserunt",
            Bigint: big.NewInt(475289),
            BigintStr: types.MustBigIntFromString("35362"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(7836.48),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ArrObjValue != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]shared.SimpleObject](../../models//.md)            | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjResponse](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md), error**


## RequestBodyPostApplicationJSONArrayObjCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObjCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "consequuntur",
            BigintStrVal: types.MustBigIntFromString("536178"),
            BigintVal: big.NewInt(143829),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(6813.93),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "atque",
            BigintStrVal: types.MustBigIntFromString("128860"),
            BigintVal: big.NewInt(325685),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(3926.76),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "consequuntur",
            BigintStrVal: types.MustBigIntFromString("187131"),
            BigintVal: big.NewInt(129412),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(9039.84),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ArrObjValueCamelCase != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]shared.SimpleObjectCamelCase](../../models//.md)   | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArray(ctx, [][]shared.SimpleObject{
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "eveniet",
                Bigint: big.NewInt(882042),
                BigintStr: types.MustBigIntFromString("82971"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(4586.04),
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
            shared.SimpleObject{
                Any: "vero",
                Bigint: big.NewInt(399025),
                BigintStr: types.MustBigIntFromString("93459"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(9040.45),
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
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]shared.SimpleObject](../../models//.md)             | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayCamelCase(ctx, [][]shared.SimpleObjectCamelCase{
        []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "occaecati",
                BigintStrVal: types.MustBigIntFromString("327720"),
                BigintVal: big.NewInt(716244),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(7567.79),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "tempore",
                BigintStrVal: types.MustBigIntFromString("240020"),
                BigintVal: big.NewInt(766964),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(1605.38),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "quaerat",
                BigintStrVal: types.MustBigIntFromString("959167"),
                BigintVal: big.NewInt(232865),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4581.39),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "nulla",
                BigintStrVal: types.MustBigIntFromString("557811"),
                BigintVal: big.NewInt(457223),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(974.68),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "sint",
                BigintStrVal: types.MustBigIntFromString("863023"),
                BigintVal: big.NewInt(820767),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(1576.32),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "facere",
                BigintStrVal: types.MustBigIntFromString("85001"),
                BigintVal: big.NewInt(159414),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(944.58),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "aliquid",
                BigintStrVal: types.MustBigIntFromString("949298"),
                BigintVal: big.NewInt(62713),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(9367.47),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]shared.SimpleObjectCamelCase](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, [][]string{
        []string{
            "illum",
            "soluta",
            "accusantium",
        },
        []string{
            "sapiente",
            "dicta",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]string](../../models//.md)                          | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMap(ctx, []map[string]shared.SimpleObject{
        map[string]shared.SimpleObject{
            "ullam": shared.SimpleObject{
                Any: "nisi",
                Bigint: big.NewInt(16328),
                BigintStr: types.MustBigIntFromString("531849"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(1852.32),
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
            "deleniti": shared.SimpleObject{
                Any: "itaque",
                Bigint: big.NewInt(680270),
                BigintStr: types.MustBigIntFromString("99615"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(6091.78),
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
        },
        map[string]shared.SimpleObject{
            "et": shared.SimpleObject{
                Any: "voluptate",
                Bigint: big.NewInt(55965),
                BigintStr: types.MustBigIntFromString("326701"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(865.32),
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
            },
            "iste": shared.SimpleObject{
                Any: "temporibus",
                Bigint: big.NewInt(33074),
                BigintStr: types.MustBigIntFromString("522371"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(156.06),
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
            "mollitia": shared.SimpleObject{
                Any: "ab",
                Bigint: big.NewInt(544591),
                BigintStr: types.MustBigIntFromString("251941"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(324.65),
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
            "numquam": shared.SimpleObject{
                Any: "impedit",
                Bigint: big.NewInt(131055),
                BigintStr: types.MustBigIntFromString("376226"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(120.36),
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
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Maps != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]map[string]shared.SimpleObject](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMapCamelCase(ctx, []map[string]shared.SimpleObjectCamelCase{
        map[string]shared.SimpleObjectCamelCase{
            "velit": shared.SimpleObjectCamelCase{
                AnyVal: "voluptatibus",
                BigintStrVal: types.MustBigIntFromString("374323"),
                BigintVal: big.NewInt(990345),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(456.59),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "consequuntur": shared.SimpleObjectCamelCase{
                AnyVal: "repellendus",
                BigintStrVal: types.MustBigIntFromString("638762"),
                BigintVal: big.NewInt(807023),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4903.05),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "nemo": shared.SimpleObjectCamelCase{
                AnyVal: "quae",
                BigintStrVal: types.MustBigIntFromString("312753"),
                BigintVal: big.NewInt(783235),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(8018.36),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        map[string]shared.SimpleObjectCamelCase{
            "fuga": shared.SimpleObjectCamelCase{
                AnyVal: "id",
                BigintStrVal: types.MustBigIntFromString("380729"),
                BigintVal: big.NewInt(246063),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(6339.31),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        map[string]shared.SimpleObjectCamelCase{
            "fugiat": shared.SimpleObjectCamelCase{
                AnyVal: "vel",
                BigintStrVal: types.MustBigIntFromString("497678"),
                BigintVal: big.NewInt(554688),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4278.34),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "facilis": shared.SimpleObjectCamelCase{
                AnyVal: "cum",
                BigintStrVal: types.MustBigIntFromString("414857"),
                BigintVal: big.NewInt(447144),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(3605.45),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "nemo": shared.SimpleObjectCamelCase{
                AnyVal: "recusandae",
                BigintStrVal: types.MustBigIntFromString("397533"),
                BigintVal: big.NewInt(46007),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(7386.83),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        map[string]shared.SimpleObjectCamelCase{
            "earum": shared.SimpleObjectCamelCase{
                AnyVal: "facere",
                BigintStrVal: types.MustBigIntFromString("257233"),
                BigintVal: big.NewInt(985492),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(3817.6),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "saepe": shared.SimpleObjectCamelCase{
                AnyVal: "necessitatibus",
                BigintStrVal: types.MustBigIntFromString("296556"),
                BigintVal: big.NewInt(121059),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(9920.12),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Maps != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [[]map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, []string{
        "beatae",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Strings != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]string](../../models//.md)                            | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeep(ctx, shared.DeepObject{
        Any: shared.SimpleObject{
            Any: "a",
            Bigint: big.NewInt(891523),
            BigintStr: types.MustBigIntFromString("233420"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(3581.07),
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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "voluptates",
                Bigint: big.NewInt(730709),
                BigintStr: types.MustBigIntFromString("113816"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8817.21),
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
        },
        Bool: false,
        Int: 132815,
        Map: map[string]shared.SimpleObject{
            "voluptas": shared.SimpleObject{
                Any: "voluptas",
                Bigint: big.NewInt(324405),
                BigintStr: types.MustBigIntFromString("748789"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(6801.16),
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
            },
            "dolores": shared.SimpleObject{
                Any: "blanditiis",
                Bigint: big.NewInt(449292),
                BigintStr: types.MustBigIntFromString("296242"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(3044.68),
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
        Num: 3518.7,
        Obj: shared.SimpleObject{
            Any: "adipisci",
            Bigint: big.NewInt(738391),
            BigintStr: types.MustBigIntFromString("502389"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(5553.61),
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
        Str: "culpa",
        Type: sdk.String("corrupti"),
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPostApplicationJSONDeepResponse](../../models/operations/requestbodypostapplicationjsondeepresponse.md), error**


## RequestBodyPostApplicationJSONDeepCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeepCamelCase(ctx, shared.DeepObjectCamelCase{
        AnyVal: "totam",
        ArrVal: []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "exercitationem",
                BigintStrVal: types.MustBigIntFromString("750765"),
                BigintVal: big.NewInt(24619),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(6995.75),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "explicabo",
                BigintStrVal: types.MustBigIntFromString("994401"),
                BigintVal: big.NewInt(707918),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4518.22),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "iste",
                BigintStrVal: types.MustBigIntFromString("292794"),
                BigintVal: big.NewInt(671907),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(1523.54),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "quidem",
                BigintStrVal: types.MustBigIntFromString("131289"),
                BigintVal: big.NewInt(378326),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(6041.18),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        BoolVal: false,
        IntVal: 960257,
        MapVal: map[string]shared.SimpleObjectCamelCase{
            "illo": shared.SimpleObjectCamelCase{
                AnyVal: "reiciendis",
                BigintStrVal: types.MustBigIntFromString("19300"),
                BigintVal: big.NewInt(546885),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(9795.74),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "provident": shared.SimpleObjectCamelCase{
                AnyVal: "eius",
                BigintStrVal: types.MustBigIntFromString("896762"),
                BigintVal: big.NewInt(215529),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4067.33),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "voluptatibus": shared.SimpleObjectCamelCase{
                AnyVal: "tempora",
                BigintStrVal: types.MustBigIntFromString("273009"),
                BigintVal: big.NewInt(455444),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(9700.76),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            "non": shared.SimpleObjectCamelCase{
                AnyVal: "officiis",
                BigintStrVal: types.MustBigIntFromString("505866"),
                BigintVal: big.NewInt(708609),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(3103.81),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        NumVal: 8948.64,
        ObjVal: shared.SimpleObjectCamelCase{
            AnyVal: "rem",
            BigintStrVal: types.MustBigIntFromString("26522"),
            BigintVal: big.NewInt(750595),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(6256.37),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        StrVal: "recusandae",
        Type: sdk.String("reiciendis"),
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

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |


### Response

**[*operations.RequestBodyPostApplicationJSONDeepCamelCaseResponse](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMap(ctx, map[string]shared.SimpleObject{
        "magni": shared.SimpleObject{
            Any: "aperiam",
            Bigint: big.NewInt(901483),
            BigintStr: types.MustBigIntFromString("253642"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(3299.35),
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
        "beatae": shared.SimpleObject{
            Any: "laudantium",
            Bigint: big.NewInt(348476),
            BigintStr: types.MustBigIntFromString("510629"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(7400.98),
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
        "voluptatum": shared.SimpleObject{
            Any: "error",
            Bigint: big.NewInt(944708),
            BigintStr: types.MustBigIntFromString("710529"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(8928.63),
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
        },
        "nostrum": shared.SimpleObject{
            Any: "officia",
            Bigint: big.NewInt(676243),
            BigintStr: types.MustBigIntFromString("548361"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(8792.35),
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

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]shared.SimpleObject](../../models//.md)      | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapResponse](../../models/operations/requestbodypostapplicationjsonmapresponse.md), error**


## RequestBodyPostApplicationJSONMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "ut": shared.SimpleObjectCamelCase{
            AnyVal: "fugiat",
            BigintStrVal: types.MustBigIntFromString("30235"),
            BigintVal: big.NewInt(635057),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(7103.37),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
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

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../models/operations/option.md)     | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.RequestBodyPostApplicationJSONMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapObj

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObj(ctx, map[string]shared.SimpleObject{
        "ipsam": shared.SimpleObject{
            Any: "sit",
            Bigint: big.NewInt(530537),
            BigintStr: types.MustBigIntFromString("558065"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(9221.12),
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
        "blanditiis": shared.SimpleObject{
            Any: "ex",
            Bigint: big.NewInt(153627),
            BigintStr: types.MustBigIntFromString("24313"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(4255.08),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.MapObjValue != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]shared.SimpleObject](../../models//.md)   | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapObjResponse](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md), error**


## RequestBodyPostApplicationJSONMapObjCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObjCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "consequatur": shared.SimpleObjectCamelCase{
            AnyVal: "incidunt",
            BigintStrVal: types.MustBigIntFromString("968865"),
            BigintVal: big.NewInt(209750),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(6908.94),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        "occaecati": shared.SimpleObjectCamelCase{
            AnyVal: "labore",
            BigintStrVal: types.MustBigIntFromString("695270"),
            BigintVal: big.NewInt(539074),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(6719.57),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
        "laboriosam": shared.SimpleObjectCamelCase{
            AnyVal: "alias",
            BigintStrVal: types.MustBigIntFromString("227084"),
            BigintVal: big.NewInt(647197),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(4548.6),
            EnumVal: shared.EnumTwo,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: sdk.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: sdk.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: sdk.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.MapObjValueCamelCase != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |


### Response

**[*operations.RequestBodyPostApplicationJSONMapObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArray(ctx, map[string][]shared.SimpleObject{
        "repellendus": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "voluptates",
                Bigint: big.NewInt(16871),
                BigintStr: types.MustBigIntFromString("667285"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(6964.83),
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
                Any: "fuga",
                Bigint: big.NewInt(509807),
                BigintStr: types.MustBigIntFromString("648598"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(3339.65),
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
            },
            shared.SimpleObject{
                Any: "repudiandae",
                Bigint: big.NewInt(97243),
                BigintStr: types.MustBigIntFromString("542457"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(4420.36),
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
            shared.SimpleObject{
                Any: "suscipit",
                Bigint: big.NewInt(693957),
                BigintStr: types.MustBigIntFromString("806670"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(908.85),
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
        },
        "assumenda": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "atque",
                Bigint: big.NewInt(623295),
                BigintStr: types.MustBigIntFromString("887265"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8869.61),
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
            shared.SimpleObject{
                Any: "minima",
                Bigint: big.NewInt(133461),
                BigintStr: types.MustBigIntFromString("404425"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(9805.81),
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
        },
        "error": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "suscipit",
                Bigint: big.NewInt(922348),
                BigintStr: types.MustBigIntFromString("542129"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5413.81),
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
            },
            shared.SimpleObject{
                Any: "dolorum",
                Bigint: big.NewInt(829898),
                BigintStr: types.MustBigIntFromString("287119"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(9682.87),
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
            },
            shared.SimpleObject{
                Any: "dicta",
                Bigint: big.NewInt(36033),
                BigintStr: types.MustBigIntFromString("106429"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(1747.72),
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

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string][]shared.SimpleObject](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayResponse](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md), error**


## RequestBodyPostApplicationJSONMapOfArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArrayCamelCase(ctx, map[string][]shared.SimpleObjectCamelCase{
        "a": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "magnam",
                BigintStrVal: types.MustBigIntFromString("906355"),
                BigintVal: big.NewInt(160467),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(5801.07),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValOneHundredAndEightyOne,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "in",
                BigintStrVal: types.MustBigIntFromString("238043"),
                BigintVal: big.NewInt(907876),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(5808.87),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "id",
                BigintStrVal: types.MustBigIntFromString("335631"),
                BigintVal: big.NewInt(440264),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(6255.28),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
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

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [map[string][]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMap(ctx, map[string]map[string]shared.SimpleObject{
        "eveniet": map[string]shared.SimpleObject{
            "vero": shared.SimpleObject{
                Any: "doloremque",
                Bigint: big.NewInt(434156),
                BigintStr: types.MustBigIntFromString("59944"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5176.12),
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
        },
        "eveniet": map[string]shared.SimpleObject{
            "cum": shared.SimpleObject{
                Any: "iure",
                Bigint: big.NewInt(898063),
                BigintStr: types.MustBigIntFromString("187552"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(6725.82),
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
        "rem": map[string]shared.SimpleObject{
            "ad": shared.SimpleObject{
                Any: "repellat",
                Bigint: big.NewInt(3099),
                BigintStr: types.MustBigIntFromString("362189"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5973.03),
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
            "voluptas": shared.SimpleObject{
                Any: "alias",
                Bigint: big.NewInt(979527),
                BigintStr: types.MustBigIntFromString("970222"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(1746.58),
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

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [map[string]map[string]shared.SimpleObject](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapResponse](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapCamelCase(ctx, map[string]map[string]shared.SimpleObjectCamelCase{
        "dolorum": map[string]shared.SimpleObjectCamelCase{
            "quae": shared.SimpleObjectCamelCase{
                AnyVal: "recusandae",
                BigintStrVal: types.MustBigIntFromString("607249"),
                BigintVal: big.NewInt(309251),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4776.46),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
        },
        "culpa": map[string]shared.SimpleObjectCamelCase{
            "debitis": shared.SimpleObjectCamelCase{
                AnyVal: "laudantium",
                BigintStrVal: types.MustBigIntFromString("432606"),
                BigintVal: big.NewInt(367927),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(9282.19),
                EnumVal: shared.EnumTwo,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValSecond,
                IntOptNullVal: sdk.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: sdk.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: sdk.String("optional example"),
                StrVal: "example",
            },
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

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `ctx`                                                                   | [context.Context](https://pkg.go.dev/context#Context)                   | :heavy_check_mark:                                                      | The context to use for the request.                                     |
| `request`                                                               | [map[string]map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `opts`                                                                  | [][operations.Option](../../models/operations/option.md)                | :heavy_minus_sign:                                                      | The options for this request.                                           |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, map[string]map[string]string{
        "eum": map[string]string{
            "provident": "aspernatur",
            "ullam": "quasi",
            "animi": "nostrum",
            "mollitia": "provident",
        },
        "possimus": map[string]string{
            "ex": "aliquid",
            "accusantium": "repellat",
            "doloribus": "ullam",
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

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]map[string]string](../../models//.md)        | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, map[string]string{
        "nam": "earum",
        "officia": "laborum",
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

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]string](../../models//.md)                   | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONMultipleJSONFiltered

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMultipleJSONFiltered(ctx, shared.SimpleObject{
        Any: "placeat",
        Bigint: big.NewInt(266697),
        BigintStr: types.MustBigIntFromString("976226"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(5640.64),
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
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostApplicationJSONMultipleJSONFilteredResponse](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md), error**


## RequestBodyPostApplicationJSONSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimple(ctx, shared.SimpleObject{
        Any: "cumque",
        Bigint: big.NewInt(113486),
        BigintStr: types.MustBigIntFromString("698249"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(2722.29),
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
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostApplicationJSONSimpleResponse](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md), error**


## RequestBodyPostApplicationJSONSimpleCamelCase

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimpleCamelCase(ctx, shared.SimpleObjectCamelCase{
        AnyVal: "fugit",
        BigintStrVal: types.MustBigIntFromString("765271"),
        BigintVal: big.NewInt(62636),
        BoolOptVal: sdk.Bool(true),
        BoolVal: true,
        DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DateVal: types.MustDateFromString("2020-01-01"),
        DecimalVal: sdk.Float64(216.88),
        EnumVal: shared.EnumTwo,
        Float32Val: 2.2222222,
        Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValFiftyFive,
        Int32Val: 1,
        IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValFirst,
        IntOptNullVal: sdk.Int64(999999),
        IntVal: 999999,
        NumOptNullVal: sdk.Float64(1.1),
        NumVal: 1.1,
        StrOptVal: sdk.String("optional example"),
        StrVal: "example",
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

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `ctx`                                                                        | [context.Context](https://pkg.go.dev/context#Context)                        | :heavy_check_mark:                                                           | The context to use for the request.                                          |
| `request`                                                                    | [shared.SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[*operations.RequestBodyPostApplicationJSONSimpleCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md), error**


## RequestBodyPostEmptyObject

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostEmptyObject(ctx, operations.RequestBodyPostEmptyObjectRequestBody{
        Empty: &operations.RequestBodyPostEmptyObjectRequestBodyEmpty{},
        EmptyWithEmptyProperties: &operations.RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties{},
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostEmptyObject200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `request`                                                                                                            | [operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[*operations.RequestBodyPostEmptyObjectResponse](../../models/operations/requestbodypostemptyobjectresponse.md), error**


## RequestBodyPostFormDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostFormDeep(ctx, shared.DeepObject{
        Any: shared.SimpleObject{
            Any: "eius",
            Bigint: big.NewInt(521996),
            BigintStr: types.MustBigIntFromString("871083"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(7730.84),
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
        },
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "dicta",
                Bigint: big.NewInt(325118),
                BigintStr: types.MustBigIntFromString("107004"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5834.04),
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
                Any: "soluta",
                Bigint: big.NewInt(940782),
                BigintStr: types.MustBigIntFromString("848151"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(525.08),
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
        Bool: false,
        Int: 983427,
        Map: map[string]shared.SimpleObject{
            "aliquid": shared.SimpleObject{
                Any: "porro",
                Bigint: big.NewInt(380335),
                BigintStr: types.MustBigIntFromString("211534"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(1478.08),
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
            "ratione": shared.SimpleObject{
                Any: "animi",
                Bigint: big.NewInt(898760),
                BigintStr: types.MustBigIntFromString("862063"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(89.31),
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
            },
            "ducimus": shared.SimpleObject{
                Any: "natus",
                Bigint: big.NewInt(581082),
                BigintStr: types.MustBigIntFromString("382440"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(2415.57),
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
            },
            "doloribus": shared.SimpleObject{
                Any: "nulla",
                Bigint: big.NewInt(896582),
                BigintStr: types.MustBigIntFromString("58534"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(2711.13),
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
        Num: 1158.34,
        Obj: shared.SimpleObject{
            Any: "iusto",
            Bigint: big.NewInt(457059),
            BigintStr: types.MustBigIntFromString("508390"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(9799.63),
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
        Str: "architecto",
        Type: sdk.String("fugiat"),
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPostFormDeepResponse](../../models/operations/requestbodypostformdeepresponse.md), error**


## RequestBodyPostFormMapPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, map[string]string{
        "dicta": "odio",
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]string](../../models//.md)                | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/requestbodypostformmapprimitiveresponse.md), error**


## RequestBodyPostFormSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostFormSimple(ctx, shared.SimpleObject{
        Any: "tempora",
        Bigint: big.NewInt(458259),
        BigintStr: types.MustBigIntFromString("403793"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(2352.63),
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
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostFormSimpleResponse](../../models/operations/requestbodypostformsimpleresponse.md), error**


## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFiltered(ctx, shared.SimpleObject{
        Any: "laborum",
        Bigint: big.NewInt(123844),
        BigintStr: types.MustBigIntFromString("344718"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(8567.56),
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
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md), error**


## RequestBodyPostMultipleContentTypesInlineFiltered

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON{
        Bool: false,
        Num: 6391.87,
        Str: "suscipit",
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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                      | :heavy_check_mark:                                                                                                                                                         | The context to use for the request.                                                                                                                                        |
| `request`                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[*operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamForm

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
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 3991.61,
        Str3: "perferendis",
    }
    paramStr := "eum"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                             | The context to use for the request.                                                                                                                                                            |
| `requestBody`                                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *string*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamJSON

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
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON{
        Bool: false,
        Num: 3747.53,
        Str: "iste",
    }
    paramStr := "id"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                                                                              | :heavy_check_mark:                                                                                                                                                 | The context to use for the request.                                                                                                                                |
| `requestBody`                                                                                                                                                      | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamMultipart

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
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData{
        Bool2: false,
        Num2: 700.42,
        Str2: "error",
    }
    paramStr := "possimus"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitForm

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 9139.92,
        Str3: "mollitia",
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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                                | :heavy_check_mark:                                                                                                                                                                   | The context to use for the request.                                                                                                                                                  |
| `request`                                                                                                                                                                            | [operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitJSON

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON{
        Bool: false,
        Num: 6717.94,
        Str: "libero",
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                                                    | :heavy_check_mark:                                                                                                                                       | The context to use for the request.                                                                                                                      |
| `request`                                                                                                                                                | [operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitMultipart

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData{
        Bool2: false,
        Num2: 3240.83,
        Str2: "deleniti",
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                                                                        | :heavy_check_mark:                                                                                                                                           | The context to use for the request.                                                                                                                          |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md), error**


## RequestBodyPostNullArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullArray(ctx, []string{
        "vitae",
        "repellendus",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullArray200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]string](../../models//.md)                         | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullArrayResponse](../../models/operations/requestbodypostnullarrayresponse.md), error**


## RequestBodyPostNullDictionary

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullDictionary(ctx, map[string]string{
        "quo": "ex",
        "ut": "ad",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullDictionary200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]string](../../models//.md)                | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullDictionaryResponse](../../models/operations/requestbodypostnulldictionaryresponse.md), error**


## RequestBodyPutBytes

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("expedita"))
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
| `request`                                             | [[]byte](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPutBytesResponse](../../models/operations/requestbodyputbytesresponse.md), error**


## RequestBodyPutBytesWithParams

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
    requestBody := []byte("voluptatem")
    queryStringParam := "molestias"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutBytesWithParams(ctx, requestBody, queryStringParam)
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
| `requestBody`                                         | *[]byte*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/requestbodyputbyteswithparamsresponse.md), error**


## RequestBodyPutMultipartDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPutMultipartDeep(ctx, shared.DeepObject{
        Any: "aliquid",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "voluptatum",
                Bigint: big.NewInt(606308),
                BigintStr: types.MustBigIntFromString("85233"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(7032.18),
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
        Int: 29634,
        Map: map[string]shared.SimpleObject{
            "officiis": shared.SimpleObject{
                Any: "architecto",
                Bigint: big.NewInt(682119),
                BigintStr: types.MustBigIntFromString("867168"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8913.15),
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
            },
            "deleniti": shared.SimpleObject{
                Any: "earum",
                Bigint: big.NewInt(404244),
                BigintStr: types.MustBigIntFromString("958308"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5241.84),
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
            "asperiores": shared.SimpleObject{
                Any: "ratione",
                Bigint: big.NewInt(355225),
                BigintStr: types.MustBigIntFromString("19122"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8483.41),
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
            "quibusdam": shared.SimpleObject{
                Any: "nam",
                Bigint: big.NewInt(373216),
                BigintStr: types.MustBigIntFromString("633415"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(2228.64),
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
            },
        },
        Num: 5372.79,
        Obj: shared.SimpleObject{
            Any: "veritatis",
            Bigint: big.NewInt(274575),
            BigintStr: types.MustBigIntFromString("221396"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(86.89),
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
        },
        Str: "modi",
        Type: sdk.String("fugit"),
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPutMultipartDeepResponse](../../models/operations/requestbodyputmultipartdeepresponse.md), error**


## RequestBodyPutMultipartFile

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

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, operations.RequestBodyPutMultipartFileRequestBody{
        File: &operations.RequestBodyPutMultipartFileRequestBodyFile{
            Content: []byte("ab"),
            File: "laudantium",
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

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                  | :heavy_check_mark:                                                                                                     | The context to use for the request.                                                                                    |
| `request`                                                                                                              | [operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[*operations.RequestBodyPutMultipartFileResponse](../../models/operations/requestbodyputmultipartfileresponse.md), error**


## RequestBodyPutMultipartSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
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
    res, err := s.RequestBodies.RequestBodyPutMultipartSimple(ctx, shared.SimpleObject{
        Any: "quae",
        Bigint: big.NewInt(222658),
        BigintStr: types.MustBigIntFromString("856277"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(3694.9),
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
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/requestbodyputmultipartsimpleresponse.md), error**


## RequestBodyPutString

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "quas")
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
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPutStringResponse](../../models/operations/requestbodyputstringresponse.md), error**


## RequestBodyPutStringWithParams

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
    requestBody := "eveniet"
    queryStringParam := "impedit"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutStringWithParams(ctx, requestBody, queryStringParam)
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
| `requestBody`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.RequestBodyPutStringWithParamsResponse](../../models/operations/requestbodyputstringwithparamsresponse.md), error**


## RequestBodyReadAndWrite

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyReadAndWrite(ctx, shared.ReadWriteObjectInput{
        Num1: 884952,
        Num2: 456410,
        Num3: 897277,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadWriteObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `ctx`                                                                      | [context.Context](https://pkg.go.dev/context#Context)                      | :heavy_check_mark:                                                         | The context to use for the request.                                        |
| `request`                                                                  | [shared.ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `opts`                                                                     | [][operations.Option](../../models/operations/option.md)                   | :heavy_minus_sign:                                                         | The options for this request.                                              |


### Response

**[*operations.RequestBodyReadAndWriteResponse](../../models/operations/requestbodyreadandwriteresponse.md), error**


## RequestBodyReadOnlyInput

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyReadOnlyInput(ctx, shared.ReadOnlyObjectInput{})
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../models/operations/option.md)                 | :heavy_minus_sign:                                                       | The options for this request.                                            |


### Response

**[*operations.RequestBodyReadOnlyInputResponse](../../models/operations/requestbodyreadonlyinputresponse.md), error**


## RequestBodyWriteOnly

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyWriteOnly(ctx, shared.WriteOnlyObject{
        Bool: false,
        Num: 1533.69,
        String: "veniam",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `ctx`                                                            | [context.Context](https://pkg.go.dev/context#Context)            | :heavy_check_mark:                                               | The context to use for the request.                              |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `opts`                                                           | [][operations.Option](../../models/operations/option.md)         | :heavy_minus_sign:                                               | The options for this request.                                    |


### Response

**[*operations.RequestBodyWriteOnlyResponse](../../models/operations/requestbodywriteonlyresponse.md), error**


## RequestBodyWriteOnlyOutput

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyWriteOnlyOutput(ctx, shared.WriteOnlyObject{
        Bool: false,
        Num: 1995.96,
        String: "expedita",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.WriteOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `ctx`                                                            | [context.Context](https://pkg.go.dev/context#Context)            | :heavy_check_mark:                                               | The context to use for the request.                              |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `opts`                                                           | [][operations.Option](../../models/operations/option.md)         | :heavy_minus_sign:                                               | The options for this request.                                    |


### Response

**[*operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/requestbodywriteonlyoutputresponse.md), error**

