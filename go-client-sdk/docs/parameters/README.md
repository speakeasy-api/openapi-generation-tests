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
    res, err := s.Parameters.DeepObjectQueryParamsMap(ctx, map[string]string{
        "dolorum": "iusto",
        "voluptate": "dolorum",
        "deleniti": "omnis",
    }, map[string][]string{
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
    res, err := s.Parameters.DeepObjectQueryParamsObject(ctx, shared.SimpleObject{
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
    }, &operations.DeepObjectQueryParamsObjectObjArrParam{
        Arr: []string{
            "quod",
            "officiis",
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
    res, err := s.Parameters.FormQueryParamsArray(ctx, []string{
        "dolorum",
    }, []int64{
        456130,
        687488,
        483409,
        215507,
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
    res, err := s.Parameters.FormQueryParamsMap(ctx, map[string]string{
        "tenetur": "amet",
        "tempore": "accusamus",
        "numquam": "enim",
        "dolorem": "sapiente",
    }, map[string]int64{
        "nihil": 25662,
        "expedita": 207470,
        "sed": 424685,
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
    res, err := s.Parameters.FormQueryParamsObject(ctx, shared.SimpleObject{
        Any: "libero",
        Bigint: big.NewInt(374170),
        BigintStr: types.MustBigIntFromString("646265"),
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
    }, &shared.SimpleObject{
        Any: "incidunt",
        Bigint: big.NewInt(186458),
        BigintStr: types.MustBigIntFromString("586784"),
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
    res, err := s.Parameters.FormQueryParamsPrimitive(ctx, false, 747080, 1175.31, "laborum")
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
    res, err := s.Parameters.FormQueryParamsRefParamObject(ctx, &shared.RefQueryParamObj{
        Bool: false,
        Int: 517379,
        Num: 2768.94,
        Str: "aspernatur",
    }, &shared.RefQueryParamObjExploded{
        Bool: false,
        Int: 174909,
        Num: 7168.6,
        Str: "facilis",
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
    res, err := s.Parameters.HeaderParamsArray(ctx, []string{
        "quam",
        "molestias",
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
    res, err := s.Parameters.HeaderParamsMap(ctx, map[string]string{
        "qui": "neque",
        "fugit": "magni",
        "odio": "sunt",
        "ullam": "nam",
    }, map[string]string{
        "voluptatem": "cumque",
        "soluta": "nobis",
        "et": "saepe",
        "ipsum": "veritatis",
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
    res, err := s.Parameters.HeaderParamsObject(ctx, shared.SimpleObject{
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
    }, shared.SimpleObject{
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
    res, err := s.Parameters.HeaderParamsPrimitive(ctx, false, 677263, 1002.94, "quae")
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
    res, err := s.Parameters.JSONQueryParamsObject(ctx, shared.DeepObject{
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
    }, shared.SimpleObject{
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
    res, err := s.Parameters.MixedQueryParams(ctx, shared.SimpleObject{
        Any: "dolor",
        Bigint: big.NewInt(980700),
        BigintStr: types.MustBigIntFromString("97844"),
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
    }, shared.SimpleObject{
        Any: "excepturi",
        Bigint: big.NewInt(972920),
        BigintStr: types.MustBigIntFromString("343605"),
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
    }, shared.SimpleObject{
        Any: "saepe",
        Bigint: big.NewInt(411372),
        BigintStr: types.MustBigIntFromString("774048"),
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
    res, err := s.Parameters.PathParameterJSON(ctx, shared.SimpleObject{
        Any: "aliquid",
        Bigint: big.NewInt(81101),
        BigintStr: types.MustBigIntFromString("301831"),
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
    res, err := s.Parameters.PipeDelimitedQueryParamsArray(ctx, []string{
        "recusandae",
    }, []int64{
        325310,
    }, map[string]string{
        "a": "libero",
    }, &shared.SimpleObject{
        Any: "aut",
        Bigint: big.NewInt(11427),
        BigintStr: types.MustBigIntFromString("533466"),
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
    res, err := s.Parameters.SimplePathParameterArrays(ctx, []string{
        "accusamus",
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
    res, err := s.Parameters.SimplePathParameterMaps(ctx, map[string]string{
        "non": "et",
    }, map[string]int64{
        "laborum": 810424,
        "velit": 432148,
        "autem": 752135,
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
    res, err := s.Parameters.SimplePathParameterObjects(ctx, shared.SimpleObject{
        Any: "quas",
        Bigint: big.NewInt(829603),
        BigintStr: types.MustBigIntFromString("860552"),
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
    }, shared.SimpleObject{
        Any: "quasi",
        Bigint: big.NewInt(270328),
        BigintStr: types.MustBigIntFromString("256139"),
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
    res, err := s.Parameters.SimplePathParameterPrimitives(ctx, false, 55374, 4764.77, "magnam")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```
