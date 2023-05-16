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
            Any: "libero",
            Bigint: big.NewInt(13948),
            BigintStr: types.MustBigIntFromString("11427"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        shared.SimpleObject{
            Any: "aliquam",
            Bigint: big.NewInt(146946),
            BigintStr: types.MustBigIntFromString("882860"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        shared.SimpleObject{
            Any: "et",
            Bigint: big.NewInt(677412),
            BigintStr: types.MustBigIntFromString("672048"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        shared.SimpleObject{
            Any: "eum",
            Bigint: big.NewInt(420539),
            BigintStr: types.MustBigIntFromString("752135"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
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
            Any: "voluptas",
            Bigint: big.NewInt(727044),
            BigintStr: types.MustBigIntFromString("96549"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        shared.SimpleObject{
            Any: "explicabo",
            Bigint: big.NewInt(591935),
            BigintStr: types.MustBigIntFromString("55374"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        shared.SimpleObject{
            Any: "odio",
            Bigint: big.NewInt(262118),
            BigintStr: types.MustBigIntFromString("458515"),
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
        shared.SimpleObject{
            Any: "fuga",
            Bigint: big.NewInt(442015),
            BigintStr: types.MustBigIntFromString("695626"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
                Any: "assumenda",
                Bigint: big.NewInt(181151),
                BigintStr: types.MustBigIntFromString("509342"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "quo",
                Bigint: big.NewInt(681359),
                BigintStr: types.MustBigIntFromString("259422"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumSecond,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "ab",
                Bigint: big.NewInt(587600),
                BigintStr: types.MustBigIntFromString("9688"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "ipsam",
                Bigint: big.NewInt(133465),
                BigintStr: types.MustBigIntFromString("197054"),
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
            shared.SimpleObject{
                Any: "recusandae",
                Bigint: big.NewInt(44612),
                BigintStr: types.MustBigIntFromString("715179"),
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
            "totam",
            "accusamus",
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
            "occaecati": shared.SimpleObject{
                Any: "commodi",
                Bigint: big.NewInt(959434),
                BigintStr: types.MustBigIntFromString("174112"),
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
            "accusantium": shared.SimpleObject{
                Any: "porro",
                Bigint: big.NewInt(430402),
                BigintStr: types.MustBigIntFromString("556429"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        map[string]shared.SimpleObject{
            "fugit": shared.SimpleObject{
                Any: "fuga",
                Bigint: big.NewInt(649463),
                BigintStr: types.MustBigIntFromString("277596"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "minima": shared.SimpleObject{
                Any: "nisi",
                Bigint: big.NewInt(147014),
                BigintStr: types.MustBigIntFromString("956406"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "explicabo": shared.SimpleObject{
                Any: "saepe",
                Bigint: big.NewInt(578922),
                BigintStr: types.MustBigIntFromString("543806"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumSecond,
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
        "accusamus",
        "veritatis",
        "esse",
        "quod",
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
        Any: "vero",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "quasi",
                Bigint: big.NewInt(904045),
                BigintStr: types.MustBigIntFromString("426306"),
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
            shared.SimpleObject{
                Any: "rerum",
                Bigint: big.NewInt(580197),
                BigintStr: types.MustBigIntFromString("327720"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        Bool: false,
        Int: 27069,
        Map: map[string]shared.SimpleObject{
            "tempore": shared.SimpleObject{
                Any: "adipisci",
                Bigint: big.NewInt(766964),
                BigintStr: types.MustBigIntFromString("160538"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "quaerat": shared.SimpleObject{
                Any: "sapiente",
                Bigint: big.NewInt(232865),
                BigintStr: types.MustBigIntFromString("458139"),
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
            "a": shared.SimpleObject{
                Any: "nulla",
                Bigint: big.NewInt(557811),
                BigintStr: types.MustBigIntFromString("457223"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        Num: 6216.79,
        Obj: shared.SimpleObject{
            Any: "sint",
            Bigint: big.NewInt(863023),
            BigintStr: types.MustBigIntFromString("820767"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Str: "asperiores",
        Type: sdk.String("facere"),
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
        "consequuntur": shared.SimpleObject{
            Any: "quasi",
            Bigint: big.NewInt(628899),
            BigintStr: types.MustBigIntFromString("633608"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
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
        "earum": shared.SimpleObject{
            Any: "vel",
            Bigint: big.NewInt(447378),
            BigintStr: types.MustBigIntFromString("258684"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
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
        "accusantium": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "sapiente",
                Bigint: big.NewInt(119771),
                BigintStr: types.MustBigIntFromString("355369"),
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
            shared.SimpleObject{
                Any: "nisi",
                Bigint: big.NewInt(16328),
                BigintStr: types.MustBigIntFromString("531849"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        "ex": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "itaque",
                Bigint: big.NewInt(680270),
                BigintStr: types.MustBigIntFromString("99615"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "quasi",
                Bigint: big.NewInt(869489),
                BigintStr: types.MustBigIntFromString("92027"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "minima",
                Bigint: big.NewInt(86532),
                BigintStr: types.MustBigIntFromString("232744"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumSecond,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        "temporibus": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "rem",
                Bigint: big.NewInt(15606),
                BigintStr: types.MustBigIntFromString("513075"),
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
        "corrupti": map[string]shared.SimpleObject{
            "voluptatem": shared.SimpleObject{
                Any: "dolor",
                Bigint: big.NewInt(580152),
                BigintStr: types.MustBigIntFromString("253191"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
        "voluptatibus": map[string]string{
            "asperiores": "aperiam",
            "ea": "quaerat",
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
        "repellendus": "officia",
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
        Any: "maxime",
        Bigint: big.NewInt(490305),
        BigintStr: types.MustBigIntFromString("640024"),
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
        Any: "quae",
        Bigint: big.NewInt(312753),
        BigintStr: types.MustBigIntFromString("783235"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumEnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
        Any: shared.SimpleObject{
            Any: "adipisci",
            Bigint: big.NewInt(683573),
            BigintStr: types.MustBigIntFromString("662505"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumFirst,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "est",
                Bigint: big.NewInt(926880),
                BigintStr: types.MustBigIntFromString("517309"),
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
            shared.SimpleObject{
                Any: "ducimus",
                Bigint: big.NewInt(554688),
                BigintStr: types.MustBigIntFromString("427834"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "facilis",
                Bigint: big.NewInt(738227),
                BigintStr: types.MustBigIntFromString("414857"),
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
        },
        Bool: false,
        Int: 968904,
        Map: map[string]shared.SimpleObject{
            "nemo": shared.SimpleObject{
                Any: "recusandae",
                Bigint: big.NewInt(397533),
                BigintStr: types.MustBigIntFromString("46007"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "in": shared.SimpleObject{
                Any: "exercitationem",
                Bigint: big.NewInt(937285),
                BigintStr: types.MustBigIntFromString("814967"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "suscipit": shared.SimpleObject{
                Any: "reiciendis",
                Bigint: big.NewInt(697142),
                BigintStr: types.MustBigIntFromString("904949"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "sunt": shared.SimpleObject{
                Any: "asperiores",
                Bigint: big.NewInt(241545),
                BigintStr: types.MustBigIntFromString("249420"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        Num: 4895.09,
        Obj: shared.SimpleObject{
            Any: "a",
            Bigint: big.NewInt(891523),
            BigintStr: types.MustBigIntFromString("233420"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Str: "laboriosam",
        Type: sdk.String("ipsa"),
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
        "libero": "vitae",
        "accusamus": "similique",
        "tempora": "aspernatur",
        "voluptas": "voluptas",
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
        Any: "voluptas",
        Bigint: big.NewInt(324405),
        BigintStr: types.MustBigIntFromString("748789"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumEnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
        IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
        Any: "minus",
        Bigint: big.NewInt(171853),
        BigintStr: types.MustBigIntFromString("503934"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumEnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
        IntEnum: shared.SimpleObjectIntEnumEnumFirst,
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
        Num: 3044.68,
        Str: "officiis",
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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest{
        RequestBody: operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded{
            Bool3: false,
            Num3: 8391.89,
            Str3: "ullam",
        },
        ParamStr: "adipisci",
    })
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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequest{
        RequestBody: operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON{
            Bool: false,
            Num: 7383.91,
            Str: "blanditiis",
        },
        ParamStr: "quas",
    })
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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequest{
        RequestBody: operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData{
            Bool2: false,
            Num2: 9425.84,
            Str2: "nesciunt",
        },
        ParamStr: "culpa",
    })
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
        Num3: 5485.19,
        Str3: "pariatur",
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
        Num: 5196.43,
        Str: "hic",
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
        Num2: 3487.83,
        Str2: "nobis",
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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("sit"))
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
        Any: "sed",
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "explicabo",
                Bigint: big.NewInt(994401),
                BigintStr: types.MustBigIntFromString("707918"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumSixtyNine,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "ab",
                Bigint: big.NewInt(611749),
                BigintStr: types.MustBigIntFromString("292794"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "in",
                Bigint: big.NewInt(417486),
                BigintStr: types.MustBigIntFromString("696077"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumSecond,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            shared.SimpleObject{
                Any: "unde",
                Bigint: big.NewInt(100032),
                BigintStr: types.MustBigIntFromString("382808"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumThird,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        Bool: false,
        Int: 72434,
        Map: map[string]shared.SimpleObject{
            "perferendis": shared.SimpleObject{
                Any: "corrupti",
                Bigint: big.NewInt(979574),
                BigintStr: types.MustBigIntFromString("274823"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumEnumSecond,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            "eius": shared.SimpleObject{
                Any: "necessitatibus",
                Bigint: big.NewInt(215529),
                BigintStr: types.MustBigIntFromString("406733"),
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
            "voluptatibus": shared.SimpleObject{
                Any: "tempora",
                Bigint: big.NewInt(273009),
                BigintStr: types.MustBigIntFromString("455444"),
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
            "sit": shared.SimpleObject{
                Any: "non",
                Bigint: big.NewInt(888044),
                BigintStr: types.MustBigIntFromString("505866"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumEnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumEnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumEnumFirst,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
        },
        Num: 2777.73,
        Obj: shared.SimpleObject{
            Any: "ipsam",
            Bigint: big.NewInt(894864),
            BigintStr: types.MustBigIntFromString("524970"),
            Bool: true,
            BoolOpt: sdk.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            Enum: shared.EnumEnumTwo,
            Float32: 2.2222222,
            Int: 999999,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumEnumThird,
            IntOptNull: sdk.Int64(999999),
            Num: 1.1,
            NumOptNull: sdk.Float64(1.1),
            Str: "example",
            StrOpt: sdk.String("optional example"),
        },
        Str: "error",
        Type: sdk.String("veniam"),
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
            Content: []byte("minima"),
            File: "recusandae",
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
        Any: "reiciendis",
        Bigint: big.NewInt(862319),
        BigintStr: types.MustBigIntFromString("168576"),
        Bool: true,
        BoolOpt: sdk.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        Enum: shared.EnumEnumTwo,
        Float32: 2.2222222,
        Int: 999999,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumEnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumEnumThird,
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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "numquam")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
