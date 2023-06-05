# RequestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [RequestBodyPostApplicationJSONArray](#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayObj](#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONMap](#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapObj](#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](#requestbodypostapplicationjsonsimple)
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
* [RequestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [RequestBodyPutString](#requestbodyputstring)

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
            Any: "eius",
            Bigint: big.NewInt(458515),
            BigintStr: types.MustBigIntFromString("456141"),
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
            Any: "reprehenderit",
            Bigint: big.NewInt(695626),
            BigintStr: types.MustBigIntFromString("852635"),
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

    if res.SimpleObjects != nil {
        // handle response
    }
}
```

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
            Any: "assumenda",
            Bigint: big.NewInt(181151),
            BigintStr: types.MustBigIntFromString("509342"),
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

    if res.ArrObjValue != nil {
        // handle response
    }
}
```

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
                Any: "fuga",
                Bigint: big.NewInt(259422),
                BigintStr: types.MustBigIntFromString("178367"),
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
                Any: "cupiditate",
                Bigint: big.NewInt(9688),
                BigintStr: types.MustBigIntFromString("272822"),
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
                Any: "aspernatur",
                Bigint: big.NewInt(197054),
                BigintStr: types.MustBigIntFromString("779192"),
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
                Any: "aperiam",
                Bigint: big.NewInt(715179),
                BigintStr: types.MustBigIntFromString("799796"),
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
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "totam",
                Bigint: big.NewInt(882710),
                BigintStr: types.MustBigIntFromString("306810"),
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
                Any: "commodi",
                Bigint: big.NewInt(959434),
                BigintStr: types.MustBigIntFromString("174112"),
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
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "porro",
                Bigint: big.NewInt(430402),
                BigintStr: types.MustBigIntFromString("556429"),
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
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "fugit",
                Bigint: big.NewInt(681393),
                BigintStr: types.MustBigIntFromString("649463"),
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

## RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, [][]string{
        []string{
            "esse",
        },
        []string{
            "accusamus",
            "veritatis",
            "esse",
            "quod",
        },
        []string{
            "vero",
            "aliquid",
            "quasi",
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
            "harum": shared.SimpleObject{
                Any: "molestiae",
                Bigint: big.NewInt(699622),
                BigintStr: types.MustBigIntFromString("580197"),
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
            "eligendi": shared.SimpleObject{
                Any: "sit",
                Bigint: big.NewInt(636061),
                BigintStr: types.MustBigIntFromString("731398"),
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
        map[string]shared.SimpleObject{
            "consequatur": shared.SimpleObject{
                Any: "minus",
                Bigint: big.NewInt(308286),
                BigintStr: types.MustBigIntFromString("959167"),
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
        },
        map[string]shared.SimpleObject{
            "provident": shared.SimpleObject{
                Any: "a",
                Bigint: big.NewInt(857723),
                BigintStr: types.MustBigIntFromString("557811"),
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
            "a": shared.SimpleObject{
                Any: "error",
                Bigint: big.NewInt(575751),
                BigintStr: types.MustBigIntFromString("863023"),
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
            "eveniet": shared.SimpleObject{
                Any: "asperiores",
                Bigint: big.NewInt(815524),
                BigintStr: types.MustBigIntFromString("85001"),
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
        },
        map[string]shared.SimpleObject{
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

## RequestBodyPostApplicationJSONArrayOfPrimitive

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, []string{
        "aut",
        "voluptatum",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Strings != nil {
        // handle response
    }
}
```

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
            Any: "quibusdam",
            Bigint: big.NewInt(401259),
            BigintStr: types.MustBigIntFromString("536275"),
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
                Any: "omnis",
                Bigint: big.NewInt(945302),
                BigintStr: types.MustBigIntFromString("98478"),
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
        Int: 454162,
        Map: map[string]shared.SimpleObject{
            "minima": shared.SimpleObject{
                Any: "veritatis",
                Bigint: big.NewInt(232744),
                BigintStr: types.MustBigIntFromString("237173"),
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
        Num: 330.74,
        Obj: shared.SimpleObject{
            Any: "rem",
            Bigint: big.NewInt(15606),
            BigintStr: types.MustBigIntFromString("513075"),
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
        Str: "ab",
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
        "voluptatem": shared.SimpleObject{
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
        "voluptas": shared.SimpleObject{
            Any: "aut",
            Bigint: big.NewInt(491025),
            BigintStr: types.MustBigIntFromString("115484"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
        "voluptatibus": shared.SimpleObject{
            Any: "voluptas",
            Bigint: big.NewInt(990345),
            BigintStr: types.MustBigIntFromString("45659"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.MapObjValue != nil {
        // handle response
    }
}
```

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
                Any: "maxime",
                Bigint: big.NewInt(490305),
                BigintStr: types.MustBigIntFromString("640024"),
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
                Any: "quae",
                Bigint: big.NewInt(312753),
                BigintStr: types.MustBigIntFromString("783235"),
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
            shared.SimpleObject{
                Any: "ab",
                Bigint: big.NewInt(241418),
                BigintStr: types.MustBigIntFromString("683573"),
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

    if res.Res != nil {
        // handle response
    }
}
```

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
        "culpa": map[string]shared.SimpleObject{
            "recusandae": shared.SimpleObject{
                Any: "totam",
                Bigint: big.NewInt(853940),
                BigintStr: types.MustBigIntFromString("424089"),
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
            "vel": shared.SimpleObject{
                Any: "labore",
                Bigint: big.NewInt(822560),
                BigintStr: types.MustBigIntFromString("706575"),
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
                Any: "corporis",
                Bigint: big.NewInt(968904),
                BigintStr: types.MustBigIntFromString("828657"),
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

## RequestBodyPostApplicationJSONMapOfMapOfPrimitive

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, map[string]map[string]string{
        "aperiam": map[string]string{
            "consectetur": "in",
            "exercitationem": "earum",
            "facere": "numquam",
        },
        "doloribus": map[string]string{
            "reiciendis": "quidem",
            "saepe": "necessitatibus",
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

## RequestBodyPostApplicationJSONMapOfPrimitive

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, map[string]string{
        "sunt": "asperiores",
        "adipisci": "non",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
        Any: "amet",
        Bigint: big.NewInt(105906),
        BigintStr: types.MustBigIntFromString("489509"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
        Any: "consectetur",
        Bigint: big.NewInt(358107),
        BigintStr: types.MustBigIntFromString("689768"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
        Any: "libero",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "accusamus",
                Bigint: big.NewInt(631126),
                BigintStr: types.MustBigIntFromString("272437"),
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
        },
        Bool: false,
        Int: 374244,
        Map: map[string]shared.SimpleObject{
            "minima": shared.SimpleObject{
                Any: "nobis",
                Bigint: big.NewInt(680116),
                BigintStr: types.MustBigIntFromString("237807"),
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
            "blanditiis": shared.SimpleObject{
                Any: "in",
                Bigint: big.NewInt(296242),
                BigintStr: types.MustBigIntFromString("304468"),
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
        Num: 3518.7,
        Obj: shared.SimpleObject{
            Any: "adipisci",
            Bigint: big.NewInt(738391),
            BigintStr: types.MustBigIntFromString("502389"),
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
        Str: "nesciunt",
        Type: sdk.String("culpa"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostFormMapPrimitive

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
    res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, map[string]string{
        "pariatur": "totam",
        "hic": "exercitationem",
        "nobis": "sit",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
        Any: "rerum",
        Bigint: big.NewInt(148829),
        BigintStr: types.MustBigIntFromString("967966"),
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
        Any: "facilis",
        Bigint: big.NewInt(451822),
        BigintStr: types.MustBigIntFromString("709072"),
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

## RequestBodyPostMultipleContentTypesInlineFiltered

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON{
        Bool: false,
        Num: 2927.94,
        Str: "laborum",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitParamForm

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 1523.54,
        Str3: "in",
    }, "commodi")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitParamJSON

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON{
        Bool: false,
        Num: 6960.77,
        Str: "explicabo",
    }, "voluptas")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitParamMultipart

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData{
        Bool2: false,
        Num2: 6041.18,
        Str2: "architecto",
    }, "suscipit")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitForm

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 9602.57,
        Str3: "debitis",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitJSON

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON{
        Bool: false,
        Num: 724.34,
        Str: "reiciendis",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPostMultipleContentTypesSplitMultipart

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData{
        Bool2: false,
        Num2: 193,
        Str2: "corrupti",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPutBytes

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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("maiores"))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

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
            Any: "sed",
            Bigint: big.NewInt(592231),
            BigintStr: types.MustBigIntFromString("258702"),
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
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "occaecati",
                Bigint: big.NewInt(552078),
                BigintStr: types.MustBigIntFromString("975752"),
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
            shared.SimpleObject{
                Any: "voluptate",
                Bigint: big.NewInt(970076),
                BigintStr: types.MustBigIntFromString("401713"),
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
        },
        Bool: false,
        Int: 888044,
        Map: map[string]shared.SimpleObject{
            "facilis": shared.SimpleObject{
                Any: "quaerat",
                Bigint: big.NewInt(277773),
                BigintStr: types.MustBigIntFromString("373035"),
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
            "sit": shared.SimpleObject{
                Any: "nobis",
                Bigint: big.NewInt(625637),
                BigintStr: types.MustBigIntFromString("333507"),
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
            "reiciendis": shared.SimpleObject{
                Any: "nulla",
                Bigint: big.NewInt(168576),
                BigintStr: types.MustBigIntFromString("48690"),
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
        Num: 3299.35,
        Obj: shared.SimpleObject{
            Any: "in",
            Bigint: big.NewInt(889234),
            BigintStr: types.MustBigIntFromString("104627"),
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
        Str: "praesentium",
        Type: sdk.String("cum"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPutMultipartFile

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
    res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, operations.RequestBodyPutMultipartFileRequestBody{
        File: &operations.RequestBodyPutMultipartFileRequestBodyFile{
            Content: []byte("laboriosam"),
            File: "dolorum",
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
        Any: "voluptatum",
        Bigint: big.NewInt(622385),
        BigintStr: types.MustBigIntFromString("944708"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## RequestBodyPutString

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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "neque")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
