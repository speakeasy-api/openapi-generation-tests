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
            Any: "ipsa",
            Bigint: big.NewInt(660040),
            BigintStr: types.MustBigIntFromString("696997"),
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
            AnyVal: "quo",
            BigintStrVal: types.MustBigIntFromString("681359"),
            BigintVal: big.NewInt(259422),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            AnyVal: "ab",
            BigintStrVal: types.MustBigIntFromString("587600"),
            BigintVal: big.NewInt(9688),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            AnyVal: "ipsam",
            BigintStrVal: types.MustBigIntFromString("133465"),
            BigintVal: big.NewInt(197054),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            AnyVal: "recusandae",
            BigintStrVal: types.MustBigIntFromString("44612"),
            BigintVal: big.NewInt(715179),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            Any: "nihil",
            Bigint: big.NewInt(518835),
            BigintStr: types.MustBigIntFromString("882710"),
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
            AnyVal: "commodi",
            BigintStrVal: types.MustBigIntFromString("959434"),
            BigintVal: big.NewInt(174112),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            AnyVal: "accusantium",
            BigintStrVal: types.MustBigIntFromString("783648"),
            BigintVal: big.NewInt(430402),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
            AnyVal: "consequuntur",
            BigintStrVal: types.MustBigIntFromString("536178"),
            BigintVal: big.NewInt(143829),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
                Any: "explicabo",
                Bigint: big.NewInt(325685),
                BigintStr: types.MustBigIntFromString("392676"),
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
            },
            shared.SimpleObject{
                Any: "consequuntur",
                Bigint: big.NewInt(187131),
                BigintStr: types.MustBigIntFromString("129412"),
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
            shared.SimpleObject{
                Any: "atque",
                Bigint: big.NewInt(92260),
                BigintStr: types.MustBigIntFromString("456911"),
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
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "esse",
                Bigint: big.NewInt(800379),
                BigintStr: types.MustBigIntFromString("724168"),
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
                AnyVal: "vel",
                BigintStrVal: types.MustBigIntFromString("690025"),
                BigintVal: big.NewInt(473221),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "minima",
                BigintStrVal: types.MustBigIntFromString("716244"),
                BigintVal: big.NewInt(756779),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "minus",
                BigintStrVal: types.MustBigIntFromString("308286"),
                BigintVal: big.NewInt(959167),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "a",
            "nulla",
            "quas",
        },
        []string{
            "quasi",
            "a",
        },
        []string{
            "sint",
            "pariatur",
            "possimus",
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
            "asperiores": shared.SimpleObject{
                Any: "facere",
                Bigint: big.NewInt(85001),
                BigintStr: types.MustBigIntFromString("159414"),
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
            "culpa": shared.SimpleObject{
                Any: "aliquid",
                Bigint: big.NewInt(949298),
                BigintStr: types.MustBigIntFromString("62713"),
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
            "in": shared.SimpleObject{
                Any: "eius",
                Bigint: big.NewInt(727697),
                BigintStr: types.MustBigIntFromString("849039"),
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
            "aliquam": shared.SimpleObject{
                Any: "sapiente",
                Bigint: big.NewInt(119771),
                BigintStr: types.MustBigIntFromString("355369"),
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
            "voluptatum": shared.SimpleObjectCamelCase{
                AnyVal: "qui",
                BigintStrVal: types.MustBigIntFromString("845358"),
                BigintVal: big.NewInt(401259),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "architecto": shared.SimpleObjectCamelCase{
                AnyVal: "omnis",
                BigintStrVal: types.MustBigIntFromString("945302"),
                BigintVal: big.NewInt(98478),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "voluptate": shared.SimpleObjectCamelCase{
                AnyVal: "ipsa",
                BigintStrVal: types.MustBigIntFromString("326701"),
                BigintVal: big.NewInt(86532),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "iste": shared.SimpleObjectCamelCase{
                AnyVal: "temporibus",
                BigintStrVal: types.MustBigIntFromString("33074"),
                BigintVal: big.NewInt(522371),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        "mollitia",
        "ab",
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
        Any: "non",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "dolor",
                Bigint: big.NewInt(580152),
                BigintStr: types.MustBigIntFromString("253191"),
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
        },
        Bool: false,
        Int: 376226,
        Map: map[string]shared.SimpleObject{
            "dignissimos": shared.SimpleObject{
                Any: "dicta",
                Bigint: big.NewInt(981640),
                BigintStr: types.MustBigIntFromString("618480"),
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
            },
        },
        Num: 3743.23,
        Obj: shared.SimpleObject{
            Any: "asperiores",
            Bigint: big.NewInt(45659),
            BigintStr: types.MustBigIntFromString("409054"),
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
        },
        Str: "repellendus",
        Type: sdk.String("officia"),
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
        AnyVal: "dignissimos",
        ArrVal: []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "asperiores",
                BigintStrVal: types.MustBigIntFromString("368102"),
                BigintVal: big.NewInt(65304),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "quod",
                BigintStrVal: types.MustBigIntFromString("288398"),
                BigintVal: big.NewInt(70447),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "id",
                BigintStrVal: types.MustBigIntFromString("380729"),
                BigintVal: big.NewInt(246063),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        BoolVal: false,
        IntVal: 926880,
        MapVal: map[string]shared.SimpleObjectCamelCase{
            "fugiat": shared.SimpleObjectCamelCase{
                AnyVal: "vel",
                BigintStrVal: types.MustBigIntFromString("497678"),
                BigintVal: big.NewInt(554688),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "possimus": shared.SimpleObjectCamelCase{
                AnyVal: "facilis",
                BigintStrVal: types.MustBigIntFromString("738227"),
                BigintVal: big.NewInt(414857),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "reiciendis": shared.SimpleObjectCamelCase{
                AnyVal: "assumenda",
                BigintStrVal: types.MustBigIntFromString("363161"),
                BigintVal: big.NewInt(924967),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        NumVal: 7386.83,
        ObjVal: shared.SimpleObjectCamelCase{
            AnyVal: "consectetur",
            BigintStrVal: types.MustBigIntFromString("449083"),
            BigintVal: big.NewInt(348519),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        StrVal: "numquam",
        Type: sdk.String("doloribus"),
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
        "reiciendis": shared.SimpleObject{
            Any: "quidem",
            Bigint: big.NewInt(904949),
            BigintStr: types.MustBigIntFromString("897071"),
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
        },
        "asperiores": shared.SimpleObject{
            Any: "adipisci",
            Bigint: big.NewInt(249420),
            BigintStr: types.MustBigIntFromString("228263"),
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
        "debitis": shared.SimpleObjectCamelCase{
            AnyVal: "consectetur",
            BigintStrVal: types.MustBigIntFromString("358107"),
            BigintVal: big.NewInt(689768),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "voluptates": shared.SimpleObjectCamelCase{
            AnyVal: "libero",
            BigintStrVal: types.MustBigIntFromString("113816"),
            BigintVal: big.NewInt(881721),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "aspernatur": shared.SimpleObjectCamelCase{
            AnyVal: "voluptas",
            BigintStrVal: types.MustBigIntFromString("374244"),
            BigintVal: big.NewInt(374296),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "dolorum": shared.SimpleObjectCamelCase{
            AnyVal: "adipisci",
            BigintStrVal: types.MustBigIntFromString("795535"),
            BigintVal: big.NewInt(171853),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "aliquam": shared.SimpleObject{
            Any: "officiis",
            Bigint: big.NewInt(839189),
            BigintStr: types.MustBigIntFromString("351870"),
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
        },
        "blanditiis": shared.SimpleObject{
            Any: "quas",
            Bigint: big.NewInt(942584),
            BigintStr: types.MustBigIntFromString("201517"),
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
        "totam": shared.SimpleObjectCamelCase{
            AnyVal: "hic",
            BigintStrVal: types.MustBigIntFromString("348783"),
            BigintVal: big.NewInt(750765),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "sed": shared.SimpleObjectCamelCase{
            AnyVal: "reiciendis",
            BigintStrVal: types.MustBigIntFromString("131852"),
            BigintVal: big.NewInt(994401),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "expedita": shared.SimpleObjectCamelCase{
            AnyVal: "ab",
            BigintStrVal: types.MustBigIntFromString("611749"),
            BigintVal: big.NewInt(292794),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "in": shared.SimpleObjectCamelCase{
            AnyVal: "commodi",
            BigintStrVal: types.MustBigIntFromString("696077"),
            BigintVal: big.NewInt(131289),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
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
        "suscipit": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "debitis",
                Bigint: big.NewInt(72434),
                BigintStr: types.MustBigIntFromString("967795"),
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
            shared.SimpleObject{
                Any: "maiores",
                Bigint: big.NewInt(274823),
                BigintStr: types.MustBigIntFromString("148478"),
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
                Any: "necessitatibus",
                Bigint: big.NewInt(215529),
                BigintStr: types.MustBigIntFromString("406733"),
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
            },
            shared.SimpleObject{
                Any: "voluptatibus",
                Bigint: big.NewInt(271653),
                BigintStr: types.MustBigIntFromString("273009"),
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
        "sit": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "officiis",
                BigintStrVal: types.MustBigIntFromString("505866"),
                BigintVal: big.NewInt(708609),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        "ipsam": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "rem",
                BigintStrVal: types.MustBigIntFromString("26522"),
                BigintVal: big.NewInt(750595),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "minima",
                BigintStrVal: types.MustBigIntFromString("924159"),
                BigintVal: big.NewInt(967122),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "aperiam",
                BigintStrVal: types.MustBigIntFromString("901483"),
                BigintVal: big.NewInt(253642),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
                AnyVal: "officiis",
                BigintStrVal: types.MustBigIntFromString("104627"),
                BigintVal: big.NewInt(512452),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        "laboriosam": map[string]shared.SimpleObject{
            "voluptatum": shared.SimpleObject{
                Any: "error",
                Bigint: big.NewInt(944708),
                BigintStr: types.MustBigIntFromString("710529"),
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
            "dolorum": shared.SimpleObject{
                Any: "nostrum",
                Bigint: big.NewInt(639028),
                BigintStr: types.MustBigIntFromString("676243"),
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
            "tempora": shared.SimpleObject{
                Any: "atque",
                Bigint: big.NewInt(148268),
                BigintStr: types.MustBigIntFromString("282699"),
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
        },
        "culpa": map[string]shared.SimpleObject{
            "magnam": shared.SimpleObject{
                Any: "consequatur",
                Bigint: big.NewInt(460220),
                BigintStr: types.MustBigIntFromString("372679"),
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
            "quas": shared.SimpleObject{
                Any: "repudiandae",
                Bigint: big.NewInt(361151),
                BigintStr: types.MustBigIntFromString("89494"),
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
            },
            "sed": shared.SimpleObject{
                Any: "sit",
                Bigint: big.NewInt(425508),
                BigintStr: types.MustBigIntFromString("342611"),
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
        "consequatur": map[string]shared.SimpleObject{
            "reiciendis": shared.SimpleObject{
                Any: "dolorem",
                Bigint: big.NewInt(690894),
                BigintStr: types.MustBigIntFromString("115703"),
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
            "labore": shared.SimpleObject{
                Any: "quidem",
                Bigint: big.NewInt(539074),
                BigintStr: types.MustBigIntFromString("671957"),
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
        "alias": map[string]shared.SimpleObjectCamelCase{
            "deserunt": shared.SimpleObjectCamelCase{
                AnyVal: "voluptate",
                BigintStrVal: types.MustBigIntFromString("600392"),
                BigintVal: big.NewInt(972083),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        "delectus": map[string]shared.SimpleObjectCamelCase{
            "perferendis": shared.SimpleObjectCamelCase{
                AnyVal: "est",
                BigintStrVal: types.MustBigIntFromString("696483"),
                BigintVal: big.NewInt(440666),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "praesentium": shared.SimpleObjectCamelCase{
                AnyVal: "mollitia",
                BigintStrVal: types.MustBigIntFromString("333965"),
                BigintVal: big.NewInt(29100),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "quasi": shared.SimpleObjectCamelCase{
                AnyVal: "atque",
                BigintStrVal: types.MustBigIntFromString("442036"),
                BigintVal: big.NewInt(991142),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
            "quidem": shared.SimpleObjectCamelCase{
                AnyVal: "maxime",
                BigintStrVal: types.MustBigIntFromString("90885"),
                BigintVal: big.NewInt(461007),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
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
        "atque": map[string]string{
            "officiis": "officiis",
            "accusamus": "natus",
            "minima": "aspernatur",
        },
        "ex": map[string]string{
            "corrupti": "at",
            "error": "blanditiis",
            "suscipit": "repudiandae",
            "atque": "atque",
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
        "recusandae": "dolorum",
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
        Any: "repellendus",
        Bigint: big.NewInt(287119),
        BigintStr: types.MustBigIntFromString("968287"),
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
        Any: "dicta",
        Bigint: big.NewInt(36033),
        BigintStr: types.MustBigIntFromString("106429"),
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
        AnyVal: "laboriosam",
        BigintStrVal: types.MustBigIntFromString("246535"),
        BigintVal: big.NewInt(952143),
        BoolOptVal: sdk.Bool(true),
        BoolVal: true,
        DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DateVal: types.MustDateFromString("2020-01-01"),
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
        Any: "consequuntur",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "officiis",
                Bigint: big.NewInt(597937),
                BigintStr: types.MustBigIntFromString("446394"),
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
            },
            shared.SimpleObject{
                Any: "occaecati",
                Bigint: big.NewInt(160230),
                BigintStr: types.MustBigIntFromString("145870"),
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
            },
            shared.SimpleObject{
                Any: "reprehenderit",
                Bigint: big.NewInt(625528),
                BigintStr: types.MustBigIntFromString("76486"),
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
        },
        Bool: false,
        Int: 910994,
        Map: map[string]shared.SimpleObject{
            "vero": shared.SimpleObject{
                Any: "doloremque",
                Bigint: big.NewInt(434156),
                BigintStr: types.MustBigIntFromString("59944"),
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
        },
        Num: 4746.68,
        Obj: shared.SimpleObject{
            Any: "eveniet",
            Bigint: big.NewInt(184362),
            BigintStr: types.MustBigIntFromString("739884"),
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
        Str: "ratione",
        Type: sdk.String("laborum"),
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
        "voluptatum": "rem",
        "aliquam": "ad",
        "repellat": "alias",
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
        Any: "corporis",
        Bigint: big.NewInt(597303),
        BigintStr: types.MustBigIntFromString("470649"),
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
        Any: "alias",
        Bigint: big.NewInt(979527),
        BigintStr: types.MustBigIntFromString("970222"),
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
        Num: 3279.88,
        Str: "dolore",
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
        Num3: 6803.49,
        Str3: "nesciunt",
    }
    paramStr := "quae"

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
        Num: 9257.03,
        Str: "omnis",
    }
    paramStr := "quaerat"

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
        Num2: 4776.46,
        Str2: "ex",
    }
    paramStr := "ut"

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
        Num3: 6330.62,
        Str3: "adipisci",
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
        Num: 8906.53,
        Str: "laudantium",
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
        Num2: 4326.06,
        Str2: "nemo",
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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("recusandae"))
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
    requestBody := []byte("esse")
    queryStringParam := "provident"

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
        Any: shared.SimpleObject{
            Any: "eum",
            Bigint: big.NewInt(970494),
            BigintStr: types.MustBigIntFromString("592780"),
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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "animi",
                Bigint: big.NewInt(343392),
                BigintStr: types.MustBigIntFromString("652309"),
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
        },
        Bool: false,
        Int: 659177,
        Map: map[string]shared.SimpleObject{
            "aliquid": shared.SimpleObject{
                Any: "accusantium",
                Bigint: big.NewInt(999278),
                BigintStr: types.MustBigIntFromString("984632"),
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
            },
            "nam": shared.SimpleObject{
                Any: "earum",
                Bigint: big.NewInt(637583),
                BigintStr: types.MustBigIntFromString("672041"),
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
        },
        Num: 9762.26,
        Obj: shared.SimpleObject{
            Any: "molestias",
            Bigint: big.NewInt(889794),
            BigintStr: types.MustBigIntFromString("956933"),
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
        Str: "rerum",
        Type: sdk.String("tempora"),
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
            Content: []byte("quis"),
            File: "inventore",
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
        Any: "fugit",
        Bigint: big.NewInt(765271),
        BigintStr: types.MustBigIntFromString("62636"),
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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "aspernatur")
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
    requestBody := "eum"
    queryStringParam := "eius"

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
        Num1: 521996,
        Num2: 871083,
        Num3: 773084,
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
        Num: 1794.1,
        String: "sapiente",
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
        Num: 4332.79,
        String: "dicta",
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

