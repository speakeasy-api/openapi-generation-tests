# Parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [DeepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](#deepobjectqueryparamsobject)
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
    res, err := s.Parameters.DeepObjectQueryParamsMap(ctx, operations.DeepObjectQueryParamsMapRequest{
        MapArrParam: map[string][]string{
            "ipsa": []string{
                "odio",
                "quaerat",
            },
        },
        MapParam: map[string]string{
            "quidem": "voluptatibus",
            "voluptas": "natus",
            "eos": "atque",
            "sit": "fugiat",
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

## DeepObjectQueryParamsObject

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
    res, err := s.Parameters.DeepObjectQueryParamsObject(ctx, operations.DeepObjectQueryParamsObjectRequest{
        ObjArrParam: &operations.DeepObjectQueryParamsObjectObjArrParam{
            Arr: []string{
                "soluta",
            },
        },
        ObjParam: shared.SimpleObject{
            Any: "dolorum",
            Bigint: big.NewInt(478596),
            BigintStr: types.MustBigIntFromString("453697"),
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

## FormQueryParamsArray

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
    res, err := s.Parameters.FormQueryParamsArray(ctx, operations.FormQueryParamsArrayRequest{
        ArrParam: []string{
            "necessitatibus",
            "distinctio",
            "asperiores",
        },
        ArrParamExploded: []int64{
            216897,
            456015,
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

## FormQueryParamsMap

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
    res, err := s.Parameters.FormQueryParamsMap(ctx, operations.FormQueryParamsMapRequest{
        MapParam: map[string]string{
            "saepe": "eius",
            "aspernatur": "perferendis",
            "amet": "optio",
        },
        MapParamExploded: map[string]int64{
            "ad": 904425,
            "suscipit": 645785,
            "provident": 324683,
            "repellendus": 519711,
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

## FormQueryParamsObject

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
    res, err := s.Parameters.FormQueryParamsObject(ctx, operations.FormQueryParamsObjectRequest{
        ObjParam: &shared.SimpleObject{
            Any: "similique",
            Bigint: big.NewInt(55),
            BigintStr: types.MustBigIntFromString("872651"),
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
        ObjParamExploded: shared.SimpleObject{
            Any: "vel",
            Bigint: big.NewInt(798047),
            BigintStr: types.MustBigIntFromString("885338"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## FormQueryParamsPrimitive

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
    res, err := s.Parameters.FormQueryParamsPrimitive(ctx, operations.FormQueryParamsPrimitiveRequest{
        BoolParam: false,
        IntParam: 952792,
        NumParam: 4561.3,
        StrParam: "harum",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## FormQueryParamsRefParamObject

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
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
    res, err := s.Parameters.FormQueryParamsRefParamObject(ctx, operations.FormQueryParamsRefParamObjectRequest{
        RefObjParam: &shared.RefQueryParamObj{
            Bool: false,
            Int: 483409,
            Num: 2155.07,
            Str: "quisquam",
        },
        RefObjParamExploded: &shared.RefQueryParamObjExploded{
            Bool: false,
            Int: 947371,
            Num: 2294.42,
            Str: "tempore",
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

## HeaderParamsArray

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
    res, err := s.Parameters.HeaderParamsArray(ctx, operations.HeaderParamsArrayRequest{
        XHeaderArray: []string{
            "numquam",
            "enim",
            "dolorem",
            "sapiente",
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

## HeaderParamsMap

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
    res, err := s.Parameters.HeaderParamsMap(ctx, operations.HeaderParamsMapRequest{
        XHeaderMap: map[string]string{
            "nihil": "sit",
            "expedita": "neque",
            "sed": "vel",
        },
        XHeaderMapExplode: map[string]string{
            "voluptas": "deserunt",
            "quam": "ipsum",
            "incidunt": "qui",
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

## HeaderParamsObject

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
    res, err := s.Parameters.HeaderParamsObject(ctx, operations.HeaderParamsObjectRequest{
        XHeaderObj: shared.SimpleObject{
            Any: "cupiditate",
            Bigint: big.NewInt(807581),
            BigintStr: types.MustBigIntFromString("863856"),
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
        XHeaderObjExplode: shared.SimpleObject{
            Any: "laborum",
            Bigint: big.NewInt(517379),
            BigintStr: types.MustBigIntFromString("276894"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## HeaderParamsPrimitive

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
    res, err := s.Parameters.HeaderParamsPrimitive(ctx, operations.HeaderParamsPrimitiveRequest{
        XHeaderBoolean: false,
        XHeaderInteger: 716860,
        XHeaderNumber: 7044.74,
        XHeaderString: "aliquid",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## JSONQueryParamsObject

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
    res, err := s.Parameters.JSONQueryParamsObject(ctx, operations.JSONQueryParamsObjectRequest{
        DeepObjParam: shared.DeepObject{
            Any: shared.SimpleObject{
                Any: "molestias",
                Bigint: big.NewInt(840429),
                BigintStr: types.MustBigIntFromString("183280"),
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
            Arr: []shared.SimpleObject{
                shared.SimpleObject{
                    Any: "odio",
                    Bigint: big.NewInt(124833),
                    BigintStr: types.MustBigIntFromString("355613"),
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
            Int: 30452,
            Map: map[string]shared.SimpleObject{
                "soluta": shared.SimpleObject{
                    Any: "nobis",
                    Bigint: big.NewInt(92596),
                    BigintStr: types.MustBigIntFromString("903720"),
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
                "nobis": shared.SimpleObject{
                    Any: "quos",
                    Bigint: big.NewInt(731694),
                    BigintStr: types.MustBigIntFromString("584476"),
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
                "dolorem": shared.SimpleObject{
                    Any: "dolore",
                    Bigint: big.NewInt(286915),
                    BigintStr: types.MustBigIntFromString("240829"),
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
                "quae": shared.SimpleObject{
                    Any: "aut",
                    Bigint: big.NewInt(555649),
                    BigintStr: types.MustBigIntFromString("929530"),
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
            Num: 8330.38,
            Obj: shared.SimpleObject{
                Any: "porro",
                Bigint: big.NewInt(984330),
                BigintStr: types.MustBigIntFromString("281730"),
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
            Str: "qui",
            Type: sdk.String("quae"),
        },
        SimpleObjParam: shared.SimpleObject{
            Any: "laudantium",
            Bigint: big.NewInt(485628),
            BigintStr: types.MustBigIntFromString("580447"),
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

    if res.Res != nil {
        // handle response
    }
}
```

## MixedQueryParams

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
    res, err := s.Parameters.MixedQueryParams(ctx, operations.MixedQueryParamsRequest{
        DeepObjectParam: shared.SimpleObject{
            Any: "vero",
            Bigint: big.NewInt(606476),
            BigintStr: types.MustBigIntFromString("338159"),
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
        FormParam: shared.SimpleObject{
            Any: "voluptate",
            Bigint: big.NewInt(231701),
            BigintStr: types.MustBigIntFromString("878870"),
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
        JSONParam: shared.SimpleObject{
            Any: "hic",
            Bigint: big.NewInt(715561),
            BigintStr: types.MustBigIntFromString("799203"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PathParameterJSON

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
    res, err := s.Parameters.PathParameterJSON(ctx, operations.PathParameterJSONRequest{
        JSONObj: shared.SimpleObject{
            Any: "facilis",
            Bigint: big.NewInt(874288),
            BigintStr: types.MustBigIntFromString("498140"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## PipeDelimitedQueryParamsArray

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
    res, err := s.Parameters.PipeDelimitedQueryParamsArray(ctx, operations.PipeDelimitedQueryParamsArrayRequest{
        ArrParam: []string{
            "sequi",
            "natus",
            "impedit",
            "aut",
        },
        ArrParamExploded: []int64{
            347233,
            862310,
            148141,
            780427,
        },
        MapParam: map[string]string{
            "doloribus": "iusto",
            "eligendi": "ducimus",
            "alias": "officia",
            "tempora": "ipsam",
        },
        ObjParam: &shared.SimpleObject{
            Any: "ea",
            Bigint: big.NewInt(136900),
            BigintStr: types.MustBigIntFromString("428224"),
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

    if res.Res != nil {
        // handle response
    }
}
```

## SimplePathParameterArrays

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
    res, err := s.Parameters.SimplePathParameterArrays(ctx, operations.SimplePathParameterArraysRequest{
        ArrParam: []string{
            "ex",
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

## SimplePathParameterMaps

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
    res, err := s.Parameters.SimplePathParameterMaps(ctx, operations.SimplePathParameterMapsRequest{
        MapParam: map[string]string{
            "dicta": "dolor",
            "maiores": "quasi",
            "ex": "nulla",
        },
        MapParamExploded: map[string]int64{
            "voluptatibus": 343605,
            "sapiente": 788873,
            "saepe": 411372,
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

## SimplePathParameterObjects

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
    res, err := s.Parameters.SimplePathParameterObjects(ctx, operations.SimplePathParameterObjectsRequest{
        ObjParam: shared.SimpleObject{
            Any: "impedit",
            Bigint: big.NewInt(359271),
            BigintStr: types.MustBigIntFromString("333145"),
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
        ObjParamExploded: shared.SimpleObject{
            Any: "magnam",
            Bigint: big.NewInt(407241),
            BigintStr: types.MustBigIntFromString("775220"),
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
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

## SimplePathParameterPrimitives

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
    res, err := s.Parameters.SimplePathParameterPrimitives(ctx, operations.SimplePathParameterPrimitivesRequest{
        BoolParam: false,
        IntParam: 132487,
        NumParam: 3253.1,
        StrParam: "eaque",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
