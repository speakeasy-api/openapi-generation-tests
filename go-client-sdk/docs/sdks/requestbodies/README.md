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
* [RequestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

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
            Any: "vero",
            Bigint: big.NewInt(949319),
            BigintStr: types.MustBigIntFromString("492268"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(9413.78),
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
            AnyVal: "odio",
            BigintStrVal: types.MustBigIntFromString("630448"),
            BigintVal: big.NewInt(708548),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(8742.88),
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
            Any: "quibusdam",
            Bigint: big.NewInt(848944),
            BigintStr: types.MustBigIntFromString("194342"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(6178.77),
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
            AnyVal: "voluptatibus",
            BigintStrVal: types.MustBigIntFromString("347233"),
            BigintVal: big.NewInt(862310),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(1481.41),
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
                Any: "doloribus",
                Bigint: big.NewInt(478370),
                BigintStr: types.MustBigIntFromString("753570"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(4973.91),
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
                AnyVal: "tempora",
                BigintStrVal: types.MustBigIntFromString("368584"),
                BigintVal: big.NewInt(410492),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(1369),
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
            "magnam",
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
            "ratione": shared.SimpleObject{
                Any: "ex",
                Bigint: big.NewInt(511319),
                BigintStr: types.MustBigIntFromString("120657"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(2243.17),
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
            "ex": shared.SimpleObjectCamelCase{
                AnyVal: "nulla",
                BigintStrVal: types.MustBigIntFromString("569211"),
                BigintVal: big.NewInt(972920),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(3436.05),
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
        "saepe",
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
            Any: "impedit",
            Bigint: big.NewInt(359271),
            BigintStr: types.MustBigIntFromString("333145"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(3994.99),
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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "ea",
                Bigint: big.NewInt(775220),
                BigintStr: types.MustBigIntFromString("232234"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(9262.13),
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
        Bool: false,
        Int: 53427,
        Map: map[string]shared.SimpleObject{
            "a": shared.SimpleObject{
                Any: "libero",
                Bigint: big.NewInt(13948),
                BigintStr: types.MustBigIntFromString("11427"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5334.66),
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
        Num: 1469.46,
        Obj: shared.SimpleObject{
            Any: "accusamus",
            Bigint: big.NewInt(79522),
            BigintStr: types.MustBigIntFromString("250622"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(896.03),
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
        Str: "placeat",
        Type: sdk.String("velit"),
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
        AnyVal: shared.SimpleObjectCamelCase{
            AnyVal: "autem",
            BigintStrVal: types.MustBigIntFromString("752135"),
            BigintVal: big.NewInt(557369),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(8296.03),
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
        ArrVal: []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "libero",
                BigintStrVal: types.MustBigIntFromString("96549"),
                BigintVal: big.NewInt(270328),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(2561.39),
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
        IntVal: 55374,
        MapVal: map[string]shared.SimpleObjectCamelCase{
            "molestiae": shared.SimpleObjectCamelCase{
                AnyVal: "magnam",
                BigintStrVal: types.MustBigIntFromString("487935"),
                BigintVal: big.NewInt(262118),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(4585.15),
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
        NumVal: 6832.82,
        ObjVal: shared.SimpleObjectCamelCase{
            AnyVal: "reprehenderit",
            BigintStrVal: types.MustBigIntFromString("695626"),
            BigintVal: big.NewInt(852635),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(2835.19),
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
        StrVal: "assumenda",
        Type: sdk.String("eos"),
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
        "praesentium": shared.SimpleObject{
            Any: "quisquam",
            Bigint: big.NewInt(86377),
            BigintStr: types.MustBigIntFromString("56848"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(6600.4),
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
        "quo": shared.SimpleObjectCamelCase{
            AnyVal: "illum",
            BigintStrVal: types.MustBigIntFromString("777408"),
            BigintVal: big.NewInt(681359),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(2594.22),
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
        "ab": shared.SimpleObject{
            Any: "cupiditate",
            Bigint: big.NewInt(9688),
            BigintStr: types.MustBigIntFromString("272822"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(8920.5),
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
        "sequi": shared.SimpleObjectCamelCase{
            AnyVal: "quo",
            BigintStrVal: types.MustBigIntFromString("459856"),
            BigintVal: big.NewInt(925164),
            BoolOptVal: sdk.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            DecimalVal: sdk.Float64(446.12),
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
        "dignissimos": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "inventore",
                Bigint: big.NewInt(469498),
                BigintStr: types.MustBigIntFromString("518835"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8827.1),
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
        "occaecati": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "commodi",
                BigintStrVal: types.MustBigIntFromString("959434"),
                BigintVal: big.NewInt(174112),
                BoolOptVal: sdk.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                DecimalVal: sdk.Float64(6455.7),
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
        "porro": map[string]shared.SimpleObject{
            "eum": shared.SimpleObject{
                Any: "quas",
                Bigint: big.NewInt(510017),
                BigintStr: types.MustBigIntFromString("159867"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5361.78),
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
        "mollitia": map[string]shared.SimpleObjectCamelCase{
            "incidunt": shared.SimpleObjectCamelCase{
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
        "consequuntur": map[string]string{
            "ratione": "explicabo",
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
        "saepe": "occaecati",
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
        Any: "atque",
        Bigint: big.NewInt(92260),
        BigintStr: types.MustBigIntFromString("456911"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(9105.45),
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
        Any: "esse",
        Bigint: big.NewInt(800379),
        BigintStr: types.MustBigIntFromString("724168"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(8771.31),
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
        AnyVal: "saepe",
        BigintStrVal: types.MustBigIntFromString("426306"),
        BigintVal: big.NewInt(690025),
        BoolOptVal: sdk.Bool(true),
        BoolVal: true,
        DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DateVal: types.MustDateFromString("2020-01-01"),
        DecimalVal: sdk.Float64(4732.21),
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
            Any: "distinctio",
            Bigint: big.NewInt(756779),
            BigintStr: types.MustBigIntFromString("27069"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(6360.61),
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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "cumque",
                Bigint: big.NewInt(160538),
                BigintStr: types.MustBigIntFromString("9766"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(7963.92),
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
        Bool: false,
        Int: 232865,
        Map: map[string]shared.SimpleObject{
            "esse": shared.SimpleObject{
                Any: "blanditiis",
                Bigint: big.NewInt(590984),
                BigintStr: types.MustBigIntFromString("953722"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(8577.23),
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
        Num: 974.68,
        Obj: shared.SimpleObject{
            Any: "a",
            Bigint: big.NewInt(621679),
            BigintStr: types.MustBigIntFromString("575751"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Decimal: sdk.Float64(8630.23),
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
        Str: "eveniet",
        Type: sdk.String("asperiores"),
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
        "facere": "veritatis",
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
        Any: "consequuntur",
        Bigint: big.NewInt(94458),
        BigintStr: types.MustBigIntFromString("628899"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(6336.08),
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
        Any: "quae",
        Bigint: big.NewInt(936747),
        BigintStr: types.MustBigIntFromString("424032"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(4473.78),
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
        Num: 8490.39,
        Str: "soluta",
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
        Num3: 333.04,
        Str3: "aliquam",
    }
    paramStr := "sapiente"

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
        Num: 1197.71,
        Str: "ullam",
    }
    paramStr := "reprehenderit"

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
        Num2: 3567.07,
        Str2: "nisi",
    }
    paramStr := "aut"

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
        Num3: 5318.49,
        Str3: "qui",
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
        Num: 8453.58,
        Str: "ex",
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
        Num2: 5362.75,
        Str2: "itaque",
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
        "dolorum",
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
        "architecto": "omnis",
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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("tenetur"))
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
    requestBody := []byte("quasi")
    queryStringParam := "at"

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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "iste",
                Bigint: big.NewInt(839513),
                BigintStr: types.MustBigIntFromString("33074"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Decimal: sdk.Float64(5223.71),
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
        Bool: false,
        Int: 428796,
        Map: map[string]shared.SimpleObject{
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
        },
        Num: 2531.91,
        Obj: shared.SimpleObject{
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
        Str: "maiores",
        Type: sdk.String("natus"),
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
            Content: []byte("velit"),
            File: "voluptatibus",
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
        Any: "voluptas",
        Bigint: big.NewInt(990345),
        BigintStr: types.MustBigIntFromString("45659"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Decimal: sdk.Float64(4090.54),
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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "repellendus")
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
    requestBody := "officia"
    queryStringParam := "maxime"

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
        Num1: 490305,
        Num2: 640024,
        Num3: 989410,
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


## RequestBodyReadOnlyUnion

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
    res, err := s.RequestBodies.RequestBodyReadOnlyUnion(ctx, shared.WeaklyTypedOneOfReadOnlyObject{})
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `ctx`                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                          | :heavy_check_mark:                                                                             | The context to use for the request.                                                            |
| `request`                                                                                      | [shared.WeaklyTypedOneOfReadOnlyObject](../../models/shared/weaklytypedoneofreadonlyobject.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |
| `opts`                                                                                         | [][operations.Option](../../models/operations/option.md)                                       | :heavy_minus_sign:                                                                             | The options for this request.                                                                  |


### Response

**[*operations.RequestBodyReadOnlyUnionResponse](../../models/operations/requestbodyreadonlyunionresponse.md), error**


## RequestBodyReadWriteOnlyUnion

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
    res, err := s.RequestBodies.RequestBodyReadWriteOnlyUnion(ctx, shared.WeaklyTypedOneOfReadWriteObject{})
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfReadWriteObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `request`                                                                                        | [shared.WeaklyTypedOneOfReadWriteObject](../../models/shared/weaklytypedoneofreadwriteobject.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `opts`                                                                                           | [][operations.Option](../../models/operations/option.md)                                         | :heavy_minus_sign:                                                                               | The options for this request.                                                                    |


### Response

**[*operations.RequestBodyReadWriteOnlyUnionResponse](../../models/operations/requestbodyreadwriteonlyunionresponse.md), error**


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
        Num: 3681.02,
        String: "quae",
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
        Num: 3127.53,
        String: "porro",
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


## RequestBodyWriteOnlyUnion

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
    res, err := s.RequestBodies.RequestBodyWriteOnlyUnion(ctx, shared.WeaklyTypedOneOfWriteOnlyObject{})
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfWriteOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `request`                                                                                        | [shared.WeaklyTypedOneOfWriteOnlyObject](../../models/shared/weaklytypedoneofwriteonlyobject.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `opts`                                                                                           | [][operations.Option](../../models/operations/option.md)                                         | :heavy_minus_sign:                                                                               | The options for this request.                                                                    |


### Response

**[*operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/requestbodywriteonlyunionresponse.md), error**

