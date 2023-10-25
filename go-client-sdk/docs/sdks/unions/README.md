# Unions
(*Unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [FlattenedTypedObjectPost](#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](#typedobjectoneofpost)
* [UnionDateNull](#uniondatenull)
* [UnionDateTimeNull](#uniondatetimenull)
* [WeaklyTypedOneOfPost](#weaklytypedoneofpost)

## FlattenedTypedObjectPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.FlattenedTypedObjectPost(ctx, shared.CreateFlattenedTypedObject1TypedObject1(
            shared.TypedObject1{
                Type: shared.TypedObject1TypeObj1,
                Value: "string",
            },
    ))
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
| `request`                                                                    | [shared.FlattenedTypedObject1](../../models/shared/flattenedtypedobject1.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[*operations.FlattenedTypedObjectPostResponse](../../models/operations/flattenedtypedobjectpostresponse.md), error**


## MixedTypeOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.MixedTypeOneOfPost(ctx, operations.CreateMixedTypeOneOfPostRequestBodyInteger(
    618017,
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [operations.MixedTypeOneOfPostRequestBody](../../models/operations/mixedtypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[*operations.MixedTypeOneOfPostResponse](../../models/operations/mixedtypeoneofpostresponse.md), error**


## NullableOneOfRefInObjectPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.NullableOneOfRefInObjectPost(ctx, shared.NullableOneOfRefInObject{
        NullableOneOfOne: &shared.TypedObject1{
            Type: shared.TypedObject1TypeObj1,
            Value: "string",
        },
        NullableOneOfTwo: shared.CreateNullableOneOfRefInObjectNullableOneOfTwoTypedObject2(
                shared.TypedObject2{
                    Type: shared.TypedObject2TypeObj2,
                    Value: "string",
                },
        ),
        OneOfOne: shared.CreateNullableOneOfRefInObjectOneOfOneTypedObject1(
                shared.TypedObject1{
                    Type: shared.TypedObject1TypeObj1,
                    Value: "string",
                },
        ),
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.NullableOneOfRefInObjectPostResponse](../../models/operations/nullableoneofrefinobjectpostresponse.md), error**


## NullableOneOfSchemaPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.NullableOneOfSchemaPost(ctx, &operations.CreateNullableOneOfSchemaPostRequestBodyTypedObject2(
            shared.TypedObject2{
                Type: shared.TypedObject2TypeObj2,
                Value: "string",
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                          | :heavy_check_mark:                                                                                             | The context to use for the request.                                                                            |
| `request`                                                                                                      | [operations.NullableOneOfSchemaPostRequestBody](../../models/operations/nullableoneofschemapostrequestbody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[*operations.NullableOneOfSchemaPostResponse](../../models/operations/nullableoneofschemapostresponse.md), error**


## NullableOneOfTypeInObjectPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.NullableOneOfTypeInObjectPost(ctx, shared.NullableOneOfTypeInObject{
        NullableOneOfOne: false,
        NullableOneOfTwo: shared.CreateNullableOneOfTypeInObjectNullableOneOfTwoInteger(
        873677,
        ),
        OneOfOne: false,
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

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [shared.NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[*operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/nullableoneoftypeinobjectpostresponse.md), error**


## NullableTypedObjectPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.NullableTypedObjectPost(ctx, &shared.TypedObject1{
        Type: shared.TypedObject1TypeObj1,
        Value: "string",
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
| `request`                                                  | [shared.TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.NullableTypedObjectPostResponse](../../models/operations/nullabletypedobjectpostresponse.md), error**


## PrimitiveTypeOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.PrimitiveTypeOneOfPost(ctx, operations.CreatePrimitiveTypeOneOfPostRequestBodyStr(
    "string",
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [operations.PrimitiveTypeOneOfPostRequestBody](../../models/operations/primitivetypeoneofpostrequestbody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[*operations.PrimitiveTypeOneOfPostResponse](../../models/operations/primitivetypeoneofpostresponse.md), error**


## StronglyTypedOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.StronglyTypedOneOfPost(ctx, shared.CreateStronglyTypedOneOfObjectDeepObjectWithType(
            shared.DeepObjectWithType{
                Any: shared.CreateDeepObjectWithTypeAnySimpleObject(
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
                            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                            IntEnum: shared.SimpleObjectIntEnumSecond,
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
                        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                        IntEnum: shared.SimpleObjectIntEnumSecond,
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
                        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                        IntEnum: shared.SimpleObjectIntEnumSecond,
                        Num: 1.1,
                        Str: "test",
                        StrOpt: openapi.String("testOptional"),
                    },
                },
                Bool: true,
                Int: 1,
                Map: map[string]shared.SimpleObject{
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
                        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                        IntEnum: shared.SimpleObjectIntEnumSecond,
                        Num: 1.1,
                        Str: "test",
                        StrOpt: openapi.String("testOptional"),
                    },
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
                        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                        IntEnum: shared.SimpleObjectIntEnumSecond,
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
                    Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                    IntEnum: shared.SimpleObjectIntEnumSecond,
                    Num: 1.1,
                    Str: "test",
                    StrOpt: openapi.String("testOptional"),
                },
                Str: "test",
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.StronglyTypedOneOfObject](../../models/shared/stronglytypedoneofobject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.StronglyTypedOneOfPostResponse](../../models/operations/stronglytypedoneofpostresponse.md), error**


## TypedObjectNullableOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.TypedObjectNullableOneOfPost(ctx, &shared.CreateTypedObjectNullableOneOfTypedObject2(
            shared.TypedObject2{
                Type: shared.TypedObject2TypeObj2,
                Value: "string",
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ctx`                                                                              | [context.Context](https://pkg.go.dev/context#Context)                              | :heavy_check_mark:                                                                 | The context to use for the request.                                                |
| `request`                                                                          | [shared.TypedObjectNullableOneOf](../../models/shared/typedobjectnullableoneof.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[*operations.TypedObjectNullableOneOfPostResponse](../../models/operations/typedobjectnullableoneofpostresponse.md), error**


## TypedObjectOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.TypedObjectOneOfPost(ctx, shared.CreateTypedObjectOneOfTypedObject3(
            shared.TypedObject3{
                Type: shared.TypedObject3TypeObj3,
                Value: "string",
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ctx`                                                              | [context.Context](https://pkg.go.dev/context#Context)              | :heavy_check_mark:                                                 | The context to use for the request.                                |
| `request`                                                          | [shared.TypedObjectOneOf](../../models/shared/typedobjectoneof.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |


### Response

**[*operations.TypedObjectOneOfPostResponse](../../models/operations/typedobjectoneofpostresponse.md), error**


## UnionDateNull

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.UnionDateNull(ctx, &types.MustDateFromString("2022-11-25"))
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
| `request`                                             | [types.Date](../../models//.md)                       | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.UnionDateNullResponse](../../models/operations/uniondatenullresponse.md), error**


## UnionDateTimeNull

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.UnionDateTimeNull(ctx, &types.MustTimeFromString("2022-04-12T19:39:53.907Z"))
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
| `request`                                             | [time.Time](../../models//.md)                        | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.UnionDateTimeNullResponse](../../models/operations/uniondatetimenullresponse.md), error**


## WeaklyTypedOneOfPost

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
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Unions.WeaklyTypedOneOfPost(ctx, shared.CreateWeaklyTypedOneOfObjectSimpleObject(
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
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `ctx`                                                                          | [context.Context](https://pkg.go.dev/context#Context)                          | :heavy_check_mark:                                                             | The context to use for the request.                                            |
| `request`                                                                      | [shared.WeaklyTypedOneOfObject](../../models/shared/weaklytypedoneofobject.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[*operations.WeaklyTypedOneOfPostResponse](../../models/operations/weaklytypedoneofpostresponse.md), error**

